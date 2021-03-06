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
package org.skfiy.typhon.rnsd.service;

import java.util.List;
import org.skfiy.typhon.rnsd.domain.OS;
import org.skfiy.typhon.rnsd.domain.Region;

/**
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
public interface RegionService {

    /**
     *
     * @param rid
     * @return
     */
    Region load(int rid);

    /**
     *
     * @return
     */
    List<Region> loadAll();

    /**
     *
     * @param os
     * @return
     */
    List<RegionDTO> loadByOS(OS os);

}
