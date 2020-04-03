package com.sam.pojo;

public class Supplier {
    private Integer suppId;

    private String suppName;

    private String suppAddress;

    private String suppPhone;

    private String suppEmail;

    private String suppBank;

    public Integer getSuppId() {
        return suppId;
    }

    public void setSuppId(Integer suppId) {
        this.suppId = suppId;
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName == null ? null : suppName.trim();
    }

    public String getSuppAddress() {
        return suppAddress;
    }

    public void setSuppAddress(String suppAddress) {
        this.suppAddress = suppAddress == null ? null : suppAddress.trim();
    }

    public String getSuppPhone() {
        return suppPhone;
    }

    public void setSuppPhone(String suppPhone) {
        this.suppPhone = suppPhone == null ? null : suppPhone.trim();
    }

    public String getSuppEmail() {
        return suppEmail;
    }

    public void setSuppEmail(String suppEmail) {
        this.suppEmail = suppEmail == null ? null : suppEmail.trim();
    }

    public String getSuppBank() {
        return suppBank;
    }

    public void setSuppBank(String suppBank) {
        this.suppBank = suppBank == null ? null : suppBank.trim();
    }
}