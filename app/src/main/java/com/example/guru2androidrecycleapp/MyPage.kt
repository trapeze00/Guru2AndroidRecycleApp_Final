package com.example.guru2androidrecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class MyPage : AppCompatActivity() {

    lateinit var mypage4: ImageButton
    lateinit var home4: ImageButton
    lateinit var quiz4: ImageButton
    lateinit var bookmark4: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        mypage4 = findViewById<ImageButton>(R.id.mypage4)
        home4 = findViewById<ImageButton>(R.id.home4)
        quiz4 = findViewById<ImageButton>(R.id.quiz4)
        bookmark4 = findViewById<ImageButton>(R.id.bookmark4)

        mypage4.setOnClickListener {
            var intent = Intent(this, MyPage::class.java)
            startActivity(intent)
        }

        home4.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        quiz4.setOnClickListener {
            var intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }

        bookmark4.setOnClickListener {
            var intent = Intent(this, Bookmark1::class.java)
            startActivity(intent)
        }
    }
}