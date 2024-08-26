package com.fadhiil2010.projectlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val username_input: EditText = findViewById(R.id.username_input)
        val password_input: EditText = findViewById(R.id.password_input)
        val login_btn: Button = findViewById(R.id.login_btn)

        login_btn.setOnClickListener {
            val username =username_input.text.toString()
            val password =password_input.text.toString()

            if (username == "admin" && password=="123456"){
                val intent = Intent(this, page2::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Pasword atau Username anda salah", Toast.LENGTH_SHORT).show()
            }
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
    }
}