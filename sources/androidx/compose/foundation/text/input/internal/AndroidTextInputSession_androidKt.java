package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!,x\bDRo|\u0004G\u00068\u000b<K\u0007\"2\u0014\u007f\u0007tjA0JeP.hS2şs{B#c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG3coEʠhtL\u0005(݅*8\u0010\u0005\tɝ2H&v\u0003CQ\r*NNwRR;U5 \u0018\u0006L)\u0019\u001e\u000bg~@Vvu@?%\u0013ipNUjv|ewT`?\r%nF+nEe\u00193b\u001b\u0007\u0001ko\u0007M\u0003U\u0005\u00179W/W\u0007o6\u0007\u0014D\u001b9d%_\t%\u000b\u001b\u0002r\u001a>C]sM`\u000eV\u0011\u000b}\u001d<2\u0016\u001c&vF]\u001et\"&3#\u000e\u0004L^\u001evJ\u0010|q6E-\u00162YVKl_\u007fS\u001bd6*$S̖aъr!it&G#'lw\u007f>y@kV~\u000egL\u0006\u0004\u001fr2.\u0012A_\u007f]\u000eA2%8O[g7Qq\u0010]\\i\r\u0004\u000f~\u0004{`_X0~\u0018G*7%jFt\u0005\u001aXjWZ)}*Z\u0007\f$+(lyL!S\u0018dN\u0017\u0007\u001bUc\n3M~9om\u001a-\u001eޫ\u001dۋ9Qq1\u0002f\u0005ܝWBr\u0007hfpS:Y3̨$ĘLl\u0018w\nEn !4WqJ7bջo¤gȠ\u0007$Jˆ\r\u000be^v\u0015\u001f`A*\u001biRt_ə#ʷtooծ͋0\u001f"}, d2 = {"\u000fK;,@\u0010&3\u0013mnI\fj", "", "", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "\"H0,7\f\u001bCz", "", "5dc!<\b82x[j@jx\u00128o\u000f$\u000bD\u000b %", "u(E", "\"H0,G\b ", ":nV\u0011X)NU", "", "B`V", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ">kPAY6K[\u0007\nz\\0}\r-T\u007f;\u000b$\n\"'V]\u000eJ\u0005)?b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp'\u0007q:R\u00010\u001d", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", ":`h<h;,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "7lT\u001cc;B]\"\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7W!=QMDy\n", "@dR2\\=>1#\b\n^5\ff9n\u0001,}P\u000e\u0013&Ky\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r @|_2VR;x=\u001a\u001c2N9\u0005c0_v\u0005QU],eaPG\u001d\u0013^\u0010^8\t\u0014]K-D", "=m8:X\b<b\u001d\t\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "1n\\=b:>7!\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PA6V\u00021UL25gb\u0002%\u0014!]\u0018M\u0013\t\u000eUC${\u001a", "Ash9h:!O\"}\rk0\f\r8gn5\u007fB\u0003\u0017$", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk#3z\u0016-.JE}\n", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~D\u0005\u001cFn ;U2;~C\u0002\u001esqHtc:\\z1P\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8EA/\u0011+E\u0011?r\nU%\u000eHy:F_\u001bW\t^yJ8hSb[\u0001\u00110R^3r\ri*d:9\u0013\u0014\u0005({lP5\tib\r\u0002RONcP\u0018\bB(=\u0001%DOw`F\u0003'hL\u0006\b\u001b1T\u0004/~6MC*IsNOp#NmB\u00195kA4/2C\\.Kv\u0005S:\"r/pu\u001d^D1nLalG\u001c\u0011a\u0016n~_i\tB\\\u0014>\u0013\u007f\u0019pU~UjC\u0019\u0012\u00124|/-K\u001b>\f)tN+mfi~o\u0017)8\u001a<lXf4gBW!\t29\u0016\fbB\u0011\u007fL\u001av\u0015pe`~$?\bZM*BKI\u007fNJ9|\u00162\u0001\u000f\u0010\u001dQsK\t6\u001c4\u0003Gb9fb?\u0018cb&#p\u000e\u0003%7@\tVI8c\t/^~\u001eqz$aHA\u0010|\"Ys KgU\u000e\b09\f5L\"9ds)\fY}=Ux\u001c\u007fM,\u0003#%+\"\u0005K)pd>f\u001f\u001bSs&:+\u0010\"R\u001f\\\u0013{QD!G99\r\u001b,ThxU\f9R\"NWy)2oy]\u00024XDOJ@\u00050(E\u001b\u0019QN\u0011,O+j\u001a\u0003wz\u00180h[4U\\fN\u0012KB\u0015&#\u0016\u000eUDVr\rf:p|5\u0015\tCrq\"\u00062d}(;\u0005,3Wk7\u0002(8\u001b)]\u000b#~al$\u0018Ep{uV\u0006 85@~PE(\u0005FW6\u0004xew(.\u0011US(\u0002?r+f'{\u001dMx\u00107Cr\u000eK|m{:JAn&i\"\u0003h\t\u0003G+Up\u001fd ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~D\u0005\u001cFn ;U2;~C\u0002\u001esqHtc:\\z1P\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8EA/\u0011+E\u0011?r\nU%\u000eHy:F_\u001bW\t^yJ8hSb[\u0001\u00110R^3r\ri*d:9\u0013\u0014\u0005({lP5\tib\r\u0002RONcP\u0018\bB(=\u0001%DOw`F\u0003'hL\u0006\b\u001b1T\u0004/~6MC*IsNOp#NmB\u00195kA4/2C\\.Kv\u0005S:\"r/pu\u001d^D1nLalG\u001c\u0011a\u0016n~_i\tB\\\u0014>\u0013\u007f\u0019pU~UjC\u0019\u0012\u00124|/-K\u001b>\f)tN+mfi~o\u0017)8\u001a<lXf4gBW!\t29\u0016\fbB\u0011\u007fL\u001av\u0015pe`~$?\bZM*BKI\u007fNJ9|\u00162\u0001\u000f\u0010\u001dQsK\t6\u001c4\u0003Gb9fb?\u0018cb&#p\u000e\u0003%7@\tVI8c\t/^~\u001eqz$aHA\u0010|\"Ys KgU\u000e\b09\u00166\\\u001c3i\b_@e\u0001?Z}\u0012\t\u00049B\u0014#68?//v\u0017,m\fy\rk*/\u001aa_X(#yjQG'\b_.\u0018Y Pp V\u000f)\rJR\u0012\u0002&/\u0017~^\u0013:\"(}cLX+*B\u0016\b\u0018]\u0003.I%dk`}v]6eZk\n~cI&]?\u001e8.c^_N\u0005o\fd`\u0019\u00056\u001fQ|Uw\u000bM0$|\u0019:xuSDlmt0\u0012", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidTextInputSession_androidKt {
    private static final String[] ALL_MIME_TYPES = {"*/*", "image/*", "video/*"};
    public static final boolean TIA_DEBUG = false;
    private static final String TIA_TAG = "AndroidTextInputSession";

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 */
    /* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`t#\u001a)'\"\u001e\u000f!52\b.177\u0017*9:188*-;2A?:6\u001eH", f = "\u000e:/<81+\u001a*<7\u000b/042\u0010!.-\"'%c\u0016\"\u0017$ \u0019\u0013[\u0018 ", i = {}, l = {59}, m = "?<2F9CGC*H>=DBFA3EYV,RU[[;N]^U\\\\", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 */
    /* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`t#\u001a)'\"\u001e\u000f!52\b.177\u0017*9:188*-;2A?:6\u001eH", f = "\u000e:/<81+\u001a*<7\u000b/042\u0010!.-\"'%c\u0016\"\u0017$ \u0019\u0013[\u0018 ", i = {}, l = {82}, m = "?<2F9CGC*H>=DBFA3EYV,RU[[;N]^U\\\\", n = {}, s = {})
    static final class AnonymousClass2 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, this);
        }
    }

    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final void logDebug(String str, Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession r13, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r14, androidx.compose.foundation.text.input.internal.TextLayoutState r15, androidx.compose.ui.text.input.ImeOptions r16, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r17, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> r18, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> r19, androidx.compose.ui.platform.ViewConfiguration r20, kotlin.coroutines.Continuation<?> r21) {
        /*
            r3 = r21
            boolean r0 = r3 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.AnonymousClass1
            if (r0 == 0) goto L30
            r12 = r3
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r12 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.AnonymousClass1) r12
            int r0 = r12.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L30
            int r0 = r12.label
            int r0 = r0 - r2
            r12.label = r0
        L1b:
            java.lang.Object r3 = r12.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r12.label
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L57
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r12 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            r12.<init>(r3)
            goto L1b
        L36:
            kotlin.ResultKt.throwOnFailure(r3)
            r3 = r13
            android.view.View r0 = r3.getView()
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r9 = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(r0)
            r12.label = r1
            r11 = r20
            r10 = r19
            r8 = r18
            r7 = r17
            r6 = r16
            r5 = r15
            r4 = r14
            java.lang.Object r0 = platformSpecificTextInputSession(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L5a
            return r2
        L57:
            kotlin.ResultKt.throwOnFailure(r3)
        L5a:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, kotlin.jvm.functions.Function1, kotlinx.coroutines.flow.MutableSharedFlow, androidx.compose.ui.platform.ViewConfiguration, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object platformSpecificTextInputSession$default(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1 function1, MutableSharedFlow mutableSharedFlow, ViewConfiguration viewConfiguration, Continuation continuation, int i2, Object obj) {
        MutableSharedFlow mutableSharedFlow2 = mutableSharedFlow;
        if ((i2 + 32) - (i2 | 32) != 0) {
            mutableSharedFlow2 = null;
        }
        return platformSpecificTextInputSession(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, function1, mutableSharedFlow2, (i2 & 64) == 0 ? viewConfiguration : null, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession r16, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r17, androidx.compose.foundation.text.input.internal.TextLayoutState r18, androidx.compose.ui.text.input.ImeOptions r19, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r20, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.ImeAction, kotlin.Unit> r21, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r22, kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> r23, androidx.compose.ui.platform.ViewConfiguration r24, kotlin.coroutines.Continuation<?> r25) {
        /*
            r3 = r25
            boolean r0 = r3 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.AnonymousClass2
            if (r0 == 0) goto L2d
            r4 = r3
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r4 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.AnonymousClass2) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2d
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L18:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 == r0) goto L59
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r4 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r4.<init>(r3)
            goto L18
        L33:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 r5 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3
            r15 = 0
            r14 = r24
            r6 = r23
            r9 = r22
            r13 = r21
            r12 = r20
            r11 = r19
            r8 = r18
            r7 = r17
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r4.label = r0
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r5, r4)
            if (r0 != r2) goto L5c
            return r2
        L59:
            kotlin.ResultKt.throwOnFailure(r3)
        L5c:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, kotlin.jvm.functions.Function1, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager, kotlinx.coroutines.flow.MutableSharedFlow, androidx.compose.ui.platform.ViewConfiguration, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 */
    /* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,h\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`t#\u001a)'\"\u001e\u000f!52\b.177\u0017*9:188*-;2A?:6\u001eHxFC9M@JNJ1OEDKIMH:L`]3Y\\bbBUde\\cc\u001a*", f = "\u000e:/<81+\u001a*<7\u000b/042\u0010!.-\"'%c\u0016\"\u0017$ \u0019\u0013[\u0018 ", i = {}, l = {129}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        final /* synthetic */ ComposeInputMethodManager $composeImm;
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TextLayoutState $layoutState;
        final /* synthetic */ Function1<ImeAction, Unit> $onImeAction;
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        final /* synthetic */ TransformedTextFieldState $state;
        final /* synthetic */ MutableSharedFlow<Unit> $stylusHandwritingTrigger;
        final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
        final /* synthetic */ ViewConfiguration $viewConfiguration;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(MutableSharedFlow<Unit> mutableSharedFlow, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, Function1<? super ImeAction, Unit> function1, ViewConfiguration viewConfiguration, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$stylusHandwritingTrigger = mutableSharedFlow;
            this.$state = transformedTextFieldState;
            this.$layoutState = textLayoutState;
            this.$composeImm = composeInputMethodManager;
            this.$this_platformSpecificTextInputSession = platformTextInputSession;
            this.$imeOptions = imeOptions;
            this.$receiveContentConfiguration = receiveContentConfiguration;
            this.$onImeAction = function1;
            this.$viewConfiguration = viewConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$receiveContentConfiguration, this.$onImeAction, this.$viewConfiguration, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1 */
        /* JADX INFO: compiled from: AndroidTextInputSession.android.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0014\u0006\u001a\u0017Q\u000e\u0014\u0017\u001d\u001dW\u0014\u001a!\u0013!\u001e\u0012\u001e`t#\u001a)'\"\u001e\u000f!52\b.177\u0017*9:188*-;2A?:6\u001eHxFC9M@JNJ1OEDKIMH:L`]3Y\\bbBUde\\cc\u001a*\u001c*", f = "\u000e:/<81+\u001a*<7\u000b/042\u0010!.-\"'%c\u0016\"\u0017$ \u0019\u0013[\u0018 ", i = {}, l = {84}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ComposeInputMethodManager $composeImm;
            final /* synthetic */ TransformedTextFieldState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$state = transformedTextFieldState;
                this.$composeImm = composeInputMethodManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$state, this.$composeImm, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransformedTextFieldState transformedTextFieldState = this.$state;
                    final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                    this.label = 1;
                    if (transformedTextFieldState.collectImeNotifications(new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0
                        @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                        public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
                            AndroidTextInputSession_androidKt.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(composeInputMethodManager, textFieldCharSequence, textFieldCharSequence2, z2);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            public static final void invokeSuspend$lambda$0(ComposeInputMethodManager composeInputMethodManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z2) {
                long jM1446getSelectiond9O1mEE = textFieldCharSequence.m1446getSelectiond9O1mEE();
                long jM1446getSelectiond9O1mEE2 = textFieldCharSequence2.m1446getSelectiond9O1mEE();
                TextRange textRangeM1445getCompositionMzsxiRA = textFieldCharSequence.m1445getCompositionMzsxiRA();
                TextRange textRangeM1445getCompositionMzsxiRA2 = textFieldCharSequence2.m1445getCompositionMzsxiRA();
                if (z2 && textFieldCharSequence.m1445getCompositionMzsxiRA() != null && !textFieldCharSequence.contentEquals(textFieldCharSequence2)) {
                    composeInputMethodManager.restartInput();
                } else if (!TextRange.m6116equalsimpl0(jM1446getSelectiond9O1mEE, jM1446getSelectiond9O1mEE2) || !Intrinsics.areEqual(textRangeM1445getCompositionMzsxiRA, textRangeM1445getCompositionMzsxiRA2)) {
                    composeInputMethodManager.updateSelection(TextRange.m6121getMinimpl(jM1446getSelectiond9O1mEE2), TextRange.m6120getMaximpl(jM1446getSelectiond9O1mEE2), textRangeM1445getCompositionMzsxiRA2 != null ? TextRange.m6121getMinimpl(textRangeM1445getCompositionMzsxiRA2.m6127unboximpl()) : -1, textRangeM1445getCompositionMzsxiRA2 != null ? TextRange.m6120getMaximpl(textRangeM1445getCompositionMzsxiRA2.m6127unboximpl()) : -1);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.$state, this.$composeImm, null), 1, null);
                MutableSharedFlow<Unit> mutableSharedFlow = this.$stylusHandwritingTrigger;
                if (mutableSharedFlow != null) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(mutableSharedFlow, this.$composeImm, null), 3, null);
                }
                final CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(this.$state, this.$layoutState, this.$composeImm, coroutineScope);
                PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
                final TransformedTextFieldState transformedTextFieldState = this.$state;
                final ImeOptions imeOptions = this.$imeOptions;
                final ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                final Function1<ImeAction, Unit> function1 = this.$onImeAction;
                final TextLayoutState textLayoutState = this.$layoutState;
                final ViewConfiguration viewConfiguration = this.$viewConfiguration;
                this.label = 1;
                if (platformTextInputSession.startInputMethod(new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$$ExternalSyntheticLambda0
                    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                    public final InputConnection createInputConnection(EditorInfo editorInfo) {
                        return AndroidTextInputSession_androidKt.AnonymousClass3.invokeSuspend$lambda$2(transformedTextFieldState, imeOptions, receiveContentConfiguration, composeInputMethodManager, function1, cursorAnchorInfoController, textLayoutState, viewConfiguration, editorInfo);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        public static final InputConnection invokeSuspend$lambda$2(final TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, final ReceiveContentConfiguration receiveContentConfiguration, final ComposeInputMethodManager composeInputMethodManager, final Function1 function1, final CursorAnchorInfoController cursorAnchorInfoController, final TextLayoutState textLayoutState, final ViewConfiguration viewConfiguration, EditorInfo editorInfo) {
            AndroidTextInputSession_androidKt.logDebug$default(null, new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "createInputConnection(value=\"" + ((Object) transformedTextFieldState.getVisualText()) + "\")";
                }
            }, 1, null);
            TextInputSession textInputSession = new TextInputSession() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1
                @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                public TextFieldCharSequence getText() {
                    return transformedTextFieldState.getVisualText();
                }

                @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                public void requestEdit(Function1<? super EditingBuffer, Unit> function12) {
                    TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
                    TextFieldState textFieldState = transformedTextFieldState2.textFieldState;
                    InputTransformation inputTransformation = transformedTextFieldState2.inputTransformation;
                    TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                    textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                    function12.invoke(textFieldState.getMainBuffer$foundation_release());
                    textFieldState.commitEditAsUser(inputTransformation, false, textFieldEditUndoBehavior);
                }

                @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                public void sendKeyEvent(KeyEvent keyEvent) {
                    composeInputMethodManager.sendKeyEvent(keyEvent);
                }

                @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                /* JADX INFO: renamed from: onImeAction-KlQnJC8, reason: not valid java name */
                public void mo1474onImeActionKlQnJC8(int i2) {
                    Function1<ImeAction, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(ImeAction.m6285boximpl(i2));
                    }
                }

                @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                public boolean onCommitContent(TransferableContent transferableContent) {
                    ReceiveContentConfiguration receiveContentConfiguration2 = receiveContentConfiguration;
                    if (receiveContentConfiguration2 != null) {
                        return receiveContentConfiguration2.onCommitContent(transferableContent);
                    }
                    return false;
                }

                @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                public void requestCursorUpdates(int i2) {
                    cursorAnchorInfoController.requestUpdates(i2);
                }

                @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                public int performHandwritingGesture(HandwritingGesture handwritingGesture) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        return HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation_release(transformedTextFieldState, handwritingGesture, textLayoutState, viewConfiguration);
                    }
                    return 2;
                }

                @Override // androidx.compose.foundation.text.input.internal.TextInputSession
                public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        return HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation_release(transformedTextFieldState, previewableHandwritingGesture, textLayoutState, cancellationSignal);
                    }
                    return false;
                }
            };
            EditorInfo_androidKt.m1483updatepLxbY9I(editorInfo, transformedTextFieldState.getVisualText(), transformedTextFieldState.getVisualText().m1446getSelectiond9O1mEE(), imeOptions, receiveContentConfiguration != null ? AndroidTextInputSession_androidKt.ALL_MIME_TYPES : null);
            return new StatelessInputConnection(textInputSession, editorInfo);
        }
    }

    static /* synthetic */ void logDebug$default(String str, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = TIA_TAG;
        }
        logDebug(str, function0);
    }
}
