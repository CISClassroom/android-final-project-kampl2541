package th.ac.kku.cis.mobileapp.hotel

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_homepage.*

class Homepage : AppCompatActivity() {

    lateinit var auth: FirebaseAuth
    var newpropro: Boolean = false
    lateinit var ref: DatabaseReference

    lateinit var listView: ListView
    lateinit var  items:List<Task_Room>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

     var listView = findViewById<ListView>(R.id.ListView_class1)
       items = mutableListOf()
        val Task_Room = mutableListOf<Task_Room>()
        Task_Room.add((Task_Room("ห้อง1-01","no")))
        Task_Room.add((Task_Room("ห้อง1-02","no")))
        Task_Room.add((Task_Room("ห้อง1-03","no")))
        Task_Room.add((Task_Room("ห้อง1-04","no")))
        Task_Room.add((Task_Room("ห้อง1-05","no")))
        Task_Room.add((Task_Room("ห้อง1-06","no")))
        Task_Room.add((Task_Room("ห้อง1-07","no")))
        Task_Room.add((Task_Room("ห้อง1-08","no")))
        Task_Room.add((Task_Room("ห้อง1-09","no")))
        Task_Room.add((Task_Room("ห้อง1-10","no")))

        listView.adapter = RoomAdapter(this,R.layout.activity_the_room , Task_Room)

        listView.setOnItemClickListener { parent, view, position, id ->

            if(position==0){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("101")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",101)

                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",101)

                            startActivity(i)

                        }

                    }
                })
            }
            else if(position==1){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("102")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",102)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",102)
                            startActivity(i)
                        }

                    }
                })
            }
            else if(position==2){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("103")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",103)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",103)
                            startActivity(i)
                        }

                    }
                })
            }
            else if(position==3){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("104")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",104)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",104)
                            startActivity(i)
                        }

                    }
                })
            }
            if(position==4){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("105")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",105)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",105)
                            startActivity(i)
                        }

                    }
                })
            }
            else if(position==5){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("106")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",106)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",106)
                            startActivity(i)
                        }

                    }
                })
            }
            else if(position==6){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("107")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",107)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",107)
                            startActivity(i)
                        }

                    }
                })
            }
            else if(position==7){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("108")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",108)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",108)
                            startActivity(i)
                        }

                    }
                })
            }
            else if(position==8){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("109")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",109)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",109)
                            startActivity(i)
                        }

                    }
                })
            }
            else if(position==9){
                ref = FirebaseDatabase.getInstance().getReference("The_room").child("110")
                ref.addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(p0: DataSnapshot) {
                        if(p0!!.exists()){
                            var i = Intent(this@Homepage,room_detail::class.java)
                            i.putExtra("val",110)
                            startActivity(i)
                        }
                        else{
                            var i = Intent(this@Homepage,add_room::class.java)
                            i.putExtra("val",110)
                            startActivity(i)
                        }

                    }
                })
            }

        }

        if (supportActionBar != null)
            supportActionBar?.hide()


        val NameSetting: TextView = findViewById(R.id.textView3)
        val Email: TextView = findViewById(R.id.textView4)
        auth = FirebaseAuth.getInstance()
        auth.currentUser!!.email
        val xx: Uri? = auth.currentUser!!.photoUrl
        NameSetting.text = auth.currentUser!!.displayName.toString()


        Email.text = auth.currentUser!!.email
        val btnlogout: Button = findViewById(R.id.button2)
        btnlogout.setOnClickListener({ v -> singOut() })


}


    private fun passproject() {
        if (newpropro) {
            var i = Intent(this, MainActivity::class.java)
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)
        }

    }

    private fun singOut() {
        auth.signOut()
        newpropro = true
        passproject()
    }

    private fun updateUI(user: FirebaseUser?) {
        if (user == null) {
           // show.text = "No User"
        } else {
           // show.text = user.email.toString()
            passproject()
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 101) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                firebaseAuth(account!!)
                //FirebaseAuth(account)
            } catch (e: ApiException) {
                Log.i("Error OOP", e.toString())
                newpropro = false
                updateUI(null)
            }
        }
    }

    private fun firebaseAuth(account: GoogleSignInAccount) {
        val credential = GoogleAuthProvider.getCredential(account.idToken, null)
        auth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    newpropro = true
                    updateUI(user)
                } else {
                    newpropro = false
                    updateUI(null)
                }
            }
    }
}
