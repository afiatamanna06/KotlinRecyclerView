package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        val users = ArrayList<User>()
        users.add(User("How could I be so blind","So please I feel like I might disappear"))
        users.add(User("How could I be so blind","So please I feel like I might disappear"))
        users.add(User("How could I be so blind","So please I feel like I might disappear"))
        users.add(User("How could I be so blind","So please I feel like I might disappear"))

        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }
}
