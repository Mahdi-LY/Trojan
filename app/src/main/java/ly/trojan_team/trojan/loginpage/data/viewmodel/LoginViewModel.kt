package ly.trojan_team.trojan.loginpage.data.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ly.trojan_team.trojan.loginpage.data.entity.UserEntity
import ly.trojan_team.trojan.loginpage.data.repository.LoginRepositoryImp
import ly.trojan_team.trojan.loginpage.recurce.Recurce

class LoginViewModel:ViewModel() {
   var resurce = Recurce.Init<UserEntity>()
    var state = MutableLiveData<Recurce<UserEntity>>(resurce)
    val loginRepository = LoginRepositoryImp()
   fun login(user: UserEntity){
      val rer= loginRepository.login(user)
       state.value=rer
   }
    fun signup(user: UserEntity){
        var rer= loginRepository.signup(user)
        state.value=rer
    }
}