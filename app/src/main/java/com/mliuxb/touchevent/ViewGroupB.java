package com.mliuxb.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Description:自定义ViewGroupB
 */
public class ViewGroupB extends ViewGroup {

    public ViewGroupB(Context context) {
        super(context);
    }

    public ViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupB(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ViewGroupB(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        //ViewGroupB的第一个子布局，位于布局中心，大小为四分之一
        View child = getChildAt(0);
        child.layout(r / 4, b / 4, r / 4 * 3, b / 4 * 3);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(Constant.TAG, "ViewGroupB...dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(ev);
        Log.i(Constant.TAG, "ViewGroupB...onInterceptTouchEvent: " + onInterceptTouchEvent);
        return onInterceptTouchEvent;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean onTouchEvent = super.onTouchEvent(event);
        Log.i(Constant.TAG, "ViewGroupB...onTouchEvent: " + onTouchEvent);
        return onTouchEvent;
    }
}
