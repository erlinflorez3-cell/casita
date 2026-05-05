package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Qg;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<;!&i\u000eӵLc\u000b\u0004I\u00066\u000b6B\r\"4ߚ\u007f\u0007|jAӄLeVAZݷ2\u000fy\u0002<$a$yCQU\"}8\tWN}gvJ`\u000b[-\u0014ǝ\u0011lBH\u001cw}\u001a\u0015˰PnU2uok9\ttd\u0006f\u074c(أ}\u0005\u000f\u001cB\u0015\u001ey\u0013Cy\u0010:0nqjZ\u0013M\u0013\u001f*\bT\u001f/$\rk\\=`l\fB_)\tjPW?_^\u0007}\u0013LU5\u0018\u000faL5pLC!=d\u0013\tb[m\u0011OsM\u0005\u0017+U8ʁwW<gFϳ\u001bC\u0006\u001b`\u000b&\u000b\ty`:([UiJ^\u001e@w)\u0006=@\u0012\u0015\u001e'v6]/t\u0014&D\u0005tc@~\u0010nD\u0010z\u0010:E2ő7+?*-Ϧgދ\u001d_"}, d2 = {"5dc l:MS!lzk=\u0001\u0007/", "\"", "", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#{!FUG'3v\u0018w7@@k2-j", "Ehc5F;RZ\u0019}Vm;\n\r,u\u000f(\n", "", "Adc", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "/sc?f", "", "2dU g@ESt\u000e\nk", "", "2dU g@ES\u0006~\t", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\no+\"GniI\u0004!I/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@db<h9<S|}", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) ContextCompat.getSystemService(context, Object.class);
    }

    public static final void withStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, Function1<? super TypedArray, Unit> function1) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.od("4@5B>71y.97<,49q\u00061/4$61", (short) (C1499aX.Xd() ^ (-1412))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Kd("t\u0003y\t\u0007\u0002}H\u0011\u0011\u0007\u000bMa\u0016\u0017\u0016\u000e\b\u001c\u001c\u000e|\u0010 ", (short) (C1607wl.Xd() ^ 17475))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(Wg.Zd("m\u0013Wr-D[+b\u007f\u000b8G-Co\u0019\\\"/R\u0013", (short) (ZN.Xd() ^ 18430), (short) (ZN.Xd() ^ 18639)), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            function1.invoke(typedArray);
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, Function1 function1, int i4, Object obj) throws Throwable {
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            attributeSet = null;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        Class<?> cls = Class.forName(C1561oA.Xd("KYP_]XT\u001fUbbi[el'=jjqcwt", (short) (C1633zX.Xd() ^ (-14619))));
        Class<?>[] clsArr = {Class.forName(Wg.vd("kyl{}xp;\b\by}DX\t\n\r\u0005z\u000f\u0013\u0005o\u0003\u0017", (short) (C1499aX.Xd() ^ (-19215)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(Qg.kd("pbs_fjNnrd\\Z6hgdZRdbR_", (short) (C1499aX.Xd() ^ (-16659)), (short) (C1499aX.Xd() ^ (-20202))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            function1.invoke(typedArray);
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final void withStyledAttributes(Context context, int i2, int[] iArr, Function1<? super TypedArray, Unit> function1) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-270));
        int[] iArr2 = new int["R^S`\\UO\u0018LWUZJRW\u0010$OMRBTO".length()];
        QB qb = new QB("R^S`\\UO\u0018LWUZJRW\u0010$OMRBTO");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(i2), iArr};
        Method method = cls.getMethod(C1593ug.zd(", 3!*0\u00168>2,,\n>?>60DD6E", (short) (C1633zX.Xd() ^ (-659)), (short) (C1633zX.Xd() ^ (-7655))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            function1.invoke(typedArray);
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
