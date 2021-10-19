package com.niteroomcreation.recipebookapp.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
abstract class BaseFragment : Fragment() {

    private val TAG = BaseFragment::class.simpleName.toString()

    private var mToast: Toast? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mToast = Toast.makeText(context, "null", Toast.LENGTH_LONG)

        initUI()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return onInflateView(inflater, container, savedInstanceState)
    }

    abstract fun onInflateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View

    abstract fun initUI()
    abstract fun destroyUI()

    override fun onDestroyView() {
        super.onDestroyView()
        destroyUI()
    }


    fun showMessage(msg: String) {
        mToast!!.setText(msg)
        mToast!!.duration = Toast.LENGTH_LONG
        mToast!!.show()
    }
}