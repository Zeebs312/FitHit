package com.example.fithitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MealActivity : AppCompatActivity() {
    // private fields of the class
    private lateinit var _mainButton: Button
    private lateinit var _mealButton: Button
    private lateinit var _progressButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal)
        _mainButton = findViewById<Button>(R.id.progress_button)
        _mainButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                startMainActivity()
            }
        })
        // 13 code goes here
        _mealButton = findViewById<Button>(R.id.progress_button)
        _mealButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                startMealActivity()
            }
        })
        // 16 code goes here
        // pull a reference from the second button and set an onclick listener to call a function
        // to trigger the third activity
        _progressButton = findViewById<Button>(R.id.progress_button)
        _progressButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                startProgressActivity()
            }
        })

    }
    // private function that will trigger our second activity by using an explicit intent
    private fun startMainActivity() {
        var intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    // private function that will trigger our second activity by using an explicit intent
    private fun startMealActivity() {
        var intent: Intent = Intent(this, ProgressActivity::class.java)
        startActivity(intent)
    }

    // private function that will trigger our third activity using an explicit intent however
    // this activity will return information to our current activity
    private fun startProgressActivity() {
        var intent: Intent = Intent(this, MealActivity::class.java)
        startActivity(intent)
    }
}
