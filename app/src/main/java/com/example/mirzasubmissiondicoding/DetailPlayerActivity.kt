package com.example.mirzasubmissiondicoding

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailPlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_player_activity)

        val image = intent.getParcelableExtra<Mufc>(MainActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id._imageDetail)
        val imgName = findViewById<TextView>(R.id._imageTitle)
        val imgDetail = findViewById<TextView>(R.id._imageDesc)

        imgSrc.setImageResource(image.imgSrc)
        imgName.text = image.imgName
        imgDetail.text = image.imgDetail
    }
}