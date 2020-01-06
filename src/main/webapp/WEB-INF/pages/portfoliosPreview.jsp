<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Portfolios">
    <div class="container">

        <h2 class="mb-4 mt-4 text-center">Dosare</h2>

        <div class="row">
            <div class="col-sm-2">
                <b>Nume</b>
            </div>
            <div class="col-sm-2">
                <b>Prenume</b>
            </div>
            <div class="col-sm-2">
                <b>CNP</b>
            </div>
            <div class="col-sm-2">
                <b>Buletin</b>
            </div>
        </div>   

        <c:forEach var="rf" items="${registrationForms}" varStatus="status">
            <div class="row">
                <div class="col-sm-2 mt-2">
                    ${rf.lastName}
                </div>
                <div class="col-sm-2 mt-2">
                    ${rf.firstName}
                </div>
                <div class="col-sm-2 mt-2">
                    ${rf.pid}
                </div>
                <div class="col-sm-2 mt-2">
                    ${rf.idCardSeries}
                    ${rf.idCardNumber}
                </div>
                <c:if test="${pageContext.request.isUserInRole('AdminRole')}">
                    <a class="btn btn-secondary" href="${pageContext.request.contextPath}/Portfolios/Update?id=${rf.id}" role="button">Vezi dosar complet</a> 
                </c:if>
                <c:if test="${pageContext.request.isUserInRole('SecretaryRole')}">
                    <a class="btn btn-secondary" href="${pageContext.request.contextPath}/Portfolios/Validate?id=${rf.id}&ascunde=${ascundeValidate}" role="button">Vezi dosar complet</a> 
                </c:if>

            </c:forEach>

        </div>


    </t:pageTemplate>