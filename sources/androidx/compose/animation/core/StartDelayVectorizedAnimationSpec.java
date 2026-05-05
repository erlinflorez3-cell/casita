package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
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
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0007\":\u0019\u007f\u0007ljA0RnP.XX2\u000fyڔ<$a,yCI[\"Ԃ(\neȞ\u0010mtϺh\nk\u000f4\u0016)p<Kex$\u0011=3\u0003\tO=[qU?pvF\u0005V݅P9\n\t\u000f\u001dBH>zټGK\u001a\u0017xQ~Gj\r{\fJ\u0018\u0014L8\u00034[\u0016]|Զl&]=3\u001bipRWc>\u000ee\r|ÖW\u0011\u0005s6+vʺe\u00193f\u001b\u0007\t¹\u0006\u0017ӭu=\u0013|oR9^\fWlݙ0\u0018#Ag\r\fvV`\u0013bx\f]˃\u007fgYb&(.\u07be,\u0011J\u0017&\u0006]ΞtAբj\b\u001cJ=\u001eaXh\u0002\u0015ۍ0~oL/%.7[=)wiaqϊ~;\n\u0017%\u001eYЧ\u001f%ig&`KÑ\u001b\fΦ5QNT\u0011T\u0018rUm2\u000b)\u0016z\u0016>M\u0018/*\u0018dk{ڲ]ޠ'%\u0004\u0004NJu~UovV\u0002RvḎr\u001c?ѧ!\u000e`Mr\u000f<ebZD\u0017]\u001ed\u00074ܱA!Ϣ{B)ط(PUswvܽa%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eFi#=,CBgH\u000f\u0015fpC\u0014gANu\u0003PPV(kV|F\u0002\u001dZ\f$", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "DdRAb9Bh\u0019}Vg0\u0005\u0005>i\n1iK\u0001\u0015", "AsP?g\u000b>Z\u0015\u0013cZ5\u0007\u0017", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dpqeA\u0003r0X\u007f\u0015RLL\u0002A\u0016c", "7r8;Y0GW(~", "", "u(I", "5dc g(Kbw~\u0002Z@e\u00058o\u000e", "u(9", "5dc#X*M]&\u0003\u0010^+X\u00123m{7\u007fJ\n\u0005\"Gm", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001^\u0016,\\MHoI\u001e\u0014Dj=\u000f_;R\u000105WN*2", "3pd._:", "=sW2e", "", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b0", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO6oSK~4t\u000fbs\u001b1e~/s@M24>o\u000fYga:g|\u001d(kE1/\u007f:\u001dLK-QuB\u0016d.e\u0012\u0017S5/(or9", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "6`b566=S", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class StartDelayVectorizedAnimationSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    private final long startDelayNanos;
    private final VectorizedAnimationSpec<V> vectorizedAnimationSpec;

    public StartDelayVectorizedAnimationSpec(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j2) {
        this.vectorizedAnimationSpec = vectorizedAnimationSpec;
        this.startDelayNanos = j2;
    }

    public final VectorizedAnimationSpec<V> getVectorizedAnimationSpec() {
        return this.vectorizedAnimationSpec;
    }

    public final long getStartDelayNanos() {
        return this.startDelayNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return this.vectorizedAnimationSpec.isInfinite();
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v2, V v3, V v4) {
        return this.vectorizedAnimationSpec.getDurationNanos(v2, v3, v4) + this.startDelayNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v2, V v3, V v4) {
        long j3 = this.startDelayNanos;
        return j2 < j3 ? v4 : (V) this.vectorizedAnimationSpec.getVelocityFromNanos(j2 - j3, v2, v3, v4);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v2, V v3, V v4) {
        long j3 = this.startDelayNanos;
        return j2 < j3 ? v2 : (V) this.vectorizedAnimationSpec.getValueFromNanos(j2 - j3, v2, v3, v4);
    }

    public int hashCode() {
        return (this.vectorizedAnimationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (StartDelayVectorizedAnimationSpec) obj;
        return startDelayVectorizedAnimationSpec.startDelayNanos == this.startDelayNanos && Intrinsics.areEqual(startDelayVectorizedAnimationSpec.vectorizedAnimationSpec, this.vectorizedAnimationSpec);
    }
}
