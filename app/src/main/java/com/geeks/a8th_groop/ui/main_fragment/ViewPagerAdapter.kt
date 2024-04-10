package com.geeks.a8th_groop.ui.main_fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.geeks.a8th_groop.ui.contact.ContactFragment
import com.geeks.a8th_groop.ui.home.HomeFragment
import com.geeks.a8th_groop.ui.shop.ShopFragment
import com.geeks.a8th_groop.ui.about.AboutFragment

class ViewPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val fragments = listOf(
        HomeFragment(), ShopFragment(),AboutFragment(), ContactFragment()
    )
    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int): Fragment {
       return when (position) {
            0 -> HomeFragment()
            1 -> ShopFragment()
           2 -> AboutFragment()
           3-> ContactFragment()
            else -> HomeFragment()
        }
    }
}