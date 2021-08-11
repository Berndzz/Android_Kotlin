package id.ac.ukdw.app_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val etUsername = findViewById<EditText>(R.id.etUsername)
     val etPassword = findViewById<EditText>(R.id.etPassword)
     val btnLogin   = findViewById<Button>(R.id.btnLogin)
     val intent     = Intent(this,HomeActivity::class.java)

     btnLogin.setOnClickListener{
            if(etPassword.text.toString().equals("123456")){
                pesan("Login Berhasil")
                intent.putExtra("username",etUsername.text.toString())
                startActivity(intent)
            }
            else{
                pesan("Login gagal")
            }
         }
    }

    private fun pesan(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}