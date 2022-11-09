package com.livecoding.coroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.livecoding.coroutines.orders.ui.OrdersFragment

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, OrdersFragment.newInstance())
                .commitNow()
        }
    }
}