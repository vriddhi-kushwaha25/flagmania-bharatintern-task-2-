package com.bi.flagmania

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bi.flagmania.ui.theme.FlagManiaTheme
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start: Button = findViewById(R.id.btn_start)
        val et_name: EditText= findViewById(R.id.et_name)

        btn_start.setOnClickListener{
            if(et_name.text.isEmpty()){
                Toast.makeText(this, "Please Enter your Name", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra(Content.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}