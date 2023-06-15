package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactlist.databinding.ActivityAddContactsBinding

class AddContacts : AppCompatActivity() {
    lateinit var binding:ActivityAddContactsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_add_contacts)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        validateAddContacts()
        binding.btnAddContact.setOnClickListener {
            validateAddContacts()
        }

    }

    fun validateAddContacts(){

        val email = binding.etEmail.text.toString()
        val phone = binding.etPhoneNumber.text.toString()
        var error = false

        if (email.isBlank()){
            binding.tilEmail.error = "Email field cannot be empty"
            error = true
        }

        if (phone.isBlank()){
            binding.tilPhoneNumber.error = "Phone number field cannot be empty"
            error = true
        }

        if (!error){
            Toast.makeText(this, "Contact Successfully added", Toast.LENGTH_LONG).show()
        }
    }
}

