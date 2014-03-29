/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.commons.api.domain.v3;

import java.net.URI;
import org.apache.olingo.commons.api.domain.CommonODataObjectFactory;
import org.apache.olingo.commons.api.domain.ODataCollectionValue;
import org.apache.olingo.commons.api.domain.ODataComplexValue;
import org.apache.olingo.commons.api.domain.ODataPrimitiveValue;

public interface ODataObjectFactory extends CommonODataObjectFactory {

  @Override
  ODataEntitySet newEntitySet();

  @Override
  ODataEntitySet newEntitySet(URI next);

  @Override
  ODataEntity newEntity(String name);

  @Override
  ODataEntity newEntity(String name, URI link);

  @Override
  ODataProperty newPrimitiveProperty(String name, ODataPrimitiveValue value);

  @Override
  ODataProperty newComplexProperty(String name, ODataComplexValue value);

  @Override
  ODataProperty newCollectionProperty(String name, ODataCollectionValue value);

}
