package com.example.android.alcphase1.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;

class HomeViewModel : ViewModel() {

    private val _navigateProfile = MutableLiveData<Boolean>()
    val navigateProfile: LiveData<Boolean>
        get() = _navigateProfile

    private val _navigateAbout = MutableLiveData<Boolean>()
    val navigateAbout: LiveData<Boolean>
        get() = _navigateAbout

    fun navigateToProfile() {
        _navigateProfile.value = true
    }

    fun navigateToAbout() {
        _navigateAbout.value = true
    }

    fun endAboutNavigation() {
        _navigateAbout.value = null
    }

    fun endProfileNavigation() {
        _navigateProfile.value = null
    }

}
