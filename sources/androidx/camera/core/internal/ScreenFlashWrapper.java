package androidx.camera.core.internal;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: ScreenFlashWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`S2şs{B+c$wIQ٥8\u0010R\t}M f\u0001\u000bi\u0011C\u001f\f$x\u0003._T'\\ܫ\u00132Pp\bI[wU9\u000f}f\t.<:8(\u00101\u001e8T(v)J\u0012 Z6N}RR;VK.Z\fL.\u0019\u001e\u000bp\u00156\u0011rkIG#1r\tNoc>\re\rt]o\u0013\u0005r6-V6c\u0014uc\u0011\tj[m\u0006uq{\u0005?ѫ3ȅMs_̬)\f\"\u0019CO;bI̩^ԇU`\u0014ʬ{aqQh\u0010>v)\u0003C<B\u000e\\έTͶ1\u001anڜ^A\u0003rkBf\u0001\rAVаcي\u001b%\bđڨ=."}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u001b Vo\u001bEr,~G{-7m\u001f\u000fT?In&+\u0011sl9\u00149", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b u[\u0014;MCDL;\u001a#k7", "Aba2X5\u001fZ\u0015\r}", "uKP;W9HW\u0018\u0012D\\(\u0005\t<aI&\u0006M\u0001`zOk\u0010<T!@h\u000e-7,\u0004,ZC;t\u0015%\u0011vd\u000fJT", "7r29X(KA\u0017\fz^5]\u0010+s\u0003\u0013{I\u007f\u001b I", "", ":nR8", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", ">d]1\\5@:\u001d\r\n^5|\u0016", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b u[\u0014;MCDL;\u001a#kH=\u0015r,Wv4\u001d", "/o_9l", "", "3w_6e(MW#\bib4|p3l\u0007,\n", "", "Aba2X5\u001fZ\u0015\r}E0\u000b\u0018/n\u007f5", "1kT.e", "1n\\=_,MS\u0004~\u0004]0\u0006\u000b\u001dc\r({Ia\u001e\u0013UrkCv!B", "1n\\=_,MS\u0004~\u0004]0\u0006\u000b\u001dc\r({Ia\u001e\u0013Urt@\u000545b}-", "1n\\=_,MS\u0004~\u0004]0\u0006\u000b\u001ea\u000e.\n", "5dc\u000fT:>A\u0017\fz^5]\u0010+s\u0003", "\u0011n\\=T5B]\"", "1`\\2e(\u0006Q#\fzX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ScreenFlashWrapper";
    private boolean isClearScreenFlashPending;
    private final Object lock;
    private ImageCapture.ScreenFlashListener pendingListener;
    private final ImageCapture.ScreenFlash screenFlash;

    public /* synthetic */ ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash, DefaultConstructorMarker defaultConstructorMarker) {
        this(screenFlash);
    }

    @JvmStatic
    public static final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
        return Companion.from(screenFlash);
    }

    private ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
        this.lock = new Object();
    }

    /* JADX INFO: compiled from: ScreenFlashWrapper.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0019]Q\u007fg\u001dN\u000b\u0011Q\u0014\u001e\u0018\u000fiZO\u001c}.\u001e\u001d3Zom5$ڑ\u0010˃dt>ӌڼ6)"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u001b Vo\u001bEr,~G{-7m\u001f\u000fT?In&+\u0011sl9\u0014\"\nX~2CUR6e(", "", "u(E", "\"@6", "", "4q^:", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u001b Vo\u001bEr,~G{-7m\u001f\u000fT?In&+\u0011sl9\u00149", "Aba2X5\u001fZ\u0015\r}", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b u[\u0014;MCDL;\u001a#k7", "1`\\2e(\u0006Q#\fzX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
            return new ScreenFlashWrapper(screenFlash, null);
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void apply(long j2, ImageCapture.ScreenFlashListener screenFlashListener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
            Unit unit2 = Unit.INSTANCE;
        }
        ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(j2, new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.ScreenFlashWrapper$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    ScreenFlashWrapper.apply$lambda$2(this.f$0);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Logger.e(TAG, "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void apply$lambda$2(ScreenFlashWrapper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.lock) {
            if (this$0.pendingListener == null) {
                Logger.w(TAG, "apply: pendingListener is null!");
            }
            this$0.completePendingScreenFlashListener();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void clear() {
        completePendingScreenFlashClear();
    }

    public final ImageCapture.ScreenFlash getBaseScreenFlash() {
        return this.screenFlash;
    }

    private final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            ImageCapture.ScreenFlashListener screenFlashListener = this.pendingListener;
            if (screenFlashListener != null) {
                screenFlashListener.onCompleted();
            }
            this.pendingListener = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void completePendingScreenFlashClear() {
        Unit unit;
        synchronized (this.lock) {
            if (this.isClearScreenFlashPending) {
                ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                if (screenFlash != null) {
                    screenFlash.clear();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ScreenFlashWrapper screenFlashWrapper = this;
                    Logger.e(TAG, "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                Logger.w(TAG, "completePendingScreenFlashClear: none pending!");
            }
            this.isClearScreenFlashPending = false;
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void completePendingTasks() {
        completePendingScreenFlashListener();
        completePendingScreenFlashClear();
    }
}
