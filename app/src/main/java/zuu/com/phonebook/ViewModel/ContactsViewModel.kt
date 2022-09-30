package zuu.com.phonebook.ViewModel

import androidx.lifecycle.LiveData
import zuu.com.phonebook.Repository.ContactsRepository
import zuu.com.phonebook.Ui.Contact
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ContactsViewModel :ViewModel(){
    val contactsRepository = ContactsRepository()
    lateinit var contactLiveData : LiveData<Contact>
    lateinit var contactsLiveData: LiveData<List<Contact>>

    fun saveContact(contact: Contact) {
        viewModelScope.launch {
            contactsRepository.saveContact(contact)
        }
    }
    fun getAllContacts(){
        contactsLiveData= contactsRepository.getAllContacts()
    }

    fun getContactById(contactId: Int) {
        contactLiveData = contactsRepository.getContactById(contactId)
    }
}