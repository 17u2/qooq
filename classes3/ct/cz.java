package ct;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.CountDownLatch;

public final class cz
{
  private static final FilenameFilter a = new FilenameFilter()
  {
    public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
    {
      return paramAnonymousString.endsWith(".stacktrace");
    }
  };
  private static boolean b;
  
  public static CountDownLatch a(bl parambl, final String paramString1, final String paramString2, final String paramString3)
  {
    try
    {
      final CountDownLatch localCountDownLatch = new CountDownLatch(1);
      new Thread()
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: invokestatic 40	ct/cz:a	()Z
          //   3: ifne +57 -> 60
          //   6: iconst_1
          //   7: invokestatic 43	ct/cz:a	(Z)Z
          //   10: pop
          //   11: aload_0
          //   12: getfield 20	ct/cz$2:a	Lct/bl;
          //   15: aload_0
          //   16: getfield 22	ct/cz$2:b	Ljava/lang/String;
          //   19: new 45	java/io/File
          //   22: dup
          //   23: aload_0
          //   24: getfield 24	ct/cz$2:c	Ljava/lang/String;
          //   27: invokespecial 48	java/io/File:<init>	(Ljava/lang/String;)V
          //   30: invokevirtual 52	java/io/File:getParentFile	()Ljava/io/File;
          //   33: invokestatic 55	ct/cz:a	(Lct/bl;Ljava/lang/String;Ljava/io/File;)V
          //   36: aload_0
          //   37: getfield 20	ct/cz$2:a	Lct/bl;
          //   40: aload_0
          //   41: getfield 22	ct/cz$2:b	Ljava/lang/String;
          //   44: aload_0
          //   45: getfield 26	ct/cz$2:d	Ljava/lang/String;
          //   48: invokevirtual 61	java/lang/String:getBytes	()[B
          //   51: invokevirtual 66	ct/bl:a	(Ljava/lang/String;[B)Ljava/lang/String;
          //   54: pop
          //   55: iconst_0
          //   56: invokestatic 43	ct/cz:a	(Z)Z
          //   59: pop
          //   60: aload_0
          //   61: getfield 28	ct/cz$2:e	Ljava/util/concurrent/CountDownLatch;
          //   64: invokevirtual 71	java/util/concurrent/CountDownLatch:countDown	()V
          //   67: return
          //   68: astore_1
          //   69: new 73	java/io/BufferedWriter
          //   72: dup
          //   73: new 75	java/io/FileWriter
          //   76: dup
          //   77: aload_0
          //   78: getfield 24	ct/cz$2:c	Ljava/lang/String;
          //   81: invokespecial 76	java/io/FileWriter:<init>	(Ljava/lang/String;)V
          //   84: invokespecial 79	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
          //   87: astore_1
          //   88: aload_1
          //   89: aload_0
          //   90: getfield 26	ct/cz$2:d	Ljava/lang/String;
          //   93: invokevirtual 82	java/io/BufferedWriter:write	(Ljava/lang/String;)V
          //   96: aload_1
          //   97: invokevirtual 85	java/io/BufferedWriter:flush	()V
          //   100: aload_1
          //   101: invokevirtual 88	java/io/BufferedWriter:close	()V
          //   104: goto -49 -> 55
          //   107: astore_1
          //   108: aload_1
          //   109: invokevirtual 91	java/io/IOException:printStackTrace	()V
          //   112: goto -57 -> 55
          //   115: astore_2
          //   116: aload_1
          //   117: invokevirtual 88	java/io/BufferedWriter:close	()V
          //   120: aload_2
          //   121: athrow
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	122	0	this	2
          //   68	1	1	localException	Exception
          //   87	14	1	localBufferedWriter	java.io.BufferedWriter
          //   107	10	1	localIOException	java.io.IOException
          //   115	6	2	localObject	Object
          // Exception table:
          //   from	to	target	type
          //   36	55	68	java/lang/Exception
          //   69	88	107	java/io/IOException
          //   100	104	107	java/io/IOException
          //   116	122	107	java/io/IOException
          //   88	100	115	finally
        }
      }.start();
      return localCountDownLatch;
    }
    finally
    {
      parambl = finally;
      throw parambl;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\ct\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */