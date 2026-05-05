package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ReP.XS2\u000f\u0002{<řc$\u007fJCU ~*\teNo˧vJh\u0014K\u000f\f\u0019\u0001jBI]xc\u0013\u00172XoG3SwE9vt>\u0005&4*8\u0010\u0005\t\u001a0I\u0016u\u0011ŏ{\f@/\u0001\u0016JV\u001bM\u001d\u001a@\u0007N$\u000f tg|9Xzc:='\u001bqRP7_^\u0003c\ftYܮ\u0011vo%sNE\\-%\u0002\t7Vig\u001b? NKho39r\fWd^0\u0018#Ug\r\f\u001en`\u0013}x\fU1\u0018gY}&(&\u0001L\u0019J\f&\u0006UQ\u0005Ʃ\u001cǴ\f\u000e;οCbNZ\u001a^p\u000b1&ي\u001b)\u001851E)s\"mI'f7*\u0014c̗%ъr!c٪^y#+lw\u007fB\b\u0001\u0014ʳݕ\nՒAw\frh\u00168\u0019HI\u0006A\n$~)3Ms9Q8BȶJזk|\r\u009b\u0001UojVYr\b$QB\t:uz%[ߛ±Tг0\u001bU\u001eZ%\f\u001d+\"b\u0014J>u\u001f\\Q\u0001i\u0019Pύ\u000e+7ωO[t\u000b\u001cw\nuA9ik cbvBERa3]ڋFY\u0014ȗt*(SV\r`\u0007\nDf\fA3Ɛu\"<ιI\u001bb8V'nPO\"!apg>%+՟0ғm$|էɿT\u000b"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@u%?#k$?x\u001d.>G:k>}\u001efk8\u0007p\u0002", "", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", ";tg2e\nH\\\u001a\u0003|", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@u%?#e0Jm#\fWL<o6s", "=m29b:>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0012\u0007O\u0005! UEt@\u0001nCY\u0007/D\u0002_*VBHu8\u001d^uaD\u000e_@\u0018\b+FLXuDb\u0006=!od\u0017O/\u000fZ@G.}K;(Q1Z\n\u0005i\u0011\u0015\u0014\u001d9tyP pW\u0003\u0013\u0005E3q\u0011/#j", "0tU3X9\"\\\u001a\t", "\u001a`]1e6BRb\u0007z]0xR\u0017e~,w\u001e\u000b\u0016\u0017E.jLw&5fa)8wk", "2ta.g0H\\", "", "5dc\u0011h9:b\u001d\t\u0004", "u(9", "4qP:X\u0014Nf\u0019\f", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@u%?#k$?x\u001d.5N\nLA\u001a\u001dhII\u001ac9$", "6`b\u0012k@G]'\\\u0005],z", "", "5dc\u0015T:\u001ef-\b\u0005l\n\u0007\b/c", "u(I", "6`b\u0012k@G]'\\\u0005],zG.e\u0007(}<\u0010\u0017", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ";dS6T\nHR\u0019|", "\u001a`]1e6BRb\u0007z]0xR\u0017e~,w\u001e\u000b\u0016\u0017EE", "5dc\u001aX+BOv\ty^*;\u0017/n\u000f5\u0010:| \u0016Ty\u0012;p25d\u0005\u001cKg#.TC7y4", "u(;.a+K]\u001d}Df,{\r+/g(zD|t!Fo\f\u0012", ";dS6T\rH`!z\n", "\u001a`]1e6BRb\u0007z]0xR\u0017e~,w!\u000b$\u001fC~c", "5dc\u001aX+BOy\t\bf(\f", "u(;.a+K]\u001d}Df,{\r+/g(zD|w!Tw\nKL", ";dS6T\rH`!z\n\u001d+|\u0010/g{7{", "5dc\u001ah?>`v\t\u0004_0~", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006\b)4Y\bi\u001f}).Z!Et5\"\u0017>", "5dc\u001ca\nE]'~", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "5dc\u001cc;B]\"\r", "u(;6buLS\"\u000e\bruj\t8t\r<eK\u0010\u001b!P}c", "Ata3T*>", "\u001a`]1e6BRb\u0010~^>Fv?r\u0001$y@V", "2qP6a\nHR\u0019|", "3mS\u001cY\u001aM`\u0019z\u0003", "3mR<W,", "7lP4X", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "@d[2T:>", "AsP?g", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SimpleVideoEncoder {
    private final MediaCodec.BufferInfo bufferInfo;
    private final SimpleMp4FrameMuxer frameMuxer;
    private final Lazy hasExynosCodec$delegate;
    private final MediaCodec mediaCodec;
    private final Lazy mediaFormat$delegate;
    private final MuxerConfig muxerConfig;
    private final Function0<Unit> onClose;
    private final SentryOptions options;
    private Surface surface;

    public SimpleVideoEncoder(SentryOptions options, MuxerConfig muxerConfig, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.options = options;
        this.muxerConfig = muxerConfig;
        this.onClose = function0;
        this.hasExynosCodec$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Boolean>() { // from class: io.sentry.android.replay.video.SimpleVideoEncoder$hasExynosCodec$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z2 = false;
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                Intrinsics.checkNotNullExpressionValue(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
                MediaCodecInfo[] mediaCodecInfoArr = codecInfos;
                int length = mediaCodecInfoArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    String name = mediaCodecInfoArr[i2].getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    if (StringsKt.contains$default((CharSequence) name, (CharSequence) "c2.exynos", false, 2, (Object) null)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                return Boolean.valueOf(z2);
            }
        });
        MediaCodec mediaCodecCreateByCodecName = getHasExynosCodec() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(this.muxerConfig.getMimeType());
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …onfig.mimeType)\n        }");
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<MediaFormat>() { // from class: io.sentry.android.replay.video.SimpleVideoEncoder$mediaFormat$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MediaFormat invoke() {
                int bitRate = this.this$0.getMuxerConfig().getBitRate();
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = this.this$0.getMediaCodec$sentry_android_replay_release().getCodecInfo().getCapabilitiesForType(this.this$0.getMuxerConfig().getMimeType()).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(bitRate))) {
                        this.this$0.getOptions().getLogger().log(SentryLevel.DEBUG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(bitRate));
                        Intrinsics.checkNotNullExpressionValue(objClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                        bitRate = ((Number) objClamp).intValue();
                    }
                } catch (Throwable th) {
                    this.this$0.getOptions().getLogger().log(SentryLevel.DEBUG, "Could not retrieve MediaCodec info", th);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.this$0.getMuxerConfig().getMimeType(), this.this$0.getMuxerConfig().getRecordingWidth(), this.this$0.getMuxerConfig().getRecordingHeight());
                Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.getMuxerConfig().getFrameRate());
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            }
        });
        this.bufferInfo = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.getFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "muxerConfig.file.absolutePath");
        this.frameMuxer = new SimpleMp4FrameMuxer(absolutePath, muxerConfig.getFrameRate());
    }

    public /* synthetic */ SimpleVideoEncoder(SentryOptions sentryOptions, MuxerConfig muxerConfig, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, muxerConfig, (i2 & 4) != 0 ? null : function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0185, code lost:
    
        throw new java.lang.RuntimeException("encoderOutputBuffer " + r3 + " was null");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void drainCodec(boolean r9) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.SimpleVideoEncoder.drainCodec(boolean):void");
    }

    private final boolean getHasExynosCodec() {
        return ((Boolean) this.hasExynosCodec$delegate.getValue()).booleanValue();
    }

    private final MediaFormat getMediaFormat() {
        return (MediaFormat) this.mediaFormat$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void encode(android.graphics.Bitmap r6) {
        /*
            r5 = this;
            java.lang.String r0 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = "xiaomi"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4 = 1
            boolean r0 = kotlin.text.StringsKt.contains(r1, r0, r4)
            r3 = 0
            if (r0 != 0) goto L4c
            java.lang.String r1 = android.os.Build.MANUFACTURER
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = "motorola"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.contains(r1, r0, r4)
            if (r0 != 0) goto L4c
            io.sentry.android.replay.util.SystemProperties r1 = io.sentry.android.replay.util.SystemProperties.INSTANCE
            io.sentry.android.replay.util.SystemProperties$Property r0 = io.sentry.android.replay.util.SystemProperties.Property.SOC_MANUFACTURER
            r2 = 2
            java.lang.String r1 = io.sentry.android.replay.util.SystemProperties.get$default(r1, r0, r3, r2, r3)
            java.lang.String r0 = "spreadtrum"
            boolean r0 = kotlin.text.StringsKt.equals(r1, r0, r4)
            if (r0 != 0) goto L4c
            io.sentry.android.replay.util.SystemProperties r1 = io.sentry.android.replay.util.SystemProperties.INSTANCE
            io.sentry.android.replay.util.SystemProperties$Property r0 = io.sentry.android.replay.util.SystemProperties.Property.SOC_MANUFACTURER
            java.lang.String r1 = io.sentry.android.replay.util.SystemProperties.get$default(r1, r0, r3, r2, r3)
            java.lang.String r0 = "unisoc"
            boolean r0 = kotlin.text.StringsKt.equals(r1, r0, r4)
            if (r0 == 0) goto L66
        L4c:
            android.view.Surface r0 = r5.surface
            if (r0 == 0) goto L6f
            android.graphics.Canvas r1 = r0.lockCanvas(r3)
        L54:
            if (r1 == 0) goto L5a
            r0 = 0
            r1.drawBitmap(r6, r0, r0, r3)
        L5a:
            android.view.Surface r0 = r5.surface
            if (r0 == 0) goto L61
            r0.unlockCanvasAndPost(r1)
        L61:
            r0 = 0
            r5.drainCodec(r0)
            return
        L66:
            android.view.Surface r0 = r5.surface
            if (r0 == 0) goto L6f
            android.graphics.Canvas r1 = r0.lockHardwareCanvas()
            goto L54
        L6f:
            r1 = r3
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.SimpleVideoEncoder.encode(android.graphics.Bitmap):void");
    }

    public final long getDuration() {
        return this.frameMuxer.getVideoTime();
    }

    public final MediaCodec getMediaCodec$sentry_android_replay_release() {
        return this.mediaCodec;
    }

    public final MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    public final Function0<Unit> getOnClose() {
        return this.onClose;
    }

    public final SentryOptions getOptions() {
        return this.options;
    }

    public final void release() {
        try {
            Function0<Unit> function0 = this.onClose;
            if (function0 != null) {
                function0.invoke();
            }
            drainCodec(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.release();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    public final void start() {
        this.mediaCodec.configure(getMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        drainCodec(false);
    }
}
