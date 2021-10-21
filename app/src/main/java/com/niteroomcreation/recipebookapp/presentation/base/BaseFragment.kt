package com.niteroomcreation.recipebookapp.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    private val TAG = BaseFragment::class.simpleName.toString()

    private lateinit var mToast: Toast

    private var _binding: ViewBinding? = null

    @Suppress("UNCHECKED_CAST")
    protected val binding: VB
        get() = _binding as VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater.invoke(inflater, container, false)
        return requireNotNull(_binding).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> VB
    abstract fun setup()

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun showMessage(msg: String) {
        mToast.setText(msg)
        mToast.duration = Toast.LENGTH_LONG
        mToast.show()
    }
}