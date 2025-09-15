package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

// Ubah constructor untuk menerima List<String>
class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val tabContents: List<String> // Daftar deskripsi
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    // getItemCount sekarang berdasarkan ukuran list yang diterima
    override fun getItemCount(): Int {
        return tabContents.size
    }

    // createFragment sekarang mengirimkan konten String langsung
    override fun createFragment(position: Int): Fragment {
        return CafeDetailFragment.newInstance(tabContents[position])
    }
}