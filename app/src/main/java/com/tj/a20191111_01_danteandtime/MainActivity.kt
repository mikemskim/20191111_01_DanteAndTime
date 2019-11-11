package com.tj.a20191111_01_danteandtime

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : BaseActivity() {

    // 시작일자와 시간을 모두 저장하고 있는 캘린더 변수
    var startDateTimeCalendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        startDateBtn.setOnClickListener {
            var datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                //

            }, startDateTimeCalendar.get(Calendar.YEAR), startDateTimeCalendar.get(Calendar.MONTH), startDateTimeCalendar.get(Calendar.DAY_OF_MONTH))

            datePickerDialog.show()
        }

        startTimeBtn.setOnClickListener {

        }
    }

    override fun setValues() {

    }
}
