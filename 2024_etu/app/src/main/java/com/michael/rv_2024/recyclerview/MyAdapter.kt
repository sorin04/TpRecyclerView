package com.michael.rv_2024.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.michael.rv_2024.databinding.ItemEtudiantBinding
import com.michael.rv_2024.models.Etudiant
import kotlinx.coroutines.NonDisposableHandle.parent

class MyAdapter(private val lesEtudiants:ArrayList<Etudiant>):RecyclerView.Adapter<MyHolder>()       {
    private lateinit var binding: ItemEtudiantBinding
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyHolder {
        val binding=ItemEtudiantBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  MyHolder(binding)

    }

    override fun getItemCount(): Int {
        return lesEtudiants.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(lesEtudiants.get(position))


    }


}