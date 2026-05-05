package com.biocatch.client.android.sdk.core.display;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG?Le^.ZS0\u000fs{J$c$wDCU0}*\tUNmu\u0005Ϻ\u000b\u000bq\u000eF!\tn:Imx\f\u0013Ƥ6B}A{\\}BQf\u00058\u0015 `)f\u007fڱ\u0005\u001a8PX\u0003\tLc\f@:ptH]%M3!Z\u0012L,\u0019\u001e\u000bq~:Vwu:]*KuP[?_^\u000b}\u0011T_?\r%hf7NFM\u0015Sa3\u000b`fW\u0003mx\u000e\u0011v'?+wt.̯Zÿ\u0018\u00153˽]i\u0001)t\u0005\u007fdbʯ-յgKXʫ߳{\u000b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wLGIv;\u001a)2@=\u0015n3J\u000b55L[=`Pr\u0013", "", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"\u0012\u001d", "2hb=_(R;\u0015\bv`,\n", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI'\u007fN\f\u001e\u0013[9l@\u00050<U\u0012\b3v\u00120MP\u0011", "5dc\u000ei(BZ\u0015{\u0002^\u000b\u0001\u0017:l{<\n", "", "\u001a`]1e6BRb\u0010~^>Fg3s\u000b/wTV", "u(J\u0019T5=`#\u0003y(=\u0001\tA/^,\nK\b\u0013+\u001d", "@db<_=>2$\u0003Wr\u000b\u0001\u0017:l{<YJ\n&\u0017Z~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", "2hb=_(R", "@db<_=>2$\u0003a^.x\u0007C", "@db<_=>E\u001d\byh>j\rDe\\<ZD\u000f\"\u001eC\u0004kF\u007f45l\r", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "@db<_=>E\u001d\byh>j\rDef(}<~+", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public class DisplaysService {
    private final ApplicationCache applicationCache;
    private final DisplayManager displayManager;

    public DisplaysService(ApplicationCache applicationCache) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        this.applicationCache = applicationCache;
        Object systemService = applicationCache.get().getSystemService("display");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.displayManager = (DisplayManager) systemService;
    }

    public final Display[] getAvailableDisplays() {
        Display[] displays = this.displayManager.getDisplays();
        Intrinsics.checkNotNullExpressionValue(displays, "displayManager.displays");
        return displays;
    }

    public final PointF resolveDpiByDisplayContext(Display display) throws Throwable {
        Intrinsics.checkNotNullParameter(display, C1561oA.Xd("MS^\\YOh", (short) (C1607wl.Xd() ^ 6796)));
        Context contextCreateDisplayContext = this.applicationCache.get().createDisplayContext(display);
        short sXd = (short) (C1633zX.Xd() ^ (-24449));
        int[] iArr = new int["5A6CG@:\u0003/:8=5=Bz'RPUM_Z".length()];
        QB qb = new QB("5A6CG@:\u0003/:8=5=Bz'RPUM_Z");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (FB.Xd() ^ 16413);
        short sXd3 = (short) (FB.Xd() ^ 15318);
        int[] iArr2 = new int["jguRdqlqm]^k".length()];
        QB qb2 = new QB("jguRdqlqm]^k");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            DisplayMetrics displayMetrics = ((Resources) method.invoke(contextCreateDisplayContext, objArr)).getDisplayMetrics();
            PointF pointF = new PointF();
            pointF.x = displayMetrics.xdpi;
            pointF.y = displayMetrics.ydpi;
            return pointF;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final PointF resolveDpiLegacy(Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        PointF pointF = new PointF();
        pointF.x = displayMetrics.xdpi;
        pointF.y = displayMetrics.ydpi;
        return pointF;
    }

    public final Point resolveWindowSizeByDisplayContext(Display display) throws Throwable {
        Intrinsics.checkNotNullParameter(display, hg.Vd("\u000f\u0013\u001c\u0018\u0013\u0007\u001e", (short) (Od.Xd() ^ (-21187)), (short) (Od.Xd() ^ (-9719))));
        Context contextCreateDisplayContext = this.applicationCache.get().createDisplayContext(display);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("XdYfb[U\u001eR][`PX]\u0016*USXHZU", (short) (C1633zX.Xd() ^ (-30289)))).getMethod(C1561oA.yd("96H%3@?D<,1>", (short) (ZN.Xd() ^ 15549)), new Class[0]);
        try {
            method.setAccessible(true);
            DisplayMetrics displayMetrics = ((Resources) method.invoke(contextCreateDisplayContext, objArr)).getDisplayMetrics();
            Point point = new Point();
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
            return point;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final Point resolveWindowSizeLegacy(Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        Point point = new Point();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        return point;
    }
}
