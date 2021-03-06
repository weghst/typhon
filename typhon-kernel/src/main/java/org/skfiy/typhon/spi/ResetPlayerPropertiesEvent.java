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
package org.skfiy.typhon.spi;

import org.skfiy.typhon.Typhons;
import org.skfiy.typhon.domain.Normal;
import org.skfiy.typhon.domain.Player;

/**
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
public class ResetPlayerPropertiesEvent implements Event<Player> {

    @Override
    public void invoke(Player obj) {
        Normal normal = obj.getNormal();
        normal.setHornNum(Typhons.getInteger("typhon.spi.chat.world.hornNum"));
        normal.setSocietyWishs(0);
    }

}
