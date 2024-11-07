package com.example.proyectomovil1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast


class InicioFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val linearLayout1 = view.findViewById<LinearLayout>(R.id.news1)
        val linearLayout2 = view.findViewById<LinearLayout>(R.id.news2)
        val linearLayout3 = view.findViewById<LinearLayout>(R.id.news3)
        val linearLayout4 = view.findViewById<LinearLayout>(R.id.news4)

        linearLayout1.setOnClickListener(){
            Toast.makeText(requireContext(), "LinearLayout1 clicked!", Toast.LENGTH_SHORT).show()
        }
        linearLayout2.setOnClickListener(){
            Toast.makeText(requireContext(), "LinearLayout2 clicked!", Toast.LENGTH_SHORT).show()
        }
        linearLayout3.setOnClickListener(){
            Toast.makeText(requireContext(), "LinearLayout3 clicked!", Toast.LENGTH_SHORT).show()
        }
        linearLayout4.setOnClickListener(){
            Toast.makeText(requireContext(), "LinearLayout4 clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}