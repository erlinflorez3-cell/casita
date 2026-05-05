package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007luA0RqP.XW0ŧ*\u0012éBsTqq:\u000e\u0019\u0016b\u0018UNwk|Jr\u000bq\u0010و\u001azp.WXAu \u0013JB\u001eDcS}CQb\u000b53\u001fxƉ9ѩ\t\u0003 1V\u0018?\u0013QT$\u0012^E!>`\u0017e\u0005HŇL̄ơ\u007fȦ֔kP<Szi\u0003=1\u0010\u0002B|(&ݵ{֔\u0011HZ5\u001by*79OO5CǬ\u0004\u0007\u0015\\s?1ӊ8ܼ\u0005ڋ&ݐȅMu]Ff\u0011\\\"9a%]!9#\u0019Ōd\u000e-?]x\u0014]\u001c>\u0010z* \u0003\u0004؝\n)NE;/7\u0014\u001c3\rr\u0002A'؟`۰\u0004ziاЖ$\u007fĤ*9IgϢa@!Q=߈!;\u001dũ\u0005\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGtg+N\u0005|", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b\u000ea@", "AhS2f", "6`b\u000ea@\u0006P\u001f\u0001yD(`G0o\u00101z<\u0010\u001b!Pi\u00158\u000b/Ehw-7t\u0016*[C", "uH8uM", "6`b566=S", "6`b566=S`\u0003\u0003i3", ">kd@", ">kd@ .$M-co-", "uH8u<", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "D`[BX\u001bHA(\f~g.", "D`[BX\u001bHA(\f~g.D\r7p\u0007", "\u0011n\\=T5B]\"", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;
    public static final Companion Companion = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m1095boximpl(int i2) {
        return new WindowInsetsSides(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m1096constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1097equalsimpl(int i2, Object obj) {
        return (obj instanceof WindowInsetsSides) && i2 == ((WindowInsetsSides) obj).m1104unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1098equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m1099hasAnybkgdKaI$foundation_layout_release(int i2, int i3) {
        return (i2 + i3) - (i2 | i3) != 0;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1100hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m1097equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1100hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1104unboximpl() {
        return this.value;
    }

    private /* synthetic */ WindowInsetsSides(int i2) {
        this.value = i2;
    }

    /* JADX INFO: renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m1101plusgK_yJZ4(int i2, int i3) {
        return m1096constructorimpl(i2 | i3);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1102toStringimpl(int i2) {
        return "WindowInsetsSides(" + m1103valueToStringimpl(i2) + ')';
    }

    public String toString() {
        return m1102toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: valueToString-impl, reason: not valid java name */
    private static final String m1103valueToStringimpl(int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = Start;
        if ((i2 + i3) - (i2 | i3) == i3) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i4 = Left;
        if ((i2 & i4) == i4) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i5 = Top;
        if ((i2 + i5) - (i2 | i5) == i5) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i6 = End;
        if ((-1) - (((-1) - i2) | ((-1) - i6)) == i6) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i7 = Right;
        if ((i2 + i7) - (i2 | i7) == i7) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i8 = Bottom;
        if ((i2 + i8) - (i2 | i8) == i8) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX INFO: compiled from: WindowInsets.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005:2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005>i%\nCiWpԃ$\u0093NȞ̭fmН^\u0013K\u000f\u0014\u001b\u0011l2Lc|.,\u001d8Zom5$ڏ?̙_Қɻ\u0004\u001fݨ&@\u0002\u0005\u000f\u001fBJ\u0016}\tG\u001c& 8XphTcˠ\u0007ݾ\u0011ßͽ\u001f\u007fɉ`oV6Vqu<5,\u0011m\u0013h5iH|{\u000f\u001d×)͒uѭՕ*?˝9\u001d-S\u0011\fj]E\u000eMu\u000e\u001cv3?+wuˇ5ݙŕ\u0013\u0014ۣS\u0015er4a\u001dSf\u00195/ zY^&(&|ց\fɝɂ\r\u0005όL65\u001at\r&5z\u0002aD!\u0019lR\u0018z\u00108҆$ĮƊ*8ӸjYi;'SO}\u000b\u001e,'Q\u0006/ml\u000e\u000f\u0017ŊSȭϼ0P͘APV\ngB\u0006\u0006vu\u0010.TGU\u0014G{?0ш$ڛڼ8\"\u074co\nPDu{\u001dbnhwV\u0019W0\u0005.7X\u000bʪYե×\u0004jÏX`4\u0011[!l\t\u0004\u001f!$-\u000fJ9=\u0010|QǏhҔލ\\\tɻ3n?Y|p&Y?wA9\"z\u001e{jvBAسaڳؓeAΐ\u0010bd(07`l\u0016\u0013\nH\u008b\f\u001c:BwʫPZ0!\\\u001bgҺ\"^"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGtg+N\u0005e%VV7X[vG\u001dg", "", "u(E", "\u000fk[<j\u0013>T(b\u0004E;\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGtg+N\u0005|", "5dc\u000e_3He\u007f~{m\u0010\u0006o>rG\r\u0006@r#+/.\u000fF\u0007.4U\r$Av\u00105IWE{C\u0018\"hh9\u0003q,", "u(8", "\u0017", "\u000fk[<j\u0013>T(b\u0004K;\u0004", "5dc\u000e_3He\u007f~{m\u0010\u0006u>lG\r\u0006@r#+/.\u000fF\u0007.4U\r$Av\u00105IWE{C\u0018\"hh9\u0003q,", "\u000fk[<j\u0019BU\u001c\u000e^g\u0013\f\u0016", "5dc\u000e_3He\u0006\u0003|a;`\u0012\u0016t\ro`J\u0001\t#[WL=\u00015>Xy/;w\u001f(T?OuD-\u000fua@\u0007_:N", "\u000fk[<j\u0019BU\u001c\u000e^g\u0019\f\u0010", "5dc\u000e_3He\u0006\u0003|a;`\u0012\u001ct\u0007o`J\u0001\t#[WL=\u00015>Xy/;w\u001f(T?OuD-\u000fua@\u0007_:N", "\u0010ncAb4", "5dc\u000fb;M]!F_h,n\u0015CM", "\u0013mS", "5dc\u0012a+\u00068#~lj@d", "\u0016na6m6Gb\u0015\u0006", "5dc\u0015b9Bh#\b\nZ3Dm9eq4\u0010(", "\u001adUA", "5dc\u0019X-M\u001b}\tzP8\u0011p", " hV5g", "5dc\u001f\\.Ab`c\u0005^\u001e\t\u001d\u0017", "!sP?g", "5dc g(Kb`c\u0005^\u001e\t\u001d\u0017", "\"n_", "5dc!b7\u00068#~lj@d", "$daA\\*:Z", "5dc#X9MW\u0017z\u0002&\u0011\u0007\t!q\u0014\u0010", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m1105getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* JADX INFO: renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m1107getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* JADX INFO: renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m1106getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* JADX INFO: renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m1108getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* JADX INFO: renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m1114getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* JADX INFO: renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m1110getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* JADX INFO: renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m1115getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* JADX INFO: renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m1109getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* JADX INFO: renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m1112getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* JADX INFO: renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m1113getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* JADX INFO: renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m1111getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* JADX INFO: renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m1116getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }
    }

    static {
        int iM1096constructorimpl = m1096constructorimpl(8);
        AllowLeftInLtr = iM1096constructorimpl;
        int iM1096constructorimpl2 = m1096constructorimpl(4);
        AllowRightInLtr = iM1096constructorimpl2;
        int iM1096constructorimpl3 = m1096constructorimpl(2);
        AllowLeftInRtl = iM1096constructorimpl3;
        int iM1096constructorimpl4 = m1096constructorimpl(1);
        AllowRightInRtl = iM1096constructorimpl4;
        Start = m1101plusgK_yJZ4(iM1096constructorimpl, iM1096constructorimpl4);
        End = m1101plusgK_yJZ4(iM1096constructorimpl2, iM1096constructorimpl3);
        int iM1096constructorimpl5 = m1096constructorimpl(16);
        Top = iM1096constructorimpl5;
        int iM1096constructorimpl6 = m1096constructorimpl(32);
        Bottom = iM1096constructorimpl6;
        int iM1101plusgK_yJZ4 = m1101plusgK_yJZ4(iM1096constructorimpl, iM1096constructorimpl3);
        Left = iM1101plusgK_yJZ4;
        int iM1101plusgK_yJZ42 = m1101plusgK_yJZ4(iM1096constructorimpl2, iM1096constructorimpl4);
        Right = iM1101plusgK_yJZ42;
        Horizontal = m1101plusgK_yJZ4(iM1101plusgK_yJZ4, iM1101plusgK_yJZ42);
        Vertical = m1101plusgK_yJZ4(iM1096constructorimpl5, iM1096constructorimpl6);
    }
}
