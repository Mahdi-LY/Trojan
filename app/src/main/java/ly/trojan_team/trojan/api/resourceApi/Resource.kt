package ly.trojan_team.trojan.api.resourceApi

sealed class Resource<T>(){
    data class Successful<T>(var data : T):Resource<T>()
    data class Error<T>(var message : String):Resource<T>()
}
