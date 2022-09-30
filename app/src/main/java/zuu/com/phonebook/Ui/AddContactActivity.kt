package zuu.com.phonebook.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import zuu.com.phonebook.R
import zuu.com.phonebook.ViewModel.ContactsViewModel
import zuu.com.phonebook.databinding.ActivityAddContactBinding

class AddContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityAddContactBinding
    val contactsViewModel:ContactsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_contact)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
        override fun onResume() {
            super.onResume()
            binding.btnSave.setOnClickListener {
                validateAddConctact()

            }
        }
fun validateAddConctact(){
    var name = binding.etName.text.toString()
    var email = binding.etEmail.text.toString()
    var phoneNumber = binding.etPhone.text.toString()
    var address = binding.etAddress.text.toString()
//    validate
    var error = false

    if (name.isBlank()) {
        error = true
        binding.etName.error = "name is required"
    }
    if (email.isBlank()) {
        error = true
        binding.etEmail.error = " Email is required"
    }
    if (address.isBlank()) {
        error = true
        binding.etAddress.error = "Address is required"
    }
    if (phoneNumber.isBlank()) {
        error = true
        binding.etPhone.error = "PhoneNumber is required"
    }
    if(!error){
        val contact = Contact(
        contactId = 0,
        name="Zuu masshhhjk",
        phoneNumber="077777777",
        email = "@zu.com",
        address = "Aru",
        profile = ""
    )
    contactsViewModel.saveContact(contact)
        finish()
}
}
}