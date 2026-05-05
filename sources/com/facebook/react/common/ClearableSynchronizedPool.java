package com.facebook.react.common;

import androidx.core.util.Pools;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDRш|\u0004W\u00068é6B\r(4\u0012}\u0007njG?LeN1ZS8\u000fsڔ<$i-yCAV0ԂJ\u000fUȞuf\u0017J\t\u000bs\u0015\u0016\u0018\tjrH\u0004y\u001e\u001d\u001f6PqW3{rެ=`\u0003:M-@+P{\u001b\u007fPݒ\u000f$ͯ~CY\u0016Z4N{RR;YM- \u0013V /,\rk\\E`l\u0014Žu7ɨmB\\70F\u000bR%Nd+\u001dxw\u001dY@e;kǯUΫ\u000bTc?\u0011FBI\u0013p?'YLJɑBݼ\u0004\u0014\u001dۀ̦\u0011n"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E>\u000b\u001f\u001fQxW\u001a}%1fy\u001d>m\u0004BVA>x>'\u0019}a8qm6UL", "\"", "", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.xF\u0001,\u000b", ";`g \\A>", "", "uH\u0018#", ">n^9", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "Ahi2", "/b`B\\9>", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1kT.e", "", "@d[2T:>", "", "7mbAT5<S", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ClearableSynchronizedPool<T> implements Pools.Pool<T> {
    private final Object[] pool;
    private int size;

    public ClearableSynchronizedPool(int i2) {
        this.pool = new Object[i2];
    }

    @Override // androidx.core.util.Pools.Pool
    public synchronized T acquire() {
        int i2 = this.size;
        if (i2 == 0) {
            return null;
        }
        int i3 = i2 - 1;
        this.size = i3;
        T t2 = (T) this.pool[i3];
        Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.pool[i3] = null;
        return t2;
    }

    public final synchronized void clear() {
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            this.pool[i3] = null;
        }
        this.size = 0;
    }

    @Override // androidx.core.util.Pools.Pool
    public synchronized boolean release(T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int i2 = this.size;
        Object[] objArr = this.pool;
        if (i2 == objArr.length) {
            return false;
        }
        objArr[i2] = instance;
        this.size = i2 + 1;
        return true;
    }
}
