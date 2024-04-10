package com.geeks.a8th_groop.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.a8th_groop.HomeItem
import com.geeks.a8th_groop.databinding.ItemHomeBinding

class HomeAdapter(private val homeItems: List<HomeItem>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = homeItems[position]
        holder.bind(item)
    }

    override fun getItemCount() = homeItems.size

    class HomeViewHolder(private val binding: ItemHomeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(homeItem: HomeItem) {
            with(binding) {
                tvName.text = homeItem.name
                tvDesc.text = homeItem.desc
                tvPrice.text = homeItem.price
            }
        }
    }
}
