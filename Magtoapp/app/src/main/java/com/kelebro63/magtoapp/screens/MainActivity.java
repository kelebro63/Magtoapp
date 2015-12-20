package com.kelebro63.magtoapp.screens;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.kelebro63.magtoapp.R;
import com.kelebro63.magtoapp.screens.fragments.ListJournalsFragment;

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
        setFragmentList();
    }

    private boolean switchFragment() {
        switch (mCurrentFragmentId) {
            case FRAGMENT_PAGER:
                setFragmentPager();
                break;
            case FRAGMENT_LIST:
                setFragmentList();
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
//        CustomerListFragment contactsFragment = new CustomerListFragment();
//        contactsFragment.setOnClickListener(this);
//        contactsFragment.setType(CustomerListFragment.TYPE_LIST);
//        mFragmentManager.beginTransaction().replace(R.id.container, contactsFragment).commit();
//        mCurrentFragmentId = MainFragmentID.FRAGMENT_CONTACTS;
    }
}
