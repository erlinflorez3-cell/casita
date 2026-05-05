package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.IScope;
import io.sentry.ReplayRecording;
import io.sentry.ScopeCallback;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.GeneratedVideo;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebMetaEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
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
@Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H\u0002*, }\u000ffp<8D{H6RY+\u0017k\u00124,[*tK;k\u001a\u0006\"\u000fRVgunRҙ\u0013C\u001d\u000f\u001eюr,_U\u0001]\u0018\u0010:B\u0006?;Mu=A`\u0003B\r 8\"@y\u001b\u0001\"ݒP\u0010\rzKK\"\u00128@~AZ\rc\u0005\"\u0012\f>(\u00014\\oN<Ht]P/+\u0003oIT\u0006uܞ\u001b\u000b=F\u0003&Ev\u001f\\sbEQ-%\u0002 7Vi]\u001b? \\5x5GCU\u0004YFX.+%-_\r\f\u0010T}Ku)\u00125MgcyִTL@\t\n0T\u0004<#WL<Q2f63y\u0019;cNv\u001a^p\u001d+gD>=\u0002I*gC-e*{'wO{3*N+\u0007n/\u0006l\u0010v\u0014I\u007f({?}XcXP\u001aYk\u001c\u0014\u0002r\u0011X3ΥK\n5,!4\u001dVG]?)G\u001e\u0012JTg%\"\u000f\u0016רmRNsh\u0013^E8=$Zr\u00025o^\np,?\u0004bxO\u0004\u0016J8\\&YgIXT]!\u0002j{zPIw\u0015E\u0013\u0007k<tibAYic>\u0007\u0003|\u001a?J\u001d\u001dX\u0015I\u0004\u0012`\\6]JH\u0019\u0011(\u0004JN\u001a#JA\b\u001bb=w=%\u001bV?6Bo\u001aO\u0004+~\u001e~l3R\u0004@ˬ\u0001֊\u0005Ztrui\u0007LL~f&;F\"K',m\"\u0017;Sɤ\u0013ҋw\n_iROZu6w[\u0006.!jK_;U\u0015%}W?XζGʆviiO\u00185\t\fJ%IxFg6{GށlʧNYl\u0019(\tl\u0006C\nj\u0014\bv\u0017\u0013Uyl\rq=w\nY˂Hҡ<\u0007\u001d!$=\u000f\tB~;GQBޝ\u001a7"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b9", "", "1ta?X5M@\u0019\n\u0002Z@`\b", "\u001ah^{f,Gb&\u0013Di9\u0007\u00189c\n/E.\u0001 &T\u0004q;L", "5dc\u0010h9KS\"\u000eg^7\u0004\u0005CI~", "u(;6buLS\"\u000e\bru\b\u00169t\n&\u0006GJ\u0005\u0017P~\u001bPZ$\u000b", "Adc\u0010h9KS\"\u000eg^7\u0004\u0005CI~", "uKX<\":>\\(\f\u000f(7\n\u0013>o}2\u0003\nn\u0017 V|\" uzxJ", "1ta?X5MA\u0019\u0001\u0003^5\f", "", "5dc\u0010h9KS\"\u000eh^.\u0005\t8t", "u(8", "Adc\u0010h9KS\"\u000eh^.\u0005\t8t", "uH\u0018#", "@d_9T@\u001cO\u0017\u0002z=0\n", "\u001aiPCTuB]b_~e,R", "5dc\u001fX7EO-\\v\\/|g3r", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "@d_9T@-g$~", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yl(\u0007G|+vXo\u0017K5\u00125d\u0005\u001cK\\*9M\u0019", "5dc\u001fX7EO-m\u000fi,", "u(;6buLS\"\u000e\bruj\t8t\r<h@\f\u001e\u0013[O\u001f<\u007f4sF}+>i*\u001daN;A", "Adc\u001fX7EO-m\u000fi,", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0015{K\b\u0013+'\u0001\u000eE\u0006c\"Y\t'3\u0002\u0005BXC\u0011/%", "AdV:X5MB\u001d\u0007zl;x\u0011:", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "5dc X.FS\"\u000eib4|\u0017>a\b3", "u(;7T=:\u001d)\u000e~eu[\u0005>eU", "Adc X.FS\"\u000eib4|\u0017>a\b3", "uKY.i(\bc(\u0003\u0002(\u000bx\u0018/;C\u0019", "1`_Ah9>@\u0019\n\u0002Z@", "", "7rC2e4B\\\u0015\u000e~g.", "", "=mB2Z4>\\(lzg;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1n]CX9M", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "@dR<e+>`v\t\u0004_0~", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9{:\u0004%5b\f#A|\u0003.KMHj4+rrj:\u000be\u0002", "=mB0e,>\\v\u0002vg.|\b", "Aba2X5", "", "=mB0e,>\\'\u0002\u0005m\u0019|\u00079r~(z", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "As^?X", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4qP:X\u001bB[\u0019\r\nZ4\b", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=mC<h*A3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ">`d@X", "@dbB`,", "AsP?g", "AdV:X5M7\u0018", "@d_9T@\"R", "As^=", "\u0011n\\=T5B]\"", " d_9T@,S\u001b\u0007zg;", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface CaptureStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я~\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWNumvJ`\u000fK\u000f\u001c\u0016\u0001̓4Ic\u0005e܈\u00172P\u000eG3coEʠhtL\u0005(288\u0002\u0005\u0007\u001a2H&v\u0003CQ\u000e\u001a0VpBR\u0013M\r\u001a \u0006F \u0007\u001edgd6Plc:5ݑ\u0004\u007fĩ~'\u000e/=R\u0013Fù+\r\u0005afѯ?E9-%\u0002\b7ViE\u001b? D5l5/CI\"`f\\\u000e\u001e-+}\u0018\u000ev4h\u001dQ\u000f\u0019W/]qcP<7(~\n\u001dT\u0004<\u0015WL<>2f6\u001dcx\u0001eXP0mr\u0004\ttN\u0017S\u000fc/G/~Q\u0010=IRE\u0011\u001d\rL91t/rl\u0010v\u0014Il([?jXCXP\u001aYk\t2\u000b\u0013\f8 HM\u00101\f\u0011\\5ST\"9kܼj\u0010g\\g%\n\u0011na\njJV!\u001d7g.\u0017\u0012rD\u0013\f\u001cTbzD\u0011{\u001e\u0005\u000b\f++ \u000b\u0005l%34fO\u0017t\u001bQk\u0018=/\u0015F\nry\u001eo9\rBeUq!yR%#o@p\u001apfpi<`jM:4^i>\u001e,H\\\u001f+2m\u0001L8:X1\\CW3$PX\u0015\u000buY\u0017(/`A=\u001bq4v\u0019\u0001~w\u0007n\u0016\u0013y6\u000b|:3QSE\u0019TsP\u0006|61/\u0017s.p\u0018VUh\u0005\u001c\u0006W\f D8gn_A!9\u0017)`\u0004]YRrs|e 7|\ry=Yx0w\b\u0019\u001aB_\u0019v\u0016ܷЂ&vd s\u0014r\u0001\u0012at|\u001eύ'ߏ_>QͿSeJQP|3!tݕSȞ&|=Ԇϧ+K"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\nX~2CUR6e(", "", "u(E", "\u0010Q4\u000e7\n+C\u0001[tL\u001bXu\u001e_i\t\\.`\u0006", "", "\u001b@G,F\f ;xgiX\u000blu\u000bTc\u0012d", "0tX9W\u0019>^ z\u000f", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#g", "=oc6b5L", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yi3\u000bD\u000b %\u001d", "DhS2b", "\u001aiPCTuB]b_~e,R", "1ta?X5M@\u0019\n\u0002Z@`\b", "\u001ah^{f,Gb&\u0013Di9\u0007\u00189c\n/E.\u0001 &T\u0004q;L", "AdV:X5MB\u001d\u0007zl;x\u0011:", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "AdV:X5M7\u0018", "", "6dX4[;", "EhSA[", "4qP:X\nHc\"\u000e", "4qP:X\u0019:b\u0019", "DhS2b\u000bN`\u0015\u000e~h5", "@d_9T@-g$~", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yl(\u0007G|+vXo\u0017K5\u00125d\u0005\u001cK\\*9M\u0019", "Aba2X5\u001ab\u0007\u000evk;", "", "0qT.W*Kc!{\t", "", "\u001ah^{f,Gb&\u0013D;9|\u0005.c\r8\u0004=V", "3uT;g:", "\u001aiPCTuNb\u001d\u0006D=,\t\u0019/;", "\u001ah^{f,Gb&\u0013Dk9\u000f\t,/l\u0015m@}v(Gx\u001d\u0012", "1qT.g,,S\u001b\u0007zg;", "6tQ", "\u001ah^{f,Gb&\u0013DB\u000f\r\u0006\u0005", "2ta.g0H\\", "1ta?X5MA\u0019\u0001\u0003^5\fw3m\u007f6\u000b<\t\"", "@d_9T@\"R", "1`R5X", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9z<\u0002,1m[\u001c5p\u0016\u0004", "0hc\u001fT;>", "@nc.g,\u001ed\u0019\b\nl", "", "Cmc6_", "1`[9U(<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@nc.g,\u001ed\u0019\b\nlj\u000b\t8t\r<u<\n\u0016$Qs\r6\u0004%@`y41z\u00165M?Ik", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final long BREADCRUMB_START_OFFSET = 100;
        private static final long MAX_SEGMENT_DURATION = 300000;

        private Companion() {
        }

        private final ReplaySegment buildReplay(SentryOptions sentryOptions, File file, SentryId sentryId, final Date date, int i2, int i3, int i4, int i5, int i6, long j2, SentryReplayEvent.ReplayType replayType, String str, List<Breadcrumb> list, Deque<RRWebEvent> deque) {
            RRWebEvent rRWebEventConvert;
            Date dateTime = DateUtils.getDateTime(date.getTime() + j2);
            Intrinsics.checkNotNullExpressionValue(dateTime, "getDateTime(segmentTimestamp.time + videoDuration)");
            SentryReplayEvent sentryReplayEvent = new SentryReplayEvent();
            sentryReplayEvent.setEventId(sentryId);
            sentryReplayEvent.setReplayId(sentryId);
            sentryReplayEvent.setSegmentId(i2);
            sentryReplayEvent.setTimestamp(dateTime);
            sentryReplayEvent.setReplayStartTimestamp(date);
            sentryReplayEvent.setReplayType(replayType);
            sentryReplayEvent.setVideoFile(file);
            final ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            RRWebMetaEvent rRWebMetaEvent = new RRWebMetaEvent();
            rRWebMetaEvent.setTimestamp(date.getTime());
            rRWebMetaEvent.setHeight(i3);
            rRWebMetaEvent.setWidth(i4);
            arrayList2.add(rRWebMetaEvent);
            RRWebVideoEvent rRWebVideoEvent = new RRWebVideoEvent();
            rRWebVideoEvent.setTimestamp(date.getTime());
            rRWebVideoEvent.setSegmentId(i2);
            rRWebVideoEvent.setDurationMs(j2);
            rRWebVideoEvent.setFrameCount(i5);
            rRWebVideoEvent.setSize(file.length());
            rRWebVideoEvent.setFrameRate(i6);
            rRWebVideoEvent.setHeight(i3);
            rRWebVideoEvent.setWidth(i4);
            rRWebVideoEvent.setLeft(0);
            rRWebVideoEvent.setTop(0);
            arrayList2.add(rRWebVideoEvent);
            LinkedList linkedList = new LinkedList();
            for (Breadcrumb breadcrumb : list) {
                if (breadcrumb.getTimestamp().getTime() + 100 >= date.getTime() && breadcrumb.getTimestamp().getTime() < dateTime.getTime() && (rRWebEventConvert = sentryOptions.getReplayController().getBreadcrumbConverter().convert(breadcrumb)) != null) {
                    arrayList2.add(rRWebEventConvert);
                    Object obj = null;
                    RRWebBreadcrumbEvent rRWebBreadcrumbEvent = rRWebEventConvert instanceof RRWebBreadcrumbEvent ? (RRWebBreadcrumbEvent) rRWebEventConvert : null;
                    if (Intrinsics.areEqual(rRWebBreadcrumbEvent != null ? rRWebBreadcrumbEvent.getCategory() : null, NotificationCompat.CATEGORY_NAVIGATION)) {
                        RRWebBreadcrumbEvent rRWebBreadcrumbEvent2 = (RRWebBreadcrumbEvent) rRWebEventConvert;
                        Map<String, Object> data = rRWebBreadcrumbEvent2.getData();
                        if (data != null) {
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            Object obj2 = data.get(TypedValues.TransitionType.S_TO);
                            if (obj2 != null) {
                                obj = obj2;
                            }
                        }
                        if (obj instanceof String) {
                            Map<String, Object> data2 = rRWebBreadcrumbEvent2.getData();
                            Intrinsics.checkNotNull(data2);
                            Object obj3 = data2.get(TypedValues.TransitionType.S_TO);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            linkedList.add((String) obj3);
                        }
                    }
                }
            }
            if (str != null && !Intrinsics.areEqual(CollectionsKt.firstOrNull((List) linkedList), str)) {
                linkedList.addFirst(str);
            }
            rotateEvents$sentry_android_replay_release(deque, dateTime.getTime(), new Function1<RRWebEvent, Unit>() { // from class: io.sentry.android.replay.capture.CaptureStrategy$Companion$buildReplay$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RRWebEvent rRWebEvent) {
                    invoke2(rRWebEvent);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(RRWebEvent event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event.getTimestamp() >= date.getTime()) {
                        arrayList.add(event);
                    }
                }
            });
            if (i2 == 0) {
                arrayList2.add(new RRWebOptionsEvent(sentryOptions));
            }
            ReplayRecording replayRecording = new ReplayRecording();
            replayRecording.setSegmentId(Integer.valueOf(i2));
            replayRecording.setPayload(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: io.sentry.android.replay.capture.CaptureStrategy$Companion$buildReplay$lambda$7$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return ComparisonsKt.compareValues(Long.valueOf(((RRWebEvent) t2).getTimestamp()), Long.valueOf(((RRWebEvent) t3).getTimestamp()));
                }
            }));
            sentryReplayEvent.setUrls(linkedList);
            return new ReplaySegment.Created(sentryReplayEvent, replayRecording);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
        public static final void createSegment$lambda$0(Ref.ObjectRef crumbs, IScope scope) {
            Intrinsics.checkNotNullParameter(crumbs, "$crumbs");
            Intrinsics.checkNotNullParameter(scope, "scope");
            crumbs.element = new ArrayList(scope.getBreadcrumbs());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void rotateEvents$sentry_android_replay_release$default(Companion companion, Deque deque, long j2, Function1 function1, int i2, Object obj) {
            if ((i2 + 4) - (i2 | 4) != 0) {
                function1 = null;
            }
            companion.rotateEvents$sentry_android_replay_release(deque, j2, function1);
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [T, java.util.List] */
        public final ReplaySegment createSegment(IHub iHub, SentryOptions options, long j2, Date currentSegmentTimestamp, SentryId replayId, int i2, int i3, int i4, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, int i5, int i6, String str, List<Breadcrumb> list, Deque<RRWebEvent> events) {
            GeneratedVideo generatedVideoCreateVideoOf$default;
            List<Breadcrumb> list2 = list;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            if (replayCache == null || (generatedVideoCreateVideoOf$default = ReplayCache.createVideoOf$default(replayCache, Math.min(j2, 300000L), currentSegmentTimestamp.getTime(), i2, i3, i4, i5, i6, null, 128, null)) == null) {
                return ReplaySegment.Failed.INSTANCE;
            }
            File fileComponent1 = generatedVideoCreateVideoOf$default.component1();
            int iComponent2 = generatedVideoCreateVideoOf$default.component2();
            long jComponent3 = generatedVideoCreateVideoOf$default.component3();
            if (list2 == null) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = CollectionsKt.emptyList();
                if (iHub != null) {
                    iHub.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.capture.CaptureStrategy$Companion$$ExternalSyntheticLambda0
                        @Override // io.sentry.ScopeCallback
                        public final void run(IScope iScope) {
                            CaptureStrategy.Companion.createSegment$lambda$0(objectRef, iScope);
                        }
                    });
                }
                list2 = (List) objectRef.element;
            }
            return buildReplay(options, fileComponent1, replayId, currentSegmentTimestamp, i2, i3, i4, iComponent2, i5, jComponent3, replayType, str, list2, events);
        }

        public final void rotateEvents$sentry_android_replay_release(Deque<RRWebEvent> events, long j2, Function1<? super RRWebEvent, Unit> function1) {
            Intrinsics.checkNotNullParameter(events, "events");
            Iterator<RRWebEvent> it = events.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "events.iterator()");
            while (it.hasNext()) {
                RRWebEvent event = it.next();
                if (event.getTimestamp() < j2) {
                    if (function1 != null) {
                        Intrinsics.checkNotNullExpressionValue(event, "event");
                        function1.invoke(event);
                    }
                    it.remove();
                }
            }
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static void onScreenChanged(CaptureStrategy captureStrategy, String str) {
        }

        public static /* synthetic */ void onScreenshotRecorded$default(CaptureStrategy captureStrategy, Bitmap bitmap, Function2 function2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScreenshotRecorded");
            }
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                bitmap = null;
            }
            captureStrategy.onScreenshotRecorded(bitmap, function2);
        }

        public static /* synthetic */ void start$default(CaptureStrategy captureStrategy, ScreenshotRecorderConfig screenshotRecorderConfig, int i2, SentryId sentryId, SentryReplayEvent.ReplayType replayType, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                i2 = 0;
            }
            if ((i3 + 4) - (4 | i3) != 0) {
                sentryId = new SentryId();
            }
            if ((i3 + 8) - (i3 | 8) != 0) {
                replayType = null;
            }
            captureStrategy.start(screenshotRecorderConfig, i2, sentryId, replayType);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ}<|ʑi0rd\u0001.SUj\u0014q}Č([2qٔ:U\u001d\u0002͆\rT"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#g", "", "u(E", "\u0011qT.g,=", "\u0014`X9X+", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#P8\u001bN'\u001c\u0005X\u0017", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#P;\nR2\r\u0004/", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class ReplaySegment {
        public static final int $stable = 0;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000bnjG0L͜P.hS2şs{J$c$wECU(\u0007*ޛWNu˧vϺb\u000bQ\u0015\u000e\u0016~k4Ic\u0005e܈\u0015˸H\u0006ЀcM\u001e<ys\u0005:\u0013 J\"fz\u0015\u0005(,`\u0010%}ŲO\f 4\t\tH[%M3$B\fL+\u0019 rf|Bxrc:=0\u001bip\\of>\fe\rtUm̠w*%9PO5C(\u001aϏ\b\u001bvM\u0014Wqkݛ\u0019--+Wso6\u0007\u0001D\u001b1O\u001b_\u000b&\u000b\b\u0018ԧ\u000bo<]ucP<;(\u0001\n!T\u0006$\u0005U]tǽ\u001b/\u000f\u001cI\rr\u0002W\u0017ٳ]\u000b\f\tyN\u0017S\nc/G4~Q\u0010RaUE\u0016\u001d\rL>Gΰ ,c\u001cb-\u001b\u0003zΦ5WH׀`P\u0010^KsT\u007fp\u0002B\u0004^HĬ3\u0002\u0019ф/'=bG+ݒo\u001e"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#P8\u001bN'\u001c\u0005X\u0017", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#g", "@d_9T@", "\u001ah^{f,Gb&\u0013DL,\u0006\u0018<yl(\u0007G|+vXo\u0017KL", "@dR<e+B\\\u001b", "\u001ah^{f,Gb&\u0013DK,\b\u0010+yl(yJ\u000e\u0016\u001bPqc", "uKX<\":>\\(\f\u000f(\u001a|\u0012>r\u0014\u0015{K\b\u0013+'\u0001\u000eE\u0006z\u001c]\biEm\u001f=ZW\u0005X4)\u001cdu&\u0007a6[u+PN$oM", "5dc\u001fX*H`\u0018\u0003\u0004`", "u(;6buLS\"\u000e\brui\t:l{<h@~!$Fs\u0017>L", "5dc\u001fX7EO-", "u(;6buLS\"\u000e\bruj\t8t\r<h@\f\u001e\u0013[O\u001f<\u007f4\u000b", "1`_Ah9>", "", "6tQ", "\u001ah^{f,Gb&\u0013DB\u000f\r\u0006\u0005", "6h]A", "\u001ah^{f,Gb&\u0013DA0\u0006\u0018\u0005", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "Adc X.FS\"\u000e^]", "AdV:X5M7\u0018", "BnBAe0GU", "", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Created extends ReplaySegment {
            public static final int $stable = 8;
            private final ReplayRecording recording;
            private final SentryReplayEvent replay;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Created(SentryReplayEvent replay, ReplayRecording recording) {
                super(null);
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.replay = replay;
                this.recording = recording;
            }

            public static /* synthetic */ void capture$default(Created created, IHub iHub, Hint hint, int i2, Object obj) {
                if ((i2 + 2) - (i2 | 2) != 0) {
                    hint = new Hint();
                }
                created.capture(iHub, hint);
            }

            public static /* synthetic */ Created copy$default(Created created, SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, int i2, Object obj) {
                if ((i2 + 1) - (1 | i2) != 0) {
                    sentryReplayEvent = created.replay;
                }
                if ((i2 + 2) - (i2 | 2) != 0) {
                    replayRecording = created.recording;
                }
                return created.copy(sentryReplayEvent, replayRecording);
            }

            public final void capture(IHub iHub, Hint hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (iHub != null) {
                    SentryReplayEvent sentryReplayEvent = this.replay;
                    hint.setReplayRecording(this.recording);
                    Unit unit = Unit.INSTANCE;
                    iHub.captureReplay(sentryReplayEvent, hint);
                }
            }

            public final SentryReplayEvent component1() {
                return this.replay;
            }

            public final ReplayRecording component2() {
                return this.recording;
            }

            public final Created copy(SentryReplayEvent replay, ReplayRecording recording) {
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                return new Created(replay, recording);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Created)) {
                    return false;
                }
                Created created = (Created) obj;
                return Intrinsics.areEqual(this.replay, created.replay) && Intrinsics.areEqual(this.recording, created.recording);
            }

            public final ReplayRecording getRecording() {
                return this.recording;
            }

            public final SentryReplayEvent getReplay() {
                return this.replay;
            }

            public int hashCode() {
                return (this.replay.hashCode() * 31) + this.recording.hashCode();
            }

            public final void setSegmentId(int i2) {
                this.replay.setSegmentId(i2);
                List<? extends RRWebEvent> payload = this.recording.getPayload();
                if (payload != null) {
                    for (RRWebEvent rRWebEvent : payload) {
                        if (rRWebEvent instanceof RRWebVideoEvent) {
                            ((RRWebVideoEvent) rRWebEvent).setSegmentId(i2);
                        }
                    }
                }
            }

            public String toString() {
                return "Created(replay=" + this.replay + ", recording=" + this.recording + ')';
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Gڒ0!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#P;\nR2\r\u0004/", "\u001ah^{f,Gb&\u0013DZ5{\u00169i~q\t@\f\u001e\u0013[9\f8\u00024Ef}i\u0015i!=]P;YC+\u0011wa;\u001b\"\u0019N\u0002.C`<,^ZrF#g", "u(E", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Failed extends ReplaySegment {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        private ReplaySegment() {
        }

        public /* synthetic */ ReplaySegment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    void captureReplay(boolean z2, Function1<? super Date, Unit> function1);

    CaptureStrategy convert();

    SentryId getCurrentReplayId();

    int getCurrentSegment();

    File getReplayCacheDir();

    SentryReplayEvent.ReplayType getReplayType();

    Date getSegmentTimestamp();

    void onConfigurationChanged(ScreenshotRecorderConfig screenshotRecorderConfig);

    void onScreenChanged(String str);

    void onScreenshotRecorded(Bitmap bitmap, Function2<? super ReplayCache, ? super Long, Unit> function2);

    void onTouchEvent(MotionEvent motionEvent);

    void pause();

    void resume();

    void setCurrentReplayId(SentryId sentryId);

    void setCurrentSegment(int i2);

    void setReplayType(SentryReplayEvent.ReplayType replayType);

    void setSegmentTimestamp(Date date);

    void start(ScreenshotRecorderConfig screenshotRecorderConfig, int i2, SentryId sentryId, SentryReplayEvent.ReplayType replayType);

    void stop();
}
