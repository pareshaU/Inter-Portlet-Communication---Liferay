<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Receiver</b> portlet in View mode.
<% String pitch= (String)renderRequest.getParameter("ipc.pitch");%>
<br>
<b>
<% if(pitch!=null){%>
<font color="Red">  <%=pitch %>	...</font>
<%}else{%>
wait.....
<%}%>
</b>