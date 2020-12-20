package com.ebene1.test_jr

class Constants_Kategorien {

    companion object{

        fun initializeCategories() : ArrayList<Timer_Categories> {

            val kategorienListe = ArrayList<Timer_Categories>()

            val Kategorie1 = Timer_Categories(1, "Essen & Trinken", R.drawable.naruto, false)
            kategorienListe.add(Kategorie1)
            val Kategorie2 = Timer_Categories(2, "Sport", R.drawable.naruto, false)
            kategorienListe.add(Kategorie2)
            val Kategorie3 = Timer_Categories(3, "Kaki", R.drawable.naruto, false)
            kategorienListe.add(Kategorie3)
            val Kategorie4 = Timer_Categories(4, "Minecraft PVP Training", R.drawable.naruto, false)
            kategorienListe.add(Kategorie4)
            val Kategorie5 = Timer_Categories(5, "Android Stdio Training", R.drawable.naruto, false)
            kategorienListe.add(Kategorie5)

            return kategorienListe
        }
    }
}