package net.manhica.maltem.magdss.model;

import android.content.ContentValues;

/**
 * Created by afelimone on 4/18/2016.
 */
public interface Table {

    public String getTableName();

    public ContentValues getContentValues();

    public String[] getColumnNames();
}
