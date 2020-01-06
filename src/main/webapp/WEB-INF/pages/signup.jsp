<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:pageTemplate pageTitle="Signup">
    <div class="container">

        <c:if test="${message!=null}">
            <div class="alert alert-warning" role="alert">
                ${message}
                <c:if test="${message2!=null}">
                    <meta http-equiv="refresh" content="5;url=http://localhost:8080/WP16/Login"/>
                </c:if>
            </div>
        </c:if>

        <form class="form-signup text-center" method="POST" action="${pageContext.request.contextPath}/Signup">
            <img src="images/LOGO-NOU-site_small-1.png" alt="Logo Ulbs" width="200" height="110">
            <label for="username" class="sr-only">Username</label>
            <input type="text" id="username" name="username" class="form-control mb-2 col-md-4 mx-auto" placeholder="Username" required autofocus>
            <label for="email" class="sr-only">Email</label>
            <input type="email" id="email" name="email" class="form-control mb-2 col-md-4 mx-auto" placeholder="Email" required>
            <label for="password" class="sr-only">Password</label>
            <input type="password" id="password" name="password" class="form-control mb-4 col-md-4 mx-auto" placeholder="Password" required>
            <button class="btn btn-lg btn-primary btn-block col-md-2 mt-4 mb-3 mx-auto" type="submit">Sign Up</button>
        </form>
    </div>



</t:pageTemplate>