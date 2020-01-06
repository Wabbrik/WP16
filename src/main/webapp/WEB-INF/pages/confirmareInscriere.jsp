<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:pageTemplate pageTitle="Redirect">
    <div class="alert alert-warning" role="alert">
        ${message}
        <meta http-equiv="refresh" content="3;url=http://localhost:8080/WP16"/>
    </div>
</t:pageTemplate>