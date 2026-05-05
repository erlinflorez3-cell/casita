package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLш|\u0004O)8\u000bDB\u0007\":ߚ\u007fјnjG9LeN.ZS@\u000fs{:%c$\u007feC٥\"}0\tWNmqvJh\u0011K\u000f\f\u0018\u0001jBI]xc\u0012\u00172P~G3SuE9n\u0001>ӌ6݅R8(\u0004AC0Ϻ \r\u0001CY\f*@PvJV\u001dM\u000b\u001b@\bN\"\u0011\u001e\u000bj|7Xrc:='\u001bipSϮc0\u000bSU\\b2%\u0007q$;DG5\u001b&\u0002\u0005\u0017Tk?1B IK|o29V\fWdfFϬƦ/O\u0013l;*j\u0015i`:5sjq\\h\u000eV|\u001b}\u0013ɝ\u0012 61VAE v\n\u001e3;\u0005\u0002B\u0017س^\u000b\u0011\tuN\u0017S\u0005c1G0~Sw:GQ}\u07bd\u0005U)1\u0017\u0007!\nbT֫ڠ\u001fT}hysNU`P X\u0004\u007f$rḥ8\u0016`Q\u000eB\u0014\u0017>\u001957\"KQ#2ɌHזkv\u0013y1Ywl`@P\n\\Kr\u001c\u001av\\d3y\u0001\\f?)Q,T\r~6\u0015fφw\u000503-fO\u0017w\u001bQk(=/\u00156 ʫkVjG{K5\u007fq@i`\u0016,CLb\u000bY\u0015b\u001aەZ%M0S`j>\u0006,\\\\.+>Oy\"3<5)\\\u001bI1>pd\u001d\roZn\u0011-tտ(\u0003wH=&\u000futp6y\u0019K2ʉn4]K_H1,e$x4C55\u0001\u0381\u0004Gue\u0010tz<\u000eU*.6\u001c?֗=OC\u0019\r<J\b=G\\r,c{\u0014W~\u000b!';/@.ŔjҔ0`xr\u0018u%K\u000f^!18l\u000e\ryJ\u000bGiU9]nO\u0001*q>d7+\beǇݵ\u0005o('}3QR5\u0016&@u)2iwvFy\u0011\u0017|۬gנ0c\u001e˱3sk2SHY_\u000fB2$r\u0004pJzy\u0018B77;4\u001fЩfވZ>UߒG\u007fl\u0010:\u0017\u0086Z\t"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0016]R7h;\u001e\u007fua:\u0007p,Wt'U\"", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaG\\", ">qT3X9>\\\u0017~\tF(\b", "", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", "", "AsP?g\rK].~\u0004", "", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005ZC\u0019", "4q^GX5", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "5dc\u001de,?S&~\u0004\\,\u000bp+p>'wO|%&Q|\u000e6\u000225Z}-7v\u0014.[=9uA\u001e", "u(;7T=:\u001d)\u000e~eud\u0005:;", "/r<.c", "", "1gT0^\u0015Hby\f\u0005s,\u0006", "", "1gT0^\u0015Hby\f\u0005s,\u0006G.a\u000f$\nO\u000b$\u0017Az\u001b<w%BY\u0007\u001e7{\u0010,WP;", "1kT.e", "1n]AT0Ga", "\"", "9dh", "3pd._:", "=sW2e", "4qT2m,", "4qT2m,|R\u0015\u000evl;\u0007\u0016/_\u000b5{A\u0001$\u0017Pm\u000eJp#?f}", "5dc", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n\f$\u0017Ho\u001b<\u007f#5gG\u001eAz\u0016w8P;l4+\u0015q_9\u0015\"\u0012N\u000b|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "6`b566=S", "", ";h]Bf\bLa\u001d\u0001\u0004", ">kd@4:LW\u001b\b", ">qT3f", ">`X?", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEN(R\u0004|", ">tc\u000e_3", ">`X?f", "", "uZ;.a+K]\u001d}\u000e(+x\u0018+s\u000f2\t@J\"$Gp\u000eIv.3Y\fi5w#.\u0017.Hk5\u001e\"hj7\u0007qj9r+T\"\u0012\u001d", "@d\\<i,", "Adc", "D`[BX", "uKP;W9HW\u0018\u0012D](\f\u0005=t\n5{\n\f$\u0017Ho\u001b<\u007f#5gG\u001eAz\u0016w8P;l4+\u0015q_9\u0015\"\u0012N\u000b|.QJ=X\u001cy9\u001d\u0014$wK0\r\u0003h\u0017g_", "Adc\"a*AS\u0017\u0005z]", "Adc\"a*AS\u0017\u0005z]j{\u0005>a\u000e7\u0006M\u0001\u0011\"To\u000f<\u0004%>W}.1k ;M", "BnBAe0GU", "", "2`c.f;H`\u0019F\u0006k,}\t<e\t&{NH\u0015!To"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class MutablePreferences extends Preferences {
    private final AtomicBoolean frozen;
    private final Map<Preferences.Key<?>, Object> preferencesMap;

    public MutablePreferences() {
        this(null, false, 3, null);
    }

    public /* synthetic */ MutablePreferences(LinkedHashMap linkedHashMap, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? new LinkedHashMap() : linkedHashMap, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? true : z2);
    }

    public final Map<Preferences.Key<?>, Object> getPreferencesMap$datastore_preferences_core() {
        return this.preferencesMap;
    }

    public MutablePreferences(Map<Preferences.Key<?>, Object> preferencesMap, boolean z2) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z2);
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if (this.frozen.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void freeze$datastore_preferences_core() {
        this.frozen.set(true);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> boolean contains(Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> T get(Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.preferencesMap.get(key);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public Map<Preferences.Key<?>, Object> asMap() {
        Map<Preferences.Key<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    public final <T> void set(Preferences.Key<T> key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        setUnchecked$datastore_preferences_core(key, t2);
    }

    public final void setUnchecked$datastore_preferences_core(Preferences.Key<?> key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        if (obj == null) {
            remove(key);
            return;
        }
        if (obj instanceof Set) {
            Map<Preferences.Key<?>, Object> map = this.preferencesMap;
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.toSet((Iterable) obj));
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(key, setUnmodifiableSet);
            return;
        }
        this.preferencesMap.put(key, obj);
    }

    public final void plusAssign(Preferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.putAll(prefs.asMap());
    }

    public final void plusAssign(Preferences.Pair<?> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        checkNotFrozen$datastore_preferences_core();
        putAll(pair);
    }

    public final void minusAssign(Preferences.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        remove(key);
    }

    public final void putAll(Preferences.Pair<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core();
        for (Preferences.Pair<?> pair : pairs) {
            setUnchecked$datastore_preferences_core(pair.getKey$datastore_preferences_core(), pair.getValue$datastore_preferences_core());
        }
    }

    public final <T> T remove(Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        return (T) this.preferencesMap.remove(key);
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.clear();
    }

    public boolean equals(Object obj) {
        if (obj instanceof MutablePreferences) {
            return Intrinsics.areEqual(this.preferencesMap, ((MutablePreferences) obj).preferencesMap);
        }
        return false;
    }

    public int hashCode() {
        return this.preferencesMap.hashCode();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, AnonymousClass1.INSTANCE, 24, null);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.MutablePreferences$toString$1 */
    /* JADX INFO: compiled from: Preferences.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,t\bӵLc\u0003)I\u0006F\u000b6B\rӬ:ߚ\u0010\u0007\u0015iiDRe`>bY:\u0013{{:%\n&\u0002EKUH\u0001P\n\u0016V"}, d2 = {"\n`]<a@F])\rS", "", "3mc?l", "", "\u001a`]1e6BR,HyZ;x\u0017>o\r(EK\u000e\u0017\u0018G|\u000eEt%C#{*Dm_\u0019ZC<kA\u001e\u001efaGEI,bL", ""}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<Preferences.Key<?>, Object> entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return "  " + entry.getKey().getName() + " = " + entry.getValue();
        }
    }
}
