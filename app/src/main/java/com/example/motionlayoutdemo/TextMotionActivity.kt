package com.example.motionlayoutdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout.DEBUG_SHOW_PATH
import kotlinx.android.synthetic.main.activity_text_motion.*

class TextMotionActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_motion)

        // 显示DEBUG路径
//        motionLayout.setDebugMode(DEBUG_SHOW_PATH)

    }
}