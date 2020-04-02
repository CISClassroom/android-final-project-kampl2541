package th.ac.kku.cis.mobileapp.hotel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class add_Client_room_Adapter (var mCtx: Context, var resource:Int, var items:List<The_room>)
    : ArrayAdapter<The_room>( mCtx , resource , items ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resource, null)

        var Name: TextView = view.findViewById(R.id.name)
        var Tel: TextView = view.findViewById(R.id.tel)
        var in_date: TextView = view.findViewById(R.id.in_date)
        var in_time: TextView = view.findViewById(R.id.in_time)
        var out_time: TextView = view.findViewById(R.id.out_time)
        var out_date: TextView = view.findViewById(R.id.out_date)
        var Theroom: The_room = items[position]


        Name.text = Theroom.name
        Tel.text = Theroom.tel

        in_date.text = Theroom.checkin_date
        in_time.text = Theroom.checkin_time

        out_time.text = Theroom.checkout_date
        out_date.text = Theroom.checkout_time

        return view
    }

}