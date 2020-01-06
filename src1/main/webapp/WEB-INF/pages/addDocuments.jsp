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
    
    
    <form method="POST" action="${pageContext.request.contextPath}/AddPhotosToPortfolio" enctype="multipart/form-data">
    <h5>Poze:</h5>
        <hr>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPozaBac" class="mt-2">Diploma de Bacalaureat:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type="file" id="diplomaBac" name="diplomaBac" class="form-control" required autofocus>
                <div class="invalid-feedback">
                    Photo is required!
                </div>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputPozaCertificatNastere" class="mt-2">Certificat de nastere:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type="file" id="certificatNastere" name="certificatNastere" class="form-control" required autofocus>
                <div class="invalid-feedback">
                    Photo is required!
                </div>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputAdeverintaMedicala" class="mt-2">Adeverinta medicala:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type="file" id="adeverintaMedicala" name="adeverintaMedicala" class="form-control" required autofocus>
                <div class="invalid-feedback">
                    Photo is required!
                </div>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputFotografieProfil" class="mt-2">Poza de profil:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type="file" id="fotografieProfil" name="fotografieProfil" class="form-control" required autofocus>
                <div class="invalid-feedback">
                    Photo is required!
                </div>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputCarteIdentitate" class="mt-2">Carte de identitate:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type="file" id="carteIdentitate" name="carteIdentitate" class="form-control" required autofocus>
                <div class="invalid-feedback">
                    Photo is required!
                </div>
            </div>
        </div>
        <div class="row mb-2">
            <div class="col-md-3">
                <label for="inputchitantaPlata" class="mt-2">Chitanta plata:</label>
            </div>
            <div class="col-md mr-3 text-left">
                <input type="file" id="chitantaPlata" name="chitantaPlata" class="form-control" required autofocus>
                <div class="invalid-feedback">
                    Photo is required!
                </div>
            </div>
        </div>
    
        <button class="btn btn-primary btn-lg btn-block" type="submit" >Save</button>
    
    </form>
</t:pageTemplate>
    
    