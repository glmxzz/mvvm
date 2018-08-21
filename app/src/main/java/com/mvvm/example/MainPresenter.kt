package com.mvvm.example

class MainPresenter {

    fun show(mainVM: MainVM) {
        mainVM.textContent.set(mainVM.content.get())
    }
}