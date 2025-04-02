package vcmsa.ci.mealsuggestionsapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // I have declared my variables here
        val timeView = findViewById<TextView>(R.id.timeView)
        val userText = findViewById<EditText>(R.id.userText)
        val mealButton = findViewById<Button>(R.id.mealButton)
        val mealTextView = findViewById<TextView>(R.id.mealTextView)
        val restartButton = findViewById<Button>(R.id.restartButton)

        // Here I have set up an event listener for the mealButton.
        // When the user clicks the button, their input is retrieved and processed.
        mealButton.setOnClickListener {
            val userInput = userText.text.toString().trim().lowercase()

            // Here I used an if statement to determine the meal suggestion
            // based on the user's input. If the input matches a time of day,
            // an appropriate meal will be suggested; otherwise, an error message is shown.
            val mealSuggestion: String = when (userInput) {
                "morning" -> {
                    "Oatmeal with berries and nuts"
                }
                "mid-morning" -> {
                    "Fruit with yogurt"
                }
                "afternoon" -> {
                    "Grilled Chicken Wrap"
                }
                "mid-afternoon" -> {
                    "A hard-boiled egg with avocado toast"
                }
                "dinner" -> {
                    "BBQ Chicken Wings and potato chips"
                }
                "mid-dinner" -> {
                    "Cottage pie"
                }
                else -> {
                    "Please enter a valid time of day (Morning, Mid-morning, Afternoon, etc.)."
                }
            }

            mealTextView.text = mealSuggestion
            //Author: Chat GPT
            // URL: https://chatgpt.com/share/67ece986-9884-800e-9f45-9d08fd0fe3d3
        }

        // Here I have set up an event listener for the restartButton.
        // When clicked, it clears the user input field and resets the meal suggestion text.
        restartButton.setOnClickListener {
            userText.text.clear()
            mealTextView.text = ""
        }
    }
}

