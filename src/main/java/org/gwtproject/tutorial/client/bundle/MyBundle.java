package org.gwtproject.tutorial.client.bundle;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface MyBundle extends ClientBundle {
	
	public static final MyBundle INSTANCE = GWT.create(MyBundle.class);
	
	public interface MyCssResource extends CssResource {
		public String bold();
		public String bigText();
	}

	@Source("MyLogo.jpg")
	public ImageResource logo();

	@Source("MyCss.css")
	public MyCssResource style();

}
