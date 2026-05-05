package androidx.core.util;

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
/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0007Wي`\u000b\\A7#-\u0014zGkp9ӧHeV.ʈW."}, d2 = {"\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eUE", "", "u(E", "\u001en^9", "!h\\=_,)]#\u0006", "!x]0[9H\\\u001d\u0014z]\u0017\u0007\u00136", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Pools {

    /* JADX INFO: compiled from: Pools.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&˛\bDRш|\u0004G\u00078\u000b<K\u0007\"2\u0013}k|ʑa6J͜V-zSX\u000f\u001c{b$$1\u007fDSW0|Xޛ\u0016r˗knX\\SV\u001d\t.x\u00190yY\u0007b*\u000fhԏ6cݯQoK?ǔsȂӏ 6*:\u007f$/\u0019ݻL\u0017\u038d~B"}, d2 = {"\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.xF\u0001,\u000b", "\"", "", "/b`B\\9>", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@d[2T:>", "", "7mbAT5<S", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Pool<T> {
        T acquire();

        boolean release(T t2);
    }

    private Pools() {
    }

    /* JADX INFO: compiled from: Pools.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&˛\bDRш|\u0004W\u00068é6B\r(4\u0012}\u0007njG?LeN1ZS8\u0018s{:&a8\bّc[ Ԃ0\bwN\u0016g\u001fPj\rS\u000fL\u0015'klVe~c\u0011\u001d4Zom6ޜs=Gd=C\u0013)J$Nx;Џ`>Н\u0014v\tM\u0014\u001f ;Xph^=Q\u0013'*\u0006tĨG\u001e֔kNDV5pH>;\u0003\u0018N~+m=\u0015MCϿ\u001b;˼za,9\u0011MC\u001a=[\u0013\u000bb]U\u0002mqk\u000b?Ѫ)ȅMu_6f\u0007d!9W%]!)3ӧ]ԃ\u0010'3ՒӓO`"}, d2 = {"\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{@~0<Yh*Atk", "\"", "", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.xF\u0001,\u000b", ";`g\u001db6EA\u001d\u0014z", "", "uH\u0018#", ">n^9", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", ">n^9F0SS", "/b`B\\9>", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7r8;C6HZ", "", "7mbAT5<S", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "@d[2T:>", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] pool;
        private int poolSize;

        public SimplePool(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.pool = new Object[i2];
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i2 = this.poolSize;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            T t2 = (T) this.pool[i3];
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i3] = null;
            this.poolSize--;
            return t2;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            if (isInPool(instance)) {
                throw new IllegalStateException("Already in the pool!".toString());
            }
            int i2 = this.poolSize;
            Object[] objArr = this.pool;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = instance;
            this.poolSize = i2 + 1;
            return true;
        }

        private final boolean isInPool(T t2) {
            int i2 = this.poolSize;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.pool[i3] == t2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: Pools.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&˛\bDRш|\u0004W\u00068é6B\r(4\u0012}\nnjG9LeN/Xg@ş\u0014\u0002:ři#\u001aCiUJ\u00042\u000b_N.f\u001dK\u001b\u0016S\u0013\u0014\u0018\u0011jZLǤ|] \u0013zO}EKO\u0006<oś;Jӯ$20?B\u0018\u000f\"BH>\u007f+GY\u0016*0v\u0081\u0001fҫQ\u0005(\u001dVJ.\u00066\\\u0016N\rԢnҺ>/+ɅݬFZ"}, d2 = {"\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{P\u007f#8f\b);\u0003\u0016-8MEr\n", "\"", "", "\u001a`]1e6BR,Hxh9|R?t\u0004/E+\u000b!\u001eU.{@~0<Yh*Atk", ";`g\u001db6EA\u001d\u0014z", "", "uH\u0018#", ":nR8", "/b`B\\9>", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@d[2T:>", "", "7mbAT5<S", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object lock;

        public SynchronizedPool(int i2) {
            super(i2);
            this.lock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t2;
            synchronized (this.lock) {
                t2 = (T) super.acquire();
            }
            return t2;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T instance) {
            boolean zRelease;
            Intrinsics.checkNotNullParameter(instance, "instance");
            synchronized (this.lock) {
                zRelease = super.release(instance);
            }
            return zRelease;
        }
    }
}
