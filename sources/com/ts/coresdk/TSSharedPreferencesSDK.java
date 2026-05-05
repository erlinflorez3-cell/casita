package com.ts.coresdk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r\"4\u0012}\bnjG9LeN/ZS8\u0014s{:$c$\u007fICU }*\t]UogtZb\u000bQƤ\fȥx\u0001ߚyU'\u0002R\u00168BņC5S\u0012K\\)\u0010D\t82P;*\t\u000f\u001aBH>u+GY\u000e*0nqĐV\u000fS\t(\u0017Ni.\n6\\\u0016UfLz]R/Q\u0002\u001aF\\)w0+N=Jb-%v\u0010\u001f[DE=-%\u0002\n\u07baV]E\fM{\u00060v3?+w~\b:f\u007f,\u0015YN=a\u0001(t\u0005\u007fa<+9U{K~\u000fX{\t\u0004%<2\u0019Ν+J49(sP9A\u0004\u000bSn^2bP\u007f\u0013ad\u0016U\u0004A-Q\u001b\u0015R\u0012?'TO{3\u000eN'\u000fv9[\u0003\u001c\u05ce\u0019\u001dZ\u0007_A\u001akKZf\n\bN\u001e\b~b\u001a*2/w\u0004=}).E&g_G)9k0Itk\u0005\rxh\u0002zʐLB(\u0001$Jr:\u001an\\f\u001bj~U\t0\u001fM4T5|8\u0017.^\u0010<O&@R]n\u0002j{^:+=nO[\u0005j<X\u007fcۋ9Si$og??MRz\u0005\u0007irW\u001aZt(P1xn\u001ey\u0014D|\rC6Mw44Z2I`#P\u001b\u001epHҴ\ra`~\u001e\u0016\u001d^2\u001b\u0002$#\f1Tjp\bg'H\\\u0001n$EA\u007f6I*c(\u00014+$7\u0003\u0002\b_gzRƥp\u0018{m\n9^EGkG=A\u0012/-@\u0002EEzq\u0016U[\u0014?z+z??v4\u007f\b\u0019q\\dxRgTE0Ցbt)\"r\u001bB\rT\u0017_c\u0003\u000e\fBWr\u001bYjMh\u0001\u0013!6%/pR\u0001C3['K\u0017(\u0018=\u001dy]\u0018\u0001Ц}d\u0015B\u0003\u0003LWq4\bb\u007f`b?FIq~l!Tp\u0011D`j&\tr\rB\u0013KHoe!ZFU#/,g¡0\u000fvtiY[\u0013\fTF_Xvs\u0002\"^[%?L\u0004k{oc\\9K?\u000e\u0019\u0002In@\u001dݞ$X]\u0003\u0017Q"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxTm\u0016~<\u000e\u0017\u00162|\u000e=v25b{ E[t\u0014#", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "", ">0", "", "1kT.a", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6sXY", ">1", "", ">2", "5dc\u000fb6ES\u0015\b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013\tUO", "", "5dc\u0013_6:b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013tU;", "", "5dc\u0016a;", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013wU>", "", "5dc\u0019b5@", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013xU?", "5dc g9B\\\u001b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013z\u0017V\u001fJt\u0014\u0001bCm\\SD#\u0011.\u001fE\"m|\u001d\u0012W<fyD }V\u0007\u0019~C~", ">tc\u000fb6ES\u0015\b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013\tUK", ">tc\u0013_6:b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013tUK", ">tc\u0016a;", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013wUK", ">tc\u0019b5@", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013xUK", ">tc g9B\\\u001b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013z\u0017V\u001fJt\u0014\u0001bCm\\SD#\u0011.\u001fE,", "@d\\<i,$S-", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013W\u0003", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TSSharedPreferencesSDK {
    public static final TSSharedPreferencesSDK INSTANCE = new TSSharedPreferencesSDK();

    private TSSharedPreferencesSDK() {
    }

    public final void clean(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        com.ts.coresdk.c.a.f18248a.g(context).j(str);
    }

    public final boolean getBoolean(Context context, String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return com.ts.coresdk.c.a.f18248a.g(context).c(str, str2, z2);
    }

    public final float getFloat(Context context, String str, String str2, float f2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return com.ts.coresdk.c.a.f18248a.g(context).b(str, str2, f2);
    }

    public final int getInt(Context context, String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return com.ts.coresdk.c.a.f18248a.g(context).b(str, str2, i2);
    }

    public final long getLong(Context context, String str, String str2, long j2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return com.ts.coresdk.c.a.f18248a.g(context).c(str, str2, j2);
    }

    public final String getString(Context context, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return com.ts.coresdk.c.a.f18248a.g(context).b(str, str2, str3);
    }

    public final void putBoolean(Context context, String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.f18248a.g(context).b(str, str2, z2);
    }

    public final void putFloat(Context context, String str, String str2, float f2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.f18248a.g(context).a(str, str2, f2);
    }

    public final void putInt(Context context, String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.f18248a.g(context).a(str, str2, i2);
    }

    public final void putLong(Context context, String str, String str2, long j2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.f18248a.g(context).b(str, str2, j2);
    }

    public final void putString(Context context, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        com.ts.coresdk.c.a.f18248a.g(context).a(str, str2, str3);
    }

    public final void removeKey(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.f18248a.g(context).a(str, str2);
    }
}
