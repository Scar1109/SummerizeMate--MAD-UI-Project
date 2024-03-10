package com.example.summerizemate.modelsheets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.summerizemate.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class editProfileModel : BottomSheetDialogFragment() {

    companion object {
        const val TAG = "EditProfileModel"
        private const val REQUEST_IMAGE_CAPTURE = 1
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_edit_profile_model, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cancelButton : Button = view.findViewById(R.id.summery_edit_cancel_btn)
        val cameraButton: ImageView = view.findViewById(R.id.camera_btn)

        cancelButton.setOnClickListener {
            dismiss()
        }

        cameraButton.setOnClickListener {
            openCameraOrGallery()
        }

    }

    private fun openCameraOrGallery() {
        val captureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (captureIntent.resolveActivity(requireActivity().packageManager) != null) {
            startActivityForResult(captureIntent, REQUEST_IMAGE_CAPTURE)
        } else {
            // If the camera app is not available, you can inform the user or take alternative action
            // For demo purposes, you can display a toast message
            Toast.makeText(requireContext(), "Camera app not found", Toast.LENGTH_SHORT).show()
        }
    }


}