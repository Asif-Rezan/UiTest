package com.asifrezan.uitest.fregments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.asifrezan.uitest.MainActivity
import com.asifrezan.uitest.R


class WelcomeFragment : Fragment() {

    private lateinit var skip : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false )

        skip = view.findViewById(R.id.skip)

        skip.setOnClickListener(View.OnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)

        })






        return view
    }


}