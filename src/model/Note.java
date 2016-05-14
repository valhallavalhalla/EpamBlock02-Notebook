package model;

import java.util.Date;

/**
 * Class represents a note of some person contact information.
 *
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public class Note {

    private String lastName;
    private String firstName;
    private String middleName;
    private String shortFullName;
    private String nickName;
    private String comment;
    private ContactGroup contactGroup;
    private String homePhoneNumber;
    private String mobilePhoneNumber;
    private String emailAddress;
    private String skypeName;
    private String postalCode;
    private String cityName;
    private String streetName;
    private String buildingNumber;
    private String apartmentNumber;
    private String postalAddress;
    private String commonAddress;
    private final Date creationDateOfNote;
    private Date lastChangeDateOfEntry;

    public Note(String lastName, String firstName, String middleName,
                String nickName, String comment, ContactGroup contactGroup,
                String homePhoneNumber, String mobilePhoneNumber,
                String emailAddress, String skypeName, String postalCode,
                String cityName, String streetName, String buildingNumber,
                String apartmentNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        generateShortFullName();
        this.nickName = nickName;
        this.comment = comment;
        this.contactGroup = contactGroup;
        this.homePhoneNumber = homePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.emailAddress = emailAddress;
        this.skypeName = skypeName;
        this.postalCode = postalCode;
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        generateCommonAddress();
        generatePostalAddress();
        this.creationDateOfNote = new Date();
        updateLastChangeDate();
    }

    /**
     * Method update the date of last note change.
     * Method is called every time, when any setter method is called.
     *
     */
    private void updateLastChangeDate() {
        lastChangeDateOfEntry = new Date();
    }

    /**
     * Method generates short representation of full name
     * from last name and first letters of first and middle names.
     *
     * For example if
     *      last name = "Shchavinskyi"
     *      first name = "Andrii"
     *      middle name = "Andriiovych"
     * then
     *      short representation of full name = "Shchavinskyi A. A."
     *
     */
    private void generateShortFullName() {
        shortFullName = lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".";
    }

    /**
     * Method generates address, by following postal regulations
     */
    private void generatePostalAddress() {
        postalAddress = shortFullName + ", " + apartmentNumber+ ", " + buildingNumber +
                ", " + streetName + ", " + postalCode + " " + cityName;
    }

    /**
     * Method generates common address.
     */
    private void generateCommonAddress() {
        commonAddress = apartmentNumber + ", " + buildingNumber + ", " + streetName + ", " + cityName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        generateShortFullName();
        generatePostalAddress();
        updateLastChangeDate();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        generateShortFullName();
        generatePostalAddress();
        updateLastChangeDate();
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        generateShortFullName();
        generatePostalAddress();
        updateLastChangeDate();
    }

    public String getShortFullName() {
        return shortFullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        updateLastChangeDate();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        updateLastChangeDate();
    }

    public ContactGroup getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(ContactGroup contactGroup) {
        this.contactGroup = contactGroup;
        updateLastChangeDate();
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
        updateLastChangeDate();
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
        updateLastChangeDate();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        updateLastChangeDate();
    }

    public String getSkypeName() {
        return skypeName;
    }

    public void setSkypeName(String skypeName) {
        this.skypeName = skypeName;
        updateLastChangeDate();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        generatePostalAddress();
        updateLastChangeDate();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
        generatePostalAddress();
        generateCommonAddress();
        updateLastChangeDate();
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
        generatePostalAddress();
        generateCommonAddress();
        updateLastChangeDate();
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        generatePostalAddress();
        generateCommonAddress();
        updateLastChangeDate();
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        generatePostalAddress();
        generateCommonAddress();
        updateLastChangeDate();
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public String getCommonAddress() {
        return commonAddress;
    }

    public Date getCreationDateOfNote() {
        return creationDateOfNote;
    }

    public Date getLastChangeDateOfEntry() {
        return lastChangeDateOfEntry;
    }

}
