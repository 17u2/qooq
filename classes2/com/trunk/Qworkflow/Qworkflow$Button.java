package com.trunk.Qworkflow;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.ByteStringMicro;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBBytesField;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class Qworkflow$Button
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__;
  public final PBBytesField bytes_title = PBField.initBytes(ByteStringMicro.EMPTY);
  public Qworkflow.Operation msg_on_click_operation = new Qworkflow.Operation();
  public final PBUInt32Field uint32_id = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    ByteStringMicro localByteStringMicro = ByteStringMicro.EMPTY;
    __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 18, 26 }, new String[] { "uint32_id", "bytes_title", "msg_on_click_operation" }, new Object[] { Integer.valueOf(0), localByteStringMicro, null }, Button.class);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\trunk\Qworkflow\Qworkflow$Button.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */