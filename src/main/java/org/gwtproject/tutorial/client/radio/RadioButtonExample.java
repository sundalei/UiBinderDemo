package org.gwtproject.tutorial.client.radio;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RadioButtonExample extends Composite {

	private static RadioButtonExampleUiBinder uiBinder = GWT.create(RadioButtonExampleUiBinder.class);

	interface RadioButtonExampleUiBinder extends UiBinder<Widget, RadioButtonExample> {
	}

	public RadioButtonExample() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
