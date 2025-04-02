package vcmsa.ci.mealsuggestionsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Here I have declared and initialized the startButton.
        This button will allow the user to navigate to the next activity.
        */
        val startButton = findViewById<Button>(R.id.startButton)

        // Here I have set up an event listener for the startButton.
        // When clicked, it starts MainActivity2 using an intent.
        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}

