package _COROUTINE;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,u\bDJd|\u0004W\u00068\u000b<C\u0007\"2\u0012\u0010\u0019tlQ0rhp.\u0001WZ\u0013y\u0001L$\n#8C[g(Ԃ:\t}M>˨1Н^\u0011KƤ\u001e\u0018~j:JǪ|c"}, d2 = {"\u000fQC\u00169\u0010\u001c7tet?\u0019Xp\u000f_j\u0004Y&\\xvAXi$V", "", "5dc\u000eE\u001b\"4|\\^:\u0013vi\u001cAg\bu+\\t|#Qm6_\u0001\u001d9", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/qc6Y0<W\u0015\u0006[k(\u0005\t", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "", "<`\\2", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CoroutineDebuggingKt {
    private static final String ARTIFICIAL_FRAME_PACKAGE_NAME = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement artificialFrame(Throwable th, String str) throws Throwable {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        String str2 = ARTIFICIAL_FRAME_PACKAGE_NAME + '.' + str;
        Class<?> cls = Class.forName(C1626yg.Ud("6\u001br\u0006\u00031osU1\u0004DI\u0007J\u000e\u0011)L>13\b{lSR", (short) (OY.Xd() ^ 25260), (short) (OY.Xd() ^ 4970)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 4655);
        int[] iArr = new int["!xY\u0007j\u0019:B\u0013\u0013\u0011".length()];
        QB qb = new QB("!xY\u0007j\u0019:B\u0013\u0013\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            String str3 = (String) method.invoke(stackTraceElement, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(EO.Od("\fTw}KG\u0014\u0019A'F\u000e&6Zd xS!?+\u0002\u0006LU:", (short) (ZN.Xd() ^ 5544))).getMethod(C1561oA.Qd("QN\\3OSI1WNBDP", (short) (C1633zX.Xd() ^ (-3390))), new Class[0]);
            try {
                method2.setAccessible(true);
                int iIntValue = ((Integer) method2.invoke(stackTraceElement, objArr2)).intValue();
                String strZd = C1593ug.zd(RemoteSettings.FORWARD_SLASH_STRING, (short) (ZN.Xd() ^ 25529), (short) (ZN.Xd() ^ 4737));
                Class<?> cls2 = Class.forName(C1561oA.od("?5I3~<0<4y\u001e>*+2\u001a7%&'\u0006,$+\"*/", (short) (ZN.Xd() ^ 13005)));
                Class<?>[] clsArr2 = {Class.forName(C1561oA.Kd("=5K7\u0005D:HB\n0RQIOI", (short) (OY.Xd() ^ 27021))), Class.forName(Wg.Zd("M*!\u0015\u0003c\"\u0010j;\u0002D\fdKM", (short) (C1499aX.Xd() ^ (-4413)), (short) (C1499aX.Xd() ^ (-7587)))), Class.forName(C1561oA.Xd("\u001c\u0014*\u0016c#\u0019'!h\u000f10(.(", (short) (OY.Xd() ^ 32681))), Integer.TYPE};
                Object[] objArr3 = {str2, strZd, str3, Integer.valueOf(iIntValue)};
                Constructor<?> constructor = cls2.getConstructor(clsArr2);
                try {
                    constructor.setAccessible(true);
                    return (StackTraceElement) constructor.newInstance(objArr3);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static final String getARTIFICIAL_FRAME_PACKAGE_NAME() {
        return ARTIFICIAL_FRAME_PACKAGE_NAME;
    }
}
