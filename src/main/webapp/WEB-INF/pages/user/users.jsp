<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Users">
    <div class="container">
        <h2 class="mb-4 mt-4 text-center">Utilizatori</h2>

        <form method="POST" action = "${pageContext.request.contextPath}/Users">
            <%--<c:if test="${pageContext.request.isUserInRole('AdminRole')}">--%>
            <a class="btn btn-primary " href="${pageContext.request.contextPath}/Users/Create" role="button">Adauga Utilizator</a> 


            <%--</c:if>--%>
            <button class="btn btn-danger" type="submit">Delete Users</button>



            <table class="table table-bordered mt-3">
                <thead>
                    <tr>
                        <th scope="col" class="text-center px-0" style="width:50px"></th>
                        <th scope="col">Username</th>
                        <th scope="col">Email</th>
                        <th scope="col">Pozitie</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${users}" varStatus="status">

                        <tr>
                            <th scope="row" class="text-center">
                                <input type="checkbox" name="user_ids" value="${user.id}"/>
                            </th>
                            <td> 
                                ${user.username}
                            </td>
                            <td> 
                                ${user.email}
                            </td>
                            <td>
                                ${user.position}
                            </td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>

        </form>
    </div>
</t:pageTemplate>