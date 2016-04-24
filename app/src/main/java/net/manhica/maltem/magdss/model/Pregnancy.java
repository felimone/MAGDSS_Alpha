package net.manhica.maltem.magdss.model;

import android.content.ContentValues;

import net.manhica.maltem.magdss.database.Database;

/**
 * Created by afelimone on 4/15/2016.
 */
public class Pregnancy implements Table{
    private String motherName;
    private String motherUuid;
    private String motherPermid;
    private String fatherPermid;
    private String fatherUuid;
    private String fatherName;
    private String permid;
    private String uri;

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherUuid() {
        return motherUuid;
    }

    public void setMotherUuid(String motherUuid) {
        this.motherUuid = motherUuid;
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

    public String getFatherUuid() {
        return fatherUuid;
    }

    public void setFatherUuid(String fatherUuid) {
        this.fatherUuid = fatherUuid;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPermid() {
        return permid;
    }

    public void setPermid(String permid) {
        this.permid = permid;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String getTableName() {
        return Database.Pregnancy.TABLE_NAME;
    }

    @Override
    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();
        cv.put(Database.Pregnancy.COLUMN_MOTHER_UUID, motherUuid);
        cv.put(Database.Pregnancy.COLUMN_MOTHER_PERMID, motherPermid);
        cv.put(Database.Pregnancy.COLUMN_MOTHER_NAME, motherName);
        cv.put(Database.Pregnancy.COLUMN_PERMID, permid);
        cv.put(Database.Pregnancy.COLUMN_FATHER_NAME, fatherName);
        cv.put(Database.Pregnancy.COLUMN_FATHER_UUID, fatherUuid);
        cv.put(Database.Pregnancy.COLUMN_FATHER_PERMID, fatherPermid);
        cv.put(Database.Pregnancy.COLUMN_URI, uri);
        return cv;
    }

    @Override
    public String[] getColumnNames() {
        return Database.Pregnancy.ALL_COLUMNS;
    }
}
