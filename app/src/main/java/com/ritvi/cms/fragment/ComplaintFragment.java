package com.ritvi.cms.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ritvi.cms.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sunil on 07-02-2018.
 */

public class ComplaintFragment extends Fragment{

    @BindView(R.id.rv_complaint)
    RecyclerView rv_complaint;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag_complaint,container,false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


//    public void attachAdapter() {
//        leaderAdapter = new LeaderAdapter(this, null, leaderPOJOS);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        rv_leader.setHasFixedSize(true);
//        rv_leader.setAdapter(leaderAdapter);
//        rv_leader.setLayoutManager(linearLayoutManager);
//        rv_leader.setItemAnimator(new DefaultItemAnimator());
//
//    }
}
