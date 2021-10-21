package com.niteroomcreation.recipebookapp.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private val TAG = BaseActivity::class.simpleName

    private lateinit var mToast: Toast
//    private lateinit var mViewBinding: VB
//
//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
//        Log.e(TAG, "onCreate: ${TAG}")
//
//        super.onCreate(savedInstanceState, persistentState)
//
//        if (getBindingLayoutId() != null) {
//            mViewBinding = getBindingLayoutId()!!
//            setContentView(mViewBinding.root)
//
//            onViewReady(savedInstanceState)
//            initUI()
//
//        } else
//            throw RuntimeException("Layout need to instantiate ${this::class.simpleName}")
//
//        mToast = Toast.makeText(this, "null", Toast.LENGTH_LONG)
//
//    }
//
//    abstract fun getBindingLayoutId(): VB?

    //===
    private var _binding: ViewBinding? = null
    abstract val bindingInflater: (LayoutInflater) -> VB

    @Suppress("UNCHECKED_CAST")
    protected val binding: VB
        get() = _binding as VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = bindingInflater.invoke(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        setup()
    }

    abstract fun setup()

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    //===

    abstract fun onViewReady(savedInstanceState: Bundle?)
    abstract fun initUI()

    fun showMessage(msg: String) {
        mToast.setText(msg)
        mToast.duration = Toast.LENGTH_LONG
        mToast.show()
    }
}