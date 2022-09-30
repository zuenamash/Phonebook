package zuu.com.phonebook.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import zuu.com.phonebook.MyContacts
import zuu.com.phonebook.ViewModel.ContactsViewModel
import zuu.com.phonebook.contact_rvAdapter
import zuu.com.phonebook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val contactsViewModel: ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contactsViewModel.getAllContacts()
        displayContacts()
    }

    override fun onResume(){
        super.onResume()
        binding.fabAddContact.setOnClickListener{
            startActivity(Intent(this,AddContactActivity::class.java))
        }

//        contactsViewModel.contactLiveData.observe(this, Observer {
//            Contacts->
//            displayContacts()
//
//        })
    }
    fun displayContacts(){
        var contact1= Contact(contactId = 1, name="Zuu masshhhjk",phoneNumber="077777777", email = "@zu.com", address = "Aru", profile ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuwJSYOFjhdlxKBU10uRb9HpZuhWIha2bekA&usqp=CAU")
        var contact2= Contact(contactId = 2, name="Zughjk  kkkall",phoneNumber="01111111", email = "@uu.com", address = "sha", profile = "https://images.unsplash.com/photo-1644042282339-767092de616b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGFmcmljYW5zJTIwY293Ym95c3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=400&q=60")
        var contact3= Contact(contactId = 3, name="Zuikhia mahaj",phoneNumber="000000", email = "@zuu.com", address = "ushawa", profile = "https://images.unsplash.com/photo-1635987152739-f57434e484a3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8YWZyaWNhbnMlMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60")
        var contact4= Contact(contactId = 4, name="Zaira makau",phoneNumber="077777", email = "@u.com", address = "Arusha", profile = "https://images.unsplash.com/photo-1646133071244-e1288bd80bnMlMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60")
//        var contact5=Contact(name="Zuu",phoneNumber="077777777", email = "@zu.com", address = "Aru", profile ="https://encrypted-tbn0.gstatic.com/images?q=tbn")
//        var contact6=Contact(name="Zu",phoneNumber="01111111", email = "@uu.com", address = "sha", profile = "https://images.unsplash.com/photo-1644042282339-767092de616b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGFmcmljYW5zJTIwY293Ym95c3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=400&q=60")
//        var contact7=Contact(name="Zui",phoneNumber="000000", email = "@zuu.com", address = "ushawa", profile = "https://images.unsplash.com/photo-1635987152739-f57434e484a3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8YWZyaWNhbnMlMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60")
//        var contact8=Contact(name="Z",phoneNumber="077777", email = "@u.com", address = "Arusha", profile = "https://images.unsplash.com/photo-1646133071244-e1288bd80d81?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YWZyaWNhbnMlMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60")

        var contactList=
            listOf(contact1,contact2,contact3,contact4)
        var contactAdapter= contact_rvAdapter(contactList)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        binding.rvContact.adapter=contactAdapter


    }
}