package androidx.compose.animation.core;

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
/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLc\u0003İI\u00066\u00146B\r\"4ߚ\u007f\u0007|jA0JgN.hݷZ\u0017{\u007fD&q# CiTZ\u0001̀\rO\\h0\nXe#C=\u0012F\u0005x9a]\ta\"\u0011HA\u001e?a[6K˃dt<\u0014h=0H\u0012\u0005/&pVǘzzI\\\\8>C\t<h\f{\u0005J\u0018\u0014@8\u00034[\u0016Nl\u001d+,\u0011Ǚ/ɨmLf)e4\u000bR-HZ-\u001b}2D9HO7+$\u0002\u00037XiA\u001bA\b<3h]{i\u0018JɥBݼ\u0004\u001e--U\u0016kwF^\u000b[n\u0013˕/a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000bDm'.VR\u001b~7\u001a%vp=\u0018c\u001eQv06YJ5jV\u0002A\u001e\u001bH\u001dJ:\rZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\f$dp9\\", "", "u(E", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "1ta?X5MA(z\n^", "5dc\u0010h9KS\"\u000ehm(\f\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0010h9KS\"\u000ehm(\f\tma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "B`a4X;,b\u0015\u000ez", "5dc!T9@S(l\nZ;|", "Adc!T9@S(l\nZ;|G+n\u00040wO\u0005! Am\u0018Iv\u001fBY\u0005 3{\u0016", "BqP;f0MW#\bXh5}\r1u\r(z", "", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "BqP;f0MW#\bXh5}\r1u\r(z~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "BqP;f0MW#\bg^4\u0007\u001a/d", "BqP;f0MW#\bg^4\u0007\u001a/d>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PreventExhaustiveWhenTransitionState extends TransitionState<Object> {
    @Override // androidx.compose.animation.core.TransitionState
    public Object getCurrentState() {
        return null;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public Object getTargetState() {
        return null;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(Object obj) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(Object obj) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(Transition<Object> transition) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
    }

    public PreventExhaustiveWhenTransitionState() {
        super(null);
    }
}
