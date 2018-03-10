package com.example.rodolfo.activities2.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.rodolfo.activities2.R;
import com.example.rodolfo.activities2.models.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getExtras();
        User user = bundle.getParcelable("user");

        Toast.makeText(this, user.getUsername(), Toast.LENGTH_LONG).show();
    }
}
