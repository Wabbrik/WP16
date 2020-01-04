<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Users">
    <h1>Utilizatori</h1>
    <form method="POST" action="${pageContext.request.contextPath}/Users">
    <c:if test="${pageContext.request.isUserInRole('AdminRole')}">
        <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/Users/Create" role="button">Adauga Utilizator</a> 
    </c:if>
    <c:if test="${message!=null}">
        <c:if test="${message2!=null}">
        <div class="alert alert-warning" role="alert">
            ${message}${message2}
        </div>
        </c:if>
        
    </c:if>
            <div class="row">
            <div class="col-md-3">
                <b> Username</b>
            </div>
            <div class="col-md-3">
                <b>Email</b>
            </div>
            <div class="col-md-3">
                <b>Pozitie</b>
            </div>
        </div>   
    <c:forEach var="user" items="${users}" varStatus="status">
        <div class="row">
            
            <div class="col-md-3">
                ${user.username}
            </div>
            <div class="col-md-3">
                ${user.email}
            </div>
            <div class="col-md-3">
                ${user.position}
            </div>
        </div>    
    </c:forEach>
            
    </form>
   
</t:pageTemplate>