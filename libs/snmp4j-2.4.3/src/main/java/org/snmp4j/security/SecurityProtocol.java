/*_############################################################################
  _## 
  _##  SNMP4J 2 - SecurityProtocol.java  
  _## 
  _##  Copyright (C) 2003-2016  Frank Fock and Jochen Katz (SNMP4J.org)
  _##  
  _##  Licensed under the Apache License, Version 2.0 (the "License");
  _##  you may not use this file except in compliance with the License.
  _##  You may obtain a copy of the License at
  _##  
  _##      http://www.apache.org/licenses/LICENSE-2.0
  _##  
  _##  Unless required by applicable law or agreed to in writing, software
  _##  distributed under the License is distributed on an "AS IS" BASIS,
  _##  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  _##  See the License for the specific language governing permissions and
  _##  limitations under the License.
  _##  
  _##########################################################################*/
package org.snmp4j.security;

import java.io.Serializable;
import org.snmp4j.smi.OID;

/**
 * The <code>SecurityProtocol</code> class defines common methods of
 * authentication and privacy protocols.
 *
 * @author Jochen Katz & Frank Fock
 * @version 1.0
 */
public interface SecurityProtocol extends Serializable {

  /**
   * Gets the OID uniquely identifying the privacy protocol.
   * @return
   *    an <code>OID</code> instance.
   */
  OID getID();

}

