/*
 * Copyright 2016-2021 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
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

package org.teasoft.bee.osql;

/**
 * 用于MapSuid的对应SQL功能的MapSql关键字.MapSql keyword for the corresponding SQL function of MapSuid.
 * @author Kingstar
 * @since  1.9
 */
public enum MapSqlKey {
	
    Table("Table"),
    SelectColumns("SelectColumns"),
    GroupBy("GroupBy"),
    Having("Having"),
    OrderBy("OrderBy")
//	Start("Start"),
//	Size("Size"),
    ;
	
    String name;
    
    MapSqlKey(String name){
    	this.name = name;  
    }
    
    public String getName(){
    	return name;
    }

}
