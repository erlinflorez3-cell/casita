package io.sentry.android.replay;

import io.sentry.SentryReplayEvent;
import io.sentry.rrweb.RRWebEvent;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV4Zݷ2\u000fy\u0003<řc$\bCC٥\"}0\u0015WȞog|hb\u000bY\u000f\u000e\u0016~\u00044Ic\u0002e\u0012\u00154HĤEIݹ =g_5\u0002\u0015$@\"Py3\u0002*.V\u0012\u000fzqN\u001c\u0016>D\t:\u0001\u0012]\t(\u0018\u001e>N\b.`uVNH\u001bfJ31\r\u0002B|2o6\u000bY%Hj&;\u0004q(9NO;%'c\u00035b\nNƄCqK\u00161.5Mas\u00067\u001fģ\u0015]2]0urT_KŰaT.9s{K~\u0013nĂ{D\u0014J)&\u0006UOtǭ\u001b/\u000f\u001cY\rr\u0002I\u0017٣_\u000b\u0007\t\tN\u0017S\u000byۆ:co_\nS\u001bd6*\u0012S͛$I{/\u0005l\u0014p\u0017+T&a_`\u0007؇I\u0017igg\u0006\u0004\u001fç20\n0U\u007fG{?/G+=[G%9k0Ktm|\u0005nlki\u0001Mp(t\u0016E0!\f\tK\u0015\u000bqPb`D\u0011{%\u0005\r\u0004\b!*twj,U\u0018TOvu\u0003Os\tS<\u0017C_ny\u001co?n5EQ\u0012 \u0010a=ݤ>\u0005s\u0013\u0004~B\u00028\u000bb6OJJ\u0001\u000f&z\u000bß\r[9M 44Z8_ù\u0014\u0011\n,qY|7l!ԧ\u000fOcA&\u001biRw֊\u0005Vdʙ\bi~[:\u001011;Ii5G/Ɓ&n<ê;\t\u0005\b\u000e\\8aUZ\u0005\u001c\u0006W\f D*g`ȠA\u0019\u0017ȯA4\bCScCt_S*')\u0004ɍ\u0013Ap֫\u007f\np\t:y;Y]T/\"%_ѓ'\u000elр\u0012cL\u0015U~%\u001aiHar1d\u0084R>\u0005þ7 +\u001d}?MF;O?\u001f,vB<ֵecq۰F{h-4\u00146\u0013:g.o\u0011VЄ6A@Ծq\u0001DB2\u000eĀFx"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9t8\u00054#Y\u007f(7v%\rIR7A", "", "@dR<e+>`v\t\u0004_0~", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "1`R5X", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "Bh\\2f;:[$", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "7c", "", "2ta.g0H\\", "", "@d_9T@-g$~", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yl(\u0007G|+vXo\u0017K5\u00125d\u0005\u001cK\\*9M\u0019", "Aba2X5\u001ab\u0007\u000evk;", "", "3uT;g:", "", "\u001ah^{f,Gb&\u0013Dk9\u000f\t,/l\u0015m@}v(Gx\u001d\u0012", "uKX<\":>\\(\f\u000f((\u0006\b<o\u0004'EM\u0001\"\u001eC\u0004W*t25Y\u0007.:w%\u001bMAEx3\u001e\"FkB\bg.$]+Q\u0016\\,ea\u007fQ]\u000ec\r[5\u0011\u0004#N$yK33Q\u0019I\rBd\u0015i\u0012\f8jF)[\fXu^\u0006P-o\u00108[\tG\u0017)G\u0011h\u0016)+\\CI1(;\u0007\u001bq_;\u001ehS\u001cyN\u000eGxG\"\nv\u0011>xbBY^iGt|\u0006Pw\t\u000e{_p4vvqC7:m\u0007!N\u001d:ot^<kE.o\u001d@!N!'f", "5dc\u0010T*AS", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006c%@`y4\u0015i\u00141M\u0019", "5dc\u0011h9:b\u001d\t\u0004", "u(9", "5dc\u0012i,Gb'", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0016W", "u(8", "5dc\u001fX*H`\u0018~\b<6\u0006\n3g", "u(;6buLS\"\u000e\brux\u0012.r\n,z\n\u000e\u0017\"Nk\"\u0006d#BY})Ep =:C9uA\u001d\u0015u?C\u0010d0PL", "5dc\u001fX7EO-m\u000fi,", "u(;6buLS\"\u000e\bruj\t8t\r<h@\f\u001e\u0013[O\u001f<\u007f4sF}+>i*\u001daN;A", "5dc V9>S\"Z\nL;x\u0016>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!\\4>a(z\u0003i", "u(;7T=:\u001d)\u000e~eu[\u0005>eU", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LastSegmentData {
    private final ReplayCache cache;
    private final long duration;
    private final List<RRWebEvent> events;
    private final int id;
    private final ScreenshotRecorderConfig recorderConfig;
    private final SentryReplayEvent.ReplayType replayType;
    private final String screenAtStart;
    private final Date timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public LastSegmentData(ScreenshotRecorderConfig recorderConfig, ReplayCache cache, Date timestamp, int i2, long j2, SentryReplayEvent.ReplayType replayType, String str, List<? extends RRWebEvent> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.recorderConfig = recorderConfig;
        this.cache = cache;
        this.timestamp = timestamp;
        this.id = i2;
        this.duration = j2;
        this.replayType = replayType;
        this.screenAtStart = str;
        this.events = events;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastSegmentData copy$default(LastSegmentData lastSegmentData, ScreenshotRecorderConfig screenshotRecorderConfig, ReplayCache replayCache, Date date, int i2, long j2, SentryReplayEvent.ReplayType replayType, String str, List list, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            screenshotRecorderConfig = lastSegmentData.recorderConfig;
        }
        if ((2 & i3) != 0) {
            replayCache = lastSegmentData.cache;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            date = lastSegmentData.timestamp;
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            i2 = lastSegmentData.id;
        }
        if ((i3 + 16) - (16 | i3) != 0) {
            j2 = lastSegmentData.duration;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            replayType = lastSegmentData.replayType;
        }
        if ((i3 + 64) - (64 | i3) != 0) {
            str = lastSegmentData.screenAtStart;
        }
        if ((i3 & 128) != 0) {
            list = lastSegmentData.events;
        }
        return lastSegmentData.copy(screenshotRecorderConfig, replayCache, date, i2, j2, replayType, str, list);
    }

    public final ScreenshotRecorderConfig component1() {
        return this.recorderConfig;
    }

    public final ReplayCache component2() {
        return this.cache;
    }

    public final Date component3() {
        return this.timestamp;
    }

    public final int component4() {
        return this.id;
    }

    public final long component5() {
        return this.duration;
    }

    public final SentryReplayEvent.ReplayType component6() {
        return this.replayType;
    }

    public final String component7() {
        return this.screenAtStart;
    }

    public final List<RRWebEvent> component8() {
        return this.events;
    }

    public final LastSegmentData copy(ScreenshotRecorderConfig recorderConfig, ReplayCache cache, Date timestamp, int i2, long j2, SentryReplayEvent.ReplayType replayType, String str, List<? extends RRWebEvent> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return new LastSegmentData(recorderConfig, cache, timestamp, i2, j2, replayType, str, events);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastSegmentData)) {
            return false;
        }
        LastSegmentData lastSegmentData = (LastSegmentData) obj;
        return Intrinsics.areEqual(this.recorderConfig, lastSegmentData.recorderConfig) && Intrinsics.areEqual(this.cache, lastSegmentData.cache) && Intrinsics.areEqual(this.timestamp, lastSegmentData.timestamp) && this.id == lastSegmentData.id && this.duration == lastSegmentData.duration && this.replayType == lastSegmentData.replayType && Intrinsics.areEqual(this.screenAtStart, lastSegmentData.screenAtStart) && Intrinsics.areEqual(this.events, lastSegmentData.events);
    }

    public final ReplayCache getCache() {
        return this.cache;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final List<RRWebEvent> getEvents() {
        return this.events;
    }

    public final int getId() {
        return this.id;
    }

    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    public final SentryReplayEvent.ReplayType getReplayType() {
        return this.replayType;
    }

    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.recorderConfig.hashCode() * 31) + this.cache.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Long.hashCode(this.duration)) * 31) + this.replayType.hashCode()) * 31;
        String str = this.screenAtStart;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.events.hashCode();
    }

    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.recorderConfig + ", cache=" + this.cache + ", timestamp=" + this.timestamp + ", id=" + this.id + ", duration=" + this.duration + ", replayType=" + this.replayType + ", screenAtStart=" + this.screenAtStart + ", events=" + this.events + ')';
    }
}
