/*
 * Copyright 2014 The Skfiy Open Association.
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
package org.skfiy.typhon.spi.war;

import java.util.ArrayList;
import java.util.List;
import org.skfiy.typhon.domain.item.IFightItem;

/**
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
public class AttackResult {

    private IFightItem.Shot shot;
    private AttackEntry source;
    private List<AttackEntry> targets = new ArrayList<>();

    public AttackResult() {
    }

    public IFightItem.Shot getShot() {
        return shot;
    }

    public void setShot(IFightItem.Shot shot) {
        this.shot = shot;
    }

    public AttackEntry getSource() {
        return source;
    }

    public void setSource(AttackEntry source) {
        this.source = source;
    }

    public List<AttackEntry> getTargets() {
        return targets;
    }

    public void setTargets(List<AttackEntry> targets) {
        this.targets = targets;
    }

    public void addTarget(AttackEntry ae) {
        this.targets.add(ae);
    }

}
