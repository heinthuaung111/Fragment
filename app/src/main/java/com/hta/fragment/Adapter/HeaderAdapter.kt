package com.hta.fragment.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hta.fragment.Model.Header
import com.hta.fragment.R
import kotlinx.android.synthetic.main.item_header.view.*

class HeaderAdapter (var header:ArrayList<Header>):RecyclerView.Adapter<HeaderAdapter.HeaderViewHoler>()
{
    inner class HeaderViewHoler(headerview:View):RecyclerView.ViewHolder(headerview)
    {
        fun bindheader(obj:Header){
            itemView.txtname.text=obj.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):HeaderViewHoler{
    var view=LayoutInflater.from(parent.context).inflate(R.layout.item_header,parent,false)
    return HeaderViewHoler(view)
    }

    override fun getItemCount(): Int {
        return header.size
    }

    override fun onBindViewHolder(holder: HeaderViewHoler, position: Int) {
        holder.bindheader(header[position])
    }
}

