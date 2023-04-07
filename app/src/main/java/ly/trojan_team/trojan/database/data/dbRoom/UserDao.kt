package ly.trojan_team.trojan.database.data.dbRoom

import androidx.room.*
import ly.trojan_team.trojan.database.User

@Dao
interface UserDao {

    @Query("SELECT * FROM userinfo")
    fun getAllUserInfo(): List<UserEntity>?

    @Insert (onConflict = 1)
    fun insertUser( user : UserEntity)

    @Delete
    fun deleteUser(user: UserEntity)

    @Update
    fun updateUser(user: UserEntity)
//
//    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): User
//
//
//    @Delete
//    fun delete(user: User)
}