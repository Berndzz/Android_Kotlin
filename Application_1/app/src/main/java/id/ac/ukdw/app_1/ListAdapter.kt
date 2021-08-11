package id.ac.ukdw.app_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val listRec:ArrayList<List_recommended>):RecyclerView.Adapter<ListAdapter.ListHolder>(){

    class ListHolder(private val l: View):RecyclerView.ViewHolder(l){
        private var lists : List_recommended?=null
        fun bindView(lists:List_recommended){
            this.lists
            l.findViewById<TextView>(R.id.tvJudul).text = lists.nama
            l.findViewById<TextView>(R.id.tvWaktu).text = lists.waktu
            l.findViewById<ImageView>(R.id.ivRec).setImageResource(lists.Rec)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val l = LayoutInflater.from(parent.context).inflate(R.layout.activity_recommended,parent,false)
        return ListHolder(l)
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bindView(listRec[position] )
    }

    override fun getItemCount(): Int {
        return listRec.size
    }

}