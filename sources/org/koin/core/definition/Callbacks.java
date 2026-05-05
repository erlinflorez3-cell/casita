package org.koin.core.definition;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\r\"4\u0012\u000e\u0007nj?4LeV7ZS0\u000fs{B*cҕyCIa\"Ԃ(ޢUdʴ\u0010pPҙ\u0019B?\u0006Dx+UYw~] \u0010J^\u007fCCO\u0006<oś\u00058\u0015 `%Nx3\u0003\u00032X\u0012\u0007zyŷ\"\u0011\u000fD¤>R\u001bRM= \u000eV<\u0011\"lid5~Ǎm<?#1lXMUa\u0019\u0005]\u000fVT]˙\r`|/\u0007́6]Xa\f\u001fXkA\u0013?(ܵ3ؒWI1I\u0002XNt\u0010\u0018%-e\f\u0014ö6^\u0015Q\u000f\u000f=*}e4X\u001e*\bz2ȞR\u0003l\nmϥ-u+t\u0012&3#}\u0004F^\u000evD\u0016y\u00106]Բ\u0001{2G(~Q\u0010I_آ6D\f\u001b-;\u0001\u001d1\"ہ\r1@)U\u0010mAUP?^M@ԯMo\u0014p\u0011\u0005@\u0003^Ih7\f\u0013>\u0017[ڛq8\u0002%Ƞ\u0006NLϙ\u000f\u0007fnapʖLQ"}, d2 = {"\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9k8},2U{&EC", "\"", "", "=m29b:>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001ana4\"2HW\"Hxh9|R.e\u0001,\u0005D\u0010\u001b!P9wET,?g}}3t\u001d+IAAA", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u001ca\nE]'~", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Callbacks<T> {
    private final Function1<T, Unit> onClose;

    public Callbacks() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Callbacks(Function1<? super T, Unit> function1) {
        this.onClose = function1;
    }

    public /* synthetic */ Callbacks(Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Callbacks copy$default(Callbacks callbacks, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            function1 = callbacks.onClose;
        }
        return callbacks.copy(function1);
    }

    public final Function1<T, Unit> component1() {
        return this.onClose;
    }

    public final Callbacks<T> copy(Function1<? super T, Unit> function1) {
        return new Callbacks<>(function1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Callbacks) && Intrinsics.areEqual(this.onClose, ((Callbacks) obj).onClose);
    }

    public final Function1<T, Unit> getOnClose() {
        return this.onClose;
    }

    public int hashCode() {
        Function1<T, Unit> function1 = this.onClose;
        if (function1 == null) {
            return 0;
        }
        return function1.hashCode();
    }

    public String toString() {
        return "Callbacks(onClose=" + this.onClose + ')';
    }
}
