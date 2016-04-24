package net.manhica.maltem.magdss.model;

import android.content.ContentValues;

import net.manhica.maltem.magdss.database.Database;

/**
 * Created by afelimone on 4/11/2016.
 */
public class User implements Table{
    private String uri;
    private String username;
    private String password;
    private String code;
    private String creationDate;
    private String type;
    private String firstName;
    private String surname;

    public String getUri() {
        return uri;
    }

    public String getSurname() {
        return surname;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getTableName() {
        return Database.User.TABLE_NAME;
    }

    @Override
    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();
        cv.put(Database.User.COLUMN_CODE, code);
        cv.put(Database.User.COLUMN_CREATION_DATE, creationDate);
        cv.put(Database.User.COLUMN_FIRST_NAME, firstName);
        cv.put(Database.User.COLUMN_PASSWORD, password);
        cv.put(Database.User.COLUMN_TYPE, type);
        cv.put(Database.User.COLUMN_URI, uri);
        cv.put(Database.User.COLUMN_SURNAME, surname);
        cv.put(Database.User.COLUMN_USERNAME, username);
        return cv;
    }

    @Override
    public String[] getColumnNames() {
        return Database.User.ALL_COLUMNS;
    }
}
