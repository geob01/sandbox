package com.example.sandboxagain;

import android.content.Context;
import android.graphics.Paint;
import android.view.SurfaceView;

public class DrawView extends SurfaceView {
	private Paint mPaint;
	
	public DrawView(Context context) {
	    super(context);
	    mPaint = new Paint();
	    mPaint.setARGB(255, 200, 0, 0);
	    mPaint.setTextSize(60);
	    setWillNotDraw(false);

	}
}
