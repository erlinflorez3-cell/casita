package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
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
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:368)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record.<init>(JvmProtoBuf.java:327)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:474)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$1.parsePartialFrom(JvmProtoBuf.java:469)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readMessage(CodedInputStream.java:507)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:121)
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
/* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RnP\u008cZS@\u000fsڔ<$q$yCAU\"}8\tWNmkvJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0015\u00172XoG3coE9vt>\u0005&<(\u0600\u0010ڎ\u001fDZP z\u000bEa\u000b@0nojR;M=\u0019<Fi0\u0005,]\u007fNdJ|aH2;\u0003\u0018F^+m5\u0015M;Ld+\u001b}y\u001eYHG9#.k\u00035\\ÜC\u0003M|\u0006%v:?+w\b\b:f\u0015,\u0015Yc=a\u0001<t\u0005\u007fwR'̼NҪׂT\u0010.\u0010\t\u0015Uw\u0012(\u001e)^-s5\u0007\n\u0014ޗ\u0003\u000e\u0004D^\u0018vB.\u0012\u0012M%A\u0018F;;+f\u007f\u007fK\u001d^9\u0012\u0004S9Q\u001eͼ%[Z-')ŊSȭΦ5SF]VoRuK\u0010\u001cp\u0011\bR\u0004^[03\n'F\u0017SN\"9ٳ ǽɘLFm\u001a\u0013\u00051gww`@Pt>7X RZמcʍ\u07fbTV^R\u001ftdh\u0015& \u0013Nb <O<VNұgȉҷQ_\u0010N=\u000e\be|n&Wgb\n̓SӒ\u0014aZΘdYJn\u001d`vFc\u000ep[V\"`U!dNԒF«\u0010\u0017JAw*B;\u0002%j\u001c`\u0003LJ\u0018Ҕ\u000bރ^h\u0018з%?2\f\u0002$#\u0013Wˉ^ʼsg\u0001̢|\tn'EA\u007f;oĢWɋl4\u0005ȽW\u000b\u0002\u0001_gzI#́\u0018\u0091Y{(چjK_?U\u0013=~_\u0007XΦGʆviiO\u00188\t\u000fȭ\u000f@p1mů\u0007\u001f+ߵnu"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"yd\rR,\u0011\u0005f(.l@>t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\t\"rr=\u0006c9$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w7", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"\u007fi\n]+b", "0dh<a+\u001b])\byl\u0010\u0006\n9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"uc\u000fX\u0001", "@de2e:>:\u0015\u0013\u0005n;", "", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]S'[VW+9\\\u0003F\u0013 H\u001dJ:\rZ@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~kzR_\u000fC\t\u0019\u007fJroBnsCN=Yl:sUF\u0019qN! ({)*EPB\u0014\u0005Rm|b\u0003fu+\"{By3TWOD|_@s:hI\u0006\u007f\u001d<ftt\u00051MD3:sN2c,Hn\bs0iA%5:F\u001c\u00152_~kK\u0018l\u001etQ\fl=<#se-I\u0019\u0017f\u0016WDei\n\u0001T\u0006LX\u007f\"'TH,h}\u0015\u0012\u0016 |iSLp\u0018q", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n f\b1;l\u0012+TC#u3\"\u0016laFmm*J}|", "5dc\u0018X@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001fQn\u0012=z%B#h-A~\u001a-I@Bk\u001c(\u0014lb=\u0007p\u0013Xt#N\"", "D`[BX", "5dc#T3NS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0012Y\u0012*@lr8]L:y\u001b\u001a)rqH\\", "/cS\u001bX?M7\"\u000ezk=x\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"uc\u000fXip\u000ehA1\u007f@>t", "1ta?X5M7\"\u000ezk=x\u0010", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w  \u0003w6^\u0006\u0006KYN*kV|Fi", "/cS\u001bX?M7\"\u000ezk=x\u0010vFlu\u0005Ak\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]S'[VW+9\\\u0003F\u0013 >\u0017O5KhbP${U3&]\u0010\rh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b*rVb^uVEOksk\bt1&A68\u001e\u0002(dOLC\u001ebO%|b\tDg[#\u00047\u0001H}dESS^=~e\u0003T\u000bw\u001fCT{\u0001", ":`h<h;", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006S%Ic\u0007\u001f\u0014w&7LQ\"gH(%w \u0016\u0007w6Wu\u0004Q\\W+j@pG\u001f\u00120", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ":`h<h;\u0006]j\u0001FI5O", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "6`b\u001ab9>1#\b\n^5\f", "6`b\u001ab9>1#\b\n^5\fP\u0010RM1|+t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]S'[VW+9\\\u0003F\u0013 >\u0017O5KhbP${U3&]\u0010\rv", "7r5<e>:`\u0018", "7r5<e>:`\u0018FIo-Nx\u0002o", "uH\u0018'", "7r>=c6LW(~ih\u0016\n\r/n\u000f$\u000bD\u000b ", "7r>=c6LW(~ih\u0016\n\r/n\u000f$\u000bD\u000b ^\u0016\u0001\u000f\u000efw?", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final LazyLayoutBeyondBoundsState state;

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z2, LayoutDirection layoutDirection, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BeyondBoundsLayout getValue() {
        return this;
    }

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0015\u001d<K!&i\u000eӵLcz\u0004I\u00066\fVA\u0001(ܬ\u0013\u000eј\u0017jg/\u0005jN.ʂW*\u001dkLB2\\<qq=,ڿ\u007f̀\rQVguqУ^\u000f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"yd\rR,\u0011\u0005f(.l@>]e6Q\r7q\u0005\u0016\u001fc", "", "u(E", "3l_Al\t>g#\by;6\r\u0012.sm&\u0006K\u0001", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006}!JmG'3\u0002 >\\\r\"gI2{duC\u0017r\tN\u000b1PK+6l[qK{\u001cY\u0012O/\r\u0012@K\"jKu|\u00124T}Dl\u000b\u0015T\u000e=u\u007fV3\u0010[\u0004\u001et\u001e3xOXmgEKPbh0", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"yd\rR,\u0011\u0005f(.l@>]e6Q\r7q\u0005\u0016\u001fL5r{QjlG\u000e\u001f~@\u0006rVb^\b5?Om*#W5", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* JADX INFO: renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo1171layouto7g1Pn8(final int i2, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> function1) {
        int firstPlacedIndex;
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems()) {
            return function1.invoke(emptyBeyondBoundsScope);
        }
        if (m1169isForward4vf7U8o(i2)) {
            firstPlacedIndex = this.state.getLastPlacedIndex();
        } else {
            firstPlacedIndex = this.state.getFirstPlacedIndex();
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) this.beyondBoundsInfo.addInterval(firstPlacedIndex, firstPlacedIndex);
        T tInvoke = null;
        while (tInvoke == null && m1168hasMoreContentFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i2)) {
            T t2 = (T) m1167addNextIntervalFR3nfPY((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i2);
            this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
            objectRef.element = t2;
            this.state.remeasure();
            tInvoke = function1.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    return this.this$0.m1168hasMoreContentFR3nfPY(objectRef.element, i2);
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
        this.state.remeasure();
        return tInvoke;
    }

    /* JADX INFO: renamed from: isForward-4vf7U8o, reason: not valid java name */
    private final boolean m1169isForward4vf7U8o(int i2) {
        if (BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5500getBeforehoxUOeE())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5499getAfterhoxUOeE())) {
            if (BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5498getAbovehoxUOeE())) {
                return this.reverseLayout;
            }
            if (BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5501getBelowhoxUOeE())) {
                if (this.reverseLayout) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5502getLefthoxUOeE())) {
                int i3 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i3 == 1) {
                    return this.reverseLayout;
                }
                if (i3 == 2) {
                    if (this.reverseLayout) {
                        return false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5503getRighthoxUOeE())) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new KotlinNothingValueException();
                }
                int i4 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        return this.reverseLayout;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.reverseLayout) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    private final LazyLayoutBeyondBoundsInfo.Interval m1167addNextIntervalFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i2) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m1169isForward4vf7U8o(i2)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.addInterval(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m1168hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsInfo.Interval interval, int i2) {
        if (m1170isOppositeToOrientation4vf7U8o(i2)) {
            return false;
        }
        if (m1169isForward4vf7U8o(i2)) {
            if (interval.getEnd() >= this.state.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m1170isOppositeToOrientation4vf7U8o(int i2) {
        if (!(BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5498getAbovehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5501getBelowhoxUOeE()))) {
            if (!(BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5502getLefthoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5503getRighthoxUOeE()))) {
                if (!(BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5500getBeforehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m5494equalsimpl0(i2, BeyondBoundsLayout.LayoutDirection.Companion.m5499getAfterhoxUOeE()))) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new KotlinNothingValueException();
                }
            } else if (this.orientation == Orientation.Vertical) {
                return true;
            }
        } else if (this.orientation == Orientation.Horizontal) {
            return true;
        }
        return false;
    }
}
