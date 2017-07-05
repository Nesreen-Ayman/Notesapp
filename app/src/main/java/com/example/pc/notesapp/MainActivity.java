package com.example.pc.notesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pc.notesapp.DataModel.User;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
User  currentUser;
    @BindView(R.id.editTextPassword)
    EditText passwordEditText;
    @BindView(R.id.editTextUserName)
    EditText usernameEdittext;
    @BindView(R.id.ButtonLogin)
    Button Login;

    @BindView(R.id.ButtonSignUp) Button buttonSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        currentUser=Helpers.getCurrentUser(this);
        if (currentUser!=null) {
            startActivity(new Intent(MainActivity.this,NotesListActivity.class));
            finish();

        }



    }

    public void Login(View view) {
        currentUser=Helpers.getCurrentUser(MainActivity.this);
        if (currentUser!=null){
if(currentUser.getName().equals(usernameEdittext.getText().toString()) &&currentUser.getPassword().equals(passwordEditText.getText().toString()))
{

    startActivity(new Intent(MainActivity.this,NotesListActivity.class));
    finish();
}else{
    Toast.makeText(this, "No valid UserName Or Password", Toast.LENGTH_SHORT).show();
}
        }else{
            Toast.makeText(this, "plz Sign Up first", Toast.LENGTH_SHORT).show();

        }


    }

    public void SignUp(View view) {

       currentUser=new User();
        currentUser.setName(usernameEdittext.getText().toString());
        currentUser.setPassword(passwordEditText.getText().toString());
        Helpers.putUser(MainActivity.this,currentUser);
    }
}
