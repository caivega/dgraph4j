/*
 * Copyright 2016 DGraph Labs, Inc.
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

package io.dgraph.client;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Definition of a set of decoders that could be used oto converting value bytes to a required type.
 *
 * @author Edgar Rodriguez-Diaz
 * @version 0.0.1
 */
public final class ValueDecoders {

    public static ValueDecoder<String> STRING_UTF8 = theBytes -> new String(theBytes, Charset.forName("utf-8"));

    public static ValueDecoder<Integer> INTEGER = theBytes -> {
        final ByteBuffer wrapped = ByteBuffer.wrap(theBytes);
        return wrapped.getInt();
    };

    public static ValueDecoder<Short> SHORT = theBytes -> ByteBuffer.wrap(theBytes).getShort();

    public static ValueDecoder<Long> LONG = theBytes -> ByteBuffer.wrap(theBytes).getLong();

    public static ValueDecoder<Float> FLOAT = theBytes -> ByteBuffer.wrap(theBytes).getFloat();

    public static ValueDecoder<Double> DOUBLE = theBytes -> ByteBuffer.wrap(theBytes).getDouble();
}
