package com.bri.imagefinder.domain.usecase

import com.bri.imagefinder.domain.repository.ImageListRepository
import javax.inject.Inject

class GetImageListUseCase @Inject constructor(private val repository: ImageListRepository) {

    operator fun invoke() {
        repository.getImageList()
    }

}