package ly.trojan_team.trojan.loginpage.recurce

sealed class Recurce<T>(data:T?=null) {
    object Loading
     class Init<T>(): Recurce<T>()
    data class Succusfuly<T>(var data: T?=null): Recurce<T>(data)
    data class Error<T>(var message: T?=null): Recurce<T>()
}