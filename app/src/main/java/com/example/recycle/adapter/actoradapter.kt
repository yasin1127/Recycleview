package com.example.recycle.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle.databinding.ItemBinding
import com.example.recycle.hollywoodstar.actor


class actoradapter(private val actorList: ArrayList<actor>) :RecyclerView.Adapter<actoradapter.aviewholder>() {
    class aviewholder (val binding:ItemBinding) : RecyclerView.ViewHolder(binding.root)    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): aviewholder {
    val view = ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return aviewholder(view)
    }

    override fun getItemCount(): Int {
      return actorList.size
    }

    override fun onBindViewHolder(holder: aviewholder, position: Int) {
       var acto =actorList[position]
        holder.binding.apply {
            img.setImageResource(acto.image)
            protx.text=acto.name
            destx.text=acto.description
        }
    }

}