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
package org.skfiy.typhon.dobj;

import com.alibaba.fastjson.annotation.JSONType;
import org.skfiy.typhon.domain.item.AbstractItem;
import org.skfiy.typhon.domain.item.SimpleItem;

/**
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
@JSONType(shortType = SimpleItemDobj.JSON_SHORT_TYPE)
public class SimpleItemDobj extends ItemDobj {

    public static final String JSON_SHORT_TYPE = "S$SimpleItem";
    
    @Override
    public AbstractItem toDomainItem() {
        SimpleItem dynamicItem = new SimpleItem();
        dynamicItem.setId(getId());
        dynamicItem.setItemDobj(this);
        return dynamicItem;
    }
    
}
