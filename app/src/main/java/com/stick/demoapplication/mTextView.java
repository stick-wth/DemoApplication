package com.stick.demoapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by stick on 2018/7/26 0026.
 * Email:253139409@qq.com
 */

public class mTextView extends android.support.v7.widget.AppCompatTextView {
    public mTextView(Context context) {
        super(context);
    }

    public mTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public mTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPaint = new Paint();


    }
}
