package com.example.newproject20jan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NewAdapter( private val ListNews :ArrayList<News>):RecyclerView.Adapter<NewAdapter.NewClass>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewClass {
        val ItemView1 = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item,parent,false)

        return NewClass(ItemView1)
    }

    override fun onBindViewHolder(holder: NewClass, position: Int) {
        val currentItem = ListNews[position]
        holder.name.text = currentItem.newsHead
        holder.roll.text = currentItem.title
        holder.img.setBackgroundResource(currentItem.img)

    }

    override fun getItemCount(): Int {
        return ListNews.size
    }






    class NewClass(view: View):RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.textView)
        val roll = view.findViewById<TextView>(R.id.textView2)
        val img = view.findViewById<Button>(R.id.imageView)
    }


}