import android.view.View;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawableDownListener;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.widget.ProfileCardMoreInfoView;
import com.tencent.qphone.base.util.QLog;

public class wnn
  implements URLDrawableDownListener
{
  public wnn(ProfileCardMoreInfoView paramProfileCardMoreInfoView, String paramString, URLImageView paramURLImageView)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onLoadCancelled(View paramView, URLDrawable paramURLDrawable) {}
  
  public void onLoadFailed(View paramView, URLDrawable paramURLDrawable, Throwable paramThrowable)
  {
    QLog.e("Q.profilecard.FrdProfileCard", 1, "showDiamondImage onLoadFailed iconUrl = " + this.jdField_a_of_type_JavaLangString);
    this.jdField_a_of_type_ComTencentImageURLImageView.setVisibility(8);
  }
  
  public void onLoadInterrupted(View paramView, URLDrawable paramURLDrawable, InterruptedException paramInterruptedException) {}
  
  public void onLoadProgressed(View paramView, URLDrawable paramURLDrawable, int paramInt) {}
  
  public void onLoadSuccessed(View paramView, URLDrawable paramURLDrawable)
  {
    this.jdField_a_of_type_ComTencentImageURLImageView.setVisibility(0);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\wnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */