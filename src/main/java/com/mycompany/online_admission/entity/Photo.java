package com.mycompany.online_admission.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Photo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String filename;
    private String fileType;
    private byte[] fileContent;
    
    public String getFilename(){
        return filename;
    }
    public String getFileType(){
        return fileType;
    }
    public byte[] getFileContent(){
        return fileContent;
    }
    
    
    @ManyToOne
    @JoinColumn(name="PORTFOLIO_KEY")
    private Portfolio portfolio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setPortfolio(Portfolio portfolio){
        this.portfolio=portfolio;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public void setFileType(String fileType) {
        this.fileType=fileType;
    }
    public void setFileContent(byte [] fileContent) {
        this.fileContent= fileContent;
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
        if (!(object instanceof Photo)) {
            return false;
        }
        Photo other = (Photo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.online_admission.entity.Photo[ id=" + id + " ]";
    }
    
}
