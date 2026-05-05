package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnjO0LeN0ZS@\u000fsڔ<$i)yCA^ _8ޛme\u0018g\u001dI\u0013\nZW\u001c$x\u0003,wV)a \u0011JB\u001e@cQ}@Q`#:KDz:F~\u001d\u0001H0x\u0014\u0005\u0002[K:\u0018vdú9ĥҫQ\u0007 \u001a\u0014Gh!,f\u007fNdS\u001daH6;\u0003\u0018M~+m<\u0015M;S\u001bK͒uѭӿ/B=C#4\u001c\u0019\u0015bs?1L\"A\u0013y?'YV$[Dj\u0018\u0014C8\u0016!&\t4o\u001dQ\u000f\u0019W/]tcP<5(~\n\u001fT\u0004<\u0013mlvC(z \u000ea\u0002#WNa\u001a^p\r+eD)=\u007fa8\u007f//_oP1Ne\u007f5\u0011,9\u0019nO\\\u001b2ؤ\u0014\u001aƛw\\9TFעd|\ta?s#\u001fa͌.\u001cσK~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042LC\u0019g;\u001c%o]H\u0011p\u0002", "", "/cYBf;\"\\'~\nl", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\f\u0005N\u0001&%\u001d", "=kS\u0016a:>b'", "<df#T3NS", "", "1n]@h4>R\u0003\u007f{l,\f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/uP6_(;Z\u0019", "1n]@h4>R\u0003\u007f{l,\f\u0017vMeo^UT\u0007", "uI\u0018\u0017", "1n]@h4>R\n~\u0002h*\u0001\u0018C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "@d\\.\\5B\\\u001b", "", "1n]@h4>R\n~\u0002h*\u0001\u0018C-k\u001a\u0006HL~!", "uI5u=", "6hS2@6MW#\b", "F", "G", ";nc6b5(T", "Ag^D@6MW#\b", "D`[BX\u0016?", "7mb2g:", "\u0011n\\=T5B]\"", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
interface SideCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    Insets adjustInsets(Insets insets, int i2);

    /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo1044consumedOffsetsMKHz9U(long j2);

    /* JADX INFO: renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo1045consumedVelocityQWom1Mo(long j2, float f2);

    float motionOf(float f2, float f3);

    int valueOf(Insets insets);

    default float showMotion(float f2, float f3) {
        return RangesKt.coerceAtLeast(motionOf(f2, f3), 0.0f);
    }

    default float hideMotion(float f2, float f3) {
        return RangesKt.coerceAtMost(motionOf(f2, f3), 0.0f);
    }

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u00066\f6B\u0005#4\u0012}\bnj?1Le^.Zݷ2\u000f\u0002{<řc$\bCCU ~J\u000bQSortЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\u000eM@eokG\u0011xD\u001482PH*\t\u000f+BH>\tےBŷë\u00162F\u0004Hf][\u0013\u001b*\u0006l\"Wȩ^ʄR8Plk=\u007f1\u0011mZNUd\u0007ŪOϘJV/\r\u0005gn9N>M\u0015S[YޚTÜC\u0005GqK\u000e9555as\u0006A/ß\u0016Ʀ/Q\u0015]\u00012؛\u0005Vh\u000f-˥k\u0012Jם\u0012="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042LC\u0019g;\u001c%o]H\u0011pj,\u0001/RHW0f[H", "", "u(E", "\u0010ncAb4,W\u0018~XZ3z\u00196a\u000f2\t", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006}!Ic\u000e/\u0001[\u001a-M!7r2.\u001cdpC\u0014\"\nX~2CUR6e\u0011OG#!d\u0016</\f\u00057=+lT>\u001b\u00176V@\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042LC\u0019g;\u001c%o]H\u0011pj,\u0001/RHW0f[1\u001a\u001e!i\u0018V\u0019\u0011\u0004Y\u001f uBG&\u0004;S\u000fy4V", "\u001adUAF0=Svz\u0002\\<\u0004\u0005>o\r", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006}!Ic\u000e/\u0001[\u001a-M!7r2.\u001cdpC\u0014\"\nX~2CUR6e\u0011Y=\u0015!H\u0012M+j\u0001`?4u@F)\u0015j\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042LC\u0019g;\u001c%o]H\u0011pj,\u0001/RHW0f[1$\u0014\u0013i{R*\rbUH\"~K3.\u00129\bM\u0011", " hV5g\u001aBR\u0019\\ve*\r\u0010+t\n5", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006}!Ic\u000e/\u0001[\u001a-M!7r2.\u001cdpC\u0014\"\nX~2CUR6e\u0011_A\u0016\u0015i{R*\rbUH\"~K3.\u00129\bM", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042LC\u0019g;\u001c%o]H\u0011pj,\u0001/RHW0f[1*\u0018\u0014]\u001d</\f\u00057=+lT>\u001b\u00176V@\u0007>", "\"n_ \\+>1\u0015\u0006xn3x\u00189r", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006}!Ic\u000e/\u0001[\u001a-M!7r2.\u001cdpC\u0014\"\nX~2CUR6e\u0011aG\u001f\u007f^\rN\t\t\fWQ+jSA,Fw", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042LC\u0019g;\u001c%o]H\u0011pj,\u0001/RHW0f[1,\u001e\u001dH\u0012M+j\u0001`?4u@F)\u0015j\u0015W", "1g^<f,\u001cO |\u000be(\f\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00042LC\u0019g;\u001c%o]H\u0011p\u0002", "AhS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGtg+N\u0005|", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1g^<f,\u001cO |\u000be(\f\u0013<-\t,GN\u0007s)", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=sXO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u0013d\u001eW*\t\u0014]K-8K33\u0012<XK)l\u007f\fs\n<h\u0001IR\u001fQ\u0007j", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f2, float f3) {
                return f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i2) {
                return Insets.of(i2, insets.top, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo1044consumedOffsetsMKHz9U(long j2) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m3937getXimpl(j2), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo1045consumedVelocityQWom1Mo(long j2, float f2) {
                return VelocityKt.Velocity(Velocity.m6875getXimpl(j2) - f2, 0.0f);
            }
        };
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f2, float f3) {
                return f3;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i2) {
                return Insets.of(insets.left, i2, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo1044consumedOffsetsMKHz9U(long j2) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m3938getYimpl(j2));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo1045consumedVelocityQWom1Mo(long j2, float f2) {
                return VelocityKt.Velocity(0.0f, Velocity.m6876getYimpl(j2) - f2);
            }
        };
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f2, float f3) {
                return -f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.right;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i2) {
                return Insets.of(insets.left, insets.top, i2, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo1044consumedOffsetsMKHz9U(long j2) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m3937getXimpl(j2), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo1045consumedVelocityQWom1Mo(long j2, float f2) {
                return VelocityKt.Velocity(Velocity.m6875getXimpl(j2) + f2, 0.0f);
            }
        };
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f2, float f3) {
                return -f3;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.bottom;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i2) {
                return Insets.of(insets.left, insets.top, insets.right, i2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedOffsets-MK-Hz9U */
            public long mo1044consumedOffsetsMKHz9U(long j2) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m3938getYimpl(j2));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* JADX INFO: renamed from: consumedVelocity-QWom1Mo */
            public long mo1045consumedVelocityQWom1Mo(long j2, float f2) {
                return VelocityKt.Velocity(0.0f, Velocity.m6876getYimpl(j2) + f2);
            }
        };

        private Companion() {
        }

        /* JADX INFO: renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m1046chooseCalculatorni1skBw(int i2, LayoutDirection layoutDirection) {
            if (WindowInsetsSides.m1098equalsimpl0(i2, WindowInsetsSides.Companion.m1112getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m1098equalsimpl0(i2, WindowInsetsSides.Companion.m1115getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m1098equalsimpl0(i2, WindowInsetsSides.Companion.m1113getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m1098equalsimpl0(i2, WindowInsetsSides.Companion.m1109getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m1098equalsimpl0(i2, WindowInsetsSides.Companion.m1114getStartJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return LeftSideCalculator;
                }
                return RightSideCalculator;
            }
            if (!WindowInsetsSides.m1098equalsimpl0(i2, WindowInsetsSides.Companion.m1110getEndJoeWqyM())) {
                throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
            }
            if (layoutDirection == LayoutDirection.Ltr) {
                return RightSideCalculator;
            }
            return LeftSideCalculator;
        }
    }
}
