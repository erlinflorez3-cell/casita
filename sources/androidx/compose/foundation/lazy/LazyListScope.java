package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@LazyScopeMarker
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2\u000fq~<$i*yCQU\"}(\nWN}gvJ`\rIt\u001cǝ)jZH\u001e.k\u0012'2ppo;SoK;xvL\u0004N1RR\b\b\u00190:J v)H[\u000e\"0nqhVҫQ\u0005 \u0018ĂB \u0007%#|ߑ:Hze\u0003p1\u0003\u0002B|(\u00108\u0003M\u001bHl)#u\u0010\u001d[H=5#.k\u0005\u001dQ\n>3Y\u007f@\u001d~7);I\"\\FZ\u0010\u0014C,}\u0011ǁv&b\u000bŌd\f-2\u0016wׂT\u000e6\u0002Cԟ\fJ\u000f&\u0006UI^1(r \u000ea\u0002#vFP\u0010`Z\u001d\u000brF&S\rĴ/C!tagA(^9\u0002\u000b3.3\u0003~!\nS$_C\u001f\u0005\u001bW1_IUe^\u001biL\u001c\u0011Ͳf\f0\u0012@M\u0006>\f\u00134\u001dKGk=3#\u0002\u0001vC\u0016z5\u0010vd\u0002}XB2nD<:\u001a\u001cirqʰoZZf<\u0017S+d\t\u0004\u000e90lyL!S\u0011|aŹmjScܦ)/l> \u0003«\u0012WGq{#_n(a\u0001wDCJn\u001dX\u0015O\u0004/`\\6$Jez!\b\u000br[ܟ\u0017<E\u007f,:2@)^\u001bN).RC\r\t\u000eY~\u000f-XcS\u0011z< \u0019\u0003`\\\u001ftw\nY;+mĘ1KWC),[1x6\u0003)-\u000f\u0004\u0002WgzHz~טyU\u0002&ک\u001e9W6\u0004(ä\u0003)@\u0016u\u0007Z\b}Q{\u0013W\u0003\u0003y\u001d=\u00010}\u0007\u0019o\\hpJ]]/$\r]!\"8~\u000e|y\\\u000bIsT9`NK\u0003\u0003\b=|<٫\t\u001f$+˽s\"\u0003<shے!\u0016\u0006\u001eۥ\u0014˕ӣis6{h.TsЪ\bBФ\u001ap"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"\u001c\u001fsa\u000f", "", "7sT:", "", "9dh", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B1R;s\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00101\u0002\u0012g", "1n]AX5MB-\nz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WxbHJ", "7sT:f", "1nd;g", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "7sT:66Gb\u0019\b\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b&c51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eD\u0017lY", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b)c\u0012\u001c", "AsX0^@!S\u0015}zk", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface LazyListScope {
    void stickyHeader(Object obj, Object obj2, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3);

    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3) {
            LazyListScope.super.item(obj, obj2, function3);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i2, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
            LazyListScope.super.items(i2, function1, function12, function4);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i2, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((1 & i2) != 0) {
            obj = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, function3);
    }

    default void item(Object obj, Object obj2, Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Function3 function3, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, function3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017fV6:T\u001a<`aO\n;\nlKa\rK\u0001v]u(")
    @InterfaceC1492Gx
    /* synthetic */ default void item(Object obj, Function3 function3) {
        item(obj, null, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i2, Function1 function1, Function1 function12, Function4 function4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            function1 = null;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
                public final Void invoke(int i4) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.items(i2, function1, function12, function4);
    }

    default void items(int i2, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
        throw new IllegalStateException("The method is not implemented".toString());
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i2, Function1 function1, Function4 function4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        lazyListScope.items(i2, function1, function4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001t\u0006|\u001a\u0017fV6:T\u001a<`aO\n;\nlKa\rK\u0001v]u(")
    @InterfaceC1492Gx
    /* synthetic */ default void items(int i2, Function1 function1, Function4 function4) {
        items(i2, function1, new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.2
            public final Object invoke(int i3) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, function4);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i2, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i2 + 1) - (1 | i2) != 0) {
            obj = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, function3);
    }
}
