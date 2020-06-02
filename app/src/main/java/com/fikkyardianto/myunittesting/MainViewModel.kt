package com.fikkyardianto.myunittesting

class MainViewModel(private val cubaidModel: CuboidModel) {
    fun getCircumference(): Double = cubaidModel.getCircumference()

    fun getSurfaceArea(): Double = cubaidModel.getSurfaceArea()

    fun getVolume(): Double = cubaidModel.getVolume()

    fun save(l: Double, w: Double, h: Double) {
        cubaidModel.save(l, w, h)
    }
}