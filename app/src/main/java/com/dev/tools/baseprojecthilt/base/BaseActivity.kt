package com.dev.tools.baseprojecthilt.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {

    private var binding: T? = null

    abstract fun getBinding(): T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = getBinding()
        this.setContentView(this.binding!!.root)
    }
}