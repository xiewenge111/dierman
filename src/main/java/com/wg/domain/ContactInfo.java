package com.wg.domain;

import java.util.Date;

public class ContactInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.id
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.contact_name
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private String contactName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.contact_type
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private String contactType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.contact_number
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private String contactNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.contact_info
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private String contactInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.gmt_create
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.gmt_modity
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private Date gmtModity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.modify_people
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private String modifyPeople;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contact_info.status
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.id
     *
     * @return the value of contact_info.id
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.id
     *
     * @param id the value for contact_info.id
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.contact_name
     *
     * @return the value of contact_info.contact_name
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.contact_name
     *
     * @param contactName the value for contact_info.contact_name
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.contact_type
     *
     * @return the value of contact_info.contact_type
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.contact_type
     *
     * @param contactType the value for contact_info.contact_type
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setContactType(String contactType) {
        this.contactType = contactType == null ? null : contactType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.contact_number
     *
     * @return the value of contact_info.contact_number
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.contact_number
     *
     * @param contactNumber the value for contact_info.contact_number
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.contact_info
     *
     * @return the value of contact_info.contact_info
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.contact_info
     *
     * @param contactInfo the value for contact_info.contact_info
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo == null ? null : contactInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.gmt_create
     *
     * @return the value of contact_info.gmt_create
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.gmt_create
     *
     * @param gmtCreate the value for contact_info.gmt_create
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.gmt_modity
     *
     * @return the value of contact_info.gmt_modity
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public Date getGmtModity() {
        return gmtModity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.gmt_modity
     *
     * @param gmtModity the value for contact_info.gmt_modity
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setGmtModity(Date gmtModity) {
        this.gmtModity = gmtModity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.modify_people
     *
     * @return the value of contact_info.modify_people
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public String getModifyPeople() {
        return modifyPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.modify_people
     *
     * @param modifyPeople the value for contact_info.modify_people
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setModifyPeople(String modifyPeople) {
        this.modifyPeople = modifyPeople == null ? null : modifyPeople.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contact_info.status
     *
     * @return the value of contact_info.status
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contact_info.status
     *
     * @param status the value for contact_info.status
     *
     * @mbggenerated Sun Oct 15 14:03:11 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "id=" + id +
                ", contactName='" + contactName + '\'' +
                ", contactType='" + contactType + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", ContactInfo='" + contactInfo + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModity=" + gmtModity +
                ", modifyPeople='" + modifyPeople + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}