package net.manhica.maltem.magdss.model;

import android.content.ContentValues;

import net.manhica.maltem.magdss.database.Database;

/**
 * Created by afelimone on 4/11/2016.
 */
public class Household implements Table {

    private String householdUuid;
    private String householdNumber;
    private String householdHead;
    private String uri;
    private String headPermid;
    private int members;
    private int visitedMembers;

    public String getHouseholdUuid() {
        return householdUuid;
    }

    public void setHouseholdUuid(String householdUuid) {
        this.householdUuid = householdUuid;
    }

    public String getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
    }

    public String getHouseholdHead() {
        return householdHead;
    }

    public void setHouseholdHead(String householdHead) {
        this.householdHead = householdHead;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getHeadPermid() {
        return headPermid;
    }

    public void setHeadPermid(String headPermid) {
        this.headPermid = headPermid;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getVisitedMembers() {
        return visitedMembers;
    }

    public void setVisitedMembers(int visitedMembers) {
        this.visitedMembers = visitedMembers;
    }

    @Override
    public String getTableName() {
        return Database.Household.TABLE_NAME;
    }

    @Override
    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();
        cv.put(Database.Household.COLUMN_URI, uri);
        cv.put(Database.Household.COLUMN_HOUSEHOLD_UUID,householdUuid);
        cv.put(Database.Household.COLUMN_HOUSEHOLD_NUMBER, householdNumber);
        cv.put(Database.Household.COLUMN_HEAD_NAME, householdHead);
        cv.put(Database.Household.COLUMN_HEAD_PERMID, headPermid);
        cv.put(Database.Household.COLUMN_MEMBERS, members);
        cv.put(Database.Household.COLUMN_VISITED_MEMBERS, visitedMembers);
        return cv;
    }

    @Override
    public String[] getColumnNames() {
        return Database.Household.ALL_COLUMNS;
    }
}
