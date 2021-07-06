package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumberAdapterRecycleView(val NumberList:List <BigInteger>):RecyclerView.Adapter<NumberviewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberviewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers_item_list,parent,false)
        return NumberviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberviewHolder, position: Int) {
        holder.tvNumber.text=NumberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return NumberList.size
    }
}
class NumberviewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
}