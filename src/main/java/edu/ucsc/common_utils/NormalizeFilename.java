package edu.ucsc.common_utils;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class NormalizeFilename implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		Object payload = eventContext.getMessage().getPayload();
		MuleMessage message = eventContext.getMessage();
		String filename = message.getProperty("filename", PropertyScope.SESSION);
		String normalizedFilename = filename.replaceAll("[^.a-zA-Z0-9]", "_");
		message.setProperty("normalizedFilename", normalizedFilename, PropertyScope.SESSION);

		return null;
	}

}
