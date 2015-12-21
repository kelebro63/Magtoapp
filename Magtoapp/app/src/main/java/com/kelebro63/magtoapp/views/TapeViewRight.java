package com.kelebro63.magtoapp.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kelebro63.magtoapp.R;

/**
 * Created by Bistrov Alexey on 21.12.2015.
 */
public class TapeViewRight extends RelativeLayout {

    LayoutInflater mInflater;
    private ImageView mTapeView;
    private TextView mTapetext;

    public TapeViewRight(Context context) {
        super(context);
        mInflater = LayoutInflater.from(context);
        init();
    }

    public TapeViewRight(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = LayoutInflater.from(context);
        init();
    }

    public TapeViewRight(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mInflater = LayoutInflater.from(context);
        init();
    }

    public void init()
    {
        mInflater.inflate(R.layout.tape_view_right, this, true);
        mTapeView = (ImageView) findViewById(R.id.tape_view_img);
        mTapetext = (TextView) findViewById(R.id.tape_text);
    }

    public void setVisibleTapeView(Boolean visible) {
        if (visible) {
            mTapeView.setVisibility(View.VISIBLE);
            mTapetext.setVisibility(View.VISIBLE);
        } else {
            mTapeView.setVisibility(View.GONE);
            mTapetext.setVisibility(View.GONE);
        }
    }

    public void setTextForTape(String text) {
        mTapetext.setText(text);
    }


}
