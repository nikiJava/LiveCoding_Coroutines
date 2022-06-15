package com.livecoding.coroutines.userorders.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.livecoding.coroutines.userorders.domain.OrdersInteractor
import com.livecoding.coroutines.userorders.domain.UserOrder
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserOrderViewModel @Inject constructor(
    private val interactor: OrdersInteractor,
) : ViewModel() {

    val audioRecordsLiveData: MutableLiveData<MutableList<UserOrder>> = MutableLiveData()


    fun onFetchOrdersButtonClicked() =
        fetchOrders()

    private fun fetchOrders() {
        viewModelScope.launch {
            val orders = async { interactor.fetchOrders() }
            val users = async { interactor.fetchUsers() }


        }
    }

    private fun updateOrderList() {

    }
}