package vunlph30245.fpoly.and103_1
import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.hungnq123.myapplication12.VolleyFn1

class MainActivity2 : AppCompatActivity() {
    var context: Context = this
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnGet=findViewById<Button>(R.id.btnGetData)
        var tvKQ=findViewById<TextView>(R.id.tvKQ)
        val fn1 = VolleyFn1()
        btnGet!!.setOnClickListener {
            fn1.getAllData(context,tvKQ!!)
        }
    }
}