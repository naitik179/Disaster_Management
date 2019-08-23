package com.example.disastermanagement;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public TextInputLayout textinputname;
    public TextInputLayout textinputemail;
    public TextInputLayout textinputmobile;
    public TextInputLayout textinputpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textinputname=findViewById(R.id.nameinput);
        textinputemail=findViewById(R.id.emailfield);
        textinputmobile=findViewById(R.id.mobileinput);
        textinputpassword=findViewById(R.id.password);
    }

    private boolean validateemail()
    {
        String emailinput=textinputemail.getEditText().getText().toString().trim();
        if(emailinput.isEmpty())
        {   textinputemail.setError("Field cannot be Empty");
            return false;
        }
        else
        {
            textinputemail.setError(null);
            return true;
        }
    }

    private boolean validateusername()
    {
        String username=textinputname.getEditText().getText().toString().trim();
        if(username.isEmpty())
        {
            textinputname.setError("Field cant be Empty");
            return false;
        }
        else if(username.length()>=15)
        {
            textinputname.setError("Field cannot have more than 15 characters");
            return false;
        }
        else{
          textinputname.setError(null);
          return true;
        }
    }

    private boolean validatemobile()
    {
        String mobile=textinputmobile.getEditText().getText().toString().trim();
        if(mobile.isEmpty())
        {
            textinputmobile.setError("Field cant be Empty");
            return false;
        }
        else if(mobile.length()!=10)
        {
            textinputmobile.setError("Enter a Valid Mobile Number");
            return false;
        }
        else{
            textinputmobile.setError(null);
            return true;
        }
    }


    private boolean validatepassword()
    {
        String password=textinputpassword.getEditText().getText().toString().trim();
        if(password.isEmpty())
        {   textinputemail.setError("Field cannot be Empty");
            return false;
        }
        else
        {
            textinputpassword.setError(null);
            return true;
        }
    }

    public void confirminput(View v)
    {
        if(!validateemail() | !validatemobile() | !validatepassword() | !validateusername())
        {
            return;
        }
    }
}
