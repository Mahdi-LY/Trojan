package ly.trojan_team.trojan.loginpage.data.entity

import ly.trojan_team.trojan.loginpage.data.model.UserModel

data class UserEntity (var username:String,var password:String){
    fun toModel(): UserModel {

        return UserModel(
            usename = username,
            password = password,
            isAdmin = false, token = ""
        )
    }
}