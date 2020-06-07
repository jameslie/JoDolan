package com.example.jodolan.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AkunDAO {
    @Insert
    long insertAkun(AkunModel akunModel);

    @Query("Select * from data_akun_yodolan WHERE email = :email and password = :password")
    AkunModel getData(String email, String password);

    @Insert
    long insertLogin(AkunLogin akunLogin);

    @Query("Select * from data_login")
    AkunLogin[] getData();

    @Delete
    void deleteData(AkunLogin akunLogin);

    @Update
    int updateDataAkun(AkunModel akunModel);

    @Update
    int updateDataLogin(AkunLogin akunLogin);
}
