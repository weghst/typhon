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
package org.skfiy.typhon.action;

import javax.inject.Inject;
import javax.inject.Singleton;
import org.skfiy.typhon.annotation.Action;
import org.skfiy.typhon.packet.Namespaces;
import org.skfiy.typhon.packet.SingleValue;
import org.skfiy.typhon.spi.equipment.EquipmentProvider;

/**
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
@Singleton
public class EquipmentAction {

    @Inject
    private EquipmentProvider equipmentProvider;

    @Action(Namespaces.EQUIP_MINGLE)
    public void mingle(SingleValue packet) {
        equipmentProvider.mingle(packet);
    }
}
