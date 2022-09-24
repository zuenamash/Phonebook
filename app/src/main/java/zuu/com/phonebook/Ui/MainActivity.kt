package zuu.com.phonebook.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import zuu.com.phonebook.contact_rvAdapter
import zuu.com.phonebook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1= Contact(name="Zuu masshhhjk",phoneNumber="077777777", email = "@zu.com", address = "Aru", profile ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuwJSYOFjhdlxKBU10uRb9HpZuhWIha2bekA&usqp=CAU")
        var contact2= Contact(name="Zughjk  kkkall",phoneNumber="01111111", email = "@uu.com", address = "sha", profile = "https://images.unsplash.com/photo-1644042282339-767092de616b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGFmcmljYW5zJTIwY293Ym95c3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=400&q=60")
        var contact3= Contact(name="Zuikhia mahaj",phoneNumber="000000", email = "@zuu.com", address = "ushawa", profile = "https://images.unsplash.com/photo-1635987152739-f57434e484a3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8YWZyaWNhbnMlMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60")
        var contact4= Contact(name="Zaira makau",phoneNumber="077777", email = "@u.com", address = "Arusha", profile = "https://images.unsplash.com/photo-1646133071244-e1288bd80bnMlMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=400&q=60")
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