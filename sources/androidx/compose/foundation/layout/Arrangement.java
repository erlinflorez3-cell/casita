package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Arrangement.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?2Le^.ZS0!s{J$c$\bCC٥\"}0\tWȞog|PbŏK\u000f\u0014)\u0001j2I]xk\u001b\u00172HzG3coE9fz>\u000562*8\u007f\t\u0007ʥ*^Ƶ'zqJD\u0015s\u00056\u0001\u001aMR\u000b\u001aŪ\n>.\u0001fjumNH\u001bij31#\u0002B|H&5E[\u001bel';x\u0012\"9`O5CG\u001a\bO}ib\u001b? a5l5LCI\"}f\\\u000e;-+}5\u000ev4\u0006\u001dQ\u000f4W/]\u000ecP<S>\u07beԫ\u0011<\n:NJV[E\u001a\u0015,>7\u0003\u001ak@~*\u000fF\u000e$y6EM079c3f\u007f\r\u0002ϊ\u05ee;{\u000b;fN\u000f\u001e9[\u00032\u0011\u0019)y\u0010Q_wpAVu\"Yk\u00164tp+B\u0004^o03\n;F\u0017Sb\"ݽ؝%k\bx\r\u0013\u00056xh\u0002\u000e\u0003LNG\u0007\u0016eP9\u0010hk|\u0005\u001ax\u0005\\::e\u001c\u0003/.\f!JtwjLkīʽSho\u001d\u0016\t\u0018XGfe}\u001fo\u001c|Q^a[\u0002g\u001e\tjvBglf\u0013\u0002~B\u00024\u000b`6LJH\u0019;>ӻΌR\f\u0019f\b\u001d*iD1G\u0001EL\u0011CZA+/\u0010^v7\u0017TaL3m2\u001e!\u0001~\u0005!su#a,+\fhΊۮU5\u001f\\\u001e:vk\u0015#5\u0006$\u0004U dGz&\\z˖z\u008dک\u001e;WiKNW\u001f7i\u001a-sX#i_\u0006*')6*\u0013I\tFg6\f71Äi\u07baׅX\u0019(3l0k(r7\u0012at|wgbCs>w,3]JnP|3Ad*͓nܲĿ9/Ic+T@A=Ty]\u0018\u0014Vy\u00117VxsDDcD\u001b\u0013gksSJY[\u000f>PJ|\u0005RH\u0019\u001e\u0018D\u00194;Wv\u0004+ݨ\\\tg\u00190\u0016f5.Ct-ܲ<݇s\n<ʝo,yF\f\u0014vE+\u0015[X8\b{Qt\u000bx\u0016@\u000fRϊp݁ I(݈gd\u000f8\u0014s08GDp\u000f\r#2?D<6\u0017yX@к\u0012Ģ\u0004Rgʕ'4H\u0001IV&V~jdWUzSp9*/\u0006E7tֵ7̰\tyN\u07bc?e8\u0012a\u001d!\u001dpa\rpuERgQ\u001bV_7\u000f\u001cؗE͕\u0006B\fڛ9oq\u0004\u001a80~#W&%\nk\u001fu\u000f0\r\u0012\fh%ЎxՆj^VÝ9\u0001\u0001\u0014\u001c<\"\u0011\u00111]|@|;efweOP\u0005m\u05f5+ܰ\u0010\tk˪+/\fO;=al\u001aB\nf$U\f$8 U\u0006+%3ޮ\u0010ҁ\u000ei#ŭ&s\u001c\u007f\u0010\t+R&\"<OƖr\u000f6\u000b<р\u001ea\u0001իb\""}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qp\u000f", "", "u(E", "\u0010ncAb4", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "5dc\u000fb;M]!=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u000fb;M]!", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u001dN\u00046KJJ32", "\u0011d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J3F_c=!!^\fJ2b", "5dc\u0010X5MS&=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0010X5MS&", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XY\\J\u0005\u0012g\u001dR)\t\f/", "\u0013mS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "5dc\u0012a+|O\"\b\u0005m(\f\r9n\u000e", "5dc\u0012a+", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH", "!oP0X\bK])\by", "5dc c(<St\f\u0005n5{G+n\t2\u000b<\u0010\u001b!P}", "5dc c(<St\f\u0005n5{", "!oP0X\t>b+~zg", "5dc c(<Su~\np,|\u0012ma\t1\u0006O|&\u001bQx\u001c", "5dc c(<Su~\np,|\u0012", "!oP0X\fOS\"\u0006\u000f", "5dc c(<Sx\u0010zg3\u0011G+n\t2\u000b<\u0010\u001b!P}", "5dc c(<Sx\u0010zg3\u0011", "!sP?g", "5dc g(KbWz\u0004g6\f\u0005>i\n1\n", "5dc g(Kb", "\"n_", "5dc!b7|O\"\b\u0005m(\f\r9n\u000e", "5dc!b7", "/kX4a,=", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", ">kP0X\n>\\(~\b", "", "Bnc._\u001aBh\u0019", "", "Ahi2", "", "=tc\u001db:Bb\u001d\t\u0004", "@de2e:>7\"\n\u000bm", "", ">kP0X\n>\\(~\b\u001d-\u0007\u00198d{7\u007fJ\n\u0011\u001eC\u0004\u0018L\u0006\u001fBY\u0005 3{\u0016", ">kP0X\u0013>T(h\bM6\b", ">kP0X\u0013>T(h\bM6\bG0o\u00101z<\u0010\u001b!Pi\u00158\u000b/Ehw-7t\u0016*[C", ">kP0X\u0019BU\u001c\u000edk\t\u0007\u0018>o\b", ">kP0X\u0019BU\u001c\u000edk\t\u0007\u0018>o\bf|J\u0011 \u0016C~\u0012F\u007f\u001f<U\u0012*G|\u0010;MJ;gB\u001e", ">kP0X\u001aIO\u0017~Vk6\r\u0012.", ">kP0X\u001aIO\u0017~Vk6\r\u0012.$\u00012\fI\u007f\u0013&Ky\u00176}!Ic\u000e/1z\u00165M?Ik", ">kP0X\u001aIO\u0017~W^;\u000f\t/n", ">kP0X\u001aIO\u0017~W^;\u000f\t/n>)\u0006P\n\u0016\u0013Vs\u0018Ep,1m\b0Fg#.TC7y4", ">kP0X\u001aIO\u0017~Zo,\u0006\u0010C", ">kP0X\u001aIO\u0017~Zo,\u0006\u0010C$\u00012\fI\u007f\u0013&Ky\u00176}!Ic\u000e/1z\u00165M?Ik", "AoP0X+\u001bg", "AoP0X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AoP0X+\u001bg`IK1v\u0002\u0003}", "uE\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cKw&=\u0017\u001fHx0'\u0017hi9\u0010rj1\u00014KaX5kNy'!\u0003Z\u001b]/\u000b\u0001`\u0017", "AoP0X+\u001bg`]JD\u0013[xA", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u0003Az\u001aCWLJg;sXO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u0013d\u001eW*\t\u0014]K-8K33\u0012<XK\u0017u\u000e\b\u001f\u00105rpKeN*\u0004\"yV3qUUfO", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u00117z%2K?BAw\u0005\u0011q`F\u0011g+a@%QTY6jR<>\u001e\"c\rJ:\u0011\u000fb\u000b+jXA/\u0017u%\u000fHd\n\u000e\u0016\u00165s\u007f\u0001G\u0010T\t\u0019s=0>", "4na\u0012T*A7\"}zq,{", "@de2e:>R", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u000fab<_<MS", "\u0016na6m6Gb\u0015\u0006", "\u0016na6m6Gb\u0015\u0006dk\u001d|\u0016>i}$\u0003", "!oP0X+\u001aZ\u001d\u0001\u0004^+", "$daA\\*:Z", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Arrangement {
    public static final int $stable = 0;
    public static final Arrangement INSTANCE = new Arrangement();
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    };
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    };
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    };
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i2, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    };
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m6638constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
        public float mo904getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i2, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    };
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m6638constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public float mo904getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i2, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    };
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m6638constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public float mo904getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i2, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    };
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m6638constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public float mo904getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i2, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    };

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getCenter$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    private Arrangement() {
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007f\u0007|jAӄLeV4Zݷ2\u000fy\u000f<řc$\bCCU }(neȞ\u0018g\u001dI#5Q\u0013\u001e\u0016'oTI\u0004~\u000e\u0016\u001d9Zom;}sKBxtd\u000fP60C\u0012\u0005/&ZL\u001e\u0004\u0013Cy\u0016XT\u0011\tHR%M3\u001bHZ\u0015Ŀ\u0003ʟ[ɡ¦5Gǰa>G%\tkPQф^0ŪM\u001cNW-˻\u0013\u0010\u001d3@=T\u001d'Y\"5QâC\u0011ԋu>"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "", "AoP0\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc c(<W\"\u0001B=\u007f\\\u000e~fg", "u(5", "/qa.a.>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Bnc._\u001aBh\u0019", "", "Ahi2f", "", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "=tc\u001db:Bb\u001d\t\u0004l", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Horizontal {
        void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public static float m906getSpacingD9Ej5fM(Horizontal horizontal) {
                return Horizontal.super.mo904getSpacingD9Ej5fM();
            }
        }

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo904getSpacingD9Ej5fM() {
            return Dp.m6638constructorimpl(0);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007f\u0007|jAӄLeV4Zݷ2\u000fy\u000f<$a$w)Q٥J}P\b\u0018puk\u0007J\t\u0010k\u000f4\u001c)n:Pmx\f\u001a?6PxW3{ym=n\u007fN\u0005N<h\\J\u001d\u000f\u001aBH>w1\u0018\"ß\u0014ڌ?\u0081ŦQ\f̂\t\u001e*\bD\"\u000f!תfNȧH{e=5ݬ\u001f\u0018AV'eO\u0005O\u0013e\u0003&̂zmԝ/A"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "", "AoP0\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc c(<W\"\u0001B=\u007f\\\u000e~fg", "u(5", "/qa.a.>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Bnc._\u001aBh\u0019", "", "Ahi2f", "", "=tc\u001db:Bb\u001d\t\u0004l", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Vertical {
        void arrange(Density density, int i2, int[] iArr, int[] iArr2);

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public static float m914getSpacingD9Ej5fM(Vertical vertical) {
                return Vertical.super.mo904getSpacingD9Ej5fM();
            }
        }

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo904getSpacingD9Ej5fM() {
            return Dp.m6638constructorimpl(0);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0013}l|ʑi0rdx.\u0001Sz'y|L$\n&(\u0018\u0012ټ\u001cջ!ޛӠMf̊rNr\rI\u0012\u0014\u001aӇi,ղU\be\u0015\u0015̒^\u001e>;Mu\\AbzU3\u001fݮ&=҇\t\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J3F_c=!!^\fJ2b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "AoP0\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc c(<W\"\u0001B=\u007f\\\u000e~fg", "u(5", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public static float m908getSpacingD9Ej5fM(HorizontalOrVertical horizontalOrVertical) {
                return HorizontalOrVertical.super.mo904getSpacingD9Ej5fM();
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo904getSpacingD9Ej5fM() {
            return Dp.m6638constructorimpl(0);
        }
    }

    public final Horizontal getStart() {
        return Start;
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final Vertical getTop() {
        return Top;
    }

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    /* JADX INFO: renamed from: spacedBy-0680j_4 */
    public final HorizontalOrVertical m898spacedBy0680j_4(float f2) {
        return new SpacedAligned(f2, true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.Companion.getStart().align(0, i2, layoutDirection));
            }
        }, null);
    }

    /* JADX INFO: renamed from: spacedBy-D5KLDUw */
    public final Horizontal m899spacedByD5KLDUw(float f2, final Alignment.Horizontal horizontal) {
        return new SpacedAligned(f2, true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(horizontal.align(0, i2, layoutDirection));
            }
        }, null);
    }

    /* JADX INFO: renamed from: spacedBy-D5KLDUw */
    public final Vertical m900spacedByD5KLDUw(float f2, final Alignment.Vertical vertical) {
        return new SpacedAligned(f2, false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(vertical.align(0, i2));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.Arrangement$aligned$1 */
    /* JADX INFO: compiled from: Arrangement.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,o\bDJc|\u0004W\u00068\u000b4B\rӬD\u0012&\u0006\u0017nG0\\ev-\u0003W8\u0010\u0004{b&\",ڱG=[\u001d\f&"}, d2 = {"\n`]<a@F])\rS", "", "Ahi2", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "7me<^,", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=sXOf5\u0018_uUr0I\u001625kRt=!g"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
            return invoke(num.intValue(), layoutDirection);
        }

        public final Integer invoke(int i2, LayoutDirection layoutDirection) {
            return Integer.valueOf(horizontal.align(0, i2, layoutDirection));
        }
    }

    public final Horizontal aligned(Alignment.Horizontal horizontal) {
        return new SpacedAligned(Dp.m6638constructorimpl(0), true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.1
            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(horizontal.align(0, i2, layoutDirection));
            }
        }, null);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.Arrangement$aligned$2 */
    /* JADX INFO: compiled from: Arrangement.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,o\bDJc|\u0004W\u00068\u000b4B\rӬD\u0012&\u0006\u0017nG0\\ev-\u0003W8\u0010\u0004{b&\",ڱG=[\u001d\f&"}, d2 = {"\n`]<a@F])\rS", "", "Ahi2", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "7me<^,", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=sXOf5\u0018_uUr0I\u001625kRt=!g"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
        AnonymousClass2() {
            super(2);
        }

        public final Integer invoke(int i2, LayoutDirection layoutDirection) {
            return Integer.valueOf(vertical.align(0, i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
            return invoke(num.intValue(), layoutDirection);
        }
    }

    public final Vertical aligned(Alignment.Vertical vertical) {
        return new SpacedAligned(Dp.m6638constructorimpl(0), false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement.aligned.2
            AnonymousClass2() {
                super(2);
            }

            public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(vertical.align(0, i2));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return invoke(num.intValue(), layoutDirection);
            }
        }, null);
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u000544\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:&c$\bCCU0}*\tUNm̯n`ҙ;C=\u0005V}p,֒Yxk\u0012W@P\u0005W3{qm=n\u000bN\u0005NIh=B\u001d\u000f2BH>\u0010+GY&*0n\f\u0001WԁLĨܨ\u0016\bD<\u000f;%\b\\N`l\f<_'\u0011\u0004ZNUz`\u0001[#^TU$=fՕ*¨˝9\u0017+q\u0011&\u001b{M\u001bWqk%\u0019+5Eas\u0006Q\t\u0004\"+CO;~9+ڑ\u0004ĩԃ\u0010)1mqm!(6x\u0013{;>:\u0012\\αJͶ1&nڜ\u001e5zua@h\u0004dF\u000e\u007f2P%+\u00183Y;Qj(ĭ=ϭRC\u0004˜\u001d )\b|!sV\u0014h# %\u0012_:i@kJ\u0005\u000e0ƥoձtn\nÏ\u00142M\n={)0\u001d0E`\n=/w\u001aHri-\t7íUׂVTH̎~\u0018=7\u0017\frFj\u0013yU%r: e\u001c\u0003\t4\fi؆^ʟ@--ī^QnyxMu\f+@t<*\ty o9\r5kU:ߌc؏z Gֺr\u0007^yPS$\\b<07ʎj\u0015\u007f~Jª(A1Ɩu?"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwb`:X}7VL$", "", "u(E", "\u0011d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "5dc\u0010X5MS&=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0010X5MS&", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w)PHg= \u0015paB\u0016\"\u000fX\u0004+\\VW;XYH", "\u001adUA", "5dc\u0019X-M\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0019X-M", " hV5g", "5dc\u001f\\.AbWz\u0004g6\f\u0005>i\n1\n", "5dc\u001f\\.Ab", "!oP0X\bK])\by", "5dc c(<St\f\u0005n5{G+n\t2\u000b<\u0010\u001b!P}", "5dc c(<St\f\u0005n5{", "!oP0X\t>b+~zg", "5dc c(<Su~\np,|\u0012ma\t1\u0006O|&\u001bQx\u001c", "5dc c(<Su~\np,|\u0012", "!oP0X\fOS\"\u0006\u000f", "5dc c(<Sx\u0010zg3\u0011G+n\t2\u000b<\u0010\u001b!P}", "5dc c(<Sx\u0010zg3\u0011", "/kX4a,=", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "AoP0X+\u001bg", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J3F_c=!!^\fJ2b", "AoP0X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AoP0X+\u001bg`IK1v\u0002\u0003}", "uE\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cKw&=\u0017\u001fHx0'\u0017hi9\u0010rj1\u00014KaX5kNy'!\u0003Z\u001b]/\u000b\u0001`\u0017", "AoP0X+\u001bg`]JD\u0013[xA", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u0003Az\u001aCWLJg;sXO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u0013d\u001eW*\t\u0014]K-8K33\u0012<XK\u0017u\u000e\b\u001f\u00105rpKeN*\u0004\"yV3qUUfO", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "uE;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>h<\u00117z%2K?BAw\u0005\u0011q`F\u0011g+a@%QTY6jR<>\u001e\"c\rJ:\u0011\u000fb\u000b+jXA/\u0017u%\u000fHd\n\u000e\u0016\u00165s\u007f\u0001G\u0010T\t\u0019s=0>", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Absolute {
        public static final int $stable = 0;
        public static final Absolute INSTANCE = new Absolute();
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getLeft$annotations() {
        }

        public static /* synthetic */ void getRight$annotations() {
        }

        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }

        private Absolute() {
        }

        public final Horizontal getLeft() {
            return Left;
        }

        public final Horizontal getCenter() {
            return Center;
        }

        public final Horizontal getRight() {
            return Right;
        }

        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        /* JADX INFO: renamed from: spacedBy-0680j_4 */
        public final HorizontalOrVertical m901spacedBy0680j_4(float f2) {
            return new SpacedAligned(f2, false, null, null);
        }

        /* JADX INFO: renamed from: spacedBy-D5KLDUw */
        public final Horizontal m902spacedByD5KLDUw(float f2, final Alignment.Horizontal horizontal) {
            return new SpacedAligned(f2, false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }

                public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                    return Integer.valueOf(horizontal.align(0, i2, layoutDirection));
                }
            }, null);
        }

        /* JADX INFO: renamed from: spacedBy-D5KLDUw */
        public final Vertical m903spacedByD5KLDUw(float f2, final Alignment.Vertical vertical) {
            return new SpacedAligned(f2, false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$2
                {
                    super(2);
                }

                public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                    return Integer.valueOf(vertical.align(0, i2));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }
            }, null);
        }

        public final Horizontal aligned(final Alignment.Horizontal horizontal) {
            return new SpacedAligned(Dp.m6638constructorimpl(0), false, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$aligned$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return invoke(num.intValue(), layoutDirection);
                }

                public final Integer invoke(int i2, LayoutDirection layoutDirection) {
                    return Integer.valueOf(horizontal.align(0, i2, layoutDirection));
                }
            }, null);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4ߚ\u007f\u0007|jA0RkP.hS2\u000fq\r<$iҕyCAU\"}0\u0015WȞog|Jb\u000bY\u000f\u000e\u0016~j4Ic\fe\u0012\u00153HĥEIݹ =g_5e\u0015$@\"Py3\u0002*.V\u0012\u000fzqN\u001c*>D\tNb\u000f]\u0005H\u0018\u0016@0\u0001LcwPFH\u001bcP.Q\bݦFN5gx\u0011[\u001f^TU\u000e=Ҵ\u001fӡ?6Æ\u0014Ǭ٨\u0007\tXnM\u0011\bxK\u0019\u0001'U.\u0010לX~s\u000e)-?_\u000fmrTb\u0015Sp\fU2_e[P<.\u000ey*\u0012\u0003Ȑ\u000fNjVDE\u001a\u0015ڜ>9zra@h\u0002\rC0\u0001g6%'\u00183Y<K\u0001WaI\u001dfK\f\u0007\u001d\u001eQ\u0007~#kT<g%\u001ddw\u007f7g?kM\u0015̪XȖlՎͲf\u00040\u001b>_H@\n*F\u0017S:\f?1;\u0004\u0004^C\u0016\u0012Kòi\u001cp`dX\"\u001d\u001c}Ҿ\bT`R\u0002\u001dk~r\u001f@Yw*s\u001f}63H\\&]Q)\u001epgh\u0018p}a\u0018HGfe}\u001fo\u001c|Q^a<\u0002g\u001e\bjvBc\u0003vMztak\f\t|P\"`i\u001b\u0014\u0006\u001e\\N:\u0019bC\u007f?L,_=\r\u0019V)6Bo!Os+\f\u001e\u0003lG4\u0005y$#\u000f\u0011Rlp\u001en\tK<|\u000f(C@\u007f:Ԋ*[*ֻL~)\u0010\r}PVuN_L\u001b\u0019\u0091Y\u0002(چ2;W:K\u001f_\u001672\u001a-sMɢdʸ͠\u0011&ϸ\u0001\u0002\u0017;v=\u007f\np}:n;d]d/\"%_Iד\nݦ~טՌEyĕg\\\u0013[LX\u000b\u0005_M\\Fً\u0005(&(\u0007ȝ>+45C-<ɟ{;"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwtn(Lv&#SR.eRq\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J3F_c=!!^\fJ2b", "AoP0X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@s[\u001a\\9K]&", "", "/kX4a4>\\(", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "uEI\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007l\rT\u001c8\\J?t}#&p+=\u0010r,[\u007f#N\u0016-,]N\u0003D#od\u0017\\:\u001a\u0015WP.{,3,\u000e,VW~Y", "5dc\u000e_0@\\!~\u0004m", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "5dc\u001fg3&W&\f\u0005k", "u(I", "5dc c(<S`]N>1L\n\u0017", "u(5", "\u0014", "AoP0\\5@", "5dc c(<W\"\u0001B=\u007f\\\u000e~fg", "1n\\=b5>\\(J", "1n\\=b5>\\(JB=\u007f\\\u000e~fg", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "1n_F ~\u001fS%\u0007\u0006l", "uEI\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007l\r1|*VBHu8\u001d(2_C\u000fn6\\vpHV^5[N\u0002A\u001e\u001b$\u0015J?\u0017\u0015h\u000b\u007f{Q3(\n,Q\u0002Dw?y!\n3jo\u001e]\u0014I\u0003\u0015t\u0017", "3pd._:", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", "/qa.a.>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Bnc._\u001aBh\u0019", "Ahi2f", "", ":`h<h;\u001dW&~xm0\u0007\u0012", "=tc\u001db:Bb\u001d\t\u0004l", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable = 0;
        private final Function2<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        public /* synthetic */ SpacedAligned(float f2, boolean z2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, z2, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-8Feqmps$default */
        public static /* synthetic */ SpacedAligned m909copy8Feqmps$default(SpacedAligned spacedAligned, float f2, boolean z2, Function2 function2, int i2, Object obj) {
            if ((1 & i2) != 0) {
                f2 = spacedAligned.space;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                z2 = spacedAligned.rtlMirror;
            }
            if ((i2 & 4) != 0) {
                function2 = spacedAligned.alignment;
            }
            return spacedAligned.m911copy8Feqmps(f2, z2, function2);
        }

        /* JADX INFO: renamed from: component1-D9Ej5fM */
        public final float m910component1D9Ej5fM() {
            return this.space;
        }

        public final boolean component2() {
            return this.rtlMirror;
        }

        public final Function2<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: copy-8Feqmps */
        public final SpacedAligned m911copy8Feqmps(float f2, boolean z2, Function2<? super Integer, ? super LayoutDirection, Integer> function2) {
            return new SpacedAligned(f2, z2, function2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.m6643equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && Intrinsics.areEqual(this.alignment, spacedAligned.alignment);
        }

        public int hashCode() {
            int iM6644hashCodeimpl = ((Dp.m6644hashCodeimpl(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            Function2<Integer, LayoutDirection, Integer> function2 = this.alignment;
            return iM6644hashCodeimpl + (function2 == null ? 0 : function2.hashCode());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SpacedAligned(float f2, boolean z2, Function2<? super Integer, ? super LayoutDirection, Integer> function2) {
            this.space = f2;
            this.rtlMirror = z2;
            this.alignment = function2;
            this.spacing = f2;
        }

        /* JADX INFO: renamed from: getSpace-D9Ej5fM */
        public final float m912getSpaceD9Ej5fM() {
            return this.space;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        public final Function2<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public float mo904getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i3;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iMo704roundToPx0680j_4 = density.mo704roundToPx0680j_4(this.space);
            boolean z2 = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (!z2) {
                int length = iArr.length;
                int i4 = 0;
                i3 = 0;
                iMin = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    int iMin2 = Math.min(i3, i2 - i6);
                    iArr2[i5] = iMin2;
                    iMin = Math.min(iMo704roundToPx0680j_4, (i2 - iMin2) - i6);
                    i3 = iArr2[i5] + i6 + iMin;
                    i4++;
                    i5++;
                }
            } else {
                i3 = 0;
                iMin = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i7 = iArr[length2];
                    int iMin3 = Math.min(i3, i2 - i7);
                    iArr2[length2] = iMin3;
                    iMin = Math.min(iMo704roundToPx0680j_4, (i2 - iMin3) - i7);
                    i3 = iArr2[length2] + i7 + iMin;
                }
            }
            int i8 = i3 - iMin;
            Function2<Integer, LayoutDirection, Integer> function2 = this.alignment;
            if (function2 == null || i8 >= i2) {
                return;
            }
            int iIntValue = function2.invoke(Integer.valueOf(i2 - i8), layoutDirection).intValue();
            int length3 = iArr2.length;
            for (int i9 = 0; i9 < length3; i9++) {
                iArr2[i9] = iArr2[i9] + iIntValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            arrange(density, i2, iArr, LayoutDirection.Ltr, iArr2);
        }

        public String toString() {
            return (this.rtlMirror ? "" : "Absolute") + "Arrangement#spacedAligned(" + ((Object) Dp.m6649toStringimpl(this.space)) + ", " + this.alignment + ')';
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(ArraysKt.getLastIndex(iArr), 1);
        float f2 = (z2 && iArr.length == 1) ? fMax : 0.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + fMax;
                i3++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8 + fMax;
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z2) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        if (!z2) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public final void placeCenter$foundation_layout_release(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (!z2) {
            int length2 = iArr.length;
            float f2 = length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        float f3 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f3);
            f3 += i8 + length;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = !(iArr.length == 0) ? (i2 - i4) / iArr.length : 0.0f;
        float f2 = length / 2;
        if (!z2) {
            int length2 = iArr.length;
            int i6 = 0;
            while (i3 < length2) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + length;
                i3++;
                i6++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i8 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i8 + length;
        }
    }

    private final void forEachIndexed(int[] iArr, boolean z2, Function2<? super Integer, ? super Integer, Unit> function2) {
        if (z2) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                function2.invoke(Integer.valueOf(length), Integer.valueOf(iArr[length]));
            }
            return;
        }
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            function2.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2]));
            i2++;
            i3++;
        }
    }
}
