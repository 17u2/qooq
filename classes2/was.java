import android.text.TextUtils;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.JumpAction;
import com.tencent.mobileqq.webprocess.WebProcessManager;

public class was
  implements Runnable
{
  public was(JumpAction paramJumpAction)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void run()
  {
    if (JumpAction.a(this.a) == null) {}
    String str;
    do
    {
      return;
      str = JumpAction.a(this.a).a();
    } while (TextUtils.isEmpty(str));
    WebProcessManager.a(str, System.currentTimeMillis());
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\was.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */