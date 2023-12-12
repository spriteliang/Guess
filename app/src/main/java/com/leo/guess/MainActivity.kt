package com.leo.guess

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.leo.guess.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun check(view: View) {
        var n = binding.number.text.toString().toInt()
        Log.d("MainActivity", "$n ${secretNumber.secret}")
        var message = "GOOOOOOOOOOD"
        if (secretNumber.validate(n) > 0) {
            message = "little"
        } else if (secretNumber.validate(n) < 0) {
            message = "big"
        }else{
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this).setTitle("Guess").setMessage(message).setPositiveButton("OK",null).show()

    }
}