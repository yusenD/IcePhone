package com.icephone.yuhao.repairerecord.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.icephone.yuhao.repairerecord.bean.ProjectBean;

import java.util.List;

public class ProjectAdapter extends BaseQuickAdapter<ProjectBean,BaseViewHolder> {

    public ProjectAdapter(int layoutResId, @Nullable List<ProjectBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ProjectBean item) {

    }
}
