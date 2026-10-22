package com.example.questnavigasimvvm_0230

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.questnavigasimvvm_0230.ui.theme.QuestNavigasiMVVM_0230Theme
import com.example.questnavigasimvvm_0230.view.DataApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuestNavigasiMVVM_0230Theme {
                DataApp()
            }
        }
    }
}