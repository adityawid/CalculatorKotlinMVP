package com.devjurnal.calculatorkotlinmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    lateinit var presenter : HitungPresenterImp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()

    }

    private fun initView() {
        btnAdd.setOnClickListener {
//            presenter.hitungTambah(edtInputNilai1,edtInputNilai2)
            presenter.Hitung(edtInputNilai1,edtInputNilai2,btnAdd.text.toString())
        }

        btnMin.setOnClickListener {
//            presenter.hitungKurang(edtInputNilai1,edtInputNilai2)
            presenter.Hitung(edtInputNilai1,edtInputNilai2,btnMin.text.toString())
        }

        btnBagi.setOnClickListener {
//            presenter.hitungBagi(edtInputNilai1,edtInputNilai2)
            presenter.Hitung(edtInputNilai1,edtInputNilai2,btnBagi.text.toString())
        }

        btnKali.setOnClickListener {
//            presenter.hitungKali(edtInputNilai1,edtInputNilai2)
            presenter.Hitung(edtInputNilai1,edtInputNilai2,btnKali.text.toString())
        }
    }

    private fun initPresenter() {
        presenter = HitungPresenterImp(this)
    }

    override fun Kosong() {
        Toast.makeText(applicationContext, "Nilai masih kosong", Toast.LENGTH_SHORT).show()
    }

    override fun Hasil(nilai: String) {
        tvHasil.text = nilai
    }
}
