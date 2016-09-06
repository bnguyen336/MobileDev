package edu.orangecoastcollege.cs273.bnguyen336.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Define the button as an instance variable (number)
    Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Restoring user settings from previous session
        super.onCreate(savedInstanceState);
        //Initiating (!) opening the layout called activity_main(.xml)
        setContentView(R.layout.activity_main);

        //Hook up speakButton to the one in our view
        speakButton = (Button) findViewById(R.id.speakButton);
        speakButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.toast_text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
