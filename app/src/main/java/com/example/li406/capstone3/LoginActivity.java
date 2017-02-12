package com.example.li406.capstone3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class LoginActivity extends AppCompatActivity {

    public final static String EXTRA_PAGE = "com.example.li406.capstone3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**Called when the user clicks the button*/
    public void signUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void trouble_page(View view){
        Intent browerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kb.iu.edu/d/alpu"));
        startActivity(browerIntent);
    }
}
