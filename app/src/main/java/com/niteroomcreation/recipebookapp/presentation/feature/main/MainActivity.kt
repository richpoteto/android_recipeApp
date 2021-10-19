package com.niteroomcreation.recipebookapp.presentation.feature.main

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationBarView
import com.niteroomcreation.recipebookapp.R
import com.niteroomcreation.recipebookapp.databinding.AMainBinding
import com.niteroomcreation.recipebookapp.presentation.base.BaseActivity

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
class MainActivity : BaseActivity() {

    private val TAG = MainActivity::class.simpleName

    private lateinit var binding: AMainBinding
    private lateinit var navigation: NavHostFragment

    override fun onCreateInside() {
        binding = AMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun initUI() {
        Log.e(TAG, "initUI: ${TAG}" )

        setupNavigation()
    }

    private fun setupNavigation() {
        navigation = supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navBottom, navigation.navController)

        binding.navBottom.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item: MenuItem ->

            val b = Bundle()
            when (item.itemId) {
                R.id.action_m_feed -> {
                    b.putString("m_key", "FEED")
                    navigation.navController.navigate(R.id.action_m_feed, b)

                    return@OnItemSelectedListener true
                }
                R.id.action_m_loved -> {
                    b.putString("m_key", "LOVED")
                    navigation.navController.navigate(R.id.action_m_loved, b)

                    return@OnItemSelectedListener true
                }
                R.id.action_m_search -> {
                    b.putString("m_key", "SEARCH")
                    navigation.navController.navigate(R.id.action_m_search, b)

                    return@OnItemSelectedListener true
                }
                R.id.action_m_setting -> {
                    b.putString("m_key", "SETTING")
                    navigation.navController.navigate(R.id.action_m_setting, b)

                    return@OnItemSelectedListener true
                }
            }

            return@OnItemSelectedListener false
        })

        binding.navBottom.selectedItemId = navigation.navController.currentDestination!!.id
    }
}