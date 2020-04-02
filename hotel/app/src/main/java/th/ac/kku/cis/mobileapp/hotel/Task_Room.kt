package th.ac.kku.cis.mobileapp.hotel

import kotlinx.android.synthetic.main.activity_add_room.view.*

class Task_Room (val Room:String ,val Status:String,val roomid:Int)//



class The_room {
    companion object Factory {
        fun create(): The_room = The_room()
    }

    var id: String? = null
    var name: String? = null
    var tel: String? = null
    var checkin_date: String? = null
    var checkin_time: String? = null
    var checkout_date: String? = null
    var checkout_time: String? = null
}