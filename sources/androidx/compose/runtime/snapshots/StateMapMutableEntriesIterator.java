package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
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
/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>26B\rG4ߚ\u007f\u0007|jAӄLeVTZS83s{:%a$\bّcW Ԃ0\bwPmf|J\u000b\u0017S\u0011\u0016\u0016?i<Kex$\u0012=3r\u0002OA]{M;pt|\u00040428@\u0005/\u001dXJP(\u000bSY\u0010*<PrJRC˟\u0015\u001c\"\u0006t\u001f/#l}\\<`~mH?/\u0013kRN]ڿ@~]\r|SU\u0015%hӿ/@E>]8a\r\u001f^kA\u0013?(ܵ\u0015j7'aH\"Z|ݰ\u007fЕ\u00196"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;S0)|xp5\u0004j,.\u007f6TPN:@arJ\u0010!d\u001b$", "\u0019", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;S0)|xp5\u0004j,2\u0006'TH]6i(", "", "", ";`_", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007K(YL", "7sT?T;H`", "", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($Vp5\u0016c\u0014J\u0002|.QJ=X\u001c\u0003L\u0018\u0019$q]+\u001a\u0001hK1D\b(", "<dgA", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    public StateMapMutableEntriesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        advance();
        if (getCurrent() != null) {
            return new AnonymousClass1(this);
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotStateMap.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000f\u001d̉=!,\u000f\bDJl\u001d\u0003ǻ\f8!Ǟr\u000b2.\"w=߿z;@D\u001cG\\Q\u001c=\u001dq\u00144ZZTuQCm\u001a4!OcɁkg|S+\u001fQ\u000f\u001e\u0016/̓\u0003ֆWޯa\u001a\u00172PrW5SpK;1\u000fD\t82X7Pڥ\rʀ.V\u0018v\tFc\u000e\u00185NrZT\u0013S\u0013!Ű\nH"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\r8\u0005O\u0005\u001f\u0017\u0011}\u00178\u000238c\r.\u0001[%*\\C#g?\u0006%w]6\u000ec\fW\u00064KL\\\u0010kR\u007f9#\u001cgLW+ \u0014\u0018\r", "", "9dh", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "D`[BX", "5dc#T3NS", "Adc#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Map.Entry<K, V>, KMutableMap.Entry {
        private final K key;
        final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
        private V value;

        AnonymousClass1(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
            this.this$0 = stateMapMutableEntriesIterator;
            Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
            Intrinsics.checkNotNull(current);
            this.key = current.getKey();
            Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
            Intrinsics.checkNotNull(current2);
            this.value = current2.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public void setValue(V v2) {
            this.value = v2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
            StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator2 = stateMapMutableEntriesIterator;
            if (stateMapMutableEntriesIterator2.getMap().getModification$runtime_release() == ((StateMapMutableIterator) stateMapMutableEntriesIterator2).modification) {
                V v3 = (V) getValue();
                stateMapMutableEntriesIterator.getMap().put(getKey(), v2);
                setValue((Object) v2);
                return v3;
            }
            throw new ConcurrentModificationException();
        }
    }
}
