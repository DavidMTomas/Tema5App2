package com.davidmaiques.tema5app2

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.davidmaiques.tema5app2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tareaAdapter: TareaAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var itemDecoration: DividerItemDecoration


    override fun onCreate(savedInstanceState: Bundle?) {

        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        tareaAdapter = TareaAdapter(TareaDatos.TAREAS, this)
        linearLayoutManager=LinearLayoutManager(this)
        itemDecoration= DividerItemDecoration(this,DividerItemDecoration.VERTICAL)


        binding.recyclerId.apply {
            layoutManager=linearLayoutManager
            adapter=tareaAdapter
            addItemDecoration(itemDecoration)
        }

        



    }


    override fun onClick(tarea: Tarea) {
        Toast.makeText(this, tarea.getNombre(), Toast.LENGTH_SHORT).show()
    }


}