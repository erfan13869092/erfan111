package com.example.myerfan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.myerfan.databinding.RecyclerViewBinding

class AdapterRecycler : RecyclerView.Adapter<AdapterRecycler.ViewHolder>() {
     val listTask = ArrayList<String>()

    class ViewHolder(private val binding: RecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(nameList: String) {
            binding.cbRecyclerView.text = nameList
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            RecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int = listTask.size

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        holder.bind(listTask[position])
    }
}