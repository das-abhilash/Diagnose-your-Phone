package com.zollet.diagnoseyourphone.views

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.zollet.diagnoseyourphone.R
import com.zollet.diagnoseyourphone.databinding.FragmentNavigationDrawerBinding
import com.zollet.diagnoseyourphone.util.Constants

class NavigationDrawerFragment :
    com.google.android.material.bottomsheet.BottomSheetDialogFragment(), View.OnClickListener {

    private var binding: FragmentNavigationDrawerBinding? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        setStyle(DialogFragment.STYLE_NORMAL, R.style.BottomSheetDialogTheme)
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_navigation_drawer, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnclickListener()
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)
        val view = LayoutInflater.from(context).inflate(
            R.layout.fragment_navigation_drawer,
            null
        )
        dialog.setContentView(view)
    }

    private fun setOnclickListener() {
        binding!!.boxInfoDeveloper.setOnClickListener(this)
        binding!!.boxLeaveFeedback.setOnClickListener(this)
        binding!!.boxArticleSelected.setOnClickListener(this)
        binding!!.boxCodeSelected.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.box_info_developer -> {
            }
            R.id.box_leave_feedback -> {
                val mail = Constants.MAIL
                val subject = Constants.SUBJECT
                openMailFeedback(mail, subject)
            }
            R.id.box_article_selected -> {
                openWebSite("https://shashank-on-codehunt.github.io/Diagnose-your-Phone")
            }

            R.id.box_code_selected -> {
                openWebSite("https://github.com/das-abhilash/Diagnose-your-Phone")
            }
        }
    }

    private fun openWebSite(url: String) {
        val uri = Uri.parse(url)
        val openWebsite = Intent(Intent.ACTION_VIEW)
        openWebsite.data = uri
        startActivity(openWebsite)
    }

    private fun openMailFeedback(mailtTo: String, subject: String) {
        val subjectEncode = Uri.encode(subject)
        val uriText = "mailto:$mailtTo?SUBJECT=$subjectEncode"
        val uri = Uri.parse(uriText)
        val sendIntent = Intent(Intent.ACTION_SENDTO)
        sendIntent.data = uri
        startActivity(Intent.createChooser(sendIntent, "Send email"))
    }
}
