/*
 * Copyright (C) 2015 wak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wakhub.monodict.json;

import java.util.List;

/**
 * Created by wak on 6/7/14.
 */
public class SearchEngines {

    private int version;

    private List<SearchEnginesItem> items;

    public int getVersion() {
        return version;
    }

    public List<SearchEnginesItem> getItems() {
        return items;
    }
}
