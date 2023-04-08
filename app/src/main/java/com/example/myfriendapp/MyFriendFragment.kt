package com.example.myfriendapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyFriendFragment : Fragment()  {
    private var fabAddFriend:FloatingActionButton? = null
    private var listMyFriends:RecyclerView? = null
    lateinit var listTeman : MutableList<MyFriend>

    companion object {
        fun newInstance(): MyFriendFragment {
            return MyFriendFragment()
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.my_friend_fragment,
            container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState:
    Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView() {
        fabAddFriend = activity?.findViewById(R.id.fabAddFriend)
        listMyFriends = activity?.findViewById(R.id.ListMyFriend)

        fabAddFriend?.setOnClickListener {
            (activity as MainActivity).tampilMyFriendsAddFragment() }

        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()

    }

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(MyFriend("Addonis", "Laki-laki",
            "Sinod@gmail.com", "085719004268", "Kepanjen"))
        listTeman.add(MyFriend("Haitham", "Laki-laki",
            "Al@gmail.com", "081213416171", "Malang"))
    }
    private fun tampilTeman() {
        listMyFriends?.layoutManager = LinearLayoutManager(activity)
        listMyFriends?.adapter = MyFriendAdapter(requireActivity(), listTeman as ArrayList<MyFriend>)
    }
}