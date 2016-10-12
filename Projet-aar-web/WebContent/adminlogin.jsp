<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/jspf/header.jspf" %>

<h1>Admin Login</h1>

<form method="POST" style="text-align: center" action="controleur.adminlogin">
    <div>
        <label for="username">nom&nbsp;&nbsp;</label>
        <input required class="form-horizontal" type="text" name="username" id="username" value="${customer.username}"/>
    </div>
    <div>
        <label for="password">mot de passe&nbsp;&nbsp;</label>
        <input required class="form-horizontal" type="password" name="password" id="password" value="${customer.password}"/>
    </div>
    <div/>
    <input class="btn-danger" value ="valider" type="submit" name="submitCustomer" id="submitCustomer"/>
</form>

<%@include file="/WEB-INF/jspf/footer.jspf" %>