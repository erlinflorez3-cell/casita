package com.google.firebase.sessions;

import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005'2\u009aw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00058i%\nKYXB\u007f8\b}P\u0016iEϽ\\ŲG\u000f\u000eǝIy:Mmx\f\u0014Ƥ6HwЀKOuBGfEE\u0013'J\"f{ڱ\u0005 2Ϻ(x\u0001KY\u0012ܞ4I"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\rIR7YC(\"h?C\u0010d0P\u0005|", "", "u(E", "\u001eQ>\u00108\u001a,M\u0002Zb>", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "!DB <\u0016'A\u0013\\dG\r`j)N[\u0010[", "5dc 8\u001a,7\u0003ghX\nfq\u0010Ia\"d\u001chv", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "!DC!<\u0015 A\u0013\\dG\r`j)N[\u0010[", "5dc 8\u001b-7\u0002`hX\nfq\u0010Ia\"d\u001chv", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionDataStoreConfigs {
    public static final SessionDataStoreConfigs INSTANCE = new SessionDataStoreConfigs();
    private static final String PROCESS_NAME;
    private static final String SESSIONS_CONFIG_NAME;
    private static final String SETTINGS_CONFIG_NAME;

    static {
        Object[] objArr = {StringsKt.encodeToByteArray(ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions()), 10};
        Method declaredMethod = Class.forName(C1561oA.od("myn{wpj3ywkm.A_pa1.", (short) (ZN.Xd() ^ 19809))).getDeclaredMethod(C1561oA.Kd("S]S`VXHdIkjbhb", (short) (C1580rY.Xd() ^ (-10856))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            String str = (String) declaredMethod.invoke(null, objArr);
            PROCESS_NAME = str;
            String strZd = Wg.Zd("\u001f\u007f\u0014U]\u00198v}m(C\u0010\u0013U_\u001f", (short) (C1499aX.Xd() ^ (-21455)), (short) (C1499aX.Xd() ^ (-16)));
            SESSIONS_CONFIG_NAME = strZd + str + C1561oA.Xd("IOMaO", (short) (OY.Xd() ^ PhotoshopDirectory.TAG_COUNT_INFORMATION));
            StringBuilder sbAppend = new StringBuilder(strZd).append(str);
            short sXd = (short) (C1580rY.Xd() ^ (-15134));
            int[] iArr = new int["}\u0013\u0006\u0016\u000f\u0005\u000b\u0005\n".length()];
            QB qb = new QB("}\u0013\u0006\u0016\u000f\u0005\u000b\u0005\n");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            SETTINGS_CONFIG_NAME = sbAppend.append(new String(iArr, 0, i2)).toString();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private SessionDataStoreConfigs() {
    }

    public final String getSESSIONS_CONFIG_NAME() {
        return SESSIONS_CONFIG_NAME;
    }

    public final String getSETTINGS_CONFIG_NAME() {
        return SETTINGS_CONFIG_NAME;
    }
}
