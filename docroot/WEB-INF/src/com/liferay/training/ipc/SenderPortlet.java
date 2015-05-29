package com.liferay.training.ipc;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;



import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.xml.namespace.QName;

/**
 * Portlet implementation class SenderPortlet
 */
public class SenderPortlet extends MVCPortlet {

	@ProcessAction(name = "pitchBall")
	public void pitchBall(ActionRequest req, ActionResponse res) {
		
		System.out.println("pitch call");	
		
		String pitchType = ParamUtil.getString(req,"sampleText","");
		System.out.println(pitchType);
		
		QName qname = new QName("http://liferay.com", "ipc.pitch", "x");
		res.setEvent(qname, pitchType);
		System.out.println("Call from here");
	}
}
