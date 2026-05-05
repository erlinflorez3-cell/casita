package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.android.replay.video.SimpleVideoEncoder;
import io.sentry.protocol.SentryId;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.`ݷ2şs{BCc$\bCCU ~*\teNo˧vJp\u000bK\u000f\u0014\"\u0001jBI]ތe\u0012%2JoE9UoK9hҚ>\u000562*\u0600\u0002\u0005\u000f!2H\u0016y\u0003Ca\f\u001a0FqBR\u001bS\r\u001a\u0018\fF \u000f'dgT<NqsŽM_3ipM_^l=`\u001dJb'%v\u0010\u001f;DE7-%\u0002\u0006\u07baV[M\u0007\b\u0019K\"\u0001'UIyweUp\u007fB5[S\u001b~\u000b&\u000b'\u0002h\u0012'9r{Mf\rV\nAԈɁ@\u0004\u0014*oh<J2f6,cx\u0001xXP0sr\u0004\t\u0003N\u0017S\"c3?\u001btty=/Me\u000eM\u0013,I\u0019nOy\u001b\")]){\u0010SGPnexR\u0018\u0003Um2\u0013\u0013\u00068.HG.Q,\u0015<B=7\neS%y/`D\u0016#5dv\u0002\u0002RvlRr$fB\t:\u0007th\u0013\u001chT\u0007XAS\"T\u0015/ \u0013Nq@J/W(N}\u0007\u001an[\u0011\"%]{}Y7{\u001c\fQ^aj\u0002i\u001e\u0018jx*>jmKX/XaCr\\V@bLxH\u0010{r`<\u0019@x\n\u001eJ+_+%#V=6DW{7q\u000bl\u001e:l3R%:2\u0003\u000e\u0019Rro\u001emO̥8ʬd\"5ۋ\"A'-m\"\u0017<Sɀ\tҋw\u007fOх\u001d_Zu.{e}0\u0016HD\u007f9\u0014Р\u0011ɒ-8\nΏ]Nxq_Zb3\t\u000b\u0012\u000fiw\u0005ԙ\nϡt,hʄ\u001bwb':\u0013nt3\b\u0013\u0012\ncVzuu\u0003\u001cDJYt\u0013Yj`H~\u0015\u001fL7_\u0003xğ7ԩG'%ȶH/=)y_\u007fn\\\u000f\u0019M|۪І\u0004Нg wdWu@TPK_\u0015L9tx\u0011B`j&\t\u0019މ6٢7HIЬAqFg#1\u0014e5AC/-ܫƪ\u0013̭\u0002>6a0\u0010Q\u0017,`I@\u001fd$s{oc\\9Meϛ\r֭5n\u001aΒݤ$\u0014"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "@d_9T@\"R", "\u001ah^{f,Gb&\u0013Di9\u0007\u00189c\n/E.\u0001 &T\u0004q;L", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0012\u0007O\u0005! UEt@\u0001nCY\u0007/D\u0002_9ZMJu2(\u001c2O9\u0010r9bZ&\u001d\u0010?", "3mR<W,K", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001f@u%?#k$?x\u001d.>G:k>}\u001efk8\u0007p\u0002", "3mR<W,K:#|\u0001", "", "4qP:X:", "", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m^-3u\u0016\u0004", "5dc\u0013e(FS'=\t^5\f\u0016C_{1zM\u000b\u001b\u0016A|\u000eG}!IS\u000b >m\u0012<M", "u(;7T=:\u001d)\u000e~euc\r=tU", "7r29b:>R", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "=mV<\\5@A\u0019\u0001\u0003^5\f", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCh\u0013\"\u001d", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u0005 \u001dGnp8\u0005(\u001dU\tu", "=mV<\\5@A\u0019\u0001\u0003^5\fi3l\u007f", "\u001aiPCTuB]b_~e,R", "5dc\u001ca.HW\"\u0001h^.\u0005\t8t`,\u0003@?%\u0017P~\u001bPp!>X\u000b*;l\u0010;MNBgH\u0018\"hh9\u0003q,", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "=mV<\\5@A\u0019\u0001\u0003^5\fi3l\u007ffz@\b\u0017\u0019C~\u000e", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "@d_9T@\u001cO\u0017\u0002z=0\n", "5dc\u001fX7EO-\\v\\/|g3r>6{I\u0010$+Ak\u0017;\u0004/9Xw-7x\u001d*a=Hk;\u001e\u0011va", "@d_9T@\u001cO\u0017\u0002z=0\nG.e\u0007(}<\u0010\u0017", "/cS\u0013e(FS", "", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "4qP:X\u001bB[\u0019\r\nZ4\b", "", "Aba2X5", "/cS\u0013e(FSW\rzg;\n\u001d)a\t'\tJ\u0005\u0016\u0011To\u0019Cr9/f}'7i$.", "Aba2X5LV#\u000e", "1k^@X", "1qT.g,/W\u0018~\u0005H-", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9o<\u007f%BU\r 6^\u001a-MM\u0011", "2ta.g0H\\", "4q^:", "AdV:X5M7\u0018", "", "6dX4[;", "EhSA[", "4qP:X\u0019:b\u0019", "0hc\u001fT;>", "DhS2b\rBZ\u0019", "2d[2g,\u001fW ~", "4h[2", "3mR<W,", "", "4qP:X", ">da@\\:MA\u0019\u0001\u0003^5\fy+l\u0010(\n", "9dh", "D`[BX", "@nc.g,", "Cmc6_", "\u0011n\\=T5B]\"", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ReplayCache implements Closeable {
    public static final String ONGOING_SEGMENT = ".ongoing_segment";
    public static final String SEGMENT_KEY_BIT_RATE = "config.bit-rate";
    public static final String SEGMENT_KEY_FRAME_RATE = "config.frame-rate";
    public static final String SEGMENT_KEY_HEIGHT = "config.height";
    public static final String SEGMENT_KEY_ID = "segment.id";
    public static final String SEGMENT_KEY_REPLAY_ID = "replay.id";
    public static final String SEGMENT_KEY_REPLAY_RECORDING = "replay.recording";
    public static final String SEGMENT_KEY_REPLAY_SCREEN_AT_START = "replay.screen-at-start";
    public static final String SEGMENT_KEY_REPLAY_TYPE = "replay.type";
    public static final String SEGMENT_KEY_TIMESTAMP = "segment.timestamp";
    public static final String SEGMENT_KEY_WIDTH = "config.width";
    private SimpleVideoEncoder encoder;
    private final Object encoderLock;
    private final List<ReplayFrame> frames;
    private final AtomicBoolean isClosed;
    private final LinkedHashMap<String, String> ongoingSegment;
    private final Lazy ongoingSegmentFile$delegate;
    private final SentryOptions options;
    private final Lazy replayCacheDir$delegate;
    private final SentryId replayId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005+4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCQU\"Ԃ*\teNogtJb\u000bY\u000f\u000eǝ~̚-_ǁ)]@\u000erGu?ݯQoK9)9D\u00128487(\u00131\u001e8W(v)S{\u0010 AXphd=p\u000b\u001a \u0019V=\u0011/lv|HՂpg@D3\toX^)e6#^\u001dHd';\u000ew\u001dYT}ߎչ)S\t\u001f\u001bqM\u001cWsS\u0004\u0017AW/W\u0003o6\u0007\u0010D\u00199`%]!8-\u0011_a$'YQ:֠#ˎ,w\u0003Ԉ]H\u0012\u0011\u001e'v0\u0004Հ9ڿ\u00123|Ɂ$L^\u0006vB.|8بiӾ\u000433ݍkr_fS\u0019|9R˝_̷'\u0001vď,`\u001cf-\u001b\u0003y(Ĺ$͘AHVˣ*I{\u000b\tb0,Z\u0383\u001aĬ3{\u0019фg1EcQ#OmX҇\u0017ϼz\u0005hå$u`QX\"\u001d\u0018\u000eѨ[ɔ^Dlʍ<\\bbD\u0011{\u001e+ͶPݔ\u0017 dɼ\r-3\u001bfO\u0017kAܕ0ܦ)/nŽ*zy\u001ao9\r5\fȢ6ߧeR~ܝ͜@}"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016l+MCv0'\u0019rj\u000f", "", "u(E", "\u001dM6\u001c<\u0015 M\u0007^\\F\few", "", "!D6\u001a8\u0015-M~^nX\t`w)R[\u0017[", "!D6\u001a8\u0015-M~^nX\rid\u0017Ey\u0015W/`", "!D6\u001a8\u0015-M~^nX\u000f\\l\u0011Hn", "!D6\u001a8\u0015-M~^nX\u0010[", "!D6\u001a8\u0015-M~^nX\u0019\\s\u0016As\"_\u001f", "!D6\u001a8\u0015-M~^nX\u0019\\s\u0016As\"h ^\u0001\u0004&Sv\u001e", "!D6\u001a8\u0015-M~^nX\u0019\\s\u0016As\"i\u001emvv0ii+p\u0013$5j\u000f", "!D6\u001a8\u0015-M~^nX\u0019\\s\u0016As\"j4kv", "!D6\u001a8\u0015-M~^nX\u001b`p\u000fSn\u0004c+", "!D6\u001a8\u0015-M~^nX\u001e`g\u001eH", "4q^:70LY", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9t8\u00054#Y\u007f(7v%\rIR7A", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "@d_9T@\"R", "\u001ah^{f,Gb&\u0013Di9\u0007\u00189c\n/E.\u0001 &T\u0004q;L", "@d_9T@\u001cO\u0017\u0002zI9\u0007\u001a3d\u007f5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "4q^:70LYW\rzg;\n\u001d)a\t'\tJ\u0005\u0016\u0011To\u0019Cr9/f}'7i$.", ";`Z2E,IZ\u0015\u0013XZ*\u007f\t\u000ei\r", "\u001aiPCTuB]b_~e,R", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean fromDisk$lambda$3(ReplayCache cache, File file, String name) {
            Intrinsics.checkNotNullParameter(cache, "$cache");
            Intrinsics.checkNotNullExpressionValue(name, "name");
            if (StringsKt.endsWith$default(name, ".jpg", false, 2, (Object) null)) {
                File file2 = new File(file, name);
                Long longOrNull = StringsKt.toLongOrNull(FilesKt.getNameWithoutExtension(file2));
                if (longOrNull != null) {
                    ReplayCache.addFrame$default(cache, file2, longOrNull.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LastSegmentData fromDisk$sentry_android_replay_release$default(Companion companion, SentryOptions sentryOptions, SentryId sentryId, Function1 function1, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                function1 = null;
            }
            return companion.fromDisk$sentry_android_replay_release(sentryOptions, sentryId, function1);
        }

        /* JADX WARN: Removed duplicated region for block: B:89:0x0241  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final io.sentry.android.replay.LastSegmentData fromDisk$sentry_android_replay_release(io.sentry.SentryOptions r25, io.sentry.protocol.SentryId r26, kotlin.jvm.functions.Function1<? super io.sentry.protocol.SentryId, io.sentry.android.replay.ReplayCache> r27) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 618
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.ReplayCache.Companion.fromDisk$sentry_android_replay_release(io.sentry.SentryOptions, io.sentry.protocol.SentryId, kotlin.jvm.functions.Function1):io.sentry.android.replay.LastSegmentData");
        }

        public final File makeReplayCacheDir(SentryOptions options, SentryId replayId) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().log(SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            Intrinsics.checkNotNull(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }
    }

    public ReplayCache(SentryOptions options, SentryId replayId) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.options = options;
        this.replayId = replayId;
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new Object();
        this.replayCacheDir$delegate = LazyKt.lazy(new Function0<File>() { // from class: io.sentry.android.replay.ReplayCache$replayCacheDir$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return ReplayCache.Companion.makeReplayCacheDir(this.this$0.options, this.this$0.replayId);
            }
        });
        this.frames = new ArrayList();
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile$delegate = LazyKt.lazy(new Function0<File>() { // from class: io.sentry.android.replay.ReplayCache$ongoingSegmentFile$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() throws IOException {
                if (this.this$0.getReplayCacheDir$sentry_android_replay_release() == null) {
                    return null;
                }
                File file = new File(this.this$0.getReplayCacheDir$sentry_android_replay_release(), ReplayCache.ONGOING_SEGMENT);
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            }
        });
    }

    public static /* synthetic */ void addFrame$default(ReplayCache replayCache, File file, long j2, String str, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j2, str);
    }

    public static /* synthetic */ void addFrame$sentry_android_replay_release$default(ReplayCache replayCache, Bitmap bitmap, long j2, String str, int i2, Object obj) throws IOException {
        if ((i2 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$sentry_android_replay_release(bitmap, j2, str);
    }

    public static /* synthetic */ GeneratedVideo createVideoOf$default(ReplayCache replayCache, long j2, long j3, int i2, int i3, int i4, int i5, int i6, File file, int i7, Object obj) {
        if ((-1) - (((-1) - i7) | ((-1) - 128)) != 0) {
            file = new File(replayCache.getReplayCacheDir$sentry_android_replay_release(), i2 + ".mp4");
        }
        return replayCache.createVideoOf(j2, j3, i2, i3, i4, i5, i6, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean encode(ReplayFrame replayFrame) {
        if (replayFrame == null) {
            return false;
        }
        try {
            Bitmap bitmap = BitmapFactory.decodeFile(replayFrame.getScreenshot().getAbsolutePath());
            synchronized (this.encoderLock) {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                    simpleVideoEncoder.encode(bitmap);
                    Unit unit = Unit.INSTANCE;
                }
            }
            bitmap.recycle();
            return true;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
            return false;
        }
    }

    public final void addFrame(File screenshot, long j2, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.frames.add(new ReplayFrame(screenshot, j2, str));
    }

    public final void addFrame$sentry_android_replay_release(Bitmap bitmap, long j2, String str) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (getReplayCacheDir$sentry_android_replay_release() == null || bitmap.isRecycled()) {
            return;
        }
        File replayCacheDir$sentry_android_replay_release = getReplayCacheDir$sentry_android_replay_release();
        if (replayCacheDir$sentry_android_replay_release != null) {
            replayCacheDir$sentry_android_replay_release.mkdirs();
        }
        File file = new File(getReplayCacheDir$sentry_android_replay_release(), j2 + ".jpg");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FileOutputStream fileOutputStream2 = fileOutputStream;
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().getQuality().screenshotQuality, fileOutputStream2);
            fileOutputStream2.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            addFrame(file, j2, str);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.encoderLock) {
            SimpleVideoEncoder simpleVideoEncoder = this.encoder;
            if (simpleVideoEncoder != null) {
                simpleVideoEncoder.release();
            }
            this.encoder = null;
            Unit unit = Unit.INSTANCE;
        }
        this.isClosed.set(true);
    }

    public final GeneratedVideo createVideoOf(long j2, long j3, int i2, int i3, int i4, int i5, int i6, File videoFile) throws Throwable {
        int i7;
        long duration;
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        if (this.frames.isEmpty()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
            return null;
        }
        synchronized (this.encoderLock) {
            try {
                try {
                    SimpleVideoEncoder simpleVideoEncoder = new SimpleVideoEncoder(this.options, new MuxerConfig(videoFile, i4, i3, i5, i6, null, 32, null), null, 4, null);
                    simpleVideoEncoder.start();
                    this.encoder = simpleVideoEncoder;
                    long j4 = ((long) 1000) / ((long) i5);
                    ReplayFrame replayFrame = (ReplayFrame) CollectionsKt.first((List) this.frames);
                    long j5 = j3 + j2;
                    LongProgression longProgressionStep = RangesKt.step(RangesKt.until(j3, j5), j4);
                    long first = longProgressionStep.getFirst();
                    long last = longProgressionStep.getLast();
                    long step = longProgressionStep.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        i7 = 0;
                        while (true) {
                            Iterator<ReplayFrame> it = this.frames.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ReplayFrame next = it.next();
                                long j6 = first + j4;
                                long timestamp = next.getTimestamp();
                                if (first <= timestamp && timestamp <= j6) {
                                    replayFrame = next;
                                    break;
                                }
                                if (next.getTimestamp() > j6) {
                                    break;
                                }
                            }
                            if (encode(replayFrame)) {
                                i7++;
                            } else if (replayFrame != null) {
                                deleteFile(replayFrame.getScreenshot());
                                this.frames.remove(replayFrame);
                                replayFrame = null;
                            }
                            if (first == last) {
                                break;
                            }
                            first += step;
                        }
                    } else {
                        i7 = 0;
                    }
                    if (i7 == 0) {
                        this.options.getLogger().log(SentryLevel.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        deleteFile(videoFile);
                        return null;
                    }
                    synchronized (this.encoderLock) {
                        SimpleVideoEncoder simpleVideoEncoder2 = this.encoder;
                        if (simpleVideoEncoder2 != null) {
                            simpleVideoEncoder2.release();
                        }
                        SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                        duration = simpleVideoEncoder3 != null ? simpleVideoEncoder3.getDuration() : 0L;
                        this.encoder = null;
                        Unit unit = Unit.INSTANCE;
                    }
                    rotate(j5);
                    return new GeneratedVideo(videoFile, i7, duration);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final List<ReplayFrame> getFrames$sentry_android_replay_release() {
        return this.frames;
    }

    public final File getOngoingSegmentFile$sentry_android_replay_release() {
        return (File) this.ongoingSegmentFile$delegate.getValue();
    }

    public final File getReplayCacheDir$sentry_android_replay_release() {
        return (File) this.replayCacheDir$delegate.getValue();
    }

    public final synchronized void persistSegmentValues(String key, String str) {
        File ongoingSegmentFile$sentry_android_replay_release;
        File ongoingSegmentFile$sentry_android_replay_release2;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.isClosed.get()) {
            return;
        }
        File ongoingSegmentFile$sentry_android_replay_release3 = getOngoingSegmentFile$sentry_android_replay_release();
        if ((ongoingSegmentFile$sentry_android_replay_release3 == null || !ongoingSegmentFile$sentry_android_replay_release3.exists()) && (ongoingSegmentFile$sentry_android_replay_release = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
            ongoingSegmentFile$sentry_android_replay_release.createNewFile();
        }
        if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile$sentry_android_replay_release2 = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(ongoingSegmentFile$sentry_android_replay_release2), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                Sequence<String> sequenceLineSequence = TextStreamsKt.lineSequence(bufferedReader);
                LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                Iterator<String> it = sequenceLineSequence.iterator();
                while (it.hasNext()) {
                    List listSplit$default = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 2, 2, (Object) null);
                    Pair pair = TuplesKt.to((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                CloseableKt.closeFinally(bufferedReader, null);
            } finally {
            }
        }
        if (str == null) {
            this.ongoingSegment.remove(key);
        } else {
            this.ongoingSegment.put(key, str);
        }
        File ongoingSegmentFile$sentry_android_replay_release4 = getOngoingSegmentFile$sentry_android_replay_release();
        if (ongoingSegmentFile$sentry_android_replay_release4 != null) {
            Set<Map.Entry<String, String>> setEntrySet = this.ongoingSegment.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "ongoingSegment.entries");
            FilesKt.writeText$default(ongoingSegmentFile$sentry_android_replay_release4, CollectionsKt.joinToString$default(setEntrySet, "\n", null, null, 0, null, new Function1<Map.Entry<String, String>, CharSequence>() { // from class: io.sentry.android.replay.ReplayCache.persistSegmentValues.2
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(Map.Entry<String, String> entry) {
                    Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
                    return entry.getKey() + '=' + entry.getValue();
                }
            }, 30, null), null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String rotate(final long j2) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CollectionsKt.removeAll((List) this.frames, (Function1) new Function1<ReplayFrame, Boolean>() { // from class: io.sentry.android.replay.ReplayCache.rotate.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ReplayFrame it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getTimestamp() < j2) {
                    this.deleteFile(it.getScreenshot());
                    return true;
                }
                if (objectRef.element == null) {
                    objectRef.element = it.getScreen();
                }
                return false;
            }
        });
        return (String) objectRef.element;
    }
}
