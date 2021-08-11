package id.ac.ukdw.app_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("username")
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        tvUsername.text = "Selamat Datang $username"
    }
}