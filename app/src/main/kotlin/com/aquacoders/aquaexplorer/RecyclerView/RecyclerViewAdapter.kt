package com.aquacoders.aquaexplorer

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.content.Context
import android.widget.Toast
import java.util.ArrayList
import java.io.File
import com.aquacoders.aquaexplorer.RecyclerView.*

class RecyclerViewAdapter(var list: Array<File>): RecyclerView.Adapter<RecyclerViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder{
		val view = LayoutInflater.from(parent.context).inflate(
		R.layout.item,
		parent, false)
		return RecyclerViewHolder(view)
	}
	override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int){
        var contents = list.toList()
        var directories = contents.filter{ it.isDirectory }.sortedWith(compareBy{it})
        var files = contents.filter{ !it.isDirectory }.sortedWith(compareBy{it})
        var final_list = directories + files
        var list_data = final_list[position]
    //    initializeList(contents)
		holder.apply{
			item_date.text = "dhdh"
			folder_name.text = list_data.getName()
			file_size.text = list_data.getTotalSpace().toString()
			file_name.text = list_data.getName()
		}
        holder.card_item.setOnClickListener{
            var mmm = File(list_data.absolutePath)
            var ttt = mmm.listFiles().toList()
            var directories = contents.filter{ it.isDirectory }.sortedWith(compareBy{it})
            var files = contents.filter{ !it.isDirectory }.sortedWith(compareBy{it})
            var final_list = directories + files
            var list_data = final_list[position]
        //    initializeList(ttt)
            holder.item_date.text = "dhdh"
			holder.folder_name.text = list_data.getName()
			holder.file_size.text = list_data.getTotalSpace().toString()
			holder.file_name.text = list_data.getName()
			notifyDataSetChanged()
        }
	}
	override fun getItemCount(): Int = list.size
    
/*    private fun initializeList(contents: List<File>): List<File>{
        var directories = contents.filter{ it.isDirectory }.sortedWith(compareBy{it})
        var files = contents.filter{ !it.isDirectory }.sortedWith(compareBy{it})
        var final_list = directories + files
        return final_list
    }*/
}