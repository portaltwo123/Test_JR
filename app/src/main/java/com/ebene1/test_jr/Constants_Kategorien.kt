package com.ebene1.test_jr

class Constants_Kategorien {

    companion object{

        fun initializeCategories() : ArrayList<TimerCategories> {

            val kategorienListe = ArrayList<TimerCategories>()

            val Kategorie1 = TimerCategories(1, "Essen & Trinken", R.drawable.naruto, false)
            kategorienListe.add(Kategorie1)
            val Kategorie2 = TimerCategories(2, "Sport", R.drawable.naruto, false)
            kategorienListe.add(Kategorie2)
            val Kategorie3 = TimerCategories(3, "Kaki", R.drawable.naruto, false)
            kategorienListe.add(Kategorie3)
            val Kategorie4 = TimerCategories(4, "Minecraft PVP Training", R.drawable.naruto, false)
            kategorienListe.add(Kategorie4)
            val Kategorie5 = TimerCategories(5, "Android Stdio Training", R.drawable.naruto, false)
            kategorienListe.add(Kategorie5)

            return kategorienListe
        }
    }
}