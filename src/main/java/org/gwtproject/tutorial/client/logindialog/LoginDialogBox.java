package org.gwtproject.tutorial.client.logindialog;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginDialogBox extends PopupPanel {
	
	interface MyStyle extends CssResource {
		String hidden();
		String borderEmpty();
		String borderOk();
		String borderError();
	}

	private static MyBinder uiBinder = GWT.create(MyBinder.class);

	interface MyBinder extends UiBinder<Widget, LoginDialogBox> { 
	}
	
	@UiField Button btnLogin;
	
	@UiField TextBox txtEmail;
	
	@UiField SpanElement eEmailErrorText;
	@UiField SpanElement ePassErrorText;
	@UiField Element eEmailError;
	@UiField Element ePassError;
	
	@UiField(provided = true) TextBox txtPassword;

	public LoginDialogBox() {
		this.setStyleName("");
		txtPassword = new PasswordTextBox();
		this.add(uiBinder.createAndBindUi(this));
		centerPopupOnPage();
	}
	
	private void centerPopupOnPage() {
		int minOffset = 10;
		int knownDialogWidth = 400;
		int heightAboveCenter = 200;

		int left = Math.max(minOffset, (Window.getClientWidth() / 2) - (knownDialogWidth / 2));
		int top = Math.max(minOffset, (Window.getClientHeight() / 2) - heightAboveCenter);
		setPopupPosition(left, top);
	}
}
