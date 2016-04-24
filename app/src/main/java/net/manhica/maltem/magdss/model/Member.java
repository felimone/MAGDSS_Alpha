package net.manhica.maltem.magdss.model;

import android.content.ContentValues;

/**
 * Created by afelimone on 4/11/2016.
 */
public class Member implements Table {
    private String name;
    private String permid;
    private String relationship;
    private String dob;
    private String memberUuid;
    private String household;
    private String householdUuid;
    private String motherPermid;
    private String fatherPermid;
    private String motherName;
    private String fatherName;
    //Control variable
    private String uri;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermid() {
        return permid;
    }

    public void setPermid(String permid) {
        this.permid = permid;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMemberUuid() {
        return memberUuid;
    }

    public void setMemberUuid(String memberUuid) {
        this.memberUuid = memberUuid;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getHouseholdUuid() {
        return householdUuid;
    }

    public void setHouseholdUuid(String householdUuid) {
        this.householdUuid = householdUuid;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getMotherPermid() {
        return motherPermid;
    }

    public void setMotherPermid(String motherPermid) {
        this.motherPermid = motherPermid;
    }

    public String getFatherPermid() {
        return fatherPermid;
    }

    public void setFatherPermid(String fatherPermid) {
        this.fatherPermid = fatherPermid;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public ContentValues getContentValues() {
        return null;
    }

    @Override
    public String[] getColumnNames() {
        return new String[0];
    }
}
