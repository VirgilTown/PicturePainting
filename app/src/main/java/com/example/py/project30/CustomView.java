package com.example.py.project30;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * TODO: document your custom view class.
 */
public class CustomView extends View{


    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置画布背景色
        canvas.drawColor(Color.GRAY);

        Paint paint=new Paint();

        paint.setAntiAlias(true);

        //画笔颜色
        paint.setColor(Color.BLUE);

        //设置填充类型
        paint.setStyle(Paint.Style.STROKE);

        //设置画笔宽度
        paint.setStrokeWidth(5);

        canvas.drawCircle(500, 750, 300, paint);

        //绘制三角形，内部填充
        Path path=new Path();
        path.moveTo(500, 450);
        path.lineTo(280, 950);
        path.lineTo(720, 950);
        path.close();
        canvas.drawPath(path, paint);

        canvas.drawLine(500,450,500,750,paint);
        canvas.drawLine(280,950,500,750,paint);
        canvas.drawLine(720,950,500,750,paint);

        //绘制文本
        paint.setTextSize(100);
        paint.setColor(Color.WHITE);
        canvas.drawText("Virgil", 385, 1200, paint);

    }
}
