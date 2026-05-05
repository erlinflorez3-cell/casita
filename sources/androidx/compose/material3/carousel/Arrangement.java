package androidx.compose.material3.carousel;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r'4\u0012}\u0016njG9LeN/Xݷ@ş\n\u0013d$\n#*BR\u0016U\u000e&\u0017Ofg\u0016oZ^\u0019E'\u0006D{z0WY\u0011]@\u0010BF}DKM\u001e@Id\u0003<\u001d `#H}\u0013\b2*v\u0013\u0007~QS$\u0012^A¤>R\u001bVM( \u0018V /!\rk\\I`l\f=u#KoPb?_^\u0012\u0014\r\u000fX5#\u000faL,\u0011FC\u001d=S1\bқ_E\u000bӊ\n?\u000br52{X\u0002^NX.\u0017Ʀ/U\u0015ƞ\u000b(b\u0011_m\\69U{K~\u000f߭{\u0001\u0004ȞT\u0006\u0014\u00145S~<(k \u000eawɤWFX\u061cvD\u0006\noCg1\u000e3C9Ig(Ĩ=ϭR7\u0004˜]-1\u0005\u0007!\nU\u05f8d\u001b#Ƙ\u0010S7aNH\u0019]\u0018[Um2sĊ\u00060\f\u0382_\u00025\r\u001f;ϸ)O"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\nZP7t6\u001e\u001dhjH\\", "", ">qX<e0Mg", "", "AlP9_\u001aBh\u0019", "", "AlP9_\nHc\"\u000e", ";dS6h4,W.~", ";dS6h4\u001c])\b\n", ":`a4X\u001aBh\u0019", ":`a4X\nHc\"\u000e", "uH5\u00169\u0010\u001f7\\o", "5dc\u0019T9@Sv\t\u000bg;", "u(8", "5dc\u0019T9@S\u0007\u0003\u0010^", "u(5", "5dc\u001aX+Bc!\\\u0005n5\f", "5dc\u001aX+Bc!l~s,", "5dc `(EZv\t\u000bg;", "5dc `(EZ\u0007\u0003\u0010^", "1nbA", "B`a4X;%O&\u0001zL0\u0012\t", "7rE._0=", "", "7sT:66N\\(", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Arrangement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    public Arrangement(int i2, float f2, int i3, float f3, int i4, float f4, int i5) {
        this.priority = i2;
        this.smallSize = f2;
        this.smallCount = i3;
        this.mediumSize = f3;
        this.mediumCount = i4;
        this.largeSize = f4;
        this.largeCount = i5;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final int getSmallCount() {
        return this.smallCount;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final int getMediumCount() {
        return this.mediumCount;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final int getLargeCount() {
        return this.largeCount;
    }

    private final boolean isValid() {
        int i2 = this.largeCount;
        if (i2 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i2 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f2 = this.largeSize;
        float f3 = this.mediumSize;
        return f2 > f3 && f3 > this.smallSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float f2) {
        if (isValid()) {
            return Math.abs(f2 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public final int itemCount() {
        return this.largeCount + this.mediumCount + this.smallCount;
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106B\u0005#4\u0012\u0006\rnj?2Le^.ZS0\u0012s{B7c$wJA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\u0019:Lmx\f\u0014?6PsW3{qm=nyN\u0005N8R<\b\f\u0019\u001aXJ@z\tKc\f@6ptH[%M3 X\u0006\u0007v\u000f(tid5vw\u000e>='\u001bipPWc>\te\rtVW\u0011\u0005n6+n9e\u00193a\u001b\u0007\u0001]o\u0007M\u0001U\u0005\u0017)W/W\u0004o6\u0007\u0011D\u00199a%]!(\r\t_s$'Y`\u0014O^\"@w)}=@\u0012#\u001e'v?uxt\u001e&3#}\u0004D^\u0019vB.\u0001\u0012:%)\u00183Y;Kj_mS\u0019|9,\t\u001b#;\u0001\u001d'\fX\u001cg-\u001b\u0003y\u00025_NUH|\f\nA{\u0013\tb0,44U\bG{?4G)EsQ#Om2LRp\u000f\u0005\u000fn\u0004m`aX\"\u001d\u0018}*Y\u0018hE|\u0005\u001aR+Г~ҭQ\u001c\\͵ċ\f-"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\nZP7t6\u001e\u001dhjHEA6V\u0002#PPX52", "", "u(E", "\u001bdS6h4\"b\u0019\u0007[e,\u0010s/r}(\u0005O|\u0019\u0017", "", "1`[0h3:b\u0019evk.|v3z\u007f", "/uP6_(;Z\u0019l\u0006Z*|", "AlP9_\nHc\"\u000e", "", "AlP9_\u001aBh\u0019", ";dS6h4\u001c])\b\n", ":`a4X\nHc\"\u000e", "4h]1?6PS'\u000eXh:\fd<r{1}@\t\u0017 V", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\nZP7t6\u001e\u001dhjH\\", "7sT:F7:Q\u001d\b|", "B`a4X;,[\u0015\u0006\u0002L0\u0012\t", ";h] `(EZ\u0007\u0003\u0010^", ";`g `(EZ\u0007\u0003\u0010^", "AlP9_\nHc\"\u000e\t", "", "B`a4X;&S\u0018\u0003\u000bf\u001a\u0001\u001e/", ";dS6h4\u001c])\b\nl", "B`a4X;%O&\u0001zL0\u0012\t", ":`a4X\nHc\"\u000e\t", "4hc", ">qX<e0Mg", ";dS6h4,W.~", ":`a4X\u001aBh\u0019", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float calculateLargeSize(float f2, int i2, float f3, int i3, int i4) {
            float f4 = i3 / 2.0f;
            return (f2 - ((i2 + f4) * f3)) / (i4 + f4);
        }

        private Companion() {
        }

        public final Arrangement findLowestCostArrangement(float f2, float f3, float f4, float f5, float f6, int[] iArr, float f7, int[] iArr2, float f8, int[] iArr3) {
            Arrangement arrangement = null;
            int i2 = 1;
            for (int i3 : iArr3) {
                for (int i4 : iArr2) {
                    for (int i5 : iArr) {
                        Arrangement arrangementFit = fit(i2, f2, f3, i5, f4, f5, f6, i4, f7, i3, f8);
                        if (arrangement == null || arrangementFit.cost(f8) < arrangement.cost(f8)) {
                            if (arrangementFit.cost(f8) == 0.0f) {
                                return arrangementFit;
                            }
                            arrangement = arrangementFit;
                        }
                        i2++;
                    }
                }
            }
            return arrangement;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final androidx.compose.material3.carousel.Arrangement fit(int r21, float r22, float r23, int r24, float r25, float r26, float r27, int r28, float r29, int r30, float r31) {
            /*
                r20 = this;
                r13 = r30
                r11 = r28
                r5 = r26
                r6 = r27
                r15 = r22
                int r0 = r13 + r11
                r9 = r24
                int r0 = r0 + r9
                int r0 = r0 + (-1)
                float r0 = (float) r0
                float r0 = r0 * r23
                float r15 = r15 - r0
                r0 = r25
                float r8 = kotlin.ranges.RangesKt.coerceIn(r0, r5, r6)
                float r2 = (float) r13
                float r1 = r31 * r2
                float r3 = (float) r11
                float r29 = r29 * r3
                float r1 = r1 + r29
                float r7 = (float) r9
                float r0 = r8 * r7
                float r1 = r1 + r0
                float r1 = r15 - r1
                r4 = 0
                if (r9 <= 0) goto L7d
                int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r0 <= 0) goto L7d
                float r1 = r1 / r7
                float r6 = r6 - r8
                float r0 = java.lang.Math.min(r1, r6)
            L36:
                float r8 = r8 + r0
            L37:
                if (r9 <= 0) goto L7b
            L39:
                r14 = r20
                r18 = r11
                r16 = r9
                r17 = r8
                r19 = r13
                float r12 = r14.calculateLargeSize(r15, r16, r17, r18, r19)
                float r10 = r12 + r8
                r0 = 1073741824(0x40000000, float:2.0)
                float r10 = r10 / r0
                if (r11 <= 0) goto L52
                int r0 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
                if (r0 != 0) goto L5a
            L52:
                androidx.compose.material3.carousel.Arrangement r6 = new androidx.compose.material3.carousel.Arrangement
                r7 = r21
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                return r6
            L5a:
                float r31 = r31 - r12
                float r31 = r31 * r2
                r1 = 1036831949(0x3dcccccd, float:0.1)
                float r1 = r1 * r10
                float r1 = r1 * r3
                float r0 = java.lang.Math.abs(r31)
                float r1 = java.lang.Math.min(r0, r1)
                int r0 = (r31 > r4 ? 1 : (r31 == r4 ? 0 : -1))
                if (r0 <= 0) goto L75
                float r0 = r1 / r3
                float r10 = r10 - r0
                float r1 = r1 / r2
                float r12 = r12 + r1
                goto L52
            L75:
                float r0 = r1 / r3
                float r10 = r10 + r0
                float r1 = r1 / r2
                float r12 = r12 - r1
                goto L52
            L7b:
                r8 = r4
                goto L39
            L7d:
                if (r9 <= 0) goto L37
                int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r0 >= 0) goto L37
                float r1 = r1 / r7
                float r5 = r5 - r8
                float r0 = java.lang.Math.max(r1, r5)
                goto L36
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.Arrangement.Companion.fit(int, float, float, int, float, float, float, int, float, int, float):androidx.compose.material3.carousel.Arrangement");
        }
    }
}
