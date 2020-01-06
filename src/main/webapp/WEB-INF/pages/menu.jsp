<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a href="${pageContext.request.contextPath}/index.jsp">
        <img src="images/logo_2x.png" alt="Facultatea de Inginerie. Universitatea Lucian Blaga din Sibiu" data-no-retina="" style="height: 90px" class="mb-2">
    </a>

    <div class="collapse navbar-collapse pl-5" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/index.jsp">Acasa<span class="sr-only">(current)</span></a>
            </li>
            <c:if test="${pageContext.request.getRemoteUser()==null}">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/about.jsp">Despre facultate</a>
                </li>   
            </c:if>
            <c:if test="${pageContext.request.isUserInRole('ClientRole')}">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/AddRegistrationFormToPortfolio">Inscriere</a>
                </li>  
            </c:if>
            <c:if test="${pageContext.request.isUserInRole('AdminRole')}">
                <li class="nav-item ${pageContext.request.requestURI eq 'Users' ? ' active' : ''}">
                    <a class="nav-link" href="${pageContext.request.contextPath}/Users">Utilizatori</a>
                </li>
            </c:if>
            <c:if test="${pageContext.request.isUserInRole('SecretaryRole')}">
                <li class="nav-item ${pageContext.request.requestURI eq 'InvalidPortfolios' ? ' active' : ''}">
                    <a class="nav-link" href="${pageContext.request.contextPath}/InvalidPortfolios">Dosare</a>
                </li>
                <li class="nav-item ${pageContext.request.requestURI eq 'ValidPortfolios' ? ' active' : ''}">
                    <a class="nav-link" href="${pageContext.request.contextPath}/ValidPortfolios">Dosare acceptate</a>
                </li>
            </c:if>
            <c:if test="${pageContext.request.isUserInRole('AdminRole')}">
                <li class="nav-item ${pageContext.request.requestURI eq 'InvalidPortfolios' ? ' active' : ''}">
                    <a class="nav-link" href="${pageContext.request.contextPath}/InvalidPortfolios">Dosare</a>
                </li>
            </c:if>
            <c:if test="${pageContext.request.isUserInRole('ClientRole')}">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle active" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Admitere</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown01">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/RequiredDocuments">Acte necesare</a>
                    </div>
                </li>
            </c:if>
            <c:if test="${pageContext.request.getRemoteUser()==null}">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle active" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Invatamant</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown01">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/EducationalPlan">Plan de invatamant</a>
                        <a class="dropdown-item" href="http://inginerie.ulbsibiu.ro/wp-content/uploads/2019/05/structura_finala.pdf" target="_blank">Structura anului</a>
                    </div>
                </li>
            </c:if>
        </ul>
        <ul class="navbar-nav mr-0">

            <c:choose> 
                <c:when test="${pageContext.request.getRemoteUser()==null}">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/Login">Autentificare</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/Signup">Inregistrare</a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/Logout">Delogare</a>
                    </li>
                </c:otherwise>
            </c:choose>

        </ul>

    </div>
</nav>
