package com.bri.imagefinder.presentation.imagelist

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bri.imagefinder.R
import com.bri.imagefinder.databinding.ActivityImageListBinding

class ImageListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImageListBinding
    private val vm : ImageListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_image_list)
//        https://pixabay.com/api/docs/
//        https://viera.tistory.com/4
    }
}