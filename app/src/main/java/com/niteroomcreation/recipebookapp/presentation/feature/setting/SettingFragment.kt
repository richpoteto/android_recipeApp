package com.niteroomcreation.recipebookapp.presentation.feature.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.niteroomcreation.recipebookapp.databinding.FEmptyBinding
import com.niteroomcreation.recipebookapp.presentation.base.BaseFragment

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
class SettingFragment : BaseFragment() {

    private val TAG = SettingFragment::class.simpleName

    private var _binding: FEmptyBinding? = null
    private val binding get() = _binding!!

    override fun onInflateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FEmptyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun initUI() {
        TODO("Not yet implemented")
    }

    override fun destroyUI() {
        _binding = null
    }
}