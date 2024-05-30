package com.example.singleviewapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    //creating arrays for the spinners options
    val smoothie1 = arrayOf("Mango", "Orange", "Banana", "Kiwi", "Berry", "Avocado")
    val smoothie2 = arrayOf("Mango", "Orange", "Banana", "Kiwi", "Berry", "Avocado")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //creating adapters value for the view purposes
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, smoothie1)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, smoothie2)

        //creating a variable name b1 for button
        val b1: Button = findViewById(R.id.button)
        val smoothie1 = findViewById<Spinner>(R.id.smoothie1)
        val smoothie2 = findViewById<Spinner>(R.id.smoothie2)

        //setting the adapters for the view purpose
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        smoothie1.adapter = adapter
        smoothie1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {}
        }

        smoothie2.adapter = adapter2
        smoothie2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {}
        }

        b1.setOnClickListener {
            val resultText = when {
                // Mango
                smoothie1.selectedItemPosition == 0 && smoothie2.selectedItemPosition == 0 -> "Thank you for waiting, enjoy your Mango Smoothie"
                smoothie1.selectedItemPosition == 1 && smoothie2.selectedItemPosition == 0 -> "Thank you for waiting, enjoy your Mango Orange Smoothie"
                smoothie1.selectedItemPosition == 2 && smoothie2.selectedItemPosition == 0 -> "Thank you for waiting, enjoy your Mango Banana Smoothie"
                smoothie1.selectedItemPosition == 3 && smoothie2.selectedItemPosition == 0 -> "Thank you for waiting, enjoy your Mango Kiwi Smoothie"
                smoothie1.selectedItemPosition == 4 && smoothie2.selectedItemPosition == 0 -> "Thank you for waiting, enjoy your Mango Berry Smoothie"
                smoothie1.selectedItemPosition == 5 && smoothie2.selectedItemPosition == 0 -> "Thank you for waiting, enjoy your Mango Avocado Smoothie"

                // Orange
                smoothie1.selectedItemPosition == 0 && smoothie2.selectedItemPosition == 1 -> "Thank you for waiting, enjoy your Orange Mango Smoothie"
                smoothie1.selectedItemPosition == 1 && smoothie2.selectedItemPosition == 1 -> "Thank you for waiting, enjoy your Orange Smoothie"
                smoothie1.selectedItemPosition == 2 && smoothie2.selectedItemPosition == 1 -> "Thank you for waiting, enjoy your Orange Banana Smoothie"
                smoothie1.selectedItemPosition == 3 && smoothie2.selectedItemPosition == 1 -> "Thank you for waiting, enjoy your Orange Kiwi Smoothie"
                smoothie1.selectedItemPosition == 4 && smoothie2.selectedItemPosition == 1 -> "Thank you for waiting, enjoy your Orange Berry Smoothie"
                smoothie1.selectedItemPosition == 5 && smoothie2.selectedItemPosition == 1 -> "Thank you for waiting, enjoy your Orange Avocado Smoothie"

                // Banana
                smoothie1.selectedItemPosition == 0 && smoothie2.selectedItemPosition == 2 -> "Thank you for waiting, enjoy your Banana Mango Smoothie"
                smoothie1.selectedItemPosition == 1 && smoothie2.selectedItemPosition == 2 -> "Thank you for waiting, enjoy your Banana Orange Smoothie"
                smoothie1.selectedItemPosition == 2 && smoothie2.selectedItemPosition == 2 -> "Thank you for waiting, enjoy your Banana Smoothie"
                smoothie1.selectedItemPosition == 3 && smoothie2.selectedItemPosition == 2 -> "Thank you for waiting, enjoy your Banana Kiwi Smoothie"
                smoothie1.selectedItemPosition == 4 && smoothie2.selectedItemPosition == 2 -> "Thank you for waiting, enjoy your Banana Berry Smoothie"
                smoothie1.selectedItemPosition == 5 && smoothie2.selectedItemPosition == 2 -> "Thank you for waiting, enjoy your Banana Avocado Smoothie"

                // Kiwi
                smoothie1.selectedItemPosition == 0 && smoothie2.selectedItemPosition == 3 -> "Thank you for waiting, enjoy your Kiwi Mango Smoothie"
                smoothie1.selectedItemPosition == 1 && smoothie2.selectedItemPosition == 3 -> "Thank you for waiting, enjoy your Kiwi Orange Smoothie"
                smoothie1.selectedItemPosition == 2 && smoothie2.selectedItemPosition == 3 -> "Thank you for waiting, enjoy your Kiwi Banana Smoothie"
                smoothie1.selectedItemPosition == 3 && smoothie2.selectedItemPosition == 3 -> "Thank you for waiting, enjoy your Kiwi Smoothie"
                smoothie1.selectedItemPosition == 4 && smoothie2.selectedItemPosition == 3 -> "Thank you for waiting, enjoy your Kiwi Berry Smoothie"
                smoothie1.selectedItemPosition == 5 && smoothie2.selectedItemPosition == 3 -> "Thank you for waiting, enjoy your Kiwi Avocado Smoothie"

                // Berry
                smoothie1.selectedItemPosition == 0 && smoothie2.selectedItemPosition == 4 -> "Thank you for waiting, enjoy your Berry Mango Smoothie"
                smoothie1.selectedItemPosition == 1 && smoothie2.selectedItemPosition == 4 -> "Thank you for waiting, enjoy your Berry Orange Smoothie"
                smoothie1.selectedItemPosition == 2 && smoothie2.selectedItemPosition == 4 -> "Thank you for waiting, enjoy your Berry Banana Smoothie"
                smoothie1.selectedItemPosition == 3 && smoothie2.selectedItemPosition == 4 -> "Thank you for waiting, enjoy your Berry Kiwi Smoothie"
                smoothie1.selectedItemPosition == 4 && smoothie2.selectedItemPosition == 4 -> "Thank you for waiting, enjoy your Berry Smoothie"
                smoothie1.selectedItemPosition == 5 && smoothie2.selectedItemPosition == 4 -> "Thank you for waiting, enjoy your Berry Avocado Smoothie"

                // Avocado
                smoothie1.selectedItemPosition == 0 && smoothie2.selectedItemPosition == 5 -> "Thank you for waiting, enjoy your Avocado Mango Smoothie"
                smoothie1.selectedItemPosition == 1 && smoothie2.selectedItemPosition == 5 -> "Thank you for waiting, enjoy your Avocado Orange Smoothie"
                smoothie1.selectedItemPosition == 2 && smoothie2.selectedItemPosition == 5 -> "Thank you for waiting, enjoy your Avocado Banana Smoothie"
                smoothie1.selectedItemPosition == 3 && smoothie2.selectedItemPosition == 5 -> "Thank you for waiting, enjoy your Avocado Kiwi Smoothie"
                smoothie1.selectedItemPosition == 4 && smoothie2.selectedItemPosition == 5 -> "Thank you for waiting, enjoy your Avocado Berry Smoothie"
                smoothie1.selectedItemPosition == 5 && smoothie2.selectedItemPosition == 5 -> "Thank you for waiting, enjoy your Avocado Smoothie"

                else -> "Result not found for selected options"
            }

            val imageResId = showImageBasedOnSpinnerPosition(smoothie1.selectedItemPosition, smoothie2.selectedItemPosition)
            showDialog(resultText, imageResId)
        }
    }

    private fun showImageBasedOnSpinnerPosition(smoothie1: Int, smoothie2: Int): Int {
        return when {
            // Mango
            smoothie1 == 0 && smoothie2 == 0 -> R.drawable.mango
            smoothie1 == 1 && smoothie2 == 0 -> R.drawable.mangoorange
            smoothie1 == 2 && smoothie2 == 0 -> R.drawable.mangobanana
            smoothie1 == 3 && smoothie2 == 0 -> R.drawable.mangokiwi
            smoothie1 == 4 && smoothie2 == 0 -> R.drawable.mangoberry
            smoothie1 == 5 && smoothie2 == 0 -> R.drawable.mangoavocado

            // Orange
            smoothie1 == 0 && smoothie2 == 1 -> R.drawable.orangemango
            smoothie1 == 1 && smoothie2 == 1 -> R.drawable.orange
            smoothie1 == 2 && smoothie2 == 1 -> R.drawable.orangebanana
            smoothie1 == 3 && smoothie2 == 1 -> R.drawable.orangekiwi
            smoothie1 == 4 && smoothie2 == 1 -> R.drawable.orangeberry
            smoothie1 == 5 && smoothie2 == 1 -> R.drawable.avocadoorange

            // Banana
            smoothie1 == 0 && smoothie2 == 2 -> R.drawable.bananamango
            smoothie1 == 1 && smoothie2 == 2 -> R.drawable.bananaorange
            smoothie1 == 2 && smoothie2 == 2 -> R.drawable.banana
            smoothie1 == 3 && smoothie2 == 2 -> R.drawable.bananakiwi
            smoothie1 == 4 && smoothie2 == 2 -> R.drawable.bananaberry
            smoothie1 == 5 && smoothie2 == 2 -> R.drawable.bananaavocado

            // Kiwi
            smoothie1 == 0 && smoothie2 == 3 -> R.drawable.kiwimango
            smoothie1 == 1 && smoothie2 == 3 -> R.drawable.kiwiorange
            smoothie1 == 2 && smoothie2 == 3 -> R.drawable.kiwibanana
            smoothie1 == 3 && smoothie2 == 3 -> R.drawable.kiwi
            smoothie1 == 4 && smoothie2 == 3 -> R.drawable.kiwiberry
            smoothie1 == 5 && smoothie2 == 3 -> R.drawable.kiwiavocado

            // Berry
            smoothie1 == 0 && smoothie2 == 4 -> R.drawable.berrymango
            smoothie1 == 1 && smoothie2 == 4 -> R.drawable.berryorange
            smoothie1 == 2 && smoothie2 == 4 -> R.drawable.berrybanana
            smoothie1 == 3 && smoothie2 == 4 -> R.drawable.berrykiwi
            smoothie1 == 4 && smoothie2 == 4 -> R.drawable.berry
            smoothie1 == 5 && smoothie2 == 4 -> R.drawable.berryavocado

            // Avocado
            smoothie1 == 0 && smoothie2 == 5 -> R.drawable.avocadomango
            smoothie1 == 1 && smoothie2 == 5 -> R.drawable.avocadoorange
            smoothie1 == 2 && smoothie2 == 5 -> R.drawable.avocadobanana
            smoothie1 == 3 && smoothie2 == 5 -> R.drawable.avocadokiwi
            smoothie1 == 4 && smoothie2 == 5 -> R.drawable.avocadoberry
            smoothie1 == 5 && smoothie2 == 5 -> R.drawable.avocado

            else -> R.drawable.ic_launcher_background
        }
    }

    @SuppressLint("MissingInflatedId")
    private fun showDialog(resultText: String, imageResId: Int) {
        // Inflate the dialog with popup view
        val dialogView = LayoutInflater.from(this).inflate(R.layout.popup, null)
        val builder = AlertDialog.Builder(this).setView(dialogView)
        val dialog = builder.create()

        // Find views within the dialog
        val resultTextView = dialogView.findViewById<TextView>(R.id.popup_text)
        val characterPhoto = dialogView.findViewById<ImageView>(R.id.popup_img)
        val okayButton: Button = dialogView.findViewById(R.id.popup_button)

        // Set the text for the result TextView and image for the characterPhoto ImageView
        resultTextView.text = resultText
        characterPhoto.setImageResource(imageResId)

        okayButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}