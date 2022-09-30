package zuu.com.phonebook.Repository

import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import zuu.com.phonebook.Database.ContactDb
import zuu.com.phonebook.MyContacts
import zuu.com.phonebook.Ui.Contact

class ContactsRepository {
//    Instantiating our database
    val database = ContactDb.getDatabase(MyContacts.appContext)

    suspend fun saveContact(contact: Contact) {
        withContext(Dispatchers.IO) {
            database.contactDao().insertContact(contact
            )
        }
    }
        fun getContactById(contactId: Int): LiveData<Contact> {
            return database.contactDao().getContactById(contactId)
        }
        fun getAllContacts(): LiveData<List<Contact>> {
                return database.contactDao().getAllContacts()
            }
    }
