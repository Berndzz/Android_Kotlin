package id.ac.ukdw.app_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("username")
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        tvUsername.text = "Selamat Datang $username"

        val listRec = ArrayList<List_recommended>()
        listRec.add(List_recommended("Chatting","5 minutes",R.mipmap.ic_message))
        listRec.add(List_recommended("Listens","2 minutes",R.mipmap.ic_headset))
        listRec.add(List_recommended("Speak","3 minutes",R.mipmap.ic_mic))

        val rvRec = findViewById<RecyclerView>(R.id.rvRecommended)
        rvRec.layoutManager = LinearLayoutManager(this)

        val listAdap = ListAdapter(listRec)
        rvRec.adapter= listAdap

    }
}