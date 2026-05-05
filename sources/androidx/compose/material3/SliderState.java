package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
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
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLш|\u0004O\u000b8é6B\r(4ߚ\u007f\u0007|jA0ReP\u008cZS@\u000fs{:'c$\bCCU \u007f*\t]WogtSb\u000bY\u000f\u000e\u0016~z4Ikxe\u0012\u00157JoMEUoCPhtL\u0005(݅*8\u0010\u0005\t\u001a@H\u0018v\tŏS\f(0Hp@S\u0015M\u001b\u001a\u001a\u0006D+\u0007#rɡ~6vk\u001es?)\tiPN?_^}]\u0013LU5\u000f\u000faL.PE;\u00153W\u001b\u000fb]O\u0003mwS\u0004\u0017,77Ose=p\u0006$\u0017;O;^!.ػ\tQn\u0015o9]4cP<.(~\n^T\u0004<\u0007m\\vj(9 \u000eaz#WN$\u001a^pT+\u0007Dl=!9*I\u001dvQ\u0010I)VG\u0002\u0015\u000f.#/tO3d\u0012p\u00171S&*_(͘AHTc ƴ,ձtb\u0010\u0005LHU[G{?4G)E8Q#OIH҆جfϸݶdjYH`(\t@|vO*7\r\u000bHrf\u0004P\u0003Y\\\u0015[~l\u0007,\tC$j[T!S\u0011\u0015O1\bx2u\nS0\u0017;gP\u0004\u000e\u0006:\u000f7C4{\u0010\u0010S'\u0018M\"z\u0005\u0007g\tSTuj\u000f:2vp@{\n,f\fA3ou*\u001dD1G_[ǽҴ\"BGfYqhr(~\u00034ZA@ˆv֊\u0005Ttrur\u0007U|\tn/EA\u007fCoĢWɋl4\u0005ȽW\u0017\u0002\u000f_m\\I\\lD{\u0004\u0001vڇ\u001c\u07fcU5EП'\u0001/B\u0010>\u0016u\u0001yiM@:+\u0001\b!Sh\\z>)/l7ʅ߉Oݚ\u001b2~`x<\u0016~\u0018{g[\t]\u0004V\u0011rLaC\u001bgWf8+\u0018uǈ1˽s.\u0005ކEE-9$\u000e41\u001b~k\u0002@T\b\u0001'4\u0005g\u0014,\u0012\u0017\u007fda]`ANH\b\u001e\u0015Ю0к\u0007NP۳\u0010\nH)B.SJG\u0007~y\tm\u00193\u0016n\u0017.\u001dp\u0005aP\u0012\u001e\u0003\u000bʤkͫwO\u0006жvE+5[d\bospj1\u001b8\u00182\u00141\u001d\u0013LA.hob71<4Vv\u0018ݨد\u0005Ø\r4<.B3\u0019olk\f8\t\ffa\u0015@@lDdd;lx\u000bWx\tnWx!X\u00025Oq^O߹̜\u0005֪Jd7e81aI!\u001dp}\rrE-J\u0004GExd\u000f<]]q{XԐ\u0006ھ-msƑ\\G&~5BF\u001eʦU\u0017gڻH`\u0011\tr\u00035  \u001cjNP*/~\u000b T\n=\fO\u000e1.9ΣٚNߺ;S\"\u0003\u001d|73$~i|)9&73tW\u0015d9\n\u0011k;,Bvê)ؗx'dަ&h\u0010\u0019)vf\u001b$ \u001a\tASP\b<\\\rr81>v\u000eB\nûՑ^̲o\b)B-lzHZMn7\u0018\u0018\ret\u0015\u0019C7Zd=\u0007-~\u001e9+[@+X\t;G\u0012^\u0017g֨ȃ\u0015Ӕ#F\u0010d/V]\u0010\u0001rq\u0014i\u0019K1qoo[\u0001t,}7y$\u0005ZX6\\SV{?\u001bM\u001b1\u0019ħ\u001a߿n2|v\u0012q\"\t\u001fJdZ!^\u0017\b,kG=)!k\rua5\f٣M,)ܐjA!\u0002@V@Q\u0005]\u001b:\u0011u0.P\u001b\u000b\u007f\u0016-c\u0007\u0013}pŞڡ$މh\u0013.MK\bP4D\u0013\u0014^=fX\"D+(FԠQ8I\u001c\u0017ܖ1f\u0005˸\u000b\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-%|\u0012=M\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa'\u0016_;NL", "D`[BX", "", "AsT=f", "", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "D`[BX\u0019:\\\u001b~", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "uE8\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007j\rT\u001c8\\J?t}+\u0011qc9\u0015-\nU\u00015GK/3fN\u0002A\u001d\u0014E\u0018R4\u001cqUJ&n\u001az\u0010", "1nT?V,=D\u0015\u0006\u000b^\b\u000bi<a}7\u007fJ\n", "5dc\u0010b,KQ\u0019}kZ3\r\t\u000bs`5w>\u0010\u001b!P.\u00168\u0006%B]y'\u0005g#.TC7y4", "u(5", "2qP4F*H^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m\"\u001c\u001fsa\u000f", "5dbAh9>3\"}V\\;\u0001\u00138", "5dc\u0014X:Mc&~Zg+X\u0007>i\n1:H|&\u0017Ts\nCD\u001fBY\u0005 3{\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "\nrTA \u0006\u0017", "", "7r3?T.@W\"\u0001", "7r3?T.@W\"\u00019f(\f\t<i{/I:\u000e\u0017\u001eGk\u001c<", "u(I", "Adc\u0011e(@U\u001d\b|", "uY\u0018#", "7r3?T.@W\"\u00019],\u0004\t1a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "7rAA_", "7rAA_jFO(~\bb(\u0004V)r\u007f/{<\u000f\u0017", "Adc\u001fg3|[\u0015\u000ezk0x\u0010|_\r(\u0003@|%\u0017", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "5dc\u001ca\u001d:Z)~Xa(\u0006\u000b/$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\u001d:Z)~Xa(\u0006\u000b/$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u001ca\u001d:Z)~Xa(\u0006\u000b/F\u00041\u007fN\u0004\u0017\u0016", "Adc\u001ca\u001d:Z)~Xa(\u0006\u000b/F\u00041\u007fN\u0004\u0017\u0016", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", ">qT@f\u0016?T'~\n", "5dc\u001de,La\u0003\u007f{l,\f", "Adc\u001de,La\u0003\u007f{l,\f", "uE\u0018#", ">qT@f\u0016?T'~\n\u001d+|\u0010/g{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "@`f\u001cY-LS(", "5dc\u001fT>(T\u001a\rzm", "Adc\u001fT>(T\u001a\rzm", "@`f\u001cY-LS(=y^3|\u000b+t\u007f", "Aba<_3&c(~\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/Az}>\\CNA", "5dc g,Ia", "u(8", "Bgd:U\u001eBR(\u0002", "5dc![<FP\u000b\u0003ym/;\u0011+t\u007f5\u007f<\bd\u0011To\u0015<r35", "Adc![<FP\u000b\u0003ym/;\u0011+t\u007f5\u007f<\bd\u0011To\u0015<r35", "Bgd:U\u001eBR(\u00029],\u0004\t1a\u000f(", "BhR899:Q(\u0003\u0005g:", "", "5dc!\\*D4&zxm0\u0007\u0012=$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "u(J\u0013", "Bnc._\u001eBR(\u0002", "5dc!b;:Z\u000b\u0003ym/", "Adc!b;:Z\u000b\u0003ym/", "uH\u0018#", "Bnc._\u001eBR(\u00029],\u0004\t1a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "BqP0^\u000f>W\u001b\u0002\n", "5dc!e(<Y{~~`/\fG7a\u000f(\tD|\u001edA|\u000eCv!CY", "Adc!e(<Y{~~`/\fG7a\u000f(\tD|\u001edA|\u000eCv!CY", "BqP0^\u000f>W\u001b\u0002\n\u001d+|\u0010/g{7{", "<df#T3", "5dc#T3NS", "Adc#T3NS", "5dc#T3NS\u0006z\u0004`,", "u(;8b;EW\"H\bZ5~\t=/]/\u0006N\u0001\u0016wNy\nKz.7D\b$@|\u0003*VE;A", "D`[BX\u001aMO(~", "5dc#T3NS\u0007\u000evm,", "Adc#T3NS\u0007\u000evm,", "D`[BX\u001aMO(~9],\u0004\t1a\u000f(", "2hb=T;<V\u0006z\r=,\u0004\u0018+", "2d[AT", "2qP4", "2qP4C9B]&\u0003\nr", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0004tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "=m??X:L", ">nb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=m??X:L\u001b\u001fFIe\u0018Gpmm{7{M\u0005\u0013\u001e\u0015i\u001b<}%1g}", "uI\u0018#", "AbP9X\u001bH=\u001a\u007f\t^;", ";h]\u001dk", ";`g\u001dk", "CrT?I(Ec\u0019", "AbP9X\u001bHC'~\bO(\u0004\u0019/", "=eU@X;", "CoS.g,\u001dW!~\u0004l0\u0007\u0012=", "<df!e(<Y{~~`/\f", "<df!b;:Z\u000b\u0003ym/", "CoS.g,\u001dW!~\u0004l0\u0007\u0012=$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SliderState implements DraggableState {
    public static final int $stable = 8;
    private final DragScope dragScope;
    private final Function0<Unit> gestureEndAction;
    private final MutableState isDragging$delegate;
    private boolean isRtl;
    private Function1<? super Float, Unit> onValueChange;
    private Function0<Unit> onValueChangeFinished;
    private final MutableFloatState pressOffset$delegate;
    private final MutableFloatState rawOffset$delegate;
    private final MutatorMutex scrollMutex;
    private final int steps;
    private final MutableFloatState thumbWidth$delegate;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final MutableFloatState trackHeight$delegate;
    private final ClosedFloatingPointRange<Float> valueRange;
    private final MutableFloatState valueState$delegate;

    public SliderState() {
        this(0.0f, 0, null, null, 15, null);
    }

    public SliderState(float f2, int i2, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        this.steps = i2;
        this.onValueChangeFinished = function0;
        this.valueRange = closedFloatingPointRange;
        this.valueState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.tickFractions = SliderKt.stepsToTickFractions(i2);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.trackHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.thumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isDragging$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.gestureEndAction = new Function0<Unit>() { // from class: androidx.compose.material3.SliderState$gestureEndAction$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Function0<Unit> onValueChangeFinished;
                if (this.this$0.isDragging$material3_release() || (onValueChangeFinished = this.this$0.getOnValueChangeFinished()) == null) {
                    return;
                }
                onValueChangeFinished.invoke();
            }
        };
        this.rawOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(scaleToOffset(0.0f, 0.0f, f2));
        this.pressOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.SliderState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f3) {
                this.this$0.dispatchRawDelta(f3);
            }
        };
        this.scrollMutex = new MutatorMutex();
    }

    public final int getSteps() {
        return this.steps;
    }

    public final Function0<Unit> getOnValueChangeFinished() {
        return this.onValueChangeFinished;
    }

    public final void setOnValueChangeFinished(Function0<Unit> function0) {
        this.onValueChangeFinished = function0;
    }

    public /* synthetic */ SliderState(float f2, int i2, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 0.0f : f2, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? 0 : i2, (4 & i3) != 0 ? null : function0, (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange);
    }

    public final ClosedFloatingPointRange<Float> getValueRange() {
        return this.valueRange;
    }

    private final float getValueState() {
        return this.valueState$delegate.getFloatValue();
    }

    private final void setValueState(float f2) {
        this.valueState$delegate.setFloatValue(f2);
    }

    public final void setValue(float f2) {
        setValueState(SliderKt.snapValueToTick(RangesKt.coerceIn(f2, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final float getValue() {
        return getValueState();
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SliderState$drag$2, reason: invalid class name */
    /* JADX INFO: compiled from: Slider.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\f\n\u0006\b\u0016w\u001a\b\u001c\u000eM\u000f\u001e\u000e\u0015Ra", f = " 84..:t19", i = {}, l = {1972}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MutatePriority $dragPriority;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$dragPriority = mutatePriority;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SliderState.this.new AnonymousClass2(this.$dragPriority, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SliderState.this.setDragging(true);
                this.label = 1;
                if (SliderState.this.scrollMutex.mutateWith(SliderState.this.dragScope, this.$dragPriority, this.$block, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SliderState.this.setDragging(false);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public Object drag(MutatePriority mutatePriority, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(mutatePriority, function2, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f2) {
        float f3 = 2;
        float fMax = Math.max(getTotalWidth() - (getThumbWidth$material3_release() / f3), 0.0f);
        float fMin = Math.min(getThumbWidth$material3_release() / f3, fMax);
        setRawOffset(getRawOffset() + f2 + getPressOffset());
        setPressOffset(0.0f);
        float fScaleToUserValue = scaleToUserValue(fMin, fMax, SliderKt.snapValueToTick(getRawOffset(), this.tickFractions, fMin, fMax));
        if (fScaleToUserValue != getValue()) {
            Function1<? super Float, Unit> function1 = this.onValueChange;
            if (function1 == null) {
                setValue(fScaleToUserValue);
            } else if (function1 != null) {
                function1.invoke(Float.valueOf(fScaleToUserValue));
            }
        }
    }

    public final Function1<Float, Unit> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$material3_release(Function1<? super Float, Unit> function1) {
        this.onValueChange = function1;
    }

    public final float[] getTickFractions$material3_release() {
        return this.tickFractions;
    }

    private final int getTotalWidth() {
        return this.totalWidth$delegate.getIntValue();
    }

    private final void setTotalWidth(int i2) {
        this.totalWidth$delegate.setIntValue(i2);
    }

    public final boolean isRtl$material3_release() {
        return this.isRtl;
    }

    public final void setRtl$material3_release(boolean z2) {
        this.isRtl = z2;
    }

    public final float getTrackHeight$material3_release() {
        return this.trackHeight$delegate.getFloatValue();
    }

    public final void setTrackHeight$material3_release(float f2) {
        this.trackHeight$delegate.setFloatValue(f2);
    }

    public final float getThumbWidth$material3_release() {
        return this.thumbWidth$delegate.getFloatValue();
    }

    public final void setThumbWidth$material3_release(float f2) {
        this.thumbWidth$delegate.setFloatValue(f2);
    }

    public final float getCoercedValueAsFraction$material3_release() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), RangesKt.coerceIn(getValue(), this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z2) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging$material3_release() {
        return ((Boolean) this.isDragging$delegate.getValue()).booleanValue();
    }

    public final void updateDimensions$material3_release(float f2, int i2) {
        setTrackHeight$material3_release(f2);
        setTotalWidth(i2);
    }

    public final Function0<Unit> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    /* JADX INFO: renamed from: onPress-k-4lQ0M$material3_release, reason: not valid java name */
    public final void m2543onPressk4lQ0M$material3_release(long j2) {
        setPressOffset((this.isRtl ? getTotalWidth() - Offset.m3937getXimpl(j2) : Offset.m3937getXimpl(j2)) - getRawOffset());
    }

    private final float getRawOffset() {
        return this.rawOffset$delegate.getFloatValue();
    }

    private final void setRawOffset(float f2) {
        this.rawOffset$delegate.setFloatValue(f2);
    }

    private final float getPressOffset() {
        return this.pressOffset$delegate.getFloatValue();
    }

    private final void setPressOffset(float f2) {
        this.pressOffset$delegate.setFloatValue(f2);
    }

    private final float scaleToUserValue(float f2, float f3, float f4) {
        return SliderKt.scale(f2, f3, f4, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    private final float scaleToOffset(float f2, float f3, float f4) {
        return SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), f4, f2, f3);
    }
}
