package com.bri.imagefinder.di

import com.bri.imagefinder.data.remote.ImageListApi
import com.bri.imagefinder.data.repository.ImageListRepositoryImpl
import com.bri.imagefinder.domain.repository.ImageListRepository
import com.bri.imagefinder.domain.usecase.GetImageListUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient()

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()

    @Provides
    fun provideImageListApi(retrofit: Retrofit): ImageListApi =
        retrofit.create(ImageListApi::class.java)

    @Provides
    fun provideGetImageUseCase(imageListRepository: ImageListRepository): GetImageListUseCase =
        GetImageListUseCase(imageListRepository)

    @Module
    @InstallIn(ActivityComponent::class)
    public interface BindsModule {
        @Binds
        abstract fun bindImageListRepository(imageListRepositoryImpl: ImageListRepositoryImpl): ImageListRepository
    }

}