package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class aboutmedatabase extends SQLiteOpenHelper {
    public static String DB="kannan.db";
    public static int DB_VERSION=1;
    public static String ID="id";
    public static String database_image="dataimage";
    public static String database_title="datatitle";
    public static String database_content="datacontent";
    public static  final String DATABASE_TABLE="create_table";
    public static final String DATA="create table"+DATABASE_TABLE+"(+ID"+"integer primary key autoincrement ,"
           +database_image+"BLOB NOT NULL,);";
    Context sqlcontext;
    public aboutmedatabase(Context sqlcontext)
    {
        super(sqlcontext,DB,null,DB_VERSION);
        this.sqlcontext=sqlcontext;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {


            db.execSQL(DATA);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
