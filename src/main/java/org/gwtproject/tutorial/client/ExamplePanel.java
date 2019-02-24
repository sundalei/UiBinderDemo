package org.gwtproject.tutorial.client;

import org.gwtproject.tutorial.client.disclosure.DisclosurePanelExample;
import org.gwtproject.tutorial.client.intro.IntroPanel;
import org.gwtproject.tutorial.client.login1.LoginDialogBox_v1;
import org.gwtproject.tutorial.client.logindialog.LoginDialogBox;
import org.gwtproject.tutorial.client.split.SplitLayoutPanelExample;
import org.gwtproject.tutorial.client.stack.StackPanelExample;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class ExamplePanel extends Composite {

	private static ExamplePanelUiBinder uiBinder = GWT.create(ExamplePanelUiBinder.class);

	interface ExamplePanelUiBinder extends UiBinder<Widget, ExamplePanel> {
	}
	
	interface Resources extends ClientBundle {
		@Source("gwtia.jpg")
		public ImageResource logo();
	}
	
	private LoginDialogBox_v1 loginDialogBox_v1 = new LoginDialogBox_v1();
	private LoginDialogBox loginDialog = new LoginDialogBox();
	
	@UiField
	Panel exampleArea;
	
	public ExamplePanel() {
		initWidget(uiBinder.createAndBindUi(this));
		setWidgetToMaxWidthAndHeight();
		Window.addResizeHandler(resizeHandler);
		setWidgetAsExample(new IntroPanel());
	}
	
	@UiHandler("loginEx_v1")
	void showLoginExample_v1(ClickEvent event) {
		setWidgetAsExample(loginDialogBox_v1);
	}
	
	@UiHandler("splitLayoutPanelEx")
	void showSplitPanelExample (ClickEvent event) {
		Widget widget = new SplitLayoutPanelExample();
		widget.setSize("300px", "300px");
		setWidgetAsExample(widget);
	}
	
	@UiHandler("stackPanelEx")
	void stackPanelExample (ClickEvent event) {
		setWidgetAsExample(new StackPanelExample());
	}
	
	@UiHandler("disclosurePanelEx")
	void showDisclosurePanelExample(ClickEvent event) {
		setWidgetAsExample(new DisclosurePanelExample());
	}
	
	@UiHandler("introPanel")
	void showInstructionsPanel (ClickEvent event) {
		setWidgetAsExample(new IntroPanel());
	}
	
	@UiHandler("showLoginEx")
	void showLoginExample(ClickEvent event) {
		loginDialog.show();
	}

	@UiHandler("hideLoginEx")
	void hideLoginExample(ClickEvent event) {
		loginDialog.hide();
	}
	
	private void setWidgetAsExample(Widget widget) {
		exampleArea.clear();
		exampleArea.add(widget);
	}
	
	private ResizeHandler resizeHandler = new ResizeHandler() {
		
		@Override
		public void onResize(ResizeEvent event) {
			setWidgetToMaxWidthAndHeight();
		}
	};
	
	private void setWidgetToMaxWidthAndHeight() {
		setWidth("100%");
		setHeight(Window.getClientHeight() + "px");
	}

}
