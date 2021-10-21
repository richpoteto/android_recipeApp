package com.niteroomcreation.recipebookapp.presentation.feature.setting

import android.view.LayoutInflater
import android.view.ViewGroup
import com.niteroomcreation.recipebookapp.databinding.FSettingBinding
import com.niteroomcreation.recipebookapp.presentation.base.BaseFragment

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
class SettingFragment : BaseFragment<FSettingBinding>() {

    private val TAG = SettingFragment::class.simpleName

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FSettingBinding
        get() = FSettingBinding::inflate

    override fun setup() {

    }
}