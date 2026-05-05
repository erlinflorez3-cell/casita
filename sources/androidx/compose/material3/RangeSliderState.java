package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4B\u0007\":\u0018\u007fјnjO0LeV.Zݷ2\u000f\u0002{<$a@yCQU\"}0\u0012WNmwvJp\u000bK\u000f\f+\u0001j:[]xc*\u00157Xģo3{n}|pz<\u0005.2:8(\u0006\u0011 0H\u001ex\u0013Cy\r\"6FqHU%M3\u001e\"\u0014D \u000f#to^8Xl\fAE\"1oRZ-_>\u0005e\u0013VV7\r%bL4Ë;5#/\u001c\u001e\u00156s?1F\"A\u0013M?'Yr$[D>\u0018\u0014C,\u0016Օǁv&bk\u001a~\u001a\u000fCO\u0012L\u0001\u00126/\u0013{;=4\u0012\u0014Z`.[\u001b\u0017\f\u001c\u001c\rr\u0002A\u0017\u0002'j\u000edy6Ea079p3f\u007fbk\u001d\\j\u0014\u0005;\u001fS\u0005|\u0007sT<\u001d[\u001bȑv\u0383śUBC3\\u\"H{p\tb01J\u0382Ͻ\u0004/\u0002~~939s9Q\"\u001c\u0006VO\u007fv3a\u001f\u0018(\u0017\u001f؞.å\u001aAB\u000b\u0012fRq%mVbf;av*e\u001f}6\u0014P`\u0006L9%>O\u0006)(+$έܒ%çjGapq\"eNv5;cq\u001d\u0002T|'MK3'ffZS:[\r,0=`j>x2\t\rPiԼKۇ >D3\u001fr#U# HX\u000b\u00180\u0004v(\u0017Ta%3m2\u0005!\u0001~]'0&9 ؖʘ`Ę1QY7\u001fAc7\u00016\u0003<\u0015\f\u0014\u0002M\u0002ZV\u001d~$\u0012m{N\u0017Pw(Ǿ?т\u0013\u0003A4\bJSYCw_k*')}0M\u0012Ý0Թ\fn\t.f\nX\\%)0\u0017vrQ\f\u001b>PӔHیKgl\ra_W\u0015S\u0003JqP|3 N)\u000f\u007f:|c.ye[TNҢٻ\u0015˸ayw0\u007f\t\u001d;\rg\nPq#\u0010dW\u0003@J\tgg&V.4n\u0013Bv\u0014\b\nR\tb\u0014ap\u0018Эrެ<S\u0013ɀ\u0016h\rV\u001b\u001c'\u0005H?\b}bW\u0010.\u0002S\u0016\u0014\rl[O\f\u0012>ƛ\u07bdKů\u000fZ\u0017\f\u0011-?!*\u001eCMd\u0006\u0003\u000b65\u0002H\u0007jI\u0016\u001d<7%d0J\u0018#C\u0003j<P9@\u001dܭʤ\u0017ЋF\u0004CX\u0014\u000b\u0007qnJ\u000b\u0015SmA,\u00074\u001dBn\"Ch\u001dmtU_g@\u0011k\u001d7\u001c!\u0010='{ŀ\u05ebTۆ\u001f8`\u0003\u0011\u007fkXa\u0004<<U6\u000emuEF'MCPS3Ga\u0013ov^\u001b\u001bWtN\u0013}(e\u0001vxė\u000bҶ\u0001\u001aD߽'\r\u001f\r\u0001\u001b\u0003/R\r\u0006v\u0014:\u000f\u001c\\1\u0017\u000e\rct\"C\u0005c3\u0014Ɲv͂+\b_ėS\u007f\u000e`.h$v'\u001feQ73k_R\u0016 \u0017\u0013\u0006\u0017#h 2/\u000131H\u0005û˕Oױ7\u0012\u001b`_3\u00066X)12\u0014Okj~Pq{4\u0018cS\u001bf_W*r;`5\tUNdQ\u0017\u0019\u0011Ïֵ Ǩ\u0015\u0010\u001c\u0017,jD\u001dz+\u0016\u0019qu\u0011mU&\u001b:\u007f}8.I0\u0001\"4]PǢ\u0006ցX,-=\\\u001bL\u0007Y\u0006z\u0011o\u000e\rkXh\u0003\u001cA\u0014+\u007f~\u001dOQ\u000bЙހ\u001eҮ3G!!a^Uu\u001f\u0006K\u00194.QTEkEA[~6y)\u0003hf߰\u00040Jռ\u000b\u0002m~;h%O(zq$\u001c9YͺMԺ<H\u0010ϴ)\u0010\u0017\u0005h\u000fpgjq4;\u007f7q\u001d\u001f\u0011-84s=Ws)(ƛІ*ʫ\u0001\u0011\u0015A\u007f\ry\u0017\f9x{=1\u0010\u001d]@I\u007f\u0006\u000fZ\u0005$\u0002\u0014K/Qqf'aZJk\u0004\\8,ʯ£\nڍ(4\u000ew)`SF`,e;Nc\u0014Y\n\u00068E?Y1O\u0005~\u0004\f<iFt\u0013dɈ8G\u0003߭1FD\f;O؎ERp|\u0011ޯ)s\u0013ʇ\u0013t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!>[}\u000e>q\u0015.Z1JgC\u001ej", "", "/bc6i,+O\"\u0001zL;x\u0016>", "", "/bc6i,+O\"\u0001z>5{", "AsT=f", "", "=mE._<>1\u001cz\u0004`,]\r8i\u000e+{?", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "D`[BX\u0019:\\\u001b~", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?a\u001e!C~\u0012Ex\u0010?]\u0007/$i\u001f0M\u0019", "uE5\u0016?2Hb \u0003\u0004(1\u000e\u0011xf\u00101yO\u0005! U9nL\u007f#D]\b)\u0002C|4WRBo=g\"dj;\u0007qu,}1ULM\rc\\nL\u0018\u001b\\xX/\u0016\u0014F=-pD\rbx", "<df#T3", "5dc\u000eV;Bd\u0019kvg.|h8d", "u(5", "Adc\u000eV;Bd\u0019kvg.|h8d", "uE\u0018#", "\nrTA \u0006\u0017", "/bc6i,+O\"\u0001z>5{v>a\u000f(", "5dc\u000eV;Bd\u0019kvg.|h8dm7wO\u0001", "Adc\u000eV;Bd\u0019kvg.|h8dm7wO\u0001", "/bc6i,+O\"\u0001z>5{v>a\u000f(:?\u0001\u001e\u0017Ik\u001d<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "5dc\u000eV;Bd\u0019kvg.|v>a\r7", "Adc\u000eV;Bd\u0019kvg.|v>a\r7", "/bc6i,+O\"\u0001zL;x\u0016>S\u000f$\u000b@", "5dc\u000eV;Bd\u0019kvg.|v>a\r7iO|&\u0017", "Adc\u000eV;Bd\u0019kvg.|v>a\r7iO|&\u0017", "/bc6i,+O\"\u0001zL;x\u0016>S\u000f$\u000b@?\u0016\u0017No\u00108\u0006%", "1nT?V,=/\u0017\u000e~o,i\u00058g\u007f\b\u0005?\\%wTk\fKz/>", "5dc\u0010b,KQ\u0019}V\\;\u0001\u001a/R{1}@` \u0016#}nIr#D]\b)uu\u0012=MP?g;k\u000fua@\u0007_:N", "1nT?V,=/\u0017\u000e~o,i\u00058g\u007f\u0016\u000b<\u000e&rUP\u001b8t49c\u0007", "5dc\u0010b,KQ\u0019}V\\;\u0001\u001a/R{1}@n&\u0013T~iJW21W\r$AvT6IR;x8\u001a\u001c6[F\u0007j,J\u0005'", "3mS g,Ia", "5dc\u0012a+,b\u0019\n\t\u001d4x\u0018/r\u0004$\u0003\u000ez$\u0017No\nJv", "u(8", "3mS![<FP\u000b\u0003ym/", "5dc\u0012a+-V)\u0007wP0{\u00182$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "Adc\u0012a+-V)\u0007wP0{\u00182$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "3mS![<FP\u000b\u0003ym/;\b/l\u007f*wO\u0001", "5dbAh9>3\"}V\\;\u0001\u00138", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u0014X:Mc&~Zg+X\u0007>i\n1:H|&\u0017Ts\nCD\u001fBY\u0005 3{\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "7rAA_", "7rAA_jFO(~\bb(\u0004V)r\u007f/{<\u000f\u0017", "u(I", "Adc\u001fg3|[\u0015\u000ezk0x\u0010|_\r(\u0003@|%\u0017", "uY\u0018#", "7rAA_j=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ";`g\u001dk", "5dc\u001aT?)f", "Adc\u001aT?)f", ";`g\u001dkj=S ~|Z;|", ";h]\u001dk", "5dc\u001a\\5)f", "Adc\u001a\\5)f", ";h]\u001dkj=S ~|Z;|", "=mE._<>1\u001cz\u0004`,", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d,9X}-$i\u001f0M\u0019", "5dc\u001ca\u001d:Z)~Xa(\u0006\u000b/$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "Adc\u001ca\u001d:Z)~Xa(\u0006\u000b/$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u001ca\u001d:Z)~Xa(\u0006\u000b/F\u00041\u007fN\u0004\u0017\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u001ca\u001d:Z)~Xa(\u0006\u000b/F\u00041\u007fN\u0004\u0017\u0016", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "@`f\u001cY-LS(^\u0004]", "5dc\u001fT>(T\u001a\rzm\f\u0006\bmm{7{M\u0005\u0013\u001e\u0015i\u001b<}%1g}", "Adc\u001fT>(T\u001a\rzm\f\u0006\bmm{7{M\u0005\u0013\u001e\u0015i\u001b<}%1g}", "@`f\u001cY-LS(^\u0004]j{\t6e\u0002$\u000b@", "@`f\u001cY-LS(l\nZ9\f", "5dc\u001fT>(T\u001a\rzm\u001a\f\u0005<t>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "Adc\u001fT>(T\u001a\rzm\u001a\f\u0005<t>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "@`f\u001cY-LS(l\nZ9\fG.e\u0007(}<\u0010\u0017", "AsP?g\u001aMS$\r", "5dc g(Kb\u0007\u000ezi:;\u0011+t\u007f5\u007f<\bd\u0011To\u0015<r35", "AsP?g\u001bAc!{lb+\f\f", "5dc g(Kb\b\u0002\u000bf)n\r.t\u0003f\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", "Adc g(Kb\b\u0002\u000bf)n\r.t\u0003f\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", "AsP?g\u001bAc!{lb+\f\fmd\u007f/{B|&\u0017", "5dc g,Ia", "BhR899:Q(\u0003\u0005g:", "", "5dc!\\*D4&zxm0\u0007\u0012=$\b$\u000b@\u000e\u001b\u0013N=\bIv,5U\f ", "u(J\u0013", "Bnc._\u001eBR(\u0002", "5dc!b;:Z\u000b\u0003ym/;\u0011+t\u007f5\u007f<\bd\u0011To\u0015<r35", "Adc!b;:Z\u000b\u0003ym/;\u0011+t\u007f5\u007f<\bd\u0011To\u0015<r35", "uH\u0018#", "Bnc._\u001eBR(\u00029],\u0004\t1a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "BqP0^\u000f>W\u001b\u0002\n", "5dc!e(<Y{~~`/\fG7a\u000f(\tD|\u001edA|\u000eCv!CY", "Adc!e(<Y{~~`/\fG7a\u000f(\tD|\u001edA|\u000eCv!CY", "BqP0^\u000f>W\u001b\u0002\n\u001d+|\u0010/g{7{", "5dc#T3NS\u0006z\u0004`,", "u(;8b;EW\"H\bZ5~\t=/]/\u0006N\u0001\u0016wNy\nKz.7D\b$@|\u0003*VE;A", "=m3?T.", "7rBAT9M", "=eU@X;", "=m3?T.|[\u0015\u000ezk0x\u0010|_\r(\u0003@|%\u0017", "AbP9X\u001bH=\u001a\u007f\t^;", "CrT?I(Ec\u0019", "AbP9X\u001bHC'~\bO(\u0004\u0019/", "AbP9X\u001bHC'~\bO(\u0004\u0019/-\n:lB\u000ffv", "uE5\u0017\u001c\u0011", "CoS.g,&W\"fvq\u0017\u0010", "CoS.g,&W\"fvq\u0017\u0010G7a\u000f(\tD|\u001edA|\u000eCv!CY", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RangeSliderState {
    public static final int $stable = 8;
    private final MutableFloatState activeRangeEndState$delegate;
    private final MutableFloatState activeRangeStartState$delegate;
    private final MutableFloatState endThumbWidth$delegate;
    private final Function1<Boolean, Unit> gestureEndAction;
    private final MutableState isRtl$delegate;
    private final MutableFloatState maxPx$delegate;
    private final MutableFloatState minPx$delegate;
    private Function1<? super SliderRange, Unit> onValueChange;
    private Function0<Unit> onValueChangeFinished;
    private final MutableFloatState rawOffsetEnd$delegate;
    private final MutableFloatState rawOffsetStart$delegate;
    private final MutableFloatState startThumbWidth$delegate;
    private final int steps;
    private final float[] tickFractions;
    private final MutableIntState totalWidth$delegate;
    private final MutableFloatState trackHeight$delegate;
    private final ClosedFloatingPointRange<Float> valueRange;

    public RangeSliderState() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    public RangeSliderState(float f2, float f3, int i2, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        this.steps = i2;
        this.onValueChangeFinished = function0;
        this.valueRange = closedFloatingPointRange;
        this.activeRangeStartState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.activeRangeEndState$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
        this.tickFractions = SliderKt.stepsToTickFractions(i2);
        this.trackHeight$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.startThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.endThumbWidth$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.totalWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.rawOffsetStart$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.rawOffsetEnd$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isRtl$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.gestureEndAction = new Function1<Boolean, Unit>() { // from class: androidx.compose.material3.RangeSliderState$gestureEndAction$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2) {
                Function0<Unit> onValueChangeFinished = this.this$0.getOnValueChangeFinished();
                if (onValueChangeFinished != null) {
                    onValueChangeFinished.invoke();
                }
            }
        };
        this.maxPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minPx$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
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

    public /* synthetic */ RangeSliderState(float f2, float f3, int i2, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 0.0f : f2, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? 1.0f : f3, (4 & i3) != 0 ? 0 : i2, (i3 + 8) - (8 | i3) != 0 ? null : function0, (i3 + 16) - (i3 | 16) != 0 ? RangesKt.rangeTo(0.0f, 1.0f) : closedFloatingPointRange);
    }

    public final ClosedFloatingPointRange<Float> getValueRange() {
        return this.valueRange;
    }

    private final float getActiveRangeStartState() {
        return this.activeRangeStartState$delegate.getFloatValue();
    }

    private final void setActiveRangeStartState(float f2) {
        this.activeRangeStartState$delegate.setFloatValue(f2);
    }

    private final float getActiveRangeEndState() {
        return this.activeRangeEndState$delegate.getFloatValue();
    }

    private final void setActiveRangeEndState(float f2) {
        this.activeRangeEndState$delegate.setFloatValue(f2);
    }

    public final void setActiveRangeStart(float f2) {
        setActiveRangeStartState(SliderKt.snapValueToTick(RangesKt.coerceIn(f2, this.valueRange.getStart().floatValue(), getActiveRangeEnd()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final float getActiveRangeStart() {
        return getActiveRangeStartState();
    }

    public final void setActiveRangeEnd(float f2) {
        setActiveRangeEndState(SliderKt.snapValueToTick(RangesKt.coerceIn(f2, getActiveRangeStart(), this.valueRange.getEndInclusive().floatValue()), this.tickFractions, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue()));
    }

    public final float getActiveRangeEnd() {
        return getActiveRangeEndState();
    }

    public final Function1<SliderRange, Unit> getOnValueChange$material3_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$material3_release(Function1<? super SliderRange, Unit> function1) {
        this.onValueChange = function1;
    }

    public final float[] getTickFractions$material3_release() {
        return this.tickFractions;
    }

    public final float getTrackHeight$material3_release() {
        return this.trackHeight$delegate.getFloatValue();
    }

    public final void setTrackHeight$material3_release(float f2) {
        this.trackHeight$delegate.setFloatValue(f2);
    }

    public final float getStartThumbWidth$material3_release() {
        return this.startThumbWidth$delegate.getFloatValue();
    }

    public final void setStartThumbWidth$material3_release(float f2) {
        this.startThumbWidth$delegate.setFloatValue(f2);
    }

    public final float getEndThumbWidth$material3_release() {
        return this.endThumbWidth$delegate.getFloatValue();
    }

    public final void setEndThumbWidth$material3_release(float f2) {
        this.endThumbWidth$delegate.setFloatValue(f2);
    }

    public final int getTotalWidth$material3_release() {
        return this.totalWidth$delegate.getIntValue();
    }

    public final void setTotalWidth$material3_release(int i2) {
        this.totalWidth$delegate.setIntValue(i2);
    }

    public final float getRawOffsetStart$material3_release() {
        return this.rawOffsetStart$delegate.getFloatValue();
    }

    public final void setRawOffsetStart$material3_release(float f2) {
        this.rawOffsetStart$delegate.setFloatValue(f2);
    }

    public final float getRawOffsetEnd$material3_release() {
        return this.rawOffsetEnd$delegate.getFloatValue();
    }

    public final void setRawOffsetEnd$material3_release(float f2) {
        this.rawOffsetEnd$delegate.setFloatValue(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRtl$material3_release() {
        return ((Boolean) this.isRtl$delegate.getValue()).booleanValue();
    }

    public final void setRtl$material3_release(boolean z2) {
        this.isRtl$delegate.setValue(Boolean.valueOf(z2));
    }

    public final Function1<Boolean, Unit> getGestureEndAction$material3_release() {
        return this.gestureEndAction;
    }

    private final float getMaxPx() {
        return this.maxPx$delegate.getFloatValue();
    }

    private final void setMaxPx(float f2) {
        this.maxPx$delegate.setFloatValue(f2);
    }

    private final float getMinPx() {
        return this.minPx$delegate.getFloatValue();
    }

    private final void setMinPx(float f2) {
        this.minPx$delegate.setFloatValue(f2);
    }

    public final void onDrag$material3_release(boolean z2, float f2) {
        long jSliderRange;
        if (z2) {
            setRawOffsetStart$material3_release(getRawOffsetStart$material3_release() + f2);
            setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
            float rawOffsetEnd$material3_release = getRawOffsetEnd$material3_release();
            jSliderRange = SliderKt.SliderRange(SliderKt.snapValueToTick(RangesKt.coerceIn(getRawOffsetStart$material3_release(), getMinPx(), rawOffsetEnd$material3_release), this.tickFractions, getMinPx(), getMaxPx()), rawOffsetEnd$material3_release);
        } else {
            setRawOffsetEnd$material3_release(getRawOffsetEnd$material3_release() + f2);
            setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            float rawOffsetStart$material3_release = getRawOffsetStart$material3_release();
            jSliderRange = SliderKt.SliderRange(rawOffsetStart$material3_release, SliderKt.snapValueToTick(RangesKt.coerceIn(getRawOffsetEnd$material3_release(), rawOffsetStart$material3_release, getMaxPx()), this.tickFractions, getMinPx(), getMaxPx()));
        }
        long jM2413scaleToUserValueowVgs5E = m2413scaleToUserValueowVgs5E(getMinPx(), getMaxPx(), jSliderRange);
        if (!SliderRange.m2535equalsimpl0(jM2413scaleToUserValueowVgs5E, SliderKt.SliderRange(getActiveRangeStart(), getActiveRangeEnd()))) {
            Function1<? super SliderRange, Unit> function1 = this.onValueChange;
            if (function1 == null) {
                setActiveRangeStart(SliderRange.m2537getStartimpl(jM2413scaleToUserValueowVgs5E));
                setActiveRangeEnd(SliderRange.m2536getEndInclusiveimpl(jM2413scaleToUserValueowVgs5E));
            } else if (function1 != null) {
                function1.invoke(SliderRange.m2532boximpl(jM2413scaleToUserValueowVgs5E));
            }
        }
    }

    public final float getCoercedActiveRangeStartAsFraction$material3_release() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeStart());
    }

    public final float getCoercedActiveRangeEndAsFraction$material3_release() {
        return SliderKt.calcFraction(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), getActiveRangeEnd());
    }

    public final int getStartSteps$material3_release() {
        return (int) Math.floor(this.steps * getCoercedActiveRangeEndAsFraction$material3_release());
    }

    public final int getEndSteps$material3_release() {
        return (int) Math.floor(this.steps * (1.0f - getCoercedActiveRangeStartAsFraction$material3_release()));
    }

    /* JADX INFO: renamed from: scaleToUserValue-owVgs5E, reason: not valid java name */
    private final long m2413scaleToUserValueowVgs5E(float f2, float f3, long j2) {
        return SliderKt.m2525scaleziovWd0(f2, f3, j2, this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue());
    }

    private final float scaleToOffset(float f2, float f3, float f4) {
        return SliderKt.scale(this.valueRange.getStart().floatValue(), this.valueRange.getEndInclusive().floatValue(), f4, f2, f3);
    }

    public final void updateMinMaxPx$material3_release() {
        float f2 = 2;
        float fMax = Math.max(getTotalWidth$material3_release() - (getEndThumbWidth$material3_release() / f2), 0.0f);
        float fMin = Math.min(getStartThumbWidth$material3_release() / f2, fMax);
        if (getMinPx() != fMin || getMaxPx() != fMax) {
            setMinPx(fMin);
            setMaxPx(fMax);
            setRawOffsetStart$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeStart()));
            setRawOffsetEnd$material3_release(scaleToOffset(getMinPx(), getMaxPx(), getActiveRangeEnd()));
        }
    }
}
