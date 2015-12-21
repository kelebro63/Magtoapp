package com.kelebro63.magtoapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.kelebro63.magtoapp.R;
import com.kelebro63.magtoapp.model.Journal;
import com.kelebro63.magtoapp.views.TapeView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class JournalsAdapter extends ArrayAdapter<Journal> {

    private LayoutInflater mInflater;
    private  Context context;

    public JournalsAdapter(Context context, List<Journal> journals) {
        super(context, R.layout.list_journal_item, journals);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflater.inflate(R.layout.list_journal_item, parent, false);
        Journal journal = getItem(position);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.journal_image);
        //imageView.setImageResource(journal.getImageResources());
        Picasso.with(context).load(journal.getImageResources()).into(imageView);

        TapeView tapeView = (TapeView) rowView.findViewById(R.id.tape_img);
        if (!journal.isNew()) {
            tapeView.setVisibleTapeView(false);
        } else {
           // tapeView.setTextForTape("test");
        }
        return rowView;
    }

}
