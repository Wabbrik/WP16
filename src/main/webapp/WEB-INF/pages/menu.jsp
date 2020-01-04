<%@page contentType="text/html" pageEncoding="UTF-8"%>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <img src="images/logo_2x.png" alt="Facultatea de Inginerie. Universitatea Lucian Blaga din Sibiu" data-no-retina="" style="height: 90px" class="mb-2">


    <div class="collapse navbar-collapse pl-5" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/index.jsp">Acasa<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/about.jsp">Despre facultate</a>
            </li>   
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/Matriculation">Inscriere</a>
            </li>  
            <li class="nav-item ${pageContext.request.requestURI eq 'Users' ? ' active' : ''}">
                <a class="nav-link" href="${pageContext.request.contextPath}/Users">Utilizatori</a>
            </li>
            <li class="nav-item ${pageContext.request.requestURI eq 'Portfolios' ? ' active' : ''}">
                <a class="nav-link" href="${pageContext.request.contextPath}/Portfolios">Dosare</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle active" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Admitere</a>
                <div class="dropdown-menu" aria-labelledby="dropdown01">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/RequiredDocuments">Acte necesare</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle active" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Invatamant</a>
                <div class="dropdown-menu" aria-labelledby="dropdown01">
                    <a class="dropdown-item" href="#">Plan de invatamant</a>
                    <a class="dropdown-item" href="#">Structura anului</a>
                </div>
            </li>
        </ul>
        <ul class="navbar-nav mr-0">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/Login">Autentificare</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/Signup">Inregistrare</a>
            </li>
        </ul>

    </div>
</nav>
