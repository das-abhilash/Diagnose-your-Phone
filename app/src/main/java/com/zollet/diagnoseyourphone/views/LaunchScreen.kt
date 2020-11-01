package com.zollet.diagnoseyourphone.views

import android.content.Intent
import android.os.Bundle
import com.zollet.diagnoseyourphone.viewmodels.BaseViewModel

class LaunchScreen : BaseActivity() {

    override fun getLayoutId(): Int {
        return 0
    }

    override fun setBottomAppBar() {
    }

    override fun getViewModel(): BaseViewModel? {
        return null
    }

    override fun setBinding() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, InstalledAppActivity::class.java))
        finish()
    }
}