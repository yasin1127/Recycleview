package com.example.recycle

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycle.adapter.actoradapter
import com.example.recycle.databinding.ActivityMainBinding
import com.example.recycle.hollywoodstar.actor

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.rv.layoutManager=LinearLayoutManager(this)

       val act = ArrayList<actor>()
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))
           act.add(actor("Will Smith","A great man who",R.drawable.mib))




        var actor= actoradapter(act)
        binding.rv.adapter=actor

    }
}