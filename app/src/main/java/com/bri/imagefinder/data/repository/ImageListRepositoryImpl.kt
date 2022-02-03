package com.bri.imagefinder.data.repository

import com.bri.imagefinder.data.remote.ImageListApi
import com.bri.imagefinder.domain.repository.ImageListRepository
import timber.log.Timber
import javax.inject.Inject

class ImageListRepositoryImpl @Inject constructor(private val api: ImageListApi) : ImageListRepository {
    override fun getImageList() {
        Timber.w("repositoryimpl")
    }
}