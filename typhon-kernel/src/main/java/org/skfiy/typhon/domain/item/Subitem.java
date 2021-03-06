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
package org.skfiy.typhon.domain.item;

import org.skfiy.typhon.dobj.ItemDobj;

/**
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
public class Subitem {

    private final ItemDobj itemDobj;
    private final int count;

    /**
     * 
     * @param itemDobj
     * @param count 
     */
    public Subitem(ItemDobj itemDobj, int count) {
        this.itemDobj = itemDobj;
        if (count <= 0) {
            this.count = 1;
        } else {
            this.count = count;
        }
    }

    /**
     * 
     * @return 
     */
    public ItemDobj getItemDobj() {
        return itemDobj;
    }

    /**
     * 
     * @return 
     */
    public int getCount() {
        return count;
    }

}
