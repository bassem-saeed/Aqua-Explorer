package com.aquacoders.aquaexplorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView

import java.io.File

import com.aquacoders.aquaexplorer.RecyclerView.*
import com.aquacoders.aquaexplorer.databinding.ActivityMainBinding

public class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private lateinit var check :SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var list1 = File("/storage/emulated/0/")
        val adapter = RecyclerViewAdapter(list1.listFiles())
        binding.recyclerview1.adapter = adapter
    }



}