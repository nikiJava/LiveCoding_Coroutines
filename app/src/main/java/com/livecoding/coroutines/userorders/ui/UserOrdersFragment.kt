package com.livecoding.coroutines.userorders.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.livecoding.coroutines.R
import com.livecoding.coroutines.databinding.FragmentUserOrdersBinding

class UserOrdersFragment : Fragment() {

    private var binding: FragmentUserOrdersBinding? = null
    private val viewModel: ViewModel by lazy {
        ViewModelProvider(this).get(UserOrderViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_user_orders, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentUserOrdersBinding.bind(view)
        initView()
        subscribeObservables()
    }

    private fun initView() {

    }


    companion object {
        fun newInstance() = UserOrdersFragment()
    }
}