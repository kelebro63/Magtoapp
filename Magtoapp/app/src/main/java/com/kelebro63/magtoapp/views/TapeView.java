package com.kelebro63.magtoapp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.kelebro63.magtoapp.R;

/**
 * Created by Bistrov Alexey on 21.12.2015.
 */
public class TapeView extends RelativeLayout {

    LayoutInflater mInflater;
    private ImageView mTapeView;

    public TapeView(Context context) {
        super(context);
        mInflater = LayoutInflater.from(context);
        init();
    }

    public TapeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = LayoutInflater.from(context);
        init();
    }

    public TapeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = LayoutInflater.from(context);
        init();
    }

    public void init()
    {
        mInflater.inflate(R.layout.tape_view, this, true);
        mTapeView = (ImageView) findViewById(R.id.tape_view_img);
    }

    public void setVisibleTapeView(Boolean visible) {
        if (visible) {
            mTapeView.setVisibility(View.VISIBLE);
        } else {
            mTapeView.setVisibility(View.GONE);
        }
    }


}
