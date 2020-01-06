<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Matriculation">

    <style>
        input::-webkit-outer-spin-button,
        input::-webkit-inner-spin-button {
            /* display: none; <- Crashes Chrome on hover */
            -webkit-appearance: none;
            margin: 0; /* <-- Apparently some margin are still there even though it's hidden */
        }

        input[type=number] {
            -moz-appearance:textfield; /* Firefox */
        }
    </style>
    <div class='container'>
        <div class="row mt-3">
            <div class="col-md text-left">
                UNIVERSITATEA „LUCIAN BLAGA” DIN SIBIU
            </div>
            <div class="col-md text-right">
                STUDII UNIVERSITARE DE <strong>LICENŢĂ – ID / FR</strong>
            </div>
        </div>
        <div class="row">
            <div class="col-md text-left">
                <strong>FACULTATEA DE INGINERIE</strong>
            </div>
        </div>
        <div class="row mt-4">
            <div class="col-md text-center">
                <strong>FIŞA DE ÎNSCRIERE</strong>
            </div>
        </div>
        <div class="row">
            <div class="col-md text-center">
                concursul de admitere sesiunea IULIE / SEPTEMBRIE 2020
            </div>
        </div>



        <form class="form-matriculation" method="POST" action="${pageContext.request.contextPath}/AddRegistrationFormToPortfolio">
            <h5>Datele personale:</h5>
            <hr>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputLastNameAtBirth" class="mt-2">Numele de familie la naştere:</label>

                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="lastNameAtBirth" name="lastNameAtBirth" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputLastName" class="mt-2" title="Se completează doar dacă este diferit de numele de familie la naștere">Numele de familie actual:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="lastName" name="lastName" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputFirstName" class="mt-2">Prenume:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="firstName" name="firstName" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputdadFirstName" class="mt-2">Prenume tata:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="dadFirstName" name="dadFirstName" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputmomFirstName" class="mt-2">Prenume mama:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="momFirstName" name="momFirstName" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPid" class="mt-2">CNP:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="number" id="pid" name="pid" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputBirthday" class="mt-2">Data nasterii:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="date" id="birthday" name="birthday" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCivilStatus" class="mt-2">Starea civila:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <select class="form-control" id="civilStatus" name="civilStatus">
                        <option value="casatorit">Casatorit</option>    
                        <option value="necasatorit">Necasatorit</option>
                    </select>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputSpecialSocialSituation" class="mt-2" title="Se completează numai de persoanele aflate în această situație, pe bază de documente doveditoare.">Situație socială specială:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <select class="form-control" id="specialSocialSituation" name="specialSocialSituation">
                        <option value="none">Niciuna</option>
                        <option value="orfan1">Orfan de un părinte</option>    
                        <option value="orfan2">Orfan de ambii părinți</option>
                        <option value="provenit1">Provenit din case de copii</option>
                        <option value="preovenit2">Provenit din familie monoparentală</option>
                    </select>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCitizenship" class="mt-2">Cetatenia:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="citizenship" name="citizenship" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputEthnicity" class="mt-2">Etnia:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="ethnicity" name="ethnicity" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-6">
                    <label for="inputDisability" class="mt-2" title="Se completează numai de către persoanele aflate în această situaţie, pe bază de documente doveditoare:"/>Candidat care care se încadrează în categoria persoanelor cu dizabilităţi:</label>
                </div>
                <div class="col-md-2 mr-3 text-left">
                    <select class="form-control" id="disability" name="disability">
                        <option value="da">Da</option>
                        <option value="nu">Nu</option>
                    </select>
                </div>
            </div>
            <h5 class="mt-5">Locul naşterii:</h5>     
            <hr>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCountry" class="mt-2">Tara:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="placeOfBirthCountry" name="placeOfBirthCountry" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCounty" class="mt-2">Judetul:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="placeOfBirthCounty" name="placeOfBirthCounty" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCity" class="mt-2">Localitatea:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="placeOfBirthCity" name="placeOfBirthCity" class="form-control" required autofocus>
                </div>
            </div>
            <h5 class="mt-5">Domiciliul stabilit:</h5>     
            <hr>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCountry" class="mt-2">Tara:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="homeAddressCountry" name="homeAddressCountry" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCounty" class="mt-2">Judetul:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="homeAddressCounty" name="homeAddressCounty" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCity" class="mt-2">Localitatea:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="homeAddressCity" name="homeAddressCity" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCity" class="mt-2">Adresa:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="homeAddressStrNrFlAp" name="homeAddressStrNrFlAp" placeholder="Strada, nr. bloc, scară, etaj, apartament" class="form-control" required autofocus>
                </div>
            </div>

            <h5 class="mt-5">Date de contact ale candidatului:</h5>     
            <hr>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPhoneNumber" class="mt-2">Telefon:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="number" id="contactPhoneNumber" name="contactPhoneNumber" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputParentPhoneNumber" class="mt-2">Telefonul mamei/tatei:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="number" id="contactParentPhoneNumber" name="contactParentPhoneNumber" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputMail" class="mt-2">Adresa e-mail:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="email" id="contactEmail" name="contactEmail" class="form-control" required autofocus>
                </div>
            </div>
            <h5 class="mt-5">Act de identitate C.I. / pașaport:</h5>     
            <hr>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCardSeries" class="mt-2">Seria:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="idCardSeries" name="idCardSeries" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCardNumber" class="mt-2">Numar:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="number" id="idCardNumber" name="idCardNumber" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCardReleasedBy" class="mt-2">Eliberat de:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="idCardReleasedBy" name="idCardReleasedBy" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCardReleaseDate" class="mt-2">Eliberat la data:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="date" id="idCardReleaseDate" name="idCardReleaseDate" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCardExpiryDate" class="mt-2">Expira la data:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="date" id="idCardExpiryDate" name="idCardExpiryDate" class="form-control" required autofocus>
                </div>
            </div>
            <h5 class="mt-5">Studiile preuniversitare absolvite, nivel liceu:</h5>     
            <hr>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputCountry" class="mt-2">Instituţia unde a absolvit:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="preuniversitarStudiesInstitution" name="preuniversitarStudiesInstitution" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPreuniversitarStudiesCountry" class="mt-2">Țara:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="preuniversitarStudiesCountry" name="preuniversitarStudiesCountry" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPreuniversitarStudiesCounty" class="mt-2">Județul:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="preuniversitarStudiesCounty" name="preuniversitarStudiesCounty" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPreuniversitarStudiesCity" class="mt-2">Localitatea:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="preuniversitarStudiesCity" name="preuniversitarStudiesCity" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPreuniversitarStudiesDomain" class="mt-2">Profilul/Domeniul:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="preuniversitarStudiesDomain" name="preuniversitarStudiesDomain" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPreuniversitarStudiesLength" class="mt-2">Durata studiilor:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="number" id="preuniversitarStudiesLength" name="preuniversitarStudiesLength" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPreuniversitarStudiesGraduationYear" class="mt-2">Anul absolvirii:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="number" id="preuniversitarStudiesGraduationYear" name="preuniversitarStudiesGraduationYear" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputPreuniversitarStudiesType" class="mt-2">Forma de învățământ:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <select class="form-control" id="preuniversitarStudiesType" name="preuniversitarStudiesType">
                        <option value="zi">Zi</option>
                        <option value="seral">Seral</option>
                        <option value="distanta">Invatamant la distanta</option>
                    </select>
                </div>
            </div>
            <h5 class="mt-5">Datele de identificare ale diplomei de bacalaureat/adeverinței de absolvire:</h5>     
            <hr>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputBacDiplomaSeries" class="mt-2">Seria:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="bacDiplomaSeries" name="bacDiplomaSeries" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputBacDiplomaNumber" class="mt-2">Numarul:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="bacDiplomaNumber" name="bacDiplomaNumber" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputBacDiplomaReleasedBy" class="mt-2">Emisa de:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="bacDiplomaReleasedBy" name="bacDiplomaReleasedBy" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputBacDiplomaReleaseDateYear" class="mt-2">Anul emiterii:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="number" id="bacDiplomaReleaseDateYear" name="bacDiplomaReleaseDateYear" class="form-control" required autofocus>
                </div>
            </div>
            <hr>

            <div class="row mb-2">
                <div class="col-md">
                    <label for="inputRemarks" class="mt-2" title="Vizarea/Recunoaşterea diplomei prezentate DGRIE - acorduri bilaterale/DGIS și CNRED/ Nr./seria act
                           de recunoaştere/echivalare (eliberat de DGRIE/ DGIS și CNRED)">Alte observaţii (pentru cazurile în care candidatul a absolvit studii anterioare în străinătate):</label>
                    <textarea name="remarks" id="remarks" rows="4" cols="116" placeholder="Vizarea/Recunoaşterea diplomei prezentate DGRIE - acorduri bilaterale/DGIS și CNRED/ Nr./seria act
                              de recunoaştere/echivalare (eliberat de DGRIE/ DGIS și CNRED)" ></textarea>
                </div>
            </div>

            <h5>Programele de studii universitare de licență pentru care optez (în ordinea preferințelor):</h5>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputOption1" class="mt-2">Optiunea 1:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="option1" name="option1" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputOption2" class="mt-2">Optiunea 2:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="option2" name="option2" class="form-control" required autofocus>
                </div>
            </div>
            <div class="row mb-2">
                <div class="col-md-3">
                    <label for="inputOption3" class="mt-2">Optiunea 3:</label>
                </div>
                <div class="col-md mr-3 text-left">
                    <input type="text" id="option3" name="option3" class="form-control" required autofocus>
                </div>
            </div>


            <button class="btn btn-lg btn-primary btn-block col-md-2 mt-4 mb-3 mx-auto" type="submit">Inscrie-te</button>


        </form>
    </div>
</t:pageTemplate>