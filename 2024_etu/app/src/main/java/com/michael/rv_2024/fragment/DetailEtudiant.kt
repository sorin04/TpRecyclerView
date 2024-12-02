package com.michael.rv_2024.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.michael.rv_2024.databinding.ActivityEmptyBinding
import com.michael.rv_2024.models.DataViewModelDetail
import com.michael.rv_2024.models.Etudiant

class DetailEtudiant:Fragment() {
    private lateinit var binding:ActivityEmptyBinding
    private lateinit var viewmodelPartageDetails: DataViewModelDetail

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewmodelPartageDetails= ViewModelProvider(requireActivity()).get(DataViewModelDetail::class.java)
        binding=ActivityEmptyBinding.inflate(inflater,container,false)
        binding.lifecycleOwner=this@DetailEtudiant
        binding.etudiant=viewmodelPartageDetails
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.imageButton.setOnClickListener{
            parentFragmentManager.popBackStack()
        }
    }
}