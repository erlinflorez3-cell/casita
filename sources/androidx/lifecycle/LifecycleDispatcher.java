package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: LifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjO0LeN.X\u07b8*%ӆ,4RZ\\pJ{Z }̀\rO\\g0|X]#C=\nF|x1aU'cX\u0014\u0003N}@KM\u001e?\u0010Şvȥ\t :Ĳة}\r"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00049g\t\u001cFk\u0019.Z\u0019", "", "u(E", "7mXA\\(EW.~y", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "7mXA", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u0012hb=T;<V\u0019\fV\\;\u0001\u001a3t\u0014\u0006wG\b\u0014\u0013Eu", ":hU2V@<Z\u0019F\u0006k6z\t=sy5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LifecycleDispatcher {
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    private LifecycleDispatcher() {
    }

    @JvmStatic
    public static final void init(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1593ug.zd("p}}\u0005v\u000b\b", (short) (Od.Xd() ^ (-7219)), (short) (Od.Xd() ^ (-6795))));
        if (initialized.getAndSet(true)) {
            return;
        }
        short sXd = (short) (C1499aX.Xd() ^ (-22060));
        int[] iArr = new int["+7,95.(p%0.3#+0h|(&+\u001b-(".length()];
        QB qb = new QB("+7,95.(p%0.3#+0h|(&+\u001b-(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("XWg5efca\\[oellBoovh|y", (short) (ZN.Xd() ^ 22936)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Intrinsics.checkNotNull(context2, Wg.Zd("[K-\u0017\u000b8!vXD\u0013'K\u0019<iJ&\u0010%< 9R5\u001d&Q9yd\u00027\u0007gEAmd#\u0014z=!MjB-L(A,hO4{oN\u001f\u0007", (short) (OY.Xd() ^ 12075), (short) (OY.Xd() ^ 6805)));
            Application application = (Application) context2;
            DispatcherActivityCallback dispatcherActivityCallback = new DispatcherActivityCallback();
            short sXd2 = (short) (C1499aX.Xd() ^ (-26799));
            int[] iArr2 = new int[">LCRPKG\u0012FVW\u0016*Z[XVQPdZaa".length()];
            QB qb2 = new QB(">LCRPKG\u0012FVW\u0016*Z[XVQPdZaa");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Class<?>[] clsArr = new Class[1];
            short sXd3 = (short) (ZN.Xd() ^ 17984);
            int[] iArr3 = new int[">J?LHA;\u00046DC\u007f\u0012@?:VOL^RWU\n&GWKWISWIea_\\qZbZ7T^]RPQx\u007f".length()];
            QB qb3 = new QB(">J?LHA;\u00046DC\u007f\u0012@?:VOL^RWU\n&GWKWISWIea_\\qZbZ7T^]RPQx\u007f");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((sXd3 ^ i4) + xuXd3.CK(iKK3));
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr3, 0, i4));
            Object[] objArr2 = {dispatcherActivityCallback};
            Method method2 = cls.getMethod(Qg.kd("|nopyyiuCdthtfptFb^\\YnW_W4Q[ZOMNU\\", (short) (C1607wl.Xd() ^ 32355), (short) (C1607wl.Xd() ^ 14221)), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(application, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: compiled from: LifecycleDispatcher.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜N-hݷZ\u000f\u001azt'Ӯ(qQ;\u001e2\f#!O|i\u0018rX]#C=\nF~x1aW\u000f\\@\u0015xVŌC:"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00049g\t\u001cFk\u0019.Z\u0002\u001aoB)\u0011w_<\u0007p\bL\u0006+XP]@:NyD\u0011\u000eX\u0014$", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E \t\"&[K\fKz69h\u0012\u0007;n\u0016,aABk\u0012\u001a\u001co^5\u0005i:$", "u(E", "=m00g0OW(\u0013Xk,x\u0018/d", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", ":hU2V@<Z\u0019F\u0006k6z\t=sy5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }
}
