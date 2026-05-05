package com.facebook.react.interfaces.fabric;

import com.facebook.react.bridge.NativeMap;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4B\u0007\":\u001e\u007f\u0007lkA0RkP.XT2\u000fy{<$a)yCIZ\"}(\u000bWN}gvJ`\rIt\u001cǝ)jZH\u001e7k\u001d'2p{o7[|U9\u000f|f\t.@:8(\r1\u001e8W(v)K{\u0010 @XphZ=Q\u0013+*\u0006l!1\"jyf6vm\u000e>=6\u001bipbm\u0004x\u000b[\"^TU\u0019'e,AX7c\u0016kwK\u0015`rW\u0003m}m\tv??+w\r\u001eZ!\u000e\"/CO;i#*j\fi`:/qs,Q^)@w)\bS`L\u0014\u0014C`.[&-,^C\u0003rk@~\u00035۴\u0002ѐe:/'\u000639;kv_dS\u0019|;R̃\u000f̷'\u0005\u0007#aY\u001cfe+b~i1\u007fH\u0014˗P̆]A\u0006\u0006vk\u00104̯/ϚČ/\u007f\u00190\u001dDeZަ'>Ⱦ\u0006G"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Zy\u001dDq\u0014w;SHl0\u001c\u0015K]B\u0006j,[L", "", "7rABa5B\\\u001b", "", "u(I", ";nSB_,'O!~", "", "5dc\u001ab+NZ\u0019gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ata3T*>7\u0018", "", "5dc h9?O\u0017~^]", "u(8", "Adc\u0019T@Hc(\\\u0005g:\f\u0016+i\t7\n", "", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "=eU@X;1", "=eU@X;2", "2n;2Y;\u001a\\\u0018k~`/\fvAa\u000b\f\u0005-o}", "7rA!?", ">hg2_\u000b>\\'\u0003\nr", "", "Adc\u001ab<Gb\u0015{\u0002^", ";nd;g(;Z\u0019", "Adc\u001de6Ia", ">q^=f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\b3xk", "Adc h9?O\u0017~^]", "AsP?g", "As^=", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface SurfaceHandler {
    String getModuleName();

    int getSurfaceId();

    boolean isRunning();

    void setLayoutConstraints(int i2, int i3, int i4, int i5, boolean z2, boolean z3, float f2);

    void setMountable(boolean z2);

    void setProps(NativeMap nativeMap);

    void setSurfaceId(int i2);

    void start();

    void stop();
}
