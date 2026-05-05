package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,p\bӵLc\u000b\u0004I\u00066\u000b6B\rӬ4ߚ\u007f\u0007tpAӄLe^.ZS@\u000fs{:&c$\bCC٥\"}8\tWNupvJ`\fK\u000f\u0014\u0016\u0001̓D\u05ebT\u0007]*\u001bBD\u007f?yO\u007f?I`;93!R(>ц\u0013\u0003B*v\u0014\u0017\u0001IJ\u001a\u0015X@\u001f>\u0003\u0011[\n2\u00124DP7$`uUNx|nJ>i\u0005ݦFX-h@\u0003S\u0017VV-\u0013\u001dl.<PF{\u0018ȏW\r\r[kE\tI\u0002?\u000bnM3;K\u0004Wd^.\u001cENU\u0011k\u007f>y\u0015bp\u001bm-յgUV\u00178}\u0001\u0006\u001d>\n\u0014,2X2=\u001c|\u0007T6#\u0001\u0004#V\u0006lQ\u0018WqG'4.Dڢ=%lZqA\u001fXG}\u000b\u0013D5\u0011\u007f1j\u001b\u0010\u05ce\u0019%Z\u0001a7WJMJT\u0010\u007fH}\u0015\u0001qH-˙4Q\u00068\f\u00174!59a?I4{\u0015XU}uKcĈWsXQP(t G,\u000f\u0012\u0001Xt\u0007{P\u0003mZ!\u0014ɃZϮ|ܱ3,jɼT!S\u000f%л;ȬnMe܃ɛ/k?\\t¢>\u00068ӽ7K"}, d2 = {"\u001b@G,F\u001033", "", ":qd\u0010T*AS", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng$'%k\f?vz", "\u0019", "$", "", ";`g \\A>", "", "Ahi2B-", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "9dh", "D`[BX", "1qT.g,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "=m4;g9R@\u0019\u0007\u0005o,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "", "3uX0g,=", "=kS#T3NS", "<df#T3NS", "", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LruCacheKt {
    private static final long MAX_SIZE = 2147483647L;

    public static /* synthetic */ LruCache lruCache$default(int i2, Function2 sizeOf, Function1 create, Function4 onEntryRemoved, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            sizeOf = new Function2<K, V, Integer>() { // from class: androidx.collection.LruCacheKt.lruCache.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(K k2, V v2) {
                    Intrinsics.checkNotNullParameter(k2, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(v2, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((4 & i3) != 0) {
            create = new Function1<K, V>() { // from class: androidx.collection.LruCacheKt.lruCache.2
                @Override // kotlin.jvm.functions.Function1
                public final V invoke(K it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return null;
                }
            };
        }
        if ((i3 & 8) != 0) {
            onEntryRemoved = new Function4<Boolean, K, V, V, Unit>() { // from class: androidx.collection.LruCacheKt.lruCache.3
                public final void invoke(boolean z2, K k2, V v2, V v3) {
                    Intrinsics.checkNotNullParameter(k2, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(v2, "<anonymous parameter 2>");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    invoke(bool.booleanValue(), obj2, obj3, obj4);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new AnonymousClass4(i2, sizeOf, create, onEntryRemoved);
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.collection.LruCacheKt$lruCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: LruCache.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!4i\bDJe|\u0004O\u00068é6B\r+4\u0012}\tnjG6LeN/zRճ\u0015s\u0012éTg4sS;\fڼ\u000e$\u0019O\u0005f\u0016m\u0013o\u0019C'\b,w!+yY\u0007^*\u000fhԏ6QݯQoK;)\"D\b82P<*\t\u000f\u001fBH>|+GY\r*0v\u0081jV\u001bT\u001d\u001aH\u0005n&\u000f&tid5~k$Lǥ'\u0003wK\u0017Bm:\u0015M;Q\u0005+\u001bwy\u001ea¨g9#1k\u0003=Q\"QƄCqK\u0012ػ+5"}, d2 = {"/mS?b0=fb|\u0005e3|\u0007>i\n1E'\u000e'tCm\u0011<\\4s`\u000b0\u0015i\u00141M\u0002\n", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng$'%k\f?vz", "1qT.g,", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "3mc?l\u0019>[#\u0010z]", "", "3uX0g,=", "", "=kS#T3NS", "<df#T3NS", "uY;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044H7|0g\u001cdj;PM)Sv%V\"\u0012\u001d", "Ahi2B-", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq1", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass4<K, V> extends LruCache<K, V> {
        final /* synthetic */ Function1<K, V> $create;
        final /* synthetic */ Function4<Boolean, K, V, V, Unit> $onEntryRemoved;
        final /* synthetic */ Function2<K, V, Integer> $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(int i2, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> function4) {
            super(i2);
            this.$sizeOf = function2;
            this.$create = function1;
            this.$onEntryRemoved = function4;
        }

        @Override // androidx.collection.LruCache
        protected int sizeOf(K key, V value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this.$sizeOf.invoke(key, value).intValue();
        }

        @Override // androidx.collection.LruCache
        protected V create(K key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.$create.invoke(key);
        }

        @Override // androidx.collection.LruCache
        protected void entryRemoved(boolean z2, K key, V oldValue, V v2) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            this.$onEntryRemoved.invoke(Boolean.valueOf(z2), key, oldValue, v2);
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i2, Function2<? super K, ? super V, Integer> sizeOf, Function1<? super K, ? extends V> create, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> onEntryRemoved) {
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new AnonymousClass4(i2, sizeOf, create, onEntryRemoved);
    }
}
