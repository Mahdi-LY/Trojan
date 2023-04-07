package ly.trojan_team.trojan.database.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ly.trojan_team.trojan.api.resourceApi.Resource
import ly.trojan_team.trojan.database.data.dbRoom.UserEntity

class UserView : ViewModel() {
    var state = MutableLiveData<Resource<UserEntity>>()
}