import android.os.Handler;
import android.os.Message;
import com.tencent.mobileqq.config.PicIPManager;
import com.tencent.mobileqq.emoticon.DownloadInfo;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.msf.sdk.MsfSdkUtils;
import com.tencent.mobileqq.nearby.profilecard.NearbyPeopleProfileActivity;
import com.tencent.mobileqq.util.ProfileCardUtil;
import com.tencent.mobileqq.utils.HttpDownloadUtil;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class tmj
  implements Runnable
{
  private int jdField_a_of_type_Int;
  private String jdField_a_of_type_JavaLangString;
  private boolean jdField_a_of_type_Boolean;
  private String b;
  
  public tmj(NearbyPeopleProfileActivity paramNearbyPeopleProfileActivity, String paramString1, int paramInt, String paramString2, boolean paramBoolean)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangString = paramString1;
    this.jdField_a_of_type_Int = paramInt;
    this.b = paramString2;
    this.jdField_a_of_type_Boolean = paramBoolean;
  }
  
  public void run()
  {
    int j = 1;
    Object localObject = this.b + this.jdField_a_of_type_Int;
    if (QLog.isColorLevel()) {
      QLog.e("Q.nearby_people_card.", 2, "downloadHDAvatar()  uin=" + this.jdField_a_of_type_JavaLangString + ", mgSize=" + this.jdField_a_of_type_Int + ", url = " + (String)localObject);
    }
    File localFile1 = new File(ProfileCardUtil.a(String.valueOf(this.jdField_a_of_type_JavaLangString)));
    boolean bool2;
    if ((localFile1.exists()) && (!this.jdField_a_of_type_Boolean))
    {
      if (QLog.isColorLevel()) {
        QLog.e("Q.nearby_people_card.", 2, "download HDAvatar file is exists");
      }
      bool2 = true;
      localObject = new Message();
      ((Message)localObject).what = 102;
      if (!bool2) {
        break label387;
      }
      i = 1;
      label154:
      ((Message)localObject).arg1 = i;
      if (!this.jdField_a_of_type_Boolean) {
        break label393;
      }
    }
    label387:
    label393:
    for (int i = j;; i = 0)
    {
      ((Message)localObject).arg2 = i;
      this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardNearbyPeopleProfileActivity.a.sendMessage((Message)localObject);
      return;
      File localFile2 = new File(localFile1.getPath() + Long.toString(System.currentTimeMillis()));
      String str = MsfSdkUtils.insertMtype("friendlist", (String)localObject);
      try
      {
        localObject = new URL(str);
        localObject = new URL(((URL)localObject).getProtocol(), PicIPManager.a(0), ((URL)localObject).getFile()).toString();
        if (HttpDownloadUtil.a(this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardNearbyPeopleProfileActivity.app, new DownloadInfo((String)localObject, localFile2, 0), null) == 0)
        {
          bool2 = true;
          boolean bool1 = bool2;
          if (bool2) {
            bool1 = localFile2.renameTo(localFile1);
          }
          this.jdField_a_of_type_ComTencentMobileqqNearbyProfilecardNearbyPeopleProfileActivity.p = bool1;
          bool2 = bool1;
          if (!QLog.isColorLevel()) {
            break;
          }
          QLog.i("Q.nearby_people_card.", 2, "donwload HDAvatar finish : " + bool1);
          bool2 = bool1;
        }
      }
      catch (MalformedURLException localMalformedURLException)
      {
        for (;;)
        {
          localObject = str;
          if (QLog.isDevelopLevel())
          {
            localMalformedURLException.printStackTrace();
            localObject = str;
            continue;
            bool2 = false;
          }
        }
      }
      i = 0;
      break label154;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */