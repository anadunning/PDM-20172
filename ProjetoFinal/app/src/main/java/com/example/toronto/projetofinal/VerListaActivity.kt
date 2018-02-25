package com.example.toronto.projetofinal

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class VerListaActivity : AppCompatActivity() {
    lateinit var btVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_lista)

        this.btVoltar = findViewById(R.id.btnVoltar)
        this.btVoltar.setOnClickListener({onClick(it)})
    }

    fun onClick(view: View){
        val it = Intent()

        setResult(Activity.RESULT_OK, it)
        finish()
    }
}
