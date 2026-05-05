package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
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
/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@LazyStaggeredGridScopeMarker
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4C\u0007\"B\u0012\u007fјnjO0Le^.ZS@\u000fs{J$c$wDCU(\u0004*\teNogtKb\u000bY\u000f\u000eǝ\u0001jBI]ތc\b%˰rom2\u0016=K9xtd\u0006P:(8\b\u0007\u0019\u001c@G>u+KQ\f 3XrPQ;L5\"\u0018\u0006L$\u0019 rf|;x\u0007k@G9\u0013kRNUg@~]\rtUU\u0014țe\u001e1I˝9\u0015+]I+қ_?\u0011J:ݳ\u0004v3?+wt\b:f\r,\u0015Y]=\u0001x&j\u0007i}\u001c8;^\u0012Yח\u00122}\n\f\u0013B\u0014\u001e\b-NT>*h\u0018\u000eas\tRnW2\u0002H\u007f\tdN45\u0011C:g)ƻUkA(^=\u0002\u0015\u001d )\u0007\u00152kX\u001eb+\u001a\u0003v\u007f8\u0002cCH\\\u000eqZ}\u0015\u0001q08˙4Q\u0006>\f\u00174'59a?I2{\u0004XD\u0016{\u001b_\u0017Z\u001a\u0002VR:\u001a&9:\t:bTu\u0015z~bг0\u001bS+d\r\u0004\u0018#\"b}b25\u0012^O\u0017j\u0019`ύ\u000e%5oƠ]nq\u0018\u001e]ӷ75_w߇`Q\fޖ>ֺϸ\u0005\\nDY+\t[͎&Hˌn\u000f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{L5\u0018\u0005/", "", "7sT:", "", "9dh", "1n]AX5MB-\nz", "AoP;", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003tr(Px'TLM\u000eiVq!#\u0012b{Y'\u0016Z", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015rWK/n\u001a", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011MX<eQnL\u0018\u001ccWU'\"\u0019#O3jF9\u001f\u0015,H\u0004Hl\u007fU\u0004\u001d1lrBc\u0010F[\"y@\rwFaM\u0005CJ\u001bI0n\u001bf!e\u0004?5\u001c;\u001a+qN=\u000e\u0006\\\u001f<3\npeV\u001d\u0005Aq\u00141L", "7sT:f", "1nd;g", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "7sT:66Gb\u0019\b\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b&c51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eA\u0017\u0010nPhf}P\u000bJs2.\ro&ZI>.\u001d\u007fb{xY,\u0019\u007f]\u001aA(=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YqW:\r\u0012j=+LN@.\b5XW", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface LazyStaggeredGridScope {
    void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, Function3<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, Unit> function3);

    void items(int i2, Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> function12, Function1<? super Integer, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4);

    static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, Function3 function3, int i2, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((1 & i2) != 0) {
            obj = null;
        }
        if ((2 & i2) != 0) {
            obj2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            staggeredGridItemSpan = null;
        }
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i2, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i3, Object obj) {
        AnonymousClass1 anonymousClass1 = function12;
        Function1 function14 = function1;
        if (obj == null) {
            if ((i3 + 2) - (2 | i3) != 0) {
                function14 = null;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                anonymousClass1 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope.items.1
                    public final Void invoke(int i4) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        return invoke(((Number) obj2).intValue());
                    }
                };
            }
            lazyStaggeredGridScope.items(i2, function14, anonymousClass1, (i3 & 8) == 0 ? function13 : null, function4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }
}
