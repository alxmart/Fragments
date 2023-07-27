package com.luizafmartinez.fragments.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.luizafmartinez.fragments.R

//class ConversasFragment : Fragment(R.layout.fragment_conversas) {
class ConversasFragment : Fragment() {

    private lateinit var editNome : EditText
    private lateinit var btnExecutar : Button
    private lateinit var textNome : TextView
    private lateinit var textCategoria : TextView

    private var categoria : String? = null   //*****
    private var usuario : String? = null   //*****

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Ciclo_Vida", "Fragment onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Ciclo_Vida", "Fragment onCreate")

        categoria = arguments?.getString("categoria") //****
        usuario = arguments?.getString("usuario") //****
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Ciclo_Vida", "Fragment onCreateView")
            val view = inflater.inflate(
                R.layout.fragment_conversas,
                container,
                false
            )
            // Processamento da Visualização
            //view.findViewById<>()
            //No caso do Fragment, precisa usar view.findViewById pq nao tem
            // um setContentView(R.layout.activity_main)

            editNome =  view.findViewById(R.id.edit_nome)
            btnExecutar =  view.findViewById(R.id.btn_executar)
            textNome =  view.findViewById(R.id.text_nome)
            textCategoria =  view.findViewById(R.id.text_categoria)

            textCategoria.text = categoria
            textNome.text = usuario

            btnExecutar.setOnClickListener {
               /* val nome = editNome.text.toString()
                textNome.text = nome*/
                textNome.text = editNome.text.toString()
            }

            return view
       }

    /*  DEPRECATED
        ==========
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
    */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Ciclo_Vida", "Fragment onViewCreated")
    }
    override fun onStart() {
        super.onStart()
        Log.i("Ciclo_Vida", "Fragment onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Ciclo_Vida", "Fragment onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("Ciclo_Vida", "Fragment onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("Ciclo_Vida", "Fragment onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Ciclo_Vida", "Fragment onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo_Vida", "Fragment onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i("Ciclo_Vida", "Fragment onDetach")
    }

}
