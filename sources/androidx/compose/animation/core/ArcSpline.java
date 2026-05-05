package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: ArcSpline.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00198é6B\r44ߚ\u007f\u0007tyA0JeP.hS2\u000fq{<$i-yّCU(}*ޛWNulvJ`\u000eI\u000e\u001cǝ\u0017}\\I\u0004w\u0016\u0012!E\u0003\u0011O7[oU9\u000fuF\t.4:8(\b\u0011$8L(|\u000bE[\f@3nuĐV\r[\u000bb&\u0014J8\u0001Li\u0018RDV\u0005]h>S\u0007wRf'\u000e3Ea\u001bWl';\u0004\u0012\"9NO5C4\u0004\u0007\u0015bs?1BBW\u0013o?3;Q\u0004]FZ\u0010\u0014C3}\u0012\fw|؛\u0007Ōd\u000e/+]l\u001c\\\u001c2\u0010z*\u0018\u0013ǌPΝ+H6Ʀըj\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk\u00049TGDk\n", "", "/qR\u001ab+>a", "", "Bh\\2C6B\\(\r", "", "G", "", "uZ8(9\"44\\o", "/qR@", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk\u00049TGDkry\"f7", ")Z;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I#,;NBo=\u001eSDn7\\", "7r4Eg9:^#\u0006vm,", "", "5dc\u001db:", "", "Bh\\2", "", "D", "5dc _6IS", "\u000fqR", "\u0011n\\=T5B]\"", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ArcSpline {
    public static final int ArcAbove = 5;
    public static final int ArcBelow = 4;
    public static final int ArcStartFlip = 3;
    public static final int ArcStartHorizontal = 2;
    public static final int ArcStartLinear = 0;
    public static final int ArcStartVertical = 1;
    private static final int DownArc = 4;
    private static final int StartHorizontal = 2;
    private static final int StartLinear = 3;
    private static final int StartVertical = 1;
    private static final int UpArc = 5;
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r0
  0x0060: PHI (r0v1 int) = (r0v0 int), (r0v8 int), (r0v9 int) binds: [B:5:0x0019, B:10:0x0022, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ArcSpline(int[] r24, float[] r25, float[][] r26) {
        /*
            r23 = this;
            r8 = r23
            r23.<init>()
            r6 = 1
            r8.isExtrapolate = r6
            r7 = r25
            int r5 = r7.length
            int r5 = r5 - r6
            androidx.compose.animation.core.ArcSpline$Arc[][] r4 = new androidx.compose.animation.core.ArcSpline.Arc[r5][]
            r14 = 0
            r9 = r6
            r16 = r9
            r3 = r14
        L13:
            if (r3 >= r5) goto L63
            r2 = r24[r3]
            r0 = 3
            r1 = 2
            if (r2 == 0) goto L60
            if (r2 == r6) goto L58
            if (r2 == r1) goto L5c
            if (r2 == r0) goto L5a
            r0 = 4
            if (r2 == r0) goto L60
            r0 = 5
            if (r2 == r0) goto L60
        L27:
            r0 = r26[r3]
            int r2 = r0.length
            int r2 = r2 / r1
            int r0 = r0.length
            int r0 = r0 % r1
            int r2 = r2 + r0
            androidx.compose.animation.core.ArcSpline$Arc[] r1 = new androidx.compose.animation.core.ArcSpline.Arc[r2]
            r0 = r14
        L31:
            if (r0 >= r2) goto L53
            int r13 = r0 * 2
            androidx.compose.animation.core.ArcSpline$Arc r15 = new androidx.compose.animation.core.ArcSpline$Arc
            r17 = r7[r3]
            int r12 = r3 + 1
            r18 = r7[r12]
            r10 = r26[r3]
            r19 = r10[r13]
            int r11 = r13 + 1
            r20 = r10[r11]
            r10 = r26[r12]
            r21 = r10[r13]
            r22 = r10[r11]
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r1[r0] = r15
            int r0 = r0 + 1
            goto L31
        L53:
            r4[r3] = r1
            int r3 = r3 + 1
            goto L13
        L58:
            r9 = r6
            goto L5d
        L5a:
            if (r9 != r6) goto L58
        L5c:
            r9 = r1
        L5d:
            r16 = r9
            goto L27
        L60:
            r16 = r0
            goto L27
        L63:
            r8.arcs = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r9 > r1[r1.length - 1][0].getTime2()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getPos(float r9, float[] r10) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.getPos(float, float[]):void");
    }

    public final void getSlope(float f2, float[] fArr) {
        if (f2 < this.arcs[0][0].getTime1()) {
            f2 = this.arcs[0][0].getTime1();
        } else {
            Arc[][] arcArr = this.arcs;
            if (f2 > arcArr[arcArr.length - 1][0].getTime2()) {
                Arc[][] arcArr2 = this.arcs;
                f2 = arcArr2[arcArr2.length - 1][0].getTime2();
            }
        }
        int length = this.arcs.length;
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < fArr.length) {
                if (f2 <= this.arcs[i2][i4].getTime2()) {
                    if (this.arcs[i2][i4].isLinear()) {
                        fArr[i3] = this.arcs[i2][i4].getLinearDX();
                        fArr[i3 + 1] = this.arcs[i2][i4].getLinearDY();
                    } else {
                        this.arcs[i2][i4].setPoint(f2);
                        fArr[i3] = this.arcs[i2][i4].calcDX();
                        fArr[i3 + 1] = this.arcs[i2][i4].calcDY();
                    }
                    z2 = true;
                }
                i3 += 2;
                i4++;
            }
            if (z2) {
                return;
            }
        }
    }

    /* JADX INFO: compiled from: ArcSpline.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r'4\u0012}\u0012njG9LeN/ZS8!s{:)c$\u007fCCU \n(\u000eeȞ\u0006\u0012\u001fJ\t\n{\u000e0V6pߚYY\u0007]*\u000f`C\u007fCAO\b=gc\u0005:\u0013$J\"f|\u0015\u0005(/`\u0010%}SO\u001a\u0018H@\u001f=b\u0011[\f2\u00124A0\u0005,d\u007fNdKǰa:=,K\u0010Pj?_^\u001a}\u0011TY?\r%dN/N=M\u0015SV3\u000b`bW\u0003mtm\tv/?+wv\u001e6!\u0004\"3CO;`;*j$i`:*sSqkh\u000eVzC\u007f\u001b]\u001c\u000e4*\u00112;<~\b<6=vach\u0002\rEH\u0007oZ/%.6[=)\fiai\u001c\u0017C\n+%\u001eQ\u0004\u001f%iy&`C\u001e\u001d\u0006_Xi@kK~\u000ege\u0006\u0004\u001feH*L<U)G{?KG)E\u0001Q#OnRTRq\u000f\u0005\u000fk*֢^͕D\"vݫ\b6\u0017\u0017rD\u0013\bB¯Vг0\u0011Uȼ%\u0013\f\u0014+ \u000bz\u0013Ɯ'ŎROpȉ;Yk\u0017=/\u0015:0ʧmް[9fڨ\u0006]q\u001eyR%\u0017\u0016ֽdۖ\\fJͭ\\fj7:2vmfǱ}ΌR\f\u001bԵ\u0010\u0001*DD1GmČL\t&ՓY~\u000fohz`\u000bbF<\u0003\u00185Kժ\u0003˩`pwΟIU:\u0011x\"[V(ڄ\u001błY\"pؔM/\u0015\u0015\f\u007fuj#܄N̡\u001au]ݨp%(;i/k\u0016ä\u0003/:ĈEGR\nsi\u001e!5~\u0015y=>ÿ2m\u0010ξ\t.f\u0004Xg%#0\u0011vrQ\u000b;у\u0006ӶJzOϊ%\u0017iYar1\\\u0013ҁD٫\t\u001f&ݒQ{0\u0002M-q*sȹyӄ3\u0015iӠ:{<\u0001z\u000fTw<׀.І\u001aojГ.>I>aY-AxؽnúFHr̫XN\u0017<%3vD;ݨXиQ\u000b7֮̎\u000bW"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk\u00049TGDkry\"f7", "", ";nS2", "", "Bh\\2$", "", "Bh\\2%", "F0", "G0", "F1", "G1", "uH5\u00139\r\u001f4\\o", "/qR\u0011\\:MO\"|z", "/qR#X3HQ\u001d\u000e\u000f", "3k[6c:>/", "3k[6c:>0", "3k[6c:>1\u0019\b\n^9o", "3k[6c:>1\u0019\b\n^9p", "7r;6a,:`", "", "u(I", "7rE2e;BQ\u0015\u0006", ":tc", "", "=mT\u001ci,K2\u0019\u0006\nZ\u001b\u0001\u0011/", "5dc!\\4>\u001f", "u(5", "5dc!\\4> ", "Bl_\u0010b:\u001a\\\u001b\u0006z", "Bl_ \\5\u001a\\\u001b\u0006z", "0tX9W\u001b:P ~", "", "1`[07\u001f", "1`[07 ", "1`[0K", "1`[0L", "5dc\u0019\\5>O&]m", "5dc\u0019\\5>O&]n", "5dc\u0019\\5>O&q", "Bh\\2", "5dc\u0019\\5>O&r", ":n^8h7", "D", "Adc\u001db0Gb", "\u0011n\\=T5B]\"", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Arc {
        private static final float Epsilon = 0.001f;
        private static float[] _ourPercent = null;
        private float arcDistance;
        private final float arcVelocity;
        private final float ellipseA;
        private final float ellipseB;
        private final float ellipseCenterX;
        private final float ellipseCenterY;
        private final boolean isLinear;
        private final boolean isVertical;
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public Arc(int i2, float f2, float f3, float f4, float f5, float f6, float f7) {
            float f8;
            float f9;
            this.time1 = f2;
            this.time2 = f3;
            this.x1 = f4;
            this.y1 = f5;
            this.x2 = f6;
            this.y2 = f7;
            float f10 = f6 - f4;
            float f11 = f7 - f5;
            boolean z2 = true;
            boolean z3 = i2 == 1 || (i2 == 4 ? f11 > 0.0f : !(i2 != 5 || f11 >= 0.0f));
            this.isVertical = z3;
            float f12 = 1 / (f3 - f2);
            this.oneOverDeltaTime = f12;
            boolean z4 = 3 == i2;
            if (z4 || Math.abs(f10) < Epsilon || Math.abs(f11) < Epsilon) {
                float fHypot = (float) Math.hypot(f11, f10);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f12;
                this.ellipseCenterX = f10 / (f3 - f2);
                this.ellipseCenterY = f11 / (f3 - f2);
                this.lut = new float[101];
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.lut = new float[101];
                this.ellipseA = f10 * (z3 ? -1 : 1);
                this.ellipseB = f11 * (z3 ? 1 : -1);
                if (z3) {
                    f8 = f6;
                } else {
                    f8 = f4;
                }
                this.ellipseCenterX = f8;
                if (z3) {
                    f9 = f5;
                } else {
                    f9 = f7;
                }
                this.ellipseCenterY = f9;
                buildTable(f4, f5, f6, f7);
                this.arcVelocity = this.arcDistance * f12;
                z2 = z4;
            }
            this.isLinear = z2;
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        public final boolean isLinear() {
            return this.isLinear;
        }

        public final void setPoint(float f2) {
            double dLookup = lookup((this.isVertical ? this.time2 - f2 : f2 - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dLookup);
            this.tmpCosAngle = (float) Math.cos(dLookup);
        }

        public final float calcX() {
            return this.ellipseCenterX + (this.ellipseA * this.tmpSinAngle);
        }

        public final float calcY() {
            return this.ellipseCenterY + (this.ellipseB * this.tmpCosAngle);
        }

        public final float calcDX() {
            float f2 = this.ellipseA * this.tmpCosAngle;
            float fHypot = this.arcVelocity / ((float) Math.hypot(f2, (-this.ellipseB) * this.tmpSinAngle));
            if (this.isVertical) {
                f2 = -f2;
            }
            return f2 * fHypot;
        }

        public final float calcDY() {
            float f2 = this.ellipseA * this.tmpCosAngle;
            float f3 = (-this.ellipseB) * this.tmpSinAngle;
            float fHypot = this.arcVelocity / ((float) Math.hypot(f2, f3));
            return this.isVertical ? (-f3) * fHypot : f3 * fHypot;
        }

        public final float getLinearX(float f2) {
            float f3 = (f2 - this.time1) * this.oneOverDeltaTime;
            float f4 = this.x1;
            return f4 + (f3 * (this.x2 - f4));
        }

        public final float getLinearY(float f2) {
            float f3 = (f2 - this.time1) * this.oneOverDeltaTime;
            float f4 = this.y1;
            return f4 + (f3 * (this.y2 - f4));
        }

        public final float getLinearDX() {
            return this.ellipseCenterX;
        }

        public final float getLinearDY() {
            return this.ellipseCenterY;
        }

        private final float lookup(float f2) {
            if (f2 <= 0.0f) {
                return 0.0f;
            }
            if (f2 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.lut;
            float length = f2 * (fArr.length - 1);
            int i2 = (int) length;
            float f3 = fArr[i2];
            return f3 + ((length - i2) * (fArr[i2 + 1] - f3));
        }

        private final void buildTable(float f2, float f3, float f4, float f5) {
            float f6 = f4 - f2;
            float f7 = f3 - f5;
            int length = Companion.getOurPercent().length;
            float fHypot = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            int i2 = 0;
            while (i2 < length) {
                Companion companion = Companion;
                double radians = (float) Math.toRadians((((double) i2) * 90.0d) / ((double) (companion.getOurPercent().length - 1)));
                float fSin = ((float) Math.sin(radians)) * f6;
                float fCos = ((float) Math.cos(radians)) * f7;
                if (i2 > 0) {
                    fHypot += (float) Math.hypot(fSin - f8, fCos - f9);
                    companion.getOurPercent()[i2] = fHypot;
                }
                i2++;
                f9 = fCos;
                f8 = fSin;
            }
            this.arcDistance = fHypot;
            int length2 = Companion.getOurPercent().length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] ourPercent = Companion.getOurPercent();
                ourPercent[i3] = ourPercent[i3] / fHypot;
            }
            int length3 = this.lut.length;
            for (int i4 = 0; i4 < length3; i4++) {
                float length4 = i4 / (this.lut.length - 1);
                Companion companion2 = Companion;
                int iBinarySearch$default = ArraysKt.binarySearch$default(companion2.getOurPercent(), length4, 0, 0, 6, (Object) null);
                if (iBinarySearch$default < 0) {
                    if (iBinarySearch$default == -1) {
                        this.lut[i4] = 0.0f;
                    } else {
                        int i5 = -iBinarySearch$default;
                        int i6 = i5 - 2;
                        this.lut[i4] = (i6 + ((length4 - companion2.getOurPercent()[i6]) / (companion2.getOurPercent()[i5 - 1] - companion2.getOurPercent()[i6]))) / (companion2.getOurPercent().length - 1);
                    }
                } else {
                    this.lut[i4] = iBinarySearch$default / (companion2.getOurPercent().length - 1);
                }
            }
        }

        /* JADX INFO: compiled from: ArcSpline.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\":$\u007f\u0007ll?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV$\u0007mDKkw\f\u0016e˳NņC3Uڎ\u000eKnyN\u0005N6XxPڑ\u0003ʀ.L(x\u0001IY\u0013ܞ4H"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk\u00049TGDkry\"f \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u0013ob6_6G", "", "-nd?C,KQ\u0019\b\n", "", "=ta\u001dX9<S\"\u000e", "5dc\u001ch9)S&|zg;", "u(J\u0013", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final float[] getOurPercent() {
                if (Arc._ourPercent != null) {
                    float[] fArr = Arc._ourPercent;
                    Intrinsics.checkNotNull(fArr);
                    return fArr;
                }
                Arc._ourPercent = new float[91];
                float[] fArr2 = Arc._ourPercent;
                Intrinsics.checkNotNull(fArr2);
                return fArr2;
            }
        }
    }

    /* JADX INFO: compiled from: ArcSpline.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005+2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѫ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݞ;Ҋ++Q֕(Bf\n,\u0015YQcơE͉`\u0005YӠ\\39Z{K~\u0010~¾Mԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޚGɤW@X\u061c\u07b2F\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{Dk\u00049TGDkr{\u001fpl5\u0010g6WL", "", "u(E", "\u000fqR\u000eU6OS", "", "\u000fqR\u000fX3He", "\u000fqR g(Kby\u0006~i", "\u000fqR g(Kb{\t\bbA\u0007\u0012>a\u0007", "\u000fqR g(Kb\u007f\u0003\u0004^(\n", "\u000fqR g(Kb\n~\bm0z\u00056", "\u0012nf;49<", "!sP?g\u000fH`\u001d\u0014\u0005g;x\u0010", "!sP?g\u0013B\\\u0019z\b", "!sP?g\u001d>`(\u0003xZ3", "#o0?V", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
