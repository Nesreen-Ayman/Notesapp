package com.example.pc.notesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pc.notesapp.DataModel.Note;
import com.example.pc.notesapp.DataModel.User;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddNote extends AppCompatActivity {
@BindView(R.id.editTextNameNote)
EditText editText;
    User user;
    @BindView(R.id.editTextDiscNote) EditText editTextDisc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
ButterKnife.bind(this);
        user=Helpers.getCurrentUser(AddNote.this);


    }

    public void AddToList(View view) {

        Note x= new Note(editText.getText().toString(),editTextDisc.getText().toString());
    user.getNotes().add(x);
        Helpers.putUser(AddNote.this,user);

        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,NotesListActivity.class));
        finish();

    }
}
