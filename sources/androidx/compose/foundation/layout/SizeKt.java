package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.protocol.MetricSummary;
import io.sentry.rrweb.RRWebVideoEvent;
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
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d̉=!4i\bDJd|\u0004W\u00068\u000b4F\u0007\"B\u0012\u007fјnjO0LeN1ZS8\u0014s{:4c$\bCCU \u0011*\teNo˧vJh\u0014KƤ\u000e\u0016\u000fj4կ]xs\u0012\u0017˰Z\u0018M<eokC\ttd\u000fP8(8\b\u0010\u0019\u001aXT@|\u0001CY\u0019*0n|\u0001WԁLĨܨ\u0016\bD.\u000f-t{\\F`l\fDW#1srT-`>\u000ee\rtfm\u0012\u000fu,>X7c\u001fMS1\u0011\u0003aE\u0004M\u0003U\u0005\u00179m0a\beJp\u007fB\u001fSO;g#,b\u0006_q$'Ya*Ph*6\r\u0013{;F,\u000e41x2;/~\b<?;w֘?АؿbD\u0006\u0011oM/M\u000eKC9Ipyai#~=\u0002\u0005\u001b7;\u0001\u001d-\fZ\u0014`#5lw\u007f=\u0018EعGݐ̆]?s\u001f~q\u001aF\u0012L_\u007f]\u00069.E/g_G89k0T\u000blѱ\u0004\u009bĈWkXeN9\u0007>EH!\f\tN\r\u0005\u001aZ\u0005^2\u0011[5l\u0007,\u0014C&bwJ;=\u0010|[/nԍLΪܦ)1lVg}\u0004*eYv3c[\f\u0010\u0010\\'\u0018M]z\u0005\u0007r\tX݇Y٢͈&4N\r\u001e\u000f\u0014h\\,+2m{D4Z;I`#k\u001b\u001epM-\rmo\u0001\u0010-`y)өh˅ڲ\r\u0003V\u0001~~\u007f\u0015WL\u0015`P7iQc#VY0\nL|Q,ExŋFх֙KNr<\u0004|\u0014\\$BQQ]G;\u000f-3b\b3EZ}}Q{\u001eW\u0001\u0003y\u001dH\u0001.\u0016\u0014\u001bv2`xsgTE.'dx#\u0016\u000f\u0018y\u0010RALуSެИBKx.ghfT\u000b27\u001eS\u000b\u0018\"+?]G5@.wB;[fՙh۰Ц}d\u0015T\u0003|\u001cTqE\bb\u007fgZ;fS\n\u0005D\"2\u0006\u001bBvv(\u000eH\tB'KHop7[ҎLߒɣ\u0002h\r\\\u001b\u007fnwH4\b}b8\b*\"M.\u0018ld=\u0011{_.r¦JŌ\u05c8N\u0011\u0010<\nH\u00076*^8V\u0006l104}H:O^z\u0005j\u0015T8:Q \u000bq`0\u000bڄyĔʮc\u0011\u001ddP\u0003Sr\u001cu\u0011\\\u0005R-`sjQ.\u000f '3L\u001e{6ރlۮߟ3e84aD!Wx\u0004\u0017fS5lTg%X^\u0007\u000bSh[I0B4M/my|$8F\tMH\u001e\u001bGz)_%<\u000f\u0011[d\\\u000f\u000f\u0012\u0015^\u0015'Ə}ғէ\u0012>\u0010D\u0019Eg\u000f}\u0006EL|\u0002_CH\u000bGH7*$|\u0012Ra2ߛ4σִMl\u001a]\nnkc\f?8 U\u000e\u001d!\u000ba>l\u0010])S.qDn2\u000f\u0019P.\u001eFJ#~P3ų5Оױ7\u0004\u0019\u0017gz\u0010?N`Cl4Lsh'\u0014\u0014rincE\u001bf_\u0012*t3P+E?M\\P\u001f_R/a^p\u0011.\u001e=&M@8h/\u0010]\u001e\u0001p\u001a\u000f\f\u00131/yfy1^\u0010d\u00037\u0018\u0004DBTV\u001fcV{H\u0015\u000fblP\u0012&^\u0019i\u0015z\u0012)\"9\u0017H\rNY9f~,ҋG7G\u001e2ƯIֿ\u000b\u0004MÒF-?RW\u001be1a£*϶\u0015\u0003BŇ\u0015\f8C!r.f\u0003ߣHÊA\u001a/ڒDyr\u0005>Ks;\u0019ݍ.י\u0012\u00117դX,L`2\u001ciT\n\u0081\u001b֩\u0005\u0015@ۍ\u0010\u0013':\u0003Q\u0002(\u0001ʋ~Ӹ\u0011?\u0002ۧ\fF\u0002=\u000b#]\u0012FߩYǃ?%=֍l3\u001a\t}J-P:ȁ\u0011ˋ0I=\u0096>\u0006cH\u0018\nM'zԙw¡\u0004E9\u05fa߮_aHYyӴ T)߈r\u0007"}, d2 = {"\u0014h[9J/HZ\u0019fvq\u000f|\r1h\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v2TJ\u001br4&\u0015qp\u000f", "\u0014h[9J/HZ\u0019fvq\u001a\u0001\u001e/", "\u0014h[9J/HZ\u0019fvq\u001e\u0001\b>h", "%qP=66Gb\u0019\b\nA,\u0001\u000b2t](\u0005O\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b;IN\u0019u=-\u0015qp\u0019\u000ec4N\u007f6\u001d", "%qP=66Gb\u0019\b\nA,\u0001\u000b2tn2\u0007", "%qP=66Gb\u0019\b\nL0\u0012\t\re\t7{M", "%qP=66Gb\u0019\b\nL0\u0012\t\u001eo\u000b\u0016\u000b<\u000e&", "%qP=66Gb\u0019\b\nP0{\u00182C\u007f1\u000b@\u000e", "%qP=66Gb\u0019\b\nP0{\u00182S\u000f$\tO", "2dU.h3M;\u001d\bhbA|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", ";h]$\\+MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ";h]\u0015X0@V(", "2dU.h3M;\u001d\bhbA|P psu\u0011)O", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^c\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g", "4h[9@(Q6\u0019\u0003|a;", "4qP0g0H\\", "", "4h[9@(QA\u001d\u0014z", "4h[9@(QE\u001d}\na", "6dX4[;", "6dX4[;\u0006!t[{G\u0012\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:A\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi", "6dX4[;\"\\", ";h]", ";`g", "6dX4[;\"\\`o\u0006Ry\u0012q}", "@d`B\\9>R{~~`/\f", "@d`B\\9>R{~~`/\fP|A\\)d&\u000f", "@d`B\\9>R{~~`/\fl8", "@d`B\\9>R{~~`/\fl8-p3o\u000e\u0016\u007fe", "@d`B\\9>R\u0007\u0003\u0010^", "Ahi2", "@d`B\\9>R\u0007\u0003\u0010^sJd\ffh\u000e\n", "EhSA[", "@d`B\\9>R\u0007\u0003\u0010^sm\u0014#3\u0015\u0011J", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "@d`B\\9>R\u0007\u0003\u0010^sMk9lb&\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>A\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi", "@d`B\\9>R\u0007\u0003\u0010^\u0010\u0006", ";`g$\\+MV", ";`g\u0015X0@V(", "@d`B\\9>R\u0007\u0003\u0010^\u0010\u0006P;D\\-\f-K", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^\u0001\u00181|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018\u0014fQv>\u0018\u0012gc", "@d`B\\9>R\u000b\u0003ym/", "@d`B\\9>R\u000b\u0003ym/DV\u000bB\u0001\u0011aN", "@d`B\\9>R\u000b\u0003ym/`\u0012", "@d`B\\9>R\u000b\u0003ym/`\u0012vV\u000b\u001cIUie", "Ahi2 y\u001a0\u001ag`l", "Ahi2 \u001dIGf\u0014c-", "Ahi2 |!] axl", "Ahi2<5", "Ahi2<5\u0006_w[\u007fn\u0019G", "EhSA[s\f/u\u007fcD:", "EhSA[\u0010G", "EhSA[\u0010G\u001b\n\nn,AeW", "EqP=66Gb\u0019\b\nA,\u0001\u000b2t", "/kX4a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "CmQ<h5=S\u0018", "", "EqP=66Gb\u0019\b\nL0\u0012\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "EqP=66Gb\u0019\b\nP0{\u00182", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SizeKt {
    private static final FillElement FillWholeMaxWidth = FillElement.Companion.width(1.0f);
    private static final FillElement FillWholeMaxHeight = FillElement.Companion.height(1.0f);
    private static final FillElement FillWholeMaxSize = FillElement.Companion.size(1.0f);
    private static final WrapContentElement WrapContentWidthCenter = WrapContentElement.Companion.width(Alignment.Companion.getCenterHorizontally(), false);
    private static final WrapContentElement WrapContentWidthStart = WrapContentElement.Companion.width(Alignment.Companion.getStart(), false);
    private static final WrapContentElement WrapContentHeightCenter = WrapContentElement.Companion.height(Alignment.Companion.getCenterVertically(), false);
    private static final WrapContentElement WrapContentHeightTop = WrapContentElement.Companion.height(Alignment.Companion.getTop(), false);
    private static final WrapContentElement WrapContentSizeCenter = WrapContentElement.Companion.size(Alignment.Companion.getCenter(), false);
    private static final WrapContentElement WrapContentSizeTopStart = WrapContentElement.Companion.size(Alignment.Companion.getTopStart(), false);

    /* JADX INFO: renamed from: width-3ABfNKs */
    public static final Modifier m1068width3ABfNKs(Modifier modifier, final float f2) {
        return modifier.then(new SizeElement(f2, 0.0f, f2, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$width-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("width");
                inspectorInfo.setValue(Dp.m6636boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: height-3ABfNKs */
    public static final Modifier m1049height3ABfNKs(Modifier modifier, final float f2) {
        return modifier.then(new SizeElement(0.0f, f2, 0.0f, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$height-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("height");
                inspectorInfo.setValue(Dp.m6636boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: size-6HolHcs */
    public static final Modifier m1064size6HolHcs(Modifier modifier, long j2) {
        return m1065sizeVpY3zN4(modifier, DpSize.m6736getWidthD9Ej5fM(j2), DpSize.m6734getHeightD9Ej5fM(j2));
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m1070widthInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m1069widthInVpY3zN4(modifier, f2, f3);
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4 */
    public static final Modifier m1069widthInVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new SizeElement(f2, 0.0f, f3, 0.0f, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$widthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("widthIn");
                inspectorInfo.getProperties().set(MetricSummary.JsonKeys.MIN, Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set(MetricSummary.JsonKeys.MAX, Dp.m6636boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m1051heightInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m1050heightInVpY3zN4(modifier, f2, f3);
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4 */
    public static final Modifier m1050heightInVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new SizeElement(0.0f, f2, 0.0f, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightIn");
                inspectorInfo.getProperties().set(MetricSummary.JsonKeys.MIN, Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set(MetricSummary.JsonKeys.MAX, Dp.m6636boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m1067sizeInqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((2 & i2) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((4 & i2) != 0) {
            f4 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m1066sizeInqDBjuR0(modifier, f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0 */
    public static final Modifier m1066sizeInqDBjuR0(Modifier modifier, final float f2, final float f3, final float f4, final float f5) {
        return modifier.then(new SizeElement(f2, f3, f4, f5, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("sizeIn");
                inspectorInfo.getProperties().set(ViewProps.MIN_WIDTH, Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set(ViewProps.MIN_HEIGHT, Dp.m6636boximpl(f3));
                inspectorInfo.getProperties().set(ViewProps.MAX_WIDTH, Dp.m6636boximpl(f4));
                inspectorInfo.getProperties().set(ViewProps.MAX_HEIGHT, Dp.m6636boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: requiredWidth-3ABfNKs */
    public static final Modifier m1060requiredWidth3ABfNKs(Modifier modifier, final float f2) {
        return modifier.then(new SizeElement(f2, 0.0f, f2, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidth-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.setValue(Dp.m6636boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: requiredHeight-3ABfNKs */
    public static final Modifier m1052requiredHeight3ABfNKs(Modifier modifier, final float f2) {
        return modifier.then(new SizeElement(0.0f, f2, 0.0f, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeight-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.setValue(Dp.m6636boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: requiredSize-6HolHcs */
    public static final Modifier m1056requiredSize6HolHcs(Modifier modifier, long j2) {
        return m1057requiredSizeVpY3zN4(modifier, DpSize.m6736getWidthD9Ej5fM(j2), DpSize.m6734getHeightD9Ej5fM(j2));
    }

    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m1062requiredWidthInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m1061requiredWidthInVpY3zN4(modifier, f2, f3);
    }

    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4 */
    public static final Modifier m1061requiredWidthInVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new SizeElement(f2, 0.0f, f3, 0.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredWidthIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidthIn");
                inspectorInfo.getProperties().set(MetricSummary.JsonKeys.MIN, Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set(MetricSummary.JsonKeys.MAX, Dp.m6636boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 10, null));
    }

    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m1054requiredHeightInVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m1053requiredHeightInVpY3zN4(modifier, f2, f3);
    }

    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4 */
    public static final Modifier m1053requiredHeightInVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new SizeElement(0.0f, f2, 0.0f, f3, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredHeightIn-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeightIn");
                inspectorInfo.getProperties().set(MetricSummary.JsonKeys.MIN, Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set(MetricSummary.JsonKeys.MAX, Dp.m6636boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), 5, null));
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m1059requiredSizeInqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m1058requiredSizeInqDBjuR0(modifier, f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0 */
    public static final Modifier m1058requiredSizeInqDBjuR0(Modifier modifier, final float f2, final float f3, final float f4, final float f5) {
        return modifier.then(new SizeElement(f2, f3, f4, f5, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSizeIn");
                inspectorInfo.getProperties().set(ViewProps.MIN_WIDTH, Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set(ViewProps.MIN_HEIGHT, Dp.m6636boximpl(f3));
                inspectorInfo.getProperties().set(ViewProps.MAX_WIDTH, Dp.m6636boximpl(f4));
                inspectorInfo.getProperties().set(ViewProps.MAX_HEIGHT, Dp.m6636boximpl(f5));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = 1.0f;
        }
        return fillMaxWidth(modifier, f2);
    }

    public static final Modifier fillMaxWidth(Modifier modifier, float f2) {
        return modifier.then(f2 == 1.0f ? FillWholeMaxWidth : FillElement.Companion.width(f2));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = 1.0f;
        }
        return fillMaxHeight(modifier, f2);
    }

    public static final Modifier fillMaxHeight(Modifier modifier, float f2) {
        return modifier.then(f2 == 1.0f ? FillWholeMaxHeight : FillElement.Companion.height(f2));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = 1.0f;
        }
        return fillMaxSize(modifier, f2);
    }

    public static final Modifier fillMaxSize(Modifier modifier, float f2) {
        return modifier.then(f2 == 1.0f ? FillWholeMaxSize : FillElement.Companion.size(f2));
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return wrapContentWidth(modifier, horizontal, z2);
    }

    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z2) {
        WrapContentElement wrapContentElementWidth;
        if (Intrinsics.areEqual(horizontal, Alignment.Companion.getCenterHorizontally()) && !z2) {
            wrapContentElementWidth = WrapContentWidthCenter;
        } else if (Intrinsics.areEqual(horizontal, Alignment.Companion.getStart()) && !z2) {
            wrapContentElementWidth = WrapContentWidthStart;
        } else {
            wrapContentElementWidth = WrapContentElement.Companion.width(horizontal, z2);
        }
        return modifier.then(wrapContentElementWidth);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return wrapContentHeight(modifier, vertical, z2);
    }

    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z2) {
        WrapContentElement wrapContentElementHeight;
        if (Intrinsics.areEqual(vertical, Alignment.Companion.getCenterVertically()) && !z2) {
            wrapContentElementHeight = WrapContentHeightCenter;
        } else if (Intrinsics.areEqual(vertical, Alignment.Companion.getTop()) && !z2) {
            wrapContentElementHeight = WrapContentHeightTop;
        } else {
            wrapContentElementHeight = WrapContentElement.Companion.height(vertical, z2);
        }
        return modifier.then(wrapContentElementHeight);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return wrapContentSize(modifier, alignment, z2);
    }

    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z2) {
        WrapContentElement size;
        if (Intrinsics.areEqual(alignment, Alignment.Companion.getCenter()) && !z2) {
            size = WrapContentSizeCenter;
        } else if (Intrinsics.areEqual(alignment, Alignment.Companion.getTopStart()) && !z2) {
            size = WrapContentSizeTopStart;
        } else {
            size = WrapContentElement.Companion.size(alignment, z2);
        }
        return modifier.then(size);
    }

    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4$default */
    public static /* synthetic */ Modifier m1048defaultMinSizeVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m6658getUnspecifiedD9Ej5fM();
        }
        return m1047defaultMinSizeVpY3zN4(modifier, f2, f3);
    }

    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4 */
    public static final Modifier m1047defaultMinSizeVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new UnspecifiedConstraintsElement(f2, f3, null));
    }

    /* JADX INFO: renamed from: size-3ABfNKs */
    public static final Modifier m1063size3ABfNKs(Modifier modifier, final float f2) {
        return modifier.then(new SizeElement(f2, f2, f2, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(RRWebVideoEvent.JsonKeys.SIZE);
                inspectorInfo.setValue(Dp.m6636boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: size-VpY3zN4 */
    public static final Modifier m1065sizeVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new SizeElement(f2, f3, f2, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$size-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(RRWebVideoEvent.JsonKeys.SIZE);
                inspectorInfo.getProperties().set("width", Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set("height", Dp.m6636boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: requiredSize-3ABfNKs */
    public static final Modifier m1055requiredSize3ABfNKs(Modifier modifier, final float f2) {
        return modifier.then(new SizeElement(f2, f2, f2, f2, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-3ABfNKs$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.setValue(Dp.m6636boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* JADX INFO: renamed from: requiredSize-VpY3zN4 */
    public static final Modifier m1057requiredSizeVpY3zN4(Modifier modifier, final float f2, final float f3) {
        return modifier.then(new SizeElement(f2, f3, f2, f3, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.SizeKt$requiredSize-VpY3zN4$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredSize");
                inspectorInfo.getProperties().set("width", Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set("height", Dp.m6636boximpl(f3));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }
}
