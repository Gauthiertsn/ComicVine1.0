package com.example.comicvine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acceuil)

        val buttonNavigate = findViewById<Button>(R.id.button_navigate)
        buttonNavigate.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, FragmentItemSeries())
                .commit()
        }
        val homeButton = findViewById<ImageButton>(R.id.home_button)
        homeButton.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, AccueilFragment())
                .commit()
        }
        val serieNavigate = findViewById<ImageButton>(R.id.series_button)
        serieNavigate.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, FragmentItemSeries())
                .commit()
        }
    }
}

