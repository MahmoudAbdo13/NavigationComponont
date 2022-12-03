package com.grand.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val usernameEditText = view.findViewById<EditText>(R.id.edit_text_username)
        val passwordEditText = view.findViewById<EditText>(R.id.edit_text_password)
        val username = passwordEditText.text.toString()
        val password = passwordEditText.text.toString()

        val confirm = view.findViewById<Button>(R.id.button_confirm)
        confirm.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)
        }
    }
}