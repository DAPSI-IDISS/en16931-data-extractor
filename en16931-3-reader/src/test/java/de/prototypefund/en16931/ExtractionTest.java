/** **********************************************************************
 *
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 *********************************************************************** */
package de.prototypefund.en16931;

import de.prototypefund.en16931.type.Statistics;
import org.junit.Test;
import org.slf4j.LoggerFactory;

public class ExtractionTest {

    /* Might be a specification document as ODF or
         a directory containg several ODT specification documents,
        either relative to workign directory "en16831-3-reader" or
        to classpath "target/test-classes" */
    private static final String odtResource = "16931-3-3_example.odt";

    @Test
    public void collectSpecData() throws Exception {
        try {
            new OdtTableExtraction().collectSpecData(odtResource);
            Statistics.log();
        } catch (Throwable t) {
            LoggerFactory.getLogger(ExtractionTest.class.getName()).error(t.getMessage(), t);
        }
    }
}
