package com.liferay.training.ipc;

import com.liferay.util.bridges.mvc.MVCPortlet;


import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;

import javax.portlet.ProcessEvent;


/**
 * Portlet implementation class ReceiverPortlet
 */
public class ReceiverPortlet extends MVCPortlet {
 
@ProcessEvent(qname="{http://liferay.com}ipc.pitch")
public void handleProcess(EventRequest req,EventResponse res ){
Event event = req.getEvent();
String value = (String) event.getValue();
System.out.println("From Event");
res.setRenderParameter("ipc.pitch", value);
}


}
