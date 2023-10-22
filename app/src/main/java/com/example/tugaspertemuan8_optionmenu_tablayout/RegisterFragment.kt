package com.example.tugaspertemuan8_optionmenu_tablayout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tugaspertemuan8_optionmenu_tablayout.databinding.FragmentRegisterBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {
    private lateinit var binding : FragmentRegisterBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            // ini mendapatkan komponen btnRegister
            /* btnREgister ini memiliki beberapa fungsi dan method
            * salah satunya setOnClik listerner
            *
            * set on click listener ini digunakan untuk membuat listener ketika
            * objek terbut di klik oleh user*/
            /*kita disini akan membuat varibael objek untuk intent
            * intent ini akan digunakan untuk melakukan start activity page berikutnya*/
            btnRegister.setOnClickListener {
                val iniVariableObjectIntent = Intent(this@RegisterFragment, LoginFragment::class.java)
                iniVariableObjectIntent.putExtra(EXTRA_USERNAME, editTextUsername.text.toString())
                iniVariableObjectIntent.putExtra(EXTRA_EMAIL, editTextEmail.text.toString())
                iniVariableObjectIntent.putExtra(EXTRA_PHONE, editTextPhone.text.toString())
                clear_form()
                startActivity(iniVariableObjectIntent)
            }


            textViewCondition.setOnClickListener(){
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com/")
            }

            textViewLogin.setOnClickListener(){
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com/")
            }

            textViewTerms.setOnClickListener(){
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com/")
            }
        }
    }

    fun clear_form(){
        with(binding){
            editTextEmail.text.clear()
            editTextPhone.text.clear()
            editTextUsername.text.clear()
            editTextPassword.text.clear()

        }
    }
}