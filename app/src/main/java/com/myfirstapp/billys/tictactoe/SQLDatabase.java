package com.myfirstapp.billys.tictactoe;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLDatabase extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "userdata.db";
    public static final String DATABASE_TABLE = "db_user";
    public static final String DATABASE_SELECT = "SELECT * FROM " + SQLDatabase.DATABASE_TABLE;

    public SQLDatabase (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL( "CREATE TABLE )"+ DATABASE_TABLE + " (user_id INTEGER PRIMARY KEY, user_name VARCHAR(11), user_pw VARCHAR(11))");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
    }

    public long insertRecord(SQLiteDatabase db){
        ContentValues cv = new ContentValues();
        cv.put("user_name", "test1");
        cv.put("user_pw", "test1");
        long rowId = db.insert(DATABASE_TABLE,null,cv);
        return rowId;
    }
}
