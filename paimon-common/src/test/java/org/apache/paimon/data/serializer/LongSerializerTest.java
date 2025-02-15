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

package org.apache.paimon.data.serializer;

import java.util.Random;

/** Test for {@link LongSerializer}. */
public class LongSerializerTest extends SerializerTestBase<Long> {

    @Override
    protected Serializer<Long> createSerializer() {
        return LongSerializer.INSTANCE;
    }

    @Override
    protected boolean deepEquals(Long t1, Long t2) {
        return t1.equals(t2);
    }

    @Override
    protected Long[] getTestData() {
        Random rnd = new Random();
        long rndLong = rnd.nextLong();

        return new Long[] {0L, 1L, -1L, Long.MAX_VALUE, Long.MIN_VALUE, rndLong, -rndLong};
    }
}
