package ly.trojan_team.trojan.loginpage.data.repository

import ly.trojan_team.trojan.loginpage.data.entity.UserEntity
import ly.trojan_team.trojan.loginpage.recurce.Recurce

interface  LoginRepository<M,E> {
    fun login(user: UserEntity): Recurce<E>
    fun logout()
    fun signup(user: UserEntity): Recurce<E>
}