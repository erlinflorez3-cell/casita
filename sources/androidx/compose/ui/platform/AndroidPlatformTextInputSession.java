package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: AndroidPlatformTextInputSession.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1Le^.ZS0\u0010s{B-c$wCCU0}*\teNogtLb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012\u001d1JģG3coE9ft<ӌ6݅R8(\u00041\u001aXHP\u0012\u000bGY\r*0nrJV\u001bP\u001d\u001a@\nN$\u000f#tg|6Ղp]H5k\u0011wVf)u/+b=Jb=%v\u00105sTEM-%\u0002\u001c7ViY\u001b? XKةeݳ/I\u0002s\u0007h\u000e\u001b-+}\u00154č)ػ\tUx\u000e-4]m\u001c\\\u001c-\u0010z*\r\u0013ǌ\u0010Ν+H6Ʀju\u0016\u0019Kt!_v\u0015ؿbF\u0018|gA%2PM9G3lacK\u0019|G*\u0014c̗%ҠmďǵS\r\u05ce\u0019\u001d\\w_B\"LKKf\n\bADՑrĊ\u0006*\f\u0382\u0018\u0012=|).E'\u000eٚ;؝%q\n҆\\i|\u0017n{\u05c8i[PC(ä2e)\u0011\f`c\u0087\t\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u0019T?Jl>+\u001dWaL\u0016G5Y\u000765L\\:`\\{\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp'\u0007q:R\u000105JX7\\(", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "BdgA<5Ic(lzk=\u0001\u0007/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9\\", "1na<h;B\\\u0019lxh7|", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005z41$2eB\u0012s;\u0018e'Z[25gb\u0002+\u0014\u001fk\u0012L+bk_K3uH@2Q*S\u000fEx\u0010\u0010\u001f\u000eC4NLc\u001aW\t\u0019~A\u0017fPd_O\u000b2", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "7rA2T+R4#\fXh5\u0006\t-t\u00042\u0005", "", "u(I", ";dc5b+,S'\r~h5d\u0019>e\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nn\u0017%Us\u0018E^5DY\u0011u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\t0FU\u0016=PM:Y4,#lkB\\", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "1qT.g,\"\\$\u000f\n<6\u0006\u0012/c\u000f,\u0006I", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)@m\u0014=QMDA", "=tc\u000eg;Ka", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9m;z4?fa)8wk", "AsP?g\u0010G^)\u000eb^;\u007f\u0013.", "", "@d`BX:M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp!\u0007r/Xu\u0014GX^,jaH", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~D\u0005\u001cFn ;U2;~C\u0002\u001esqHnc;Q\u0001&4LZ<\\`\u0002\u0013z\u0018d\u001dU/\u0016NWK1xTF#\u0011,WK\u0019r\n\u001b\u001a\u0017Ef\u007fF`\u0019\u001d={z=:d\u0010`[\u0003I\u000b/_/d\nnr", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, CoroutineScope {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final AtomicReference<SessionMutex.Session<T>> methodSessionMutex = SessionMutex.m3786constructorimpl();
    private final TextInputService textInputService;
    private final View view;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidPlatformTextInputSession.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\b\u0005z\u000f\u0002\f\u0010\fMa\u0010\u0007\u0016\u0014\u000f\u000bw\u0015\u000b\u001f\u0012\u001c \u001c\u0004\u0016*'|#&,,\f\u001f./&--", f = "\u000e:/<81+\u00161%7(02,\u0012\"4/\u0003'(,*\b\u0019&%\u001a\u001f\u001d[\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\u0010\u0018", i = {}, l = {73}, m = "BD2DG\u001dCFLL&?ODLB", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return AndroidPlatformTextInputSession.this.startInputMethod(null, this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, CoroutineScope coroutineScope) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = coroutineScope;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m3790getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startInputMethod(final androidx.compose.ui.platform.PlatformTextInputMethodRequest r8, kotlin.coroutines.Continuation<?> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession.AnonymousClass1
            if (r0 == 0) goto L2b
            r6 = r9
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r6 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2b
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L16:
            java.lang.Object r1 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 == r4) goto L4e
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2b:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r6.<init>(r9)
            goto L16
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r3 = r7.methodSessionMutex
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r1 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r0 = 0
            r1.<init>(r0)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r6.label = r4
            java.lang.Object r0 = androidx.compose.ui.SessionMutex.m3793withSessionCancellingPreviousimpl(r3, r2, r1, r6)
            if (r0 != r5) goto L51
            return r5
        L4e:
            kotlin.ResultKt.throwOnFailure(r1)
        L51:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidPlatformTextInputSession.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,h\bӵLc\u000b\u0004OيH\u000b\\A/&:\u0012\u0010\u0007\u0015k\u007fӏ\u0003"}, d2 = {"\n`]<a@F])\rS", "", ";dc5b+,S'\r~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\t0FU\u0016=PM:Y4,#lkB\\"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\b\u0005z\u000f\u0002\f\u0010\fMa\u0010\u0007\u0016\u0014\u000f\u000bw\u0015\u000b\u001f\u0012\u001c \u001c\u0004\u0016*'|#&,,\f\u001f./&--c46$69\u000f58>>\u00181A6>4t\u0005", f = "\u000e:/<81+\u00161%7(02,\u0012\"4/\u0003'(,*\b\u0019&%\u001a\u001f\u001d[\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\u0010\u0018", i = {0}, l = {185}, m = "8>GA>9(KJH>H?", n = {"\\[vNaZ5LIMO9E"}, s = {"xQ^"})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<InputMethodSession, Continuation<?>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = AndroidPlatformTextInputSession.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InputMethodSession inputMethodSession, Continuation<?> continuation) {
            return ((AnonymousClass3) create(inputMethodSession, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
                final AndroidPlatformTextInputSession androidPlatformTextInputSession = AndroidPlatformTextInputSession.this;
                this.L$0 = inputMethodSession;
                this.L$1 = androidPlatformTextInputSession;
                this.label = 1;
                AnonymousClass3 anonymousClass3 = this;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(anonymousClass3), 1);
                cancellableContinuationImpl.initCancellability();
                androidPlatformTextInputSession.textInputService.startInput();
                cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        inputMethodSession.dispose();
                        androidPlatformTextInputSession.textInputService.stopInput();
                    }
                });
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(anonymousClass3);
                }
                if (result == coroutine_suspended) {
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
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m3790getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }
}
