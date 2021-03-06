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


package org.openqa.selenium.v1;

import com.thoughtworks.selenium.InternalSelenseTestBase;

import org.testng.annotations.Test;

public class TestFifteenSecondSleep extends InternalSelenseTestBase
{
  @Test(dataProvider = "system-properties")
  public void testFifteenSecondSleep() throws Throwable {

    selenium.open("/selenium-server/tests/html/test_open.html");
    selenium.setContext("Sleeping 15 seconds");
    Thread.sleep(15000);
    selenium.open("/selenium-server/tests/html/test_open.html");
  }
}
