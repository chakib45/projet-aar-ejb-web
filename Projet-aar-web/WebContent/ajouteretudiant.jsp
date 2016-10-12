<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/jspf/header.jspf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter etudiant</title>
</head>
<h1>Ajouter etudiant</h1>
<form action="controleur.ajouteretudiant" method="post">
  <div class="form-group">
    <label for="formGroupExampleInput">login etudiant</label>
    <input type="text" name="login" class="form-control" id="formGroupExampleInput" placeholder="Example input">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">mot de passe etudiant</label>
    <input type="text" name="pwd" class="form-control" id="formGroupExampleInput2" placeholder="Another input">
  </div>
  <div class="form-group row">
      <div class="offset-sm-2 col-sm-10">
        <button type="submit" name="action" value="Ajouter" class="btn btn-primary">Ajouter</button>
      </div>
    </div>
</form>

<div>
<table class="table table-hover">
<tr>
<th>login</th><th>mot de passe</th>
</tr>
<c:forEach items="${compteetudiant}" var="ce">
<tr>
<td>${ce.login}</td>
<td>${ce.password}</td>

</tr>

</c:forEach>

</table>

</div>

<%@include file="/WEB-INF/jspf/footer.jspf" %>