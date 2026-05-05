package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4`\u0007\":\u001b\u007f\u0007lpA0RkP.XZ0\u0014\u0002ڔd$\n#27KY(}:\t}Owk|Lr\u000bq\u0010\u0016\u001a\u0007mDI\u0004ym\u0016\u001d6Zom4]sK>xtd\u0006060>\u0012\u0005/\u001b:L\u001e}\u0013Cy\r\"4NxRR;N\u0015\u001e \u000fV /\u001flk\\@`l\f;?'\u0011tZNU`@\u0001[\u0019^TU\u000e\u0007e,8X7c\u00165W\u0011\u0015j[m\u0004ӭu=\u0013woB9i\fWdY0\u0018#Lg\r\f\u0015l[՝P_Ѩ&˃յgMV16\u001cCԥ\fJ)&\u0006UΞ^3 f\u0016\u000eKt!TpV\b^P\u0002\u0013ad\u0018U\u00069+G\u001e~Q\u0010<IT={\u0013\u00116#/oQaZ\u000en\u001a3T&RaWF=VT\"Ykn4vh\u00028\u000bHG.0,\u00174\u00173?s9Q\"\u001c\bNDu\u007f\u001d`\u0017T\u001aXN@0x.7X\n<`Jd\u0013vhT\u0007-AS\"T\u0015\n \u0013N](B'%\u001e[gh\u0018k}c\u0010%=tOY\u001dl\u0085Vުӷ77W\n\u001e\t\u001b\b\"gTb3z\u0017Ha5r^>!`G1ݯwDJ\\6+2m\u001dbHtL'\t-H1\u001frE\u000b*wZ\u00172ESו#\u0002ɦ#ڏ֊\u0005Rb\u001e}\fAd:+x\"[B\u00029'Gm\"\u0017VC\"ʍ}rŋFх֙KNrE\u0004yD;$JQQ]>C\u0013\rJJ\u0002[g\u0013qхPLʵ&ϕ܃}\u0011A\u001a<\fP\u0006~^xjxP\u0005\u001b0\u0018vrQ*+~ّ`EܢFϊӝ\u000f]D|\u0001'*S\\8\u0015\u0005M\u001fߋ\u007fǻޫ{4ԩG/%\u0016\u0006&G\u0017gmw\u0001~\u0011p\u0014>t\u0014\u0005ѳbܞͪaPЄ6C@Ig\u0011V$*\u007f\u0011S\u0019\u0002\u0006\u000eZ\tb\u000eЂGШҥoUиQ\u00137}t\u0019D\u000fvjiKc\u0007\f7F_Xt̎|жۤB$ݱQ[om{]t\rP$\u0018\u001cLH|\u00164=NWΩa־߮\u0005r͛:ICb\u0013N!&:BJ\u0019[Zbp\u001e\u0010)\u0001̄^ʕƘ1AǠ?^\u0016T\u0007nnJ\u000bwSqqA\u000f\b'3Lyî0܊\u0600ESвg:\tS+\u001b3lU\u0017t6{[bA3(\u0007\u0002׃D؏ǖH\u0001\u0530\bO1my\u0002$:\u001e\u0016+Sh2G[)_%1ϕ\nٝΝMcʝ\u0016nZN0;\u0017|\u0003(J\u001b_\"'Q\u000bo\u0011.ۄMߗ\u0378B\u0019ݨ\u001bL1\u0007\u001a\u000f{H!H\u0014F}TWu,'*XƐ:ջґ\u001f\u001fڗ\b|)\\e ~\fc7H'B-p\u000f!\u0013~!˅-\u05fdȌq\tڷ\f>W\u0002A\u0014+`_\t\u00062\u0011>9x\u001eByiɆ\tɨڒbmό\u000f\u000bn1d\f\u0007/V;\u00178\u001eE!fr:?TߩWҹؠ\u0013\u0014Ӕ#>\u0010b7\"gen\u0010y`܃\r47n0ԿM^Q&}%\u0019Ȋ\b^"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;+MBuA,j", "", "1k^0^\u000bBO \\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ad[2V;H`v\t\u0002h9", "1n]AT0GS&\\\u0005e6\n", ">da6b+,S ~xm6\ne9r~(\t\u001e\u000b\u001e!T", "1k^0^\u000bBO lze,z\u0018/d]2\u0005O\u0001 &%y\u0015F\u0004", "1k^0^\u000bBO n\u0004l,\u0004\t-t\u007f'YJ\n&\u0017P~kF}/B", ">da6b+,S ~xm6\nv/l\u007f&\u000b@\u007ft!P~\n@\u007f%B7\b'Az", ">da6b+,S ~xm6\nx8s\u007f/{>\u0010\u0017\u0016%y\u0017Kr)>Y\u000b}At ;", ">da6b+,S ~xm6\nv/l\u007f&\u000b@\u007ft!P~\u000eE\u0006\u0003?`\b-", ">da6b+,S ~xm6\nx8s\u007f/{>\u0010\u0017\u0016%y\u0017Kv.D7\b'Az", "Bh\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z\u001e\u000b &Cs\u0017<\u0004\u0003?`\b-", "Bh\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007ft!P~\n@\u007f%B7\b'Az", "Bh\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z\u001e\u000b &Gx\u001d\u001a\u0001,?f", "Bh\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007ft!P~\u000eE\u0006\u0003?`\b-", "uI9\u0017=\u0011#8}c_C\u0011am\u0016k\n7\u0003D\n`\u001cXwW@\u007f45f\u0007\u001c>7t.N?KrC{\u001fqoH\u0014s*]\u00014/H[2\\_H\u0001\u0005", "5dc\u0010_6<Yw\u0003ve\n\u0007\u00109rGrz\u0012z|\u001c7", "u(9", "\u0018", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f(z\u001e\u000b &Gx\u001d\u001a\u0001,?fEj6?\u0010\u0014R3", "5dc\u0010_6<Yw\u0003ve\u001c\u0006\u0017/l\u007f&\u000b@\u007ft!P~\u000eE\u0006\u0003?`\b-~8\u0015\u007fG)@[", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109rGrz\u0012z|\u001c7", "5dc\u001dX9B]\u0018lze,z\u00189r\\2\t?\u0001$tQv\u0018I>o4+w\u0006<]", "5dc\u001dX9B]\u0018lze,z\u00189rm(\u0003@~&\u0017FM\u0018E\u0006!9b}-\u0015w\u001d8Z\u000b\u0006j\u0006\u0018zmQ", "5dc\u001dX9B]\u0018lze,z\u00189rm(\u0003@~&\u0017FM\u0018E\u0006%>h[*>w#u\u0018B\re\u001a#\u0005", "5dc\u001dX9B]\u0018lze,z\u00189ro1\n@\b\u0017\u0015Vo\r\u001a\u0001.DU\u0002)7zs8TMH3~\u001dfbG>v", "5dc\u001dX9B]\u0018lze,z\u00189ro1\n@\b\u0017\u0015Vo\r\u001a\u0001.DY\u0007/\u0015w\u001d8Z\u000b\u0006j\u0006\u0018zmQ", "5dc X3>Q(\t\b<6\u0004\u0013<-J'M:f\u001c\u0007", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u0007(yO\u0001\u0016tQx\u001d8z.5f[*>w#u\u0018B\re\u001a#\u0005", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u0007(yO\u0001\u0016tQx\u001d<\u007f4\u0013c\u0005*D5`-\u001f=!p$", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001fn\u000e(\u0003@~&\u0017FM\u0018E\u0006!9b}-\u0015w\u001d8Z\u000b\u0006j\u0006\u0018zmQ", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001fn\u000e(\u0003@~&\u0017FM\u0018E\u0006%>h[*>w#u\u0018B\re\u001a#\u0005", "1k^0^\u000bBO \\\u0005g;|\u0012>C\n/\u0006M", "Ad[2V;>R", "", "1k^0^\u000bBO \\\u0005g;|\u0012>C\n/\u0006MH(\u007fZLX\r|c=U\r Dq\u00125\u001b=Hk;\u001e\u0011va", "uY\u0018\u0017", "1n_F", "1n_F +/6\f\u000fL:", "uI9\u0017=\u0011#8}c_C\u0011amrL{1zM\u000b\u001b\u0016Z9\fF~0?g}i?i%.ZG7r\u0002g\u0004li9qg*Tv4%VU6i`H", "3pd._:", "=sW2e", "6`b566=S", "", ">da6b+,S ~xm6\nf9n\u000f$\u007fI\u0001$tQv\u0018I", ">da6b+,S ~xm6\nf9n\u000f$\u007fI\u0001$tQv\u0018I>6\u001elZj\bsT6IR;x8\u001a\u001c6[F\u0007j,J\u0005'", ">da6b+,S ~xm6\nf9n\u000f(\u0005O^!\u001eQ|", ">da6b+,S ~xm6\nf9n\u000f(\u0005O^!\u001eQ|UM_8\u0012$N&uu\u0012=MP?g;k\u000fua@\u0007_:N", "Bh\\2F,ES\u0017\u000e\u0005k\n\u0007\u0012>a\u00041{M^!\u001eQ|", "Bh\\2F,ES\u0017\u000e\u0005k\n\u0007\u0012>a\u00041{M^!\u001eQ|UM_8\u0012$N&uu\u0012=MP?g;k\u000fua@\u0007_:N", "Bh\\2F,ES\u0017\u000e\u0005k\n\u0007\u0012>e\t7YJ\b!$", "Bh\\2F,ES\u0017\u000e\u0005k\n\u0007\u0012>e\t7YJ\b!$\u000f\u0001vOSo\u0006_<(3|\u0016;Q?B9.+\u0015oa5\u0015c", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TimePickerColors {
    public static final int $stable = 0;
    private final long clockDialColor;
    private final long clockDialSelectedContentColor;
    private final long clockDialUnselectedContentColor;
    private final long containerColor;
    private final long periodSelectorBorderColor;
    private final long periodSelectorSelectedContainerColor;
    private final long periodSelectorSelectedContentColor;
    private final long periodSelectorUnselectedContainerColor;
    private final long periodSelectorUnselectedContentColor;
    private final long selectorColor;
    private final long timeSelectorSelectedContainerColor;
    private final long timeSelectorSelectedContentColor;
    private final long timeSelectorUnselectedContainerColor;
    private final long timeSelectorUnselectedContentColor;

    public /* synthetic */ TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15);
    }

    private TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.clockDialColor = j2;
        this.selectorColor = j3;
        this.containerColor = j4;
        this.periodSelectorBorderColor = j5;
        this.clockDialSelectedContentColor = j6;
        this.clockDialUnselectedContentColor = j7;
        this.periodSelectorSelectedContainerColor = j8;
        this.periodSelectorUnselectedContainerColor = j9;
        this.periodSelectorSelectedContentColor = j10;
        this.periodSelectorUnselectedContentColor = j11;
        this.timeSelectorSelectedContainerColor = j12;
        this.timeSelectorUnselectedContainerColor = j13;
        this.timeSelectorSelectedContentColor = j14;
        this.timeSelectorUnselectedContentColor = j15;
    }

    /* JADX INFO: renamed from: getClockDialColor-0d7_KjU, reason: not valid java name */
    public final long m2717getClockDialColor0d7_KjU() {
        return this.clockDialColor;
    }

    /* JADX INFO: renamed from: getSelectorColor-0d7_KjU, reason: not valid java name */
    public final long m2726getSelectorColor0d7_KjU() {
        return this.selectorColor;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2720getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2721getPeriodSelectorBorderColor0d7_KjU() {
        return this.periodSelectorBorderColor;
    }

    /* JADX INFO: renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2718getClockDialSelectedContentColor0d7_KjU() {
        return this.clockDialSelectedContentColor;
    }

    /* JADX INFO: renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2719getClockDialUnselectedContentColor0d7_KjU() {
        return this.clockDialUnselectedContentColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2722getPeriodSelectorSelectedContainerColor0d7_KjU() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2724getPeriodSelectorUnselectedContainerColor0d7_KjU() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2723getPeriodSelectorSelectedContentColor0d7_KjU() {
        return this.periodSelectorSelectedContentColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2725getPeriodSelectorUnselectedContentColor0d7_KjU() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2727getTimeSelectorSelectedContainerColor0d7_KjU() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2729getTimeSelectorUnselectedContainerColor0d7_KjU() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2728getTimeSelectorSelectedContentColor0d7_KjU() {
        return this.timeSelectorSelectedContentColor;
    }

    /* JADX INFO: renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m2730getTimeSelectorUnselectedContentColor0d7_KjU() {
        return this.timeSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m2714copydVHXu7A$default(TimePickerColors timePickerColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, int i2, Object obj) {
        long j16 = j7;
        long j17 = j6;
        long j18 = j5;
        long j19 = j4;
        long j20 = j3;
        long j21 = j8;
        long j22 = j2;
        long j23 = j14;
        long j24 = j13;
        long j25 = j12;
        long j26 = j11;
        long j27 = j10;
        long j28 = j15;
        long j29 = j9;
        if ((i2 & 1) != 0) {
            j22 = timePickerColors.containerColor;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            j20 = timePickerColors.selectorColor;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j19 = timePickerColors.containerColor;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            j18 = timePickerColors.periodSelectorBorderColor;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            j17 = timePickerColors.clockDialSelectedContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            j16 = timePickerColors.clockDialUnselectedContentColor;
        }
        if ((i2 + 64) - (i2 | 64) != 0) {
            j21 = timePickerColors.periodSelectorSelectedContainerColor;
        }
        if ((i2 + 128) - (i2 | 128) != 0) {
            j29 = timePickerColors.periodSelectorUnselectedContainerColor;
        }
        if ((i2 & 256) != 0) {
            j27 = timePickerColors.periodSelectorSelectedContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 512)) != 0) {
            j26 = timePickerColors.periodSelectorUnselectedContentColor;
        }
        if ((i2 + 1024) - (i2 | 1024) != 0) {
            j25 = timePickerColors.timeSelectorSelectedContainerColor;
        }
        if ((i2 + 2048) - (i2 | 2048) != 0) {
            j24 = timePickerColors.timeSelectorUnselectedContainerColor;
        }
        if ((i2 + 4096) - (i2 | 4096) != 0) {
            j23 = timePickerColors.timeSelectorSelectedContentColor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8192)) != 0) {
            j28 = timePickerColors.timeSelectorUnselectedContentColor;
        }
        return timePickerColors.m2716copydVHXu7A(j22, j20, j19, j18, j17, j16, j21, j29, j27, j26, j25, j24, j23, j28);
    }

    /* JADX INFO: renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m2716copydVHXu7A(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        long j16 = j2;
        long j17 = j3;
        long j18 = j4;
        long j19 = j5;
        long j20 = j6;
        long j21 = j7;
        long j22 = j8;
        long j23 = j9;
        long j24 = j10;
        long j25 = j11;
        long j26 = j12;
        long j27 = j13;
        long j28 = j14;
        long j29 = j15;
        if (j16 == 16) {
            j16 = this.clockDialColor;
        }
        if (j17 == 16) {
            j17 = this.selectorColor;
        }
        if (j18 == 16) {
            j18 = this.containerColor;
        }
        if (j19 == 16) {
            j19 = this.periodSelectorBorderColor;
        }
        if (j20 == 16) {
            j20 = this.clockDialSelectedContentColor;
        }
        if (j21 == 16) {
            j21 = this.clockDialUnselectedContentColor;
        }
        if (j22 == 16) {
            j22 = this.periodSelectorSelectedContainerColor;
        }
        if (j23 == 16) {
            j23 = this.periodSelectorUnselectedContainerColor;
        }
        if (j24 == 16) {
            j24 = this.periodSelectorSelectedContentColor;
        }
        if (j25 == 16) {
            j25 = this.periodSelectorUnselectedContentColor;
        }
        if (j26 == 16) {
            j26 = this.timeSelectorSelectedContainerColor;
        }
        if (j27 == 16) {
            j27 = this.timeSelectorUnselectedContainerColor;
        }
        if (j28 == 16) {
            j28 = this.timeSelectorSelectedContentColor;
        }
        if (j29 == 16) {
            j29 = this.timeSelectorUnselectedContentColor;
        }
        return new TimePickerColors(j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, null);
    }

    /* JADX INFO: renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2731periodSelectorContainerColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2732periodSelectorContentColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2733timeSelectorContainerColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2734timeSelectorContentColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    /* JADX INFO: renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2715clockDialContentColorvNxB06k$material3_release(boolean z2) {
        return z2 ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) obj;
        return Color.m4179equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m4179equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m4179equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m4179equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m4179equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m4179equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m4179equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m4179equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m4179equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m4179equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m4179equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m4179equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m4185hashCodeimpl(this.clockDialColor) * 31) + Color.m4185hashCodeimpl(this.selectorColor)) * 31) + Color.m4185hashCodeimpl(this.containerColor)) * 31) + Color.m4185hashCodeimpl(this.periodSelectorBorderColor)) * 31) + Color.m4185hashCodeimpl(this.periodSelectorSelectedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.periodSelectorUnselectedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.periodSelectorSelectedContentColor)) * 31) + Color.m4185hashCodeimpl(this.periodSelectorUnselectedContentColor)) * 31) + Color.m4185hashCodeimpl(this.timeSelectorSelectedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.timeSelectorUnselectedContainerColor)) * 31) + Color.m4185hashCodeimpl(this.timeSelectorSelectedContentColor)) * 31) + Color.m4185hashCodeimpl(this.timeSelectorUnselectedContentColor);
    }
}
