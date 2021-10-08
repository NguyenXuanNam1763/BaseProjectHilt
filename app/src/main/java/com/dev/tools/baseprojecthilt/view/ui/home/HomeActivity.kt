package com.dev.tools.baseprojecthilt.view.ui.home

import android.os.Bundle
import androidx.activity.viewModels
import com.dev.tools.baseprojecthilt.base.BaseActivity
import com.dev.tools.baseprojecthilt.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    private val viewModel: HomeViewModel by viewModels()

    override fun getBinding(): ActivityHomeBinding {
        return ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}