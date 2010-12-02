/*
 * Copyright 2010 the original author or authors.
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
package org.springframework.data.keyvalue.redis.core;

import java.util.List;

/**
 * List operations bound to a certain key.
 * 
 * @author Costin Leau
 */
public interface BoundListOperations<K, V> extends KeyBound<K> {

	RedisOperations<K, V> getOperations();

	List<V> range(long start, long end);

	void trim(long start, long end);

	Long size();

	Long leftPush(V value);

	Long rightPush(V value);

	V leftPop();

	V rightPop();

	Long remove(long i, Object value);

	V index(long index);

	void set(long index, V value);
}