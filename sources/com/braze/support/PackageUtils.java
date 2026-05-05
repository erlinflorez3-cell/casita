package com.braze.support;

import android.content.Context;
import bo.app.m50;
import com.braze.support.BrazeLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Qg;
import yg.Wg;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u000e\u0007nʑA0ReP\u008cX\u07bf*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\uj\u0007J\t\rs\u0013\u0014\u001a\u0011jZN\u001c}& \u001d8Zom:}sK:xtd\u0007f7rF\b\u0006\u0019\u001c@G>xQŒWë\u00160H\u0081ĖV\u0015"}, d2 = {"\u001ab^:\")KO.~Dl<\b\u00149r\u000fqf<~\u001d\u0013Io}Kz,C/", "", "u(E", ">`R8T.><\u0015\u0007z", "", "5dc\u001fX:Hc&|zI(z\u000f+g\u007f\u0011wH\u0001", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Adc\u001fX:Hc&|zI(z\u000f+g\u007f\u0011wH\u0001", "", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PackageUtils {
    public static final PackageUtils INSTANCE = new PackageUtils();
    private static String packageName = null;

    private PackageUtils() {
    }

    @JvmStatic
    public static final String getResourcePackageName(Context context) {
        Intrinsics.checkNotNullParameter(context, Wg.Zd("3Z\u000ej\u0014}.", (short) (C1580rY.Xd() ^ (-17553)), (short) (C1580rY.Xd() ^ (-27559))));
        String str = packageName;
        if (str != null) {
            return str;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("TbYhfa](^kkrdnu0Fsszl\u0001}", (short) (C1633zX.Xd() ^ (-26989)))).getMethod(Wg.vd("\u0013\u0012\u001ez\u0011\u0014\u0019\u0010\u000b\no\u0004\u0015\u000e", (short) (C1499aX.Xd() ^ (-2535))), new Class[0]);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context, objArr);
            packageName = str2;
            return str2 == null ? Qg.kd("6.*,,3)g)\u0019\u001a!\u0016\u001b\u0018", (short) (Od.Xd() ^ (-14134)), (short) (Od.Xd() ^ (-4995))) : str2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JvmStatic
    public static final void setResourcePackageName(String packageName2) {
        Intrinsics.checkNotNullParameter(packageName2, "packageName");
        if (StringsKt.isBlank(packageName2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) m50.f1257a, 6, (Object) null);
        } else {
            packageName = packageName2;
        }
    }
}
