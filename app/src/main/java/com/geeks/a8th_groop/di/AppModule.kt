package com.geeks.a8th_groop.di

import android.app.Application
import androidx.room.Room
import com.geeks.a8th_groop.data.db.ShopDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(
        interceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .writeTimeout(20, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .connectTimeout(20, TimeUnit.SECONDS)
            .callTimeout(20, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .build()
    }

    @Singleton
    @Provides
    fun provideLogginInterseptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

/*    @Provides
    @Singleton
    fun provideShopRepository(repository: Repository): ShopRepository {
        return repository
    }*/
    @Provides
    @Singleton
    fun provideShopDatabase(application: Application): ShopDatabase {
        return Room.databaseBuilder(
            application,
            ShopDatabase::class.java,
            "shop_database"
        ).build()
    }
}
