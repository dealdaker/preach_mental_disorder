package com.preach.mentaldisorder.Views.fragments

import com.preach.mentaldisorder.R
import kotlinx.android.synthetic.main.fragment_ayat_by_feelings.*

class AyatByFeelingsFragment : BaseFragment(R.layout.fragment_ayat_by_feelings) {
    override fun initViews() {
        ivBack.setOnClickListener {
            onBackPress()
        }
    }

    override fun attachViewModel() {

    }
}