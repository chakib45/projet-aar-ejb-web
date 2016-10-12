<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/jspf/header.jspf" %>


 <div class="jumbotron text-center">
  <h1>Acceuil platforme pedagogique</h1>
  <p>Choisissez votre status pour vous connecter sur la platforme</p>
</div>
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>espace Admin</h3>
      <p>vous etes admin pour ajouter des étudiants ou enseignants vous devez etre connecte</p>
      <button class="btn btn-primary" type="submit"><a href="adminlogin.jsp">se connecter</a></button>
    </div>
    <div class="col-sm-4">
      <h3>espace enseignant </h3>
      <p>si vous etes enseignant</p>
      <button class="btn btn-primary" type="submit" ><a href="#">se connecter</a></button>
    </div>
    <div class="col-sm-4">
      <h3>espace etudiant</h3>
      <p>si vous etes etudiant</p>
      <button class="btn btn-primary" type="submit" >se connecter</button>
    </div>
  </div>
</div>


<%@include file="/WEB-INF/jspf/footer.jspf" %>