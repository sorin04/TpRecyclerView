package com.michael.rv_2024.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.michael.rv_2024.MainActivity
import com.michael.rv_2024.R
import com.michael.rv_2024.databinding.FragmentMainBinding
import com.michael.rv_2024.models.DataViewModel
import com.michael.rv_2024.recyclerview.MyAdapter
import com.michael.rv_2024.retrofit.ApiAdapteur
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Main:Fragment(R.layout.fragment_main  )    {
    private lateinit var binding : FragmentMainBinding
    private lateinit var viewmodelPartage: DataViewModel



    override fun onCreateView(inflater: LayoutInflater, container:ViewGroup?,saveInstanceState: Bundle?) :View?{
        viewmodelPartage=ViewModelProvider(requireActivity()).get(DataViewModel::class.java)
        binding = FragmentMainBinding.inflate(inflater,container,false)
        miseAJour()
        return binding.root
    }


    private fun miseAJour(){
        GlobalScope.launch  (Dispatchers.Main) {
            val response=ApiAdapteur.apiClient.getTousLesEtudiantsEtudiants()
            if (response.isSuccessful){
                response.body()?.let { arEtudiants ->viewmodelPartage.updateData(arEtudiants) }
                binding.rvEtudiants.adapter=MyAdapter(viewmodelPartage.data.value!!)
                binding.rvEtudiants.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            }
        }
    }




}