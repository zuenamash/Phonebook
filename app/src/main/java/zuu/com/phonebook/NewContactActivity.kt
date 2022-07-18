package zuu.com.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import com.squareup.picasso.Picasso
import zuu.com.phonebook.databinding.ActivityMainBinding
import zuu.com.phonebook.databinding.ActivityNewContactBinding

class NewContactActivity : AppCompatActivity() {
  lateinit var binding: ActivityNewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtra()

    }
    fun getExtra() {
        val extras= intent.extras
        val name =extras?.getString("NAME","")
        val email = extras?.getString("EMAIL","")
       val phoneNo =extras?.getString("PHONENUMBER","")
        val address =extras?.getString("ADRESSNO","")
        val profile =binding.imgProfile


        Toast.makeText(this,"$name: $email",Toast.LENGTH_LONG).show()
//        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
//        Toast.makeText(this,phoneNo,Toast.LENGTH_LONG).show()
//        Toast.makeText(this,address,Toast.LENGTH_LONG).show()

        binding.tvJina.text=name
        binding.tvPhoneNo.text=phoneNo
        binding.tvadress.text=address



        Picasso.get().load(intent.getStringExtra("PROFILE")).into(profile)
    }

}