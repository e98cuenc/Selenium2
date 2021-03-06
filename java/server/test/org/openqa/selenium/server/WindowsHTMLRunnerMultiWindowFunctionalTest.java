/*
Copyright 2012 Selenium committers
Copyright 2012 Software Freedom Conservancy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.openqa.selenium.server;

public class WindowsHTMLRunnerMultiWindowFunctionalTest extends HTMLRunnerTestBase {
  public WindowsHTMLRunnerMultiWindowFunctionalTest() {
    super.multiWindow = true;
  }

  public WindowsHTMLRunnerMultiWindowFunctionalTest(String name) {
    super(name);
    super.multiWindow = true;
  }

  public void testFirefox() throws Exception {
    runHTMLSuite("*firefox", false);
  }

  public void testIExplore() throws Exception {
    runHTMLSuite("*iexplore", false);
  }

  public void testChrome() throws Exception {
    runHTMLSuite("*chrome", false);
  }

  public void testOpera() throws Exception {
    runHTMLSuite("*opera", false);
  }

  public void testHTA() throws Exception {
    try {
      runHTMLSuite("*iehta", false);
      fail("Didn't catch expected exception");
    } catch (UnsupportedOperationException e) {
      System.out.println("caught expected exception");
    }
  }

}
