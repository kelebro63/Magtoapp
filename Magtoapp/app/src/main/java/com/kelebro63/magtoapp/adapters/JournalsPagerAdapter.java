package com.kelebro63.magtoapp.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kelebro63.magtoapp.R;
import com.kelebro63.magtoapp.model.Journal;
import com.kelebro63.magtoapp.views.TapeViewLeft;
import com.kelebro63.magtoapp.views.TapeViewRight;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Bistrov Alexey on 21.12.2015.
 */
public class JournalsPagerAdapter extends PagerAdapter {

    private ArrayList<Journal> mJournalItems = null;
    private int mResId = 0;
    private Context context;
    private LayoutInflater mInflater = null;


    public JournalsPagerAdapter(Context context, int resId, ArrayList<Journal> items) {
        this.mJournalItems = items;
        mResId = resId;
        this.context = context;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Journal journal = this.mJournalItems.get(position);
        View view = mInflater.inflate(mResId, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.journal_image);
        //imageView.setImageResource(journal.getImageResources());
        Picasso.with(context).load(journal.getImageResources()).into(imageView);

        TapeViewLeft tapeViewLeft = (TapeViewLeft) view.findViewById(R.id.tape_img);
        TapeViewRight tapeViewRight = (TapeViewRight) view.findViewById(R.id.tape_img_right);
        if (!journal.isNew()) {
            tapeViewLeft.setVisibleTapeView(false);
            tapeViewRight.setVisibleTapeView(false);
        } else {
            if (journal.isLeftTapeVisible()) {
                tapeViewLeft.setVisibleTapeView(true);
            } else {
                tapeViewLeft.setVisibleTapeView(false);
            }
            if (journal.isRightTapeVisible()) {
                tapeViewRight.setVisibleTapeView(true);
            }else {
                tapeViewRight.setVisibleTapeView(false);
            }
        }

        //initViews(position);

        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public int getCount() {
        return  this.mJournalItems.size();
    }


}
