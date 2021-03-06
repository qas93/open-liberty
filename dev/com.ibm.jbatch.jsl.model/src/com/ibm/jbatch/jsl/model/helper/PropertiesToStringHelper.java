/*
 * Copyright 2012 International Business Machines Corp.
 * 
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.jbatch.jsl.model.helper;

import com.ibm.jbatch.jsl.model.JSLProperties;
import com.ibm.jbatch.jsl.model.Property;

/**
 * @author skurz
 *
 */
public class PropertiesToStringHelper {

	public static String getString(JSLProperties props) {
		if (props == null) return null;
		
		StringBuffer buf = new StringBuffer(150);
		for (Property prop : props.getPropertyList()) {
			buf.append("name=" + prop.getName() + ",value=" + prop.getValue() + "\n");
		}
		return buf.toString();
	}
}
