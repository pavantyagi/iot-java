package com.ibm.iotf.client.app;


public interface EventCallback {

	public void processEvent(Event evt);
	
	public void processCommand(Command cmd);
}
