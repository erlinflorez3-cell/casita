package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import com.google.firebase.crashlytics.internal.Logger;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.InterfaceC1492Gx;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lmOӄbnx.\u0001Rb\u000et<G4_2q[;\u0004\u001b\u000e&\u0017Qfg\u0016oН^\u000bQ\u0012V$\u0007nDI\u0004}\u0014\u0016e˸DņC3Uڎ\u000eGnzN\u0005N7X<Pږ\u0003ʀ.H\u0018͌KQY\u0013*0nupVc˧\u0007ܨ\u0016\u0006FĨQ,jof6vq\u0014>\u0006ݒ\u0005ݦFN/ڿ݇\u0001W"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~$\u0013Ur\u0015P\u0006)3gG$@|\u0016;V?B52(\u001efqF\u0014c5L\u000bp%YJ:_Y\u0007L\u0018\u0010h\u007fX8\u0013\u0005fOy", "", "0`R8Z9Hc\"}Zq,z\u0019>o\r\u0016{M\u0012\u001b\u0015G", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "0k^0^0GUx\u0012z\\<\f\u0013<S\u007f5\rD~\u0017", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`vZo\fL\u0006/BG}-Hq\u0014.#*@gE\u001a^xp=\u000e-*X\u007f%WY[,ea<\u001d'\u0012X\u001e]5\u001arYN5rB7tK\u001d", "1n\\:b5", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~$\u0013Ur\u0015P\u0006)3gG$@|\u0016;V?B52(\u001efqF\u0014c5L\u000bp%YJ:_Y\u0007L\u0018\u0010h\u007fX8\u0013\u0005f\u0017", "2`c.66EZ\u0019|\n", "2hb8J9Bb\u0019", "<dcDb9D", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#BU\f#>\u0002%2KQ"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CrashlyticsWorkers {
    public static final Companion Companion = new Companion(null);
    private static boolean enforcement = false;
    public final CrashlyticsWorker common;
    public final CrashlyticsWorker dataCollect;
    public final CrashlyticsWorker diskWrite;
    public final CrashlyticsWorker network;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146B\u0005&4\u0012\u0006\u0013nj?2LeV.ZS0\u0011s{J$c$wFA٬\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016Ap:Vmx\f U7\u000buMBeokG'y~\u000b.B:8(\u0013G\u001frj\u001e\b\u0013Cy\u001aB:N\u0003RX\u001dO\u0015\u001a@\bl31(j{f<Xnm:],1|\tNoe>\u0012e\rtVm\r?g,AX7c\u0017kSK\r`rW\u0003ms\u0004\u00059I5,as\u00068\u000f\u0004R\u0019\u0002̅\u0019ǁv8dӤab\u0012*9O{MV\u00126|\u001b}\u0013B\u0012\u0015VAV6E\"\u0005\u001265\u000bq\u0002I~\u000b\u0015\u0003Vаcي\u001b)\u001851D)rЈeS"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~$\u0013Ur\u0015P\u0006)3gG$@|\u0016;V?B52(\u001efqF\u0014c5L\u000bp%YJ:_Y\u0007L\u0018\u0010h\u007fX8\u0013\u0005fObLN?*\u00045M\fD>", "", "u(E", "3mU<e*>[\u0019\b\n", "", "5dc\u0012a-H`\u0017~\u0003^5\fG+n\t2\u000b<\u0010\u001b!P}", "5dc\u0012a-H`\u0017~\u0003^5\f", "u(I", "Adc\u0012a-H`\u0017~\u0003^5\f", "uY\u0018#", "Bga2T+'O!~", "", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc![9>O\u0018gvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1gT0^\t:Q\u001f\u0001\bh<\u0006\b\u001eh\r(w?", "", "1gT0^\tE]\u0017\u0005~g.k\f<e{'", "1gT0^\u0015Hb\u0001z~g\u001b\u007f\u0016/a~", "1gT0^\u001bA`\u0019zy", "7r2<e9>Q(m}k,x\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "4`X9h9>;\u0019\r\tZ.|", "7r1.V2@`#\u000f\u0004]\u001b\u007f\u0016/a~", "7r19b*DW\"\u0001ia9|\u0005.", "7r=<g\u0014:W\"m}k,x\b", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#BU\f#>\u0002%2KQ"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void checkThread(Function0<Boolean> function0, Function0<String> function02) {
            if (function0.invoke().booleanValue()) {
                return;
            }
            Logger.getLogger().d(function02.invoke());
            getEnforcement();
        }

        @JvmStatic
        public static /* synthetic */ void getEnforcement$annotations() {
        }

        public final String getThreadName() {
            return Thread.currentThread().getName();
        }

        public final boolean isBackgroundThread() {
            String threadName = getThreadName();
            Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
            return StringsKt.contains$default((CharSequence) threadName, (CharSequence) "Firebase Background Thread #", false, 2, (Object) null);
        }

        public final boolean isBlockingThread() {
            String threadName = getThreadName();
            Intrinsics.checkNotNullExpressionValue(threadName, "threadName");
            return StringsKt.contains$default((CharSequence) threadName, (CharSequence) "Firebase Blocking Thread #", false, 2, (Object) null);
        }

        public final boolean isNotMainThread() throws Throwable {
            Object[] objArr = new Object[0];
            try {
                Class.forName(hg.Vd("htivrke.nq+Hjii]i", (short) (ZN.Xd() ^ 4842), (short) (ZN.Xd() ^ 1406))).getDeclaredMethod(C1561oA.ud("\u000e\u000b\u0019p\u0004\u000b\u000fk\u000e\r\r\u0001\r", (short) (C1499aX.Xd() ^ (-9665))), new Class[0]).setAccessible(true);
                return !((Looper) r1.invoke(null, objArr)).isCurrentThread();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @JvmStatic
        public final void checkBackgroundThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), new Function0<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBackgroundThread$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Must be called on a background thread, was called on " + CrashlyticsWorkers.Companion.getThreadName() + '.';
                }
            });
        }

        @JvmStatic
        public final void checkBlockingThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBlockingThread$1(this), new Function0<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkBlockingThread$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Must be called on a blocking thread, was called on " + CrashlyticsWorkers.Companion.getThreadName() + '.';
                }
            });
        }

        @JvmStatic
        public final void checkNotMainThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkNotMainThread$1(this), new Function0<String>() { // from class: com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion$checkNotMainThread$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Must not be called on a main thread, was called on " + CrashlyticsWorkers.Companion.getThreadName() + '.';
                }
            });
        }

        public final boolean getEnforcement() {
            return CrashlyticsWorkers.enforcement;
        }

        public final void setEnforcement(boolean z2) {
            CrashlyticsWorkers.enforcement = z2;
        }
    }

    public CrashlyticsWorkers(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.common = new CrashlyticsWorker(backgroundExecutorService);
        this.diskWrite = new CrashlyticsWorker(backgroundExecutorService);
        this.dataCollect = new CrashlyticsWorker(backgroundExecutorService);
        this.network = new CrashlyticsWorker(blockingExecutorService);
    }

    @JvmStatic
    public static final void checkBackgroundThread() {
        Companion.checkBackgroundThread();
    }

    @JvmStatic
    public static final void checkBlockingThread() {
        Companion.checkBlockingThread();
    }

    @JvmStatic
    public static final void checkNotMainThread() {
        Companion.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return Companion.getEnforcement();
    }

    public static final void setEnforcement(boolean z2) {
        Companion.setEnforcement(z2);
    }
}
