package com.example.toronto.projetofinal


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var etProduto: EditText
    lateinit var btAdd: Button
    lateinit var listaProd: ListView

    lateinit var btVerLista: Button
    val VerLista = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.listaProd = findViewById(R.id.listaItem)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)
        this.listaProd.adapter = adapter

        this.etProduto = findViewById(R.id.etItem)
        this.btAdd = findViewById(R.id.btnAddItem)
        this.btAdd.setOnClickListener({add(it)})

        this.btVerLista = findViewById(R.id.btnLista)
        this.btVerLista.setOnClickListener({onClick(it)})

    }

    fun add(it: View){
        val st = this.etProduto.text.toString()
        (this.listaProd.adapter as ArrayAdapter<String>).add(st)
    }

    fun onClick(view: View){

        val it = Intent(this, VerListaActivity::class.java)
        startActivityForResult(it, VerLista)


    }
}
