package com.example.myfriendapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class MyFriendAddFragment : Fragment() {
    private var btnSave : Button?=null

    companion object {
        fun newInstance(): MyFriendAddFragment {
            return MyFriendAddFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container:
        ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.my_friend_add_fragment,
            container, false
        )
    }

    override fun onViewCreated(
        view: View, savedInstanceState:
        Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        btnSave?.setOnClickListener { (activity as
                MainActivity).tampilMyFriendsFragment() }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}