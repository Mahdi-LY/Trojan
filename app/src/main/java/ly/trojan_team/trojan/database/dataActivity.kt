package ly.trojan_team.trojan.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import ly.tasks.roomapp.database.UserDb
import ly.trojan_team.trojan.R

class dataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val database = Room.databaseBuilder(this, UserDb::class.java  ,  name= "campdb").build()

        GlobalScope.launch {
            val users = database.getuserDao().getAll()
        }
    }
}