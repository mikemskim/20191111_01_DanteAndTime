package com.tj.a20191111_01_danteandtime.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.tj.a20191111_01_danteandtime.R
import com.tj.a20191111_01_danteandtime.datas.ScheduleType

class ScheduleTypeSpinnerAdapter(context: Context, res:Int, list: ArrayList<ScheduleType>) : ArrayAdapter<ScheduleType>(context, res, list) {

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    constructor(context: Context, list: ArrayList<ScheduleType>) : this(context, R.layout.schedule_type_list_item, list)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.schedule_type_list_item, null)
        }

        var row = tempRow!!



        return row
    }

}