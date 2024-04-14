package com.geeks.a8th_groop.ui.shop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.a8th_groop.ShopItem
import com.geeks.a8th_groop.databinding.ItemShopBinding

class ShopAdapter(private val homeItems: List<ShopItem>) : RecyclerView.Adapter<ShopAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ItemShopBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = homeItems[position]
        holder.bind(item)
    }

    override fun getItemCount() = homeItems.size

    class HomeViewHolder(private val binding: ItemShopBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(homeItem: ShopItem) {
            with(binding) {
                tvName.text = homeItem.name
                tvDesc.text = homeItem.desc
                tvPrice.text = homeItem.price
            }
        }
    }
}
