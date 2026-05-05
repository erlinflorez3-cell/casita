package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\rB4\u0012\u0006\u0013nj?2LeV7Zݷ2\u000fy\u001e<$a%yCIZ\"Ԃ*\t]To˧vJh\u0012K\u000f\f\u0018\u000f̓\\I\u0004w\u001e/\u0015˰RsM3eok:p\u0001D\u00078:2:\n\u0005/\u001e@G>yټGK\u001a\u0017xN~@j\r{\tJ\u0016\u0014E8\u0001L`.N~WzeR/Q\f\u001aF\\.w0+QSІTo\u001f\u0005k69P9E\u0015SW\u0013\u000bb]U\u0002mpk\u00101;57as\u0006?\t\u0004\"\u001cCO;a#*j\u0012i`:0scqYh\u000eV\u0007+\u007f\u001bC\u001c\u000e4+x2;'~\b<B=\u0007aPh\u0002\rS0~o=/%.7[=)siai*\u0017K\n\u0017%\u001eQ\u0014\u001f%i[&`C\u001f\u0005{_>i@k[\u0017$gQ\u0006\u0006\u0007a0.44U\u0007G{?2G-=[G09m\u0018Grk?+n}kqbJP\"\u001d\u001aM)7\u000f\u000bHr\f\u0004P\u0003\\\\\u001fS\u001cb\u001d\u0016\u0010#\"lwj%;\u000f|R9}xOu\u001251v7\br\u0002\r\u0006<5ګ7Ʉg\u0010i\u05ecG M<z\u0005\u0007g\u0019Ͱ\u000eȺ`(*õʴn'"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EH\u0005\u0019$C~\u0012F\u007f3~G\u0001\u001cDm\u0015\u0019ZC<kA\u001e\u001efaGwg,`L", "", ">qT3f", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "9dh X;", "", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0016~<\u000e\u0017\u00162|\u000e=v25b{ EC|3IT75D-\u0019o+'\u0007r\u0002\u0012g", "1gT0^\u0012>g", "9dh", "1n]AT0Ga", "", "5dc\u000e_3", "", "5dc\u000fb6ES\u0015\b", "2dU#T3NS", "5dc\u0013_6:b", "", "5dc\u0016a;", "", "5dc\u0019b5@", "", "5dc g9B\\\u001b", "5dc g9B\\\u001blzm", "2dU#T3NS'", "2`c.f;H`\u0019x\b^3|\u0005=e"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences prefs, Set<String> set) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    public final boolean contains(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.contains(checkKey(key));
    }

    public final boolean getBoolean(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getBoolean(checkKey(key), z2);
    }

    public final float getFloat(String key, float f2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getFloat(checkKey(key), f2);
    }

    public final int getInt(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getInt(checkKey(key), i2);
    }

    public final long getLong(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getLong(checkKey(key), j2);
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    public final String getString(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.prefs.getString(checkKey(key), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final Set<String> getStringSet(String key, Set<String> set) {
        Intrinsics.checkNotNullParameter(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(checkKey(key), set);
        if (stringSet == null) {
            return null;
        }
        return CollectionsKt.toMutableSet(stringSet);
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.prefs.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set == null ? true : set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.toSet((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Can't access key outside migration: ", str).toString());
    }
}
