import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.biz.pubaccount.CustomWebChromeClient;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;

public class hnz
  implements DialogInterface.OnCancelListener
{
  public hnz(CustomWebChromeClient paramCustomWebChromeClient, JsPromptResult paramJsPromptResult)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    this.jdField_a_of_type_ComTencentSmttExportExternalInterfacesJsPromptResult.cancel();
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\hnz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */