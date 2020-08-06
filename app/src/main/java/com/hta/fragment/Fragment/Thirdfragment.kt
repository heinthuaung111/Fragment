package com.hta.fragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.hta.fragment.Model.Header
import com.hta.fragment.R
import kotlinx.android.synthetic.main.fragment_third.*
import com.hta.fragment.Adapter.HeaderAdapter as HeaderAdapter


class Thirdfragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var headerlist=ArrayList<Header>()
        headerlist.add(Header("111111111"))
        headerlist.add(Header("211111111"))
        headerlist.add(Header("311111111"))
        headerlist.add(Header("411111111"))
        headerlist.add(Header("511111111"))
        headerlist.add(Header("611111111"))
        headerlist.add(Header("711111111"))

        recyclerview.layoutManager= LinearLayoutManager(context)
        recyclerview.adapter=HeaderAdapter(headerlist)

//        recyclerview.apply { layoutManager=GridLayoutManager(context,3)//Apply type nae yay nee
//        adapter=HeaderAdapter(headerlist)}

    }
}

