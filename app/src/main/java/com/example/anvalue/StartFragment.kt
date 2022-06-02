package com.example.anvalue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_start.view.*

class StartFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        val v = inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = v.startView
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getvalueprivat()
        viewModel.Valuelist.observe(this){
                list ->
            list.body()?.let { adapter.setList(it) }
        }
        return v


    }


}