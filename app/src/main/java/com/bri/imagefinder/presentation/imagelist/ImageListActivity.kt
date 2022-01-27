package com.bri.imagefinder.presentation.imagelist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bri.imagefinder.R
import com.bri.imagefinder.databinding.ActivityImageListBinding

class ImageListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImageListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_image_list)
    }
}