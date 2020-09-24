package com.example.facebook

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.profile_activity.*


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity)

        button.setOnClickListener {
            city.visibility = View.GONE
            edit.visibility = View.VISIBLE
            button.visibility = View.GONE
            edit.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
                if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                    city.text = edit.text.toString()
                    edit.visibility = View.GONE
                    city.visibility = View.VISIBLE
                    button.visibility = View.VISIBLE
                    return@OnKeyListener true
                }
                return@OnKeyListener false
            })
        }
    }
}