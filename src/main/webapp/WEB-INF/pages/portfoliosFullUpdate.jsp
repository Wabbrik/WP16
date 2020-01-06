<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Portfolios">

    <h1>Editare Dosar</h1>

    <form class="form-matriculation" method="POST" action="${pageContext.request.contextPath}/Portfolios/Update?id=${rf.id}">
        <h5>Datele personale:</h5>
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputLastNameAtBirth" class="mt-2">Numele de familie la nastere:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="lastNameAtBirth" name="lastNameAtBirth" value="${rf.lastNameAtBirth}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputLastName" class="mt-2" title="Se completeaza doar daca este diferit de numele de familie la na?tere">Numele de familie actual:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="lastName" name="lastName" value="${rf.lastName}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputFirstName" class="mt-2">Prenume:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="firstName" name="firstName" value="${rf.firstName}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputdadFirstName" class="mt-2">Prenume tata:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="dadFirstName" name="dadFirstName" value="${rf.dadFirstName}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputmomFirstName" class="mt-2">Prenume mama:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="momFirstName" name="momFirstName" value="${rf.momFirstName}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPid" class="mt-2">CNP:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="pid" name="pid" class="form-control" value="${rf.pid}" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBirthday" class="mt-2">Data nasterii:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "date" id="birthday" name="birthday" class="form-control" value="${rf.birthdate}" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCivilStatus" class="mt-2">Starea civila:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <select class="form-control" id="civilStatus" value="${rf.civilStatus}" name="civilStatus" required>
                    <option value="casatorit">Casatorit</option>    
                    <option value="necasatorit">Necasatorit</option>
                </select>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputSpecialSocialSituation" class="mt-2" title="Se completeaza numai de persoanele aflate în aceasta situa?ie, pe baza de documente doveditoare.">Situa?ie sociala speciala:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <select class="form-control" id="specialSocialSituation" value="${rf.specialSocialSituation}" name="specialSocialSituation">
                    <option value="none">Niciuna</option>
                    <option value="orfan1">Orfan de un parinte</option>    
                    <option value="orfan2">Orfan de ambii parin?i</option>
                    <option value="provenit1">Provenit din case de copii</option>
                    <option value="preovenit2">Provenit din familie monoparentala</option>
                </select>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCitizenship" class="mt-2">Cetatenia:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="citizenship" name="citizenship" value="${rf.citizenship}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputEthnicity" class="mt-2">Etnia:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="ethnicity" name="ethnicity" value="${rf.ethnicity}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-6">
                <label for="inputDisability" class="mt-2" title="Se completeaza numai de catre persoanele aflate în aceasta situatie, pe baza de documente doveditoare:"/>Candidat care care se încadreaza în categoria persoanelor cu dizabilitati:</label>
            </div>
            <div class="col-md-2 mr-3 text-left">
                <select class="form-control" id="disability" value="${rf.disability}" name="disability">
                    <option value="da">Da</option>
                    <option value="nu">Nu</option>
                </select>
            </div>
        </div>
        <h5 class="mt-5">Locul nasterii:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCountry" class="mt-2">Tara:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="placeOfBirthCountry" name="placeOfBirthCountry" value="${rf.placeOfBirthCountry}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCounty" class="mt-2">Judetul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="placeOfBirthCounty" name="placeOfBirthCounty" value="${rf.placeOfBirthCounty}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCity" class="mt-2">Localitatea:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="placeOfBirthCity" name="placeOfBirthCity" value="${rf.placeOfBirthCity}" class="form-control" required autofocus>
            </div>
        </div>
        <h5 class="mt-5">Domiciliul stabilit:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCountry" class="mt-2">Tara:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="homeAddressCountry" name="homeAddressCountry" value="${rf.homeAddressCountry}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCounty" class="mt-2">Judetul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="homeAddressCounty" name="homeAddressCounty" value="${rf.homeAddressCounty}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCity" class="mt-2">Localitatea:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="homeAddressCity" name="homeAddressCity" value="${rf.homeAddressCity}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCity" class="mt-2">Adresa:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="homeAddressStrNrFlAp" name="homeAddressStrNrFlAp" value="${rf.homeAddressStrNrFlAp}" placeholder="Strada, nr. bloc, scara, etaj, apartament" class="form-control" required autofocus>
            </div>
        </div>

        <h5 class="mt-5">Date de contact ale candidatului:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPhoneNumber" class="mt-2">Telefon:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "number" id="contactPhoneNumber" name="contactPhoneNumber" value="${rf.contactPhoneNumber}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputParentPhoneNumber" class="mt-2">Telefonul mamei/tatei:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "number" id="contactParentPhoneNumber" name="contactParentPhoneNumber" value="${rf.contactParentPhoneNumber}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputMail" class="mt-2">Adresa e-mail:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "email" id="contactEmail" name="contactEmail" value="${rf.contactEmail}" class="form-control" required autofocus>
            </div>
        </div>
        <h5 class="mt-5">Act de identitate C.I. / pa?aport:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardSeries" class="mt-2">Seria:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="idCardSeries" name="idCardSeries" value="${rf.idCardSeries}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardNumber" class="mt-2">Numar:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "number" id="idCardNumber" name="idCardNumber" value="${rf.idCardNumber}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardReleasedBy" class="mt-2">Eliberat de:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="idCardReleasedBy" name="idCardReleasedBy" value="${rf.idCardReleasedBy}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardReleaseDate" class="mt-2">Eliberat la data:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="idCardReleaseDate" name="idCardReleaseDate" value="${rf.idCardReleaseDate}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardExpiryDate" class="mt-2">Expira la data:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="idCardExpiryDate" name="idCardExpiryDate" value="${rf.idCardExpiryDate}" class="form-control" required autofocus>
            </div>
        </div>
        <h5 class="mt-5">Studiile preuniversitare absolvite, nivel liceu:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCountry" class="mt-2">Institutia unde a absolvit:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" name="preuniversitarStudiesInstitution" class="form-control" value="${rf.preuniversitarStudiesInstitution}" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesCountry" class="mt-2">?ara:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="preuniversitarStudiesCountry" name="preuniversitarStudiesCountry" value="${rf.preuniversitarStudiesCountry}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesCounty" class="mt-2">Jude?ul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="preuniversitarStudiesCounty" name="preuniversitarStudiesCounty" value="${rf.preuniversitarStudiesCounty}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesCity" class="mt-2">Localitatea:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="preuniversitarStudiesCity" name="preuniversitarStudiesCity" value="${rf.preuniversitarStudiesCity}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesDomain" class="mt-2">Profilul/Domeniul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="preuniversitarStudiesDomain" name="preuniversitarStudiesDomain" value="${rf.preuniversitarStudiesDomain}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesLength" class="mt-2">Durata studiilor:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "number" id="preuniversitarStudiesLength" name="preuniversitarStudiesLength" value="${rf.preuniversitarStudiesLength}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesGraduationYear" class="mt-2">Anul absolvirii:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "number" id="preuniversitarStudiesGraduationYear" name="preuniversitarStudiesGraduationYear" value="${rf.preuniversitarStudiesGraduationYear}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesType" class="mt-2">Forma de înva?amânt:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <select class="form-control" id="preuniversitarStudiesType" name="preuniversitarStudiesType" value="${rf.preuniversitarStudiesType}" >
                    <option value="zi">Zi</option>
                    <option value="seral">Seral</option>
                    <option value="distanta">Invatamant la distanta</option>
                </select>
            </div>
        </div>
        <h5 class="mt-5">Datele de identificare ale diplomei de bacalaureat/adeverin?ei de absolvire:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBacDiplomaSeries" class="mt-2">Seria:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="bacDiplomaSeries" name="bacDiplomaSeries" value="${rf.bacDiplomaSeries}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBacDiplomaNumber" class="mt-2">Numarul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "number" id="bacDiplomaNumber" name="bacDiplomaNumber" value="${rf.bacDiplomaNumber}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBacDiplomaReleasedBy" class="mt-2">Emisa de:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="bacDiplomaReleasedBy" name="bacDiplomaReleasedBy" value="${rf.bacDiplomaReleasedBy}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBacDiplomaReleaseDateYear" class="mt-2">Anul emiterii:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "number" id="bacDiplomaReleaseDateYear" name="bacDiplomaReleaseDateYear" value="${rf.bacDiplomaReleaseDateYear}" class="form-control" required autofocus>
            </div>
        </div>
        <hr>
        
        <div class="row mb-2">
            <div class="col-md">
                <label for="inputRemarks" class="mt-2" title="Vizarea/Recunoasterea diplomei prezentate DGRIE - acorduri bilaterale/DGIS ?i CNRED/ Nr./seria act
de recunoastere/echivalare (eliberat de DGRIE/ DGIS ?i CNRED)">Alte observatii (pentru cazurile în care candidatul a absolvit studii anterioare în strainatate):</label>
                <textarea  type="text" name="remarks" id="remarks" rows="4"  cols="150" placeholder="Vizarea/Recunoasterea diplomei prezentate DGRIE - acorduri bilaterale/DGIS ?i CNRED/ Nr./seria act
de recunoastere/echivalare (eliberat de DGRIE/ DGIS ?i CNRED)" >${rf.remarks}</textarea>
            </div>
        </div>
        
        <h5>Programele de studii universitare de licen?a pentru care optez (în ordinea preferin?elor):</h5>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputOption1" class="mt-2">Optiunea 1:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="option1" name="option1" value="${rf.option1}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputOption2" class="mt-2">Optiunea 2:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="option2" name="option2" value="${rf.option2}" class="form-control" required autofocus>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputOption3" class="mt-2">Optiunea 3:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type= "text" id="option3" name="option3" value="${rf.option3}" class="form-control" required autofocus>
            </div>
        </div>


            
        <button class="btn btn-primary btn-lg btn-block" type="submit">Editare</button>
    </form>

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


