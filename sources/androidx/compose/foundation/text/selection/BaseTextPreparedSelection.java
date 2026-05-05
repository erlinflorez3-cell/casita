package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wVCU(\n*\tUOog|Pb\u000bI\u0010\u000e\u0016\u000fj4Icxe\u0012%2JoE=UoKBht<,&P8\u0600\u0018d)&0Ϻ\u001eu#I[\u000e\"0\u0007ohĥ=M3\u001aJ\u0005\u001e`..`uONH\u001b_J31\u0006\u0002B|+o6\u000bR%Hj&;|q\"9GO5C-c\u0007\u0015[s?1IџA\u0005v2o9W\u0017o6\u0007$D\u00199t%]!J#\u0005\u001a\u0003\u001aMCO\u001a֟\u0001#6\u001f\u0013\r\u001d>\u0014\u000e<ΩX0=\u001a\u00151<[ϢvSFzؿbB\u000e&*X%Q\u00183aݍK{_\tS*^9\f\u0005C̔3\u0003~!\n}<\tڠ\u001fT}{śU@Ks\u0017\u0013gj\u0006\u0004'ç͆.\u0004>uH:\n@F\u0019;6\n]؝%k\u0010x\rr\u00056xjih\u0001lغ&n$gr\r\u001a\r\\d3\u0010\u0019_f_)O2S5\"ݔ\u0017 j(\u0005%3DfO\u0017\u000e3Xk?=1|6\b\u0013«\u0012WG\u000f{;_\u001a(a\u0001.Z?\u0005k\u0013\u0011~B\nێȺ`(0`\u0011s\u001e1\u0014D\u0005ۼƱ6?\u007fJ|5?St\u0015~ґٿFA\u000b7(evK\u0017TiɴIi˨x\t\u000f~%y}$\u0011Ibʉ˃&-O\u007f}$4\u0013:hjêi\u0007ҋw\u007fU\u0016\u0015RZ+.u\fݨf\u0016׀=Q=k[\u0018\rhJ\u0002cզʆve_{Z2\t=\u0012\u000fqÜtgŰnp:\u000f3S]\u0016/\"-ܥѓ'\br.BjT=_c\u000bެИBI\u00011\"E\\{\u0015\u0005UǇݵ\u0005o0+}6Qk5\u0016.ҡڏ\u0019ak\u001887\b('&+Ёנ0c$\u001e+ZkxS8\u007fʲ˽B\"2\u001bKKV2\u0010\bxކΌ\u00113Vo-yd\u0001e\u000be̎֨\u000b,\u001b\u001f\u001fdH\\\b}jʝʡ.sQ,\\gQo)M\n܊ƽqKj9\u0013\u0018\u0018V\u00141%ܞεA d\u0006+\u0017>R\f\u0018djkf\u0013a!$bP\u0003\nSYb7\u001e\u0010))vc\u001deJB\"_\u0007\u0012bHtVv)'G)'8Q\u0017\u000faB?5y\u000b{\u0018l/\u0012VGSe\u000f)=g~\u0015IqD\u001dr){p\u0001AԵ}EO\u0001DXo)4@ \u0012>\u0018\u000brZ\u0018Ip\u0002&mMHo\u001bWtN+K\"hbNPR-#է\u0012<\u00109QĄUζsb;$\u0017\fE\u001c2\u0001EhQ\u0007:\u0003\u0014L!-\u0014\u000fE=w\u000fZ'Dka\u0016\u0016\bNDO\u0004#'\r]\u0014f\u001873:D\u0016\\bJ\u001e!,8\u0004\\n\u001dr848<U\u0002A[+^\b\u0010>˽No@zbZK\u0017\u001d2c\u001bi\u001f[\u0011\u0003t\u000bny\u001dQ\u0017ɂ\u0017o_<ppZh5{ \u0007\u00170\u0018#\u0005766\u0007o\u0010 {v|\u0004O\n\u000f\u0002ԡwˮe=8ܼ6\u007f%\u0007\u0004\u0012JV.$If\u001eOr\u000etnXV<dɈ,j|׃A\u0016\u0003\u0010Vpa\"BM\u000b\u001e\u00137ё\u001d%cƬ_b\r\u0017S]v8?UW\u001be6Ҝnĉь\u0010\u0002̯f|\b*P \u000b\u0002mA;\\%L((q$\u001cf݁*QMЯZ\n2)\u001c\u001f\u007fzF9V\\H \u0012Ǣ?÷\u0018ֆݭ\u00147۰s\u0015!5xhk'0\u001b\u000b\u0017-A\u007fLyVDF\u0001,G\u000f\u001e%˓jA-˟}N-)\u0010\u0004\u001b\u0011[\u0003n\u000f\u0010L\u007fs\u001cɋ{ߝD\u0004\"!*E\u0014\u0018\u0081\u007fN9K0مxnU{W\nEŊ:O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=gqdo9uc?]a4GWJ9\\Q`=\u001b\u0012X\u001dR5\u0016Z", "\"", "", "=qX4\\5:Z\b~\u000em", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "=qX4\\5:Z\u0007~\u0002^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", ":`h<h;+S'\u000f\u0002m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHqp,Yr4GK<,cRpL\u0018\u001cc{]'\u001c\u0005/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0003{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001dN>\u001cNHA7}+33\u0012<Xn;v\u0011\u0013%c\u001cfyAc\u001aKx(??3pQcmy\u0011QI,9d\u001fnf`CE4#;\u0003\u001ci^.\u0019cO\u001c}V\u0003i=.\u0015\u000471HqZY\u000fm_D\u007f1-KEx\u001cBas'\u00041\u000e=sEd\u0018Z1&>ex\u0013;`K0o%<&N6puw:\u001bh\u001eO\b\u0015b3@\u001donQW\u000b\u0016]lB;kn\b;[OCZw^+O\u000eBh\u0003\u0011\u0010P\u0003mfES\"c^$yR1l!\u0001\u0012p%\u0004*#CY\u001c>mP", "/m]<g(MS\u0018l\nk0\u0006\u000b", "5dc\u000ea5Hb\u0015\u000ez]\u001a\f\u00163n\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "Adc\u000ea5Hb\u0015\u000ez]\u001a\f\u00163n\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\na\u0006", "5dc\u0019T@Hc(kzl<\u0004\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j", "5dc\u001cY-LS(fvi7\u0001\u00121", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri!n\u0017<MR#g?)\u0019qc\u000f", "5dc\u001ce0@W\"z\u0002L,\u0004\t-t\u00042\u0005\b\u007fj\u0001\u0013wm\u001c", "u(9", "\u0018", "5dc\u001ce0@W\"z\u0002M,\u0010\u0018", "Ad[2V;B]\"", "5dc X3>Q(\u0003\u0005gs{\\\u00191\b\b[", "Adc X3>Q(\u0003\u0005gsL\u001e--\u000f\u000fN", "uI\u0018#", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2P9\u001ar\u0017[v2CYN+JRy=\u0012!^\u0018W\u0019\u001c\u0001hAy", "BdgA", "", "5dc!X?M\u0012\u001a\t\u000bg+x\u00183o\t\"\t@\b\u0017\u0013Uo", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1gP?B-?a\u0019\u000e", "", "=eU@X;", "1n[9T7LS\u007f~{m\u0016\n", "=q", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018w1WUM(kV|F]!Z!]t\u001b\u0005`A\"}HA(Q\tE\u0010;W\u0001\u001f%xBj{>c\u0010Fg\u0015|A'wJchO", "1n[9T7LS\u0006\u0003|a;f\u0016", "2db2_,<b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2>5\u0015c\u001bN\n62YN7X_r<\u0002\u0012a\u000eL:\u0011\u000fb\u0017", "5dc\u0019\\5>3\"}Wr\u0016}\n=e\u000f", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "5dc\u0019\\5>A(z\bm\t\u0011r0f\u000e(\u000b", "5dc\u001bX?M1\u001cz\bZ*\f\t<I\t'{S", "5dc\u001bX?ME#\fyH-}\u0017/t", "5dc\u001de,<S\u0018\u0003\u0004`\n\u007f\u0005<a}7{Md \u0016G\u0003", "5dc\u001de,OW#\u000f\tP6\n\b\u0019f\u00016{O", "7r;Ae", "", ";ne26<Ka#\fYh>\u0006eCL\u00041{", ";ne26<Ka#\fa^-\f", ";ne26<Ka#\fa^-\feCW\n5z", ";ne26<Ka#\fc^?\f", ";ne26<Ka#\fc^?\feCP{5wB\u000e\u0013\"J", ";ne26<Ka#\fc^?\feCW\n5z", ";ne26<Ka#\fek,\u000e", ";ne26<Ka#\fek,\u000eeCP{5wB\u000e\u0013\"J", ";ne26<Ka#\fek,\u000eeCW\n5z", ";ne26<Ka#\fgb.\u007f\u0018", ";ne26<Ka#\fgb.\u007f\u0018\fyq2\t?", ";ne26<Ka#\fih\f\u0006\b", ";ne26<Ka#\fih\u000f\u0007\u0011/", ";ne26<Ka#\fih\u0013\u0001\u0012/E\t'", ";ne26<Ka#\fih\u0013\u0001\u0012/L\u007f)\u000b.\u0005\u0016\u0017", ";ne26<Ka#\fih\u0013\u0001\u0012/R\u0004*~On\u001b\u0016G", ";ne26<Ka#\fih\u0013\u0001\u0012/S\u000f$\tO", ";ne26<Ka#\fji\t\u0011o3n\u007f", "Ad[2V;\u001aZ ", "Ad[2V;&]*~\u0003^5\f", "Adc\u0010h9L]&", "Adc X3>Q(\u0003\u0005g", "AsP?g", "3mS", "BqP;f-H`!~y>5{r0f\u000e(\u000b", "BqP;f-H`!~yF(\u0010r0f\u000e(\u000b", "BqP;f-H`!~yF0\u0006r0f\u000e(\u000b", "/o_9l", "#", "@db2g\n:Q\u001c~yQ", "0k^0^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}p'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lw$:\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#B.~M6\u001b\u00170S\u000b\u0005w\u0001\u001f%WCjwBT\u001fK\u0004\u001e?\u001e%vFH_\rV,Rb5`\u0019_\u001cJ:A$\u0012\u0001\u001d%q&", "5dc\u0019\\5>3\"}Wr\u0016}\n=e\u000f\t\u0006Mg\u0013+Q\u007f\u001d", "1ta?X5M=\u001a\u007f\t^;", "5dc\u0019\\5>A(z\bm\t\u0011r0f\u000e(\u000b!\u000b$}C\u0004\u0018L\u0006", "5dc\u001bX?ME#\fyH-}\u0017/t`2\t'|+!W~", "5dc\u001de,OE#\fyH-}\u0017/t", "8t\\=5@%W\"~\tH-}\u0017/t", ":h]2f\bF])\b\n", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int NoCharacterFound = -1;
    private AnnotatedString annotatedString;
    private final TextLayoutResult layoutResult;
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    private final AnnotatedString originalText;
    private long selection;
    private final TextPreparedSelectionState state;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j2;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j2;
        this.annotatedString = annotatedString;
    }

    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1662getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1663getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1664setSelection5zctL8(long j2) {
        this.selection = j2;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final void setAnnotatedString(AnnotatedString annotatedString) {
        this.annotatedString = annotatedString;
    }

    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z2, Function1 function1, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if (z2) {
            baseTextPreparedSelection.getState().resetCachedX();
        }
        if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
            function1.invoke(obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final <U> T apply(U u2, boolean z2, Function1<? super U, Unit> function1) {
        if (z2) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            function1.invoke(u2);
        }
        Intrinsics.checkNotNull(u2, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u2;
    }

    protected final void setCursor(int i2) {
        setSelection(i2, i2);
    }

    protected final void setSelection(int i2, int i3) {
        this.selection = TextRangeKt.TextRange(i2, i3);
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m6118getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m6118getEndimpl(this.selection));
    }

    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    private final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.getParagraphDirection(transformedEndOffset()) : null) != ResolvedTextDirection.Rtl;
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i2);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.originalText.length()) {
            long jM6097getWordBoundaryjx7JFs = textLayoutResult.m6097getWordBoundaryjx7JFs(charOffset(i2));
            if (TextRange.m6118getEndimpl(jM6097getWordBoundaryjx7JFs) > i2) {
                return this.offsetMapping.transformedToOriginal(TextRange.m6118getEndimpl(jM6097getWordBoundaryjx7JFs));
            }
            i2++;
        }
        return this.originalText.length();
    }

    static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i2);
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long jM6097getWordBoundaryjx7JFs = textLayoutResult.m6097getWordBoundaryjx7JFs(charOffset(i2));
            if (TextRange.m6123getStartimpl(jM6097getWordBoundaryjx7JFs) < i2) {
                return this.offsetMapping.transformedToOriginal(TextRange.m6123getStartimpl(jM6097getWordBoundaryjx7JFs));
            }
            i2--;
        }
        return 0;
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.transformedMinOffset();
        }
        return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i2);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i2)));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = baseTextPreparedSelection.transformedMaxOffset();
        }
        return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i2);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i2), true));
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i2) {
        int iTransformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(iTransformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iTransformedEndOffset) + i2;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        Intrinsics.checkNotNull(cachedX);
        Float f2 = cachedX;
        float fFloatValue = f2.floatValue();
        if ((isLtr() && fFloatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && fFloatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m6095getOffsetForPositionk4lQ0M(OffsetKt.Offset(f2.floatValue(), lineBottom)));
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m6118getEndimpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m6121getMinimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m6120getMaximpl(this.selection));
    }

    private final int charOffset(int i2) {
        return RangesKt.coerceAtMost(i2, getText$foundation_release().length() - 1);
    }

    /* JADX INFO: compiled from: TextPreparedSelection.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=gqdo9uc?]a4GWJ9\\Q`=\u001b\u0012X\u001dR5\u0016C7K,y@@#\u00125\u001f", "", "u(E", "\u001cn25T9:Q(~\b?6\r\u0012.", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m6118getEndimpl(this.selection));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T collapseLeftOr(Function1<? super T, Unit> function1) {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m6117getCollapsedimpl(this.selection)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                function1.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m6121getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m6120getMaximpl(this.selection));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T collapseRightOr(Function1<? super T, Unit> function1) {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m6117getCollapsedimpl(this.selection)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                function1.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m6120getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m6121getMinimpl(this.selection));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrev() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorNext() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorNextByWord() {
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrevByWord() {
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m6121getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m6121getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation_release(), iFindParagraphStart - 1);
            }
            setCursor(iFindParagraphStart);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m6120getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m6120getMaximpl(this.selection) && iFindParagraphEnd != getText$foundation_release().length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation_release(), iFindParagraphEnd + 1);
            }
            setCursor(iFindParagraphEnd);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m6123getStartimpl(this.originalSelection), TextRange.m6118getEndimpl(this.selection));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
