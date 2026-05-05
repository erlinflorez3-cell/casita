package com.facebook.react.animated;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.build.ReactBuildConfig;
import io.sentry.protocol.SentryStackTrace;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnjGAL͜P.`W2\u000fq|<$i+yCAU\"}0\tWNmitϺpŏa!6\u0016'idHg9h\"\u0013@B\b?aNڱA9nv~\u0013.@:8(\u00141\u001e8H(v)D\u0012 Z>N\u0001RR;\\5\u001e \u0017V /*#{\u001fBVou:]'Y݆NĚ+_8ŧ\u001e\u0019TY?\r%gtѫL˝9\u0015-مS\u0013`bW\u0003my\u0014ݞtҊ++Q֕(Bf\t,\u0015YScơ~͉`\u0005YӠ\\39Y{K~\u0012~¾\u0007ԫ\u0011<\f\u05faV3V9E\u001a\u0015\u0014dޚ\u0001ɤW@X\u061c/N\u000e\by6E-VĔ7ݰ\u001ffYĥދ\u001da"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0006BU\u0006 \u0014i$.L\u001fDo<\u001a$lkBep0_v4\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFq 7,P?|4+j", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019~\\", "1ta?X5M:#\t\u0006", "", "4qP:X:", "", "4q^:I(Ec\u0019", "", "7sT?T;B]\"\r", ":nV\u0010b<Gb", "AsP?g\rKO!~ib4|q+n\n6", "", "BnE._<>", "@db2g\nH\\\u001a\u0003|", "", "@t]\u000ea0FO(\u0003\u0005g\u001a\f\t:", "4qP:X\u001bB[\u0019gvg6\u000b", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FrameBasedAnimationDriver extends AnimationDriver {
    public static final Companion Companion = new Companion(null);
    private static final double FRAME_TIME_MILLIS = 16.666666666666668d;
    private int currentLoop;
    private double[] frames;
    private double fromValue;
    private int iterations;
    private int logCount;
    private long startFrameTimeNanos;
    private double toValue;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0006BU\u0006 \u0014i$.L\u001fDo<\u001a$lkBep0_v4\u0006*X4gN{A\u001e\u001b0", "", "u(E", "\u0014Q0\u001a8&-7\u0001^tF\u0010co\u0013S", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FrameBasedAnimationDriver(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.startFrameTimeNanos = -1L;
        this.frames = new double[0];
        this.iterations = 1;
        this.currentLoop = 1;
        resetConfig(config);
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(ReadableMap config) {
        int size;
        Intrinsics.checkNotNullParameter(config, "config");
        ReadableArray array = config.getArray(SentryStackTrace.JsonKeys.FRAMES);
        if (array != null && this.frames.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = array.getDouble(i2);
            }
            this.frames = dArr;
        }
        this.toValue = (config.hasKey("toValue") && config.getType("toValue") == ReadableType.Number) ? config.getDouble("toValue") : 0.0d;
        int i3 = (config.hasKey("iterations") && config.getType("iterations") == ReadableType.Number) ? config.getInt("iterations") : 1;
        this.iterations = i3;
        this.currentLoop = 1;
        this.hasFinished = i3 == 0;
        this.startFrameTimeNanos = -1L;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long j2) {
        double d2;
        ValueAnimatedNode valueAnimatedNode = this.animatedValue;
        if (valueAnimatedNode == null) {
            throw new IllegalArgumentException("Animated value should not be null".toString());
        }
        if (this.startFrameTimeNanos < 0) {
            this.startFrameTimeNanos = j2;
            if (this.currentLoop == 1) {
                this.fromValue = valueAnimatedNode.nodeValue;
            }
        }
        int iRound = (int) Math.round(((j2 - this.startFrameTimeNanos) / ((long) 1000000)) / FRAME_TIME_MILLIS);
        if (iRound < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + j2 + " and mStartFrameTimeNanos " + this.startFrameTimeNanos;
            if (ReactBuildConfig.DEBUG) {
                throw new IllegalStateException(str.toString());
            }
            if (this.logCount < 100) {
                FLog.w(ReactConstants.TAG, str);
                this.logCount++;
                return;
            }
            return;
        }
        if (this.hasFinished) {
            return;
        }
        double[] dArr = this.frames;
        if (iRound >= dArr.length - 1) {
            int i2 = this.iterations;
            if (i2 == -1 || this.currentLoop < i2) {
                double d3 = this.fromValue;
                d2 = d3 + (dArr[dArr.length - 1] * (this.toValue - d3));
                this.startFrameTimeNanos = -1L;
                this.currentLoop++;
            } else {
                d2 = this.toValue;
                this.hasFinished = true;
            }
        } else {
            double d4 = this.fromValue;
            d2 = d4 + (dArr[iRound] * (this.toValue - d4));
        }
        valueAnimatedNode.nodeValue = d2;
    }
}
