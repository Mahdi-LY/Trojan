package ly.trojan_team.trojan.database.data.dbRoom

import androidx.room.Database
import androidx.room.RoomDatabase
import ly.trojan_team.trojan.database.User

@Database(
    entities = [User::class], version = 1
//    autoMigrations =[ AutoMigration(from = 1 ,to =2)], exportSchema = true
)

abstract class UserDb:RoomDatabase() {
    abstract fun getuserDao(): UserDao
}