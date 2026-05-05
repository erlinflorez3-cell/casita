package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0006DLc\u0003İIي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0Jf^\u008czU0şyz\\&a#\u007fCkUH~Z\tVV(~~Zh\r[\u001b\u0016\u0018\tjbկezm\u0012E1prУ7M}A\u0002p\u0003;\u001d,B$Hy;Џ*,X\u0010-yqQ\\*>B\tFb\u000f]\u0005PŇ\u0016@0\u0001T[\u0016Q\rԢnҺ>/+ɅݬFW"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qv\u000bPZY,Za|Ji", "\u0019", "$", "", "1nd;g0GUu\u0003\nf(\bf+c\u0003(", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qv|", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@#1W\u0001 \u0001K >VR?t6\u0006\u0015pkF\u001bA(Ly'\u001d\u0010?", "2t\\=6(<V\u0019\\\u0005g;|\u0012>", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qv\u000bPZY,Za|JRpj\u0016Y\u000f\u0016\u0006c\u0017", "\u0012t\\=<5?]", "\u0012t\\=<5?]x\b\nk@", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CountingMemoryCacheInspector<K, V> {
    private final CountingMemoryCache<K, V> countingBitmapCache;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0006DLc\u0003İIي8\u000b<H\u0007\"2\u0012\u007f\u0007|jA0JeP.`r2\u000f\u0002{<$a&yCIx\"}8\tWNmgvJh\u000bKƤ\u001cǝ!l2Icw\u0006\u0014\u00153Poo3{p}TpxD\u000782P;\n\t\u000f\u001eBH>y\u000bGY\u0011*0nvĐV\r[\fb\u0016\u0014P8\u0001Lo8nDP\u0005oJ=3\u000fyD^'\u00160\rO\u001dF\u000b(;\u0001\u0010'aD\u000eߖ\u0017ȏW\u0003\u000fѸ,M\u0011C\n=3k]+\u0002ɦuɱ:X\bϬe9]\u0018urT_;U7Ϸ)˦ScSִ^6\u0006\u0007\u0014\rj\u0007D\n}Φ0ǉ\u001ef\u0010Ԅ\u0004\u0003\u0001`XP0ax\u0004Qʰ8а)\u007f;ٿ\n5t_yG)PG{3\u001d.%\u0011nO\\\u0003\u001d\u0017\u0019qƠyΦ5QH׀\u0019n\u0018jU\u007f\u0014~r\u000e:\u0006@G6/\f\u0013>\u0017[8\nCQ*\"\u0006\u001fֻiЛ\t`pׅ:`VB:nD:`\rbɶF\u0081\tkXӹй0%"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qv\u000bPZY,Za|JRpj\u0016Y\u000f\u0016\u0006c\u0017", "\u0019", "$", "", "Ahi2", "", ":qd \\A>", ">`a.`:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u001fm\u001e8ZW\u0019g2!\u0015S]F\u0003k:$", "uH8\u0019V6F\u001d\u001azx^)\u0007\u00135/\u00040wB\u0001\"\u001bRo\u0015@\u007f%~Wy\u001e:m_\u0016MKExH{\u0011fd9q_9J~5\u001d\u0010?", ":qd\u0012a;KW\u0019\r", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qv\u000bPZY,Za|JRpj\u0016Y\u000f\u0016\u0006c!-}QKt", ";`g\u0012a;KW\u0019\rXh<\u0006\u0018", ";`g\u0012a;Kg\u0007\u0003\u0010^", ";`g \\A>", "=sW2e\fGb&\u0003zl", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "AgP?X+\u001e\\(\f~^:", "@d[2T:>", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DumpInfo<K, V> {
        public final List<DumpInfoEntry<K, V>> lruEntries;
        public final int lruSize;
        public final int maxEntriesCount;
        public final int maxEntrySize;
        public final int maxSize;
        public final Map<Bitmap, Object> otherEntries;
        public final List<DumpInfoEntry<K, V>> sharedEntries;
        public final int size;

        public DumpInfo(int i2, int i3, MemoryCacheParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.maxSize = params.maxCacheSize;
            this.maxEntriesCount = params.maxCacheEntries;
            this.maxEntrySize = params.maxCacheEntrySize;
            this.size = i2;
            this.lruSize = i3;
            this.lruEntries = new ArrayList();
            this.sharedEntries = new ArrayList();
            this.otherEntries = new HashMap();
        }

        public final void release() {
            Iterator<DumpInfoEntry<K, V>> it = this.lruEntries.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            Iterator<DumpInfoEntry<K, V>> it2 = this.sharedEntries.iterator();
            while (it2.hasNext()) {
                it2.next().release();
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0006DLc\u0003İI\u00066\u000b6B\u0015\"4\u0012}\tnjG0L͜^\u008czU0\u000fyz\\&a%\u007fCkUH~b$_Rui\u0007J\u0011\u000bS\u001b\u0014\u0019\u0011r<Kex\u0014\u0013%1psУ7M}B\u0002d\u0003>\u001d `+\t\n\u0013\u00032*~\u0010-~\u001aſ\u000eܘ4Bx:`\u0013\u001e\u001b(\u0019\u001eF0\u0003.\\\u001eOLG\u001bap3yɍkŌR'gܞƐQ\u0017"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t!3\\}i\u0015w&7\\GDm\u001c\u001e\u001drnMd_*Qv\u000bPZY,Za|JRpj\u0016Y\u000f\u0016\u0006c!-}QKt", "\u0019", "$", "", "9dh", "D`[BX\u0019>T", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b>\u000b\u001f`Hk\f<s/?_G\u001eAu\u001e8V\rHk5\u001e\"hj7\u0007qu,}1ULJ)cR_=\u0015\u0012g\u000eW)\rZ\u001d2", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "D`[BX", "@d[2T:>", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DumpInfoEntry<K, V> {
        public final K key;
        public final CloseableReference<V> value;

        public DumpInfoEntry(K k2, CloseableReference<V> closeableReference) {
            if (k2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.key = k2;
            this.value = CloseableReference.cloneOrNull(closeableReference);
        }

        public final void release() {
            CloseableReference.closeSafely((CloseableReference<?>) this.value);
        }
    }

    public CountingMemoryCacheInspector(CountingMemoryCache<K, V> countingBitmapCache) {
        Intrinsics.checkNotNullParameter(countingBitmapCache, "countingBitmapCache");
        this.countingBitmapCache = countingBitmapCache;
    }

    public final DumpInfo<K, V> dumpCacheContent() {
        synchronized (this.countingBitmapCache) {
            int sizeInBytes = this.countingBitmapCache.getSizeInBytes();
            int evictionQueueSizeInBytes = this.countingBitmapCache.getEvictionQueueSizeInBytes();
            MemoryCacheParams memoryCacheParams = this.countingBitmapCache.getMemoryCacheParams();
            Intrinsics.checkNotNullExpressionValue(memoryCacheParams, "countingBitmapCache.memoryCacheParams");
            DumpInfo<K, V> dumpInfo = new DumpInfo<>(sizeInBytes, evictionQueueSizeInBytes, memoryCacheParams);
            CountingLruMap<K, CountingMemoryCache.Entry<K, V>> cachedEntries = this.countingBitmapCache.getCachedEntries();
            if (cachedEntries == null) {
                return dumpInfo;
            }
            Intrinsics.checkNotNullExpressionValue(cachedEntries, "countingBitmapCache.cach…ntries ?: return dumpInfo");
            ArrayList<Map.Entry<K, CountingMemoryCache.Entry<K, V>>> matchingEntries = cachedEntries.getMatchingEntries(null);
            Intrinsics.checkNotNullExpressionValue(matchingEntries, "maybeCachedEntries.getMatchingEntries(null)");
            Iterator<Map.Entry<K, CountingMemoryCache.Entry<K, V>>> it = matchingEntries.iterator();
            while (it.hasNext()) {
                CountingMemoryCache.Entry<K, V> value = it.next().getValue();
                DumpInfoEntry<K, V> dumpInfoEntry = new DumpInfoEntry<>(value.key, value.valueRef);
                if (value.clientCount > 0) {
                    dumpInfo.sharedEntries.add(dumpInfoEntry);
                } else {
                    dumpInfo.lruEntries.add(dumpInfoEntry);
                }
            }
            Map<Bitmap, Object> otherEntries = this.countingBitmapCache.getOtherEntries();
            if (otherEntries != null) {
                for (Map.Entry<Bitmap, Object> entry : otherEntries.entrySet()) {
                    if (entry != null && !entry.getKey().isRecycled()) {
                        Map<Bitmap, Object> map = dumpInfo.otherEntries;
                        Bitmap key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                        Object value2 = entry.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "entry.value");
                        map.put(key, value2);
                    }
                }
            }
            return dumpInfo;
        }
    }
}
