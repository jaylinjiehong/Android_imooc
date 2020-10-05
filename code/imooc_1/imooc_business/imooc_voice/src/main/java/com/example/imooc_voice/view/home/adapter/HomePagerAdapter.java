package com.example.imooc_voice.view.home.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.imooc_voice.view.discory.DiscoryFragment;
import com.example.imooc_voice.view.friend.FriendFragment;
import com.example.imooc_voice.view.home.model.CHANNEL;
import com.example.imooc_voice.view.mine.MineFragment;

/**
 * 首页ViewPager的Adapter
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    private CHANNEL[] mList;

    public HomePagerAdapter(@NonNull FragmentManager fm, CHANNEL[] datas) {
        super(fm);
        mList = datas;
    }

    //这种方式，避免一次性创建所有的fragment
    //初始化对应的fragment
    @NonNull
    @Override
    public Fragment getItem(int position) {
        int type = mList[position].getValue();
        switch (type) {
            case CHANNEL.MINE_ID:
                return MineFragment.newInstance();
            case CHANNEL.DISCORY_ID:
                return DiscoryFragment.newInstance();
            case CHANNEL.FRIEND_ID:
                return FriendFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
