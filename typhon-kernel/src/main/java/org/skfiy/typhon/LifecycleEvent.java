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
package org.skfiy.typhon;

/**
 * 事件通知对象.
 *
 * @author Kevin Zou <kevinz@skfiy.com>
 */
public class LifecycleEvent {

    private final Object source;
    private final String event;

    /**
     * 源对象与事件构造函数.
     *
     * @param source 源对象
     * @param event 事件
     */
    public LifecycleEvent(final Object source, final String event) {
        this.source = source;
        this.event = event;
    }

    /**
     * 获取源对象.
     *
     * @return 一个{@code Lifecycle }实例
     */
    public Object getSource() {
        return source;
    }

    /**
     * 事件.
     *
     * @return 事件字符串
     */
    public String getEvent() {
        return event;
    }
}
