package ly.trojan_team.trojan.api.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ly.trojan_team.trojan.api.domain.ApiServer
import ly.trojan_team.trojan.api.model.Posts
import ly.trojan_team.trojan.api.resourceApi.Resource
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostRepositoryImp : PostRepository {
    override fun getPosts(): Flow<Resource<Posts>> {
        var server = Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create()).build().create(ApiServer::class.java)

        return flow {
            server.getPost()
            var result = server.getPost()
        }
    }
}