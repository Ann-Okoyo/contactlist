package com.example.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.databinding.ContactplaceBinding
import com.squareup.picasso.Picasso


class  ContactRvAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactplaceBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contactss=contactList[position]
        var binding =holder.binding

        binding.tvname.text=contactss.name
        binding.tvphoneno.text=contactss.phoneNumber
        binding.tvemail.text=contactss.emailAddress
        Picasso
            .get()
            .load(contactss.image)
            .resize(80,80)
            .centerCrop()
            .into(binding.ivimage)



        }



    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding:ContactplaceBinding):RecyclerView.ViewHolder(binding.root){

}


