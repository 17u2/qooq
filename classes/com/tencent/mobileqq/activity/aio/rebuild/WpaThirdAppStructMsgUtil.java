package com.tencent.mobileqq.activity.aio.rebuild;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import com.tencent.biz.widgets.ShareAioResultDialog;
import com.tencent.mobileqq.activity.SplashActivity;
import com.tencent.mobileqq.activity.aio.SessionInfo;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.app.message.QQMessageFacade;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.service.MobileQQService;
import com.tencent.mobileqq.service.message.MessageRecordFactory;
import com.tencent.mobileqq.statistics.ReportController;
import com.tencent.mobileqq.structmsg.AbsShareMsg;
import com.tencent.mobileqq.structmsg.StructMsgFactory;
import com.tencent.mobileqq.utils.JumpAction;
import com.tencent.mobileqq.utils.ShareMsgHelper;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import oeg;

public class WpaThirdAppStructMsgUtil
{
  public WpaThirdAppStructMsgUtil()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static void a(QQAppInterface paramQQAppInterface, Activity paramActivity, SessionInfo paramSessionInfo, boolean paramBoolean)
  {
    paramActivity = paramActivity.getIntent();
    if (paramActivity == null) {}
    do
    {
      do
      {
        do
        {
          return;
        } while ((!paramActivity.getBooleanExtra("showFirstStructMsg", false)) || (!paramBoolean));
        if (QLog.isColorLevel()) {
          QLog.d("send3rdAppStructMsg", 2, "send first struct msg");
        }
        paramActivity = paramActivity.getByteArrayExtra("stuctmsg_bytes");
      } while (paramActivity == null);
      paramActivity = StructMsgFactory.a(paramActivity);
    } while (paramActivity == null);
    ShareMsgHelper.a(paramQQAppInterface, paramSessionInfo.jdField_a_of_type_JavaLangString, paramSessionInfo.jdField_a_of_type_Int, paramActivity, null);
    ReportController.b(paramQQAppInterface, "CliOper", "", paramSessionInfo.jdField_a_of_type_JavaLangString, "0X8004B51", "0X8004B51", 0, 0, "", "", "", "");
  }
  
  public static void a(QQAppInterface paramQQAppInterface, FragmentActivity paramFragmentActivity, SessionInfo paramSessionInfo, AbsShareMsg paramAbsShareMsg, String paramString)
  {
    if (0 != 0) {
      throw new NullPointerException();
    }
    ShareAioResultDialog localShareAioResultDialog = new ShareAioResultDialog(paramFragmentActivity);
    String str = paramFragmentActivity.getString(2131364595);
    if (paramString != null) {}
    for (paramString = str + paramString;; paramString = str)
    {
      paramAbsShareMsg = new oeg(paramAbsShareMsg, paramFragmentActivity, paramFragmentActivity, paramQQAppInterface, paramSessionInfo);
      localShareAioResultDialog.a(paramString, paramAbsShareMsg);
      localShareAioResultDialog.a(paramFragmentActivity.getResources().getString(2131364594));
      localShareAioResultDialog.a(paramAbsShareMsg);
      localShareAioResultDialog.a(false);
      localShareAioResultDialog.show();
      ReportController.b(paramQQAppInterface, "CliOper", "", paramSessionInfo.jdField_a_of_type_JavaLangString, "0X8004B54", "0X8004B54", 0, 0, "", "", "", "");
      return;
    }
  }
  
  public static boolean a(QQAppInterface paramQQAppInterface, FragmentActivity paramFragmentActivity, SessionInfo paramSessionInfo)
  {
    boolean bool = false;
    ReportController.b(paramQQAppInterface, "CliOper", "", paramSessionInfo.jdField_a_of_type_JavaLangString, "0X8004B53", "0X8004B53", 0, 0, "", "", "", "");
    Object localObject = paramFragmentActivity.getIntent().getByteArrayExtra("stuctmsg_bytes");
    String str = paramFragmentActivity.getIntent().getStringExtra("thirdAppDisplayName");
    localObject = StructMsgFactory.a((byte[])localObject);
    if ((localObject != null) && ((localObject instanceof AbsShareMsg))) {}
    for (localObject = (AbsShareMsg)localObject;; localObject = null)
    {
      if ("webview".equals(paramFragmentActivity.getIntent().getStringExtra("from")))
      {
        JumpAction.b -= 1;
        if (!(paramFragmentActivity instanceof SplashActivity))
        {
          paramFragmentActivity.finish();
          bool = true;
        }
        return bool;
      }
      a(paramQQAppInterface, paramFragmentActivity, paramSessionInfo, (AbsShareMsg)localObject, str);
      return true;
    }
  }
  
  public static boolean a(QQAppInterface paramQQAppInterface, SessionInfo paramSessionInfo, Intent paramIntent)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramIntent.getBooleanExtra("from3rdApp", false))
    {
      bool1 = bool2;
      if (paramIntent.getBooleanExtra("showFirstStructMsg", false))
      {
        paramIntent = paramIntent.getByteArrayExtra("stuctmsg_bytes");
        bool1 = bool2;
        if (paramIntent != null)
        {
          paramIntent = StructMsgFactory.a(paramIntent);
          long l = MobileQQService.c;
          paramSessionInfo = MessageRecordFactory.a(paramQQAppInterface, paramSessionInfo.jdField_a_of_type_JavaLangString, paramSessionInfo.jdField_a_of_type_JavaLangString, paramSessionInfo.jdField_a_of_type_JavaLangString, paramSessionInfo.jdField_a_of_type_Int, l, paramIntent);
          paramIntent = new ArrayList();
          paramIntent.add(paramSessionInfo);
          paramQQAppInterface.a().c(paramIntent, paramQQAppInterface.a());
          bool1 = true;
        }
      }
    }
    return bool1;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\activity\aio\rebuild\WpaThirdAppStructMsgUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */