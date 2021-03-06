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
package org.skfiy.typhon.packet;

/**
 *
 * @author Kevin Zou <kevinz@skfiy.org>
 */
public class PacketTimestamp extends Packet {

    private long timeMillis;
    private int rawOffset;
    private String zone;
    private long serverinitTime;

    public long getTimeMillis() {
        return timeMillis;
    }

    public void setTimeMillis(long timeMillis) {
        this.timeMillis = timeMillis;
    }

    public int getRawOffset() {
        return rawOffset;
    }

    public void setRawOffset(int rawOffset) {
        this.rawOffset = rawOffset;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
    

    public long getServerinitTime() {
        return serverinitTime;
    }

    public void setServerinitTime(long serverinitTime) {
        this.serverinitTime = serverinitTime;
    }

    /**
     *
     * @param packet
     * @return
     */
    public static PacketTimestamp createResult(Packet packet) {
        PacketTimestamp result = new PacketTimestamp();
        result.setNs(Namespaces.TIMESTAMP);
        result.assignIdAndType(packet, result);
        return result;
    }

}
