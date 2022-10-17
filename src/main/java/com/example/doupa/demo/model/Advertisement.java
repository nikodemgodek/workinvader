package com.example.doupa.demo.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "offers")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "Company name is required")
    private String companyName;
    @NotBlank(message = "Company type is required")
    private String companyType;
    @NotNull(message = "Company size is required")
    private Integer companySize;
    @NotBlank(message = "Company industry is required")
    private String companyIndustry;
    @NotEmpty(message = "Company website is required")
    private String companyWebsite;
    @NotEmpty(message = "Position name is required")

    private String positionName;
    @NotBlank(message = "Position level is required.")
    private String positionLevel;
    @NotBlank(message = "Employment type is required")
    private String employmentType;
    @NotBlank(message = "Employment mode is required")
    private String employmentMode;
    @NotNull(message = "Minimum salary is required")
    private Integer minSalaryGross;
    @NotNull(message = "Maximum salary is required")

    private Integer maxSalaryGross;
    @NotBlank(message = "Currency is required")
    private String salaryCurrency;
    @NotEmpty(message = "City is required")
    private String companyLocationCity;
    @NotEmpty(message = "Street is required")

    private String companyLocationStreet;
    @NotEmpty(message = "Building number is required")

    private String companyLocationBuildingNo;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;

    public Advertisement(String companyName, String companyType, Integer companySize, String companyIndustry, String companyWebsite, String positionName, String positionLevel, String employmentType, String employmentMode, Integer minSalaryGross, Integer maxSalaryGross, String salaryCurrency, String companyLocationCity, String companyLocationStreet, String companyLocationBuildingNo, String image) {
        this.companyName = companyName;
        this.companyType = companyType;
        this.companySize = companySize;
        this.companyIndustry = companyIndustry;
        this.companyWebsite = companyWebsite;
        this.positionName = positionName;
        this.positionLevel = positionLevel;
        this.employmentType = employmentType;
        this.employmentMode = employmentMode;
        this.minSalaryGross = minSalaryGross;
        this.maxSalaryGross = maxSalaryGross;
        this.salaryCurrency = salaryCurrency;
        this.companyLocationCity = companyLocationCity;
        this.companyLocationStreet = companyLocationStreet;
        this.companyLocationBuildingNo = companyLocationBuildingNo;
        this.image = image;
    }

    public Advertisement() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public Integer getCompanySize() {
        return companySize;
    }

    public void setCompanySize(Integer companySize) {
        this.companySize = companySize;
    }

    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getEmploymentMode() {
        return employmentMode;
    }

    public void setEmploymentMode(String employmentMode) {
        this.employmentMode = employmentMode;
    }

    public Integer getMinSalaryGross() {
        return minSalaryGross;
    }

    public void setMinSalaryGross(Integer minSalaryGross) {
        this.minSalaryGross = minSalaryGross;
    }

    public Integer getMaxSalaryGross() {
        return maxSalaryGross;
    }

    public void setMaxSalaryGross(Integer maxSalaryGross) {
        this.maxSalaryGross = maxSalaryGross;
    }

    public String getSalaryCurrency() {
        return salaryCurrency;
    }

    public void setSalaryCurrency(String salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    public String getCompanyLocationCity() {
        return companyLocationCity;
    }

    public void setCompanyLocationCity(String companyLocationCity) {
        this.companyLocationCity = companyLocationCity;
    }

    public String getCompanyLocationStreet() {
        return companyLocationStreet;
    }

    public void setCompanyLocationStreet(String companyLocationStreet) {
        this.companyLocationStreet = companyLocationStreet;
    }

    public String getCompanyLocationBuildingNo() {
        return companyLocationBuildingNo;
    }

    public void setCompanyLocationBuildingNo(String companyLocationBuildingNo) {
        this.companyLocationBuildingNo = companyLocationBuildingNo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", companyType='" + companyType + '\'' +
                ", companySize=" + companySize +
                ", companyIndustry='" + companyIndustry + '\'' +
                ", companyWebsite='" + companyWebsite + '\'' +
                ", positionName='" + positionName + '\'' +
                ", positionLevel='" + positionLevel + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", employmentMode='" + employmentMode + '\'' +
                ", minSalaryGross=" + minSalaryGross +
                ", maxSalaryGross=" + maxSalaryGross +
                ", salaryCurrency='" + salaryCurrency + '\'' +
                ", companyLocationCity='" + companyLocationCity + '\'' +
                ", companyLocationStreet='" + companyLocationStreet + '\'' +
                ", companyLocationBuildingNo='" + companyLocationBuildingNo + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
