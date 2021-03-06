/*
 * Copyright 2013 The Skfiy Open Association.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.skfiy.typhon.spi.role;

import java.util.Set;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.skfiy.typhon.Typhons;
import org.skfiy.typhon.domain.Player;
import org.skfiy.typhon.domain.Role;
import org.skfiy.typhon.domain.RoleData;
import org.skfiy.typhon.repository.RoleRepository;
import org.skfiy.typhon.session.Session;
import org.skfiy.typhon.session.SessionContext;
import org.skfiy.typhon.session.SessionUtils;

/**
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
@Singleton
public class BasicRoleListener extends AbstractRoleListener {

    @Inject
    private RoleRepository roleReposy;
    @Resource
    private Set<RoleDatable> roleDatables;

    @Override
    public void roleCreated(Role role) {
        // 首次初始化角色信息
        Session session = SessionContext.getSession();
        
        Player player = new Player();
        player.setRole(role);
        player.setSession(session);
        
        for (RoleDatable rd : roleDatables) {
            rd.initialize(player);
        }
        session.setAttribute(SessionUtils.ATTR_PLAYER, player);
    }

    @Override
    public void roleLoaded(Role role) {
        Session session = SessionContext.getSession();

        Player player = (Player) session.getAttribute(SessionUtils.ATTR_PLAYER);
        if (player == null) {
            player = new Player();
            player.setRole(role);
            player.setSession(session);

            RoleData roleData = roleReposy.loadRoleData(role.getRid());
            for (RoleDatable rd : roleDatables) {
                rd.deserialize(roleData, player);
            }
            session.setAttribute(SessionUtils.ATTR_PLAYER, player);
        }
    }

    @Override
    public void roleUnloaded(Role role) {
        roleReposy.update(role);
        
        RoleData roleData = new RoleData();
        for (RoleDatable rd : roleDatables) {
            rd.serialize(SessionUtils.getPlayer(), roleData);
        }
        
        roleData.setRid(role.getRid());
        roleReposy.update(roleData);
    }
}
