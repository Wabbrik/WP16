<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:pageTemplate pageTitle="Signup">
    
    <c:if test="${message!=null}">
        <div class="alert alert-warning" role="alert">
            ${message}
            <c:if test="${message2!=null}">
                <meta http-equiv="refresh" content="5;url=http://localhost:8080/WP16-master/Login"/>
            </c:if>
            
            
        </div>
        
    </c:if>
        
    <form class="form-signup" method="POST" action="${pageContext.request.contextPath}/Signup">
        <h1 class="h3 mb-3 font-weight-normal text-center mt-2 mb-2">Sign Up</h1>
        <label for="username" class="sr-only">Username</label>
        <input type="text" id="username" name="username" class="form-control mb-2" placeholder="Username" required autofocus>
        <label for="email" class="sr-only">Email</label>
        <input type="email" id="email" name="email" class="form-control mb-2" placeholder="Email" required>
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" name="password" class="form-control mb-4" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block mb-3" type="submit">Sign Up</button>
        
        
        
    </form>
    
        
    
    
</t:pageTemplate>