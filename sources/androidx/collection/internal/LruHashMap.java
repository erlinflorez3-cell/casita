package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LruHashMap.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&˛\bDRш|\u0004G\b8\u000b<H\u0007Ӭ4\u0012\u0006\fnj?0LeVNZS83s{:%c$\u007fLCU }*\teNog\u0005Jb\u000bI\u0015\fǝ\u000f̓TO[ތk\u001172pog9SnK:\ttd\u0005P2P8: \u0007.:Z\u001ex\u0013Q[\u0010\u0018/Pppĥ\u001dO\u0015\u001aH\u0005lĨӘ\"\\uQv_|c@/1\u0007\u0002B|,o6\u0003M\u001bLl';}Ґ\"+N?}+3g\u001b\thZu\u0002ouK\u001a\u0001']Ǣ\u0010֜W͏\\\u007f\"+sj\u001bt\u000b(r\u0004\b_<+9d{K\u0007ʫX{\t\u0014%<:\rΝ+H<Fby\u0016(Kv\tRvO2bP\u0015\u0013alЍӾ\u000439Ok\b_jS+^E\f\u0011\u001d 3\u0001%ďkV\u001e`K\u001a\u0003\u0003\u007f;\b\u0005ףLR\"[Cy\u0012}3\u00118\u0012HG.>2Uѧ\u001b)O]?1/{RpRx\u000f!pjci\t̲P$~\u0016m)7\u001eCPt\u0007{P\u000bА<\u0013]\u001c\u000b\u0006\\\u001bi\u0601^ʟ@!-ī˃S\u0004"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\u0005 &G|\u00178}n\u001cf\u000e\u00033{\u0019\u0016IN\u0011", "\u0019", "", "$", "=qX4\\5:Z", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u001b Vo\u001bEr,~@\u000b0\u001ai$15?FAw\u000f", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", ":nP19(<b#\f", "", "uH5uI", "3mc?\\,L", "", "", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euj\t>;", "7r4:c;R", "", "u(I", ";`_", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCh\u0013\"\u001d", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u0005 \u001dGnp8\u0005(\u001dU\tu", "5dc", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", ">tc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "@d\\<i,", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LruHashMap<K, V> {
    private final LinkedHashMap<K, V> map;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    public LruHashMap(int i2, float f2) {
        this.map = new LinkedHashMap<>(i2, f2, true);
    }

    public /* synthetic */ LruHashMap(int i2, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i3) != 0 ? 16 : i2, (i3 & 2) != 0 ? 0.75f : f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(LruHashMap<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        Intrinsics.checkNotNullParameter(original, "original");
        for (Map.Entry<? extends K, V> entry : original.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> setEntrySet = this.map.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final V get(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    public final V put(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.map.put(key, value);
    }

    public final V remove(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.remove(key);
    }
}
