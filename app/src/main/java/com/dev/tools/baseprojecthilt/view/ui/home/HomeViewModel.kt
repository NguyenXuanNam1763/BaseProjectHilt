package com.dev.tools.baseprojecthilt.view.ui.home

import com.dev.tools.baseprojecthilt.base.BaseViewModel
import com.dev.tools.baseprojecthilt.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) :
    BaseViewModel() {
}