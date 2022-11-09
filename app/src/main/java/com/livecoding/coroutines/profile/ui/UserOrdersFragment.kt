package com.livecoding.coroutines.profile.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.livecoding.coroutines.R
import com.livecoding.coroutines.profile.Dependencies

class UserOrdersFragment : Fragment() {

    // пример инициализации UserOrdersApi
    private val api = Dependencies.profileApi

    companion object {
        fun newInstance() = UserOrdersFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_user_orders, container, false)
    }
}