package tencent.im.msg;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class im_msg_body$MsgBody_subtype4
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 16 }, new String[] { "msg_not_online_file", "uint32_msg_time" }, new Object[] { null, Integer.valueOf(0) }, MsgBody_subtype4.class);
  public im_msg_body.NotOnlineFile msg_not_online_file = new im_msg_body.NotOnlineFile();
  public final PBUInt32Field uint32_msg_time = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\msg\im_msg_body$MsgBody_subtype4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */