package com.tencent.biz.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import jgd;

public class RoundProgressBar
  extends View
{
  private float jdField_a_of_type_Float = 20.0F;
  private int jdField_a_of_type_Int = -252645121;
  private Paint jdField_a_of_type_AndroidGraphicsPaint = new Paint();
  private RectF jdField_a_of_type_AndroidGraphicsRectF = new RectF();
  private float jdField_b_of_type_Float = 18.0F;
  private int jdField_b_of_type_Int = -1529614848;
  private float jdField_c_of_type_Float = 5.0F;
  private int jdField_c_of_type_Int = -16777216;
  private int d = 100;
  private int e = 0;
  
  public RoundProgressBar(Context paramContext)
  {
    this(paramContext, null);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public RoundProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RoundProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(int paramInt)
  {
    new Thread(new jgd(this, paramInt)).start();
  }
  
  public float a()
  {
    return this.jdField_a_of_type_Float;
  }
  
  public int a()
  {
    try
    {
      int i = this.d;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public float b()
  {
    return this.jdField_c_of_type_Float;
  }
  
  public int b()
  {
    try
    {
      int i = this.e;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int c()
  {
    return this.jdField_a_of_type_Int;
  }
  
  public int d()
  {
    return this.jdField_b_of_type_Int;
  }
  
  public int e()
  {
    return this.jdField_c_of_type_Int;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getWidth() / 2;
    int j = (int)(i - this.jdField_c_of_type_Float / 2.0F);
    this.jdField_a_of_type_AndroidGraphicsPaint.setColor(this.jdField_a_of_type_Int);
    this.jdField_a_of_type_AndroidGraphicsPaint.setStyle(Paint.Style.STROKE);
    this.jdField_a_of_type_AndroidGraphicsPaint.setStrokeWidth(this.jdField_c_of_type_Float);
    this.jdField_a_of_type_AndroidGraphicsPaint.setAntiAlias(true);
    paramCanvas.drawCircle(i, i, j, this.jdField_a_of_type_AndroidGraphicsPaint);
    this.jdField_a_of_type_AndroidGraphicsPaint.setStrokeWidth(this.jdField_c_of_type_Float);
    this.jdField_a_of_type_AndroidGraphicsPaint.setColor(this.jdField_b_of_type_Int);
    this.jdField_a_of_type_AndroidGraphicsRectF.set(i - j, i - j, i + j, j + i);
    this.jdField_a_of_type_AndroidGraphicsPaint.setStyle(Paint.Style.STROKE);
    paramCanvas.drawArc(this.jdField_a_of_type_AndroidGraphicsRectF, -90.0F, this.e * 360 / this.d, false, this.jdField_a_of_type_AndroidGraphicsPaint);
    this.jdField_a_of_type_AndroidGraphicsPaint.setStrokeWidth(0.0F);
    this.jdField_a_of_type_AndroidGraphicsPaint.setColor(this.jdField_c_of_type_Int);
    this.jdField_a_of_type_AndroidGraphicsPaint.setTextSize(this.jdField_a_of_type_Float);
    this.jdField_a_of_type_AndroidGraphicsPaint.setStyle(Paint.Style.FILL);
    this.jdField_a_of_type_AndroidGraphicsPaint.setTypeface(Typeface.DEFAULT_BOLD);
    j = this.e * 100 / this.d;
    float f1 = this.jdField_a_of_type_AndroidGraphicsPaint.measureText(j + "");
    this.jdField_a_of_type_AndroidGraphicsPaint.setTextSize(this.jdField_b_of_type_Float);
    float f2 = this.jdField_a_of_type_AndroidGraphicsPaint.measureText("%");
    if (j != 0)
    {
      this.jdField_a_of_type_AndroidGraphicsPaint.setTextSize(this.jdField_a_of_type_Float);
      paramCanvas.drawText(j + "", i - (f1 + f2) / 2.0F, i + this.jdField_a_of_type_Float / 2.0F, this.jdField_a_of_type_AndroidGraphicsPaint);
      this.jdField_a_of_type_AndroidGraphicsPaint.setTextSize(this.jdField_b_of_type_Float);
      paramCanvas.drawText("%", f1 + (i - (f2 + f1) / 2.0F), i + this.jdField_a_of_type_Float / 2.0F, this.jdField_a_of_type_AndroidGraphicsPaint);
    }
  }
  
  public void setCircleColor(int paramInt)
  {
    this.jdField_a_of_type_Int = paramInt;
  }
  
  public void setCircleProgressColor(int paramInt)
  {
    this.jdField_b_of_type_Int = paramInt;
  }
  
  public void setMax(int paramInt)
  {
    if (paramInt < 0) {
      try
      {
        throw new IllegalArgumentException("max not less than 0");
      }
      finally {}
    }
    this.d = paramInt;
  }
  
  public void setProgress(int paramInt)
  {
    if (paramInt < 0) {
      try
      {
        throw new IllegalArgumentException("progress not less than 0");
      }
      finally {}
    }
    int i = paramInt;
    if (paramInt > this.d) {
      i = this.d;
    }
    if ((i <= this.d) && (this.e != i)) {
      a(i);
    }
  }
  
  public void setRoundWidth(float paramFloat)
  {
    this.jdField_c_of_type_Float = paramFloat;
  }
  
  public void setTextColor(int paramInt)
  {
    this.jdField_c_of_type_Int = paramInt;
  }
  
  public void setTextSize(float paramFloat)
  {
    this.jdField_a_of_type_Float = paramFloat;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\ui\RoundProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */