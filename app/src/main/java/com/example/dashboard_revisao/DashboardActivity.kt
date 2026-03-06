package com.example.dashboard_revisao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.example.dashboard_revisao.databinding.ActivityDashboardBinding
import com.example.dashboard_revisao.databinding.ActivityMainBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding // declarar o binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityDashboardBinding.inflate(layoutInflater)

        setContentView(binding.root) // set view

        val loginUsuario = intent.getStringExtra("LOGIN_USUARIO") ?: "Desconhecido"
        binding.TextUsuario.text = "Bem-vindo, $loginUsuario"

        binding.imageViewLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}