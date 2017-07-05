package com.example.pc.notesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pc.notesapp.Adapters.NotesAdapter;
import com.example.pc.notesapp.DataModel.User;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotesListActivity extends AppCompatActivity {
@BindView(R.id.listView)
ListView listView;
    @BindView(R.id.textViewWelcome)
    TextView textView;
    User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);
        ButterKnife.bind(this);
        user=Helpers.getCurrentUser(NotesListActivity.this);
        textView.setText("Welcome "+user.getName());

        NotesAdapter notesAdapter= new NotesAdapter(NotesListActivity.this,user.getNotes());
        listView.setAdapter(notesAdapter);







    }

    public void AddNewNote(View view) {
startActivity(new Intent(this,AddNote.class));
        finish();
    }

    public void LogOut(View view) {
        Helpers.DeleteUser(this);
    }
}
