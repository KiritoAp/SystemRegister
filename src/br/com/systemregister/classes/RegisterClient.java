/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systemregister.classes;

/**
 *
 * @author Gabriel
 */
public class RegisterClient {

    private int idClient;
    private String nameComplete;
    private String rgClient;
    private String dispatchingAgency;
    private String cpfClient;
    private String dateofBirth;
    private int genderClient;
    private String phoneClient;
    private String cellPhoneClient;
    private String emailClient;
    private String countryClient;
    private String cepClient;
    private String stateClient;
    private String cityClient;
    private String districtClient;
    private String addressClient;
    private String numberHouse;
    private String complementHouse;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNameComplete() {
        return nameComplete;
    }

    public void setNameComplete(String nameComplete) {
        this.nameComplete = nameComplete;
    }

    public String getRgClient() {
        return rgClient;
    }

    public void setRgClient(String rgClient) {
        this.rgClient = rgClient;
    }

    public String getDispatchingAgency() {
        return dispatchingAgency;
    }

    public void setDispatchingAgency(String dispatchingAgency) {
        this.dispatchingAgency = dispatchingAgency;
    }

    public String getCpfClient() {
        return cpfClient;
    }

    public void setCpfClient(String cpfClient) {
        this.cpfClient = cpfClient;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public int getGenderClient() {
        return genderClient;
    }

    public void setGenderClient(int genderClient) {
        this.genderClient = genderClient;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }

    public String getCellPhoneClient() {
        return cellPhoneClient;
    }

    public void setCellPhoneClient(String cellPhoneClient) {
        this.cellPhoneClient = cellPhoneClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getCountryClient() {
        return countryClient;
    }

    public void setCountryClient(String countryClient) {
        this.countryClient = countryClient;
    }

    public String getCepClient() {
        return cepClient;
    }

    public void setCepClient(String cepClient) {
        this.cepClient = cepClient;
    }

    public String getStateClient() {
        return stateClient;
    }

    public void setStateClient(String stateClient) {
        this.stateClient = stateClient;
    }

    public String getCityClient() {
        return cityClient;
    }

    public void setCityClient(String cityClient) {
        this.cityClient = cityClient;
    }

    public String getDistrictClient() {
        return districtClient;
    }

    public void setDistrictClient(String districtClient) {
        this.districtClient = districtClient;
    }

    public String getAddressClient() {
        return addressClient;
    }

    public void setAddressClient(String addressClient) {
        this.addressClient = addressClient;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getComplementHouse() {
        return complementHouse;
    }

    public void setComplementHouse(String complementHouse) {
        this.complementHouse = complementHouse;
    }

    @Override
    public String toString() {
        return "RegisterClient{" + "idClient=" + idClient + ", nameComplete=" + nameComplete + ", rgClient=" + rgClient + ", dispatchingAgency=" + dispatchingAgency + ", cpfClient=" + cpfClient + ", dateofBirth=" + dateofBirth + ", genderClient=" + genderClient + ", phoneClient=" + phoneClient + ", cellPhoneClient=" + cellPhoneClient + ", emailClient=" + emailClient + ", countryClient=" + countryClient + ", cepClient=" + cepClient + ", stateClient=" + stateClient + ", cityClient=" + cityClient + ", districtClient=" + districtClient + ", addressClient=" + addressClient + ", numberHouse=" + numberHouse + ", complementHouse=" + complementHouse + '}';
    }

}
