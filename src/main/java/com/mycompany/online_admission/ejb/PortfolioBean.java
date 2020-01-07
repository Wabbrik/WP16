/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_admission.ejb;

import com.mycompany.online_admission.common.PhotoDetails;
import com.mycompany.online_admission.common.PortfolioDetails;
import com.mycompany.online_admission.common.RegistrationFormDetails;
import com.mycompany.online_admission.entity.Photo;
import com.mycompany.online_admission.entity.Portfolio;
import com.mycompany.online_admission.entity.RegistrationForm;
import com.mycompany.online_admission.entity.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class PortfolioBean {

    private static final Logger LOG = Logger.getLogger(PortfolioBean.class.getName());
    @PersistenceContext
    private EntityManager em;

    public List<PhotoDetails> getPhotosByPortfolioId(Integer portfolioId) {
        LOG.info("getPhotosByPortfolioId");
        try {
            TypedQuery<Photo> typedQuery = em.createQuery("select p from Photo p where p.portfolio.id=:id", Photo.class)
                    .setParameter("id", portfolioId);
            List<Photo> photos = typedQuery.getResultList();
            if (photos.isEmpty()) {
                return null;
            }
            List<PhotoDetails> photoDetails = new ArrayList<PhotoDetails>();
            for (Photo p : photos) {
                photoDetails.add(new PhotoDetails(p.getId(), p.getFilename(), p.getFileType(), p.getFileContent()));
            }
            return photoDetails;
        } catch (Exception ex) {
            EJBException(ex);
        }
        return null;

    }

    public RegistrationFormDetails getRegistrationFormByPortfolioId(Integer portfolioId) {
        LOG.info("getRegistrationFormByPortfolioId");
        try {
            TypedQuery<RegistrationForm> typedQuery = em.createQuery("select r from RegistrationForm r where r.portfolio.id=:id", RegistrationForm.class)
                    .setParameter("id", portfolioId);
            RegistrationForm rf = typedQuery.getSingleResult();

            return new RegistrationFormDetails(rf.getId(), rf.getLastNameAtBirth(), rf.getLastName(), rf.getFirstName(), rf.getDadFirstName(), rf.getMomFirstName(), rf.getPid(), rf.getBirthdate(), rf.getPlaceOfBirthCountry(), rf.getPlaceOfBirthCounty(), rf.getPlaceOfBirthCity(), rf.getCivilStatus(), rf.getSpecialSocialSituation(), rf.getCitizenship(), rf.getEthnicity(), rf.getHomeAddressCountry(), rf.getHomeAddressCounty(), rf.getHomeAddressCity(), rf.getHomeAddressStrNrFlAp(), rf.getIdCardSeries(), rf.getIdCardNumber(), rf.getIdCardReleasedBy(), rf.getIdCardReleaseDate(), rf.getIdCardExpiryDate(), rf.getContactPhoneNumber(), rf.getContactParentPhoneNumber(), rf.getContactEmail(), rf.getDisability(), rf.getPreuniversitarStudiesInstitution(), rf.getPreuniversitarStudiesCountry(), rf.getPreuniversitarStudiesCounty(), rf.getPreuniversitarStudiesCity(), rf.getPreuniversitarStudiesDomain(), rf.getPreuniversitarStudiesLength(), rf.getPreuniversitarStudiesGraduationYear(), rf.getPreuniversitarStudiesType(), rf.getBacDiplomaSeries(), rf.getBacDiplomaNumber(), rf.getBacDiplomaReleasedBy(), rf.getBacDiplomaReleaseDateYear(), rf.getRemarks(), rf.getOption1(), rf.getOption2(), rf.getOption3());
        } catch (Exception ex) {
            EJBException(ex);

        }
        return null;

    }

    public Set<Integer> getValidPortfolioIdsList() {
        LOG.info("getValidPortfolioIdsList");
        TypedQuery<Integer> tq = em.createQuery("SELECT p.id from Portfolio p WHERE p.validity= :isValid", Integer.class).setParameter("isValid", "VALID");
        List<Integer> validPortfolioIds = tq.getResultList();
        Set<Integer> ids = new HashSet<>();
        for (Integer id : validPortfolioIds) {
            ids.add(id);
        }
        return ids;
    }

    public void addPhotoToPortfolio(Integer portfolioId, String filename, String fileType, byte[] fileContent) {
        LOG.info("addPhotoToPortfolio");
        Photo photo = new Photo();
        //photo.setId(portfolioId);
        photo.setFilename(filename);
        photo.setFileType(fileType);
        photo.setFileContent(fileContent);
        Portfolio portfolio = em.find(Portfolio.class, portfolioId);
        portfolio.getPhotos().add(photo);
        portfolio.setHasPhotos("YES");
        photo.setPortfolio(portfolio);
        em.persist(photo);

    }

    public void addRegistrationFormToPortfolio(Integer portfolioId, String lastNameAtBirth, String lastName, String firstName, String dadFirstName, String momFirstName, String pid, String birthdate, String placeOfBirthCountry, String placeOfBirthCounty, String placeOfBirthCity, String civilStatus, String specialSocialSituation, String citizenship, String ethnicity, String homeAddressCountry, String homeAddressCounty, String homeAddressCity, String homeAddressStrNrFlAp, String idCardSeries, String idCardNumber, String idCardReleasedBy, String idCardReleaseDate, String idCardExpiryDate, String contactPhoneNumber, String contactParentPhoneNumber, String contactEmail, String disability, String preuniversitarStudiesInstitution, String preuniversitarStudiesCountry, String preuniversitarStudiesCounty, String preuniversitarStudiesCity, String preuniversitarStudiesDomain, String preuniversitarStudiesLength, String preuniversitarStudiesGraduationYear, String preuniversitarStudiesType, String bacDiplomaSeries, String bacDiplomaNumber, String bacDiplomaReleasedBy, String bacDiplomaReleaseDateYear, String remarks, String option1, String option2, String option3) {
        LOG.info("addRegistrationFormToPortfolio");
        RegistrationForm rf = new RegistrationForm();
        //rf.setId(portfolioId);
        rf.setLastNameAtBirth(lastNameAtBirth);
        rf.setLastName(lastName);
        rf.setFirstName(firstName);
        rf.setDadFirstName(dadFirstName);
        rf.setMomFirstName(momFirstName);
        rf.setPid(pid);
        rf.setBirthdate(birthdate);
        rf.setPlaceOfBirthCountry(placeOfBirthCountry);
        rf.setPlaceOfBirthCounty(placeOfBirthCounty);
        rf.setPlaceOfBirthCity(placeOfBirthCity);
        rf.setCivilStatus(civilStatus);
        rf.setSpecialSocialSituation(specialSocialSituation);
        rf.setCitizenship(citizenship);
        rf.setEthnicity(ethnicity);
        rf.setHomeAddressCountry(homeAddressCountry);
        rf.setHomeAddressCounty(homeAddressCounty);
        rf.setHomeAddressCity(homeAddressCity);
        rf.setHomeAddressStrNrFlAp(homeAddressStrNrFlAp);
        rf.setIdCardSeries(idCardSeries);
        rf.setIdCardNumber(idCardNumber);
        rf.setIdCardReleasedBy(idCardReleasedBy);
        rf.setIdCardReleaseDate(idCardReleaseDate);
        rf.setIdCardExpiryDate(idCardExpiryDate);
        rf.setContactPhoneNumber(contactPhoneNumber);
        rf.setContactParentPhoneNumber(contactParentPhoneNumber);
        rf.setContactEmail(contactEmail);
        rf.setDisability(disability);
        rf.setPreuniversitarStudiesInstitution(preuniversitarStudiesInstitution);
        rf.setPreuniversitarStudiesCountry(preuniversitarStudiesCountry);
        rf.setPreuniversitarStudiesCounty(preuniversitarStudiesCounty);
        rf.setPreuniversitarStudiesCity(preuniversitarStudiesCity);
        rf.setPreuniversitarStudiesDomain(preuniversitarStudiesDomain);
        rf.setPreuniversitarStudiesLength(preuniversitarStudiesLength);
        rf.setPreuniversitarStudiesGraduationYear(preuniversitarStudiesGraduationYear);
        rf.setPreuniversitarStudiesType(preuniversitarStudiesType);
        rf.setBacDiplomaSeries(bacDiplomaSeries);
        rf.setBacDiplomaNumber(bacDiplomaNumber);
        rf.setBacDiplomaReleasedBy(bacDiplomaReleasedBy);
        rf.setBacDiplomaReleaseDateYear(bacDiplomaReleaseDateYear);
        rf.setRemarks(remarks);
        rf.setOption1(option1);
        rf.setOption2(option2);
        rf.setOption3(option3);
        Portfolio portfolio = em.find(Portfolio.class, portfolioId);
        portfolio.setRegistrationForm(rf);
        portfolio.setHasRegistrationForm("YES");
        rf.setPortfolio(portfolio);
        em.persist(rf);
    }

    public boolean hasUserAlreadySubmittedRegistrationForm(Integer userId) {
        LOG.info("hasUserAlreadySubmittedRegistrationForm");
        PortfolioDetails portfolio = getPortfolioByUserId(userId);
        if (portfolio.getHasRegistrationForm().equals("NO")) {
            return false;
        }
        return true;
    }

    public boolean hasUserAlreadySubmittedPhotos(Integer userId) {
        LOG.info("hasUserAlreadySubmittedPhotos");
        PortfolioDetails portfolio = getPortfolioByUserId(userId);
        if (portfolio.getHasPhotos().equals("NO")) {
            return false;
        }
        return true;
    }

    public void createPortfolio(String validity, Integer userId) {
        LOG.info("createPortfolio");
        Portfolio portfolio = new Portfolio();
        portfolio.setValidity(validity);
        portfolio.setHasRegistrationForm("NO");
        portfolio.setHasPhotos("NO");
        User user = em.find(User.class, userId);
        user.setPortfolio(portfolio);
        user.setHasPortfolio("YES");
        portfolio.setUser(user);
        em.persist(portfolio);
    }

    public PortfolioDetails getPortfolioByUserId(Integer userId) {
        LOG.info("getPortfolioByUserId");
        try {
            TypedQuery<Portfolio> tQ = em.createQuery("select p from Portfolio p where p.user.id=:id", Portfolio.class).setParameter("id", userId);

            Portfolio p = tQ.getSingleResult();
            PortfolioDetails portfolio = new PortfolioDetails();
            portfolio.setId(p.getId());
            portfolio.setValidity(p.getValidity());
            portfolio.setHasRegistrationForm(p.getHasRegistrationForm());
            portfolio.setHasPhotos(p.getHasPhotos());
            return portfolio;
        } catch (Exception ex) {
            EJBException(ex);
        }
        return null;
    }

    public void updatePortfolioValidityByPortfolioId(Integer portfolioId, String validity) {
        LOG.info("updatePortfolioValidityByPortfolioId");
        Portfolio p = em.find(Portfolio.class, portfolioId);
        //set Validity
        p.setValidity(validity);
        //get the user of the updated portfolio
        User u = p.getUser();
        //set the updated portfolio to the user
        u.setPortfolio(p);
    }

    private void EJBException(Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
