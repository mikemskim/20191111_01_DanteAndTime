package com.tj.a20191111_01_danteandtime

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    abstract fun setupEvents()
    abstract fun setValues()
}