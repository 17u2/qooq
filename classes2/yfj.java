import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import cooperation.qlink.QlinkStandardDialogActivity;

public class yfj
  implements DialogInterface.OnClickListener
{
  public yfj(QlinkStandardDialogActivity paramQlinkStandardDialogActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.finish();
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\yfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */