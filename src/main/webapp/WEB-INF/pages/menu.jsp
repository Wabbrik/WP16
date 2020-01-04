<div class="container"> 
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
  <a class="navbar-brand" href="${pageContext.request.contextPath}">Admitere Online</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav mr-auto">
        <c:if test="${pageContext.request.getRemoteUser()==null}">
      <li class="nav-item ${pageContext.request.requestURI eq '/OnlineAdmission/planInvatamant.jsp' ? ' active' : ''}">
          <a class="nav-link" href="${pageContext.request.contextPath}/planInvatamant.jsp">Plan Invatamant</a>
      </li>
      <li class="nav-item ${pageContext.request.requestURI eq '/OnlineAdmission/structuraAnUniversitar.jsp' ? ' active' : ''}">
          <a class="nav-link" href="${pageContext.request.contextPath}/structuraAnUniversitar.jsp">Structura Anului Universitar</a>
      </li>
        </c:if>
        <c:if test="${pageContext.request.isUserInRole('AdminRole')}">
      <li class="nav-item ${pageContext.request.requestURI eq 'Users' ? ' active' : ''}">
          <a class="nav-link" href="${pageContext.request.contextPath}/Users">Utilizatori</a>
      </li>
      <li class="nav-item ${pageContext.request.requestURI eq 'Portfolios' ? ' active' : ''}">
          <a class="nav-link" href="${pageContext.request.contextPath}/Portfolios">Dosare</a>
      </li>
        </c:if>
        <c:if test="${pageContext.request.isUserInRole('SecretaryRole')}">
      <li class="nav-item ${pageContext.request.requestURI eq 'Portfolios' ? ' active' : ''}">
          <a class="nav-link" href="${pageContext.request.contextPath}/Portfolios">Dosare</a>
      </li>
        </c:if>
        <c:if test="${pageConetxt.request.isUserInRole('UserRole')}">
      
      <li class="nav-item ${pageContext.request.requestURI eq '/OnlineAdmission/info.jsp' ? ' active' : ''}">
          <a class="nav-link" href="${pageContext.request.contextPath}/info.jsp">Informatii Admitere</a>
      </li>
      <li class="nav-item ${pageContext.request.requestURI eq '/OnlineAdmission/ofertaEducationala.jsp' ? ' active' : ''}">
          <a class="nav-link" href="${pageContext.request.contextPath}/ofertaEducationala.jsp">Oferta Educationala</a>
      </li>
      <li class="nav-item ${pageContext.request.requestURI eq '/OnlineAdmission/inscriere.jsp' ? ' active' : ''}">
          <a class="nav-link" href="${pageContext.request.contextPath}/inscriere.jsp">Inscriere Admitere</a>
      </li>
      </c:if>
      
      
    </ul>
          <ul class="navbar-nav m1-auto">
              <li class="nav-item">
              <c:choose> 
                  <c:when test="${pageContext.request.getRemoteUser()==null}">
                    <a class="nav-link" href="${pageContext.request.contextPath}/Signup">Signup</a>
                    <a class="nav-link" href="${pageContext.request.contextPath}/Login">Login</a>
                  </c:when>
                  <c:otherwise>
                      <a class="nav_link" href="${pageContext.request.contextPath}/Logout">Logout</a>
                  </c:otherwise>
              </c:choose>
          </li>
          </ul>
  </div>
</nav>
</div>

