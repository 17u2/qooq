import android.os.Handler;
import android.text.TextUtils;
import com.tencent.mobileqq.activity.TroopInfoActivity;
import com.tencent.mobileqq.app.FriendListObserver;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troopinfo.TroopInfoData;
import com.tencent.mobileqq.util.Utils;
import com.tencent.mobileqq.utils.ContactUtils;
import com.tencent.qphone.base.util.QLog;

public class mqx
  extends FriendListObserver
{
  public mqx(TroopInfoActivity paramTroopInfoActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a(String paramString, boolean paramBoolean)
  {
    if ((!paramBoolean) || (TextUtils.isEmpty(paramString)) || (!Utils.a(paramString, this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.troopowneruin))) {}
    String str;
    do
    {
      return;
      this.a.b = false;
      str = ContactUtils.k(this.a.app, this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.troopowneruin);
      if (!TextUtils.isEmpty(str))
      {
        this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.troopOwnerNick = str;
        this.a.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(2);
      }
    } while (!QLog.isColorLevel());
    QLog.i("Q.troopinfo", 2, "onUpdateFriendInfo|uin = " + paramString + ", tmpNickName = " + str);
  }
  
  protected void b(boolean paramBoolean, String paramString)
  {
    if ((paramBoolean) && (Utils.a(paramString, this.a.jdField_a_of_type_ComTencentMobileqqTroopinfoTroopInfoData.troopUin))) {
      this.a.jdField_a_of_type_AndroidOsHandler.sendEmptyMessage(3);
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\mqx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */