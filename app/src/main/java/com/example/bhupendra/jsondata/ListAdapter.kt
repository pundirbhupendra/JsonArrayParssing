package com.example.bhupendra.jsondata

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.my_list.view.*

class ListAdapter(val context: Context, private val friendLists: List<FriendsModal>) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.my_list, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val list = friendLists[position]
        holder.name.text = list.name
        holder.email.text = list.emailId


    }

    override fun getItemCount(): Int {
        return friendLists.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val name: TextView = itemView.user_name
        val email: TextView = itemView.user_emailId


    }

}
