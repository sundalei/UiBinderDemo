package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class UiBinderDemo implements EntryPoint {
  
  public void onModuleLoad() {
    RootPanel.get().add(new ExamplePanel(), 0, 0);
  }
}
