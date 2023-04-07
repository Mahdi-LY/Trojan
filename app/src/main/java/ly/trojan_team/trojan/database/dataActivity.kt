package ly.trojan_team.trojan.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import ly.trojan_team.trojan.R
import ly.trojan_team.trojan.database.data.dbRoom.UserDb

class dataActivity : AppCompatActivity() {
    private lateinit var user1 : UserDb
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val database = Room.databaseBuilder(this, UserDb::class.java  ,  name= "campdb").build()
        val user = User(2,"jjj","7654")
        GlobalScope.launch {
            //val users = database.getuserDao().getAll()
            //val users = database.getuserDao().insertUser(user)
            val users = database.getuserDao().loadAllByIds(1)
            Toast.makeText(applicationContext,users.toString(),Toast.LENGTH_SHORT).show()
        }


    }
}