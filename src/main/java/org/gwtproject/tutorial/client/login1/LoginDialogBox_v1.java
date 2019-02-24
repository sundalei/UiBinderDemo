package org.gwtproject.tutorial.client.login1;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginDialogBox_v1 extends PopupPanel {

	private static LoginDialogBox_v1UiBinder uiBinder = GWT.create(LoginDialogBox_v1UiBinder.class);

	interface LoginDialogBox_v1UiBinder extends UiBinder<Widget, LoginDialogBox_v1> {
	}
	
	@UiField
	Button btnLogin;
	@UiField
	TextBox txtEmail;
	
	@UiField
	SpanElement eEmailErrorText;
	@UiField
	SpanElement ePassErrorText;
	@UiField
	Element eEmailError;
	@UiField
	Element ePassError;
	
	@UiField(provided = true)
	TextBox txtPassword;

	public LoginDialogBox_v1() {
		this.setStyleName("");
		txtPassword = new PasswordTextBox();
		this.add(uiBinder.createAndBindUi(this));
	}
}
