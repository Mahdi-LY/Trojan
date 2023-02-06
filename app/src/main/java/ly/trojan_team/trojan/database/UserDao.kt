package ly.tasks.roomapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ly.trojan_team.trojan.database.User

@Dao
interface UserDao {

    @Query("SELECT * FROM usertb")
    fun getAll(): List<User>

    @Insert (onConflict = 1)
    fun insertUser(vararg user : User)

//    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
//    fun loadAllByIds(userIds: IntArray): List<User>
//
//    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): User
//

//    @Delete
//    fun delete(user: User)
}