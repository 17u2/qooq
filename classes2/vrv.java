import android.os.Bundle;
import com.tencent.biz.ProtoUtils.TroopProtocolObserver;
import com.tencent.mobileqq.WebSsoBody.WebSsoResponseBody;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.troop.utils.TroopTopicMgr;
import com.tencent.mobileqq.troop.utils.TroopTopicMgr.DoLikeCallback;
import com.tencent.qphone.base.util.QLog;
import org.json.JSONException;
import org.json.JSONObject;

public class vrv
  extends ProtoUtils.TroopProtocolObserver
{
  public vrv(TroopTopicMgr paramTroopTopicMgr, TroopTopicMgr.DoLikeCallback paramDoLikeCallback)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    if (paramArrayOfByte == null)
    {
      if (QLog.isColorLevel()) {
        QLog.e(".troop.troop_topic.TroopTopicMgr", 2, "getSharePostInfo failed, data == null");
      }
      return;
    }
    int k = 0;
    int j = 0;
    paramBundle = null;
    paramInt = j;
    i = k;
    try
    {
      WebSsoBody.WebSsoResponseBody localWebSsoResponseBody = new WebSsoBody.WebSsoResponseBody();
      paramInt = j;
      i = k;
      localWebSsoResponseBody.mergeFrom(paramArrayOfByte);
      paramInt = j;
      i = k;
      j = localWebSsoResponseBody.ret.get();
      if (j != 0) {
        break label220;
      }
      paramInt = j;
      i = j;
      paramArrayOfByte = new JSONObject(localWebSsoResponseBody.data.get());
    }
    catch (InvalidProtocolBufferMicroException localInvalidProtocolBufferMicroException)
    {
      for (;;)
      {
        i = paramInt;
        paramInt = i;
        paramArrayOfByte = paramBundle;
        if (QLog.isColorLevel())
        {
          QLog.e(".troop.troop_topic.TroopTopicMgr", 2, "getSharePostInfo got InvalidProtocolBufferMicroException exception:" + localInvalidProtocolBufferMicroException.getMessage());
          paramInt = i;
          paramArrayOfByte = paramBundle;
        }
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        paramInt = i;
        paramArrayOfByte = paramBundle;
        if (QLog.isColorLevel())
        {
          QLog.e(".troop.troop_topic.TroopTopicMgr", 2, "getSharePostInfo got JSONException exception:" + localJSONException.getMessage());
          paramInt = i;
          paramArrayOfByte = paramBundle;
          continue;
          paramArrayOfByte = null;
        }
      }
    }
    paramInt = j;
    this.jdField_a_of_type_ComTencentMobileqqTroopUtilsTroopTopicMgr$DoLikeCallback.a(paramInt, paramArrayOfByte);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vrv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */