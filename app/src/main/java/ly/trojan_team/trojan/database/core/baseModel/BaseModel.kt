package ly.trojan_team.trojan.database.core.baseModel

abstract class BaseModel<M,E> {
    abstract fun convert():E
}