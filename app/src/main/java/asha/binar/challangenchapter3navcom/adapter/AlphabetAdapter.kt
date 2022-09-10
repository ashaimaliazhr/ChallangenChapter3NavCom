package asha.binar.challangenchapter3navcom.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import asha.binar.challangenchapter3navcom.R
import asha.binar.challangenchapter3navcom.view.MyData

class AlphabetAdapter() : RecyclerView.Adapter<AlphabetAdapter.AlphabetViewHolder>() {

    private var diffCallBack = object: DiffUtil.ItemCallback<MyData>(){
        override fun areItemsTheSame(oldItem: MyData, newItem: MyData): Boolean{
            return oldItem.alphabet == newItem.alphabet
        }

        override fun areContentsTheSame(oldItem: MyData, newItem: MyData): Boolean {
            return oldItem.hashCode() == newItem.hashCode()}
    }

    private var differ = AsyncListDiffer(this, diffCallBack)
    fun submitData(value: ArrayList<MyData>) = differ.submitList(value)

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): AlphabetViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return AlphabetViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlphabetViewHolder, position: Int){
        val data = differ.currentList[position]

        val mBundle = Bundle()
        mBundle.putChar("KEY_ALPHABETS", data.alphabet)
        mBundle.putStringArrayList("KEY_WORDS", data.list)

        with(holder){
            button.text = differ.currentList[position].alphabet.toString()
            button.setOnClickListener{
                itemView.findNavController().navigate(R.id.action_alphabetFragment_to_word_Fragment, mBundle)
            }
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    inner class AlphabetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.btnClick)
    }
}