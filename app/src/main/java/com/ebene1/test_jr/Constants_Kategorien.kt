package com.ebene1.test_jr

import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class Constants_Kategorien {

    companion object{

        fun initializeCategories() : ArrayList<TimerCategories> {

            val kategorienListe = ArrayList<TimerCategories>()

            val kategorie1 = TimerCategories(1, "Essen & Trinken", R.drawable.naruto, false)
            kategorienListe.add(kategorie1)
            val kategorie2 = TimerCategories(2, "Sport", R.drawable.naruto, false)
            kategorienListe.add(kategorie2)
            val kategorie3 = TimerCategories(3, "Kaki", R.drawable.naruto, false)
            kategorienListe.add(kategorie3)
            val kategorie4 = TimerCategories(4, "Minecraft PVP Training", R.drawable.naruto, false)
            kategorienListe.add(kategorie4)
            val kategorie5 = TimerCategories(5, "Android Stdio Training", R.drawable.naruto, false)
            kategorienListe.add(kategorie5)

            return kategorienListe
        }
        fun initializeTimer(x:Int) : ArrayList<Timer>{
            val timerListe = ArrayList<Timer>()

            when(x){
                0-> {
                    val kategorie1_1 = Timer(1, "Essen & Trinken", R.drawable.naruto, false, 20)
                    timerListe.add(kategorie1_1)
                    val kategorie1_2 = Timer(2, "Sport", R.drawable.naruto, false, 30)
                    timerListe.add(kategorie1_2)
                    val kategorie1_3 = Timer(3, "Kaki", R.drawable.naruto, false, 40)
                    timerListe.add(kategorie1_3)
                    val kategorie1_4 = Timer(4, "Minecraft PVP Training", R.drawable.naruto, false, 50)
                    timerListe.add(kategorie1_4)
                    val kategorie1_5 = Timer(5, "Android Stdio Training", R.drawable.naruto, false, 60)
                    timerListe.add(kategorie1_5)
                }
                1-> {
                    val kategorie2_1 = Timer(1, "Essen & Trinken", R.drawable.naruto, false, 20)
                    timerListe.add(kategorie2_1)
                    val kategorie2_2 = Timer(2, "Sport", R.drawable.naruto, false, 30)
                    timerListe.add(kategorie2_2)
                    val kategorie2_3 = Timer(3, "Kaki", R.drawable.naruto, false, 40)
                    timerListe.add(kategorie2_3)
                    val kategorie2_4 = Timer(4, "Minecraft PVP Training", R.drawable.naruto, false, 50)
                    timerListe.add(kategorie2_4)
                    val kategorie2_5 = Timer(5, "Android Stdio Training", R.drawable.naruto, false, 60)
                    timerListe.add(kategorie2_5)
                }
                2->{
                    val kategorie3_1 = Timer(1, "Essen & Trinken", R.drawable.naruto, false, 20)
                    timerListe.add(kategorie3_1)
                    val kategorie3_2 = Timer(2, "Sport", R.drawable.naruto, false, 30)
                    timerListe.add(kategorie3_2)
                    val kategorie3_3 = Timer(3, "Kaki", R.drawable.naruto, false, 40)
                    timerListe.add(kategorie3_3)
                    val kategorie3_4 = Timer(4, "Minecraft PVP Training", R.drawable.naruto, false, 50)
                    timerListe.add(kategorie3_4)
                    val kategorie3_5 = Timer(5, "Android Stdio Training", R.drawable.naruto, false, 60)
                    timerListe.add(kategorie3_5)
                }
                3->{
                    val kategorie4_1 = Timer(1, "Essen & Trinken", R.drawable.naruto, false, 20)
                    timerListe.add(kategorie4_1)
                    val kategorie4_2 = Timer(2, "Sport", R.drawable.naruto, false, 30)
                    timerListe.add(kategorie4_2)
                    val kategorie4_3 = Timer(3, "Kaki", R.drawable.naruto, false, 40)
                    timerListe.add(kategorie4_3)
                    val kategorie4_4 = Timer(4, "Minecraft PVP Training", R.drawable.naruto, false, 50)
                    timerListe.add(kategorie4_4)
                    val kategorie4_5 = Timer(5, "Android Stdio Training", R.drawable.naruto, false, 60)
                    timerListe.add(kategorie4_5)
                }
                4->{
                    val kategorie5_1 = Timer(1, "Essen & Trinken", R.drawable.naruto, false, 20)
                    timerListe.add(kategorie5_1)
                    val kategorie5_2 = Timer(2, "Sport", R.drawable.naruto, false, 30)
                    timerListe.add(kategorie5_2)
                    val kategorie5_3 = Timer(3, "Kaki", R.drawable.naruto, false, 40)
                    timerListe.add(kategorie5_3)
                    val kategorie5_4 = Timer(4, "Minecraft PVP Training", R.drawable.naruto, false, 50)
                    timerListe.add(kategorie5_4)
                    val kategorie5_5 = Timer(5, "Android Stdio Training", R.drawable.naruto, false, 60)
                    timerListe.add(kategorie5_5)
                }

            }

            return timerListe
        }
    }
}