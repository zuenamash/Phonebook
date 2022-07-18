package zuu.com.phonebook

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import zuu.com.phonebook.databinding.ContactListItemBinding
import kotlin.coroutines.coroutineContext

class contact_rvAdapter(var contactList:List<Contact>):
RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
//      var itemView = LayoutInflater.from(parent.context)
//          .inflate(R.layout.contact_list_item,parent,false)
        var binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactsViewHolder =ContactsViewHolder(binding)
        return contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact =contactList.get(position)
        holder.binding.tvName.text =currentContact.name
        holder.binding.tvPhoneNumber.text =currentContact.phoneNumber
        holder.binding.tvEmail.text =currentContact.email
        holder.binding.tvAddress.text =currentContact.address
        Picasso.get()
            .load(currentContact.profile)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_outline_24)
            .resize(300,300)
            .centerCrop()
            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(holder.binding.tvprofile)
        var context = holder.itemView.context
        holder.binding.tvprofile.setOnClickListener {
            Toast.makeText(context,"You have a clicked on ${currentContact.name}'s image", Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener{
            val intent = Intent(context,NewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("PHONENUMBER",currentContact.phoneNumber)
            intent.putExtra("PROFILE",currentContact.profile)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return  contactList.size

    }
}
class  ContactsViewHolder(var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root){
//        var tvName=itemView.findViewById<TextView>(R.id.tvName)
//        var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
//        var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
//        var tvAddress=itemView.findViewById<TextView>(R.id.tvAddress)
//        var imgProfile=itemView.findViewById<TextView>(R.id.imgProfile)


}