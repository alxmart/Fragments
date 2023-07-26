package com.luizafmartinez.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.luizafmartinez.fragments.fragments.ChamadasFragment
import com.luizafmartinez.fragments.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnConversas : Button
    private lateinit var btnChamadas  : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Ciclo_Vida", "Activity onCreate")

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas  = findViewById(R.id.btn_chamadas)

//        val fragmentManager = supportFragmentManager.beginTransaction()
//        // Diversas alterações em fragments
//        fragmentManager.add( R.id.fragment_conteudo,ConversasFragment() )
//        fragmentManager.commit()

        //val conversasFragment = ConversasFragment() => Para usar c/ remove

        btnConversas.setOnClickListener {
            supportFragmentManager
            .beginTransaction()
            .replace( R.id.fragment_conteudo, ConversasFragment() )
            .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo, ChamadasFragment() )
                //.remove(conversasFragment)
                .commit()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i("Ciclo_Vida", "Activity onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Ciclo_Vida", "Activity onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("Ciclo_Vida", "Activity onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("Ciclo_Vida", "Activity onStop")
    }
    override fun onDestroy() {
        Log.i("Ciclo_Vida", "Activity onDestroy")
        super.onDestroy()
    }

}

