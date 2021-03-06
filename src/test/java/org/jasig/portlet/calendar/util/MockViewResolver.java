/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jasig.portlet.calendar.util;

import java.util.Locale;
import java.util.Map;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

public class MockViewResolver implements ViewResolver {

  private String viewName;
  private MockView view;

  public View resolveViewName(String viewName, Locale locale) throws Exception {
    this.viewName = viewName;
    this.view = new MockView();
    return view;
  }

  public String getViewName() {
    return viewName;
  }

  public Map<String, Object> getModel() {
    return view.getModel();
  }
}
