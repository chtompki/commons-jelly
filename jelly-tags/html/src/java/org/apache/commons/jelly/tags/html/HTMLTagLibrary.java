/*
 * Copyright 2002,2004 The Apache Software Foundation.
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
package org.apache.commons.jelly.tags.html;

import org.apache.commons.jelly.TagLibrary;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/** Describes the Taglib. This class could be generated by XDoclet
  *
  * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
  * @version $Revision: 1.9 $
  */
public class HTMLTagLibrary extends TagLibrary {

    /** The Log to which logging calls will be made. */
    private Log log = LogFactory.getLog(HTMLTagLibrary.class);
    
    public HTMLTagLibrary() {
        registerTag("parse", ParseTag.class);
    }
}
