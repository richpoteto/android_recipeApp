package com.niteroomcreation.recipebookapp.presentation.feature.main

import com.niteroomcreation.recipebookapp.databinding.AMainBinding
import com.niteroomcreation.recipebookapp.presentation.base.BaseActivity

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
class MainActivity : BaseActivity() {

    private val TAG = MainActivity::class.simpleName.toString()

    private lateinit var binding: AMainBinding

    override fun onCreateInside() {
        binding = AMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun initUI() {
        TODO("Not yet implemented")
    }
}