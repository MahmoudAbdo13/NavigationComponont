package com.grand.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private val args: WelcomeFragmentArgs by navArgs()

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val username = view.findViewById<TextView>(R.id.text_view_username)
        val password = view.findViewById<TextView>(R.id.text_view_password)
        val ok = view.findViewById<Button>(R.id.button_ok)
        username.text = args.username
        password.text = args.password

        ok.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}