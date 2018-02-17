package com.devjurnal.calculatorkotlinmvp

import android.widget.EditText

/**
 * Created by DevJurnal on 2/17/18.
 */
interface HitungPresenter {

    fun hitungTambah(nilai1 : EditText , nilai2 : EditText)
    fun hitungKurang(nilai1 : EditText , nilai2 : EditText)
    fun hitungBagi(nilai1 : EditText , nilai2 : EditText)
    fun hitungKali(nilai1 : EditText , nilai2 : EditText)

    fun Hitung(nilai1 : EditText, nilai2 : EditText , operator : String)
}