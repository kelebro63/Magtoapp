package com.kelebro63.magtoapp.screens.fragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kelebro63.magtoapp.R;
import com.kelebro63.magtoapp.adapters.JournalsPagerAdapter;
import com.kelebro63.magtoapp.controls.PagerContainer;
import com.kelebro63.magtoapp.model.Journal;

import java.util.ArrayList;
import java.util.List;


public class PagerJournalsFragment extends Fragment {

    private PagerContainer mContainer = null;
    private ViewPager mPager = null;
    private JournalsPagerAdapter adapter = null;

    @Override
    public void onDestroy() {
        super.onDestroy();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager_journals, container, false);
        mContainer = (PagerContainer) view.findViewById(R.id.pager_container);
        mPager = mContainer.getViewPager();
        adapter = new JournalsPagerAdapter(getActivity(), R.layout.pager_journal_item, (ArrayList<Journal>) getJournals());
        mPager.setAdapter(adapter);
        mPager.setOffscreenPageLimit(adapter.getCount());
        // mPager.setPageMargin();
        mPager.setClipChildren(false);


        return view;
    }

    private List<Journal> getJournals() {
        TypedArray imgs = getResources().obtainTypedArray(R.array.journals_imgs);
        ArrayList<Journal> journals = new ArrayList<Journal>();
        for (int i = 0; i < imgs.length(); i++) {
            Journal journal = new Journal();
            journal.setImageResources(imgs.getResourceId(i, -1));
            journals.add(journal);
        }
        journals.get(0).setIsNew(true);
        journals.get(0).setLeftTapeVisible(true);
        return journals;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();


    }

    @Override
    public void onResume() {
        super.onResume();

    }

}
