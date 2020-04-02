package th.ac.kku.cis.mobileapp.hotel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class RoomAdapter (var mCtx: Context, var resource:Int, var items:List<Task_Room>)
    : ArrayAdapter<Task_Room>( mCtx , resource , items ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //super.getView(position, convertView, parent)

        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)

        val view: View = layoutInflater.inflate(resource, null)


        var taskRoom: TextView = view.findViewById(R.id.text_room)
        var taskStatus: TextView = view.findViewById(R.id.text_status)

        var task: Task_Room = items[position]

        taskRoom.text = task.Room
        taskStatus.text = task.Status

        return view
    }

}