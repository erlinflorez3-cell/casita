package androidx.room.util;

import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: RelationUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,i\bӵLc\u0003İI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007tsAӄLe^.Zݷ2\u000f\u0002{<$q$yّCU0}*ޛg\u001fu˧\u0007J\t\nc\u0015\fǝ\u0007jTI\u0004y}\u0014\u00151PqoC[rUEpvF\u0005f22:\n\u0005G\u001cXL@z\tHc\f@6p\rHY%e\u0015(\"\u0012N\"\u0011\u001e#g^8Xl$<]'\u0013kRNU^^\u0005e}T]?\r%`>1FʺC\u0015MS1\br]E\u0002Msm%v*?GYug6\u001f\u007f$\u0017;OS_!0E\u0011ab\u001c'qOsM`\u000enyY\u0007=@\u0012\u0013\u001e'v4]Ft\u000f&[\u0005\u0011c\\`\u0004nBFzq8'%F5YC\u0004racK\u0019\u00157\f\u0007\u001d\u001ei\u0003M,kV\u001e`C\u001a\u0003\u007fik_LUH|\ty?sՎ~d24\u00123_\u0006?}!.]'ehi'/p\u001aHrm'\u001bnok{bPP(~\u0018G*O\u000e\tQt\u0007{P\u0003WZ\u0019ܜ b"}, d2 = {"@dRBe:Bd\u0019_zm*\u007fd<r{<c<\f", "", "\u0019", "", "$", ";`_", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004u8\u0002z", "7rA2_(MW#\bXh3\u0004\t-t\u00042\u0005", "", "4dc0[\tE]\u0017\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@dRBe:Bd\u0019_zm*\u007fk+s\u0003\u0010wK", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "@dRBe:Bd\u0019_zm*\u007fo9n\u0002\u0016\u0007<\u000e%\u0017#|\u001b8\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u00198\u0004355\u000b-3\u0002k", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RelationUtil {
    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z2, Function1<? super HashMap<K, V>, Unit> fetchBlock) {
        int i2;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i2 = 0;
            for (K key : map.keySet()) {
                if (z2) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, map.get(key));
                } else {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, null);
                }
                i2++;
                if (i2 == 999) {
                    fetchBlock.invoke(map2);
                    if (!z2) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i2 > 0) {
            fetchBlock.invoke(map2);
            if (z2) {
                return;
            }
            map.putAll(map2);
        }
    }

    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> map, boolean z2, Function1<? super LongSparseArray<V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        LongSparseArray<? extends V> longSparseArray = new LongSparseArray<>(999);
        int size = map.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (z2) {
                longSparseArray.put(map.keyAt(i2), map.valueAt(i2));
            } else {
                longSparseArray.put(map.keyAt(i2), null);
            }
            i2++;
            i3++;
            if (i3 == 999) {
                fetchBlock.invoke(longSparseArray);
                if (!z2) {
                    map.putAll(longSparseArray);
                }
                longSparseArray.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            fetchBlock.invoke(longSparseArray);
            if (z2) {
                return;
            }
            map.putAll(longSparseArray);
        }
    }

    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> map, boolean z2, Function1<? super ArrayMap<K, V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        ArrayMap arrayMap = new ArrayMap(999);
        int size = map.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (z2) {
                arrayMap.put(map.keyAt(i2), map.valueAt(i2));
            } else {
                arrayMap.put(map.keyAt(i2), null);
            }
            i2++;
            i3++;
            if (i3 == 999) {
                fetchBlock.invoke(arrayMap);
                if (!z2) {
                    map.putAll((Map) arrayMap);
                }
                arrayMap.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            fetchBlock.invoke(arrayMap);
            if (z2) {
                return;
            }
            map.putAll((Map) arrayMap);
        }
    }
}
