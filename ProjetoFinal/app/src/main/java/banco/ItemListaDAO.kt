package banco

import android.content.ContentValues
import android.content.Context
import android.util.Log
import model.ItemLista

/**
 * Created by Toronto on 25/02/2018.
 */
class ItemListaDAO {
    lateinit var bancoHelper: BancoHelper
    val TABELA = "shoppingList"

    constructor(contexto: Context){
        this.bancoHelper = BancoHelper(contexto)
    }

    fun insert(i: ItemLista){
        val banco = this.bancoHelper.writableDatabase
        val cv = ContentValues()
        cv.put("item", i.item)
        cv.put("valor", i.valor)
        banco.insert(TABELA, null, cv)
    }

    fun select(): List<ItemLista>{
        val lista = arrayListOf<ItemLista>()
        val banco = this.bancoHelper.readableDatabase
        val colunas = arrayOf("id", "item", "valor")
        val c = banco.query(TABELA, colunas, null, null, null, null, null)

        c.moveToFirst()

        do{
            // recuperar id, item, valor
            val id = c.getInt(c.getColumnIndex("id"))
            val item = c.getString(c.getColumnIndex("item"))
            val valor = c.getFloat(c.getColumnIndex("valor"))

            // instanciar um item
            val i = ItemLista(id, item, valor)
            Log.i("APP", i.toString())

            // adicionar item na lista
            lista.add(i)
        } while (c.moveToNext())

        return lista
    }

    fun delete(id: Int){

    }

    fun update(i: ItemLista){

    }
}