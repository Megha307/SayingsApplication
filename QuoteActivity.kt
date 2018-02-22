package com.example.sanjeevkumar.sayings

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.sanjeevkumar.sayings.R.id.activity_chooser_view_content
import com.example.sanjeevkumar.sayings.R.id.adventure
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_quote.*

class QuoteActivity : AppCompatActivity() {
    var advventure= intArrayOf(R.drawable.aone,R.drawable.atwo,R.drawable.athree,R.drawable.afour,R.drawable.afive,R.drawable.asix,
    R.drawable.aseven,R.drawable.aeigth,R.drawable.anine,R.drawable.aten)
    var happy= intArrayOf(R.drawable.happyone,R.drawable.happytwo,R.drawable.happythree,R.drawable.happyfour,R.drawable.happyfive,
    R.drawable.happysix,R.drawable.happyseven,R.drawable.happyeigth,R.drawable.happynine,R.drawable.happyten)

    var sad= intArrayOf(R.drawable.sadone,R.drawable.sadtwo,R.drawable.sadthree,R.drawable.sadfour,R.drawable.sadfive,
            R.drawable.sadsix,R.drawable.sadseven,R.drawable.sadeigth,R.drawable.sadnine,R.drawable.sadten)

    var playful= intArrayOf(R.drawable.playfulone,R.drawable.playfultwo,R.drawable.playfulthree,R.drawable.playfulfour,R.drawable.playfulfive,
            R.drawable.playfulsix,R.drawable.playfulseven,R.drawable.playfuleigth,R.drawable.playfulnine,R.drawable.playfulten)

    var relax= intArrayOf(R.drawable.relaxone,R.drawable.relaxtwo,R.drawable.relaxthree,R.drawable.relaxfour,R.drawable.relaxfive,
            R.drawable.relaxsix,R.drawable.relaxseven,R.drawable.relaxeigth,R.drawable.relaxnine,R.drawable.relaxten)

    var inspire= intArrayOf(R.drawable.inspireone,R.drawable.inspiretwo,R.drawable.inspirethree,R.drawable.inspirefour,R.drawable.inspirefive,
            R.drawable.inspiresix,R.drawable.inspireseven,R.drawable.inspireeigth,R.drawable.inspirenine,R.drawable.inspireten)
    var counter=1
    var cell=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)
        var subject=intent.getStringExtra("value")
        when(subject)
        {
            "adventure"-> {
                imageview.setImageResource(advventure[0])
                nextbutton.setOnClickListener {
                    imageview.setImageResource(advventure[counter])
                    counter++

                    if (counter == 9) {
                        counter = 0
                    }
                }
            }
           "happy"-> {
               imageview.setImageResource(happy[0])
               nextbutton.setOnClickListener {
                   imageview.setImageResource(happy[counter])
                   counter++

                   if (counter == 9) {
                       counter = 0
                   }
               }
           }
            "sad"->
               {
                   imageview.setImageResource(sad[0])
                   nextbutton.setOnClickListener {
                       imageview.setImageResource(sad[counter])
                       counter++

                       if (counter == 9) {
                           counter = 0
                       }
                   }

               }
            "playful"->{ imageview.setImageResource(playful[0])
                nextbutton.setOnClickListener {
                    imageview.setImageResource(playful[counter])
                    counter++

                    if (counter == 9) {
                        counter = 0
                    }
                }

            }
            "relax"->{imageview.setImageResource(relax[0])
                nextbutton.setOnClickListener {
                    imageview.setImageResource(relax[counter])
                    counter++

                    if (counter == 9) {
                        counter = 0
                    }
                }

            }
            "inspire"->{imageview.setImageResource(inspire[0])
                nextbutton.setOnClickListener {
                    imageview.setImageResource(inspire[counter])
                    counter++

                    if (counter == 9) {
                        counter = 0
                    }
                }

            }




           }
        }
        }







