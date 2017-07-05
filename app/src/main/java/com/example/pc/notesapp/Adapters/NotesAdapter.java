package com.example.pc.notesapp.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pc.notesapp.DataModel.Note;
import com.example.pc.notesapp.R;

import java.util.List;

/**
 * Created by pc on 30/04/2017.
 */

public class NotesAdapter extends ArrayAdapter<Note> {


    public NotesAdapter(@NonNull Context context, @NonNull List<Note> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Note note=getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.note_row,parent,false);

        }
        TextView textViewName=(TextView)convertView.findViewById(R.id.textViewName);
        TextView textViewDisc=(TextView)convertView.findViewById(R.id.textViewDisc);

        textViewName.setText(note.getName());
        textViewDisc.setText(note.getDescription());

        return convertView;
    }
}
