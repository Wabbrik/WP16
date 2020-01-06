<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Add User">
    <div class="container text-center">

        <h2 class="mb-4 mt-4">Add User:</h2>


        <form class="needs-validation form-signin text-center" novalidate method="POST" action="${pageContext.request.contextPath}/Users/Create">

            <label for="license_plate">Username</label>
            <input type="text" class="form-control mb-2 col-md-4 mx-auto" id="username" placeholder="" name="username" value="" required>
            <div class="invalid-feedback">
                Username is required.
            </div>

            <label for="email">Email</label>
            <input type="email" class="form-control mb-2 col-md-4 mx-auto" id="email" name="email" placeholder="" value="" required>
            <div class="invalid-feedback">
                Email is required.

            </div>

            <label for="password">Password</label>
            <input type="password" class="form-control mb-2 col-md-4 mx-auto" id="password" name="password" placeholder="" value="" required>
            <div class="invalid-feedback">
                Password is required.
            </div>




            <label for="position">Position</label>
            <select type="position" class="form-control mb-2 col-md-4 mx-auto" id="position" name="position" required>
                <option value="">Choose...</option>
                <option value="ADMINISTRATOR">Administrator</option>
                <option value="SECRETARY">Secretara</option>
                <option value="CLIENT">Client</option>
            </select>
            <div class="invalid-feedback">
                Please select a position.
            </div>



            <hr class="mb-4">
            <button class="btn btn-lg btn-primary btn-block col-md-2 mt-4 mb-3 mx-auto" type="submit">Save</button>
        </form>
    </div>


    <script>
        (function () {
            'use strict'

            window.addEventListener('load', function () {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName('needs-validation')

                // Loop over them and prevent submission
                Array.prototype.filter.call(forms, function (form) {
                    form.addEventListener('submit', function (event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault()
                            event.stopPropagation()
                        }
                        form.classList.add('was-validated')
                    }, false)
                })
            }, false)
        }());
    </script>






</t:pageTemplate>

