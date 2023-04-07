package ly.trojan_team.trojan.database.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import ly.trojan_team.trojan.database.data.dbRoom.RoomDbApp
import ly.trojan_team.trojan.database.data.dbRoom.UserEntity

class MainActivityViewModel(app:Application):AndroidViewModel(app) {
    lateinit var allUsers : MutableLiveData<List<UserEntity>>

    init {
        allUsers = MutableLiveData()
    }

    fun getAllUserObserves():MutableLiveData<List<UserEntity>>{
        return allUsers
    }


}