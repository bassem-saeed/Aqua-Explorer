package com.aquacoders.aquaexplorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Context
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView

import java.io.File

import com.aquacoders.aquaexplorer.RecyclerView.*
import com.aquacoders.aquaexplorer.databinding.ActivityMainBinding

import com.itsaky.androidide.logsender.LogSender

public class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        // Remove this line if you don't want AndroidIDE to show this app's logs
        LogSender.startLogging(this@MainActivity)
        super.onCreate(savedInstanceState)
        // Inflate and get instance of binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        
        // set content view to binding's root
        setContentView(binding.root)
        var list1 = File("/storage/emulated/0/")
        val adapter = RecyclerViewAdapter(list1.listFiles())
        binding.recyclerview1.adapter = adapter
    }
}