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
package war.bs;

import org.skfiy.typhon.dobj.BSaSkill;
import org.skfiy.typhon.spi.war.AttackEntry;
import org.skfiy.typhon.spi.war.BSaScript;
import org.skfiy.typhon.spi.war.BSaWapper;
import org.skfiy.typhon.spi.war.FightObject;
import org.skfiy.typhon.spi.war.MultiAttackResult;
import org.skfiy.typhon.spi.war.RecoveryEntry;

/**
 * 黄盖.
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
public class B_s047 extends BSaScript {

    @Override
    protected Object doExecute(BSaWapper bsaWapper) {
        BSaSkill bsaSkill = bsaWapper.getBsaSkill();
        int atk = getAtk(bsaWapper, bsaWapper.getAobj());

        FightObject aobj = bsaWapper.getAobj();

        MultiAttackResult mar = new MultiAttackResult();
        FightObject goal = bsaWapper.getDefenderEntity().findFightGoal();
        AttackEntry ae = getWarProvider().attack0(bsaWapper.getWarInfo().getTerrain(), aobj,
                goal, atk, getDef(bsaWapper, goal), bsaSkill.getFactor() * bsaWapper.getFactor());

        goal.decrementHp((int) ae.getVal());
        mar.addTarget(ae);

        int rehp;
        if (aobj.getFury() > 0) {
            aobj.decrementFury(1);
            
//            RecoveryEntry re = new RecoveryEntry();
//            re.setLab(aobj.getLab());
//            re.setType("FURY");
//            re.setVal(-1);

//            mar.addTarget(re);

            rehp = (int) (aobj.getMaxHp() * 0.3);
        } else {
            rehp = (int) (aobj.getMaxHp() * 0.1);
        }

        RecoveryEntry re = new RecoveryEntry();
        re.setLab(aobj.getLab());
        re.setType("HP");
        re.setVal(rehp);

        mar.addTarget(re);

        aobj.incrementHp(rehp);
        return mar;
    }

}
