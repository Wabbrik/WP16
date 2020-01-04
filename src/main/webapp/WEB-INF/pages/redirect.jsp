<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:pageTemplate pageTitle="Redirect">
<c:if test="${message1 != null}">
            <c:if test="${message2 != null}">
                <div class="alert alert-warning" role="alert">
                    ${message1}${message2}
                </div>
            </c:if>
            <c:if test="${message2 == null}">
                <div class="alert alert-warning" role="alert">
                    ${message1}
                </div>
            </c:if>
        <meta http-equiv="refresh" content="3;url=http://localhost:8080/WP16/Users"/>    
        </c:if>
</t:pageTemplate>