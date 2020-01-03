/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_admission.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class RegistrationForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String lastNameAtBirth;
    private String lastName;
    private String firstName;
    private char dadFirstNameInitial;
    private char momFirstNameIntitial;
    private String pid;
    private String birthdateYear;
    private String birthdateMonth;
    private String birthdateDay;
    private String placeOfBirthCountry;
    private String placeOfBirthCounty;
    private String placeOfBirthCity;
    private String civilStatus;
    private String specialSocialSituation;
    private String citizenship;
    private String ethnicity;
    private String homeAddressCountry;
    private String homeAddressCounty;
    private String homeAddressCity;
    private String homeAddressStrNrFlAp;
    private String idCardSeries;
    private String idCardNumber;
    private String idCardReleasedBy;
    private String idCardReleaseDate;
    private String idCardExpiryDate;
    private String address;
    private String contactPhoneNumber;
    private String contactParentPhoneNumber;
    private String contactEmail;
    private String disability;
    private String preuniversitarStudiesCountry;
    private String preuniversitarStudiesCounty;
    private String preuniversitarStudiesCity;
    private String preuniversitarStudiesDomain;
    private String preuniversitarStudiesLength;
    private String preuniversitarStudiesGraduationYear;
    private String preuniversitarStudiesType;
    private String graduationDiplomaSeries;
    private String graduationDiplomaNumber;
    private String graduationDiplomaReleasedBy;
    private String graduationDiplomaReleaseDateYear;
    private String bacDiplomaSeries;
    private String bacDiplomaNumber;
    private String bacDiplomaReleasedBy;
    private String bacDiplomaReleaseDateYear;
    private String remarks;
    private String[] options;//domeniu studii/specializare,maxim 34
    
    @OneToOne
    @JoinColumn(name="PORTFOLIO_KEY")
    private Portfolio portfolio;

    public String getLastNameAtBirth() {
        return lastNameAtBirth;
    }

    public void setLastNameAtBirth(String lastNameAtBirth) {
        this.lastNameAtBirth = lastNameAtBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getDadFirstNameInitial() {
        return dadFirstNameInitial;
    }

    public void setDadFirstNameInitial(char dadFirstNameInitial) {
        this.dadFirstNameInitial = dadFirstNameInitial;
    }

    public char getMomFirstNameIntitial() {
        return momFirstNameIntitial;
    }

    public void setMomFirstNameIntitial(char momFirstNameIntitial) {
        this.momFirstNameIntitial = momFirstNameIntitial;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getBirthdateYear() {
        return birthdateYear;
    }

    public void setBirthdateYear(String birthdateYear) {
        this.birthdateYear = birthdateYear;
    }

    public String getBirthdateMonth() {
        return birthdateMonth;
    }

    public void setBirthdateMonth(String birthdateMonth) {
        this.birthdateMonth = birthdateMonth;
    }

    public String getBirthdateDay() {
        return birthdateDay;
    }

    public void setBirthdateDay(String birthdateDay) {
        this.birthdateDay = birthdateDay;
    }

    public String getPlaceOfBirthCountry() {
        return placeOfBirthCountry;
    }

    public void setPlaceOfBirthCountry(String placeOfBirthCountry) {
        this.placeOfBirthCountry = placeOfBirthCountry;
    }

    public String getPlaceOfBirthCounty() {
        return placeOfBirthCounty;
    }

    public void setPlaceOfBirthCounty(String placeOfBirthCounty) {
        this.placeOfBirthCounty = placeOfBirthCounty;
    }

    public String getPlaceOfBirthCity() {
        return placeOfBirthCity;
    }

    public void setPlaceOfBirthCity(String placeOfBirthCity) {
        this.placeOfBirthCity = placeOfBirthCity;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getSpecialSocialSituation() {
        return specialSocialSituation;
    }

    public void setSpecialSocialSituation(String specialSocialSituation) {
        this.specialSocialSituation = specialSocialSituation;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getHomeAddressCountry() {
        return homeAddressCountry;
    }

    public void setHomeAddressCountry(String homeAddressCountry) {
        this.homeAddressCountry = homeAddressCountry;
    }

    public String getHomeAddressCounty() {
        return homeAddressCounty;
    }

    public void setHomeAddressCounty(String homeAddressCounty) {
        this.homeAddressCounty = homeAddressCounty;
    }

    public String getHomeAddressCity() {
        return homeAddressCity;
    }

    public void setHomeAddressCity(String homeAddressCity) {
        this.homeAddressCity = homeAddressCity;
    }

    public String getHomeAddressStrNrFlAp() {
        return homeAddressStrNrFlAp;
    }

    public void setHomeAddressStrNrFlAp(String homeAddressStrNrFlAp) {
        this.homeAddressStrNrFlAp = homeAddressStrNrFlAp;
    }

    public String getIdCardSeries() {
        return idCardSeries;
    }

    public void setIdCardSeries(String idCardSeries) {
        this.idCardSeries = idCardSeries;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getIdCardReleasedBy() {
        return idCardReleasedBy;
    }

    public void setIdCardReleasedBy(String idCardReleasedBy) {
        this.idCardReleasedBy = idCardReleasedBy;
    }

    public String getIdCardReleaseDate() {
        return idCardReleaseDate;
    }

    public void setIdCardReleaseDate(String idCardReleaseDate) {
        this.idCardReleaseDate = idCardReleaseDate;
    }

    public String getIdCardExpiryDate() {
        return idCardExpiryDate;
    }

    public void setIdCardExpiryDate(String idCardExpiryDate) {
        this.idCardExpiryDate = idCardExpiryDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactParentPhoneNumber() {
        return contactParentPhoneNumber;
    }

    public void setContactParentPhoneNumber(String contactParentPhoneNumber) {
        this.contactParentPhoneNumber = contactParentPhoneNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getPreuniversitarStudiesCountry() {
        return preuniversitarStudiesCountry;
    }

    public void setPreuniversitarStudiesCountry(String preuniversitarStudiesCountry) {
        this.preuniversitarStudiesCountry = preuniversitarStudiesCountry;
    }

    public String getPreuniversitarStudiesCounty() {
        return preuniversitarStudiesCounty;
    }

    public void setPreuniversitarStudiesCounty(String preuniversitarStudiesCounty) {
        this.preuniversitarStudiesCounty = preuniversitarStudiesCounty;
    }

    public String getPreuniversitarStudiesCity() {
        return preuniversitarStudiesCity;
    }

    public void setPreuniversitarStudiesCity(String preuniversitarStudiesCity) {
        this.preuniversitarStudiesCity = preuniversitarStudiesCity;
    }

    public String getPreuniversitarStudiesDomain() {
        return preuniversitarStudiesDomain;
    }

    public void setPreuniversitarStudiesDomain(String preuniversitarStudiesDomain) {
        this.preuniversitarStudiesDomain = preuniversitarStudiesDomain;
    }

    public String getPreuniversitarStudiesLength() {
        return preuniversitarStudiesLength;
    }

    public void setPreuniversitarStudiesLength(String preuniversitarStudiesLength) {
        this.preuniversitarStudiesLength = preuniversitarStudiesLength;
    }

    public String getPreuniversitarStudiesGraduationYear() {
        return preuniversitarStudiesGraduationYear;
    }

    public void setPreuniversitarStudiesGraduationYear(String preuniversitarStudiesGraduationYear) {
        this.preuniversitarStudiesGraduationYear = preuniversitarStudiesGraduationYear;
    }

    public String getPreuniversitarStudiesType() {
        return preuniversitarStudiesType;
    }

    public void setPreuniversitarStudiesType(String preuniversitarStudiesType) {
        this.preuniversitarStudiesType = preuniversitarStudiesType;
    }

    public String getGraduationDiplomaSeries() {
        return graduationDiplomaSeries;
    }

    public void setGraduationDiplomaSeries(String graduationDiplomaSeries) {
        this.graduationDiplomaSeries = graduationDiplomaSeries;
    }

    public String getGraduationDiplomaNumber() {
        return graduationDiplomaNumber;
    }

    public void setGraduationDiplomaNumber(String graduationDiplomaNumber) {
        this.graduationDiplomaNumber = graduationDiplomaNumber;
    }

    public String getGraduationDiplomaReleasedBy() {
        return graduationDiplomaReleasedBy;
    }

    public void setGraduationDiplomaReleasedBy(String graduationDiplomaReleasedBy) {
        this.graduationDiplomaReleasedBy = graduationDiplomaReleasedBy;
    }

    public String getGraduationDiplomaReleaseDateYear() {
        return graduationDiplomaReleaseDateYear;
    }

    public void setGraduationDiplomaReleaseDateYear(String graduationDiplomaReleaseDateYear) {
        this.graduationDiplomaReleaseDateYear = graduationDiplomaReleaseDateYear;
    }

    public String getBacDiplomaSeries() {
        return bacDiplomaSeries;
    }

    public void setBacDiplomaSeries(String bacDiplomaSeries) {
        this.bacDiplomaSeries = bacDiplomaSeries;
    }

    public String getBacDiplomaNumber() {
        return bacDiplomaNumber;
    }

    public void setBacDiplomaNumber(String bacDiplomaNumber) {
        this.bacDiplomaNumber = bacDiplomaNumber;
    }

    public String getBacDiplomaReleasedBy() {
        return bacDiplomaReleasedBy;
    }

    public void setBacDiplomaReleasedBy(String bacDiplomaReleasedBy) {
        this.bacDiplomaReleasedBy = bacDiplomaReleasedBy;
    }

    public String getBacDiplomaReleaseDateYear() {
        return bacDiplomaReleaseDateYear;
    }

    public void setBacDiplomaReleaseDateYear(String bacDiplomaReleaseDateYear) {
        this.bacDiplomaReleaseDateYear = bacDiplomaReleaseDateYear;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrationForm)) {
            return false;
        }
        RegistrationForm other = (RegistrationForm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.online_admission.entity.RegistrationForm[ id=" + id + " ]";
    }
    
}
