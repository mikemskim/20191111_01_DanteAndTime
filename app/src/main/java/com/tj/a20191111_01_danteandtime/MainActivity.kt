package com.tj.a20191111_01_danteandtime

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
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

                // 시작일시 변수에 선택값 반영
                startDateTimeCalendar.set(year, month, dayOfMonth)

                // 버튼에 2019-09-08 형식으로 출력
                var sdf = SimpleDateFormat("yyyy-MM-dd (EE)")

                startDateBtn.text = sdf.format(startDateTimeCalendar.time)
            }, startDateTimeCalendar.get(Calendar.YEAR), startDateTimeCalendar.get(Calendar.MONTH), startDateTimeCalendar.get(Calendar.DAY_OF_MONTH))

            datePickerDialog.show()
        }

        startTimeBtn.setOnClickListener {
            var timePickerDialog = TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                startDateTimeCalendar.set

            }, startDateTimeCalendar.get(Calendar.HOUR), startDateTimeCalendar.get(Calendar.MINUTE) )
        }
    }

    override fun setValues() {

    }
}
