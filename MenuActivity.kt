package com.example.sanjeevkumar.sayings

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.example.sanjeevkumar.sayings.R.id.happy
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        Glide.with(this)
                .load(R.drawable.happy)
                .into(happy)

        Glide.with(this)
                .load(R.drawable.sad)
                .into(sad)

        Glide.with(this)
                .load(R.drawable.inspirational)
                .into(inspire)

        Glide.with(this)
                .load(R.drawable.adventours)
                .into(adventure)

        Glide.with(this)
                .load(R.drawable.playful)
                .into(playful)

        Glide.with(this)
                .load(R.drawable.relaxed)
                .into(relax)

happy.setOnClickListener(this)
        playful.setOnClickListener(this)
        relax.setOnClickListener(this)
        inspire.setOnClickListener(this)
        sad.setOnClickListener(this)
        adventure.setOnClickListener(this)
    }

   override fun onClick(view:View)
   {
       var intent=Intent(this,QuoteActivity::class.java)
      var value= when(view!!.id)
       {
           happy.id->"happy"
           sad.id->"sad"
           inspire.id->"inspire"
           relax.id->"relax"
           playful.id->"playful"
           adventure.id->"adventure"
          else ->""

      }
       intent.putExtra("value",value)
       startActivity(intent)
   }
}

