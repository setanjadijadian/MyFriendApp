package com.example.myfriendapp

import androidx.room.Dao
import androidx.room.*


@Dao
interface MyFriendDao {

    @insert(onConflict = OnConflictStrategy.REPLACE)
    fun tambahTeman (friend: MyFriend)


}