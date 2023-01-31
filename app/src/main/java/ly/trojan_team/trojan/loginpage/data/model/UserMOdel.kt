package ly.trojan_team.trojan.loginpage.data.model

import ly.trojan_team.trojan.loginpage.data.entity.UserEntity

data class UserModel(var usename:String,var password:String,var token:String,var isAdmin:Boolean=false){
    fun toEntity(): UserEntity {
        return UserEntity(username =usename, password = password)
    }
}
