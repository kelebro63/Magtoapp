package com.kelebro63.magtoapp.screens;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.kelebro63.magtoapp.R;
import com.kelebro63.magtoapp.screens.fragments.ListJournalsFragment;
import com.kelebro63.magtoapp.screens.fragments.PagerJournalsFragment;

public class MainActivity extends AppCompatActivity {

    private MainFragmentID mCurrentFragmentId;
    private FragmentManager mFragmentManager = getSupportFragmentManager();

    public static enum MainFragmentID {
        FRAGMENT_PAGER,
        FRAGMENT_LIST,
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setFragmentList();
        } else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setFragmentPager();
        }
    }

    private boolean switchFragment() {
        switch (mCurrentFragmentId) {
            case FRAGMENT_PAGER:
                setFragmentPager();
                break;
            case FRAGMENT_LIST:
                setFragmentPager();
                break;
            default:
                return false;
        }
        return true;
    }

    private void setFragmentList() {
        ListJournalsFragment listJournalsFragment = new ListJournalsFragment();
        //listJournalsFragment.setOnClickListener(this);
        mFragmentManager.beginTransaction().replace(R.id.container, listJournalsFragment).commit();
        mCurrentFragmentId = MainFragmentID.FRAGMENT_LIST;
    }

    private void setFragmentPager() {
        PagerJournalsFragment pagerJournalsFragment = new PagerJournalsFragment();
        //PagerJournalsFragment.setOnClickListener(this);
        mFragmentManager.beginTransaction().replace(R.id.container, pagerJournalsFragment).commit();
        mCurrentFragmentId = MainFragmentID.FRAGMENT_PAGER;
    }
}
