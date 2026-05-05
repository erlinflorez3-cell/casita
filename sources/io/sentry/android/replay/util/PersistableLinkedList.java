package io.sentry.android.replay.util;

import io.sentry.ReplayRecording;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.rrweb.RRWebEvent;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<N\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{J$c$wCCU(\u0007*\tUOog|fbŏK\u000f\u0014\u0016\u0001j2I[ws܈?8RqO3{ok8! F\t.3:8(\u0007\u0011\u001e8K(v)G[\u0010 5XphX\u001dY\u0013!*\u000eN$\u0011 rf|?vtҺ>/1\r2P\\2w0+Y=Jb4%v\u0010\u001eqT\u007fI#3k\u00035^\fI\u0011N\nC\u0015j7'YI\"g|lH\u001a#<g\r\f\u0005l\\MWn\u001f?+}c\u0012d^<\u0006\u0002\u0014\u0015L\b\u001e\b=G\\6Hn^ԇ5ϢvSHАRjP\u0003\u0013ad\u001b{ı5ڢ=\u001bnϟ2G'SO{3\u0013tŃ\u0003ͼ%[\\ו1!)U\u0010Q_S\u0017׃Jݳ\u000eYEЧշtv"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\u001eKz,~D}-Eq$=I@Bk\u001b\"\u001ena8mg:]L", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>hd$@s\u0016-,CG{4s", "\u001ah^{f,Gb&\u0013Dk9\u000f\t,/l\u0015m@}v(Gx\u001d\u0012", ">q^=X9Mg\u0002z\u0003^", "", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", ">da@\\:MW\"\u0001Zq,z\u0019>o\r", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0005\u0015Jo\rL}%49\u0011 5}%8Z1;xE\"\u0013h7", "1`R5X\u0017K]*\u0003y^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bD\u000b`%Gx\u001dI\u000bn#Y\u0007/D\u0002\u007f9\\GEtBs{m]J\u0003-<]z.\u0011JX5Zb\u007fJ\u0014\u001biW<)\u0010\u0005XQ+nC\u00172\b*Y\u0011Eun\f#\u001f9hp\u0018=\u0016Q\t\u001cyJrmWa)zWJCq.n\u0015mf=JC\"#u#$3&qz", "/cS", "", "3kT:X5M", "/cS\u000e_3", "3kT:X5Ma", "", ">da@\\:M@\u0019|\u0005k+\u0001\u00121", "", "@d\\<i,", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PersistableLinkedList extends ConcurrentLinkedDeque<RRWebEvent> {
    private final Function0<ReplayCache> cacheProvider;
    private final SentryOptions options;
    private final ScheduledExecutorService persistingExecutor;
    private final String propertyName;

    public PersistableLinkedList(String propertyName, SentryOptions options, ScheduledExecutorService persistingExecutor, Function0<ReplayCache> cacheProvider) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(persistingExecutor, "persistingExecutor");
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        this.propertyName = propertyName;
        this.options = options;
        this.persistingExecutor = persistingExecutor;
        this.cacheProvider = cacheProvider;
    }

    private final void persistRecording() throws IOException {
        final ReplayCache replayCacheInvoke = this.cacheProvider.invoke();
        if (replayCacheInvoke == null) {
            return;
        }
        final ReplayRecording replayRecording = new ReplayRecording();
        replayRecording.setPayload(new ArrayList(this));
        if (this.options.getMainThreadChecker().isMainThread()) {
            this.persistingExecutor.submit(new Runnable() { // from class: io.sentry.android.replay.util.PersistableLinkedList$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    PersistableLinkedList.persistRecording$lambda$1(this.f$0, replayRecording, replayCacheInvoke);
                }
            });
            return;
        }
        StringWriter stringWriter = new StringWriter();
        this.options.getSerializer().serialize(replayRecording, new BufferedWriter(stringWriter));
        replayCacheInvoke.persistSegmentValues(this.propertyName, stringWriter.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistRecording$lambda$1(PersistableLinkedList this$0, ReplayRecording recording, ReplayCache cache) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recording, "$recording");
        Intrinsics.checkNotNullParameter(cache, "$cache");
        StringWriter stringWriter = new StringWriter();
        this$0.options.getSerializer().serialize(recording, new BufferedWriter(stringWriter));
        cache.persistSegmentValues(this$0.propertyName, stringWriter.toString());
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(RRWebEvent element) throws IOException {
        Intrinsics.checkNotNullParameter(element, "element");
        boolean zAdd = super.add(element);
        persistRecording();
        return zAdd;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean addAll(Collection<? extends RRWebEvent> elements) throws IOException {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean zAddAll = super.addAll(elements);
        persistRecording();
        return zAddAll;
    }

    public /* bridge */ boolean contains(RRWebEvent rRWebEvent) {
        return super.contains((Object) rRWebEvent);
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof RRWebEvent) {
            return contains((RRWebEvent) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque, java.util.Queue
    public RRWebEvent remove() throws IOException {
        RRWebEvent result = (RRWebEvent) super.remove();
        persistRecording();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public /* bridge */ boolean remove(RRWebEvent rRWebEvent) {
        return super.remove((Object) rRWebEvent);
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof RRWebEvent) {
            return remove((RRWebEvent) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }
}
