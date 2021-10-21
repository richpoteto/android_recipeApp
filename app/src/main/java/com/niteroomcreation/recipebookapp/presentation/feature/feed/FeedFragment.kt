package com.niteroomcreation.recipebookapp.presentation.feature.feed

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.niteroomcreation.recipebookapp.databinding.FEmptyBinding
import com.niteroomcreation.recipebookapp.presentation.base.BaseFragment

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
class FeedFragment : BaseFragment<FEmptyBinding>() {

    private val TAG = FeedFragment::class.simpleName

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FEmptyBinding
        get() = FEmptyBinding::inflate

    override fun setup() {
        if (arguments != null)
            binding.emptyTv.text = requireArguments().getString("m_key")
        else
            binding.emptyTv.text = "KOSONG"
    }
}