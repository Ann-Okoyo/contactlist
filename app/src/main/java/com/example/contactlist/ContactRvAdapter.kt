package com.example.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.databinding.ContactplaceBinding


class  ContactRvAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactplaceBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contactss=contactList[position]
        holder.binding.apply {
            tvname.text=contactss.name
            tvphoneno.text=contactss.phoneNumber
            tvemail.text=contactss.emailAddress
        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding:ContactplaceBinding):RecyclerView.ViewHolder(binding.root){

}


