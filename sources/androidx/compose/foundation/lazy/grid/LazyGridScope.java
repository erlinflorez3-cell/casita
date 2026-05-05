package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@LazyGridScopeMarker
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2\u000fq{<$q$yCQU\"}(\nWNumvJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0012\u00172XoG\u074cSeSʠ\u0011td\u0004h\u001108\u0012\u0005/\u001bZP\u0016v\tEc\u000e(/nojk\u0013M\u0013\u001d*\u0019N\"\u0011\u001e\u000bl^8Xl\f@E\"1mŌR'e7-U\u0013Fb/%xw\u001dY?gO#.k\u0019\u0017Tk?1I\u0002?\u0015hU(YMָ[6^\u000bЏ\u0019+U\u0014$\u0017͉`\u0005_lT˵*]pcP<)(~\n\u001bT\u0004<\u0015Wk4-(h +C\u0006\u0003bn_ؿbL\u0006\u000bq<\u001d6\u001051?AxacK\u0019|6\u0012\u0004;\"S/t!iW&\t%\u001ddw\u007f6aQMW|\u0019ՒAw\n\u0001r\b0\u0015@I\u00065\"#>\u001957\n?9 \u001a\u0015ҩHg|\f\u0011\fYi`PX?~'G97\u001bʑHn\u000b{`Z^=!O\"Z-\u0010\u0018\u00170^\u000e;O$>R\u007f\u0018w~e\t\u001a'?fec~|\u001efgmۋ9[i qX|%O>h\u000b~xRU\u001cZ\u000b)PEʮn\u0010}\u0007ΌR\f\u00199\u0006\u0016ʬ8,?.¥\u0014G\u0019ەAˆҔ\tcbj\u0016\u001e\u00032ʝ\u0007\u0001̆x\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0005m7NL", "", "7sT:", "", "9dh", "AoP;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n]AX5MB-\nz", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<t1RL$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025{#XH\u00183X[t\u0007}\u000f_\u000eL:bk_K3uH@h\r=QK<x\n\n%\u0012?s~\f7 Pw$yK26\u001c\u001dP", "7sT:f", "1nd;g", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "7sT:66Gb\u0019\b\n", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eA\u0017\u0010nPhf}P\u000bJs2.\ro&ZI>.\u001d\u007fb{xY,\u0019\u007f]\u001aA(=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0010r,[\b#N*X5kR{Li", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface LazyGridScope {
    void item(Object obj, Function1<? super LazyGridItemSpanScope, GridItemSpan> function1, Object obj2, Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> function3);

    void items(int i2, Function1<? super Integer, ? extends Object> function1, Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> function2, Function1<? super Integer, ? extends Object> function12, Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, Function1 function1, Object obj2, Function3 function3, int i2, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((1 & i2) != 0) {
            obj = null;
        }
        if ((2 & i2) != 0) {
            function1 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, function1, obj2, function3);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridScope$items$1 */
    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,h\bӵLc\u0003\nIي>éFD\u0015!Z\u0011(\u000btjQ0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        public final Void invoke(int i2) {
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i2, Function1 function1, Function2 function2, Function1 function12, Function4 function4, int i3, Object obj) {
        AnonymousClass1 anonymousClass1 = function12;
        Function1 function13 = function1;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((2 & i3) != 0) {
            function13 = null;
        }
        Function2 function22 = (i3 + 4) - (4 | i3) == 0 ? function2 : null;
        if ((i3 & 8) != 0) {
            anonymousClass1 = AnonymousClass1.INSTANCE;
        }
        lazyGridScope.items(i2, function13, function22, anonymousClass1, function4);
    }
}
