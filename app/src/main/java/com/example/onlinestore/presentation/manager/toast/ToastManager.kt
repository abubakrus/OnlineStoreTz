package com.example.onlinestore.presentation.manager.toast

import android.content.Context
import android.widget.Toast
import com.example.onlinestore.presentation.manager.toast.ShowToastUseCase
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ToastManager @Inject constructor(
    @ApplicationContext private val context: Context
) : ShowToastUseCase {
    override fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT)
            .show()
    }
}