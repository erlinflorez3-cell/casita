package com.dynatrace.agent.userinteraction.model;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r'4\u0012}\u0012njG9LeN.ZS8\u0015sڔ<$i0yّA٦ \u0014̝9O|f(\fZ^\u0019C'\u0006Dyz0WW\u0011]@\u0012BF}CKM\u001e@˃dv<\n.8j?\b\u0011\u0019\u001aXIVΓ{\fR\u001a\u001fH@\u001f=\u0019ӏNM! \u0014V /!#ʨO~mzlR/QɅ\u001aHT'm0\u0015M;G\u0005-\u0013vo C@e8E+Y\u0003\u0015Vs?1B8ݼ\u0004185;as\u0006G\t\u0006\"'CQ#\\!%#ԻR)\u00135>gcydT vC\u0003\u001bQ\u001c\u000e4=\u000fΪ,ju\u0016\u000eKt!TĖT\bfۍ\u0018|g=%-PB9;3f\u007fdޅ\u001dT?ަ\u001d\u000f$,\u000fxqjb\u0012x\u0015IWɐU7Y̵UJT\u0015gGѐ\b\b"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ft,W\u0006|", "", "/bc6b5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ba;R\u00010\u001d", "F", "", "G", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ'%G|\u0012E\u0006%BU{/;w\u001fwUM:k;g\u0004rq7\n?*]z1P\"/\r C", "5dc\u000eV;B]\"", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`'Uo\u001b@\u007f45fy\u001eFq 7\u0017KEj4%^WkI\u0005f\bL\u0006+QU$", "5dc%", "u(5", "5dc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TouchEvent {
    private final TouchAction action;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f2844x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f2845y;

    public TouchEvent(TouchAction action, float f2, float f3) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        this.f2844x = f2;
        this.f2845y = f3;
    }

    public static /* synthetic */ TouchEvent copy$default(TouchEvent touchEvent, TouchAction touchAction, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            touchAction = touchEvent.action;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f2 = touchEvent.f2844x;
        }
        if ((i2 & 4) != 0) {
            f3 = touchEvent.f2845y;
        }
        return touchEvent.copy(touchAction, f2, f3);
    }

    public final TouchAction component1() {
        return this.action;
    }

    public final float component2() {
        return this.f2844x;
    }

    public final float component3() {
        return this.f2845y;
    }

    public final TouchEvent copy(TouchAction action, float f2, float f3) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new TouchEvent(action, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchEvent)) {
            return false;
        }
        TouchEvent touchEvent = (TouchEvent) obj;
        return this.action == touchEvent.action && Float.compare(this.f2844x, touchEvent.f2844x) == 0 && Float.compare(this.f2845y, touchEvent.f2845y) == 0;
    }

    public final TouchAction getAction() {
        return this.action;
    }

    public final float getX() {
        return this.f2844x;
    }

    public final float getY() {
        return this.f2845y;
    }

    public int hashCode() {
        return (((this.action.hashCode() * 31) + Float.hashCode(this.f2844x)) * 31) + Float.hashCode(this.f2845y);
    }

    public String toString() {
        return "TouchEvent(action=" + this.action + ", x=" + this.f2844x + ", y=" + this.f2845y + ')';
    }
}
