/*_############################################################################
  _## 
  _##  SNMP4J 2 - PrivAES192.java  
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

import org.snmp4j.smi.OID;

/**
 * Encryption class for AES 192.
 *
 * @author Jochen Katz
 * @version 1.11
 */
public class PrivAES192 extends PrivAES {

  private static final long serialVersionUID = -3496699866363408441L;

  /**
   * Unique ID of this privacy protocol.
   */
  public static final OID ID = new OID("1.3.6.1.4.1.4976.2.2.1.1.1");

  /**
   * Constructor.
   */
  public PrivAES192() {
    super(24);
  }
  /**
   * Gets the OID uniquely identifying the privacy protocol.
   * @return
   *    an <code>OID</code> instance.
   */
  public OID getID() {
        return (OID) ID.clone();
  }

}
