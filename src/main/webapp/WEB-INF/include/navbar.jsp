<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%-- Fragment JSP --%>
<nav class="nav nav-pills" style="box-shadow: 0 2px 2px grey;">
    <a class="nav-item nav-link" href="<s:url action="index"/>">Home</a>
    <a class="nav-item nav-link" href="<s:url action="displayList"/>">List</a>
    <a class="nav-item nav-link" href="<s:url action="displaySelectList"/>">Selection</a>
    <a class="nav-item nav-link" href="<s:url namespace="ajax" action="getAjaxList" />">
        <i class="fa fa-plug fa-2x" aria-hidden="true"></i> Ajax !</a>
</nav>
