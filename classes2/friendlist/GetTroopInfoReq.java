package friendlist;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public final class GetTroopInfoReq
  extends JceStruct
{
  public long GroupCode;
  public long GroupUin;
  public byte isneedstatus;
  public long uin;
  
  public GetTroopInfoReq()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public GetTroopInfoReq(long paramLong1, long paramLong2, long paramLong3, byte paramByte)
  {
    this.uin = paramLong1;
    this.GroupCode = paramLong2;
    this.GroupUin = paramLong3;
    this.isneedstatus = paramByte;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.uin = paramJceInputStream.read(this.uin, 0, true);
    this.GroupCode = paramJceInputStream.read(this.GroupCode, 1, true);
    this.GroupUin = paramJceInputStream.read(this.GroupUin, 2, true);
    this.isneedstatus = paramJceInputStream.read(this.isneedstatus, 3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.uin, 0);
    paramJceOutputStream.write(this.GroupCode, 1);
    paramJceOutputStream.write(this.GroupUin, 2);
    paramJceOutputStream.write(this.isneedstatus, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\friendlist\GetTroopInfoReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */