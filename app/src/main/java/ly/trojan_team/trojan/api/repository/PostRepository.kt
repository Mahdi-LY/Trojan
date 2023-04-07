package ly.trojan_team.trojan.api.repository

import ly.trojan_team.trojan.api.resourceApi.Resource
import kotlinx.coroutines.flow.Flow
import ly.trojan_team.trojan.api.model.Posts

interface PostRepository {
    fun getPosts() : Flow<Resource<Posts>>
}