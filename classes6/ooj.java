import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mobileqq.activity.phone.BindNumberFromPcActivity;
import com.tencent.mobileqq.activity.phone.BindVerifyActivity;
import com.tencent.mobileqq.activity.phone.RebindActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.phonecontact.ContactBindObserver;

public class ooj
  extends ContactBindObserver
{
  public ooj(BindNumberFromPcActivity paramBindNumberFromPcActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a(boolean paramBoolean, Bundle paramBundle)
  {
    this.a.jdField_a_of_type_AndroidWidgetButton.setEnabled(true);
    this.a.b();
    int i;
    if (paramBoolean)
    {
      i = paramBundle.getInt("k_result");
      if ((i == 104) || (i == 0))
      {
        paramBundle = new Intent(this.a, BindVerifyActivity.class);
        paramBundle.putExtra("k_number", this.a.jdField_a_of_type_JavaLangString);
        paramBundle.putExtra("k_country_code", this.a.b);
        if ((paramBundle != null) && (!this.a.isFinishing()))
        {
          paramBundle.addFlags(536870912);
          this.a.startActivityForResult(paramBundle, 1);
        }
      }
    }
    for (;;)
    {
      this.a.app.unRegistObserver(BindNumberFromPcActivity.a(this.a));
      BindNumberFromPcActivity.a(this.a, null);
      return;
      if (i == 107)
      {
        Intent localIntent = new Intent(this.a, RebindActivity.class);
        localIntent.putExtra("k_uin", paramBundle.getString("k_uin"));
        localIntent.putExtra("k_number", this.a.jdField_a_of_type_JavaLangString);
        localIntent.putExtra("k_country_code", this.a.b);
        paramBundle = localIntent;
        break;
      }
      if (i == 106)
      {
        this.a.setResult(-1);
        this.a.finish();
        paramBundle = null;
        break;
      }
      this.a.a(a(i));
      paramBundle = null;
      break;
      this.a.b(2131368649);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes6-dex2jar.jar!\ooj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */