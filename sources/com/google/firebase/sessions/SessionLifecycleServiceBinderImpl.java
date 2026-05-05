package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0L͜P.hS2şs{BřcҕyCQU\"}(\tUȞ}˧\rW\u000b\u000bq\u000e>\u0015\u0006+7YY\u0007]*\u000f`CņC3[q\u0006OnwN\u0005N6R<\b\n\u0019\u001aXN@z\tJc\f@8\u0007\u0005\u0003h\u001bV\u001d\u001a@\u0010n$\u000f)tg|BxpkAG#1q\tNwk>|e\rtU}˜xҐ\"+Hʺ߷\u00193"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lv\u0004KUM,i6zH\u001bg", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lv\u0004KUM,i(", "4ha2U(LSt\n\u0006", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\na\u001b$Gl\nJv\u0001@dS", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@Jw\u001bTo\u000b8\u0005%\u0011d\tuz^", "0h]1G6,S&\u0010~\\,", "", "1`[9U(<Y", "\u001a`]1e6BRb\t\t(\u0014|\u0017=e\t*{MV", "AdaC\\*>1#\b\u0004^*\f\r9n", "\u001a`]1e6BRb|\u0005g;|\u0012>/m(\tQ\u0005\u0015\u0017%y\u0017Ev#D]\b)\r", "CmQ6a+,S&\u0010~\\,j\u00050e\u0007<", "", "/o_\u0010b5MS,\u000e", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "LifecycleServiceBinder";
    private final FirebaseApp firebaseApp;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lv\u0004KUM,i6zH\u001bP8\u0018V6\t\u000e]K-D", "", "u(E", "\"@6", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SessionLifecycleServiceBinderImpl(FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        this.firebaseApp = firebaseApp;
    }

    private final Object unbindServiceSafely(Context context, ServiceConnection serviceConnection) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-8925));
        short sXd2 = (short) (C1580rY.Xd() ^ (-13336));
        int[] iArr = new int["z\u0007{\t\u0005}w@t\u007f}\u0003rz\u007f8Lwuzj|w".length()];
        QB qb = new QB("z\u0007{\t\u0005}w@t\u007f}\u0003rz\u007f8Lwuzj|w");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(hg.Vd("CODQMF@\t=HFK;CH\u0001%6BE701\u000e976,)9-20", (short) (C1633zX.Xd() ^ (-32451)), (short) (C1633zX.Xd() ^ (-18851))));
            Object[] objArr = {serviceConnection};
            short sXd3 = (short) (C1607wl.Xd() ^ 30569);
            int[] iArr2 = new int["wobhlaO`loaZ[".length()];
            QB qb2 = new QB("wobhlaO`loaZ[");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
                return Unit.INSTANCE;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException e3) {
            String strYd = C1561oA.yd("\u0013&56%,,^$\"  \u0017.\u0019#\u0015P%\u0018\u001e#\u0017\u0012\rH\f\u0014\u0012\t\u000f\u0015G\u0001HDEICC\u0006", (short) (FB.Xd() ^ 8175));
            IllegalArgumentException illegalArgumentException = e3;
            short sXd4 = (short) (Od.Xd() ^ (-24504));
            int[] iArr3 = new int["^|zzy\u0011{\u0006\u007fn\u0002\u0010\u0015\t\u0004\u0007d\r\u0013\n\f\u001a".length()];
            QB qb3 = new QB("^|zzy\u0011{\u0006\u007fn\u0002\u0010\u0015\t\u0004\u0007d\r\u0013\n\f\u001a");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i4));
                i4++;
            }
            return Integer.valueOf(Log.w(new String(iArr3, 0, i4), strYd, illegalArgumentException));
        }
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void bindToService(Messenger messenger, ServiceConnection serviceConnection) throws Throwable {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(messenger, Xg.qd("nmyzqqt}", (short) (C1580rY.Xd() ^ (-15184)), (short) (C1580rY.Xd() ^ (-22547))));
        Intrinsics.checkNotNullParameter(serviceConnection, Jg.Wd("FwO4yD\u0001/\u001e}H\u0010P2\u0002X:", (short) (C1580rY.Xd() ^ (-12309)), (short) (C1580rY.Xd() ^ (-19088))));
        Context applicationContext = this.firebaseApp.getApplicationContext();
        short sXd = (short) (C1580rY.Xd() ^ (-12437));
        short sXd2 = (short) (C1580rY.Xd() ^ (-25488));
        int[] iArr = new int["5}XJi5I\u001d(tv{B0Q\r\rRMID<N".length()];
        QB qb = new QB("5}XJi5I\u001d(tv{B0Q\r\rRMID<N");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud("\u0005\u0016up\u0017};r6Cyb6]KP3I4=[", (short) (C1499aX.Xd() ^ (-16627)), (short) (C1499aX.Xd() ^ (-14098))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context = (Context) method.invoke(applicationContext, objArr);
            Intrinsics.checkNotNullExpressionValue(context, Ig.wd("6i^8R$hHY**\bl\u007f*Emk\u001f\u0018R}-\u00045v\u0018`w\u001fzOt\u0018E\u0002\u00191;DD\u0019\u001foq\ncG\u0013", (short) (C1580rY.Xd() ^ (-24101))));
            Intent intent = new Intent(context, (Class<?>) SessionLifecycleService.class);
            EO.Od("\u0011j\u0012,`*\u000b\u0014:,O}\u001f\u000b=\u001e\u0017\u0018p^0X~\u007f\u001cZR\u001dbUv", (short) (C1607wl.Xd() ^ 8617));
            C1561oA.Qd("\u000f+'%\"7 ( \r\u001e*-\u001f\u0018\u0019t\u001b\u001f\u0014\u0014 ", (short) (C1580rY.Xd() ^ (-21448)));
            intent.setAction(String.valueOf(Process.myPid()));
            intent.putExtra(C1593ug.zd("d\u000f\r\n\u0014\u001bj\n\u0016\u0017\u000e\u000e\u0011\u001a|\u0016%&\u0019#\u001d\u001c*", (short) (C1499aX.Xd() ^ (-15142)), (short) (C1499aX.Xd() ^ (-19276))), messenger);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.od("NZO\\XQK\u0014HSQVFNS\f KIN>PK", (short) (C1580rY.Xd() ^ (-30235)))).getMethod(C1561oA.Kd("\u0003\u0002\u0012n\u0001\u0004\r\u0004\u000b\ns\b\u0015\u000e", (short) (C1499aX.Xd() ^ (-276))), new Class[0]);
            try {
                method2.setAccessible(true);
                intent.setPackage((String) method2.invoke(context, objArr2));
                try {
                    Class<?> cls = Class.forName(Wg.Zd("X\u0014\u0017y$jC2\u0004]Ie#\\;>mK\u0012p\u000bp\u0006", (short) (OY.Xd() ^ 10178), (short) (OY.Xd() ^ 15203)));
                    Class<?>[] clsArr = new Class[3];
                    clsArr[0] = Class.forName(C1561oA.Xd("\"0'64/+u,99@2<C}\u001a@G9CJ", (short) (C1633zX.Xd() ^ (-4195))));
                    clsArr[1] = Class.forName(Wg.vd("?KDQIB@\tITV[GOX\u0011!2BE3,1\u000eECF<5E=B,", (short) (OY.Xd() ^ 17250)));
                    clsArr[2] = Integer.TYPE;
                    Object[] objArr3 = {intent, serviceConnection, 65};
                    Method method3 = cls.getMethod(Qg.kd("X^bWEVbeWPQ", (short) (C1607wl.Xd() ^ 2310), (short) (C1607wl.Xd() ^ 26709)), clsArr);
                    try {
                        method3.setAccessible(true);
                        zBooleanValue = ((Boolean) method3.invoke(context, objArr3)).booleanValue();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (SecurityException e3) {
                    hg.Vd("z\u0015\u001c\u001e\u0016\u0014N\"\u001cK\r\u0013\u0017\fF\u0019\n\u0017\u0016\u000b\u0010\u000e>\n\u0006\u0002\u007f|\u0012z\u0003z4\u0007w\u0004\u0007xqr,\u007fy)iwvqmfcuinl+", (short) (C1633zX.Xd() ^ (-14085)), (short) (C1633zX.Xd() ^ (-10605)));
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return;
                }
                unbindServiceSafely(context, serviceConnection);
                C1561oA.ud("|\u000e\u001b\u001a\u000f\u0014\u0012B\u000e\n\u0006\u0004\u0001\u0016~\u0007~8\u000b{\b\u000b|uv0qw{ptxp(mgnphf/", (short) (FB.Xd() ^ 14102));
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
