package com.ticnow.sdk.idnowonboarding.utils;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯB\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005&4\u0012\u000e\u0007nʑA0RnP.XW2\u000fy{<$a%yCQU\"Ԃ*\t]OogtNb\u000bY\u000f\u000e\u0016~k2ֶU\u000fزB\u000f`A0D9MڱA9nt~\u001b.C:8(\u00171\u001e8[(v)E{\u0010 DXphTSMM8 \u0017V /0\rk\\I`l\f<_'\u0011}ZNUa`\u0001[\"^TU#=afINHM\u0015Se3\u000b`nW\u0003msm\tv;?+wu\b:f\u0017,\u0015YgS];*j\u001ei`:9scqeh\u000eV\n+\u007f\u001bO\u001c\u000e4)x2;5~\b<5=\u000faZh\u0002\rT0~oI/%.5[=)\u0002iai\u001b~;\n\u001a%\u001eQ\u00177=in&`C-\u0005{_Di@kJ~\u000egX\u0006\u0004\u001fd2.\u0012G_\u007f]\u0014YB%:O[g5Qo\u0010[\\g%\u0007\u0011la\u0005jHn$72E?!\f\tV\u0015\tyclXZ\u0013} b\"\u0016\bA\"\r{J6=\u0010|e1\u0006xbu\nSA\u0017;g\u0002\u0004\u000e\u0006;\u000f7Cl{\u0010\u0010T'\u0018MSz\u0005\u0007~\u000bg\u001avt(PDxn\u001e\u000b\u0014D|\u000eC6M\r44Z3ax#d\u001b\u001epS-\rmm\u0001\u0010-Vc(\u0011\u0005<t7\u0003\u0001`~\u0005\u007fxwBE|0IYQc+VY0{L|Q\t/w\u000eb\u007fLuN\u001d\u001a\u0004l\u0014 D2\u0002]=Z+\u000f-;b\u0006;cdr\u0014p\u0016&5\u001b\u0015y=M\u00192u\u001b\u0003pZb\u001bN]o/\"%`;?\u0016\u0005\u0018y\u0010X+Kqg#[lK#\u0007gWf8+\u0007O\"3\u0016\b\"+Ku_5=.wBAEek|\b.(d?*\u0003\u0001\u001c,\u0012\u0018 f_tJ;fa\"\u0005LC<l1D\u000fkH\u0014P\nL\raJ\u0018ЯCެ<M\u0013ɀNr\u0015/%p\u0005]\u0011ܧBϻ8.g͈DO\f\u0018vCS\u0013$ό:ƽqKd֥\u001b\u001b\u0018\u0010\u00141\u001d\u0014rܾrݫ[b\u0011ݵV\u007f&<Y;\u0011\u0007\u0013ʂvҬ0<\u0010Ձ\u0014`w\r(z.H6ʘiЋFsCٙ^`\u0007dnH3i\u001cǺMǄ\u0005~\u0017ɼn\u0005C;\u001dmt_\u0006ѵ>ݏW\u001d\u0011ƅ;g\rr=+r_\u0010А4\u0092\u0005\u0017M؏[K\bC\u0012UIoq~\u001aH·\u0001?"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000e/;t$w1\"$uF\u0005\u001fj7", "", "u(E", "\u001aN6,9\u0010%3\u0013gVF\f", "", "\"@6", "\"@6,7\b-/", "\"@6,8\u0019+=\u0006", "\"@6,<\u0015\u001f=", "\"@6,?\u0010\u001f3", "7c=<j\u0013HUu\u000f{_,\n\t.W\r,\u000b@\u000e", "\u001aiPCTuB]b[\u000b_-|\u0016/dq5\u007fO\u0001$l", ":nV\u0013\\3>3\"zwe,{", "", ":nV@85:P ~y", "5dc\u0019b.L3\"zwe,{", "u(I", "Adc\u0019b.L3\"zwe,{", "uY\u0018#", "/o_2a+", "", "B`V", ";db@T.>", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "B", "", "1k^@X\u0013HUy\u0003\u0002^", ExifInterface.GPS_MEASUREMENT_2D, "BdgA", "7", "7mXA?6@4\u001d\u0006z", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", Global.COLON, "Bh\\2f;:[$", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDNowLog {
    private static final String LOG_FILE_NAME = "idnowsdk.log";
    private static final String TAG = "[IDNOW]";
    private static final String TAG_DATA = "DATA";
    private static final String TAG_ERROR = "ERROR";
    private static final String TAG_INFO = "INFO";
    private static final String TAG_LIFE = "LIFE";
    private static BufferedWriter idNowLogBufferedWriter = null;
    private static boolean logFileEnabled = false;
    public static final IDNowLog INSTANCE = new IDNowLog();
    private static boolean logsEnabled = true;

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.utils.IDNowLog$closeLogFile$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    final /* synthetic */ class AnonymousClass1 extends MutablePropertyReference0 {
        AnonymousClass1(IDNowLog iDNowLog) {
            super(iDNowLog);
        }

        @Override // kotlin.reflect.KProperty0
        public Object get() {
            return IDNowLog.access$getIdNowLogBufferedWriter$p((IDNowLog) this.receiver);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public String getName() {
            return "idNowLogBufferedWriter";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(IDNowLog.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public String getSignature() {
            return "getIdNowLogBufferedWriter()Ljava/io/BufferedWriter;";
        }

        @Override // kotlin.reflect.KMutableProperty0
        public void set(Object obj) {
            IDNowLog.idNowLogBufferedWriter = (BufferedWriter) obj;
        }
    }

    private IDNowLog() {
    }

    public static final /* synthetic */ BufferedWriter access$getIdNowLogBufferedWriter$p(IDNowLog iDNowLog) {
        BufferedWriter bufferedWriter = idNowLogBufferedWriter;
        if (bufferedWriter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("idNowLogBufferedWriter");
        }
        return bufferedWriter;
    }

    private final void append(String str, String str2) {
        try {
            BufferedWriter bufferedWriter = idNowLogBufferedWriter;
            if (bufferedWriter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idNowLogBufferedWriter");
            }
            bufferedWriter.write(Global.BLANK + timestamp() + ": " + str + ":\t" + str2);
            BufferedWriter bufferedWriter2 = idNowLogBufferedWriter;
            if (bufferedWriter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idNowLogBufferedWriter");
            }
            bufferedWriter2.newLine();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private final void append(String str, String str2, Exception exc) {
        try {
            BufferedWriter bufferedWriter = idNowLogBufferedWriter;
            if (bufferedWriter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idNowLogBufferedWriter");
            }
            bufferedWriter.write(Global.BLANK + timestamp() + ": " + str + ":\t" + str2 + " \n " + exc);
            BufferedWriter bufferedWriter2 = idNowLogBufferedWriter;
            if (bufferedWriter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idNowLogBufferedWriter");
            }
            bufferedWriter2.newLine();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private final void append(String str, String str2, Throwable th) {
        try {
            BufferedWriter bufferedWriter = idNowLogBufferedWriter;
            if (bufferedWriter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idNowLogBufferedWriter");
            }
            bufferedWriter.write(Global.BLANK + timestamp() + ": " + str + ":\t" + str2 + " \n " + th);
            BufferedWriter bufferedWriter2 = idNowLogBufferedWriter;
            if (bufferedWriter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idNowLogBufferedWriter");
            }
            bufferedWriter2.newLine();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private final String timestamp() {
        String str = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
        Intrinsics.checkExpressionValueIsNotNull(str, "simpleDateFormat.format(Date())");
        return str;
    }

    public final void closeLogFile() throws IOException {
        BufferedWriter bufferedWriter = idNowLogBufferedWriter;
        if (bufferedWriter != null) {
            if (bufferedWriter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idNowLogBufferedWriter");
            }
            bufferedWriter.close();
            logFileEnabled = false;
        }
    }

    public final void d(String tag, String text) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        if (logsEnabled) {
            String str = "DATA: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_DATA, tag + " - " + text);
        }
    }

    public final void d(String tag, String text, Exception e2) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(e2, "e");
        if (logsEnabled) {
            String str = "DATA: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_DATA, tag + " - " + text, e2);
        }
    }

    public final void d(String tag, String text, Throwable t2) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(t2, "t");
        if (logsEnabled) {
            String str = "DATA: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_DATA, tag + " - " + text, t2);
        }
    }

    public final void e(String tag, String text) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        if (logsEnabled) {
            String str = "ERROR: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_ERROR, tag + " - " + text);
        }
    }

    public final void e(String tag, String text, Exception e2) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(e2, "e");
        if (logsEnabled) {
            String str = "ERROR: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_ERROR, tag + " - " + text, e2);
        }
    }

    public final void e(String tag, String text, Throwable t2) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(t2, "t");
        if (logsEnabled) {
            String str = "ERROR: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_ERROR, tag + " - " + text, t2);
        }
    }

    public final boolean getLogsEnabled() {
        return logsEnabled;
    }

    public final void i(String tag, String text) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        if (logsEnabled) {
            String str = "INFO: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append("INFO", tag + " - " + text);
        }
    }

    public final void i(String tag, String text, Exception e2) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(e2, "e");
        if (logsEnabled) {
            String str = "INFO: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append("INFO", tag + " - " + text, e2);
        }
    }

    public final void i(String tag, String text, Throwable t2) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(t2, "t");
        if (logsEnabled) {
            String str = "INFO: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append("INFO", tag + " - " + text, t2);
        }
    }

    public final void initLogFile(Context context) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-32461));
        int[] iArr = new int["R]_dXji".length()];
        QB qb = new QB("R]_dXji");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i2));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("Zf[hd]W T_]bRZ_\u0018,WUZJ\\W", (short) (Od.Xd() ^ (-25902)), (short) (Od.Xd() ^ (-14931)))).getMethod(hg.Vd("%\"0\u0001#%\u001d*y\u001e&", (short) (C1633zX.Xd() ^ (-12919)), (short) (C1633zX.Xd() ^ (-12691))), new Class[0]);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            String strUd = C1561oA.ud("uoxx\u007fzjp2oqh", (short) (C1499aX.Xd() ^ (-32722)));
            if (!new File(file, strUd).exists()) {
                try {
                    Class<?> cls = Class.forName(C1561oA.yd("}\f\u0003\u0012\b\u0003~I\b\u0015\u0015\u001c\u0006\u0010\u0017QO||\u0004m\u0002~", (short) (C1499aX.Xd() ^ (-29928))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd2 = (short) (OY.Xd() ^ 17523);
                    int[] iArr2 = new int["\b\u0007\u0017i\u000e\u0012\f\u001bl\u0013\u001d".length()];
                    QB qb2 = new QB("\b\u0007\u0017i\u000e\u0012\f\u001bl\u0013\u001d");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                        i3++;
                    }
                    Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method2.setAccessible(true);
                        new File((File) method2.invoke(context, objArr2), strUd).createNewFile();
                        logFileEnabled = true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(Xg.qd("^lcrpkg2huu|nx\u007f:P}}\u0005v\u000b\b", (short) (FB.Xd() ^ 30355), (short) (FB.Xd() ^ 4842))).getMethod(Jg.Wd("o)\u0014AD\u001du[wz_", (short) (C1580rY.Xd() ^ (-21224)), (short) (C1580rY.Xd() ^ (-23384))), new Class[0]);
            try {
                method3.setAccessible(true);
                idNowLogBufferedWriter = new BufferedWriter(new FileWriter(new File((File) method3.invoke(context, objArr3), strUd), true));
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public final void l(String tag, String text) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        if (logsEnabled) {
            String str = "LIFE: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_LIFE, tag + " - " + text);
        }
    }

    public final void l(String tag, String text, Exception e2) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(e2, "e");
        if (logsEnabled) {
            String str = "LIFE: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_LIFE, tag + " - " + text, e2);
        }
    }

    public final void l(String tag, String text, Throwable t2) {
        Intrinsics.checkParameterIsNotNull(tag, "tag");
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(t2, "t");
        if (logsEnabled) {
            String str = "LIFE: " + tag + " - " + text;
        }
        if (logFileEnabled) {
            append(TAG_LIFE, tag + " - " + text, t2);
        }
    }

    public final void setLogsEnabled(boolean z2) {
        logsEnabled = z2;
    }
}
