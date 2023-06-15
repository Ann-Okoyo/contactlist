package com.example.contactlist

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactlist.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

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

        binding.idaction.setOnClickListener {
            val intent = Intent(this, AddContacts::class.java)
            startActivity(intent)

    }

    }
    fun DisplayContacts(){
        var contacts1=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Sharon","07869078","sharon@gmail.com")
        var contacts2=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Charles","07869078","charlesmail.com")
        var contacts3=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Sophie","0768909","sophie@gmail.com")
        var contacts4=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Ann","07869078","ann@gmail.com")
        var contacts5=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Kate","07869078","kate@gmail.com")
        var contacts6=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Paisley","07869078","paisley@gmail.com")
        var contacts7=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Sera","07869078","sera@gmail.com")
        var contacts8=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Sharon","07869078","sharon@gmail.com")
        var contacts9=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Charles","07869078","charlesmail.com")
        var contacts10=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Sophie","07869078","sophie@gmail.com")
        var contacts11=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Ann","07869078","ann@gmail.com")
        var contacts12=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Katen","07869078","kate@gmail.com")
        var contacts13=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Paisley","07869078","paisley@gmail.com")
        var contacts14=ContactData("https://images.unsplash.com/photo-1686686200559-3b58bd444f86?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw4fHx8ZW58MHx8fHx8&auto=format&fit=crop&w=500&q=60","Sera","07869078","sera@gmail.com")



        var contactList= listOf<ContactData>(contacts1,contacts2,contacts3,contacts4,contacts5,contacts6,contacts7,contacts8,contacts9,contacts10,contacts11,contacts12,contacts13,contacts14)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        var contactadapter=ContactRvAdapter(contactList)
        binding.rvcontacts.adapter=contactadapter

    }
}