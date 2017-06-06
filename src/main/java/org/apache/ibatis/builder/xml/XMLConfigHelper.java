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
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * 
 * @ClassName XMLConfigHelper
 * @Description 
 * @author zhoujiaping
 * @Date 2017年6月1日 下午2:40:31
 * @version 1.0.0
 */
public class XMLConfigHelper {
    private Document doc;
    {
        init();
    }
    public void init(){
        String resource = "mybatis-basemapper.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SAXReader reader = new SAXReader();
            doc = reader.read(inputStream);
        } catch (Exception e) {
            e.printStackTrace();//采用默认行为
        }
    }
    public String getXmlMapperMerger(){
        if(doc==null){
            return "org.apache.ibatis.builder.xml.DefaultXMLMapperMerger";//提供默认值
        }
        List<Element> elements = doc.getRootElement().elements();
        for(Element ele:elements){
            if("xmlMapperMerger".equals(ele.attributeValue("id"))){
                return ele.attributeValue("class");
            }
        }
        throw new RuntimeException("xmlMapperMerger not found");
    }
}
