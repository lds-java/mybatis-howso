/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.builder.xml;

import java.io.InputStream;
/**
 * 
 * @ClassName DefaultXMLMapperMerger
 * @Description 
 * @author zhoujiaping
 * @Date 2017年6月1日 下午2:40:04
 * @version 1.0.0
 */
public class DefaultXMLMapperMerger implements XMLMapperMerger {
    public InputStream merge(InputStream in){
        return in;
    }
}
