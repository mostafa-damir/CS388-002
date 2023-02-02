package com.example.codepathmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var emails: List<Email>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)

        emails = EmailFetcher.getEmails()

        val adapter = EmailAdapter(emails)

        emailsRv.adapter = adapter

        emailsRv.layoutManager = LinearLayoutManager(this)
    }
}