package com.example.assig4inventory

import android.app.Application
import com.example.assig4inventory.data.ItemRoomDatabase
class InventoryApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}