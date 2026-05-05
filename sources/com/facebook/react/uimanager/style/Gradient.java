package com.facebook.react.uimanager.style;

import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":%\u007fјnjG5LeN.ZS8!s{:%c$\bCC٥\"}8\tWȞog\u0005Jb\u000bI\u000f\u001cǝ)jZH\u000ewoR\u001cBH}?KO\u0006<gaҽ:\u0005.4jF\b\u0013\u0019\u001c@G>\u0006+GY\u001c*0n\u0002\u000b^\u001bP\u001d\u001a@\n\u0015ī\u0003ɉ`gVȤ\u0019xk?G#1o\u0019ú3ۢ4|Uε\u0017`5\u0014\u000faL1\u0017ʽAչ)S\u000bޗ#gM\u000bWqk\u000e?Ѫ)ȅMs_̬)\f\"\u001fCO;cI̩hԇU`\u0014ʬ{[qVh\u000eV}Qԋ\u0019ʀ\b\u000e\u000eΩ\u0019:;&~\b<@KɄUĖT\u0002fۍȾ~t"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77w;IB?k=-j", "", "5qP1\\,Gb", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019~\\", "1n[<e:", "", "3mS%", "", "3mS&", ">nb6g0H\\'", "", "AsP?g\u001f", "AsP?g ", "Bx_2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77w;IB?k=-SJn5\u0006g,W\u0006\u0016[WN\u0002", "5dc [(=S&", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "0nd;W:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "\u0015qP1\\,Gb\b\u0013\u0006^", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Gradient {
    private final int[] colors;
    private float endX;
    private float endY;
    private final float[] positions;
    private float startX;
    private float startY;
    private final GradientType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0005Gָٍ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\ҾuE"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77w;IB?k=-SJn5\u0006g,W\u0006\u0016[WN\u0002", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001aH=\u00124\u001985\u0006ZYB\few", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class GradientType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GradientType[] $VALUES;
        public static final GradientType LINEAR_GRADIENT = new GradientType("LINEAR_GRADIENT", 0);

        private static final /* synthetic */ GradientType[] $values() {
            return new GradientType[]{LINEAR_GRADIENT};
        }

        static {
            GradientType[] gradientTypeArr$values = $values();
            $VALUES = gradientTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(gradientTypeArr$values);
        }

        private GradientType(String str, int i2) {
        }

        public static EnumEntries<GradientType> getEntries() {
            return $ENTRIES;
        }

        public static GradientType valueOf(String str) {
            return (GradientType) Enum.valueOf(GradientType.class, str);
        }

        public static GradientType[] values() {
            return (GradientType[]) $VALUES.clone();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientType.values().length];
            try {
                iArr[GradientType.LINEAR_GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Gradient(ReadableMap readableMap) {
        if (readableMap == null) {
            throw new IllegalArgumentException("Gradient cannot be null");
        }
        String string = readableMap.getString("type");
        if (!Intrinsics.areEqual(string, "linearGradient")) {
            throw new IllegalArgumentException("Unsupported gradient type: " + string);
        }
        this.type = GradientType.LINEAR_GRADIENT;
        ReadableMap map = readableMap.getMap(ViewProps.START);
        if (map != null) {
            this.startX = (float) map.getDouble("x");
            this.startY = (float) map.getDouble("y");
        }
        ReadableMap map2 = readableMap.getMap(ViewProps.END);
        if (map2 != null) {
            this.endX = (float) map2.getDouble("x");
            this.endY = (float) map2.getDouble("y");
        }
        ReadableArray array = readableMap.getArray("colorStops");
        if (array == null) {
            throw new IllegalArgumentException("Invalid colorStops array");
        }
        int size = array.size();
        this.colors = new int[size];
        this.positions = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map3 = array.getMap(i2);
            this.colors[i2] = map3.getInt("color");
            this.positions[i2] = (float) map3.getDouble(ViewProps.POSITION);
        }
    }

    public final Shader getShader(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        if (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()] == 1) {
            return new LinearGradient(this.startX * bounds.width(), this.startY * bounds.height(), this.endX * bounds.width(), this.endY * bounds.height(), this.colors, this.positions, Shader.TileMode.CLAMP);
        }
        throw new NoWhenBranchMatchedException();
    }
}
