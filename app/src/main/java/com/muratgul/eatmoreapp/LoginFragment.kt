package com.muratgul.eatmoreapp

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val root = inflater.inflate(R.layout.login_fragment, container, false)

        val btnSignUp = root.findViewById<Button>(R.id.btnSmallSignup)
        val btnLogin = root.findViewById<Button>(R.id.btnSmallLogin)
        val btnBigLogin = root.findViewById<Button>(R.id.btnBigLogin)

        btnBigLogin.setOnClickListener {
            it.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }


        btnSignUp.setOnClickListener {
            btnSignUp.setBackgroundResource(R.drawable.button_red_background)
            btnSignUp.setTextColor(Color.parseColor("#FFFFFF"))
            btnLogin.setBackgroundResource(R.drawable.button_outline_background)
            btnLogin.setTextColor(Color.parseColor("#FF0036"))
            login_linearLayout.visibility = View.GONE
            signup_linearLayout.visibility = View.VISIBLE
        }

        btnLogin.setOnClickListener {
            btnSignUp.setBackgroundResource(R.drawable.button_outline_background)
            btnSignUp.setTextColor(Color.parseColor("#FF0036"))
            btnLogin.setBackgroundResource(R.drawable.button_red_background)
            btnLogin.setTextColor(Color.parseColor("#FFFFFF"))
            login_linearLayout.visibility = View.VISIBLE
            signup_linearLayout.visibility = View.GONE
        }




        return root

    }


}