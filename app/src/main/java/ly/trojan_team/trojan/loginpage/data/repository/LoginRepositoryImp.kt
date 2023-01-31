package ly.trojan_team.trojan.loginpage.data.repository

import android.util.Log
import android.widget.Toast
import ly.trojan_team.trojan.loginpage.data.entity.UserEntity
import ly.trojan_team.trojan.loginpage.data.model.UserModel
import ly.trojan_team.trojan.loginpage.recurce.Recurce

class LoginRepositoryImp: LoginRepository<UserModel, UserEntity> {
var userlist = mutableListOf<UserEntity>(
    UserEntity(username = "m", password = "123"),
    UserEntity(username = "mm", password = "mm")
)
    override fun login(user: UserEntity): Recurce<UserEntity> {
        for (userin in userlist){
            if (user.password==userin.password && user.username==userin.username){
                return Recurce.Succusfuly<UserEntity>(data = user)
            }
        }
        return Recurce.Error<UserEntity>()
    }
    override fun logout() {

    }

    override fun signup(user: UserEntity): Recurce<UserEntity> {
        Log.d("Login",userlist.toString())
        var flag : Boolean = false
        for (userin in userlist){
            if (user.username==userin.username){
                return Recurce.Error<UserEntity>()
                flag = true
            }
        }
        if(!flag) {
            userlist.add(UserEntity(username=user.username,password=user.password))
            flag = false
        }
        Log.d("Login",userlist.toString())
        return Recurce.Succusfuly<UserEntity>(data = user)
    }


}