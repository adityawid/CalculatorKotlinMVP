package com.devjurnal.calculatorkotlinmvp

import android.widget.EditText

/**
 * Created by DevJurnal on 2/17/18.
 */
class HitungPresenterImp : HitungPresenter {
    override fun Hitung(nilai1: EditText, nilai2: EditText, operator: String) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() || b.isNotEmpty()){
            var hitung : Double
            if (operator == "+") {
                hitung = a.toDouble() + b.toDouble()
            }else if (operator == "-"){
                hitung = a.toDouble() - b.toDouble()
            }else if (operator == "*"){
                hitung = a.toDouble() * b.toDouble()
            }else {
                hitung = a.toDouble() / b.toDouble()
            }

            modelView?.Hasil(hitung.toString())
        }else{
            modelView?.Kosong()
        }
    }

    var modelView : MainView? = null

    constructor(modelView: MainView?) {
        this.modelView = modelView
    }


    override fun hitungTambah(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() || b.isNotEmpty()){
            var hitung = a.toDouble() + b.toDouble()

            modelView?.Hasil(hitung.toString())
        }else{
            modelView?.Kosong()
        }
    }

    override fun hitungKurang(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() || b.isNotEmpty()){
            var hitung = a.toDouble() - b.toDouble()

            modelView?.Hasil(hitung.toString())
        }else{
            modelView?.Kosong()
        }
    }

    override fun hitungBagi(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() || b.isNotEmpty()){
            var hitung = a.toDouble() / b.toDouble()

            modelView?.Hasil(hitung.toString())
        }else{
            modelView?.Kosong()
        }
    }

    override fun hitungKali(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var b = nilai2.text.toString()

        if (a.isNotEmpty() || b.isNotEmpty()){
            var hitung = a.toDouble() * b.toDouble()

            modelView?.Hasil(hitung.toString())
        }else{
            modelView?.Kosong()
        }
    }
}