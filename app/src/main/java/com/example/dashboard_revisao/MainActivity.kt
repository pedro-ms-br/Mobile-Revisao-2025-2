package com.example.dashboard_revisao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.dashboard_revisao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // ao acionar o botao com o listener
        binding.buttonConfirmacaoLogin.setOnClickListener {
            val login = binding.editTextEmailInput.text.toString().trim()
            val senha = binding.editTextSenhaInput.text.toString().trim()

            if (login.equals("angelo") && senha.equals("heitor")) {
                val intent = Intent(this, DashboardActivity::class.java)
                intent.putExtra("LOGIN_USUARIO", login)
                startActivity(intent)

                finish()
            } else {
                Toast.makeText(this, "Login ou senha incorreto",
                    Toast.LENGTH_LONG).show()

            }
        }
    }
}