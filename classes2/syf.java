import android.os.Bundle;
import com.tencent.biz.troop.TroopMemberApiClient;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.jsp.UiApiPlugin;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.qphone.base.util.QLog;
import java.nio.ByteBuffer;
import mqq.observer.BusinessObserver;
import tencent.im.oidb.oidb_sso.OIDBSSOPkg;

public class syf
  implements BusinessObserver
{
  public syf(UiApiPlugin paramUiApiPlugin, Integer paramInteger, String paramString1, String paramString2)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void onReceive(int paramInt, boolean paramBoolean, Bundle paramBundle)
  {
    Object localObject;
    if (paramBoolean)
    {
      paramBundle = paramBundle.getByteArray("data");
      if (paramBundle != null) {
        localObject = new oidb_sso.OIDBSSOPkg();
      }
    }
    try
    {
      paramBundle = (oidb_sso.OIDBSSOPkg)((oidb_sso.OIDBSSOPkg)localObject).mergeFrom((byte[])paramBundle);
      paramInt = paramBundle.uint32_result.get();
      if (QLog.isColorLevel()) {
        QLog.d(UiApiPlugin.jdField_a_of_type_JavaLangString + ".troopTAG_GET_UIN_BY_OPEN_ID", 2, "handleOidb0x716_48Rsp, resultCode:" + paramInt);
      }
      paramBundle = paramBundle.bytes_bodybuffer.get().toByteArray();
      if (paramInt == 0)
      {
        localObject = new byte[4];
        System.arraycopy(paramBundle, 0, localObject, 0, 4);
        paramBundle = ByteBuffer.wrap((byte[])localObject).getInt() + "";
        if (this.jdField_a_of_type_ComTencentMobileqqJspUiApiPlugin.jdField_a_of_type_ComTencentBizTroopTroopMemberApiClient == null)
        {
          this.jdField_a_of_type_ComTencentMobileqqJspUiApiPlugin.jdField_a_of_type_ComTencentBizTroopTroopMemberApiClient = TroopMemberApiClient.a();
          this.jdField_a_of_type_ComTencentMobileqqJspUiApiPlugin.jdField_a_of_type_ComTencentBizTroopTroopMemberApiClient.a();
        }
        this.jdField_a_of_type_ComTencentMobileqqJspUiApiPlugin.jdField_a_of_type_ComTencentBizTroopTroopMemberApiClient.a(this.jdField_a_of_type_JavaLangInteger, this.jdField_a_of_type_JavaLangString, this.b, new syg(this, paramBundle));
      }
      return;
    }
    catch (Exception paramBundle)
    {
      while (!QLog.isColorLevel()) {}
      QLog.e(UiApiPlugin.jdField_a_of_type_JavaLangString + ".troopTAG_GET_UIN_BY_OPEN_ID", 2, "pkg.mergeFrom:" + paramBundle.toString());
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\syf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */