package model

/**
 * Created by Toronto on 25/02/2018.
 */
class ItemLista {
    var id: Int
    var item: String
    var valor: Float

    constructor(id: Int, item: String, valor: Float){
        this.id = id
        this.item = item
        this.valor = valor
    }

    constructor(item: String, valor: Float){
        this.id = -1
        this.item = item
        this.valor = valor
    }

    override fun toString(): String {
        return "${id} - ${item} - ${valor}"
    }

}