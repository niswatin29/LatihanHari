package com.example.latihanhari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
 //3 Var recyclerview
//recyclerview
  private lateinit var recyclerView: RecyclerView
  //recycler adapter
  private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
  //layout manager
  private lateinit var viewManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.listHari)
        //isi data
        val  data = arrayOf<String>(
            "Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Ahad",
        )
        // inisialisasi layout
        viewManager = LinearLayoutManager(this)
        // ambil data adapter
        recyclerAdapter = HariAdapter(data)
        // menmapilkan adapter ke recyvlerview
        recyclerView.adapter = recyclerAdapter
        // show data from adapter to layout interface
        recyclerView.layoutManager = viewManager
    }
}