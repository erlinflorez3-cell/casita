package com.facebook.react.views.scroll;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0018\u007f\u0007ljA0RjP.XW2\u000fy\u0005<$a&\bّYfJ}P\b\bMx(qН^\u000bQ\u000fN*\u0007wDI\u0004\u0007\u000e\u0016\u001dAZom7}sKIxtd\tp>09\u0012\u0005/\u001c\u0001Ͻ\u001cͯ~CSÈb<NsRR;Q[܈\u001eĂB \tȦ-s\\;`l\f>\u0006ݍ\u000fݦFN/ڿ\u0001\u0019[\u0015^TU\u0014'e,1X7c\u001cc\u0014Yޞ^ÜC\tGмU\u0007n055\u001a\u0010eAp\u007fB\u001c[S\u001bc\u000b&\u000b\f\u0010!bʳ7յgQXʫ@y\u0001\b\u001bFǲ\u0012\u0018"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\n@[\u0014;WJBJ8, dp7\nF,U\u0002'T\"", "", "u(E", ":`bAF*K] \u0006Zo,\u0006\u0018\u001ei\b(cN", "", ">qTCK", "", ">qTCL", "\nrTA \u0006\u0017", "", "FE[6a./S \txb;\u0011", "5dc%93B\\\u001boze6z\r>y", "u(5", "GE[6a./S \txb;\u0011", "5dc&93B\\\u001boze6z\r>y", "=mB0e6EZv\u0002vg.|\b", "", "F", "G", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class OnScrollDispatchHelper {
    private static final Companion Companion = new Companion(null);
    private static final int MIN_EVENT_SEPARATION_MS = 10;
    private float xFlingVelocity;
    private float yFlingVelocity;
    private int prevX = Integer.MIN_VALUE;
    private int prevY = Integer.MIN_VALUE;
    private long lastScrollEventTimeMs = -11;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\n@[\u0014;WJBJ8, dp7\nF,U\u0002'T\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\u001bH=,8\u001d\u001e<\bxh>\u0017Xu\u000bTc\u0012d:h\u0005", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final float getXFlingVelocity() {
        return this.xFlingVelocity;
    }

    public final float getYFlingVelocity() {
        return this.yFlingVelocity;
    }

    public final boolean onScrollChanged(int i2, int i3) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j2 = this.lastScrollEventTimeMs;
        boolean z2 = (jUptimeMillis - j2 <= 10 && this.prevX == i2 && this.prevY == i3) ? false : true;
        if (jUptimeMillis - j2 != 0) {
            this.xFlingVelocity = (i2 - this.prevX) / (jUptimeMillis - j2);
            this.yFlingVelocity = (i3 - this.prevY) / (jUptimeMillis - j2);
        }
        this.lastScrollEventTimeMs = jUptimeMillis;
        this.prevX = i2;
        this.prevY = i3;
        return z2;
    }
}
