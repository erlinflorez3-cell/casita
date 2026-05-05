package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.regula.documentreader.api.DocumentReader;
import com.regula.documentreader.api.completions.IDocumentReaderCompletion;
import com.regula.documentreader.api.enums.BarcodeType;
import com.regula.documentreader.api.errors.DocumentReaderException;
import com.regula.documentreader.api.results.DocumentReaderBarcodeField;
import com.regula.documentreader.api.results.DocumentReaderBarcodeResult;
import com.regula.documentreader.api.results.DocumentReaderDocumentType;
import com.regula.documentreader.api.results.DocumentReaderGraphicField;
import com.regula.documentreader.api.results.DocumentReaderGraphicResult;
import com.regula.documentreader.api.results.DocumentReaderResults;
import com.ticnow.sdk.idnowonboarding.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"ЯL\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u0006\u0010nj?2Le^.ZS0\u000fs{B*c$wCCU0}*\tUNog\u0005Jb\u000bI\u0011\u000e\u0016\u0007j4կ]xs\u0012\u00172HtU\u074ck\u0010m9\u000fsn\u0004@r%أ}\u0005\u000f\u001ar\\\u001e\b\u0013Cy\u0011B4N\u0003RR;`5\u001e \u001aV / %s\\K`l\f?_'\u0011{ZNUrx\t[#^TU\u0012'e,=X7c(mc\u0011\u001ej[m\u001bowK\u001e\u0001)=*w\u000e\u001eI!\u0006\"0CO;u9&%\u0011_|$'Yg\u0014O^+@w)}UH\u0012,\u001e'vF]\u001et'&3#t$L^\u0003vB.|8تYӾ\u000433ݍkr_dS\u0019|9R˟\u0019̷'\u0001vď,`\u001cd-\u001b\u0003|(Ļ]͘AHVˣ*I{\n\tb0/Z΅SĬ3{\u0019фg1EbQ#OpX҉Pϼz\u0005hå$u`PX\"\u001dݫ\u000eѪ\u000bɔ^Dlʍ<\\baD\u0011{&+\u0378\u007fݔ\u0017 dɼ\r-3\u001bfO\u0017sAܗ_ܦ)/nŽ*zy\u001ao9\r@\fȤ&ߧeR~ܝ\u0010Hp\u0013pfp`bȚh͈&2PК`\u0006\nSf\u000e)1m\u0002rؼ8֞\u001d\\\u001dǽҺ\"c"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pFURuXP\u0002A%\u0016i\"\u0018\u0018\r\u0007iH JBF#\u00190X\u0016\u0011", "\u001a`]1e6BR,Hvi7z\u00137p{7E<\f\"`#z\u0019\u001a\u0001-@U\r{5|\u001a?QROA", "u(E", "\"@6", "", "0`R8C+?\"dP", "2dc2e4B\\\u0015\u000ez=6z\u00197e\t7jT\f\u0017", "", "5dc\u000fT9<]\u0018~YZ;x", "7r?6V;N`\u0019\\vi;\r\u0016/d", ";@RA\\=Bb-", "@dVB_(\u001c]!\n\u0002^;\u0001\u00138B{&\u0002", "\u001ab^:\"9>U)\u0006v(+\u0007\u0007?m\u007f1\u000bM\u0001\u0013\u0016G|W8\u0002)~W\b(Bt\u0016=QMDy}\u0002sr_I\u000fc5]c'CKN9:\\zH\u001b\u0012i\u0012X4b", "@dVB_(\u001c]!\n\u0002^;\u0001\u00138F\r2\u0005O", "Bh\\2b<M", "", "Bh\\2b<M1#\u000f\u0004m\u000b\u0007\u001b8", "Bh\\2b<M8#{", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "5dc\u0011a0\u001cO$\u000e\u000bk,", "@dbB_;L", "\u001ab^:\"9>U)\u0006v(+\u0007\u0007?m\u007f1\u000bM\u0001\u0013\u0016G|W8\u0002)~f}.Gt%<\u0017\"EiD&\u0015qp&\u0007_+N\u0004\u0014GZ^3k`H", ">`c5", "5dc\u001dW-\r\u001fj]vm(", "7r0#T3BRw\b~", "=m2?X(MS", "", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "@t]!\\4>])\u000eiZ:\u0003", "Adc\u001fX.NZ\u0015h\bb,\u0006\u0018+t\u00042\u0005", "@dVB_((`\u001d~\u0004m(\f\r9n", "Adc\u001fX.NZ\u0015lx^5x\u00163o", "@dVB_(,Q\u0019\bvk0\u0007", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class RegulaActivity extends AppCompatActivity {
    private static final int REGULA_ACTIVITY_RESPONSE_CODE_PICTURE_NOT_OK = 0;
    private HashMap _$_findViewCache;
    private boolean determinateDocumentType;
    private boolean getBarcodeData;
    private boolean isPictureCaptured;
    private Job timeoutJob;
    public static final Companion Companion = new Companion(null);
    private static final String REGULA_ACTIVITY_KEY_EXTRA_REQUEST_CODE = "SIDE";
    private static final int REGULA_ACTIVITY_REQUEST_CODE_FRONT_PICTURE = 10;
    private static final int REGULA_ACTIVITY_REQUEST_CODE_BACK_PICTURE = 11;
    private static final int REGULA_ACTIVITY_RESPONSE_CODE_PICTURE_OK = 1;
    private static final int REGULA_ACTIVITY_RESPONSE_CODE_CANCEL = -1;
    private static final int REGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR = -2;
    private static final int REGULA_ACTIVITY_RESPONSE_CODE_TIMEOUT = -3;
    private final String TAG = "RegulaActivity";
    private final RegulaActivity mActivity = this;
    private final int timeout = 45;
    private int timeoutCountDown = 45;
    private String backPdf417 = "";
    private final IDocumentReaderCompletion regulaCompletionFront = new IDocumentReaderCompletion() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.RegulaActivity$regulaCompletionFront$1
        public final void onCompleted(int i2, DocumentReaderResults results, DocumentReaderException documentReaderException) {
            Intent intent = new Intent();
            if (i2 != 1) {
                if (i2 == 2) {
                    this.this$0.isPictureCaptured = true;
                    DocumentReader.Instance().stopScanner(this.this$0);
                    this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_CANCEL(), intent);
                    this.this$0.finish();
                    return;
                }
                if (i2 != 3) {
                    return;
                }
                this.this$0.isPictureCaptured = true;
                String unused = this.this$0.TAG;
                String str = "error: " + documentReaderException;
                DocumentReader.Instance().stopScanner(this.this$0);
                this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR(), intent);
                this.this$0.finish();
                return;
            }
            try {
                this.this$0.isPictureCaptured = true;
                StringBuilder sb = new StringBuilder();
                File filesDir = this.this$0.getFilesDir();
                Intrinsics.checkExpressionValueIsNotNull(filesDir, "this.filesDir");
                String string = sb.append(filesDir.getPath()).append("/front.jpeg").toString();
                if (this.this$0.determinateDocumentType) {
                    RegulaActivity regulaActivity = this.this$0;
                    Intrinsics.checkExpressionValueIsNotNull(results, "results");
                    if (!regulaActivity.isAValidDni(results)) {
                        throw new Exception();
                    }
                }
                RegulaActivity regulaActivity2 = this.this$0;
                Intrinsics.checkExpressionValueIsNotNull(results, "results");
                if (regulaActivity2.getDniCapture(results, string)) {
                    intent.putExtra("path", string);
                    this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_OK(), intent);
                    this.this$0.finish();
                } else {
                    DocumentReader.Instance().stopScanner(this.this$0);
                    this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_NOT_OK(), intent);
                    this.this$0.finish();
                }
            } catch (Throwable th) {
                String unused2 = this.this$0.TAG;
                DocumentReader.Instance().stopScanner(this.this$0);
                this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_NOT_OK(), intent);
                this.this$0.finish();
            }
        }
    };
    private final IDocumentReaderCompletion regulaCompletionBack = new IDocumentReaderCompletion() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.RegulaActivity$regulaCompletionBack$1
        public final void onCompleted(int i2, DocumentReaderResults results, DocumentReaderException documentReaderException) {
            Intent intent = new Intent();
            if (i2 != 1) {
                if (i2 == 2) {
                    this.this$0.isPictureCaptured = true;
                    DocumentReader.Instance().stopScanner(this.this$0);
                    this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_CANCEL(), intent);
                    this.this$0.finish();
                    return;
                }
                if (i2 != 3) {
                    return;
                }
                this.this$0.isPictureCaptured = true;
                String unused = this.this$0.TAG;
                String str = "Error: " + documentReaderException;
                DocumentReader.Instance().stopScanner(this.this$0);
                this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR(), intent);
                this.this$0.finish();
                return;
            }
            try {
                this.this$0.isPictureCaptured = true;
                StringBuilder sb = new StringBuilder();
                File filesDir = this.this$0.getFilesDir();
                Intrinsics.checkExpressionValueIsNotNull(filesDir, "this.filesDir");
                String string = sb.append(filesDir.getPath()).append("/back.jpeg").toString();
                if (this.this$0.getBarcodeData) {
                    RegulaActivity regulaActivity = this.this$0;
                    Intrinsics.checkExpressionValueIsNotNull(results, "results");
                    if (regulaActivity.getPdf417Data(results)) {
                        intent.putExtra("backPdf417", this.this$0.backPdf417);
                    } else {
                        intent.putExtra("backPdf417", "");
                    }
                }
                if (this.this$0.determinateDocumentType) {
                    RegulaActivity regulaActivity2 = this.this$0;
                    Intrinsics.checkExpressionValueIsNotNull(results, "results");
                    if (!regulaActivity2.isAValidDni(results)) {
                        throw new Exception();
                    }
                }
                RegulaActivity regulaActivity3 = this.this$0;
                Intrinsics.checkExpressionValueIsNotNull(results, "results");
                if (regulaActivity3.getDniCapture(results, string)) {
                    intent.putExtra("path", string);
                    this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_OK(), intent);
                    this.this$0.finish();
                } else {
                    DocumentReader.Instance().stopScanner(this.this$0);
                    this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_NOT_OK(), intent);
                    this.this$0.finish();
                }
            } catch (Throwable th) {
                String unused2 = this.this$0.TAG;
                DocumentReader.Instance().stopScanner(this.this$0);
                this.this$0.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_NOT_OK(), intent);
                this.this$0.finish();
            }
        }
    };

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006\rnj?=JͣIDɟ\u0004*=j<9*[ҸuCIUj\u00100\ngN\u0016iEЁ\u001dŲG\u0015\u000eǝ\u0011l2Lc|.$\u001d7Zom9$ڕ\u007f˃dz>ӌ84(?\b\rQ,8Q(v)I\"ÏTضDvBĥ%O\u000b$ \u000e\u000f2\u000f)tg|<\u001fǔ Ơ3)\u000b݃ZP-k>\u0005\u001e\u001fTa?\r%gtѯ\u0003˝9\u001b-م\u001b\tXiM\u000b\u0010\u0004K\u0014\u0001'U1 ֜\u001a͏\\\u0006\u001cƃCQ\u0013m\u0001.-\u0017_q$'YU:֦\u0013ˎ,}\u0003Ԉ%>\n \u0014/\u0019@;-~\b<9KɈ\u0016ĖT\bfۍ\u0018|gJ%-ŗ7@"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pFURuXP\u0002A%\u0016i\"\u0018\u0018\r\u0007iH JBF#\u00190X\u0016yF\u000b\u0014!\n>nzK,", "", "u(E", " D6\"?\b8/vm^O\u0010k|)K_\u001cu s\u0006\u0004#iz\u001cb\u0015\u0015Gl\u001a\u0015Wt\u000e", "", "5dc\u001f8\u000e.:txV<\u001b`y\u0013Ts\"a t\u0011v:^z\u0018p\u0012\u0015Em\u007f%\\\u0010\f7\"\u001b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", " D6\"?\b8/vm^O\u0010k|)R_\u0014k n\u0006\u0011%Yl\u001cp\u0002\u00117c\u001a\"Qs\u001d=0\u001b", "", "5dc\u001f8\u000e.:txV<\u001b`y\u0013Ts\"h l\u0007v5^\b\u001a`\u0004\u0015SZ{\u0015S\u0010\u00191!*[!}", "u(8", " D6\"?\b8/vm^O\u0010k|)R_\u0014k n\u0006\u0011%Yl\u001cp\u0006\"Cf\u000f1Xy\f<3(K", "5dc\u001f8\u000e.:txV<\u001b`y\u0013Ts\"h l\u0007v5^\b\u001a`\u0004\u0015S^\r!V\u0005(8'\u0019Z$\u000bt", " D6\"?\b8/vm^O\u0010k|)R_\u0016f*i\u0005vAMw\u001bV\u001f\u00135f}\u0017T", "5dc\u001f8\u000e.:txV<\u001b`y\u0013Ts\"h n\u0002\u00010]m6T\u000f\u00149w}\u0013Vs\u000e4", " D6\"?\b8/vm^O\u0010k|)R_\u0016f*i\u0005vAMw\u001bV\u001f\u00179f\u007f$I|(-0(U!", "5dc\u001f8\u000e.:txV<\u001b`y\u0013Ts\"h n\u0002\u00010]m6T\u000f\u00149w\u0002\u0017Vu\u001b)*5K!\u000b~U", " D6\"?\b8/vm^O\u0010k|)R_\u0016f*i\u0005vAMw\u001bV\u001f =[\u000f'Zu(6-*e\u001e\u0004", "5dc\u001f8\u000e.:txV<\u001b`y\u0013Ts\"h n\u0002\u00010]m6T\u000f\u00149w\u000b\u001bK\u0005\u001e:#5T\u001e\r\u000fRG", " D6\"?\b8/vm^O\u0010k|)R_\u0016f*i\u0005vAMw\u001bV\u001f =[\u000f'Zu(7)", "5dc\u001f8\u000e.:txV<\u001b`y\u0013Ts\"h n\u0002\u00010]m6T\u000f\u00149w\u000b\u001bK\u0005\u001e:#5U\u001a", " D6\"?\b8/vm^O\u0010k|)R_\u0016f*i\u0005vAMw\u001bV\u001f$=e\u007f!]\u0005", "5dc\u001f8\u000e.:txV<\u001b`y\u0013Ts\"h n\u0002\u00010]m6T\u000f\u00149w\u000f\u001bUu\u0018=2", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getREGULA_ACTIVITY_KEY_EXTRA_REQUEST_CODE() {
            return RegulaActivity.REGULA_ACTIVITY_KEY_EXTRA_REQUEST_CODE;
        }

        public final int getREGULA_ACTIVITY_REQUEST_CODE_BACK_PICTURE() {
            return RegulaActivity.REGULA_ACTIVITY_REQUEST_CODE_BACK_PICTURE;
        }

        public final int getREGULA_ACTIVITY_REQUEST_CODE_FRONT_PICTURE() {
            return RegulaActivity.REGULA_ACTIVITY_REQUEST_CODE_FRONT_PICTURE;
        }

        public final int getREGULA_ACTIVITY_RESPONSE_CODE_CANCEL() {
            return RegulaActivity.REGULA_ACTIVITY_RESPONSE_CODE_CANCEL;
        }

        public final int getREGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR() {
            return RegulaActivity.REGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR;
        }

        public final int getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_NOT_OK() {
            return RegulaActivity.REGULA_ACTIVITY_RESPONSE_CODE_PICTURE_NOT_OK;
        }

        public final int getREGULA_ACTIVITY_RESPONSE_CODE_PICTURE_OK() {
            return RegulaActivity.REGULA_ACTIVITY_RESPONSE_CODE_PICTURE_OK;
        }

        public final int getREGULA_ACTIVITY_RESPONSE_CODE_TIMEOUT() {
            return RegulaActivity.REGULA_ACTIVITY_RESPONSE_CODE_TIMEOUT;
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.activity.RegulaActivity$runTimeoutTask$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004G\u0006>éFB-!T\u0012&\u0007-ʜwӧHgN/`U"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\""}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            Intrinsics.checkParameterIsNotNull(completion, "completion");
            AnonymousClass1 anonymousClass1 = RegulaActivity.this.new AnonymousClass1(completion);
            anonymousClass1.p$ = (CoroutineScope) obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = this.p$;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            do {
                if (!RegulaActivity.this.isPictureCaptured) {
                    if (RegulaActivity.this.timeoutCountDown == 0) {
                        RegulaActivity.this.isPictureCaptured = true;
                        DocumentReader.Instance().stopScanner(RegulaActivity.this.mActivity);
                        RegulaActivity.this.setResult(RegulaActivity.Companion.getREGULA_ACTIVITY_RESPONSE_CODE_TIMEOUT(), new Intent());
                        RegulaActivity.this.finish();
                    } else {
                        RegulaActivity regulaActivity = RegulaActivity.this;
                        regulaActivity.timeoutCountDown--;
                        this.L$0 = coroutineScope;
                        this.label = 1;
                    }
                }
                return Unit.INSTANCE;
            } while (DelayKt.delay(1000L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    private final void runTimeoutTask() {
        this.timeoutJob = BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            short sXd = (short) (C1580rY.Xd() ^ (881466505 ^ (-881460195)));
            int[] iArr = new int["\u001e\rT\u0014y".length()];
            QB qb = new QB("\u001e\rT\u0014y");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strQd = Xg.qd("\fz", (short) (OY.Xd() ^ (1032535333 ^ 1032532334)), (short) (OY.Xd() ^ ((1080127622 ^ 303167135) ^ 1383126446)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strWd = Jg.Wd("U,\u0014\u0016\u0019", (short) (OY.Xd() ^ ((2069400186 ^ 666727859) ^ 1558572423)), (short) (OY.Xd() ^ (228251527 ^ 228234964)));
                String strXd = ZO.xd("t\u0004", (short) (C1580rY.Xd() ^ ((1381565150 ^ 426356184) ^ (-1261495461))), (short) (C1580rY.Xd() ^ ((698226739 ^ 1170386755) ^ (-1818029238))));
                try {
                    Class<?> cls2 = Class.forName(strWd);
                    Field field2 = 0 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strUd = C1626yg.Ud("Qo(l;", (short) (ZN.Xd() ^ ((1337849624 ^ 971713824) ^ 1985408566)), (short) (ZN.Xd() ^ (759114665 ^ 759118360)));
                    String strWd2 = Ig.wd("\u007fG", (short) (FB.Xd() ^ (1467855274 ^ 1467850128)));
                    try {
                        Class<?> cls3 = Class.forName(strUd);
                        Field field3 = 0 != 0 ? cls3.getField(strWd2) : cls3.getDeclaredField(strWd2);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(EO.Od("RofVI", (short) (C1607wl.Xd() ^ ((719794507 ^ 954227689) ^ 302471658)))).getDeclaredMethod(C1561oA.Qd("\u0010\u001b", (short) (C1499aX.Xd() ^ ((1341208669 ^ 1105337446) ^ (-236126266)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1593ug.zd("\u0004v|s\u007f\t", (short) (C1580rY.Xd() ^ ((1157548798 ^ 1603622136) ^ (-460060534))), (short) (C1580rY.Xd() ^ ((844486620 ^ 1885385441) ^ (-1110801327))))};
                                Method method = Class.forName(C1561oA.od("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (OY.Xd() ^ ((1957685070 ^ 1440421966) ^ 561290853)))).getMethod(Wg.Zd("BJ\u001b1\u0019R\r=~\u0014gL\u0012Dw9", (short) (ZN.Xd() ^ (37514623 ^ 37516759)), (short) (ZN.Xd() ^ (1789523653 ^ 1789507338))), Class.forName(C1561oA.Kd("h`vb0oesm5[}|tzt", (short) (Od.Xd() ^ (1727649788 ^ (-1727631989))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strXd2 = C1561oA.Xd("7&m-\u0013", (short) (C1607wl.Xd() ^ (908888701 ^ 908903343)));
                                    short sXd2 = (short) (C1499aX.Xd() ^ ((55432387 ^ 647493183) ^ (-635046848)));
                                    int[] iArr2 = new int["\u0002u".length()];
                                    QB qb2 = new QB("\u0002u");
                                    int i3 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                                        i3++;
                                    }
                                    String str2 = new String(iArr2, 0, i3);
                                    try {
                                        Class<?> cls4 = Class.forName(strXd2);
                                        Field field4 = 0 != 0 ? cls4.getField(str2) : cls4.getDeclaredField(str2);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    String strKd = Qg.kd("fS\u0019V:", (short) (C1580rY.Xd() ^ ((1161659599 ^ 1180557655) ^ (-56649549))), (short) (C1580rY.Xd() ^ (918027816 ^ (-918000852))));
                    String strVd = hg.Vd("\u001d\u0011", (short) (C1499aX.Xd() ^ (8610935 ^ (-8592307))), (short) (C1499aX.Xd() ^ (2047863221 ^ (-2047843332))));
                    try {
                        Class<?> cls5 = Class.forName(strKd);
                        Field field5 = 0 != 0 ? cls5.getField(strVd) : cls5.getDeclaredField(strVd);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        short sXd3 = (short) (C1633zX.Xd() ^ ((543930006 ^ 574198202) ^ (-38941735)));
                        int[] iArr3 = new int["K8};\u001f".length()];
                        QB qb3 = new QB("K8};\u001f");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3));
                            i4++;
                        }
                        String str3 = new String(iArr3, 0, i4);
                        String strYd = C1561oA.yd("ZP", (short) (C1580rY.Xd() ^ ((840427050 ^ 1556254813) ^ (-1859472242))));
                        try {
                            Class<?> cls6 = Class.forName(str3);
                            Field field6 = 0 != 0 ? cls6.getField(strYd) : cls6.getDeclaredField(strYd);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i5 = (1342767601 ^ 1003366013) ^ 1808213959;
                        if (x2 > i5 && x2 < displayMetrics.widthPixels - i5 && y2 > i5 && y2 < displayMetrics.heightPixels - i5) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getDniCapture(DocumentReaderResults results, String path) throws IOException {
        Intrinsics.checkParameterIsNotNull(results, "results");
        Intrinsics.checkParameterIsNotNull(path, "path");
        DocumentReaderGraphicResult documentReaderGraphicResult = results.graphicResult;
        if (documentReaderGraphicResult == null) {
            Intrinsics.throwNpe();
        }
        for (DocumentReaderGraphicField documentReaderGraphicField : documentReaderGraphicResult.fields) {
            if (documentReaderGraphicField.fieldType == 207) {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Bitmap bitmap = documentReaderGraphicField.getBitmap(Bitmap.CompressFormat.PNG, 100);
                if (bitmap == null) {
                    Intrinsics.throwNpe();
                }
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.close();
                DocumentReader.Instance().stopScanner(this);
                return true;
            }
        }
        return false;
    }

    public final boolean getPdf417Data(DocumentReaderResults documentReaderResults) {
        short sXd = (short) (C1580rY.Xd() ^ (-785));
        int[] iArr = new int["\u0006z}Xmkr\\\" 4\"{Lc".length()];
        QB qb = new QB("\u0006z}Xmkr\\\" 4\"{Lc");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strQd = Xg.qd("f\u0007\u0019\u000b\u0018\u000e\u0010K\u001f\u0013\"%\u001d&&mT", (short) (OY.Xd() ^ 5382), (short) (OY.Xd() ^ 13795));
        Intrinsics.checkParameterIsNotNull(documentReaderResults, Jg.Wd("`\u0013b$T$\\", (short) (C1580rY.Xd() ^ (-8605)), (short) (C1580rY.Xd() ^ (-5472))));
        try {
            DocumentReaderBarcodeResult documentReaderBarcodeResult = documentReaderResults.barcodeResult;
            if (documentReaderBarcodeResult == null) {
                Intrinsics.throwNpe();
            }
            if (documentReaderBarcodeResult.fields.size() <= 0) {
                return false;
            }
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder(strQd);
            DocumentReaderBarcodeResult documentReaderBarcodeResult2 = documentReaderResults.barcodeResult;
            if (documentReaderBarcodeResult2 == null) {
                Intrinsics.throwNpe();
            }
            String json = documentReaderBarcodeResult2.toJson();
            if (json == null) {
                Intrinsics.throwNpe();
            }
            sb.append(json).toString();
            DocumentReaderBarcodeResult documentReaderBarcodeResult3 = documentReaderResults.barcodeResult;
            if (documentReaderBarcodeResult3 == null) {
                Intrinsics.throwNpe();
            }
            byte[] bArr = ((DocumentReaderBarcodeField) documentReaderBarcodeResult3.fields.get(0)).data;
            if (bArr == null) {
                Intrinsics.throwNpe();
            }
            short sXd2 = (short) (C1580rY.Xd() ^ (-32097));
            short sXd3 = (short) (C1580rY.Xd() ^ (-17375));
            int[] iArr2 = new int["4c9\u0013)\u000b5)Q>@:\\s\u0007*RN\u0018".length()];
            QB qb2 = new QB("4c9\u0013)\u000b5)Q>@:\\s\u0007*RN\u0018");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {bArr, 0};
            Method declaredMethod = cls.getDeclaredMethod(C1626yg.Ud("z\u001d$WhTm\u001fb\fUSk+", (short) (ZN.Xd() ^ 28388), (short) (ZN.Xd() ^ 32326)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                String str3 = (String) declaredMethod.invoke(null, objArr);
                Intrinsics.checkExpressionValueIsNotNull(str3, Ig.wd("2\"\u0004O}7G4fYa>tkT\u001c\u0011\u000bG&h~@Pⶕ\fl=\u000b1<hFvO\u0006&J);?g\u0014\u0016xd>t#D", (short) (Od.Xd() ^ (-11983))));
                this.backPdf417 = str3;
                String str4 = this.TAG;
                String str5 = str + this.backPdf417;
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            String str6 = this.TAG;
            short sXd4 = (short) (C1607wl.Xd() ^ 29287);
            int[] iArr3 = new int["A>Rm3\r\u001a43ZVC\u0017\u0012\u0007S:i\u0002m+T\u001f!\u0006.\rE4".length()];
            QB qb3 = new QB("A>Rm3\r\u001a43ZVC\u0017\u0012\u0007S:i\u0002m+T\u001f!\u0006.\rE4");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i4)) + xuXd3.CK(iKK3));
                i4++;
            }
            new String(iArr3, 0, i4);
            return false;
        }
    }

    public final boolean isAValidDni(DocumentReaderResults results) {
        Intrinsics.checkParameterIsNotNull(results, "results");
        try {
            if (results.documentType.size() <= 0) {
                return false;
            }
            String str = this.TAG;
            String.valueOf(((DocumentReaderDocumentType) results.documentType.get(0)).ICAOCode);
            String str2 = this.TAG;
            String.valueOf(((DocumentReaderDocumentType) results.documentType.get(0)).dCountryName);
            String str3 = this.TAG;
            String.valueOf(((DocumentReaderDocumentType) results.documentType.get(0)).name);
            if (!StringsKt.equals(String.valueOf(((DocumentReaderDocumentType) results.documentType.get(0)).ICAOCode), "COL", true)) {
                return false;
            }
            if (!StringsKt.contains((CharSequence) String.valueOf(((DocumentReaderDocumentType) results.documentType.get(0)).name), (CharSequence) "Colombia - Id Card #1", true)) {
                if (!StringsKt.contains((CharSequence) String.valueOf(((DocumentReaderDocumentType) results.documentType.get(0)).name), (CharSequence) "Colombia - Alien's Id Card", true)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            String str4 = this.TAG;
            return false;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        setContentView(R.layout.activity_regula);
        runTimeoutTask();
        try {
            DocumentReader.Instance().customization().edit().setActivityIndicatorColor("#00ff00").setCameraFrameShapeType(1).setCameraFrameDefaultColor("#00000000").setCameraFrameActiveColor("#ff0000").setCloseButtonImage(getDrawable(R.drawable.ic_back_dav_white)).setResultStatusBackgroundColor("#00000000").setResultStatusTextColor("#ffffff").setShowBackgroundMask(true).setShowHelpAnimation(false).setShowResultStatusMessages(false).setShowStatusMessages(false).apply();
            DocumentReader.Instance().functionality().edit().setShowTorchButton(false).apply();
            DocumentReader.Instance().processParams().setLogs(true);
            DocumentReader.Instance().processParams().returnUncroppedImage = true;
            DocumentReader.Instance().processParams().timeout = Double.valueOf(this.timeout + 10);
            String strValueOf = String.valueOf(getIntent().getStringExtra("regulaOrientation"));
            String str = this.TAG;
            String str2 = "Regula scenario: " + strValueOf;
            setRegulaOrientation(strValueOf);
            String strValueOf2 = String.valueOf(getIntent().getStringExtra("regulaScenario"));
            String str3 = this.TAG;
            String str4 = "Regula scenario: " + strValueOf2;
            setRegulaScenario(strValueOf2);
            int intExtra = getIntent().getIntExtra(REGULA_ACTIVITY_KEY_EXTRA_REQUEST_CODE, 0);
            if (intExtra == REGULA_ACTIVITY_REQUEST_CODE_FRONT_PICTURE) {
                try {
                    DocumentReader.Instance().customization().edit().setBorderBackgroundImage(getDrawable(R.drawable.ic_dni_guide_front_col)).apply();
                    DocumentReader.Instance().showScanner(this, this.regulaCompletionFront);
                } catch (Throwable th) {
                    String str5 = this.TAG;
                    setResult(REGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR, new Intent());
                    finish();
                }
            } else if (intExtra == REGULA_ACTIVITY_REQUEST_CODE_BACK_PICTURE) {
                try {
                    DocumentReader.Instance().customization().edit().setBorderBackgroundImage(getDrawable(R.drawable.ic_dni_guide_back_col)).apply();
                    DocumentReader.Instance().showScanner(this, this.regulaCompletionBack);
                } catch (Throwable th2) {
                    String str6 = this.TAG;
                    setResult(REGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR, new Intent());
                    finish();
                }
            }
        } catch (Exception e2) {
            String str7 = this.TAG;
            setResult(REGULA_ACTIVITY_RESPONSE_CODE_GENERAL_ERROR, new Intent());
            finish();
        }
    }

    public final void setRegulaOrientation(String regulaOrientation) {
        Intrinsics.checkParameterIsNotNull(regulaOrientation, "regulaOrientation");
        if (Intrinsics.areEqual(regulaOrientation, "Portrait")) {
            DocumentReader.Instance().functionality().edit().setOrientation(1).apply();
        } else {
            DocumentReader.Instance().functionality().edit().setOrientation(4).apply();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setRegulaScenario(String regulaScenario) {
        Intrinsics.checkParameterIsNotNull(regulaScenario, "regulaScenario");
        if (Intrinsics.areEqual(regulaScenario, "")) {
            DocumentReader.Instance().processParams().scenario = "FullProcess";
            return;
        }
        switch (regulaScenario.hashCode()) {
            case -2111085288:
                if (regulaScenario.equals("Id3Rus")) {
                    this.determinateDocumentType = true;
                    DocumentReader.Instance().processParams().scenario = "Id3Rus";
                    return;
                }
                break;
            case -2091788236:
                if (regulaScenario.equals("MrzAndLocate")) {
                    DocumentReader.Instance().processParams().scenario = "MrzAndLocate";
                    return;
                }
                break;
            case -2077728986:
                if (regulaScenario.equals("Capture")) {
                    DocumentReader.Instance().processParams().scenario = "Capture";
                    return;
                }
                break;
            case -2013594766:
                if (regulaScenario.equals("Locate")) {
                    DocumentReader.Instance().processParams().scenario = "Locate";
                    return;
                }
                break;
            case -1577163290:
                if (regulaScenario.equals("MrzOrOcr")) {
                    this.determinateDocumentType = true;
                    DocumentReader.Instance().processParams().scenario = "MrzOrOcr";
                    return;
                }
                break;
            case -802372494:
                if (regulaScenario.equals("DocType")) {
                    this.determinateDocumentType = true;
                    DocumentReader.Instance().processParams().scenario = "DocType";
                    return;
                }
                break;
            case 77653:
                if (regulaScenario.equals("Mrz")) {
                    DocumentReader.Instance().processParams().scenario = "Mrz";
                    return;
                }
                break;
            case 79102:
                if (regulaScenario.equals("Ocr")) {
                    this.determinateDocumentType = true;
                    DocumentReader.Instance().processParams().scenario = "Ocr";
                    return;
                }
                break;
            case 40112266:
                if (regulaScenario.equals("OcrFree")) {
                    DocumentReader.Instance().processParams().scenario = "OcrFree";
                    return;
                }
                break;
            case 718905659:
                if (regulaScenario.equals("LocateVisual_And_MrzOrOcr")) {
                    this.determinateDocumentType = true;
                    DocumentReader.Instance().processParams().scenario = "LocateVisual_And_MrzOrOcr";
                    return;
                }
                break;
            case 1012832051:
                if (regulaScenario.equals("RusStamp")) {
                    DocumentReader.Instance().processParams().scenario = "RusStamp";
                    return;
                }
                break;
            case 1331069024:
                if (regulaScenario.equals("Barcode")) {
                    this.getBarcodeData = true;
                    DocumentReader.Instance().processParams().doBarcodes = new String[]{BarcodeType.valueOf(5)};
                    DocumentReader.Instance().processParams().scenario = "Barcode";
                    return;
                }
                break;
            case 1428640201:
                if (regulaScenario.equals("CreditCard")) {
                    DocumentReader.Instance().processParams().scenario = "CreditCard";
                    return;
                }
                break;
            case 1543568712:
                if (regulaScenario.equals("MrzOrBarcode")) {
                    this.getBarcodeData = true;
                    DocumentReader.Instance().processParams().doBarcodes = new String[]{BarcodeType.valueOf(5)};
                    DocumentReader.Instance().processParams().scenario = "MrzOrBarcode";
                    return;
                }
                break;
            case 1568692179:
                if (regulaScenario.equals("MrzOrBarcodeOrOcr")) {
                    this.determinateDocumentType = true;
                    this.getBarcodeData = true;
                    DocumentReader.Instance().processParams().doBarcodes = new String[]{BarcodeType.valueOf(5)};
                    DocumentReader.Instance().processParams().scenario = "MrzOrBarcodeOrOcr";
                    return;
                }
                break;
            case 1595490698:
                if (regulaScenario.equals("MrzOrLocate")) {
                    DocumentReader.Instance().processParams().scenario = "MrzOrLocate";
                    return;
                }
                break;
        }
        this.determinateDocumentType = true;
        this.getBarcodeData = true;
        DocumentReader.Instance().processParams().doBarcodes = new String[]{BarcodeType.valueOf(5)};
        DocumentReader.Instance().processParams().scenario = "FullProcess";
    }
}
