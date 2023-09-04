package com.example.login
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.userTxt)
        passwordEditText = findViewById(R.id.txtClave)
        loginButton = findViewById(R.id.loginBoton)

        loginButton.setOnClickListener{
            validarUsuario()
        }

        val acceder = findViewById<Button>(R.id.loginBoton)
        acceder.setOnClickListener{
            validarUsuario()
        }
    }
    //para validar usuario se utiliza variable local
    private fun validarUsuario(){
        val usuario =usernameEditText.text.toString()
        val clave = passwordEditText.text.toString()
        val i = Intent(this, pagina1::class.java)
        startActivity(i)

        if(usuario == "adm" && clave == "1234") {
            //para mostrar en pantalla si es o no el usuario
            Toast.makeText(this, "Usuario Correcto", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Usuario no existe", Toast.LENGTH_SHORT).show()
        }

    }
}