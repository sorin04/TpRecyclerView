package com.michael.rv_2024.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModelDetail : ViewModel() {
    private val _selectedEtudiant = MutableLiveData<Etudiant>()
    val selectedEtudiant: LiveData<Etudiant> get() = _selectedEtudiant

    fun updateData(etudiant: Etudiant) {
        _selectedEtudiant.value = etudiant
    }
}
