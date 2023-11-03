/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.wayang.genericjdbc.platform;

import org.apache.wayang.core.platform.Platform;
import org.apache.wayang.jdbc.platform.JdbcPlatformTemplate;

/**
 * {@link Platform} implementation for SQLite3.
 */
public class GenericJdbcPlatform extends JdbcPlatformTemplate {

    private static final String PLATFORM_NAME = "PostgreSQL";

    private static final String CONFIG_NAME = "genericjdbc";

    private static GenericJdbcPlatform instance = null;

    public static GenericJdbcPlatform getInstance() {
        if (instance == null) {
            instance = new GenericJdbcPlatform();
        }
        return instance;
    }

    protected GenericJdbcPlatform() {
        super(PLATFORM_NAME, CONFIG_NAME);
    }

//    @Override
//    public String getJdbcDriverClassName() {
//        return org.postgres.Driver.class.getName();
//    }

}
