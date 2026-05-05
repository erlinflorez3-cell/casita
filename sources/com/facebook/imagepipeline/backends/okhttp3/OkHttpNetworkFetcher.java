package com.facebook.imagepipeline.backends.okhttp3;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.callback.OkCallback;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.BaseNetworkFetcher;
import com.facebook.imagepipeline.producers.BaseProducerContextCallbacks;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.FetchState;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.ProducerContext;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"Яz\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<$a$yCQU\"}(\tWN}gvJp\u000bKƤ\u000e\u0016\u000fj4կ]xk\u0012\u00172HoG3coE9ft>\u000562*\u0600\u0002\u0005\u000f<2H\u001e\u0003\u0003ŏS\f 6Hp@R\u0015M\u001b\u001a\u001aßF \u0017\u001edgT8N\u0001sŽMI3oRP7_^|{\f~TM47n$?P;C\u0016=S1\tқ_?\u0011B2\\\u000bm7+9M\fWd]\u0010\u0018#1g\r\fy6b\u000bQn\u0014?+}lׂT\u000e6\u0002C\u0018\u001bI\u001c\u000e4'x8;(~\u000e\u001e5\u0005r\u0002P~\u0011\u000fF\u000e\fy6E7FGsO)yiai-~;\n\u001a%\u001eQ\u0001\u001f%ij&`C2\u001b\f\u001aO_XUH|\u001e\nA{\u0019\tb0*44U\u0016G{?EG)EtQ#O\u0006HZ\r\f\u0005 xvckbHn?~\u0018G*7)pC\u0013!\u001cTbmD\u0011{\u001c\u0005\u000b\f&+ \u000b\u0017\u00035m.\\o\u0001i\u0019a\u000e\u000e3P~7\b\u0011\u001c\u0012e\\v3cu\u0014\u0014oh\u000f\u0014mS)\u0005!|Px$Z\u000b<R6V\u007f(w*D~\u0010!PWqJSrEij#S\u001b X@+\u00156ʶjʐ\u0003T;ɴSu2x!\u0001~aGהi֑M,\u0005ʠr9OWM\u0019T\\x־6č'\u0007\u0007͞ûK\u0010"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s!3_})6{_8SFJz?k^Rg\u001c\u0016r77v6YV[2=R\u0002;\u0017\u0012gc", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w*?Ik\u001d\u001e$zkF\rD,]t*GY$", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s!3_})6{_8SFJz?k^Rg\u001c\u0016r77v6YV[2=R\u0002;\u0017\u0012gL81o\u0014hL\rnSI)\u00152*\u0002Jf\u0004y%\nDjF", "=j7Ag7\u001cZ\u001d~\u0004m", "\u001anZ5g;I!bh\u0001A;\f\u0014\rl\u0004(\u0005OV", "uK^8[;M^fHdd\u000f\f\u0018:C\u0007,{I\u0010lZ8", "1`[99(<b#\f\u000f", "\u001anZ5g;I!b\\ve3;i+c\u000f2\tTV", "1`]0X3EO(\u0003\u0005g\f\u0010\t-u\u000f2\t", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "2hb.U3>=\u001fa\nm7Z\u0005-h\u007f", "", "uK^8[;M^fHXZ3\u0004G\u0010a}7\u0006M\u0015l}Lk\u001f8@5D]\u0005i5w\u001f,]PHk=-^Ht9\u0005s;X\u0004|<\u0010?", "1`R5X\nH\\(\f\u0005e", "\u001anZ5g;I!b\\v\\/|f9n\u000f5\u0006GV", "1qT.g,\u001fS(|}L;x\u0018/", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "4dc0[", "", "4dc0[\u001aMO(~", "1`[9U(<Y", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w6CJ}>+\u001bIaH\u0005f,[5\u0005CSU)XPx\u0013", "4dc0[\u001eBb\u001ckzj<|\u0017>", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "5dc\u0012k;KO\u0001z\u0006", "", "", "0xc2F0SS", "", "6`]1_,\u001ef\u0017~\u0006m0\u0007\u0012", "1`[9", "\u001anZ5g;I!b\\ve3R", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "=m52g*A1#\u0007\u0006e,\f\r9n", "\u0011n\\=T5B]\"", "\u001dj7Ag7'S(\u0011\u0005k2]\t>c\u0003\u0016\u000b<\u0010\u0017", "7lP4X7B^\u0019\u0006~g,D\u00135h\u000f7\u0007\u000ez$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class OkHttpNetworkFetcher extends BaseNetworkFetcher<OkHttpNetworkFetchState> {
    private static final Companion Companion = new Companion(null);
    private static final String FETCH_TIME = "fetch_time";
    private static final String IMAGE_SIZE = "image_size";
    private static final String QUEUE_TIME = "queue_time";
    private static final String TOTAL_TIME = "total_time";
    private final CacheControl cacheControl;
    private final Call.Factory callFactory;
    private final Executor cancellationExecutor;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005$2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏MŲO\f\u001aؓϴt@"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s!3_})6{_8SFJz?k^Rg\u001c\u0016r77v6YV[2=R\u0002;\u0017\u0012gL,5\u0015\u0010UJ(xM\r", "", "u(E", "\u0014DC\u0010;&-7\u0001^", "", "\u0017L0\u00148&,7\u000e^", "\u001fT4\"8&-7\u0001^", "\"NC\u000e?&-7\u0001^", "7lP4X7B^\u0019\u0006~g,D\u00135h\u000f7\u0007\u000ez$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0LeV5ZS0\u0010\u0002ڔd$\n#2\\K_(}:\u000f_Pwg\u001dL\t\fS\u0013\u0014\u0019\u0011jZMǤ|] \u0014\u0003R}EKM\u001eDod3:[ڛ>ŕ<y\rЏj:V\u0018\u000fzqRB\u0016nDGõ^ҫQ\u0005\"ŇVN.\n6\\\u0016UlL+a\u0011Ǌ/ɨmBVϋۨ4\u0007"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006s!3_})6{_8SFJz?k^Rg\u001c\u0016r77v6YV[2=R\u0002;\u0017\u0012gL81o\u0014hL\rnSI)\u00152*\u0002Jf\u0004y%\nDjF", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w.CJi7\f$dp9\\", "1n]@h4>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+MDyD&\u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", ">q^1h*>`v\t\u0004m,\u0010\u0018", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u?C\u0010r,a\u0006|", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017!EtB.\u001dhn\u000fma6V@(CJN)f\\x\u0007\u0018\u001aV\u0010N6\u0011\u0010YH(wD\u0001*\u00156H\u00129h\u000e\u001a_xBtoRT\u0010TW\u001f~P){U/#j", "4dc0[\nH[$\u0006zm,k\r7e", "", "@db=b5LS\b\u0003\u0003^", "AtQ:\\;-W!~", "7lP4X7B^\u0019\u0006~g,D\u00135h\u000f7\u0007\u000ez$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class OkHttpNetworkFetchState extends FetchState {
        public long fetchCompleteTime;
        public long responseTime;
        public long submitTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OkHttpNetworkFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
            super(consumer, producerContext);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$fetchWithRequest$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0013\u001d̉=!4i\bӵLc\u0003\u0004IيX\nǞH\u00078ܥBw5e3?>D}H\\S\u001a>ƈo}"}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\u0001\u0011+g\u007f3\u007fK\u0001\u001e\u001bPoW9r#;Y\u0007\u001fE7 4PRJv\u0002g~nDH\u0016n\u0015N\u00069QYT\r\\ap@\u0014\u001f\u0019\u000fN:\u000b\bKE3q17+\u0018,W\u0011y4", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w*?Ik\u001f+\u001fgq7\u0007p\nX\u007f6G_]\nXYy:\u0010\u0010`\u001c$", "=m2.a*>Z z\nb6\u0006u/q\u0010(\nO\u0001\u0016", "", "7lP4X7B^\u0019\u0006~g,D\u00135h\u000f7\u0007\u000ez$\u0017No\nJv"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends BaseProducerContextCallbacks {
        final /* synthetic */ Call $call;
        final /* synthetic */ OkHttpNetworkFetcher this$0;

        AnonymousClass1(Call call, OkHttpNetworkFetcher okHttpNetworkFetcher) {
            this.$call = call;
            this.this$0 = okHttpNetworkFetcher;
        }

        @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
        public void onCancellationRequested() throws Throwable {
            Looper looperMyLooper = Looper.myLooper();
            short sXd = (short) (C1607wl.Xd() ^ 12804);
            short sXd2 = (short) (C1607wl.Xd() ^ 7327);
            int[] iArr = new int["\u001dv\u0003\u0006\u0002\u0016\r\\[Oh!M6 T\u0014".length()];
            QB qb = new QB("\u001dv\u0003\u0006\u0002\u0016\r\\[Oh!M6 T\u0014");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Ig.wd("\u00039tk\u0006`W[3\u0016\u0017k)", (short) (C1580rY.Xd() ^ (-21509))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                if (!Intrinsics.areEqual(looperMyLooper, (Looper) declaredMethod.invoke(null, objArr))) {
                    this.$call.cancel();
                    return;
                }
                Executor executor = this.this$0.cancellationExecutor;
                final Call call = this.$call;
                executor.execute(new Runnable() { // from class: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$fetchWithRequest$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        call.cancel();
                    }
                });
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OkHttpNetworkFetcher(Call.Factory callFactory, Executor cancellationExecutor) {
        this(callFactory, cancellationExecutor, false, 4, null);
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
    }

    public OkHttpNetworkFetcher(Call.Factory callFactory, Executor cancellationExecutor, boolean z2) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
        this.callFactory = callFactory;
        this.cancellationExecutor = cancellationExecutor;
        this.cacheControl = z2 ? new CacheControl.Builder().noStore().build() : null;
    }

    public /* synthetic */ OkHttpNetworkFetcher(Call.Factory factory, Executor executor, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(factory, executor, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? true : z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OkHttpNetworkFetcher(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        ExecutorService executorService = okHttpClient.dispatcher().executorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "okHttpClient.dispatcher().executorService()");
        this(okHttpClient, executorService, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleException(Call call, Exception exc, NetworkFetcher.Callback callback) {
        if (call.isCanceled()) {
            callback.onCancellation();
        } else {
            callback.onFailure(exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public OkHttpNetworkFetchState createFetchState(Consumer<EncodedImage> consumer, ProducerContext context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        return new OkHttpNetworkFetchState(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ FetchState createFetchState(Consumer consumer, ProducerContext producerContext) {
        return createFetchState((Consumer<EncodedImage>) consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(OkHttpNetworkFetchState fetchState, NetworkFetcher.Callback callback) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.submitTime = SystemClock.elapsedRealtime();
        Uri uri = fetchState.getUri();
        Intrinsics.checkNotNullExpressionValue(uri, "fetchState.uri");
        try {
            Request.Builder requestBuilder = new Request.Builder().url(uri.toString()).get();
            CacheControl cacheControl = this.cacheControl;
            if (cacheControl != null) {
                Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
                requestBuilder.cacheControl(cacheControl);
            }
            BytesRange bytesRange = fetchState.getContext().getImageRequest().getBytesRange();
            if (bytesRange != null) {
                requestBuilder.addHeader("Range", bytesRange.toHttpRangeHeaderValue());
            }
            Request requestBuild = requestBuilder.build();
            Intrinsics.checkNotNullExpressionValue(requestBuild, "requestBuilder.build()");
            fetchWithRequest(fetchState, callback, requestBuild);
        } catch (Exception e2) {
            callback.onFailure(e2);
        }
    }

    protected void fetchWithRequest(final OkHttpNetworkFetchState fetchState, final NetworkFetcher.Callback callback, Request request) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(request, "request");
        Call callNewCall = this.callFactory.newCall(request);
        fetchState.getContext().addCallbacks(new AnonymousClass1(callNewCall, this));
        OkCallback.enqueue(callNewCall, new Callback() { // from class: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher.fetchWithRequest.2
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e2) {
                OkCallback.onFailure_enter(call, e2);
                try {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e2, "e");
                    this.handleException(call, e2, callback);
                } finally {
                    OkCallback.onFailure_exit();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                OkCallback.onResponse_enter(call, response);
                try {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    fetchState.responseTime = SystemClock.elapsedRealtime();
                    ResponseBody responseBodyBody = response.body();
                    Unit unit = null;
                    if (responseBodyBody != null) {
                        ResponseBody responseBody = responseBodyBody;
                        OkHttpNetworkFetcher okHttpNetworkFetcher = this;
                        NetworkFetcher.Callback callback2 = callback;
                        OkHttpNetworkFetchState okHttpNetworkFetchState = fetchState;
                        try {
                            ResponseBody responseBody2 = responseBody;
                            try {
                                if (response.isSuccessful()) {
                                    BytesRange bytesRangeFromContentRangeHeader = BytesRange.Companion.fromContentRangeHeader(response.header("Content-Range"));
                                    if (bytesRangeFromContentRangeHeader != null && (bytesRangeFromContentRangeHeader.from != 0 || bytesRangeFromContentRangeHeader.to != Integer.MAX_VALUE)) {
                                        okHttpNetworkFetchState.setResponseBytesRange(bytesRangeFromContentRangeHeader);
                                        okHttpNetworkFetchState.setOnNewResultStatusFlags(8);
                                    }
                                    callback2.onResponse(responseBody2.byteStream(), responseBody2.contentLength() < 0 ? 0 : (int) responseBody2.contentLength());
                                } else {
                                    okHttpNetworkFetcher.handleException(call, new IOException("Unexpected HTTP code " + response), callback2);
                                }
                            } catch (Exception e2) {
                                okHttpNetworkFetcher.handleException(call, e2, callback2);
                            }
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(responseBody, null);
                            unit = Unit.INSTANCE;
                        } finally {
                        }
                    }
                    if (unit == null) {
                        this.handleException(call, new IOException("Response body null: " + response), callback);
                    }
                } finally {
                    OkCallback.onResponse_exit();
                }
            }
        });
    }

    @Override // com.facebook.imagepipeline.producers.BaseNetworkFetcher, com.facebook.imagepipeline.producers.NetworkFetcher
    public Map<String, String> getExtraMap(OkHttpNetworkFetchState fetchState, int i2) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        return MapsKt.mapOf(TuplesKt.to(QUEUE_TIME, String.valueOf(fetchState.responseTime - fetchState.submitTime)), TuplesKt.to(FETCH_TIME, String.valueOf(fetchState.fetchCompleteTime - fetchState.responseTime)), TuplesKt.to(TOTAL_TIME, String.valueOf(fetchState.fetchCompleteTime - fetchState.submitTime)), TuplesKt.to("image_size", String.valueOf(i2)));
    }

    @Override // com.facebook.imagepipeline.producers.BaseNetworkFetcher, com.facebook.imagepipeline.producers.NetworkFetcher
    public void onFetchCompletion(OkHttpNetworkFetchState fetchState, int i2) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        fetchState.fetchCompleteTime = SystemClock.elapsedRealtime();
    }
}
