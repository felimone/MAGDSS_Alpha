package net.manhica.maltem.magdss.database;

import android.provider.BaseColumns;

/**
 * Created by afelimone on 4/18/2016.
 */
public  class Database {
    public static class User implements BaseColumns{
        public static String COLUMN_USERNAME = "USERNAME";
        public static String COLUMN_FIRST_NAME = "FIRST_NAME";
        public static String COLUMN_SURNAME = "SURNAME";
        public static String COLUMN_URI = "URI";
        public static String COLUMN_TYPE = "TYPE";
        public static String COLUMN_PASSWORD = "PASSWORD";
        public static String COLUMN_CODE = "CODE";
        public static String COLUMN_CREATION_DATE = "CREATION_DATE";
        public static String TABLE_NAME = "USER";
        public static String[] ALL_COLUMNS = {COLUMN_URI, COLUMN_CREATION_DATE, COLUMN_CODE, COLUMN_FIRST_NAME, COLUMN_SURNAME,COLUMN_TYPE,COLUMN_USERNAME, COLUMN_PASSWORD};
    }

    public static class Event implements BaseColumns{
        public static String TABLE_NAME = "EVENT";
        public static String COLUMN_TYPE  = "TYPE";
        public static String COLUMN_MEMBER_UUID = "MEMBER_UUID";
        public static String COLUMN_PERMID = "PERMID";
        public static String COLUMN_OLD_HOUSEHOLD = "OLD_HOUSEHOLD";
        public static String COLUMN_NEW_HOUSEHOLD = "NEW_HOUSEHOLD";
        public static String COLUMN_NEW_HOUSEHOLD_UUID = "NEW_HOUSEHOLD_UUID";
        public static String COLUMN_OLD_HOUSEHOLD_UUID = "OLD_HOUSEHOLD_UUID";
        public static String COLUMN_URI = "URI";
        public static String COLUMN_EXIT_DATE = "EXIT_DATE";
        public static String COLUMN_ENTRY_DATE = "ENTRY_DATE";
        public static String[] ALL_COLUMNS = {COLUMN_URI, COLUMN_TYPE, COLUMN_ENTRY_DATE, COLUMN_EXIT_DATE, COLUMN_OLD_HOUSEHOLD, COLUMN_NEW_HOUSEHOLD,
                                                COLUMN_NEW_HOUSEHOLD_UUID, COLUMN_OLD_HOUSEHOLD_UUID, COLUMN_MEMBER_UUID, COLUMN_PERMID};

    }

    public static class Member implements BaseColumns{
        public static String TABLE_NAME = "MEMBER";
        public static String COLUMN_NAME = "NAME";
        public static String COLUMN_PERMID = "PERMID";
        public static String COLUMN_URI = "URI";
        public static String COLUMN_MEMBER_UUID = "MEMBER_UUID";
        public static String COLUMN_HOUSEHOLD_NUMBER = "HOUSEHOLD_NUMBER";
        public static String COLUMN_HOUSEHOLD_UUID = "HOUSEHOLD_UUID";
        public static String COLUMN_FATHER_NAME = "FATHER_NAME";
        public static String COLUMN_MOTHER_NAME = "MOTHER_NAME";
        public static String COLUMN_FATHER_PERMID = "FATHER_PERMID";
        public static String COLUMN_MOTHER_PERMID = "MOTHER_PERMID";
        public static String COLUMN_DOB = "DOB";

        public static String[] ALL_COLUMNS={COLUMN_URI, COLUMN_NAME, COLUMN_PERMID, COLUMN_MEMBER_UUID, COLUMN_HOUSEHOLD_NUMBER, COLUMN_HOUSEHOLD_UUID
                                            ,COLUMN_MOTHER_NAME, COLUMN_FATHER_NAME,COLUMN_FATHER_PERMID,COLUMN_MOTHER_PERMID, COLUMN_DOB};
    }

    public static class Pregnancy implements BaseColumns{
        public static String TABLE_NAME = "PREGNANCY";
        public static String COLUMN_URI = "URI";
        public static String COLUMN_PERMID = "PERMID";
        public static String COLUMN_MOTHER_NAME = "MOTHER_NAME";
        public static String COLUMN_FATHER_NAME = "FATHER_NAME";
        public static String COLUMN_MOTHER_PERMID = "MOTHER_PERMID";
        public static String COLUMN_FATHER_PERMID = "FATHER_PERMID";
        public static String COLUMN_MOTHER_UUID = "MOTHER_UUID";
        public static String COLUMN_FATHER_UUID = "FATHER_UUID";
        public static String[] ALL_COLUMNS = {COLUMN_FATHER_NAME, COLUMN_FATHER_PERMID, COLUMN_FATHER_UUID,COLUMN_MOTHER_NAME
                                                ,COLUMN_MOTHER_PERMID, COLUMN_MOTHER_UUID, COLUMN_PERMID, COLUMN_URI};
    }

    public static final class Visit implements BaseColumns{
        public static final String TABLE_NAME = "VISIT";
        public static final String COLUMN_URI = "URI";
        public static final String COLUMN_TYPE = "TYPE";
        public static final String COLUMN_FIELDWORKER_ID = "FIELDWORKER_ID";
        public static final String COLUMN_DATE = "DATE";
        public static String[] ALL_COLUMNS={COLUMN_URI, COLUMN_TYPE, COLUMN_FIELDWORKER_ID, COLUMN_DATE};
    }

    public static class Household implements BaseColumns{
        public static final String TABLE_NAME = "HOUSEHOLD";
        public static final String COLUMN_URI = "URI";
        public static final String COLUMN_HEAD_NAME = "HEAD_NAME";
        public static final String COLUMN_HOUSEHOLD_NUMBER = "HOUSEHOLD_NUMBER";
        public static final String COLUMN_HOUSEHOLD_UUID = "HOUSEHOLD_UUID";
        public static final String COLUMN_MEMBERS =  "MEMBERS";
        public static final String COLUMN_VISITED_MEMBERS = "VISITED_MEMBERS";
        public static final String COLUMN_HEAD_PERMID = "HEAD_PERMID";
        public static final String[] ALL_COLUMNS = {COLUMN_HEAD_NAME, COLUMN_HEAD_NAME, COLUMN_HOUSEHOLD_NUMBER, COLUMN_HOUSEHOLD_UUID, COLUMN_MEMBERS
                                                    ,COLUMN_VISITED_MEMBERS, COLUMN_HEAD_PERMID};
    }
}
