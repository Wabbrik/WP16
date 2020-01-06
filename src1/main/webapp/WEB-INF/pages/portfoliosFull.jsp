<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Portfolios">

    <h1>Validare Dosar</h1>

    <form class="form-matriculation" method="POST" action="${pageContext.request.contextPath}/Portfolios/Validate">
        <h5>Datele personale:</h5>
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputLastNameAtBirth" class="mt-2">Numele de familie la nastere:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.lastNameAtBirth}
                <input type="hidden" name="rfId" value="${rf.id}">
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputLastName" class="mt-2" title="Se completeaza doar daca este diferit de numele de familie la na?tere">Numele de familie actual:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.lastName}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputFirstName" class="mt-2">Prenume:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.firstName}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputdadFirstName" class="mt-2">Prenume tata:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.dadFirstName}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputmomFirstName" class="mt-2">Prenume mama:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.momFirstName}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPid" class="mt-2">CNP:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.pid}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBirthday" class="mt-2">Data nasterii:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.birthdate}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCivilStatus" class="mt-2">Starea civila:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.civilStatus}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputSpecialSocialSituation" class="mt-2" title="Se completeaza numai de persoanele aflate în aceasta situa?ie, pe baza de documente doveditoare.">Situa?ie sociala speciala:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.specialSocialSituation}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCitizenship" class="mt-2">Cetatenia:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.citizenship}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputEthnicity" class="mt-2">Etnia:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.ethnicity}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-6">
                <label for="inputDisability" class="mt-2" title="Se completeaza numai de catre persoanele aflate în aceasta situatie, pe baza de documente doveditoare:"/>Candidat care care se încadreaza în categoria persoanelor cu dizabilitati:</label>
            </div>
            <div class="col-md-2 mr-3 text-left">
                ${rf.disability}
            </div>
        </div>
        <h5 class="mt-5">Locul nasterii:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCountry" class="mt-2">Tara:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.placeOfBirthCountry}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCounty" class="mt-2">Judetul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.placeOfBirthCounty}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCity" class="mt-2">Localitatea:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.placeOfBirthCity}
            </div>
        </div>
        <h5 class="mt-5">Domiciliul stabilit:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCountry" class="mt-2">Tara:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.homeAddressCountry}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCounty" class="mt-2">Judetul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.homeAddressCounty}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCity" class="mt-2">Localitatea:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.homeAddressCounty}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCity" class="mt-2">Adresa:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.homeAddressStrNrFlAp}
            </div>
        </div>

        <h5 class="mt-5">Date de contact ale candidatului:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPhoneNumber" class="mt-2">Telefon:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.contactPhoneNumber}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputParentPhoneNumber" class="mt-2">Telefonul mamei/tatei:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.contactParentPhoneNumber}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputMail" class="mt-2">Adresa e-mail:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.contactEmail}
            </div>
        </div>
        <h5 class="mt-5">Act de identitate C.I. / pa?aport:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardSeries" class="mt-2">Seria:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.idCardSeries}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardNumber" class="mt-2">Numar:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.idCardNumber}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardReleasedBy" class="mt-2">Eliberat de:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.idCardReleasedBy}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardReleaseDate" class="mt-2">Eliberat la data:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.idCardReleaseDate}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCardExpiryDate" class="mt-2">Expira la data:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.idCardExpiryDate}
            </div>
        </div>
        <h5 class="mt-5">Studiile preuniversitare absolvite, nivel liceu:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCountry" class="mt-2">Institutia unde a absolvit:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.preuniversitarStudiesInstitution}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesCountry" class="mt-2">?ara:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.preuniversitarStudiesCountry}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesCounty" class="mt-2">Jude?ul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.preuniversitarStudiesCounty}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesCity" class="mt-2">Localitatea:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.preuniversitarStudiesCity}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesDomain" class="mt-2">Profilul/Domeniul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.preuniversitarStudiesDomain}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesLength" class="mt-2">Durata studiilor:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.preuniversitarStudiesLength}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesGraduationYear" class="mt-2">Anul absolvirii:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.preuniversitarStudiesGraduationYear}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPreuniversitarStudiesType" class="mt-2">Forma de înva?amânt:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.preuniversitarStudiesType}
            </div>
        </div>
        <h5 class="mt-5">Datele de identificare ale diplomei de bacalaureat/adeverin?ei de absolvire:</h5>     
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBacDiplomaSeries" class="mt-2">Seria:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.bacDiplomaSeries}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBacDiplomaNumber" class="mt-2">Numarul:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.bacDiplomaNumber}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBacDiplomaReleasedBy" class="mt-2">Emisa de:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.bacDiplomaReleasedBy}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputBacDiplomaReleaseDateYear" class="mt-2">Anul emiterii:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.bacDiplomaReleaseDateYear}
            </div>
        </div>
        <hr>

        <div class="row mb-2">
            <div class="col-md">
                <label for="inputRemarks" class="mt-2" title="Vizarea/Recunoasterea diplomei prezentate DGRIE - acorduri bilaterale/DGIS ?i CNRED/ Nr./seria act
                       de recunoastere/echivalare (eliberat de DGRIE/ DGIS ?i CNRED)">Alte observatii (pentru cazurile în care candidatul a absolvit studii anterioare în strainatate):</label>
                ${rf.remarks}
            </div>
        </div>

        <h5>Programele de studii universitare de licen?a pentru care optez (în ordinea preferin?elor):</h5>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputOption1" class="mt-2">Optiunea 1:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.option1}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputOption2" class="mt-2">Optiunea 2:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.option2}
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputOption3" class="mt-2">Optiunea 3:</label>
            </div>
            <div class="col-md mr-3 text-left">
                ${rf.option3}
            </div>
        </div>
            
            <h5>Poze:</h5>
            <hr>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPozaBac" class="mt-2">Diploma de Bacalaureat:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <img src="${pageContext.request.contextPath}/Portfolios/Photos?id=${idPozaBac}" width="48"/>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPozaCertificatNastere" class="mt-2">Certificat de nastere:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <img src="${pageContext.request.contextPath}/Portfolios/Photos?id=${idPozaCertificatNastere}" width="48"/>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputAdeverintaMedicala" class="mt-2">Adeverinta medicala:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <img src="${pageContext.request.contextPath}/Portfolios/Photos?id=${idPozaAdeverintaMedicala}" width="48"/>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputFotografieProfil" class="mt-2">Poza de profil:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <img src="${pageContext.request.contextPath}/Portfolios/Photos?id=${idPozaProfil}" width="48"/>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCarteIdentitate" class="mt-2">Carte de identitate:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <img src="${pageContext.request.contextPath}/Portfolios/Photos?id=${idPozaCarteIdentitate}" width="48"/>     
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputchitantaPlata" class="mt-2">Chitanta plata:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <img src="${pageContext.request.contextPath}/Portfolios/Photos?id=${idPozaChitantaPlata}" width="48"/>    
                </div>
            </div>
            
       

                    <c:if test="${ascundeValidate=='nu'}">
        <button class="btn btn-primary btn-lg btn-block" type="submit">Validare</button>
                    </c:if>
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

