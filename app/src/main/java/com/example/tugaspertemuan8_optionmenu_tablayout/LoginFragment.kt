package com.example.tugaspertemuan8_optionmenu_tablayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import com.example.tugaspertemuan8_optionmenu_tablayout.RegisterFragment.Companion.password
import com.example.tugaspertemuan8_optionmenu_tablayout.RegisterFragment.Companion.username

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val inputUsername = view.findViewById<EditText>(R.id.edit_text_username)
        val inputPassword = view.findViewById<EditText>(R.id.edit_text_password)

        view.findViewById<View>(R.id.btn_login).setOnClickListener() {
            if (inputUsername.text.toString().isEmpty()) {
                view.findViewById<EditText>(R.id.edit_text_username).error = "Masukkan username"
                return@setOnClickListener
            }

            if (inputPassword.text.toString().isEmpty()) {
                view.findViewById<EditText>(R.id.edit_text_password).error = "Masukkan password"
                return@setOnClickListener
            }

            if (inputUsername.text.toString() == username && inputPassword.text.toString() == password) {
                val intent = Intent(activity, MainActivity2::class.java)

                inputUsername.text.clear()
                inputPassword.text.clear()

                with(view){
                    findViewById<CheckBox>(R.id.checkbox2).isChecked = false
                }

                startActivity(intent)
            }

        }

        with(view){

            findViewById<View>(R.id.text_view_register).setOnClickListener() {
                MainActivity.viewPager2a.setCurrentItem(0)
            }
        }

        return view
    }
}