package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

//public class database extends SQLiteOpenHelper {
   /* public static String DB="kalees.db";
    public static int DB_VERSION=1;
    public static String ID="id";
    public static String database_image="dataimage";
    public static String database_title="datatitle";
    public static String database_content="datacontent";
    public static  final String DATABASE_TABLE="create_table";
    public static final String DATA="create table"+DATABASE_TABLE+"(+ID"+"integer primary key autoincrement ,"
            +database_title+"string,"+database_image+"BLOB NOT NULL,"+database_content+"string);";
    Context sqlcontext;
   public database(Context sqlcontext)
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

    }*/

