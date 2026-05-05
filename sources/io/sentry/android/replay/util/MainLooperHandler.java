package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ReP\u008cZS@\u000fsڔ:řqҕ\"CiTZ\u000b2\u000fUNug\u0007J\t\fß\u0013\u0006$z38W\\\u0011]@\u0017bF}HKM\u001eG\no\u00039\u001d `&أ}\u000b\tɝBJ\u0016{\tIƠ\u0010\u001d"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~Ay$@T 8XCHN0'\u0014oaF\\", "", ":n^=X9", "\u001a`]1e6BRb\t\t(\u0013\u0007\u0013:e\r}", "uKP;W9HW\u0018H\u0005luc\u00139p\u007f5Q\u0004q", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "5dc\u0015T5=Z\u0019\f", "u(;.a+K]\u001d}Dh:Fk+n~/{MV", ">nbA", "", "@t];T)ES", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MainLooperHandler {
    private final Handler handler;

    public MainLooperHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MainLooperHandler(Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.handler = new Handler(looper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MainLooperHandler(Looper looper, int i2, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i2 & 1) != 0) {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Yd("cqhwupl7y~:Y}~\u0001v\u0005", (short) (C1633zX.Xd() ^ (-30641)))).getDeclaredMethod(Xg.qd("\u0004\u0003\u0013l\u0002\u000b\u0011o\u0014\u0015\u0017\r\u001b", (short) (Od.Xd() ^ (-23195)), (short) (Od.Xd() ^ (-267))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                looper = (Looper) declaredMethod.invoke(null, objArr);
                Intrinsics.checkNotNullExpressionValue(looper, Jg.Wd("_\u0014^Z+f\u0017)w+h\u0001I2^", (short) (ZN.Xd() ^ 8649), (short) (ZN.Xd() ^ 21643)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this(looper);
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void post(Runnable runnable) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 17413);
        short sXd2 = (short) (FB.Xd() ^ 22174);
        int[] iArr = new int["\u007fx#_\u0015@z8".length()];
        QB qb = new QB("\u007fx#_\u0015@z8");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(runnable, new String(iArr, 0, i2));
        Handler handler = this.handler;
        short sXd3 = (short) (C1607wl.Xd() ^ 176);
        short sXd4 = (short) (C1607wl.Xd() ^ 9898);
        int[] iArr2 = new int["?\u001ff?6fl\u0013O\u0019x\u0016=0\u0004v,F".length()];
        QB qb2 = new QB("?\u001ff?6fl\u0013O\u0019x\u0016=0\u0004v,F");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {runnable};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(EO.Od("\u000f\\$\t", (short) (C1580rY.Xd() ^ (-19490))), Class.forName(Ig.wd("J\u0011DK\t\u0012n<\u0012X\u0007@\n\b\u000b&z]", (short) (Od.Xd() ^ (-17189)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
