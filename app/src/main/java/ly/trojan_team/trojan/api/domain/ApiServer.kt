package ly.trojan_team.trojan.api.domain

import ly.trojan_team.trojan.api.model.Posts
import retrofit2.Response
import retrofit2.http.GET

interface ApiServer {
        @GET(value = "posts")
    suspend fun getPost():Response<Posts>

//    @POST
//    fun addPost()
}