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
package war.cs;

import java.util.List;
import org.skfiy.typhon.domain.item.Area;
import org.skfiy.typhon.script.Script;
import org.skfiy.typhon.session.Session;
import org.skfiy.typhon.spi.war.FightObject;

/**
 * 袁绍.
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
public class L_s043 implements Script {

    @Override
    public Object invoke(Session session, Object obj) {
        List<FightObject> objs = (List<FightObject>) obj;
        for (FightObject fo : objs) {
            if (fo.getArea() == Area.QXiong) {
                fo.incrementFury(1);
            }
        }
        return null;
    }

}
