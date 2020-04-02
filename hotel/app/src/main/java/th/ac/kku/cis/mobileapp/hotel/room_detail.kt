package th.ac.kku.cis.mobileapp.hotel


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_room_detail.*

class room_detail : AppCompatActivity() {

   // lateinit var ScrollView: ScrollView
    lateinit var ref: DatabaseReference
    lateinit var items:List<The_room>
    var v:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_detail)

        //tv.text =  intent.getIntExtra("EXTRA_SESSION_ID",0).toString()

        v = intent.getIntExtra("val",0)
        textView12.visibility= View.GONE
        textView13.visibility= View.GONE
        textView14.visibility= View.GONE
        textView15.visibility= View.GONE
        textView16.visibility= View.GONE
        ref = FirebaseDatabase.getInstance().getReference("The_room").child(v.toString())


        button_delete.setOnClickListener {

            ref.removeValue()
            finish()

        }


        items = mutableListOf()
        //เรียกใช้ข้อมูลใน fibase
        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {

            }

            override fun onDataChange(p0: DataSnapshot) {
                if(p0!!.exists()){
                    textView12.visibility= View.VISIBLE
                    textView13.visibility= View.VISIBLE
                    textView14.visibility= View.VISIBLE
                    textView15.visibility= View.VISIBLE
                    textView16.visibility= View.VISIBLE

                    textView12.text= p0.child("name").value.toString()

                    textView13.text= p0.child("tel").value.toString()

                    textView14.text= p0.child("checkin_date").value.toString()

                    textView17.text= p0.child("checkin_time").value.toString()

                    textView15.text= p0.child("checkout_date").value.toString()

                    textView16.text= p0.child("checkout_time").value.toString()
                }


            }
        }
        )
    }

}
