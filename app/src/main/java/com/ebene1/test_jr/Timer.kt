package com.ebene1.test_jr

class Timer(private var id:Int, private var name: String, private var image : Int, private var isSelected: Boolean, private var time:Int) {
    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getImage(): Int {
        return image
    }

    fun setImage(image: Int) {
        this.image = image
    }

    fun getSelected(): Boolean {
        return isSelected
    }

    fun setSelected(isSelected: Boolean) {
        this.isSelected = isSelected
    }
    fun getTime(): Int {
        return time
    }

    fun setTime(time: Int) {
        this.time = time
    }
}