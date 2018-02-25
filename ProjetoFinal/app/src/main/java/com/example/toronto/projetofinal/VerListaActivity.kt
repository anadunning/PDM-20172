package com.example.toronto.projetofinal

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_ver_lista.*
import kotlinx.android.synthetic.main.activity_ver_lista.view.*
import org.w3c.dom.Text

class VerListaActivity : AppCompatActivity() {
    lateinit var lista: TextView
    //lateinit var lista: ListView
    lateinit var layout: LinearLayout
    lateinit var btVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_lista)

        this.lista = findViewById(R.id.tvShoppingList)
        this.lista.text = intent.getStringExtra("LISTA")

        this.layout = findViewById(R.id.layoutVerLista)

        this.btVoltar = findViewById(R.id.btnVoltar)
        this.btVoltar.setOnClickListener({onClick(it)})
    }

    fun onClick(view: View){
        val it = Intent()

        setResult(Activity.RESULT_OK, it)
        finish()
    }
}
