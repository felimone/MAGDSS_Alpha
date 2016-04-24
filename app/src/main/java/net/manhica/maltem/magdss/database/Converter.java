package net.manhica.maltem.magdss.database;

import android.database.Cursor;

import net.manhica.maltem.magdss.model.Event;
import net.manhica.maltem.magdss.model.Household;
import net.manhica.maltem.magdss.model.Member;
import net.manhica.maltem.magdss.model.Pregnancy;
import net.manhica.maltem.magdss.model.Visit;

/**
 * Created by afelimone on 4/21/2016.
 */
public class Converter {
    public static Event cursorToEvent(Cursor cursor){
        Event event = new Event();
        event.setEnterDate(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_ENTRY_DATE)));
        event.setExitDate(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_EXIT_DATE)));
        event.setMemberUuid(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_MEMBER_UUID)));
        event.setType(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_TYPE)));
        event.setNewHouseholdNumber(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_NEW_HOUSEHOLD)));
        event.setNewHouseholdUuid(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_NEW_HOUSEHOLD_UUID)));
        event.setOldHouseholdNumber(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_OLD_HOUSEHOLD)));
        event.setOldHouseholdUuid(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_OLD_HOUSEHOLD_UUID)));
        event.setPermid(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_PERMID)));
        event.setUri(cursor.getString(cursor.getColumnIndex(Database.Event.COLUMN_URI)));
        return event;
    }

    public static Household cursorToHousehold(Cursor cursor){
        Household household = new Household();
        household.setUri(cursor.getString(cursor.getColumnIndex(Database.Household.COLUMN_URI)));
        household.setHeadPermid(cursor.getString(cursor.getColumnIndex(Database.Household.COLUMN_HEAD_PERMID)));
        household.setHouseholdNumber(cursor.getString(cursor.getColumnIndex(Database.Household.COLUMN_HOUSEHOLD_NUMBER)));
        household.setMembers(cursor.getInt(cursor.getColumnIndex(Database.Household.COLUMN_MEMBERS)));
        household.setVisitedMembers(cursor.getInt(cursor.getColumnIndex(Database.Household.COLUMN_MEMBERS)));
        return household;
    }

    public static Member cursorToMember(Cursor cursor){
        Member member = new Member();
        member.setUri(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_URI)));
        member.setPermid(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_PERMID)));
        member.setMemberUuid(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_MEMBER_UUID)));
        member.setName(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_NAME)));
        member.setFatherName(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_FATHER_NAME)));
        member.setMotherPermid(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_MOTHER_PERMID)));
        member.setFatherPermid(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_FATHER_PERMID)));
        member.setMotherName(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_MOTHER_NAME)));
        member.setHousehold(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_HOUSEHOLD_NUMBER)));
        member.setHouseholdUuid(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_HOUSEHOLD_UUID)));
        member.setDob(cursor.getString(cursor.getColumnIndex(Database.Member.COLUMN_DOB)));
        return member;
    }

    public static Pregnancy cursorToPregnancy(Cursor cursor){
        Pregnancy pregnancy = new Pregnancy();
        pregnancy.setUri(cursor.getString(cursor.getColumnIndex(Database.Pregnancy.COLUMN_URI)));
        pregnancy.setMotherName(cursor.getString(cursor.getColumnIndex(Database.Pregnancy.COLUMN_MOTHER_NAME)));
        pregnancy.setFatherName(cursor.getString(cursor.getColumnIndex(Database.Pregnancy.COLUMN_FATHER_NAME)));
        pregnancy.setMotherPermid(cursor.getString(cursor.getColumnIndex(Database.Pregnancy.COLUMN_MOTHER_PERMID)));
        pregnancy.setFatherPermid(cursor.getString(cursor.getColumnIndex(Database.Pregnancy.COLUMN_FATHER_PERMID)));
        pregnancy.setFatherUuid(cursor.getString(cursor.getColumnIndex(Database.Pregnancy.COLUMN_FATHER_UUID)));
        pregnancy.setMotherUuid(cursor.getString(cursor.getColumnIndex(Database.Pregnancy.COLUMN_MOTHER_UUID)));
        return pregnancy;
    }

    public static Visit cursorToVisit(Cursor cursor){
        Visit visit = new Visit();
        visit.setUri(cursor.getString(cursor.getColumnIndex(Database.Visit.COLUMN_URI)));
        visit.setDate(cursor.getString(cursor.getColumnIndex(Database.Visit.COLUMN_DATE)));
        visit.setType(cursor.getString(cursor.getColumnIndex(Database.Visit.COLUMN_TYPE)));
        visit.setFieldWorkerId(cursor.getString(cursor.getColumnIndex(Database.Visit.COLUMN_FIELDWORKER_ID)));
        return visit;
    }
}
