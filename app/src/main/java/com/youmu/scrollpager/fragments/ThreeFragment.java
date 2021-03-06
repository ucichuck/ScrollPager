package com.youmu.scrollpager.fragments;

import android.view.View;
import android.widget.TextView;

import com.youmu.scrollpager.R;

/**
 * Created by youzehong on 15/10/29.
 */
public class ThreeFragment extends BaseFragment {

    private TextView textView;

    @Override
    protected int onGetViewId() {
        return R.layout.item_pager;
    }

    @Override
    protected void onViewCreate(View view) {
        super.onViewCreate(view);
        textView = (TextView) view.findViewById(R.id.item_pager_tv);
        textView.setText("年账户");
    }

    @Override
    public void onRotateNotify() {
        textView.setText("12%");
    }

    @Override
    public void onRotateReset() {
        textView.setText("年账户");
    }
}
