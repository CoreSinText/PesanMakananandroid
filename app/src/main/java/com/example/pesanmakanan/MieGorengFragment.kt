package com.example.pesanmakanan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


class MieGorengFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mie_goreng, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonMieGoreng: ImageButton = view.findViewById(R.id.buttonTeleponMieGoreng)
        buttonMieGoreng.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val phone = "081265388116"
        val dialPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone"))
        startActivity(dialPhone)
    }

}