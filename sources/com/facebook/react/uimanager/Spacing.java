package com.facebook.react.uimanager;

import com.facebook.yoga.YogaConstants;
import java.util.Arrays;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106B\u0005$4\u0012\u0006\u0019nj?0LeV7Zݷ2\u000fy\u0002<$a(yCIU\"}(\u000beȞ\u0006}\u001fJ\t\n{\u000e\u001cV}p@֒Yxk\u0012O?H\u0004O7[pU9\u000fvȥ\t @%x\u0007\u000b\u0015*.V\u0014\u000fzqŷë\u00160Nuze\u001dQ\u0013\u001b*\u0006l\"\u0011\"jmf6vsҺ>/1\u000b2Q\\4w0+O=Jb5%v\u0010*q¯7}!3b\u001b\u0007\u0001]o\u0007M\u007fU\u0005\u00173o?W\u0004o6\u0007\u0002D\u00199]%]!2\r\t_q$'Y[,O^ @w)\u000fUS\u0012\"\u001e'v8]\u001et\u0016&3#~\u0004D^\u0017vB.|(خ\u0017u\fA,Q\u001b\u0015S8ݥ\u001b\u05ee;{\rټn/\u000fw9[\u0003\u00187ڀ'ƻ{Q9҅\u0011IVT\"YktZ͒d͆.\u00048ϚP;\n\u001cF\u0017SC2ހ/\u074co\u0002PֳЂz\u001c"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#dy\u001e;v\u0018\u0004", "", "u(E", "2dU.h3MD\u0015\u0006\u000b^", "", "uE\u0018#", "=qX4\\5:Z", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~G\t\u001c5q\u001f0#\u0007,", "AoP0\\5@", "", "uEJ\u0013\u001c\u001d", "6`b\u000e_0:a\u0019\rh^;", "", "D`[BX\rEO\u001b\r", "", "5dc", "AoP0\\5@B-\nz", "5dc\u001fT>", "5dc$\\;A4\u0015\u0006\u0002[(z\u000f", "4`[9U(<Y\b\u0013\u0006^", "@db2g", "", "Adc", "D`[BX", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Spacing {
    public static final int ALL = 8;
    public static final int BLOCK = 9;
    public static final int BLOCK_END = 10;
    public static final int BLOCK_START = 11;
    public static final int BOTTOM = 3;
    public static final int END = 5;
    public static final int HORIZONTAL = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int START = 4;
    public static final int TOP = 1;
    public static final int VERTICAL = 7;
    private final float defaultValue;
    private boolean hasAliasesSet;
    private final float[] spacing;
    private int valueFlags;
    public static final Companion Companion = new Companion(null);
    private static final int[] flagsMap = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005,4\u0012\u0006\u001anʑA0RwP\u008cXݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018Tuw\u0007J\t\u001c\n\u000fV\"\u0007kDI\u0004z4\u070fa̓FoG\u074c\u001e{K<xtd\u0007v\u074ctأ}\u0005\tɝzT\u001ez\u0013Cy\u000ehؚ\u0013¤>R\u0015˟U& \u000bV / 3ɨ!ɇLleŽ\u007f/\u0011oZNUa\u0007Ů ϘJT/˙Gm,2X7c\u0017{ٌU\u07baV[Gš\u0010}K\r\u0001'U- ֜*͏\\\u007f\u001cƃ{[\u001bf\u000b&\u000b\u0007(ӧ^ˏ/Ok֟!\u001a6\u0002\u0013{;>Z\u0601XόL.5Կ7\u0014\u001c>\rr\u0002B'أ1۰\u0004ziاg1\u000e?C9Ih(Ĭ\u000eϭR7\u0004˜]*1\u000e\u0007!\nVdֲgôXwYĸ\"LKVf\n\bLDՑrĊ\u0006*\f\u0382Ѓ\u0004A"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#dy\u001e;v\u0018l+MCv0'\u0019rj\u000f", "", "u(E", "\u000fK;", "", "\u0010K>\u0010>", "\u0010K>\u0010>&\u001e<w", "\u0010K>\u0010>&,Btki", "\u0010NC!B\u0014", "\u0013M3", "\u0016NA\u0016M\u0016'Bte", "\u001aD5!", " H6\u0015G", "!S0\u001fG", "\"N?", "$DA!<\n\u001a:", "4kP4f\u0014:^", "", "<df\u0013h3EA$zxb5~d<r{<", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float[] newFullSpacingArray() {
            return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
        }
    }

    public Spacing() {
        this(0.0f, Companion.newFullSpacingArray());
    }

    public Spacing(float f2) {
        this(f2, Companion.newFullSpacingArray());
    }

    public Spacing(float f2, float[] spacing) {
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        this.defaultValue = f2;
        this.spacing = spacing;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Spacing(Spacing original) {
        Intrinsics.checkNotNullParameter(original, "original");
        float f2 = original.defaultValue;
        float[] fArr = original.spacing;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        this(f2, fArrCopyOf);
        this.valueFlags = original.valueFlags;
        this.hasAliasesSet = original.hasAliasesSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float get(int r7) {
        /*
            r6 = this;
            r0 = 4
            if (r7 == r0) goto L10
            r0 = 5
            if (r7 == r0) goto L10
            switch(r7) {
                case 9: goto L10;
                case 10: goto L10;
                case 11: goto L10;
                default: goto L9;
            }
        L9:
            float r3 = r6.defaultValue
        Lb:
            int r5 = r6.valueFlags
            if (r5 != 0) goto L13
            return r3
        L10:
            r3 = 2143289344(0x7fc00000, float:NaN)
            goto Lb
        L13:
            int[] r4 = com.facebook.react.uimanager.Spacing.flagsMap
            r0 = r4[r7]
            r0 = r0 & r5
            if (r0 == 0) goto L1f
            float[] r0 = r6.spacing
            r0 = r0[r7]
            return r0
        L1f:
            boolean r0 = r6.hasAliasesSet
            if (r0 == 0) goto L4e
            r0 = 1
            if (r7 == r0) goto L3a
            r0 = 3
            if (r7 == r0) goto L3a
            r2 = 6
        L2a:
            r0 = r4[r2]
            int r1 = (-1) - r0
            int r0 = (-1) - r5
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L3c
            float[] r0 = r6.spacing
            r0 = r0[r2]
            return r0
        L3a:
            r2 = 7
            goto L2a
        L3c:
            r2 = 8
            r0 = r4[r2]
            int r1 = (-1) - r5
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L4e
            float[] r0 = r6.spacing
            r0 = r0[r2]
            return r0
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.Spacing.get(int):float");
    }

    public final float getRaw(int i2) {
        return this.spacing[i2];
    }

    public final float getWithFallback(int i2, int i3) {
        int i4 = this.valueFlags;
        int i5 = flagsMap[i2];
        return (i4 + i5) - (i4 | i5) != 0 ? this.spacing[i2] : get(i3);
    }

    public final void reset() {
        ArraysKt.fill$default(this.spacing, Float.NaN, 0, 0, 6, (Object) null);
        this.hasAliasesSet = false;
        this.valueFlags = 0;
    }

    public final boolean set(int i2, float f2) {
        int i3;
        if (FloatUtil.floatsEqual(this.spacing[i2], f2)) {
            return false;
        }
        this.spacing[i2] = f2;
        if (YogaConstants.isUndefined(f2)) {
            int i4 = this.valueFlags;
            int i5 = ~flagsMap[i2];
            i3 = (i5 + i4) - (i5 | i4);
        } else {
            int i6 = this.valueFlags;
            int i7 = flagsMap[i2];
            i3 = (i7 + i6) - (i7 & i6);
        }
        this.valueFlags = i3;
        int[] iArr = flagsMap;
        int i8 = iArr[8];
        this.hasAliasesSet = ((i8 + i3) - (i8 | i3) == 0 && (iArr[7] & i3) == 0 && (iArr[6] & i3) == 0 && (i3 & iArr[9]) == 0) ? false : true;
        return true;
    }
}
