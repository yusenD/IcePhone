package com.icephone.yuhao.repairerecord.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.icephone.yuhao.repairerecord.bean.SiteBean;

import java.util.List;

public class SiteAdapter extends BaseQuickAdapter<SiteBean,BaseViewHolder> {

    public SiteAdapter(int layoutResId, @Nullable List<SiteBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, SiteBean item) {

    }
}
