package th.ac.kku.cis.mobileapp.hotel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_add_room.*



class add_room : AppCompatActivity() {

    lateinit var mDB: DatabaseReference
    lateinit var auth: FirebaseAuth
    var newData: The_room = The_room.create()
    var v:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_room)
        v = intent.getIntExtra("val",0)

        auth = FirebaseAuth.getInstance()
        mDB = FirebaseDatabase.getInstance().reference
        button_record.setOnClickListener {
            AddData()
            var i = Intent(this,Homepage::class.java)
            startActivity(i)
            finish()

        }

    }

    fun AddData() {//แอดข้อมูลเข้า fibase
        val obj = mDB.child("The_room").child(v.toString())
        newData.name = name.text.toString()
        newData.tel = tel.text.toString()

        newData.checkin_date = in_date.text.toString()
        newData.checkin_time = in_time.text.toString()

        newData.checkout_date = out_time.text.toString()
        newData.checkout_time = out_date.text.toString()

        newData.id = obj.key
        obj.setValue(newData)
    }

}
