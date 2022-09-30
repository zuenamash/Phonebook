package zuu.com.phonebook.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import zuu.com.phonebook.Ui.Contact

@Dao
//@Dao enable acesss the db
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(Contact:Contact)


    @Query("SELECT * FROM contacts")
    fun getAllContacts(): LiveData<List<Contact>>
    //this helps to fetch all the data from the ui which provides livedata to the ui

    @Query("SELECT * FROM contacts WHERE contactId = :contactId")
    fun getContactById(contactId:Int): LiveData<Contact>
}