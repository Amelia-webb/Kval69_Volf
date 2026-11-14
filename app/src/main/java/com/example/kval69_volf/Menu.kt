package com.example.kval69_volf

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun menu_profile(view: View) {
        val menu_profile = Intent(this, Profile::class.java)
        startActivity(menu_profile)
    }
    fun menu_media(view: View) {
        val menu_media = Intent(this, Media::class.java)
        startActivity(menu_media)
    }
    fun menu_random(view: View) {
        val menu_random1 = Intent(this, Random1::class.java)
        startActivity(menu_random1)
    }
    fun menu_exit(view: View) {finishAffinity()}
}















