package com.bri.imagefinder.presentation.imagelist

import androidx.lifecycle.ViewModel
import com.bri.imagefinder.domain.usecase.GetImageListUseCase
import javax.inject.Inject

class ImageListViewModel @Inject constructor(private val getImageListUseCase: GetImageListUseCase) :
    ViewModel() {

    init {
        getImageListUseCase()
    }
}