package zuu.com.phonebook.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import zuu.com.phonebook.Ui.Contact


@Database(entities = arrayOf(Contact::class), version = 1)
abstract class ContactDb : RoomDatabase() {
    abstract fun contactDao(): ContactDao

    companion object {
        //        Companion object ensures I Have one db at a time
        private var database: ContactDb? = null

        fun getDatabase(context: Context): ContactDb {
            if (database == null) {
                database = Room
                    .databaseBuilder(context, ContactDb::class.java, "contactsDb")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return database as ContactDb

        }
    }
}