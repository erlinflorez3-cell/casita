package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!4i\bDJc|\u0004Oي8é6B\r(4ߚ\u007f\u0007|jA0ZeP.XU2\u000f\u0002{<řc$\bCCU(\u0007*\tUOog|Jbŏ[ȝ\u0005$ю\u00038YW\t]X\u000fBD\u007f?yN\u001e<YfzȂ\u0013 Z\"f{%\u0007 )V\u0011\u001fzqM<\u0016>C\t:\u0001\u0011}; \u0016\u0014C81.mw]|HǰaD5*\u0013oHV7a6\u0003s\u0016Ve7\u001c=bӿ/J=<%+Y\u000b\u0017TaE)I\u0002?\u0015hU+YO$z<\\\u000e\u001f-H_\u001em\u0002l\\ԇUj\u0012.;UiS`\u0010.}!\u0005\u001d@\u0014\u0010\u001c&\u000f/[&\u0017j\u00147\u0003\u007fk\u001d`\u0013nQ.\nˋ:!+\u0007C1?#vSgA?^G\r\u0015\u001cd#ъr+a[\u001ef\u001b#dyW7wIMY^\u0019 >ъ\bzh\t:\n6O\u00101\u0002\u0017T(5JkJ9 2\u0003ҩHq|\fpnYqbJF(\u0015(G,\u0019\f\tW\u0013\u00132³Zй0%"}, d2 = {":qd\u0010T*AS", "\u001a`]1e6BRb\u000f\nb3Fo<u]$yC\u0001l", "\u0019", "$", "", ";`g \\A>", "", "Ahi2B-", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "9dh", "D`[BX", "1qT.g,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "=m4;g9R@\u0019\u0007\u0005o,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "", "3uX0g,=", "=kS#T3NS", "<df#T3NS", "", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LruCacheKt {
    public static /* synthetic */ LruCache lruCache$default(int i2, Function2 function2, Function1 function1, Function4 function4, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            function2 = new Function2<K, V, Integer>() { // from class: androidx.core.util.LruCacheKt.lruCache.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(K k2, V v2) {
                    return 1;
                }
            };
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            function1 = new Function1<K, V>() { // from class: androidx.core.util.LruCacheKt.lruCache.2
                @Override // kotlin.jvm.functions.Function1
                public final V invoke(K k2) {
                    return null;
                }
            };
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            function4 = new Function4<Boolean, K, V, V, Unit>() { // from class: androidx.core.util.LruCacheKt.lruCache.3
                public final void invoke(boolean z2, K k2, V v2, V v3) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    invoke(bool.booleanValue(), obj2, obj3, obj4);
                    return Unit.INSTANCE;
                }
            };
        }
        return new AnonymousClass4(i2, function2, function1, function4);
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: LruCache.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!4i\bDJe|\u0004O\u00068é6B\r+4\u0012}\tnjG6LeN/zRճ\u0015s\u0012éTg4sS;\fڼ\u000e$\u0019O\u0005f\u0016m\u0013o\u0019C'\b,w!+yY\u0007^*\u000fhԏ6QݯQoK;)\"D\b82P<*\t\u000f\u001fBH>|+GY\r*0v\u0081jV\u001bT\u001d\u001aH\u0005n&\u000f&tid5~k$Lǥ'\u0003wK\u0017Bm:\u0015M;Q\u0005+\u001bwy\u001ea¨g9#1k\u0003=Q\"QƄCqK\u0012ػ+5"}, d2 = {"/mS?b0=fb|\u0005k,F\u0019>i\u0007qbM\u0011t\u0013Er\u000e\"\u0006c<f\u000e}3k\u0019.\f\u0012", "\u001a`]1e6BRb\u000f\nb3Fo<u]$yC\u0001l", "1qT.g,", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "3mc?l\u0019>[#\u0010z]", "", "3uX0g,=", "", "=kS#T3NS", "<df#T3NS", "uY;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044H7|0g\u001cdj;PM)Sv%V\"\u0012\u001d", "Ahi2B-", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq1", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
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

        @Override // android.util.LruCache
        protected int sizeOf(K k2, V v2) {
            return this.$sizeOf.invoke(k2, v2).intValue();
        }

        @Override // android.util.LruCache
        protected V create(K k2) {
            return this.$create.invoke(k2);
        }

        @Override // android.util.LruCache
        protected void entryRemoved(boolean z2, K k2, V v2, V v3) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(z2), k2, v2, v3);
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i2, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> function4) {
        return new AnonymousClass4(i2, function2, function1, function4);
    }
}
