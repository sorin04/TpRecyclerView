package com.michael.rv_2024.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.michael.rv_2024.databinding.ItemEtudiantBinding
import com.michael.rv_2024.models.Etudiant

class MyHolder(private val binding:ItemEtudiantBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(etudiant:Etudiant){
        binding.etudiant = etudiant
    }
}