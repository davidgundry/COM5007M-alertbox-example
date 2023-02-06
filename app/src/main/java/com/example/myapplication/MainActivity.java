package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Mobile Application Development",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,10,10);
        toast.show();


        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setMessage("Welcome to Mobile Application Development");
        msgBox.setTitle("Welcome");
        msgBox.setPositiveButton("OK", null);
        msgBox.setNegativeButton("Cancel", null);
        msgBox.create();
        msgBox.show();
    }

    public void submitButton(View view)
    {
        EditText firstName = findViewById(R.id.firstNameInputText);
        EditText lastName = findViewById(R.id.lastNameInputText);
        RatingBar javaExp = findViewById(R.id.javaExpBar);
        RatingBar androidExp = findViewById(R.id.androidExpBar);

        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("Hello " + firstName.getText() + " " + lastName.getText());
        msgBox.setMessage("Your Java experience is " + javaExp.getRating());
        msgBox.setPositiveButton("OK", null);
        msgBox.setNegativeButton("Cancel", null);
        msgBox.create();
        msgBox.show();
    }

}
