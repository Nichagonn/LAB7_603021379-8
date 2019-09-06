package com.example.lab7dialogrv_sec2_603021379_8

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab7dialogrv_sec2_603021379_8.Student
import kotlinx.android.synthetic.main.std_item_layout.view.*
import java.security.AccessControlContext


class StudentsAdapter(val items :List<Student>, val context: Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.std_item_layout, parent, false)
        return ViewHolder(view_item)
    }


    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvID?.text = "รหัสนักศึกษา : "+ items[position].id
        holder.tvName?.text = "ชื่อ : "+ items[position].name
        holder.tvAge?.text = "อายุ : "+ items[position].age.toString()
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    val tvID : TextView = view.tv_id
    val  tvName : TextView = view.tv_name
    val  tvAge : TextView = view.tv_age
}
