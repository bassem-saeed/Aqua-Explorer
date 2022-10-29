package com.aquacoders.aquaexplorer

/* Start Android Views Import */
import android.view.View
import android.widget.TextView
import android.widget.ImageView
import android.widget.LinearLayout
/* End Android Views Import */
import androidx.cardview.widget.CardView
/* Start Libraries Import */
import androidx.recyclerview.widget.RecyclerView
/* End Libraries Import */

class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view){

 //   val item_img = view.findViewById<ImageView>(R.id.item_img)
    val card_item = view.findViewById<LinearLayout>(R.id.list_item_main)
    val item_date = view.findViewById<TextView>(R.id.item_date)
    
    val folder_name = view.findViewById<TextView>(R.id.item_name)
    
    val file_name = view.findViewById<TextView>(R.id.item_name)
    val file_size = view.findViewById<TextView>(R.id.file_size)

}