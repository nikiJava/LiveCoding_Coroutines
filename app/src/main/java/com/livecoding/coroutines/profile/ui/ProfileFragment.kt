package com.livecoding.coroutines.profile.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.livecoding.coroutines.R
import com.livecoding.coroutines.profile.Dependencies

class ProfileFragment : Fragment() {

    // пример инициализации ProfileApi
    private val api = Dependencies.profileApi

    companion object {
        fun newInstance() = ProfileFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
}