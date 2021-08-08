package com.example.datex;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;


public class MessageAdapter extends ArrayAdapter<msg> {

    public MessageAdapter(Activity context, ArrayList<msg> names) {
        super(context, 0, names);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);

        msg currentWord = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.name_message);
        name.setText(currentWord.getName());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.pic_message);
        iconView.setImageResource(currentWord.getImageResourceID());
        return listItemView;
    }
}
