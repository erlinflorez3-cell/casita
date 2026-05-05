package androidx.core.os;

import android.os.Handler;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.google.android.gms.tapandpay.TapAndPayStatusCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZO;

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
/* JADX INFO: compiled from: Handler.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bDZc|İI\u0006>\u00126Ȑ\u0007\":ߚ\u007fјnjO0LeV.ZS0\u0010\u0004+Břs$ BcUH}R\r]O\u007fg\u001dL\u000b\u0013I\u000f\u0014\u0019\u0011lBH\u0004|\u000e\u001e\u00154PtW9]qM9\u000f{d\u000bf\u074c(P)\u0013\t2*v\u000f\u001fzqK<\u0016>I\t:\u0001\u000f}\r \u0012\u0014A8\u00034[\u0016RfTr_H4;\tyD^'\u000e7+SSІZܴ\u0011\u0001"}, d2 = {">nbA4;-W!~", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "Coc6`,&W \u0006~l", "", "BnZ2a", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ">nbA7,EO-~y", "2d[.l\u0010G;\u001d\u0006\u0002b:", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HandlerKt {
    public static final Runnable postDelayed(Handler handler, long j2, Object obj, Function0<Unit> function0) throws Throwable {
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(function0);
        if (obj == null) {
            Class<?> cls = Class.forName(C1561oA.Qd("myn{wpj3sv0Iambiam", (short) (Od.Xd() ^ (-23591))));
            Class<?>[] clsArr = {Class.forName(C1593ug.zd("\u0015\r#\u000f\\\u001c\u0012 \u001aa\u0007+%&\u001a\u001c'!", (short) (C1499aX.Xd() ^ (-20009)), (short) (C1499aX.Xd() ^ (-29537)))), Long.TYPE};
            Object[] objArr = {handlerKt$postDelayed$runnable$1, Long.valueOf(j2)};
            Method method = cls.getMethod(C1561oA.od("qorrAag[r][", (short) (OY.Xd() ^ 15929)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j2);
        }
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j2, Object obj, Function0 function0, int i2, Object obj2) throws Throwable {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            obj = null;
        }
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(function0);
        if (obj == null) {
            short sXd = (short) (OY.Xd() ^ 17903);
            int[] iArr = new int["&4+:83/y<A|\u00182@7@:H".length()];
            QB qb = new QB("&4+:83/y<A|\u00182@7@:H");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = {Class.forName(Wg.Zd("!Y\u001c%\u0007ge\u0015C(y^i\u000b(J\u000b\u0001", (short) (C1633zX.Xd() ^ (-3394)), (short) (C1633zX.Xd() ^ (-19127)))), Long.TYPE};
            Object[] objArr = {handlerKt$postDelayed$runnable$1, Long.valueOf(j2)};
            Method method = cls.getMethod(C1561oA.Xd("$$)+{\u001e&\u001c5\"\"", (short) (C1607wl.Xd() ^ 9757)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j2);
        }
        return handlerKt$postDelayed$runnable$1;
    }

    public static final Runnable postAtTime(Handler handler, long j2, Object obj, Function0<Unit> function0) throws Throwable {
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(function0);
        Class<?> cls = Class.forName(C1561oA.yd("{\n\u0001\u0010\u0006\u0001|G\u0012\u0017Rm\u007f\u000e\u0005\u000e\u0010\u001e", (short) (C1499aX.Xd() ^ (-7480))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("NF\\H\u0016UKYS\u001b@d^_SU`Z", (short) (C1633zX.Xd() ^ (-3196)))), Class.forName(Xg.qd("\u001d\u0015+\u0017d$\u001a(\"i\f )%$6", (short) (C1580rY.Xd() ^ (-15864)), (short) (C1580rY.Xd() ^ (-27156)))), Long.TYPE};
        Object[] objArr = {handlerKt$postAtTime$runnable$1, obj, Long.valueOf(j2)};
        Method method = cls.getMethod(Jg.Wd("Sg\u000bR>\tGcFU", (short) (C1607wl.Xd() ^ 11965), (short) (C1607wl.Xd() ^ 10454)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            return handlerKt$postAtTime$runnable$1;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j2, Object obj, Function0 function0, int i2, Object obj2) throws Throwable {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(function0);
        Class<?> cls = Class.forName(ZO.xd("$S\u001f):%m\u0010Gu`\n\u001fE\u001cAk\t", (short) (C1607wl.Xd() ^ TapAndPayStatusCodes.TAP_AND_PAY_USER_NOT_ELIGIBLE_AGE), (short) (C1607wl.Xd() ^ 32553)));
        Class<?>[] clsArr = {Class.forName(C1626yg.Ud("\u0015a~t \u0006>|\u0012~DOz*\rAo\u0004", (short) (C1633zX.Xd() ^ (-27759)), (short) (C1633zX.Xd() ^ (-39)))), Class.forName(Ig.wd("\rS\u0007\tFP1}T\u0016AnHAOy", (short) (FB.Xd() ^ 18173))), Long.TYPE};
        Object[] objArr = {handlerKt$postAtTime$runnable$1, obj, Long.valueOf(j2)};
        short sXd = (short) (FB.Xd() ^ FujifilmMakernoteDirectory.TAG_DYNAMIC_RANGE_SETTING);
        int[] iArr = new int["\u001eM\u0006!O_\u001dtSI".length()];
        QB qb = new QB("\u001eM\u0006!O_\u001dtSI");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            return handlerKt$postAtTime$runnable$1;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
