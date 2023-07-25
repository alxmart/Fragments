package com.luizafmartinez.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luizafmartinez.fragments.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fragmentManager = supportFragmentManager.beginTransaction()
//        // Diversas alterações em fragments
//        fragmentManager.add( R.id.fragment_conteudo,ConversasFragment() )
//        fragmentManager.commit()

        supportFragmentManager
            .beginTransaction()
            .add( R.id.fragment_conteudo,ConversasFragment() )
            .commit()

    }
}




