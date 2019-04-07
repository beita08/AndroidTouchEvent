package com.mliuxb.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Description:自定义ViewGroupA
 */
public class ViewGroupA extends ViewGroup {

    public ViewGroupA(Context context) {
        super(context);
    }

    public ViewGroupA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupA(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ViewGroupA(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        //ViewGroupA的第一个子布局，位于上半部分，大小为二分之一
        View child = getChildAt(0);
        child.layout(l, t, r, b / 2);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(Constant.TAG, "ViewGroupA...dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(ev);
        Log.i(Constant.TAG, "ViewGroupA...onInterceptTouchEvent: " + onInterceptTouchEvent);
        return onInterceptTouchEvent;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean onTouchEvent = super.onTouchEvent(event);
        Log.i(Constant.TAG, "ViewGroupA...onTouchEvent: " + onTouchEvent);
        return onTouchEvent;
    }
}
