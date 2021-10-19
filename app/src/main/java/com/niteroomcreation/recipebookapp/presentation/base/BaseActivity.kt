package com.niteroomcreation.recipebookapp.presentation.base

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Septian Adi Wijaya on 19/10/2021.
 * please be sure to add credential if you use people's code
 */
abstract class BaseActivity : AppCompatActivity() {

    private val TAG = BaseActivity::class.simpleName

    private var mToast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.e(TAG, "onCreate: ${TAG}")

        super.onCreate(savedInstanceState, persistentState)

        mToast = Toast.makeText(this, "null", Toast.LENGTH_LONG)

        onCreateInside()
        initUI()
    }

    abstract fun onCreateInside()
    abstract fun initUI()

    fun showMessage(msg: String) {
        mToast!!.setText(msg)
        mToast!!.duration = Toast.LENGTH_LONG
        mToast!!.show()
    }
}