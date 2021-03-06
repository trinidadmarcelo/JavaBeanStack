/*
* JavaBeanStack FrameWork
*
* Copyright (C) 2017 Jorge Enciso
* Email: jorge.enciso.r@gmail.com
*
* This library is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation; either
* version 3 of the License, or (at your option) any later version.
*
* This library is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this library; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
* MA 02110-1301  USA
*/
package org.javabeanstack.appresources;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Map;
import org.javabeanstack.security.IUserSession;
import org.javabeanstack.xml.IXmlDom;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Jorge Enciso
 */
public interface IAppResource extends Serializable{
    InputStream getResourceAsStream(IUserSession userSession, String resourcePath);
    InputStream getResourceAsStream(String sessionId, String resourcePath);
    IXmlDom<Document, Element> getResourceAsXmlDom(String sessionId, String resourcePath, Map<String, String> params);
}
