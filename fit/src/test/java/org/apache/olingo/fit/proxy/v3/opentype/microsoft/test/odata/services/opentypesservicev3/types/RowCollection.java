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

package org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservicev3.types;

import org.apache.olingo.ext.proxy.api.AbstractEntityCollection;
import org.apache.olingo.ext.proxy.api.AbstractTerm;

import java.util.Collection;


public interface RowCollection extends 
    org.apache.olingo.ext.proxy.api.EntityCollectionQuery<org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservicev3.types.Row, org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservicev3.types.RowCollection, org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservicev3.types.RowCollection>, AbstractEntityCollection<org.apache.olingo.fit.proxy.v3.opentype.microsoft.test.odata.services.opentypesservicev3.types.Row> {

  Object getAnnotation(Class<? extends AbstractTerm> term);

  Collection<Class<? extends AbstractTerm>> getAnnotationTerms();
}