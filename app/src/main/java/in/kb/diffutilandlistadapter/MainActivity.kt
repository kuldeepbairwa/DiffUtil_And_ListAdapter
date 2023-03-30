package `in`.kb.diffutilandlistadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.rv)

        val adapter = ProgrammingAdapter()

        rv.adapter = adapter
        val p1 = ProgrammingItem(1,"C","C Programming")
        val p2 = ProgrammingItem(2,"J","Java")
        val p3 = ProgrammingItem(3,"P","Python")
        adapter.submitList(listOf(p1,p2,p3))

        Handler(Looper.getMainLooper()).postDelayed({
            val p1 = ProgrammingItem(1,"C","C Programming")
            val p5 = ProgrammingItem(3,"N","Node JS")
            val p4 = ProgrammingItem(2,"J","Java")
            val p6 = ProgrammingItem(4,"S","Scala")
            adapter.submitList(listOf(p1,p5,p4,p6))
        },4000L)
    }
}