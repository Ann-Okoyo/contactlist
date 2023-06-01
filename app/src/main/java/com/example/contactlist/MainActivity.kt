package com.example.contactlist

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        DisplayContacts()

    }
    fun DisplayContacts(){
        var contacts1=ContactData("Sharon","Sharon","07869078","sharon@gmail.com")
        var contacts2=ContactData("Charles","Charles","07869078","charlesmail.com")
        var contacts3=ContactData("Sophie","Sophie","07869078","sophie@gmail.com")
        var contacts4=ContactData("Ann","Ann","07869078","ann@gmail.com")
        var contacts5=ContactData("Kate","Katen","07869078","kate@gmail.com")
        var contacts6=ContactData("Paisley","Paisley","07869078","paisley@gmail.com")
        var contacts7=ContactData("Sera","Sera","07869078","sera@gmail.com")
        var contacts8=ContactData("Sharon","Sharon","07869078","sharon@gmail.com")
        var contacts9=ContactData("Charles","Charles","07869078","charlesmail.com")
        var contacts10=ContactData("Sophie","Sophie","07869078","sophie@gmail.com")
        var contacts11=ContactData("Ann","Ann","07869078","ann@gmail.com")
        var contacts12=ContactData("Kate","Katen","07869078","kate@gmail.com")
        var contacts13=ContactData("Paisley","Paisley","07869078","paisley@gmail.com")
        var contacts14=ContactData("Sera","Sera","07869078","sera@gmail.com")



        var contactList= listOf<ContactData>(contacts1,contacts2,contacts3,contacts4,contacts5,contacts6,contacts7,contacts8,contacts9,contacts10,contacts11,contacts12,contacts13,contacts14)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        var contactadapter=ContactRvAdapter(contactList)
        binding.rvcontacts.adapter=contactadapter


    }
}