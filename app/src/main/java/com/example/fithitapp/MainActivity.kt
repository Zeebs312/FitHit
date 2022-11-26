package com.example.fithitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

//class MainActivity : AppCompatActivity() {
    // Add button Move to Activity
    //private lateinit var progressActivitybutton: Button

    //override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        // by ID we can use each component which id is assign in xml file
        // use findViewById() to get the Button
        //progressActivitybutton = findViewById(R.id.progress_button)

        // Add_button add clicklistener
        //progressActivitybutton.setOnClickListener {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            //val intent = Intent(this, SecondActivity::class.java)
            // start the activity connect to the specified class
            //startActivity(intent)
       // }
   // }
//}

class MainActivity : AppCompatActivity() {
    // private fields of the class
    private lateinit var _mainButton: Button
    private lateinit var _mealButton: Button
    private lateinit var _progressButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
