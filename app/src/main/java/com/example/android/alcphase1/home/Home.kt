package com.example.android.alcphase1.home

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.android.alcphase1.R
import com.example.android.alcphase1.databinding.HomeFragmentBinding


class Home : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = HomeFragmentBinding.inflate(inflater)
        val viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)

        viewModel.navigateAbout.observe(this, Observer {
            it?.let {
                if (it) {
                    this.findNavController().navigate(HomeDirections.actionHome2ToAbout())
                    viewModel.endAboutNavigation()
                }
            }
        })

        viewModel.navigateProfile.observe(this, Observer {
            it?.let {
                if (it) {
                    this.findNavController().navigate(HomeDirections.actionHome2ToProfile())
                    viewModel.endProfileNavigation()
                }
            }
        })

        return binding.root
    }
}
