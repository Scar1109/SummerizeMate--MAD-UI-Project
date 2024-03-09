package com.example.summerizemate.modelsheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.example.summerizemate.R

class savedSummeryDeleteModel : BottomSheetDialogFragment() {

    companion object {
        const val TAG = "DeleteConformationModel"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_saved_summery_delete_model, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelButton : Button = view.findViewById(R.id.cancel_delete_btn)

        cancelButton.setOnClickListener {
            dismiss()
        }

    }

    // Optionally, override onCancel or onDismiss if necessary
    // For example:
    /*override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        // Handle cancellation
    }*/

    /*override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        // Handle dismissal
    }*/
}