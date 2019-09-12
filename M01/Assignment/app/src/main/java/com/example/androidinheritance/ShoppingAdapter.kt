package com.example.androidinheritance

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.display_shopping.view.*

class ShoppingAdapter (val shoppingList:ArrayList<ShoppingItem>): RecyclerView.Adapter<ShoppingAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.display_shopping,parent,false)
        return ViewHolder(view)
    }



class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
            val textView: TextView = view.textView
            val shoppingLayout: androidx.cardview.widget.CardView = view.Card_view
        }

 override fun getItemCount(): Int {
    return shoppingList.size
}

override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.textView.text = shoppingList[position].getdisplayName()
    holder.shoppingLayout.setBackgroundColor(shoppingList[position].colorId)
}


}