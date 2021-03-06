package com.zollet.diagnoseyourphone.views

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.zollet.diagnoseyourphone.util.Logger
import com.zollet.diagnoseyourphone.viewmodels.BaseViewModel

abstract class BaseActivity : AppCompatActivity() {

    protected abstract fun getLayoutId(): Int

    protected abstract fun getViewModel(): BaseViewModel?

    private val currentActivity: BaseActivity
        get() = this

    protected abstract fun setBottomAppBar()

    protected abstract fun setBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (getLayoutId() == 0) {
            Logger.w(currentActivity::class.java.simpleName, "Layout id is zero")
            return
        }
        setBinding()
        setBottomAppBar()
    }
}