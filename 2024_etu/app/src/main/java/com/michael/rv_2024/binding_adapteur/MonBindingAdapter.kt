package com.michael.rv_2024.binding_adapteur

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("lireImageUrl")
fun ImageView.loadImageUrl(url:String?){
    try {
        Glide.with(context).load(url).into(this)
    }catch (e:Exception){}
}
