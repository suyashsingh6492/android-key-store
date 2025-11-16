package com.suyash.keyreceiver.domain

import com.suyash.keyreceiver.model.Keys

interface EncryptedPreferences {
    suspend fun saveEncryptedData(keys: Keys): Boolean
    suspend fun readEncryptedData(): Keys?
    suspend fun areApiKeysReady(): Boolean
}