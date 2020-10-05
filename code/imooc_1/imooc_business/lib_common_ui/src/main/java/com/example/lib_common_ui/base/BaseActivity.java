package com.example.lib_common_ui.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.example.lib_common_ui.utils.StatusBarUtil;

/**
 * 配合我们刚刚自定义的style，来完成沉浸式
 */
public class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.statusBarLightMode(this); //状态栏变成黑色
    }
}
