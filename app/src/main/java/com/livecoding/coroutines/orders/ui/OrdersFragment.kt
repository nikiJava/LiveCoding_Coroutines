package com.livecoding.coroutines.orders.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.livecoding.coroutines.R
import com.livecoding.coroutines.orders.Dependencies

class OrdersFragment : Fragment() {

    // пример инициализации OrdersApi
    private val api = Dependencies.ordersApi

    companion object {
        fun newInstance() = OrdersFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_user_orders, container, false)
    }
}