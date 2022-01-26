package com.example.pesanmakanan

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button



class HomeFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonFriedChicken: Button = view.findViewById(R.id.buttonFriedChicken)
        val buttonMieGoreng: Button = view.findViewById(R.id.buttonMieGoreng)
        val buttonSpagetti: Button = view.findViewById(R.id.buttonSpagetti)
        val buttonNasiGoreng: Button = view.findViewById(R.id.buttonNasiGoreng)
        buttonNasiGoreng.setOnClickListener(this)
        buttonSpagetti.setOnClickListener(this)
        buttonMieGoreng.setOnClickListener(this)
        buttonFriedChicken.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val mFragmentManager = requireFragmentManager()
        if (v.id == R.id.buttonFriedChicken){
            val mFriedChickenFragment = FriedChickenFragment()
            mFragmentManager.beginTransaction().apply {
                replace(R.id.frame_container, mFriedChickenFragment, FriedChickenFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
        else if (v.id == R.id.buttonMieGoreng){
            val mMieGorengFragment = MieGorengFragment()
            mFragmentManager.beginTransaction().apply {
                replace(R.id.frame_container, mMieGorengFragment, NasiGorengFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
        else if(v.id == R.id.buttonSpagetti){
            val mSpagettiFragment = SpagettiFragment()
            mFragmentManager.beginTransaction().apply {
                replace(R.id.frame_container, mSpagettiFragment, SpagettiFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
        else if (v.id == R.id.buttonNasiGoreng){
            val mNasiGorengFragment = NasiGorengFragment()
            mFragmentManager.beginTransaction().apply {
                replace(R.id.frame_container, mNasiGorengFragment, NasiGorengFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }
}