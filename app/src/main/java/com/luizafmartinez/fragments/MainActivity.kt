package com.luizafmartinez.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.luizafmartinez.fragments.fragments.ChamadasFragment
import com.luizafmartinez.fragments.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas : Button
    private lateinit var btnChamadas  : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas  = findViewById(R.id.btn_chamadas)

//        val fragmentManager = supportFragmentManager.beginTransaction()
//        // Diversas alterações em fragments
//        fragmentManager.add( R.id.fragment_conteudo,ConversasFragment() )
//        fragmentManager.commit()

        val conversasFragment = ConversasFragment()

        btnConversas.setOnClickListener {
            supportFragmentManager
            .beginTransaction()
            .replace( R.id.fragment_conteudo, conversasFragment )
            .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo,ChamadasFragment() )
                //.remove(conversasFragment)
                .commit()
        }



    }
}




