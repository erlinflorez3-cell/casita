package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.DateUtils;
import io.sentry.IHub;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ReplayFrame;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.protocol.SentryId;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import io.sentry.util.Random;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĩ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]\u001a\u0014\"\u0011OdgonPZ\u0013C%\u0006\u001exp,QU\u0007|\u001a\u000fHBwЀ;M}=Aś|6\u0013):Ĳ@y\u001b\u0001\"ݒP\u0010\rzKK\u0012\u00128@~FZ҈U\u00050\u0012\u000e>&\u0001&\\}N>Hr]B/9\u0003qBT'g0\u0013M\u0015Ͽ\\'#vi\u001e9G?ߎ\u001d%i\u0003\u000fRa?\u000b?\b=\rh-,1H\nɎT\u00110\u0014C*\b\f\u00163zl\t_`$'YPsQ^\u0010@y\u0011z;?\u0014\u0012\u0014+`.[\u001fv\f\u001c9\rr\u0002G`\u0006lJ\u0018z\u0010?'H\u000639C3\u0004arK(|C߉\t\u0017$0\u0011t'id\u0010f\u001bAc\bSAQnM^M8dǀq\u0004~sJL\u0012E_\u007f]\u0012A2%<O[g;Q{\u0010a\\s\u0007\u0007ph\u0002\u0004bJP\"\u001d,e5O #Jr \u0004P\u0003tr%\u0016>b$\u0016\bA6\r{J?=\u0010|n\u0019yxmu\u001651v7\b\u0010{\u0010g9\rIc\\*\u0010*b\u00056W<\u0011\u001b\tlPv$\\r'PV\u000fjX\u0006\nif\fAHou*ZD1G\u0004[\\K\\Pi\u0015\t\u000ep\u0019\u0016\r}K&\u0019hR\u001f9+^\b\t\u0016wzY,+p2>Q`cFłY,nA\r)\r\r\u0004\u0002Mmru\\n&u\u0004\u0012NB׀=Q5lY#G7@2EEz\t\u0016U[C?z+,UO14u;\u0003pZv1^\u0018Z%V\u000f^!9NxH\no{\u0013G\u0012j3aNK\u0003\u0003\bP|KC\u0005g637\b\"+KUI7\u001f&wBCCt\u000em}e\u0012b=S;eT>q(\bha_B;f]\b\u0012\u0015а&к\u0007BP۳H\u0014P\rL\raM\u0018Яrެ<M\u0013ɀNt\u0015.%rlZh\u0016Fϛ6ˀc*{ʕN lC=\u0011{T>Ɲoљ`\u000bR\u05faZ\u0017\n7\u0007\u0012JDv\u074bYť\r0\u000e\u058c͡:z"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0014}\u0017/MP\u0019g?-%ua'\u0016p(]v)[\"", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0014i$.+?FzD+\u0015VpF\u0003r,P\u000b|", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "6tQ", "\u001ah^{f,Gb&\u0013DB\u000f\r\u0006\u0005", "2`c2C9Hd\u001d}zk", "\u001ah^{f,Gb&\u0013Dm9x\u0012=p\n5\u000b\ndt'T|\u000eE\u0006\u00041h}\u000bDw'2LCHA", "@`]1b4", "\u001ah^{f,Gb&\u0013Dn;\u0001\u0010xR{1zJ\tl", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "@d_9T@\u001cO\u0017\u0002zI9\u0007\u001a3d\u007f5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ah^{f,Gb&\u0013Di9\u0007\u00189c\n/E.\u0001 &T\u0004q;L", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@d_9T@\"R", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0012\u0007O\u0005! UEt@\u0001nCY\u0007/D\u0002_\u00120S8A\u001b\"\u001f2o9\u0010r9b@6THW:g\\\u007fL]u8\u001e[8\r\u000eh  }D\",\u0012=M\u0001;uVr\u001a\u0018~xpKe\u001d[C%\u0005E023UhxQI\u001bI/`\u001d[flI>+]o#$f`;\u0017{\\ <@wjgF)\u00028#\u001e\u0001[DU~_Ib',\\\u007fu\u0012\b?z5\u00044\b=s;u\r\u0015h(G\\\b\u00196eOp\u0007FE\u0011NOm~8\u0014QY", "0tU3X9>R\u0007~|f,\u0006\u0018=", "", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#P8\u001bN'\u001c\u0005X\u0017", "1`_Ah9>@\u0019\n\u0002Z@", "", "7rC2e4B\\\u0015\u000e~g.", "", "=mB2Z4>\\(lzg;", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "1n]CX9M", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b9", "1qT.g,\u001cc&\fzg;j\t1m\u007f1\u000b", "B`b8A(FS", "", "=mB2Z4>\\(\\\b^(\f\t.", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#g", "2d[2g,\u001fW ~", "4h[2", "\u001aiPCTuB]b_~e,R", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "@dR<e+>`v\t\u0004_0~", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "=mB0e,>\\'\u0002\u0005m\u0019|\u00079r~(z", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "As^?X", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "4qP:X\u001bB[\u0019\r\nZ4\b", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=mC<h*A3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ">`d@X", "As^=", "1`_Ah9>", "@nc.g,", "0tU3X9%W!\u0003\n", "\u0011n\\=T5B]\"", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BufferCaptureStrategy extends BaseCaptureStrategy {
    public static final Companion Companion = new Companion(null);
    private static final long ENVELOPE_PROCESSING_DELAY = 100;
    private static final String TAG = "BufferCaptureStrategy";
    private final List<CaptureStrategy.ReplaySegment.Created> bufferedSegments;
    private final ICurrentDateProvider dateProvider;
    private final IHub hub;
    private final SentryOptions options;
    private final Random random;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u001e\u007fјlʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȡ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZM,ޏ0ܫ\u00132JģЩ7R"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0014}\u0017/MP\u0019g?-%ua'\u0016p(]v)[\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\u0013ME\u0012?\u0016)3\u0013igH\n\\v\u001dIh\nu\u001f`}r;", "", "\"@6", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCaptureStrategy(SentryOptions options, IHub iHub, ICurrentDateProvider dateProvider, Random random, ScheduledExecutorService executor, Function1<? super SentryId, ReplayCache> function1) {
        super(options, iHub, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.options = options;
        this.hub = iHub;
        this.dateProvider = dateProvider;
        this.random = random;
        this.bufferedSegments = new ArrayList();
    }

    public /* synthetic */ BufferCaptureStrategy(SentryOptions sentryOptions, IHub iHub, ICurrentDateProvider iCurrentDateProvider, Random random, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(sentryOptions, iHub, iCurrentDateProvider, random, scheduledExecutorService, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void capture(List<CaptureStrategy.ReplaySegment.Created> list) throws InterruptedException {
        CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) CollectionsKt.removeFirstOrNull(list);
        while (created != null) {
            CaptureStrategy.ReplaySegment.Created.capture$default(created, this.hub, null, 2, null);
            created = (CaptureStrategy.ReplaySegment.Created) CollectionsKt.removeFirstOrNull(list);
            Thread.sleep(100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureReplay$lambda$1(BufferCaptureStrategy this$0, IScope it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.setReplayId(this$0.getCurrentReplayId());
    }

    private final void createCurrentSegment(String str, final Function1<? super CaptureStrategy.ReplaySegment, Unit> function1) {
        final Date dateTime;
        List<ReplayFrame> frames$sentry_android_replay_release;
        long errorReplayDuration = this.options.getSessionReplay().getErrorReplayDuration();
        long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        ReplayCache cache = getCache();
        if (cache == null || (frames$sentry_android_replay_release = cache.getFrames$sentry_android_replay_release()) == null || !(!frames$sentry_android_replay_release.isEmpty())) {
            dateTime = DateUtils.getDateTime(currentTimeMillis - errorReplayDuration);
        } else {
            ReplayCache cache2 = getCache();
            Intrinsics.checkNotNull(cache2);
            dateTime = DateUtils.getDateTime(((ReplayFrame) CollectionsKt.first((List) cache2.getFrames$sentry_android_replay_release())).getTimestamp());
        }
        Intrinsics.checkNotNullExpressionValue(dateTime, "if (cache?.frames?.isNot…ReplayDuration)\n        }");
        final long time = currentTimeMillis - dateTime.getTime();
        final SentryId currentReplayId = getCurrentReplayId();
        final int recordingHeight = getRecorderConfig().getRecordingHeight();
        final int recordingWidth = getRecorderConfig().getRecordingWidth();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "BufferCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BufferCaptureStrategy.createCurrentSegment$lambda$4(this.f$0, time, dateTime, currentReplayId, recordingHeight, recordingWidth, function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(BufferCaptureStrategy this$0, long j2, Date currentSegmentTimestamp, SentryId replayId, int i2, int i3, Function1 onSegmentCreated) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "$currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "$replayId");
        Intrinsics.checkNotNullParameter(onSegmentCreated, "$onSegmentCreated");
        onSegmentCreated.invoke(BaseCaptureStrategy.createSegmentInternal$default(this$0, j2, currentSegmentTimestamp, replayId, this$0.getCurrentSegment(), i2, i3, null, null, 0, 0, null, null, null, 8128, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$2(BufferCaptureStrategy this$0, Function2 store, long j2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(store, "$store");
        ReplayCache cache = this$0.getCache();
        if (cache != null) {
            store.invoke(cache, Long.valueOf(j2));
        }
        long currentTimeMillis = this$0.dateProvider.getCurrentTimeMillis() - this$0.options.getSessionReplay().getErrorReplayDuration();
        ReplayCache cache2 = this$0.getCache();
        this$0.setScreenAtStart(cache2 != null ? cache2.rotate(currentTimeMillis) : null);
        this$0.rotate(this$0.bufferedSegments, currentTimeMillis);
    }

    private final void rotate(List<CaptureStrategy.ReplaySegment.Created> list, final long j2) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        CollectionsKt.removeAll((List) list, (Function1) new Function1<CaptureStrategy.ReplaySegment.Created, Boolean>() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy.rotate.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(CaptureStrategy.ReplaySegment.Created it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getReplay().getTimestamp().getTime() >= j2) {
                    return false;
                }
                this.setCurrentSegment(r1.getCurrentSegment() - 1);
                this.deleteFile(it.getReplay().getVideoFile());
                booleanRef.element = true;
                return true;
            }
        });
        if (booleanRef.element) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((CaptureStrategy.ReplaySegment.Created) obj).setSegmentId(i2);
                i2 = i3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0(File file, BufferCaptureStrategy this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FileUtils.deleteRecursively(file);
        this$0.setCurrentSegment(-1);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean z2, final Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (!SamplingKt.sample(this.random, this.options.getSessionReplay().getOnErrorSampleRate())) {
            this.options.getLogger().log(SentryLevel.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        IHub iHub = this.hub;
        if (iHub != null) {
            iHub.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy$$ExternalSyntheticLambda2
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    BufferCaptureStrategy.captureReplay$lambda$1(this.f$0, iScope);
                }
            });
        }
        if (!z2) {
            createCurrentSegment("capture_replay", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy.captureReplay.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CaptureStrategy.ReplaySegment replaySegment) throws InterruptedException {
                    invoke2(replaySegment);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CaptureStrategy.ReplaySegment segment) throws InterruptedException {
                    Intrinsics.checkNotNullParameter(segment, "segment");
                    BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                    bufferCaptureStrategy.capture(bufferCaptureStrategy.bufferedSegments);
                    if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                        CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                        CaptureStrategy.ReplaySegment.Created.capture$default(created, BufferCaptureStrategy.this.hub, null, 2, null);
                        Function1<Date, Unit> function1 = onSegmentSent;
                        Date timestamp = created.getReplay().getTimestamp();
                        Intrinsics.checkNotNullExpressionValue(timestamp, "segment.replay.timestamp");
                        function1.invoke(timestamp);
                    }
                }
            });
        } else {
            isTerminating().set(true);
            this.options.getLogger().log(SentryLevel.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public CaptureStrategy convert() {
        if (isTerminating().get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        SessionCaptureStrategy sessionCaptureStrategy = new SessionCaptureStrategy(this.options, this.hub, this.dateProvider, getReplayExecutor(), null, 16, null);
        sessionCaptureStrategy.start(getRecorderConfig(), getCurrentSegment(), getCurrentReplayId(), SentryReplayEvent.ReplayType.BUFFER);
        return sessionCaptureStrategy;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        createCurrentSegment("configuration_changed", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy.onConfigurationChanged.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CaptureStrategy.ReplaySegment replaySegment) {
                invoke2(replaySegment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    BufferCaptureStrategy.this.bufferedSegments.add(segment);
                    BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                    bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
                }
            }
        });
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(Bitmap bitmap, final Function2<? super ReplayCache, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BufferCaptureStrategy.onScreenshotRecorded$lambda$2(this.f$0, store, currentTimeMillis);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onTouchEvent(event);
        CaptureStrategy.Companion.rotateEvents$sentry_android_replay_release$default(CaptureStrategy.Companion, getCurrentEvents(), this.dateProvider.getCurrentTimeMillis() - this.options.getSessionReplay().getErrorReplayDuration(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy.pause.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CaptureStrategy.ReplaySegment replaySegment) {
                invoke2(replaySegment);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    BufferCaptureStrategy.this.bufferedSegments.add(segment);
                    BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                    bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
                }
            }
        });
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        final File replayCacheDir$sentry_android_replay_release = cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null;
        ExecutorsKt.submitSafely(getReplayExecutor(), this.options, "BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.BufferCaptureStrategy$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BufferCaptureStrategy.stop$lambda$0(replayCacheDir$sentry_android_replay_release, this);
            }
        });
        super.stop();
    }
}
