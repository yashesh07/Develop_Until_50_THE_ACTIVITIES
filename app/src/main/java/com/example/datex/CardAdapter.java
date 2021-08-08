package com.example.datex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends BaseAdapter {

    private ArrayList<Profile> profileData;
    private Context context;

    public CardAdapter(ArrayList<Profile> profileData, Context context) {
        this.profileData = profileData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return profileData.size();
    }

    @Override
    public Object getItem(int position) {
        return profileData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_profile_item, parent, false);
        }
        ((TextView) v.findViewById(R.id.idTVProfileName)).setText(profileData.get(position).getProfileName());
        ((TextView) v.findViewById(R.id.idTVProfileDescription)).setText(profileData.get(position).getProfileBio());
        ((TextView) v.findViewById(R.id.idTVProfileDuration)).setText(profileData.get(position).getProfileAge());
        ((TextView) v.findViewById(R.id.idTVProfileTracks)).setText(profileData.get(position).getProfileGender());
        ((ImageView) v.findViewById(R.id.idIVProfile)).setImageResource(profileData.get(position).getImgId());
        return v;
    }
}
