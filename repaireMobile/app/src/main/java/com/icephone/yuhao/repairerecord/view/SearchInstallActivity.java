package com.icephone.yuhao.repairerecord.view;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import com.icephone.yuhao.repairerecord.R;
import com.icephone.yuhao.repairerecord.Util.DialogUtil;
import com.icephone.yuhao.repairerecord.Util.StringConstant;
import com.icephone.yuhao.repairerecord.Util.TimeUtil;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SearchInstallActivity extends BaseActivity {

    @BindView(R.id.tv_center_name)
    TextView tvCenterName;
    @BindView(R.id.tv_start_time)
    TextView tvStartTime;
    @BindView(R.id.tv_end_time)
    TextView tvEndTime;

    @OnClick(R.id.rl_center_name)
    void chooseCenterName() {
        final String[] item = {"清苑联社", "满城联社"};
        DialogUtil.showSingleChooseDialog(this, "选择联社", item,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                },
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvCenterName.setText(item[which]);
                        centerName = item[which];
                    }
                }

        );
    }

    @OnClick(R.id.rl_start_time)
    void chooseStartTime() {
        DialogUtil.showDateDialog(this, calendar, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year, month, dayOfMonth);
                tvStartTime.setText(TimeUtil.getShowTime(calendar));
                startTime = TimeUtil.getUploadTime(calendar);
            }
        });
    }

    @OnClick(R.id.rl_end_time)
    void chooseEndTime() {
        DialogUtil.showDateDialog(this, calendar, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year, month, dayOfMonth);
                tvEndTime.setText(TimeUtil.getShowTime(calendar));
                endTime = TimeUtil.getUploadTime(calendar);
            }
        });
    }

    @OnClick(R.id.bt_search)
    void searchRecord() {
        Bundle bundle = new Bundle();
        bundle.putString(StringConstant.KEY_SEARCH_CENTER_NAME,centerName);
        bundle.putString(StringConstant.KEY_SEARCH_START_TIME, startTime);
        bundle.putString(StringConstant.KEY_SEARCH_END_TIME, endTime);
        openActivity(ResultActivity.class, bundle);
    }

    @OnClick(R.id.rl_back)
    void back() {
        onBackPressed();
    }

    private Calendar calendar;
    private String centerName = "";
    private String startTime = "";
    private String endTime = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_install);
        ButterKnife.bind(this);
        initDate();
        initView();

    }

    @Override
    public void initView() {

    }

    @Override
    public void initDate() {
        calendar = Calendar.getInstance();
    }
}
