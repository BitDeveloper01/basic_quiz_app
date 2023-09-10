package hashmi.asif.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.startBtn)
        val etName:EditText = findViewById(R.id.et_name)
        startBtn.setOnClickListener{
            if (etName.text.isEmpty())
                Toast.makeText(this, "Please enter the name first", Toast.LENGTH_LONG).show()
            else{
                var intent = Intent(this, QuizQuesionActivity::class.java)
                startActivity(intent)
                finish()
            }

        }

    }
}