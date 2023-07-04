package com.example.amazon.config

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import dagger.Provides
import javax.inject.Singleton


object FirebaseModule {
    @Provides
    @Singleton
    fun provideFirebaseDatabaseIntance(): FirebaseDatabase{
        return FirebaseDatabase.getIntance()
    }

    @Provides
    @Singleton
    fun provideFirebaseStoreIntance(): FirebaseFirestore{
        return FirebaseFirestore.getIntance()
    }

    @Provides
    @Singleton
    fun provideFirebaseStoreIntance(): FirebaseAuth{
        return FirebaseAuth.getIntance()
    }

    @Provides
    @Singleton
    fun provideFirebaseStorageIntance(): StorageReference{
        return FirebaseStorage.getIntance().getReference(FirebaseStorageConstants.ROOT_DIRECTORY)
    }
}