package com.mycompany.online_admission.ejb;

import com.mycompany.online_admission.common.PhotoDetails;
import com.mycompany.online_admission.common.RegistrationFormDetails;
import com.mycompany.online_admission.common.UserDetails;
import com.mycompany.online_admission.entity.Photo;
import com.mycompany.online_admission.entity.Portfolio;
import com.mycompany.online_admission.entity.RegistrationForm;
import com.mycompany.online_admission.entity.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


@Stateless
public class RegistrationFormBean {

    private static final Logger LOG = Logger.getLogger(RegistrationFormBean.class.getName());
    @PersistenceContext 
    private EntityManager em;
    
    
    
    //addRegistrationFormToUser()
    //getRegistrationFormById()
    
    public List<RegistrationFormDetails> getAllRegistrationForms(){
        LOG.info("getAllRegistrationForms");
        List<RegistrationForm> rForms = (List<RegistrationForm>) em.createQuery("SELECT r FROM RegistrationForm r").getResultList();
        return copyRegistrationFormToDetails(rForms);
    }
    private List<RegistrationFormDetails> copyRegistrationFormToDetails(List<RegistrationForm> rfs){
        LOG.info("copyRegistrationFormToDetails");
         List<RegistrationFormDetails> detList = new ArrayList<>();
        for (RegistrationForm rf : rfs){
            RegistrationFormDetails ri =new RegistrationFormDetails(rf.getId(), rf.getLastNameAtBirth(), rf.getLastName(), rf.getFirstName(), rf.getDadFirstName(), rf.getMomFirstName(), rf.getPid(), rf.getBirthdate(), rf.getPlaceOfBirthCountry(), rf.getPlaceOfBirthCounty(), rf.getPlaceOfBirthCity(), rf.getCivilStatus(), rf.getSpecialSocialSituation(), rf.getCitizenship(), rf.getEthnicity(), rf.getHomeAddressCountry(), rf.getHomeAddressCounty(), rf.getHomeAddressCity(), rf.getHomeAddressStrNrFlAp(), rf.getIdCardSeries(), rf.getIdCardNumber(), rf.getIdCardReleasedBy(), rf.getIdCardReleaseDate(), rf.getIdCardExpiryDate(), rf.getContactPhoneNumber(), rf.getContactParentPhoneNumber(), rf.getContactEmail(), rf.getDisability(), rf.getPreuniversitarStudiesInstitution(), rf.getPreuniversitarStudiesCountry(), rf.getPreuniversitarStudiesCounty(), rf.getPreuniversitarStudiesCity(), rf.getPreuniversitarStudiesDomain(), rf.getPreuniversitarStudiesLength(), rf.getPreuniversitarStudiesGraduationYear(), rf.getPreuniversitarStudiesType(), rf.getBacDiplomaSeries(), rf.getBacDiplomaNumber(), rf.getBacDiplomaReleasedBy(), rf.getBacDiplomaReleaseDateYear(), rf.getRemarks(), rf.getOption1(), rf.getOption2(), rf.getOption3());
            detList.add(ri);
        }
        return detList;
    }
    
    public List<RegistrationFormDetails> getAllRegistrationFormsThatBelongToAnInvalidPortfolioByValidPortfolioIdsList(Set<Integer>validPortfolioIds){
        
        if(validPortfolioIds.isEmpty()){
            LOG.info("parametruNul");
            return null;
        }else{LOG.info("getAllRegistrationFormsThatBelongToAnInvalidPortfolio");
        TypedQuery<RegistrationForm>typedQuery=em.createQuery("SELECT r FROM RegistrationForm r WHERE r.portfolio.id NOT IN ?1  ",RegistrationForm.class).
                setParameter(1, validPortfolioIds);
        List<RegistrationForm>registrationForms=typedQuery.getResultList();
        /*List<RegistrationForm>registrationForms=(List<RegistrationForm>)em.createQuery("SELECT r FROM RegistrationForm r WHERE r.portfolio.id NOT IN ?1 ").
                setParameter(1, validPortfolioIds).getResultList();*/
        List<RegistrationFormDetails>rfds=new ArrayList<>();
        for(RegistrationForm rf:registrationForms){
            rfds.add(new RegistrationFormDetails(rf.getId(), rf.getLastNameAtBirth(), rf.getLastName(), rf.getFirstName(), rf.getDadFirstName(), rf.getMomFirstName(), rf.getPid(), rf.getBirthdate(), rf.getPlaceOfBirthCountry(), rf.getPlaceOfBirthCounty(), rf.getPlaceOfBirthCity(), rf.getCivilStatus(), rf.getSpecialSocialSituation(), rf.getCitizenship(), rf.getEthnicity(), rf.getHomeAddressCountry(), rf.getHomeAddressCounty(), rf.getHomeAddressCity(), rf.getHomeAddressStrNrFlAp(), rf.getIdCardSeries(), rf.getIdCardNumber(), rf.getIdCardReleasedBy(), rf.getIdCardReleaseDate(), rf.getIdCardExpiryDate(), rf.getContactPhoneNumber(), rf.getContactParentPhoneNumber(), rf.getContactEmail(), rf.getDisability(), rf.getPreuniversitarStudiesInstitution(), rf.getPreuniversitarStudiesCountry(), rf.getPreuniversitarStudiesCounty(), rf.getPreuniversitarStudiesCity(), rf.getPreuniversitarStudiesDomain(), rf.getPreuniversitarStudiesLength(), rf.getPreuniversitarStudiesGraduationYear(), rf.getPreuniversitarStudiesType(), rf.getBacDiplomaSeries(), rf.getBacDiplomaNumber(), rf.getBacDiplomaReleasedBy(), rf.getBacDiplomaReleaseDateYear(), rf.getRemarks(), rf.getOption1(), rf.getOption2(), rf.getOption3()));
        }
        return rfds;
        }
    }
    
    public List<RegistrationFormDetails> getAllRegistrationFormsThatBelongToAValidPortfolioByValidPortfolioIdsList(Set<Integer>validPortfolioIds){
        LOG.info("getAllRegistrationFormsThatBelongToAValidPortfolio");
        if(validPortfolioIds.isEmpty()){
            LOG.info("parametruNul");
            return null;
        }else{
        List<RegistrationForm>registrationForms=(List<RegistrationForm>)em.createQuery("SELECT r FROM RegistrationForm r WHERE r.portfolio.id IN ?1  ").
                setParameter(1,validPortfolioIds).getResultList();
        List<RegistrationFormDetails>rfds=new ArrayList<>();
        for(RegistrationForm rf:registrationForms){
            rfds.add(new RegistrationFormDetails(rf.getId(), rf.getLastNameAtBirth(), rf.getLastName(), rf.getFirstName(), rf.getDadFirstName(), rf.getMomFirstName(), rf.getPid(), rf.getBirthdate(), rf.getPlaceOfBirthCountry(), rf.getPlaceOfBirthCounty(), rf.getPlaceOfBirthCity(), rf.getCivilStatus(), rf.getSpecialSocialSituation(), rf.getCitizenship(), rf.getEthnicity(), rf.getHomeAddressCountry(), rf.getHomeAddressCounty(), rf.getHomeAddressCity(), rf.getHomeAddressStrNrFlAp(), rf.getIdCardSeries(), rf.getIdCardNumber(), rf.getIdCardReleasedBy(), rf.getIdCardReleaseDate(), rf.getIdCardExpiryDate(), rf.getContactPhoneNumber(), rf.getContactParentPhoneNumber(), rf.getContactEmail(), rf.getDisability(), rf.getPreuniversitarStudiesInstitution(), rf.getPreuniversitarStudiesCountry(), rf.getPreuniversitarStudiesCounty(), rf.getPreuniversitarStudiesCity(), rf.getPreuniversitarStudiesDomain(), rf.getPreuniversitarStudiesLength(), rf.getPreuniversitarStudiesGraduationYear(), rf.getPreuniversitarStudiesType(), rf.getBacDiplomaSeries(), rf.getBacDiplomaNumber(), rf.getBacDiplomaReleasedBy(), rf.getBacDiplomaReleaseDateYear(), rf.getRemarks(), rf.getOption1(), rf.getOption2(), rf.getOption3()));
        }
        return rfds;
        }
    }
    
    
    
    public Integer getPortfolioIdByRegistrationFormId(Integer regFormId) {
        //can be used in conjecture with void addRegistrationFormToPortfolio(...)
        LOG.info("getPortfolioIdByRegistrationFormId");
        TypedQuery<Integer> tQ = em.createQuery("SELECT r.portfolio.id FROM RegistrationForm r WHERE r.id = :id ", Integer.class).setParameter("id", regFormId);
        Integer portfolioId = tQ.getSingleResult();
        //Portfolio id
        return portfolioId;
    }

    public Collection<PhotoDetails> getPhotosByRegistrationFormId(Integer regFormId) {
        //returns a Photo collection
        LOG.info("getPhotosByRegistrationFormId");
        Integer portofolioId = getPortfolioIdByRegistrationFormId(regFormId);
        TypedQuery<Portfolio> tQ = em.createQuery("SELECT p FROM Portfolio p WHERE p.id = :id ", Portfolio.class).setParameter("id", portofolioId);
        Portfolio pf = tQ.getSingleResult();
        Collection<Photo>photos=pf.getPhotos();
        Collection<PhotoDetails>photoDetails=new ArrayList<PhotoDetails>();
        for(Photo p:photos){
            PhotoDetails photo=new PhotoDetails(p.getId(), p.getFilename(), p.getFileType(), p.getFileContent());
            photoDetails.add(photo);
        }
        return photoDetails;
    }

    public List<Integer> getPhotoIdsByRegistrationFormId(Integer regFormId) {
        LOG.info("getPhotoIdsByRegistrationFormId");
        List<PhotoDetails> pList = (List<PhotoDetails>) getPhotosByRegistrationFormId(regFormId);
        List<Integer> retList = new ArrayList<Integer>();
        for (PhotoDetails p : pList) {
            retList.add(p.getId());
        }
        Collections.sort(retList);
        return retList;
    }
    
    public RegistrationFormDetails getRegistrationFormByRegistrationFormId (Integer regFormId){
        LOG.info("getRegistrationFormByRegistrationFormId");
        RegistrationForm rf = (RegistrationForm) em.createQuery("SELECT r FROM RegistrationForm r WHERE r.id= :id",RegistrationForm.class).setParameter("id", regFormId).getSingleResult();
        return new RegistrationFormDetails(rf.getId(), rf.getLastNameAtBirth(), rf.getLastName(), rf.getFirstName(), rf.getDadFirstName(), rf.getMomFirstName(), rf.getPid(), rf.getBirthdate(), rf.getPlaceOfBirthCountry(), rf.getPlaceOfBirthCounty(), rf.getPlaceOfBirthCity(), rf.getCivilStatus(), rf.getSpecialSocialSituation(), rf.getCitizenship(), rf.getEthnicity(), rf.getHomeAddressCountry(), rf.getHomeAddressCounty(), rf.getHomeAddressCity(), rf.getHomeAddressStrNrFlAp(), rf.getIdCardSeries(), rf.getIdCardNumber(), rf.getIdCardReleasedBy(), rf.getIdCardReleaseDate(), rf.getIdCardExpiryDate(), rf.getContactPhoneNumber(), rf.getContactParentPhoneNumber(), rf.getContactEmail(), rf.getDisability(), rf.getPreuniversitarStudiesInstitution(), rf.getPreuniversitarStudiesCountry(), rf.getPreuniversitarStudiesCounty(), rf.getPreuniversitarStudiesCity(), rf.getPreuniversitarStudiesDomain(), rf.getPreuniversitarStudiesLength(), rf.getPreuniversitarStudiesGraduationYear(), rf.getPreuniversitarStudiesType(), rf.getBacDiplomaSeries(), rf.getBacDiplomaNumber(), rf.getBacDiplomaReleasedBy(), rf.getBacDiplomaReleaseDateYear(), rf.getRemarks(), rf.getOption1(), rf.getOption2(), rf.getOption3());
    }
    
    public void updateRegistrationBean(RegistrationFormDetails rDet){
        LOG.info("updateRegistrationForm");
        RegistrationForm rf = em.find(RegistrationForm.class, rDet.getId());
        rf.setLastNameAtBirth(rDet.getLastNameAtBirth());
        rf.setLastName(rDet.getLastName());
        rf.setFirstName(rDet.getFirstName());
        rf.setDadFirstName(rDet.getDadFirstName());
        rf.setMomFirstName(rDet.getMomFirstName());
        rf.setPid(rDet.getPid());
        rf.setBirthdate(rDet.getBirthdate());
        rf.setPlaceOfBirthCountry(rDet.getPlaceOfBirthCountry());
        rf.setPlaceOfBirthCounty(rDet.getPlaceOfBirthCounty());
        rf.setPlaceOfBirthCity(rDet.getPlaceOfBirthCity());
        rf.setCivilStatus(rDet.getCivilStatus());
        rf.setSpecialSocialSituation(rDet.getSpecialSocialSituation());
        rf.setCitizenship(rDet.getCitizenship());
        rf.setEthnicity(rDet.getEthnicity());
        rf.setHomeAddressCountry(rDet.getHomeAddressCountry());
        rf.setHomeAddressCounty(rDet.getHomeAddressCounty());
        rf.setHomeAddressCity(rDet.getHomeAddressCity());
        rf.setHomeAddressStrNrFlAp(rDet.getHomeAddressStrNrFlAp());
        rf.setIdCardSeries(rDet.getIdCardSeries());
        rf.setIdCardNumber(rDet.getIdCardNumber());
        rf.setIdCardReleasedBy(rDet.getIdCardReleasedBy());
        rf.setIdCardReleaseDate(rDet.getIdCardReleaseDate());
        rf.setIdCardExpiryDate(rDet.getIdCardExpiryDate());
        rf.setContactPhoneNumber(rDet.getContactPhoneNumber());
        rf.setContactParentPhoneNumber(rDet.getContactParentPhoneNumber());
        rf.setContactEmail(rDet.getContactEmail());
        rf.setDisability(rDet.getDisability());
        rf.setPreuniversitarStudiesInstitution(rDet.getPreuniversitarStudiesInstitution());
        rf.setPreuniversitarStudiesCountry(rDet.getPreuniversitarStudiesCountry());
        rf.setPreuniversitarStudiesCounty(rDet.getPreuniversitarStudiesCounty());
        rf.setPreuniversitarStudiesCity(rDet.getPreuniversitarStudiesCity());
        rf.setPreuniversitarStudiesDomain(rDet.getPreuniversitarStudiesDomain());
        rf.setPreuniversitarStudiesLength(rDet.getPreuniversitarStudiesLength());
        rf.setPreuniversitarStudiesGraduationYear(rDet.getPreuniversitarStudiesGraduationYear());
        rf.setPreuniversitarStudiesType(rDet.getPreuniversitarStudiesType());
        rf.setBacDiplomaSeries(rDet.getBacDiplomaSeries());
        rf.setBacDiplomaNumber(rDet.getBacDiplomaNumber());
        rf.setBacDiplomaReleasedBy(rDet.getBacDiplomaReleasedBy());
        rf.setBacDiplomaReleaseDateYear(rDet.getBacDiplomaReleaseDateYear());
        rf.setRemarks(rDet.getRemarks());
        rf.setOption1(rDet.getOption1());
        rf.setOption2(rDet.getOption2());
        rf.setOption3(rDet.getOption3());
        Portfolio p = em.find(Portfolio.class, rf.getPortfolio().getId());
        p.setRegistrationForm(rf);
        User u = p.getUser();
        
        u.setPortfolio(p);
        
    
    }
    

    private void EJBException(Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
