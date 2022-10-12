package com.example.SocialMediaApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    EditText email, pass;
    TextView forgotten;
    Button login, createmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        itiUnit();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Log_in();
            }
        });
    }


    private void itiUnit(){
        email=findViewById(R.id.email_EditText);
        pass=findViewById(R.id.password_EditText);
        forgotten=findViewById(R.id.forgotten_textView);
        login=findViewById(R.id.login_button);
        createmail=findViewById(R.id.createEmail_button);
    }


  private void Log_in(){
      if(email.getText().toString().isEmpty() || pass.getText().toString().isEmpty()){
          Toast.makeText(this,"enter email and password!", Toast.LENGTH_LONG).show();
          return;
      }

       if(email.getText().toString().equalsIgnoreCase("omar") && pass.getText().toString().equalsIgnoreCase("123"))
       {
           Toast.makeText(this,"login sucsess", Toast.LENGTH_SHORT).show();
           Intent i=new Intent(this,HomeActivity.class);
           startActivity(i);
           finish();
       }
       else{
           Toast.makeText(this,"login failed", Toast.LENGTH_SHORT).show();
       }
  }

}