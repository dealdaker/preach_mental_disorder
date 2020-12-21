package com.preach.mentaldisorder.Views.fragments.profile

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.preach.mentaldisorder.R

class StartedFragmentDirections private constructor() {
  companion object {
    fun actionStartedFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_startedFragment_to_loginFragment)
  }
}
