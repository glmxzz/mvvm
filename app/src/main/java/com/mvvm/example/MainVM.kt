package com.mvvm.example

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class MainVM : ViewModel() {
    val content = ObservableField<String>()
    val textContent = ObservableField<String>()

}