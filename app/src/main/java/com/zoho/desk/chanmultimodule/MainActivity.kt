package com.zoho.desk.chanmultimodule

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        initView()
    }

    private fun initView() {
        btnFirst.setOnClickListener {
            startActivity(Intent(this, SupportModuleActivity::class.java))
        }

        btnSecond.setOnClickListener {
            startActivity(Intent(this, AndroidXModuleActivity::class.java))
        }
    }
}
