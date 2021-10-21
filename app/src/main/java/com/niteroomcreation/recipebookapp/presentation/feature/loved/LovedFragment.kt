package com.niteroomcreation.recipebookapp.presentation.feature.loved

import android.view.LayoutInflater
import android.view.ViewGroup
import com.niteroomcreation.recipebookapp.databinding.FEmptyBinding
import com.niteroomcreation.recipebookapp.presentation.base.BaseFragment

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
class LovedFragment : BaseFragment<FEmptyBinding>() {

    private val TAG = LovedFragment::class.simpleName

//    private var _binding: FEmptyBinding? = null
//    private val binding get() = _binding!!
//
//    override fun onInflateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = FEmptyBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun initUI() {
//        Log.e(TAG, "initUI: ${TAG}" )
//
//        if (arguments != null)
//            binding.emptyTv.text = requireArguments().getString("m_key")
//        else
//            binding.emptyTv.text = "KOSONG"
//    }
//
//    override fun destroyUI() {
//        _binding = null
//    }

    //===
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FEmptyBinding
        get() = FEmptyBinding::inflate

    override fun setup() {
        if (arguments != null)
            binding.emptyTv.text = requireArguments().getString("m_key")
        else
            binding.emptyTv.text = "KOSONG"
    }
}