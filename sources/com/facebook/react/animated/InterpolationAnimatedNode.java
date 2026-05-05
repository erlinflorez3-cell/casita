package com.facebook.react.animated;

import androidx.core.graphics.ColorUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001e\u007f\u0007ljA0RvP\u008cZS8şs{:$c$\bCCU \u007f*\t]Nog\u0005Jb\u000bI\u0013\u001cǝ\u0017\u0001\\I\u0004w\u0016\u0012%I\u0003zO7[oU9\u000fuȥ\t @$\u0001\u0002\u0013\u00102,^\u000f%\u0004\n_T >P\t:\u0001\u001e}\t(\u001f\u001e>N\u0013dp0\\D[\u0005]h@S\u0007wOf'\u000eBCaULb;%v\u0010\"qT\u007f;#:k\u00035c\"SSM\u007f@\u001dj=&YMJɑ8ݼ\u0004\u0014\u001dۀ \u001bkw>^\u001bP\u000f\u0010}ˆQӍOP\u0016ߊH\u0007\n\u0013T\u0004<\r}Ρ0ǉ\u001ef\u0010Ԅ\u0004\u0003\u0001[XR\u0018]p\tQʫBа)\u007f;ٿ\n)t[y=/Me\u0005[ٿ*ţ\u0005n)ż%\u001cn 3V\u000eP_]\u0017׃Tݳ\u000eYEЧT~p\u000fB\u0006FF..R\u0080:ϲ)7cݽs/y\u0010`F}u3d?\u05c8uʐL@*Âޔ;B"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\t>h}-Bw\u001d*\\GEt\u0010'\u0019p]H\u0007b\u0015Xu'\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u00161`\u000e \u0013v\u001a6IR;j\u001d(\u0014h7", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019~\\", "3wc?T7HZ\u0015\u000ezE,}\u0018", "", "3wc?T7HZ\u0015\u000ezK0~\f>", "7m_Bg\u0019:\\\u001b~", "", "=aY2V;/O \u000fz", "", "=tc=h;+O\"\u0001z", "=tc=h;-g$~", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\t>h}-Bw\u001d*\\GEt\u0010'\u0019p]H\u0007b\u0015Xu'\u00066^;gb\u0002,(\u001dZc", ">`a2a;", ">`cAX9G", "5dc\u000ea0FO(~yH)\u0002\t-t", "=m0Ag(<V\u0019}ih\u0015\u0007\b/", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;A", "=m32g(<V\u0019}[k6\u0005q9d\u007f", ">qTAg@)`\u001d\b\n", "CoS.g,", "\u0011n\\=T5B]\"", "\u001dtc=h;-g$~", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class InterpolationAnimatedNode extends ValueAnimatedNode {
    private static final String COLOR_OUTPUT_TYPE = "color";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRAPOLATE_TYPE_CLAMP = "clamp";
    public static final String EXTRAPOLATE_TYPE_EXTEND = "extend";
    public static final String EXTRAPOLATE_TYPE_IDENTITY = "identity";
    private static final Pattern numericPattern;
    private final String extrapolateLeft;
    private final String extrapolateRight;
    private final double[] inputRange;
    private Object objectValue;
    private Object outputRange;
    private OutputType outputType;
    private ValueAnimatedNode parent;
    private String pattern;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005$4\u0012\u000e\u0007nʑA0RkP\u008cZS8\u0013sڔ<$i5yCAU\"}8\tWȞog|]bŏK\u000f\u0014%\u0001j2V[ޓ^(ƁbB\u001e>sRu=˃dtD\u0005hH0@\u0012\u0005/#ZL\u001e\u0001\u0013Cy\u0017B4N|RR;ZK\u001aZ\u0016L.\u0019\u001e\u000bt~<V{u<E\"1y\tNoo>\u000ee\rtfW\u0013\u0005p6-V6c%kSK\"`nW\u000bOuM\u0007~&U8w\b\b:f\u000f,\u0015Y_S]ę*\\\u0013f)L5Agcy[>,\u0006\u0005\u0014\rj\u000f>\n5_F-Hq8\u0012A\r\u000bSn[2bP\u0019\u0013ad\"U\u0004AEQ\u001b\u0015\\\u0012A'iO}\u001b\fL%1t/wl\u0010v\u0014IV@\u0002?gX=vY:]Kw\u001cp\u0011\rZ\b>d\u0018/*\u001e^\u001b3Us9Q.\u001c\bV_\u007fx\u001b_\u0017U\u001aXV\\:p,6X\u000bTvR\u0004\u001dk~]\t0\u001fW4T5\t8\u0017.y\u0010<O2@R]\u0007\u0002j{oRh=\u0007OY\u001dm>[G\u007fK5\u007fe@e`\u0001,?jm5\\t_k\f\tiX,@f\u0003\u0016\b}TN: `S\"\"BGI\u001br\u0014v\u0005NHO\u0019!apg>\u0001Ձ7$\u0011\ft\u0001\u0017\u0002h\\\u001fq>ձ\u001cض\u0001`*Ί\u0012]C\u001c>UPj\u000bñuȷ\u0003s\bø8XUP\u0005\u0016$WR\u0094h׀=Q7ˋc\u001b\r.J\u0002[G#ǰ8˛Q\u0012/ϕM\u0006\u001dA\u0001.\u0016\u000fAѴ.߯nJWܷЈ&\u001a"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\t>h}-Bw\u001d*\\GEt\u0010'\u0019p]H\u0007b\u0015Xu'\u0006*X4gN{A\u001e\u001b0", "", "u(E", "\u0011N;\u001cE&(C\bijM&k|\u001aE", "", "\u0013WC\u001f4\u0017(:tmZX\u001bps\u000f_]\u000fW(k", "\u0013WC\u001f4\u0017(:tmZX\u001bps\u000f__\u001bj iu", "\u0013WC\u001f4\u0017(:tmZX\u001bps\u000f_c\u0007[)oz\u0006;", "<t\\2e0<>\u0015\u000e\n^9\u0006", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", "4h]1E(GU\u0019b\u0004],\u0010", "", "D`[BX", "", "@`]4X:", "", "4q^:76NP ~Vk9x\u001d", "/qa.l", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "4q^:<5M/&\fvr", "", "4q^:F;KW\"\u0001eZ;\f\t<n", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>mq;Z?OAw\u0014\u000bG", "7mc2e7HZ\u0015\u000ez", "7m_Bg\u0014B\\", "7m_Bg\u0014:f", "=tc=h;&W\"", "=tc=h;&O,", "3wc?T7HZ\u0015\u000ezE,}\u0018", "3wc?T7HZ\u0015\u000ezK0~\f>", "7m_Bg\u0019:\\\u001b~", "=tc=h;+O\"\u0001z", "7mc2e7HZ\u0015\u000ez<6\u0004\u0013<", "7mc2e7HZ\u0015\u000ezL;\n\r8g", ">`cAX9G", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}Z6_\r\r&V\u00138\b!~`y)97\u0004=ZGDm\n\u0005\u001adr5Pj(Wxp5[[0eTH\u0001z\u0017V\u001fJt\u0014\u0001bCm\\SD#\u0011.\u001f", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int findRangeIndex(double d2, double[] dArr) {
            int i2 = 1;
            while (i2 < dArr.length - 1 && dArr[i2] < d2) {
                i2++;
            }
            return i2 - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double[] fromDoubleArray(ReadableArray readableArray) {
            if (readableArray == null) {
                return new double[0];
            }
            int size = readableArray.size();
            double[] dArr = new double[size];
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = readableArray.getDouble(i2);
            }
            return dArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] fromIntArray(ReadableArray readableArray) {
            if (readableArray == null) {
                return new int[0];
            }
            int size = readableArray.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = readableArray.getInt(i2);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double[][] fromStringPattern(ReadableArray readableArray) {
            int size = readableArray.size();
            double[][] dArr = new double[size][];
            Matcher matcher = InterpolationAnimatedNode.numericPattern.matcher(readableArray.getString(0));
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                String strGroup = matcher.group();
                Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
                arrayList.add(Double.valueOf(Double.parseDouble(strGroup)));
            }
            int size2 = arrayList.size();
            double[] dArr2 = new double[size2];
            int size3 = arrayList.size();
            for (int i2 = 0; i2 < size3; i2++) {
                dArr2[i2] = ((Number) arrayList.get(i2)).doubleValue();
            }
            dArr[0] = dArr2;
            for (int i3 = 1; i3 < size; i3++) {
                double[] dArr3 = new double[size2];
                Matcher matcher2 = InterpolationAnimatedNode.numericPattern.matcher(readableArray.getString(i3));
                for (int i4 = 0; matcher2.find() && i4 < size2; i4++) {
                    String strGroup2 = matcher2.group();
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "group(...)");
                    dArr3[i4] = Double.parseDouble(strGroup2);
                }
                dArr[i3] = dArr3;
            }
            return dArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
            if (r22.equals(com.facebook.react.animated.InterpolationAnimatedNode.EXTRAPOLATE_TYPE_EXTEND) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
        
            if (r21.equals(com.facebook.react.animated.InterpolationAnimatedNode.EXTRAPOLATE_TYPE_EXTEND) != false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final double interpolate(double r11, double r13, double r15, double r17, double r19, java.lang.String r21, java.lang.String r22) {
            /*
                r10 = this;
                int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                java.lang.String r8 = "clamp"
                java.lang.String r7 = "identity"
                java.lang.String r6 = "extend"
                r4 = 94742715(0x5a5a8bb, float:1.5578507E-35)
                r3 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
                r2 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
                java.lang.String r1 = "Invalid extrapolation type "
                if (r9 >= 0) goto L57
                r5 = r21
                if (r5 == 0) goto L95
                int r0 = r5.hashCode()
                if (r0 == r2) goto L51
                if (r0 == r3) goto L8e
                if (r0 != r4) goto L95
                boolean r0 = r5.equals(r8)
                if (r0 == 0) goto L95
                r11 = r13
            L2c:
                int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
                if (r0 <= 0) goto L45
                r5 = r22
                if (r5 == 0) goto L74
                int r0 = r5.hashCode()
                if (r0 == r2) goto L4a
                if (r0 == r3) goto L6d
                if (r0 != r4) goto L74
                boolean r0 = r5.equals(r8)
                if (r0 == 0) goto L74
                r11 = r15
            L45:
                int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                if (r0 != 0) goto L58
                return r17
            L4a:
                boolean r0 = r5.equals(r6)
                if (r0 == 0) goto L74
                goto L45
            L51:
                boolean r0 = r5.equals(r6)
                if (r0 == 0) goto L95
            L57:
                goto L2c
            L58:
                int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r0 != 0) goto L62
                if (r9 > 0) goto L5f
            L5e:
                return r17
            L5f:
                r17 = r19
                goto L5e
            L62:
                double r19 = r19 - r17
                double r11 = r11 - r13
                double r19 = r19 * r11
                double r15 = r15 - r13
                double r19 = r19 / r15
                double r17 = r17 + r19
                goto L5e
            L6d:
                boolean r0 = r5.equals(r7)
                if (r0 == 0) goto L74
                return r11
            L74:
                com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                java.lang.StringBuilder r1 = r0.append(r5)
                java.lang.String r0 = "for right extrapolation"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            L8e:
                boolean r0 = r5.equals(r7)
                if (r0 == 0) goto L95
                return r11
            L95:
                com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                java.lang.StringBuilder r1 = r0.append(r5)
                java.lang.String r0 = "for left extrapolation"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.InterpolationAnimatedNode.Companion.interpolate(double, double, double, double, double, java.lang.String, java.lang.String):double");
        }

        public final double interpolate(double d2, double[] inputRange, double[] outputRange, String str, String str2) {
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            int iFindRangeIndex = findRangeIndex(d2, inputRange);
            int i2 = iFindRangeIndex + 1;
            return interpolate(d2, inputRange[iFindRangeIndex], inputRange[i2], outputRange[iFindRangeIndex], outputRange[i2], str, str2);
        }

        public final int interpolateColor(double d2, double[] inputRange, int[] outputRange) {
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            int iFindRangeIndex = findRangeIndex(d2, inputRange);
            int i2 = outputRange[iFindRangeIndex];
            int i3 = iFindRangeIndex + 1;
            int i4 = outputRange[i3];
            if (i2 == i4) {
                return i2;
            }
            double d3 = inputRange[iFindRangeIndex];
            double d4 = inputRange[i3];
            return d3 == d4 ? d2 <= d3 ? i2 : i4 : ColorUtils.blendARGB(i2, i4, (float) ((d2 - d3) / (d4 - d3)));
        }

        public final String interpolateString(String pattern, double d2, double[] inputRange, double[][] outputRange, String str, String str2) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            int iFindRangeIndex = findRangeIndex(d2, inputRange);
            StringBuffer stringBuffer = new StringBuffer(pattern.length());
            Matcher matcher = InterpolationAnimatedNode.numericPattern.matcher(pattern);
            int i2 = 0;
            while (matcher.find()) {
                double[] dArr = outputRange[iFindRangeIndex];
                if (i2 >= dArr.length) {
                    break;
                }
                int i3 = iFindRangeIndex + 1;
                double dInterpolate = interpolate(d2, inputRange[iFindRangeIndex], inputRange[i3], dArr[i2], outputRange[i3][i2], str, str2);
                int i4 = (int) dInterpolate;
                matcher.appendReplacement(stringBuffer, ((double) i4) == dInterpolate ? String.valueOf(i4) : String.valueOf(dInterpolate));
                i2++;
            }
            matcher.appendTail(stringBuffer);
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gָٍ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%߄SR"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\t>h}-Bw\u001d*\\GEt\u0010'\u0019p]H\u0007b\u0015Xu'\u00066^;gb\u0002,(\u001dZc", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001ct\\/X9", "\u0011n[<e", "!sa6a.", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class OutputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OutputType[] $VALUES;
        public static final OutputType Number = new OutputType("Number", 0);
        public static final OutputType Color = new OutputType("Color", 1);
        public static final OutputType String = new OutputType("String", 2);

        private static final /* synthetic */ OutputType[] $values() {
            return new OutputType[]{Number, Color, String};
        }

        static {
            OutputType[] outputTypeArr$values = $values();
            $VALUES = outputTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(outputTypeArr$values);
        }

        private OutputType(String str, int i2) {
        }

        public static EnumEntries<OutputType> getEntries() {
            return $ENTRIES;
        }

        public static OutputType valueOf(String str) {
            return (OutputType) Enum.valueOf(OutputType.class, str);
        }

        public static OutputType[] values() {
            return (OutputType[]) $VALUES.clone();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OutputType.values().length];
            try {
                iArr[OutputType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OutputType.Color.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OutputType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        numericPattern = patternCompile;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterpolationAnimatedNode(ReadableMap config) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Companion companion = Companion;
        this.inputRange = companion.fromDoubleArray(config.getArray("inputRange"));
        this.extrapolateLeft = config.getString("extrapolateLeft");
        this.extrapolateRight = config.getString("extrapolateRight");
        ReadableArray array = config.getArray("outputRange");
        if (Intrinsics.areEqual("color", config.getString("outputType"))) {
            this.outputType = OutputType.Color;
            this.outputRange = companion.fromIntArray(array);
            return;
        }
        if ((array != null ? array.getType(0) : null) != ReadableType.String) {
            this.outputType = OutputType.Number;
            this.outputRange = companion.fromDoubleArray(array);
        } else {
            this.outputType = OutputType.String;
            this.outputRange = companion.fromStringPattern(array);
            this.pattern = array.getString(0);
        }
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode
    public Object getAnimatedObject() {
        return this.objectValue;
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void onAttachedToNode(AnimatedNode parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.parent != null) {
            throw new IllegalStateException("Parent already attached".toString());
        }
        if (!(parent instanceof ValueAnimatedNode)) {
            throw new IllegalArgumentException("Parent is of an invalid type".toString());
        }
        this.parent = (ValueAnimatedNode) parent;
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void onDetachedFromNode(AnimatedNode parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent != this.parent) {
            throw new IllegalArgumentException("Invalid parent node provided".toString());
        }
        this.parent = null;
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode, com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "InterpolationAnimatedNode[" + this.tag + "] super: {super.prettyPrint()}";
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        String str;
        ValueAnimatedNode valueAnimatedNode = this.parent;
        if (valueAnimatedNode != null) {
            double value = valueAnimatedNode.getValue();
            OutputType outputType = this.outputType;
            int i2 = outputType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[outputType.ordinal()];
            if (i2 == 1) {
                Companion companion = Companion;
                double[] dArr = this.inputRange;
                Object obj = this.outputRange;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
                this.nodeValue = companion.interpolate(value, dArr, (double[]) obj, this.extrapolateLeft, this.extrapolateRight);
                return;
            }
            if (i2 == 2) {
                Companion companion2 = Companion;
                double[] dArr2 = this.inputRange;
                Object obj2 = this.outputRange;
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.IntArray");
                this.objectValue = Integer.valueOf(companion2.interpolateColor(value, dArr2, (int[]) obj2));
                return;
            }
            if (i2 == 3 && (str = this.pattern) != null) {
                Companion companion3 = Companion;
                double[] dArr3 = this.inputRange;
                Object obj3 = this.outputRange;
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.DoubleArray>");
                this.objectValue = companion3.interpolateString(str, value, dArr3, (double[][]) obj3, this.extrapolateLeft, this.extrapolateRight);
            }
        }
    }
}
