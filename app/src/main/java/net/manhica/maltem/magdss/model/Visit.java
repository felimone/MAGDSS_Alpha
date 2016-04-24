package net.manhica.maltem.magdss.model;

import android.content.ContentValues;

import net.manhica.maltem.magdss.database.Database;

/**
 * Created by afelimone on 4/15/2016.
 */
public class Visit implements Table {
    private String type;
    private String date;
    private String fieldWorkerId;
    private String uri;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFieldWorkerId() {
        return fieldWorkerId;
    }

    public void setFieldWorkerId(String fieldWorkerId) {
        this.fieldWorkerId = fieldWorkerId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String getTableName() {
        return Database.Visit.TABLE_NAME;
    }

    @Override
    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();
        cv.put(Database.Visit.COLUMN_DATE, date);
        cv.put(Database.Visit.COLUMN_FIELDWORKER_ID, fieldWorkerId);
        cv.put(Database.Visit.COLUMN_URI, uri);
        cv.put(Database.Visit.COLUMN_TYPE, type);
        return cv;
    }

    @Override
    public String[] getColumnNames() {
        return Database.Visit.ALL_COLUMNS;
    }
}

