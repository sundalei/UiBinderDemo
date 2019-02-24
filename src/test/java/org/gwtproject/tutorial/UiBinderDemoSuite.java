package org.gwtproject.tutorial;

import org.gwtproject.tutorial.client.UiBinderDemoTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class UiBinderDemoSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for UiBinderDemo");
    suite.addTestSuite(UiBinderDemoTest.class);
    return suite;
  }
}
