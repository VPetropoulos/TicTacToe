package com.myfirstapp.billys.tictactoe;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

public class SQLDatabase extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "userdata.db";
    public static final String DATABASE_TABLE = "db_user";
    public static SQLDatabase sqlinstance = null;


    public void onCreate(SQLiteDatabase db){

    db.execSQL( "CREATE TABLE "+ DATABASE_TABLE + " (user_id INTEGER PRIMARY KEY, user_name VARCHAR(11), user_pw VARCHAR(11));");
    }


    public boolean login(String username, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + DATABASE_TABLE + " WHERE user_name=? AND user_pw=?;", new String[]{username,password});
        if (cursor != null) {
            if(cursor.getCount() > 0)
            {
                return true;
            }
        }
            return false;
    }

    public static SQLDatabase getinstance(Context context) {
        if (sqlinstance == null) {
            sqlinstance = new SQLDatabase(context);
        }
        return sqlinstance;
    }

    public SQLDatabase (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
    }

    public void CreateAccSQL(String username, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        SQLiteStatement stmt = db.compileStatement("INSERT INTO " + DATABASE_TABLE + " (user_name, user_pw) VALUES (?,?);");
        stmt.bindString(1, username);
        stmt.bindString(2, password);
        stmt.execute();
    }
}