import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.mobileqq.activity.AssistantSettingActivity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.msf.sdk.SettingCloneUtil;
import com.tencent.mobileqq.statistics.ReportController;

public class kkb
  implements CompoundButton.OnCheckedChangeListener
{
  public kkb(AssistantSettingActivity paramAssistantSettingActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    paramCompoundButton = this.a.app;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      ReportController.b(paramCompoundButton, "CliOper", "", "", "Setting_tab", "System_icon", 0, i, "", "", "", "");
      SettingCloneUtil.writeValue(this.a, null, this.a.getString(2131370224), "qqsetting_notify_icon_key", paramBoolean);
      return;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\kkb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */