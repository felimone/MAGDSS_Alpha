package net.manhica.maltem.magdss.model;

import android.content.ContentValues;

import net.manhica.maltem.magdss.database.Database;

/**
 * Created by afelimone on 4/11/2016.
 */
public class Event implements Table {
    private String type;
    private String oldHouseholdUuid;
    private String oldHouseholdNumber;
    private String newHouseholdUuid;
    private String newHouseholdNumber;
    private String name;
    private String enterDate;
    private String exitDate;
    private String permid;
    private String memberUuid;
    private String uri;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOldHouseholdUuid() {
        return oldHouseholdUuid;
    }

    public void setOldHouseholdUuid(String oldHouseholdUuid) {
        this.oldHouseholdUuid = oldHouseholdUuid;
    }

    public String getOldHouseholdNumber() {
        return oldHouseholdNumber;
    }

    public void setOldHouseholdNumber(String oldHouseholdNumber) {
        this.oldHouseholdNumber = oldHouseholdNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(String enterDate) {
        this.enterDate = enterDate;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    public String getPermid() {
        return permid;
    }

    public void setPermid(String permid) {
        this.permid = permid;
    }

    public String getMemberUuid() {
        return memberUuid;
    }

    public void setMemberUuid(String memberUuid) {
        this.memberUuid = memberUuid;
    }

    public String getNewHouseholdUuid() {
        return newHouseholdUuid;
    }

    public void setNewHouseholdUuid(String newHouseholdUuid) {
        this.newHouseholdUuid = newHouseholdUuid;
    }

    public String getNewHouseholdNumber() {
        return newHouseholdNumber;
    }

    public void setNewHouseholdNumber(String newHouseholdNumber) {
        this.newHouseholdNumber = newHouseholdNumber;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String getTableName() {
        return Database.Event.TABLE_NAME;
    }

    @Override
    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();
        cv.put(Database.Event.COLUMN_URI, uri);
        cv.put(Database.Event.COLUMN_ENTRY_DATE, enterDate);
        cv.put(Database.Event.COLUMN_EXIT_DATE, exitDate);
        cv.put(Database.Event.COLUMN_MEMBER_UUID, memberUuid);
        cv.put(Database.Event.COLUMN_NEW_HOUSEHOLD, newHouseholdNumber);
        cv.put(Database.Event.COLUMN_NEW_HOUSEHOLD_UUID, newHouseholdUuid);
        cv.put(Database.Event.COLUMN_OLD_HOUSEHOLD, oldHouseholdNumber);
        cv.put(Database.Event.COLUMN_OLD_HOUSEHOLD_UUID, oldHouseholdUuid);
        cv.put(Database.Event.COLUMN_TYPE, type);
        cv.put(Database.Event.COLUMN_PERMID, permid);
        return cv;
    }

    @Override
    public String[] getColumnNames() {
        return Database.Event.ALL_COLUMNS;
    }



}
