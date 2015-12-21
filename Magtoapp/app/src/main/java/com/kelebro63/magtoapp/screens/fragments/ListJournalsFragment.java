package com.kelebro63.magtoapp.screens.fragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.kelebro63.magtoapp.R;
import com.kelebro63.magtoapp.adapters.JournalsAdapter;
import com.kelebro63.magtoapp.model.Journal;

import java.util.ArrayList;
import java.util.List;


public class ListJournalsFragment extends Fragment {

    private ListView mList;
    private JournalsAdapter mAdapter;

    @Override
    public void onDestroy() {
        super.onDestroy();

        mAdapter = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_journals, container, false);

        mList = (ListView) view.findViewById(R.id.journals_list);
        if (mAdapter != null) {
            mList.setAdapter(mAdapter);
           // mList.setOnItemClickListener(mAdapter);
        } else {
            mAdapter = new JournalsAdapter(getActivity(), getJournals());
            mList.setAdapter(mAdapter);
        }

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
        journals.get(journals.size()-1).setIsNew(true);
        journals.get(journals.size()-1).setRightTapeVisible(true);
        return journals;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        mList = null;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

}
