package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.graphics.ColorKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Xu;
import yg.ZN;
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
/* JADX INFO: compiled from: ColorResources.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG6LeN/X\u07bb*%ӆ,4RZdvI;ڈ\u001e}0\t\u0018suh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u0006~c\u0011\u001d7Zom9\u0014t\u00818śԓ5\u0004ڶ6$>\u0001\u0013\tɠ*Q\u0018v\u0001bS\u000f\u0018ص\\\u001f9Ŏ\u0011V"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011M\u0018C\u00012\"Y\f*Gz\u0014.0CBv4+j", "", "u(E", "5dc\u0010b3H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7c", "", "5dc\u0010b3H``pv:\rl\\-", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEq\u007f[", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ColorResourceHelper {
    public static final ColorResourceHelper INSTANCE = new ColorResourceHelper();

    private ColorResourceHelper() {
    }

    /* JADX INFO: renamed from: getColor-WaAFU9c, reason: not valid java name */
    public final long m5916getColorWaAFU9c(Context context, int i2) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Xd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (C1580rY.Xd() ^ (-7866))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 21939);
        int[] iArr = new int["po{Zjyry\u0004ut\u0004".length()];
        QB qb = new QB("po{Zjyry\u0004ut\u0004");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            short sXd2 = (short) (C1633zX.Xd() ^ (-13420));
            short sXd3 = (short) (C1633zX.Xd() ^ (-3770));
            int[] iArr2 = new int["DPERNGA\n>IGL<DI\u0002\u0016A?D4FA".length()];
            QB qb2 = new QB("DPERNGA\n>IGL<DI\u0002\u0016A?D4FA");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(((sXd2 + i4) + xuXd2.CK(iKK2)) - sXd3);
                i4++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i4)).getMethod(hg.Vd("wt\u0003atpwn", (short) (ZN.Xd() ^ 10108), (short) (ZN.Xd() ^ 27383)), new Class[0]);
            try {
                method2.setAccessible(true);
                return ColorKt.Color(resources.getColor(i2, (Resources.Theme) method2.invoke(context, objArr2)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
