package ly.trojan_team.trojan.database.data.dbRoom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class], version = 1)
abstract class RoomDbApp : RoomDatabase(){

    abstract fun userDao():UserDao?

    companion object{
        private var INSTANCE : RoomDatabase? = null

        fun getAppDatabase(context : Context) : RoomDatabase?{

            if(INSTANCE == null){
                INSTANCE = Room.databaseBuilder<RoomDbApp>(
                    context.applicationContext,RoomDbApp::class.java,"AppDb"
                ).allowMainThreadQueries().build()
            }
            return INSTANCE
        }
    }
}