package com.firebasepractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    TextView result;
    String KEY = "EMAIL_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView) findViewById(R.id.hello_text);

        Intent startingIntent = getIntent();
        String user_email = startingIntent.getStringExtra(KEY);

        result.setText("Hello " + user_email);
    }
}
