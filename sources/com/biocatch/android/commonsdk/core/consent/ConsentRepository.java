package com.biocatch.android.commonsdk.core.consent;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјnjO0L͜P.`_2şs{B$c$wEQ٥J}P\b\bMt(qН^\u000bQ\u000fN*\u0007mDI\u0004|\u000e\u0016\u001d7Zom9}sK@xtd\rh>0A\u0012\u0005/$ZL\u001ew\u0013Cy\u000eZLN{RR;W5\u001e \u000bV /$\rk\\=`l\fB_'\u0011uZNUc\u0001\u000b[\u000e^V=\f%ctѫL˝9\u0015-مα\u000b`"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLIk=-^FkB\u0015c5]c'RV\\0k\\\u007fQi", "", "u(E", ":hbAX5>`", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLIk=-^FkB\u0015c5]c'RV\\0k\\\u007fQRod\u0017\\+\u0016\u0014GP }TE|\u000b(R\u0004;gg\u0010$\u001d5spO,", "5dc\u0010b5LS\"\u000ehm(\f\u0019=", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]@X5MB-\nz", "", "AtQ@V9BP\u0019\\\u0005g:|\u0012>S\u000f$\u000bP\u000ft\u001aCx\u0010<u\f9g\r @m#", "", "CoS.g,\u001c]\"\rzg;j\u0018+t\u00106", "1n]@X5MA(z\nn:", "\u0011n]@X5MA(z\nn:Z\f+n\u0002(z'\u0005%&Gx\u000eI", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ConsentRepository {
    private ConsentStatusChangedListener listener;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4ߚ\u007f\u0007tpAӄJJ^\u008c\u0003SX\u000e4\u0012B$s$ DkY(\u007f:\t}Q\u0018k|Nr\u000bq\u0014L:ѷn2"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLIk=-^FkB\u0015c5]c'RV\\0k\\\u007fQRod\u0017\\+\u0016\u0014GP }TE|\u000b(R\u0004;gg\u0010$\u001d5spO,", "", "=m2<a:>\\(l\nZ;\r\u0017\rh{1}@\u007f", "", "1n]@X5MB-\nz", "", "1n]@X5MA(z\nn:", "", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public interface ConsentStatusChangedListener {
        void onConsentStatusChanged(String str, int i2);
    }

    public final int getConsentStatus(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, hg.Vd("kvtyi{v", (short) (FB.Xd() ^ 27604), (short) (FB.Xd() ^ 15343)));
        Intrinsics.checkNotNullParameter(str, C1561oA.ud("0;9=.6;\u001a>4(", (short) (C1499aX.Xd() ^ (-24531))));
        String strYd = C1561oA.yd("\u0014?=A:BG\"K==I", (short) (C1499aX.Xd() ^ (-16785)));
        Class<?> cls = Class.forName(C1561oA.Yd("drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e", (short) (Od.Xd() ^ (-2712))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1499aX.Xd() ^ (-335));
        short sXd2 = (short) (C1499aX.Xd() ^ (-30751));
        int[] iArr = new int["JBXD\u0012QGUO\u0017=_^V\\V".length()];
        QB qb = new QB("JBXD\u0012QGUO\u0017=_^V\\V");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strYd, 0};
        short sXd3 = (short) (C1499aX.Xd() ^ (-9568));
        short sXd4 = (short) (C1499aX.Xd() ^ (-29292));
        int[] iArr2 = new int["9I\u0004{DH\u0017\u0015GM\u001b)_i2.jy)J".length()];
        QB qb2 = new QB("9I\u0004{DH\u0017\u0015GM\u001b)_i2.jy)J");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            return ((SharedPreferences) method.invoke(context, objArr)).getInt(str, 0);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void subscribeConsentStatusChangedListener(ConsentStatusChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void updateConsentStatus(Context context, String str, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, ZO.xd("h!F\r16#", (short) (C1607wl.Xd() ^ 25807), (short) (C1607wl.Xd() ^ 6025)));
        short sXd = (short) (OY.Xd() ^ 4181);
        short sXd2 = (short) (OY.Xd() ^ 31466);
        int[] iArr = new int["\u0006\u007f!X\u0018YW!\r-~".length()];
        QB qb = new QB("\u0006\u007f!X\u0018YW!\r-~");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i3));
        Object[] objArr = {Ig.wd("|y\u00174e9+GFEPw", (short) (ZN.Xd() ^ 11134)), 0};
        Method method = Class.forName(EO.Od("H\u0003-YI\u0010T\u0011p/.Pot!zD\u0001*\u0016A\u0003K", (short) (Od.Xd() ^ (-24608)))).getMethod(C1593ug.zd("\u0010\u000f\u001f~\u0015\u000f!\u0015\u0015\u0002%\u0019\u001b\u001b)\u001d'\u001d /", (short) (ZN.Xd() ^ 19123), (short) (ZN.Xd() ^ 4459)), Class.forName(C1561oA.Qd("OEYC\u000fL@LD\n.NKAE=", (short) (C1499aX.Xd() ^ (-13427)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            ((SharedPreferences) method.invoke(context, objArr)).edit().putInt(str, i2).apply();
            ConsentStatusChangedListener consentStatusChangedListener = this.listener;
            if (consentStatusChangedListener != null) {
                consentStatusChangedListener.onConsentStatusChanged(str, i2);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
