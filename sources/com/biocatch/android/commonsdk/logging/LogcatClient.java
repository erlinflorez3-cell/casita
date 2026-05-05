package com.biocatch.android.commonsdk.logging;

import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u0006\u0007nʑA0ZeP.XV@ş\u001c{b#\u001c'ڱG;c\u001aF0\u0017Pfg\u0016pz`\u0019F'\b,w\u0019.\u0012q\u0007a*\u000f`G CAS\b=gg%:\u0013(J\"f{5\u0005(-`\u0010%|\fs\u001a\u001bH@\u001f?\u0003\u0011[\u000b2\u00124EP\u0005,d\u007fNdJ\u001daH9;\u0003\u0018D~-m;\u0015O#E\u0003)S\u000bҖ\"7"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6\u001c\u0011w?@\u000bc5]L", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6{\u001claB\u00169", "u(E", "5dc \\4IZ\u0019\\\u0002Z:\u000bq+m\u007f", "", "1kP@f\u0015:[\u0019", ":nV!b\u0016Nb$\u000f\n", "", ":de2_", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e9", ";db@T.>", "=m;<Z\u0014>a'z|^", "AsP0^\u001bKO\u0017~", "1n]AX?M<\u0015\u0007z", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LogcatClient extends LogClient {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ELogLevel.values().length];
            iArr[ELogLevel.TRACE.ordinal()] = 1;
            iArr[ELogLevel.DEBUG.ordinal()] = 2;
            iArr[ELogLevel.INFO.ordinal()] = 3;
            iArr[ELogLevel.WARNING.ordinal()] = 4;
            iArr[ELogLevel.ERROR.ordinal()] = 5;
            iArr[ELogLevel.CRITICAL.ordinal()] = 6;
            iArr[ELogLevel.OFF.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String getSimpleClassName(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, '.', 0, false, 6, (Object) null);
        if (iLastIndexOf$default <= 0) {
            return str;
        }
        String strSubstring = str.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final void logToOutput(ELogLevel level, String message, String className) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(className, "className");
    }

    @Override // com.biocatch.android.commonsdk.logging.ILogClient
    public void onLogMessage(ELogLevel eLogLevel, String str, String str2, String str3) throws Throwable {
        Intrinsics.checkNotNullParameter(eLogLevel, C1561oA.od("4,<*0", (short) (Od.Xd() ^ (-4239))));
        Intrinsics.checkNotNullParameter(str, C1561oA.Kd(":3BC298", (short) (OY.Xd() ^ 22414)));
        Intrinsics.checkNotNullParameter(str2, Wg.Zd("o\u0018+T\u0003\u0012Wl\u0016>", (short) (C1580rY.Xd() ^ (-3035)), (short) (C1580rY.Xd() ^ (-10207))));
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace.length > 5 ? stackTrace[3] : stackTrace[stackTrace.length - 1];
        short sXd = (short) (C1580rY.Xd() ^ (-3163));
        int[] iArr = new int["_WmY'f\\jd,RtbenXwgjmNvpyr|\u0004".length()];
        QB qb = new QB("_WmY'f\\jd,RtbenXwgjmNvpyr|\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("mlxRgwhpbM]j_", (short) (C1580rY.Xd() ^ (-2144))), new Class[0]);
        try {
            method.setAccessible(true);
            String str4 = (String) method.invoke(stackTraceElement, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Qg.kd("ndxb.k_kc)MmYZaIfTUV5[SZQY^", (short) (C1633zX.Xd() ^ (-12771)), (short) (C1633zX.Xd() ^ (-9028)))).getMethod(hg.Vd("\u001c\u0019't\u001d\u0011\"!z\r\u0018\u000f", (short) (Od.Xd() ^ (-5071)), (short) (Od.Xd() ^ (-32743))), new Class[0]);
            try {
                method2.setAccessible(true);
                String simpleClassName = getSimpleClassName((String) method2.invoke(stackTraceElement, objArr2));
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str5 = String.format(C1561oA.ud("I\u0017\\F\u0014YC\u0011<XX9=\u000b ", (short) (OY.Xd() ^ 7750)), Arrays.copyOf(new Object[]{eLogLevel.toString(), simpleClassName, str4, str + TokenParser.SP + str2}, 4));
                Intrinsics.checkNotNullExpressionValue(str5, C1561oA.yd("\u0015\u001d\u001f\u0019\u0014&X\u0016&(\"\u0015/eXa\u007f\u0010\u0004\u000fK", (short) (Od.Xd() ^ (-9914))));
                logToOutput(eLogLevel, str5, simpleClassName);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
