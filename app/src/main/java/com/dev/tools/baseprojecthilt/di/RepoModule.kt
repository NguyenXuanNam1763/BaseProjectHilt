package com.dev.tools.baseprojecthilt.di

import com.dev.tools.baseprojecthilt.database.AppDatabase
import com.dev.tools.baseprojecthilt.network.ApiService
import com.dev.tools.baseprojecthilt.repository.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object RepoModule {

    @Singleton
    @Provides
    fun getHomeRepository(appDatabase: AppDatabase, apiService: ApiService): HomeRepository {
        return HomeRepository(appDatabase, apiService)
    }
}