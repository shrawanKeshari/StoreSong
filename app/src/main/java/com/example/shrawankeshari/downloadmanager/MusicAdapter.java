package com.example.shrawankeshari.downloadmanager;


import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by shrawankeshari on 23/12/17.
 */

public class MusicAdapter extends ArrayAdapter<MusicField> {

    Context context;

    List<MusicField> musicFields;

    public MusicAdapter(Context context, int resource, List<MusicField> objects) {
        super(context, resource, objects);
        this.context = context;
        this.musicFields = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater()
                    .inflate(R.layout.item_list, parent, false);
        }

        ImageView im = convertView.findViewById(R.id.list_image);
        TextView tv_title = convertView.findViewById(R.id.list_title);
        TextView tv_artist = convertView.findViewById(R.id.list_artist);
        TextView tv_duration = convertView.findViewById(R.id.list_duration);

        MusicField mf = musicFields.get(position);

        tv_title.setText(mf.getSong_title());
        tv_artist.setText(mf.getSong_artist());
        tv_duration.setText(mf.getSong_duration());

        Log.i("TAG",mf.getSong_title()+" "+mf.getSong_artist()+" "+mf.getSong_duration());

        if(mf.getSong_image() != null) {
            Glide.with(im.getContext())
                    .load(mf.getSong_image())
                    .into(im);
        }else{
            Glide.with(im.getContext())
                    .load(mf.getWhenNoImage())
                    .into(im);
        }

        return convertView;
    }
}
