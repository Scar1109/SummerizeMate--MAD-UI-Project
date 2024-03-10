package com.example.summerizemate.modelsheets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.summerizemate.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class editPasswordModel :  BottomSheetDialogFragment() {

    companion object {
        const val TAG = "EditPasswordModel"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_edit_password_model, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelButton : Button = view.findViewById(R.id.summery_edit_cancel_btn)

        cancelButton.setOnClickListener {
            dismiss()
        }

    }

}