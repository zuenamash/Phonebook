package zuu.com.phonebook.Ui

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contacts")
//The @Entity annotation creates a table called Contacts.
data class Contact(
    var name : String,
    @PrimaryKey(autoGenerate = true)var contactId:Int,
//    Contacts. The @PrimaryKey(autoGenerate=true) annotation generates a unique primary key for each inserted record.
    var phoneNumber : String,
    var email:String,
    var address: String,
    var profile :String
)
