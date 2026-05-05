package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4[\u0007\"B\u0012\u007fјnjG9L͜P.hS2\u000fq\u0007<$i*yّAZ0ԂR\t}M(K~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0013\u001f6PrW3{pM=nxN\u0005N32<\b\n\u0019\u001aXI z\tIc\f@1PtHY%M3\u001b\"\nL(\u0019\u001e\u000bh^:Vuu:]$\u0013mPX?_^}]\u0011T_?\r%b./NCM\u0015STΫ\u000bRiLKb\u007fY\u001dn7);I\"Xdu0\u0018#Ig\r\f\u0012V`\u0013qx\fUL\u0016bׂT\u0010.\u001a\t\u001fU_\u00122\u001e-X0=\u001a\u0015\t<P%va^h\u0002\ra0~oV/%.Tq8ӸjSg`'q\u007f\u0017\u001336)\u0011p1[\u0003\u000f\u000f2KX\u0006qIQn^\u000fM̆]?s+~\u000bJØ\u0003>p\u0018/*߾^\u001d+7i9;!\u001a\u0003xJmv\u0013b\u0001S\u0018SxF(n$:B\t:[tj\u000bk^Xp,?NLZ\r}\u0016\u00188\\&=Q+\u0016N]n\u0002j{^:+5fE`\u0007k<Xid95_k(a\u0001wDEBb\u0013a~B\u0002\r\u000bb.\"@R\u0003\u0010&|tT\u0012\u0013@J\n\u001cb-a\u001fb\u0015V\u000f6Bo}ɺ^ʳӳ\u0014\u0001Z]2.25\u00035\u0019P\u000b\u0010 m\u0007vD~v![@\u0018ژ\u0019n[0\u0017L|Q6E\bP^uT_L\u001b\u0017çTݨĆ\u0015\u0019\u07fcU7E\u0013\u001d\u000fA4\b;S[C|_P*')}ʣ\u000e\u0090ŕ-fŰnx4`xZgV\u001d3\u0005mC:\u0016d\u0018y\u0010GܢFϊԳ\nZƏMz\u000bYJ^P~\u000b1,4Q\u00070\u0007M-q(߭\u0015ߐԚ.\u0014˸aqw.\br'(zx\u0012;4-}gi]`<ϨHʲ͓=!ٝp\u000bJHx\b D\u000fH\u001bB\u0019Xr|n8{\fʹ|օ÷+\f\u0080ZcB\u0013}\u000eL0e?\u0002RN+lJ=\u0011{Tރlޮү[\nΊ\u0013\u0012\u0013{?~*\u001eC6df3 >\u0011\f\u0018dBߞaŝĮ\b#Ҭ0D\u0010\u000bQd\u0002\b\u0016\u0012\u000eU0&%8ZsiW\u05ceSۿحUGϖdMh!8\u0011\u0017\u001196\u0007D\u0002\u001c{Ol/\u00123ޥR߹θ\u001aiˍ\u0003n-+RdQ\u001d.q\u000f\u001a\u0016tQM\u001a62H՜l Ȋ\u000b7±\u0001%J\u0018)Ii\u0013e\u0011>m[lrP|v@gǓMÝƏ}yէ\u0012D\u0012\u000f\u0019)gtu};[Ϙw@K\u001d\u0007ӡ`W\u0006\u0014|ieɺ16"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(5W\u0004\u001dA\u0001s8TMHy\n", "", "1gT0^,=1\u001c~xd4x\u00165C\n/\u0006M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "CmR5X*DS\u0018\\}^*\u0003\u0011+r\u0006\u0006\u0006G\u000b$", "1gT0^,=0#\u0012Xh3\u0007\u0016", "CmR5X*DS\u0018[\u0005q\n\u0007\u00109r", "2hb.U3>Rv\u0002z\\2|\b\fo\u0013\u0006\u0006G\u000b$", "2hb.U3>R\t\bxa,z\u000f/d\\2\u000f\u001e\u000b\u001e!T", "2hb.U3>R|\by^;|\u00167i\t$\u000b@]!*%y\u0015F\u0004", "1gT0^,=0#\fy^9Z\u00136o\r", "CmR5X*DS\u0018[\u0005k+|\u0016\ro\u00072\t", "2hb.U3>Ru\t\b],\nf9l\n5", "2hb.U3>R\t\bxa,z\u000f/d\\2\t?\u0001$tQv\u0018I", "2hb.U3>R|\by^;|\u00167i\t$\u000b@]!$Fo\u001b\u001a\u0001,?f", "uI9\u0017=\u0011#8}c_C\u0011c\u000f9t\u0007,\u0005\n\u0006(\u001f\u0011s\u0017Kv2>U\u0005i\u0016m\u0017*]JJI>'#wnI\u0005r6[^#TRN92\u0016c", "5dc\u0010[,<Y\u0019}Wh9{\t<C\n/\u0006MHa\u0016\u0019isAf", "u(9", "\u0018", "5dc\u0010[,<Y\u0019}Wh?Z\u00136o\roF?R\u0011|L_", "5dc\u0010[,<Y\u0019}Xa,z\u000f7a\r.YJ\b!$\u000f:\r\u000ep\u000b:I", "5dc\u0011\\::P ~y;6\n\b/r]2\u0003J\u000e^aFA\b\"{\u0015", "5dc\u0011\\::P ~y</|\u00075e~\u0005\u0006S^!\u001eQ|U\u0007uv/?\u0003\u0010", "5dc\u0011\\::P ~yB5{\t>e\r0\u007fI|&\u0017$y\u001b;v2\u0013c\u0005*D5`-\u001f=!p$", "5dc\u0011\\::P ~yB5{\t>e\r0\u007fI|&\u0017$y!\u001a\u0001,?fEj6?\u0010\u0014R3", "5dc\u0011\\::P ~yN5z\f/c\u0006(z\u001d\u000b$\u0016G|kF}/B!H\u001f\tg{3=", "5dc\u0011\\::P ~yN5z\f/c\u0006(z\u001d\u000b*tQv\u0018I>o4+w\u0006<]", "5dc\"a*AS\u0017\u0005z]\t\u0007\u0016.e\r\u0006\u0006G\u000b$^\u0012n_6\\*%", "5dc\"a*AS\u0017\u0005z]\t\u0007\u001c\ro\u00072\t\bK\u0016hAU\u0013,", "5dc\"a*AS\u0017\u0005z]\n\u007f\t-k\b$\tF^!\u001eQ|U\u0007uv/?\u0003\u0010", "0na1X9\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "3mP/_,=", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "0na1X9\u001c] \t\b\u001d4x\u0018/r\u0004$\u0003\u000ez$\u0017No\nJv", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Vk\u001d<@\u0014?[\u007f'7i\u00135M1JgC\u001ejO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u001fj\u0017]/\u0015\u0005#\u001f.vOA-\b9\u001fe~O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2Sih\tKIE,\u0018s\bn\u001d2", "0ng\u0010b3H`", "0ng\u0010b3H`W\u0007vm,\n\r+lM\"\t@\b\u0017\u0013Uo", "1gT0^4:`\u001f\\\u0005e6\n", "1gT0^4:`\u001f\\\u0005e6\nG7a\u000f(\tD|\u001edA|\u000eCv!CY", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%&C~\u000e\u0006e/7[\u0005 3j\u001d.;R7z4s{dj8\u0014m0M\npEVV7f`r\u0007!\"c\u001dR3\rN7K,yNE\u001f\u0015\u0002-E\"d\n\u000b#\u00189i\u0004\fT\u001aO\u0005\u001f\u0004AruVbn}OA\u000fP9`\u001b_r", "1n_F", "1n_F xJH\u0002q\u00101", "uI9\u0017=\u0011#8}c_C\u0011@o+n~5\u0006D\u007f*`Ey\u0016G\u000135#\u0006\u001cFm#2IJ\t5\u0012!\u0015fg6\u0011v\nX}1TZ$", "3pd._:", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CheckboxColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    private CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.checkedCheckmarkColor = j2;
        this.uncheckedCheckmarkColor = j3;
        this.checkedBoxColor = j4;
        this.uncheckedBoxColor = j5;
        this.disabledCheckedBoxColor = j6;
        this.disabledUncheckedBoxColor = j7;
        this.disabledIndeterminateBoxColor = j8;
        this.checkedBorderColor = j9;
        this.uncheckedBorderColor = j10;
        this.disabledBorderColor = j11;
        this.disabledUncheckedBorderColor = j12;
        this.disabledIndeterminateBorderColor = j13;
    }

    /* JADX INFO: renamed from: getCheckedCheckmarkColor-0d7_KjU */
    public final long m1856getCheckedCheckmarkColor0d7_KjU() {
        return this.checkedCheckmarkColor;
    }

    /* JADX INFO: renamed from: getUncheckedCheckmarkColor-0d7_KjU */
    public final long m1865getUncheckedCheckmarkColor0d7_KjU() {
        return this.uncheckedCheckmarkColor;
    }

    /* JADX INFO: renamed from: getCheckedBoxColor-0d7_KjU */
    public final long m1855getCheckedBoxColor0d7_KjU() {
        return this.checkedBoxColor;
    }

    /* JADX INFO: renamed from: getUncheckedBoxColor-0d7_KjU */
    public final long m1864getUncheckedBoxColor0d7_KjU() {
        return this.uncheckedBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledCheckedBoxColor-0d7_KjU */
    public final long m1858getDisabledCheckedBoxColor0d7_KjU() {
        return this.disabledCheckedBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBoxColor-0d7_KjU */
    public final long m1862getDisabledUncheckedBoxColor0d7_KjU() {
        return this.disabledUncheckedBoxColor;
    }

    /* JADX INFO: renamed from: getDisabledIndeterminateBoxColor-0d7_KjU */
    public final long m1860getDisabledIndeterminateBoxColor0d7_KjU() {
        return this.disabledIndeterminateBoxColor;
    }

    /* JADX INFO: renamed from: getCheckedBorderColor-0d7_KjU */
    public final long m1854getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* JADX INFO: renamed from: getUncheckedBorderColor-0d7_KjU */
    public final long m1863getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledBorderColor-0d7_KjU */
    public final long m1857getDisabledBorderColor0d7_KjU() {
        return this.disabledBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledUncheckedBorderColor-0d7_KjU */
    public final long m1861getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* JADX INFO: renamed from: getDisabledIndeterminateBorderColor-0d7_KjU */
    public final long m1859getDisabledIndeterminateBorderColor0d7_KjU() {
        return this.disabledIndeterminateBorderColor;
    }

    /* JADX INFO: renamed from: copy-2qZNXz8$default */
    public static /* synthetic */ CheckboxColors m1852copy2qZNXz8$default(CheckboxColors checkboxColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long j14 = j3;
        long j15 = j2;
        long j16 = j6;
        long j17 = j8;
        long j18 = j5;
        long j19 = j7;
        long j20 = j4;
        long j21 = j12;
        long j22 = j13;
        long j23 = j10;
        long j24 = j11;
        long j25 = j9;
        if ((i2 + 1) - (i2 | 1) != 0) {
            j15 = checkboxColors.checkedCheckmarkColor;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j14 = checkboxColors.uncheckedCheckmarkColor;
        }
        if ((i2 & 4) != 0) {
            j20 = checkboxColors.checkedBoxColor;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            j18 = checkboxColors.uncheckedBoxColor;
        }
        if ((i2 & 16) != 0) {
            j16 = checkboxColors.disabledCheckedBoxColor;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            j19 = checkboxColors.disabledUncheckedBoxColor;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            j17 = checkboxColors.disabledIndeterminateBoxColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            j25 = checkboxColors.checkedBorderColor;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            j23 = checkboxColors.uncheckedBorderColor;
        }
        if ((i2 & 512) != 0) {
            j24 = checkboxColors.disabledBorderColor;
        }
        if ((i2 & 1024) != 0) {
            j21 = checkboxColors.disabledUncheckedBorderColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2048)) != 0) {
            j22 = checkboxColors.disabledIndeterminateBorderColor;
        }
        long j26 = j20;
        long j27 = j18;
        long j28 = j16;
        long j29 = j19;
        long j30 = j17;
        return checkboxColors.m1853copy2qZNXz8(j15, j14, j26, j27, j28, j29, j30, j25, j23, j24, j21, j22);
    }

    /* JADX INFO: renamed from: copy-2qZNXz8 */
    public final CheckboxColors m1853copy2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        long j14 = j2;
        long j15 = j3;
        long j16 = j4;
        long j17 = j5;
        long j18 = j6;
        long j19 = j7;
        long j20 = j8;
        long j21 = j9;
        long j22 = j10;
        long j23 = j11;
        long j24 = j12;
        long j25 = j13;
        if (j14 == 16) {
            j14 = this.checkedCheckmarkColor;
        }
        if (j15 == 16) {
            j15 = this.uncheckedCheckmarkColor;
        }
        if (j16 == 16) {
            j16 = this.checkedBoxColor;
        }
        if (j17 == 16) {
            j17 = this.uncheckedBoxColor;
        }
        if (j18 == 16) {
            j18 = this.disabledCheckedBoxColor;
        }
        if (j19 == 16) {
            j19 = this.disabledUncheckedBoxColor;
        }
        if (j20 == 16) {
            j20 = this.disabledIndeterminateBoxColor;
        }
        if (j21 == 16) {
            j21 = this.checkedBorderColor;
        }
        if (j22 == 16) {
            j22 = this.uncheckedBorderColor;
        }
        if (j23 == 16) {
            j23 = this.disabledBorderColor;
        }
        if (j24 == 16) {
            j24 = this.disabledUncheckedBorderColor;
        }
        if (j25 == 16) {
            j25 = this.disabledIndeterminateBorderColor;
        }
        return new CheckboxColors(j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, null);
    }

    public final State<Color> checkmarkColor$material3_release(ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        ComposerKt.sourceInformationMarkerStart(composer, -507585681, "C(checkmarkColor)490@21677L61:Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i2, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)");
        }
        if (toggleableState == ToggleableState.Off) {
            j2 = this.uncheckedCheckmarkColor;
        } else {
            j2 = this.checkedCheckmarkColor;
        }
        State<Color> stateM451animateColorAsStateeuL9pac = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateM451animateColorAsStateeuL9pac;
    }

    public final State<Color> boxColor$material3_release(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State<Color> stateRememberUpdatedState;
        ComposerKt.sourceInformationMarkerStart(composer, 360729865, "C(boxColor):Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i2, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)");
        }
        if (z2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j2 = this.checkedBoxColor;
            } else if (i3 == 3) {
                j2 = this.uncheckedBoxColor;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i4 == 1) {
                j2 = this.disabledCheckedBoxColor;
            } else if (i4 == 2) {
                j2 = this.disabledIndeterminateBoxColor;
            } else if (i4 == 3) {
                j2 = this.disabledUncheckedBoxColor;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (z2) {
            composer.startReplaceGroup(-392211906);
            ComposerKt.sourceInformation(composer, "521@22941L61");
            stateRememberUpdatedState = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-392031362);
            ComposerKt.sourceInformation(composer, "523@23032L28");
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateRememberUpdatedState;
    }

    public final State<Color> borderColor$material3_release(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State<Color> stateRememberUpdatedState;
        ComposerKt.sourceInformationMarkerStart(composer, 1009643462, "C(borderColor):Checkbox.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i2, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)");
        }
        if (z2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1 || i3 == 2) {
                j2 = this.checkedBorderColor;
            } else if (i3 == 3) {
                j2 = this.uncheckedBorderColor;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i4 == 1) {
                j2 = this.disabledBorderColor;
            } else if (i4 == 2) {
                j2 = this.disabledIndeterminateBorderColor;
            } else if (i4 == 3) {
                j2 = this.disabledUncheckedBorderColor;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (z2) {
            composer.startReplaceGroup(-1725816497);
            ComposerKt.sourceInformation(composer, "554@24267L61");
            stateRememberUpdatedState = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(toggleableState == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1725635953);
            ComposerKt.sourceInformation(composer, "556@24358L28");
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4168boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) obj;
        return Color.m4179equalsimpl0(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.m4179equalsimpl0(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.m4179equalsimpl0(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.m4179equalsimpl0(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.m4179equalsimpl0(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.m4179equalsimpl0(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.m4179equalsimpl0(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.m4179equalsimpl0(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.m4179equalsimpl0(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.m4179equalsimpl0(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.m4179equalsimpl0(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.m4179equalsimpl0(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m4185hashCodeimpl(this.checkedCheckmarkColor) * 31) + Color.m4185hashCodeimpl(this.uncheckedCheckmarkColor)) * 31) + Color.m4185hashCodeimpl(this.checkedBoxColor)) * 31) + Color.m4185hashCodeimpl(this.uncheckedBoxColor)) * 31) + Color.m4185hashCodeimpl(this.disabledCheckedBoxColor)) * 31) + Color.m4185hashCodeimpl(this.disabledUncheckedBoxColor)) * 31) + Color.m4185hashCodeimpl(this.disabledIndeterminateBoxColor)) * 31) + Color.m4185hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m4185hashCodeimpl(this.uncheckedBorderColor)) * 31) + Color.m4185hashCodeimpl(this.disabledBorderColor)) * 31) + Color.m4185hashCodeimpl(this.disabledUncheckedBorderColor)) * 31) + Color.m4185hashCodeimpl(this.disabledIndeterminateBorderColor);
    }
}
