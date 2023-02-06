package ly.trojan_team.trojan.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import ly.trojan_team.trojan.database.core.baseModel.BaseModel
import ly.trojan_team.trojan.database.entity.UserEntity

@Entity(tableName = "Usertb")
data class User(

    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "phone_number") val phoneNumber: String


):BaseModel<User,UserEntity>(){
    override fun convert(): UserEntity {
        return UserEntity(id=this.id,name=this.name,phoneNumber=this.phoneNumber)
    }
}
