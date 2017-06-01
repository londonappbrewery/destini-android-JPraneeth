package com.londonappbrewery.destini;


import android.widget.Button;

/**
 * Created by praneeth on 5/29/2017.
 */

public class NewStory{

    private int mstory;
    private int moption1,moption2;

    public NewStory(int storyresourceid  ){
        mstory = storyresourceid;

    }

    public int getMstory() {
        return mstory;
    }

    public void setMstory(int mstory) {
        this.mstory = mstory;
    }


}