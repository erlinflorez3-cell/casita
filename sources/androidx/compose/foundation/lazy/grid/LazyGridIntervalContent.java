package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	... 5 more
    */
/* JADX INFO: compiled from: LazyGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007tjA0ZeP.XS2\u000fy\u0005<$a'yCQU\"}(\nWN}gvJ`\rK\u000f\u0014ǝ\u0001̓4Ikxe\u0012%2JģG3coE9vt>\u0005&3*8\b\u000b\t\u001a@H\u0018v\u0001CS\f(0Hp@T\u0013˟\u001b܅0.n /\u001d\rm^8Xl\f;]#;hj\u000fCoE\u000bO%Wd)\u001dv\u0010\u001d;BG5C)\u0002\u0006\u07baV[E\bӭu=\u0013no\u007f9^\fWd\\0\u001a#Ag\u000fsqTs5hn$?>_e[P<A\b|\f\rj\u001e$\u0005UKͶ1\u001al\r>9\u0003\u000ekBf\u0001\rY0\u0015o8/;\u00105;9I\u0003acK\u0019|;*\bڟ\"#\u0007\fĲ_T\u0014e[/ƻ{Q?o\t״G\\)q=\u001c\b!f\u0010J\u001c0u!_\u001d\u001fD/BGlI2O\rɘLNm\u0019\u0015fnvyTNFH\u0013&9:\t:qZc3n\u0001qfD)f,V\u0017}6,0^\b<OF P_h\u0018\u0005c\\8Jçj7_s\u001c/eTvPEbs\u001f\u0010sλ\u0018IB\u0005\u0015^lec\u000e`bNFBLz\u0012\u000ezre:\u0016bn\u007fBLWA\u001bl\u0015v\u001f.SQ\f7\u0001˖l\u001a\u0005vC*\t\r4v\u000f\u0007v\u0001\u0001qwxw0+\u0006Ę1AWRԊ*U(mz\u0011ɠ\u000b~\u0002'\u0018\u007fZNdlD},ݩ,ک\u001eEYǽU\u0015\u0015\b7<\"/KW\u0001q\"e 4\u0013\u0003\n\u0011Kh\\h6xGݱbʧNU\\ϟ:xd\u00021\u00185\u0012\br^zuu+ޭ]ƏMx\u000bʛTP>\u0010\u00133ǰ)*"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0010r,[\b#N*X5kR{Li", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0005m7NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u007f6GY_(c0|F#\u0012c\u001d$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0010r,[\b#N\"", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "6`b\u0010h:M]!l\u0006Z5\u000b", "", "5dc\u0015T:\u001cc'\u000e\u0005f\u001a\b\u00058s>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "u(I", "Adc\u0015T:\u001cc'\u000e\u0005f\u001a\b\u00058s>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "uY\u0018#", "7mc2e=:Z'", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005SD-\u0011eh9jl;N\u00048CS50jaH", "5dc\u0016a;>`*z\u0002l", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0006%w]6\u000ec\u0010W\u0006'T]J3CV\u0001Li", "AoP;?(R])\u000eek6\u000e\r.e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0012_55r;Q\\]\u0017i\\\u0004A\u0013\u0012gc", "5dc c(G:\u0015\u0013\u0005n;g\u00169v\u0004'{M?\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u0018;QB\u0005R03)Jn=\u0006Q7J\u007f\u000eC`X<k=\u007fG%\u0016Y\u000e[\u0001", "7sT:", "9dh", "", "AoP;", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "1n]AX5MB-\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<t1RL$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025{#XH\u00183X[t\u0007}\u000f_\u000eL:bk_K3uH@h\r=QK<x\n\n%\u0012?s~\f7 Pw$yK26\u001c\u001dP", "7sT:f", "1nd;g", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "7sT:66Gb\u0019\b\n", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eA\u0017\u0010nPhf}P\u000bJs2.\ro&ZI>.\u001d\u007fb{xY,\u0019\u007f]\u001aA(=X", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    private boolean hasCustomSpans;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = new Function2<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$Companion$DefaultSpan$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m1137boximpl(m1152invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m1152invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };
    private final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    private final MutableIntervalList<LazyGridInterval> intervals = new MutableIntervalList<>();

    public LazyGridIntervalContent(Function1<? super LazyGridScope, Unit> function1) {
        function1.invoke(this);
    }

    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation_release() {
        return this.spanLayoutProvider;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public MutableIntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    public final void setHasCustomSpans$foundation_release(boolean z2) {
        this.hasCustomSpans = z2;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$3 */
    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,˛\bӵLc\u0003\nIي>éFD\u0015!Z\u0011(\u000btjQ0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Object $contentType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Object obj) {
            super(1);
            obj = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i2) {
            return obj;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(final Object obj, final Function1<? super LazyGridItemSpanScope, GridItemSpan> function1, Object obj2, Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> function3) {
        getIntervals().addInterval(1, new LazyGridInterval(obj != null ? new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i2) {
                return obj;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        } : null, function1 != null ? new Function2<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
                return GridItemSpan.m1137boximpl(m1153invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
            }

            /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m1153invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
                return function1.invoke(lazyGridItemSpanScope).m1144unboximpl();
            }
        } : DefaultSpan, new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.3
            final /* synthetic */ Object $contentType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Object obj22) {
                super(1);
                obj = obj22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                return obj;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-34608120, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.4
            final /* synthetic */ Function3<LazyGridItemScope, Composer, Integer, Unit> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> function32) {
                super(4);
                function3 = function32;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
                ComposerKt.sourceInformation(composer, "C49@1790L9:LazyGridIntervalContent.kt#7791vq");
                if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - (composer.changed(lazyGridItemScope) ? 4 : 2)));
                }
                if ((i3 & 131) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-34608120, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
                }
                function3.invoke(lazyGridItemScope, composer, Integer.valueOf((i3 + 14) - (i3 | 14)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
        if (function1 != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridIntervalContent$item$4 */
    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|İI\u0006>\u00116B\u0005\":ߚ\u0010\u0007\u0015ia0rex2`TB\u000f\u001a}z-Ӯ(sI>c\u001e"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<t1RL$", "7s", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001o#2L\r\"gI2vue8jr,Vd%QWN\u0002@9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u0015<R\u0011?p\u0001Us\u0018=uzPV\u001d\u001d]Xf"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function3<LazyGridItemScope, Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> function32) {
            super(4);
            function3 = function32;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyGridItemScope lazyGridItemScope, int i2, Composer composer, int i3) {
            ComposerKt.sourceInformation(composer, "C49@1790L9:LazyGridIntervalContent.kt#7791vq");
            if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
                i3 = (-1) - (((-1) - i3) & ((-1) - (composer.changed(lazyGridItemScope) ? 4 : 2)));
            }
            if ((i3 & 131) == 130 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-34608120, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
            }
            function3.invoke(lazyGridItemScope, composer, Integer.valueOf((i3 + 14) - (i3 | 14)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int i2, Function1<? super Integer, ? extends Object> function1, Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> function2, Function1<? super Integer, ? extends Object> function12, Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
        getIntervals().addInterval(i2, new LazyGridInterval(function1, function2 == null ? DefaultSpan : function2, function12, function4));
        if (function2 != null) {
            this.hasCustomSpans = true;
        }
    }

    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\rnjO0Le^.ZS0\u0010qڗ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug?ph\f[&\u0016\u0018\tjZLezm\u0012=6RqO3{tk;žx6\u000b&ݨ&>\u0002ڎ\u0019\u001c0O\u001e~ڂGT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0010r,[\b#N*X5kR{LRod\u0016Y'\u0016\tcJy", "", "u(E", "\u0012dU.h3MA$z\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c4<\u0002#P:L6gRH", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017%Ho3\u0002$hi'\u0012_5$", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u0011X-:c \u000ehi(\u0006", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> getDefaultSpan() {
            return LazyGridIntervalContent.DefaultSpan;
        }
    }
}
