package banco

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by Toronto on 25/02/2018.
 */

val VERSAO = 1

class BancoHelper(context: Context?) : SQLiteOpenHelper(context, "itemLista.sql3", null, VERSAO) {

    override fun onCreate(db: SQLiteDatabase?){
        val sql = "create table shoppingList(id integer primary key autoincrement, item text, valor float);"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int){
        db?.execSQL("drop table shoppingList")
        this.onCreate(db)
    }

}