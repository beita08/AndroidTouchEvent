package com.mliuxb.touchevent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Description:自定义SonView
 */
public class SonView extends View {

    public SonView(Context context) {
        super(context);
    }

    public SonView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SonView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SonView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.i(Constant.TAG, "SonView...dispatchTouchEvent: ");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean onTouchEvent = super.onTouchEvent(event);
        Log.i(Constant.TAG, "SonView...onTouchEvent: " + onTouchEvent);
        return onTouchEvent;
    }
}
