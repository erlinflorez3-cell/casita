package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~(,\u001aw\u001dfr96EmHDR[*\u0015p\u00044:[,qI@]\u001a\u0014\"\u0011ѧVg}nRZ\u0011F\u0017\u0006,xr,OV\u0001](\u000f:ԏw?IMwމA`\u000b6\rړ:\"Ny\r\u0001 0P\u0010\u0005zKK\u0012\u00128@\u0007:Z\rc\u0005\"\u0012\f>(\u00014\\oޮ>H\u0003]Bǂ+\u0003wKV'e3\u0003ձ#Ͽ\u0005/\u001dzq A?e5C$\u0004\u00035S\u0014@C\u00014}\bص+'9K<uDv\u0018\u0014C+\u007f\u0011k\u0012>\\3q\u0011\u00105<gcy`>,\u0006\u0004\u0014\rj\fT\u0006o^<N2f6\u000ecx\u0001dXP0nr\u0004\tjN\u0017S\by+\u0002Itsy;GNg\u007f\u001306#/\u0013Q_b3x\u0015Iz(U?xX=vv:]K\u0017\u001cp\u0011,ň\u0003\u0382Ͻ\u00041\u0002<<CmUif;!\u001a\u0006xHu%\u001d`\u0017W\u001aVVo:nD;Z\r\u001a\u000b\\d3o\u0017h!:\u001f~4T5\u00188\u0017.e\u0010<O-VN\u0018vw\u001de]8X_jEt\u0007k<[\u007fr{U_\u0018(a\u0001*DTJ\u0018\u001divDc\f\tt8$BH\u0019C&2ΌR\f\u0019i\u0006ڧ\"|P?Qt\u0015v6NFO6!_\t#@\u0003bn<\u0003\u0018`%\r\u000f\u000etp\u001e&)M:<x\"[\u007f\"G')m\"\u001783w]ѿuõKkdIRq${&).\u001f2;g.k\u001b?\u000579\u001a/[K!m\b\u000ePgQۣȹ\u000f³l>o\np~:o\u0003LU^%-\u0017`x/\u0016qP'oW\u0013IyS9knO\u0001\nq>d7+\u0015U^cAFܵī5ԩG7%\u0018}*=$y_o\u0002<\r\u0003\u0011,\ts\u0019|o$\u0007zQ\fJ\u0012ͲU˕\u0003>*غ=\u0011Pa\u0003y\u001eA7NcΌTыhp^Е\u001e\u001f=\u0019~\tB\f\u001fV\u0012\u000fi̡\u007fӑ2cBuI\u001a\"{Ƽ%\u0016UVmƼ\ny[\u05ceNR"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u001a", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", "u(E", "4ha@g\u001aMO(~g^*\u0007\u0016.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "5dc\u0013\\9Lb\u0007\u000evm,i\t-o\r'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;R7z4\u000b\u0015fkF\u00069", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003\u001f\u001f\u0004:Y\u000f;L\n\u0017&\u001dC@", ";dP@h9>7\"\n\u000bm:", "5dc\u001aX(Lc&~^g7\r\u0018=", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju=v:V-R,cQY9(\u001cj\u001d<:\t\u0014Y\u001f lG7]o,E\u0010Ku\u0001o\u001f\u0019Ey~\u0018", "Adc\u001aX(Lc&~^g7\r\u0018=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6(PN3[9nQ\u001e\"i{]'\u001c\u00057=\"qDu\u0007\b(W\u0012Hhd\u0015!\u001eDxF\u0006G", ";dP@h9>7\"\n\u000bm:;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003 )\u0011\u0014I}Ix\u000e\fy\u0017@z\u007fP,", "<n]\u001aX(Lc&~^g7\r\u0018=", "5dc\u001bb5&S\u0015\r\u000bk,`\u0012:u\u000f6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju=v:V-R,cQY9(\u001cj\u001d<:\t\u0014Y\u001f lG7]p6Ri;d\u000f\u001c#\u000e\u0019s{Re\u001e\u001d", "Adc\u001bb5&S\u0015\r\u000bk,`\u0012:u\u000f6", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6(PN3[9nQ\u001e\"i{]'\u001c\u00057=\"qDu\b\u001251\u00027v\u0011\u0019\u0016q>u\u0001Qde\u000bj", "<n]\u001aX(Lc&~^g7\r\u0018=$~(\u0003@\u0003\u0013&G", "@dR<e+", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003\u0015\u001b\u0006/In;f\u000b\u0019\u0015c", "BdgA@,:a)\fzk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001dYy.Gz\u0016;#", "D`[BX", "5dc#T3NS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j", "1n\\=h;>:\u0015\u0013\u0005n;", "DhbBT3-S,\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006A/J\u0004\u0015GX^,ePr\u0013", "5dc\u001ce\nH[$\u000f\n^\u0013x\u001d9u\u000f", ":`h<h;0W(\u0002c^>d\t+s\u00105{$\n\"'V}", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":`h<h;0W(\u0002c^>d\t+s\u00105{$\n\"'V}U\u0004y\u0002%\\\t\u001e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016^5`a<$\u0010&d\u001e]\n\u0011\u0012Y?3rN@tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b8hYh)zQJT,\u000bn\u0015n}XB>+(0\u0006\u001bvZ5\u001b{`fW\u0016`cpF&\u0005<#Q7YPMz_Jtp/OE\u0007\u0012Eg>\u001at@\u0013\u001b&Jn\u0015ZT\u0018Ln\u007f$\u0002", ";da4X\u0019>Q#\fyl", ">qTC\\6Na", "1ta?X5M", "/o_9\\,=", "=ac.\\5-S,\u000eb^(\u000b\u0019<e\r", ">qT=X5=A(z\n^\u0019|\u00079r~", "", "CoS.g,\u001cO\u0017\u0002zB-n\u00163t{%\u0003@", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "CoS.g,']\"fzZ:\r\u0016/I\t3\fO\u000f", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "Ah]4_,%W\"~", "", "AnUAJ9:^", "\u0011`R5X\u0019>Q#\fy", "\u001bdP@h9>7\"\n\u000bm:", "\u001cn]\u001aX(Lc&~^g7\r\u0018=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {
    public static final int $stable = 0;
    private TextMeasurer textMeasurer;
    private final MutableState nonMeasureInputs$delegate = SnapshotStateKt.mutableStateOf(null, NonMeasureInputs.Companion.getMutationPolicy());
    private final MutableState measureInputs$delegate = SnapshotStateKt.mutableStateOf(null, MeasureInputs.Companion.getMutationPolicy());
    private CacheRecord record = new CacheRecord();

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return stateRecord3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NonMeasureInputs getNonMeasureInputs() {
        return (NonMeasureInputs) this.nonMeasureInputs$delegate.getValue();
    }

    private final void setNonMeasureInputs(NonMeasureInputs nonMeasureInputs) {
        this.nonMeasureInputs$delegate.setValue(nonMeasureInputs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MeasureInputs getMeasureInputs() {
        return (MeasureInputs) this.measureInputs$delegate.getValue();
    }

    private final void setMeasureInputs(MeasureInputs measureInputs) {
        this.measureInputs$delegate.setValue(measureInputs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public TextLayoutResult getValue() {
        MeasureInputs measureInputs;
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null || (measureInputs = getMeasureInputs()) == null) {
            return null;
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, boolean z3) {
        setNonMeasureInputs(new NonMeasureInputs(transformedTextFieldState, textStyle, z2, z3));
    }

    /* JADX INFO: renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m1545layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        MeasureInputs measureInputs = new MeasureInputs(density, layoutDirection, resolver, j2, null);
        setMeasureInputs(measureInputs);
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null) {
            throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs".toString());
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    private final TextLayoutResult getOrComputeLayout(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        CharSequence visualText;
        TextFieldCharSequence visualText2 = nonMeasureInputs.getTextFieldState().getVisualText();
        CacheRecord cacheRecord = (CacheRecord) SnapshotKt.current(this.record);
        TextLayoutResult layoutResult = cacheRecord.getLayoutResult();
        if (layoutResult != null && (visualText = cacheRecord.getVisualText()) != null && StringsKt.contentEquals(visualText, visualText2) && Intrinsics.areEqual(cacheRecord.m1546getCompositionMzsxiRA(), visualText2.m1445getCompositionMzsxiRA()) && cacheRecord.getSingleLine() == nonMeasureInputs.getSingleLine() && cacheRecord.getSoftWrap() == nonMeasureInputs.getSoftWrap() && cacheRecord.getLayoutDirection() == measureInputs.getLayoutDirection() && cacheRecord.getDensityValue() == measureInputs.getDensity().getDensity() && cacheRecord.getFontScale() == measureInputs.getDensity().getFontScale() && Constraints.m6584equalsimpl0(cacheRecord.m1547getConstraintsmsEJaDk(), measureInputs.m1550getConstraintsmsEJaDk()) && Intrinsics.areEqual(cacheRecord.getFontFamilyResolver(), measureInputs.getFontFamilyResolver()) && !layoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            TextStyle textStyle = cacheRecord.getTextStyle();
            boolean zHasSameLayoutAffectingAttributes = textStyle != null ? textStyle.hasSameLayoutAffectingAttributes(nonMeasureInputs.getTextStyle()) : false;
            TextStyle textStyle2 = cacheRecord.getTextStyle();
            boolean zHasSameDrawAffectingAttributes = textStyle2 != null ? textStyle2.hasSameDrawAffectingAttributes(nonMeasureInputs.getTextStyle()) : false;
            if (zHasSameLayoutAffectingAttributes && zHasSameDrawAffectingAttributes) {
                return layoutResult;
            }
            if (zHasSameLayoutAffectingAttributes) {
                return TextLayoutResult.m6093copyO0kMr_c$default(layoutResult, new TextLayoutInput(layoutResult.getLayoutInput().getText(), nonMeasureInputs.getTextStyle(), layoutResult.getLayoutInput().getPlaceholders(), layoutResult.getLayoutInput().getMaxLines(), layoutResult.getLayoutInput().getSoftWrap(), layoutResult.getLayoutInput().m6092getOverflowgIe3tQ8(), layoutResult.getLayoutInput().getDensity(), layoutResult.getLayoutInput().getLayoutDirection(), layoutResult.getLayoutInput().getFontFamilyResolver(), layoutResult.getLayoutInput().m6091getConstraintsmsEJaDk(), (DefaultConstructorMarker) null), 0L, 2, null);
            }
        }
        TextLayoutResult textLayoutResultComputeLayout = computeLayout(visualText2, nonMeasureInputs, measureInputs);
        if (!Intrinsics.areEqual(textLayoutResultComputeLayout, layoutResult)) {
            Snapshot current = Snapshot.Companion.getCurrent();
            if (!current.getReadOnly()) {
                CacheRecord cacheRecord2 = this.record;
                synchronized (SnapshotKt.getLock()) {
                    CacheRecord cacheRecord3 = (CacheRecord) SnapshotKt.writableRecord(cacheRecord2, this, current);
                    cacheRecord3.setVisualText(visualText2);
                    cacheRecord3.m1548setCompositionOEnZFl4(visualText2.m1445getCompositionMzsxiRA());
                    cacheRecord3.setSingleLine(nonMeasureInputs.getSingleLine());
                    cacheRecord3.setSoftWrap(nonMeasureInputs.getSoftWrap());
                    cacheRecord3.setTextStyle(nonMeasureInputs.getTextStyle());
                    cacheRecord3.setLayoutDirection(measureInputs.getLayoutDirection());
                    cacheRecord3.setDensityValue(measureInputs.getDensityValue());
                    cacheRecord3.setFontScale(measureInputs.getFontScale());
                    cacheRecord3.m1549setConstraintsBRTryo0(measureInputs.m1550getConstraintsmsEJaDk());
                    cacheRecord3.setFontFamilyResolver(measureInputs.getFontFamilyResolver());
                    cacheRecord3.setLayoutResult(textLayoutResultComputeLayout);
                    Unit unit = Unit.INSTANCE;
                }
                SnapshotKt.notifyWrite(current, this);
            }
        }
        return textLayoutResultComputeLayout;
    }

    private final void updateCacheIfWritable(Function1<? super CacheRecord, Unit> function1) {
        Snapshot current = Snapshot.Companion.getCurrent();
        if (!current.getReadOnly()) {
            CacheRecord cacheRecord = this.record;
            synchronized (SnapshotKt.getLock()) {
                try {
                    function1.invoke(SnapshotKt.writableRecord(cacheRecord, this, current));
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            SnapshotKt.notifyWrite(current, this);
        }
    }

    private final TextMeasurer obtainTextMeasurer(MeasureInputs measureInputs) {
        TextMeasurer textMeasurer = this.textMeasurer;
        if (textMeasurer != null) {
            return textMeasurer;
        }
        TextMeasurer textMeasurer2 = new TextMeasurer(measureInputs.getFontFamilyResolver(), measureInputs.getDensity(), measureInputs.getLayoutDirection(), 1);
        this.textMeasurer = textMeasurer2;
        return textMeasurer2;
    }

    private final TextLayoutResult computeLayout(TextFieldCharSequence textFieldCharSequence, NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        TextMeasurer textMeasurerObtainTextMeasurer = obtainTextMeasurer(measureInputs);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(textFieldCharSequence.toString());
        if (textFieldCharSequence.m1445getCompositionMzsxiRA() != null) {
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), TextRange.m6121getMinimpl(textFieldCharSequence.m1445getCompositionMzsxiRA().m6127unboximpl()), TextRange.m6120getMaximpl(textFieldCharSequence.m1445getCompositionMzsxiRA().m6127unboximpl()));
        }
        return TextMeasurer.m6099measurexDpz5zY$default(textMeasurerObtainTextMeasurer, builder.toAnnotatedString(), nonMeasureInputs.getTextStyle(), 0, nonMeasureInputs.getSoftWrap(), nonMeasureInputs.getSingleLine() ? 1 : Integer.MAX_VALUE, null, measureInputs.m1550getConstraintsmsEJaDk(), measureInputs.getLayoutDirection(), measureInputs.getDensity(), measureInputs.getFontFamilyResolver(), false, PhotoshopDirectory.TAG_XMP_DATA, null);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.record;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.record = (CacheRecord) stateRecord;
    }

    /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?4LeV3ZS0\u0012s{J$c$wICU0}*\tUQog\u0005Jb\u000bI\u0012\u000e\u0016\u0007s4I[~e\u0012%2JoE6UoKDht<\b(208\u0002\u0005\u0007\u001b2H\u001e\u0003\u0003ŏQ\f(ؓpphQMPŋ\u001e\u0012\u0014>h\u000f,\u001b\u007fNd\b\u001daHo;\u0003\u0018A\u0015;(6\u000b\u000f%F\u0003&S\u000b*$9\u0003O5Ch\u001a\u0017Wri@\u001bA\b<3j}ݗ7˗rɎΥW~Џ\u00197WՕut,_\u0013U\u0001\u000e-0]i\u001cp\u001c/\u0010z*\u0015\u0013ǐ\u001aϳ&Ξό,\u0019Ǵ\f\u001c;t\u0001`XR\bgP\n\u001bc<\"3\f\u0004CG)~Q\u0010JoגC߉\t\u0019&ŀ\u0019p'kb\u001f\u0001\u0017!f\u0006d\u0002kNQ`P Xk\u0003Z͖n͆.\u00108Ϛ\u00181\u0002'<.E9aQ1:<\u001aV^\u007fv3o?\u05ccuʐLL*Â.90$\u001akdf\u000b\b^g)F\u001fj4V\u001d|61vφ\u0004˶%1\u0018ʚgjo\n[}*'5\bE{?\u0006\u001czQ`I4\u007f\bfЧ^λ\u0018KDϵ\u001dZlga2z^.I@p;(\u0006%\\N:=\tŴ}ʬ889ǉt\u0017N.,na~\u000f\rh\u0017`\u0017bb<\u0003\u0018NKծ\r˩`|wΟ\u0011K2-nNMCWf'T&<vf\u0015%\u001d}\"3\u001eьXܤPx\u001e߯m}&J(nq1CI\u001d6yL\u0010e]N\td\u007f\u0007h\u0604\u0007܃}\u001bCÜFi\u000e%~g\u0001lP\fbTǴvgz&\u000e\u070f\u001c(`NzM\u0003ӣ\u000f "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003\u0015\u001b\u0006/In;f\u000b\u0019\u0015c", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "u(E", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc\u0010b4I]'\u0003\nb6\u0006P\u0017z\u000e;\u007f-\\", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhj\u001c@o\u0016\u0004", "Adc\u0010b4I]'\u0003\nb6\u0006P\u0019E\t\u001d\\GO", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8DFy)9mkq>", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "Adc\u0010b5Lb&z~g;\u000bP\fRn5\u0010JK", "uI\u0018#", "\u0018", "2d]@\\;RD\u0015\u0006\u000b^", "", "5dc\u0011X5LW(\u0013kZ3\r\t", "u(5", "Adc\u0011X5LW(\u0013kZ3\r\t", "uE\u0018#", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "5dc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rH\\\u0002hoC\u000et,[L", "Adc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007fr\u000b\u0015vk@\u0018c9$:\u0018", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "Adc\u0013b5MA\u0017z\u0002^", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", ":`h<h;+S'\u000f\u0002m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "5dc\u0019T@Hc(kzl<\u0004\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j", "Adc\u0019T@Hc(kzl<\u0004\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCsXY", "Ah]4_,%W\"~", "", "5dc \\5@Z\u0019e~g,", "u(I", "Adc \\5@Z\u0019e~g,", "uY\u0018#", "AnUAJ9:^", "5dc b-ME&z\u0006", "Adc b-ME&z\u0006", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "5dc!X?MA(\u0013\u0002^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u0004", "Adc!X?MA(\u0013\u0002^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8DG\r4>mkq>", "DhbBT3-S,\u000e", "", "5dc#\\:NO mzq;", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "Adc#\\:NO mzq;", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001d3~", "/rb6Z5", "", "D`[BX", "1qT.g,", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class CacheRecord extends StateRecord {
        private TextRange composition;
        private FontFamily.Resolver fontFamilyResolver;
        private LayoutDirection layoutDirection;
        private TextLayoutResult layoutResult;
        private boolean singleLine;
        private boolean softWrap;
        private TextStyle textStyle;
        private CharSequence visualText;
        private float densityValue = Float.NaN;
        private float fontScale = Float.NaN;
        private long constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

        public final CharSequence getVisualText() {
            return this.visualText;
        }

        public final void setVisualText(CharSequence charSequence) {
            this.visualText = charSequence;
        }

        /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
        public final TextRange m1546getCompositionMzsxiRA() {
            return this.composition;
        }

        /* JADX INFO: renamed from: setComposition-OEnZFl4, reason: not valid java name */
        public final void m1548setCompositionOEnZFl4(TextRange textRange) {
            this.composition = textRange;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final void setTextStyle(TextStyle textStyle) {
            this.textStyle = textStyle;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final void setSingleLine(boolean z2) {
            this.singleLine = z2;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public final void setSoftWrap(boolean z2) {
            this.softWrap = z2;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final void setDensityValue(float f2) {
            this.densityValue = f2;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public final void setFontScale(float f2) {
            this.fontScale = f2;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final void setFontFamilyResolver(FontFamily.Resolver resolver) {
            this.fontFamilyResolver = resolver;
        }

        /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1547getConstraintsmsEJaDk() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: setConstraints-BRTryo0, reason: not valid java name */
        public final void m1549setConstraintsBRTryo0(long j2) {
            this.constraints = j2;
        }

        public final TextLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public final void setLayoutResult(TextLayoutResult textLayoutResult) {
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new CacheRecord();
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.visualText = cacheRecord.visualText;
            this.composition = cacheRecord.composition;
            this.textStyle = cacheRecord.textStyle;
            this.singleLine = cacheRecord.singleLine;
            this.softWrap = cacheRecord.softWrap;
            this.densityValue = cacheRecord.densityValue;
            this.fontScale = cacheRecord.fontScale;
            this.layoutDirection = cacheRecord.layoutDirection;
            this.fontFamilyResolver = cacheRecord.fontFamilyResolver;
            this.constraints = cacheRecord.constraints;
            this.layoutResult = cacheRecord.layoutResult;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CacheRecord(visualText=");
            sb.append((Object) this.visualText).append(", composition=").append(this.composition).append(", textStyle=").append(this.textStyle).append(", singleLine=").append(this.singleLine).append(", softWrap=").append(this.softWrap).append(", densityValue=").append(this.densityValue).append(", fontScale=").append(this.fontScale).append(", layoutDirection=").append(this.layoutDirection).append(", fontFamilyResolver=").append(this.fontFamilyResolver).append(", constraints=").append((Object) Constraints.m6596toStringimpl(this.constraints)).append(", layoutResult=").append(this.layoutResult).append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tsA0JmP.`_2\u000fq{:$qҕ\u0010TkUH|Z\b`\u000f\u000bwrXZ#C=\u0007&|x.aU'`\"\u0013@F\b?aR\u007fAGf\r63%ݨ&8\b\fI 8W(v)S\u0012 b?NtRR;Rŋ\u001e\u0018\u000ē8\u0003$duW\u0007WzcR/Q\bݦFT/ڿH~S\u0017T]w\u001c\u0005a6+n8߱\u0019+[Έ\u001fTaJ\u0011KBL\u0013j?'YLָ[<`Ü,\u00171\\\u001bkğ*n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003 )\u0011\u0014I}Ix\u000e\fy\u0017@z\u007fP,", "", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "Ah]4_,%W\"~", "", "AnUAJ9:^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001b[r0UMX9dRq,\u0014%inR+\u0014\u0004GP }D\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?P){U#NyZP3q>k\f5\u0012Q}+", "5dc \\5@Z\u0019e~g,", "u(I", "5dc b-ME&z\u0006", "5dc!X?M4\u001d~\u0002]\u001a\f\u0005>e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju=\u0004#PZO6iZr<\u0003\u0012m\u001d//\r\fX/3jS7t", "5dc!X?MA(\u0013\u0002^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhk/Kt\u0016\u0004", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class NonMeasureInputs {
        public static final Companion Companion = new Companion(null);
        private static final SnapshotMutationPolicy<NonMeasureInputs> mutationPolicy = new SnapshotMutationPolicy<NonMeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2) {
                if (nonMeasureInputs == null || nonMeasureInputs2 == null) {
                    if (!((nonMeasureInputs == null) ^ (nonMeasureInputs2 == null))) {
                        return true;
                    }
                } else if (nonMeasureInputs.getTextFieldState() == nonMeasureInputs2.getTextFieldState() && Intrinsics.areEqual(nonMeasureInputs.getTextStyle(), nonMeasureInputs2.getTextStyle()) && nonMeasureInputs.getSingleLine() == nonMeasureInputs2.getSingleLine() && nonMeasureInputs.getSoftWrap() == nonMeasureInputs2.getSoftWrap()) {
                    return true;
                }
                return false;
            }
        };
        private final boolean singleLine;
        private final boolean softWrap;
        private final TransformedTextFieldState textFieldState;
        private final TextStyle textStyle;

        public NonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, boolean z3) {
            this.textFieldState = transformedTextFieldState;
            this.textStyle = textStyle;
            this.singleLine = z2;
            this.softWrap = z3;
        }

        public final TransformedTextFieldState getTextFieldState() {
            return this.textFieldState;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ')';
        }

        /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BZIV2\u00062\r_P}f\u001dM\t\rß\u0013\f\u001eю\u0003.OY\u0007bܱ\u00138"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003 )\u0011\u0014I}Ix\u000e\fy\u0017@z\u007fP\u0015mQ\u0002 qJ-rO/", "", "u(E", ";tc.g0H\\\u0004\t\u0002b*\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003 )\u0011\u0014I}Ix\u000e\fy\u0017@z\u007fP,", "5dc\u001ah;:b\u001d\t\u0004I6\u0004\r-y", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d.1d\f#A|}>\\?Jo>'\u007frh=\u0005w\u0002", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final SnapshotMutationPolicy<NonMeasureInputs> getMutationPolicy() {
                return NonMeasureInputs.mutationPolicy;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0014s{B)c$wJCU(\n*\tUNmg\u0005Ϻx%s\u000f4\u00151iF\nx\ta \u000fJB\u001e@CQ}?Q`#9\u0015$@&Py3\u0006*.V\u0016\u000fzqRë\u00160Nx\u0003X\u001be\u001d\u001a@\u001f\u00054Q5jmf6vsԐ9ǂ߃\u0002hŌR/g0\u000bX%HZ0\u001b\u00012-9@O5C&٨\u0007\rZ¹W\u0005E}K\u00129659as\u0006Eݼ\u0004\u001a\u001dۀg\u000fc\u00034mU`n\u0010?+}hׂT\u00140»\u0013}\u0013N\u0012!V6VBE\u001a\u0015\u0017ԧ7zzԟXR\bsP\u0011KpD\u0019=\u007fa.ݰ\u001flYĥS\u001bTM\n\u001cٿ\u001e,\tq'ƞp<_\u001d\u001bZ\u0017ά5l"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003\u001f\u001f\u0004:Y\u000f;L\n\u0017&\u001dC@", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016^5`a<$\u0010&d\u001e]\n\u0011\u0012Y?3rN@tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b8hYh)zQJT,\u000bn\u0015n}XB>+(0\u0006\u001bvZ5\u001b{`fW9\u007fqvN\u001d\u0004\u0002)Ou%JN~UI}#&\u0015Zw\u0013.h{:R7\rB9Ct\u0003Zq%&Z\u0006\u001b,i\u0017j\u0017", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "\u0018", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "2d]@\\;RD\u0015\u0006\u000b^", "", "5dc\u0011X5LW(\u0013kZ3\r\t", "u(5", "5dc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rH\\\u0002hoC\u000et,[L", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class MeasureInputs {
        public static final Companion Companion = new Companion(null);
        private static final SnapshotMutationPolicy<MeasureInputs> mutationPolicy = new SnapshotMutationPolicy<MeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(TextFieldLayoutStateCache.MeasureInputs measureInputs, TextFieldLayoutStateCache.MeasureInputs measureInputs2) {
                if (measureInputs == null || measureInputs2 == null) {
                    if (!((measureInputs == null) ^ (measureInputs2 == null))) {
                        return true;
                    }
                } else if (measureInputs.getDensityValue() == measureInputs2.getDensityValue() && measureInputs.getFontScale() == measureInputs2.getFontScale() && measureInputs.getLayoutDirection() == measureInputs2.getLayoutDirection() && Intrinsics.areEqual(measureInputs.getFontFamilyResolver(), measureInputs2.getFontFamilyResolver()) && Constraints.m6584equalsimpl0(measureInputs.m1550getConstraintsmsEJaDk(), measureInputs2.m1550getConstraintsmsEJaDk())) {
                    return true;
                }
                return false;
            }
        };
        private final long constraints;
        private final Density density;
        private final float densityValue;
        private final FontFamily.Resolver fontFamilyResolver;
        private final float fontScale;
        private final LayoutDirection layoutDirection;

        public /* synthetic */ MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, resolver, j2);
        }

        private MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = resolver;
            this.constraints = j2;
            this.densityValue = density.getDensity();
            this.fontScale = density.getFontScale();
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1550getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m6596toStringimpl(this.constraints)) + ')';
        }

        /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BZIV2\u00062\r_P}f\u001dM\t\rß\u0013\f\u001eю\u0003.OY\u0007bܱ\u00138"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003\u001f\u001f\u0004:Y\u000f;L\n\u0017&\u001dC)NL^\u001bC\u0003\u0019\u007fJ~", "", "u(E", ";tc.g0H\\\u0004\t\u0002b*\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u0003\u001f\u001f\u0004:Y\u000f;L\n\u0017&\u001dC@", "5dc\u001ah;:b\u001d\t\u0004I6\u0004\r-y", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d.1d\f#A|}>\\?Jo>'\u007frh=\u0005w\u0002", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final SnapshotMutationPolicy<MeasureInputs> getMutationPolicy() {
                return MeasureInputs.mutationPolicy;
            }
        }
    }
}
