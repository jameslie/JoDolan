package com.example.jodolan.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {AkunModel.class, AkunLogin.class},
        version = 1,
        exportSchema = false
)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase appDatabase;

    public abstract AkunDAO akunDAO();
    public static AppDatabase initDatabase(Context context){
        if (appDatabase == null){
            appDatabase = Room.databaseBuilder(
                    context,
                    AppDatabase.class,
                    "akun"
            ).allowMainThreadQueries().build();
        }
        return appDatabase;
    }
}
