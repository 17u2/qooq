package tencent.im.troop_search_popclassifc;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBStringField;

public final class popclassifc$TitleBar
  extends MessageMicro
{
  public static final int STR_DESC_FIELD_NUMBER = 2;
  public static final int STR_ICON_URL_FIELD_NUMBER = 1;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18 }, new String[] { "str_icon_url", "str_desc" }, new Object[] { "", "" }, TitleBar.class);
  public final PBStringField str_desc = PBField.initString("");
  public final PBStringField str_icon_url = PBField.initString("");
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\tencent\im\troop_search_popclassifc\popclassifc$TitleBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */