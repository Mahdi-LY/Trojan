package ly.tasks.roomapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ly.trojan_team.trojan.database.User

@Database(entities = [User::class], version = 1)
abstract class UserDb:RoomDatabase() {
    abstract fun getuserDao(): UserDao
}