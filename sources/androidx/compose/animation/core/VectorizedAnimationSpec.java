package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&˛\bDZc|\u0004Oي8é6B\r+4\u0012}\u0007njG7LeN7X8@ş\u0014\u0002:ři#\u001aCiUJ}P\n\u0018qul\u0007J\t\u0011s\u0013\u0014\u001d\u0011jbկ\u0006|k\u001a'2xģo7[xU9\u0017Қ|)ڶ6\"F\u0004M$(5`\u0010-ٙsO\u001a\u0019H@'í\u0003\u0011[\r2\u0012<̄P\u0005,e\u007fNlԟ3qƠ3#\u0011u\u000by5lH|\u0004εvX5\u001b\u000faL1p;C\u001c=S9ޗ\u0003_M\u000bWqsݛ\u0019+54as\u000e̬\u001f$Џ\u0019+]\u001c&\u001e4l\u001dQ\u0017ϯW/]qcP<.(~\n\u0014T\u0004DͺWL<52f>Ԅcx\u0001\\XP8މ\t$ѐe6%4PC9;3f\u007fd\u0012ϱPѼ\u007f\t% )\u0003|%ǵSו֮\u0015\u001f\\yWP\u007f?שL_̤]>"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "", "7r8;Y0GW(~", "", "u(I", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b0", "5dc\u0012a+/S \txb;\u0011", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b2w\u0001\u0011?bx*\bv\u0002>2An\u0013K1\u0014Gb\u0001\u0011;`K0o4F ?\u0015?~pF\nw#k\u0011~b3@#r;", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO6oSK~4t\u000fbs\u001b1e~/s@M24>o\u000fYga:g|\u001d(kE1/\u007f:\u001dLK-QuB\u0016d.e\u0012\u0017S5/(or9", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface VectorizedAnimationSpec<V extends AnimationVector> {
    long getDurationNanos(V v2, V v3, V v4);

    V getValueFromNanos(long j2, V v2, V v3, V v4);

    V getVelocityFromNanos(long j2, V v2, V v3, V v4);

    boolean isInfinite();

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v2, V v3, V v4) {
            return (V) VectorizedAnimationSpec.super.getEndVelocity(v2, v3, v4);
        }
    }

    default V getEndVelocity(V v2, V v3, V v4) {
        return (V) getVelocityFromNanos(getDurationNanos(v2, v3, v4), v2, v3, v4);
    }
}
