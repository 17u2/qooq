package tencent.im.cs.cmd0x346;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class cmd0x346$RecvListQueryReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24 }, new String[] { "uint64_uin", "uint32_begin_index", "uint32_req_count" }, new Object[] { Long.valueOf(0L), Integer.valueOf(0), Integer.valueOf(0) }, RecvListQueryReq.class);
  public final PBUInt32Field uint32_begin_index = PBField.initUInt32(0);
  public final PBUInt32Field uint32_req_count = PBField.initUInt32(0);
  public final PBUInt64Field uint64_uin = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\cmd0x346\cmd0x346$RecvListQueryReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */