package com.example.anvalue

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.value_layout.view.*

class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<privatbankItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.value_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].ccy
        holder.itemView.item_buy.text = listStart[position].buy
        holder.itemView.item_sale.text = listStart[position].sale
        holder.itemView.item_base.text = listStart[position].base_ccy
    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<privatbankItem>){
        listStart = list
        notifyDataSetChanged()
    }
}