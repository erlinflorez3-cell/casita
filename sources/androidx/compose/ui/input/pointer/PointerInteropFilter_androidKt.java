package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.drew.metadata.exif.ExifDirectoryBase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: PointerInteropFilter.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007njG0LeN.ZS@\u000fsڔ<$i-yّCU0}*ޛg{u˧\u0007J\t\nk\u000f4\u0015)\n:Im\u0014m#\u001fApqУ7Wu@Ifz:\u0015\"8(^~\u0015\u0003**v\u0016%{\nP$<>G\t:\u0001\fu\u0005H\u00116F&\u0001,d\u007fPLG\u001bfj?1\r\u0002N^)o0+O\u001dHd';\u0002\u0010\u001fqEOG#,k\u00035Q\u0004?1>\"A\u0013t?'YV:V͕\\\u000e"}, d2 = {";nc6b5\u001ed\u0019\b\nL7\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "E`c0[,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ";nc6b5\u001ed\u0019\b\n", "", ">nX;g,K7\"\u000ezk6\bi3l\u000f(\t", "@d`BX:M2\u001d\rve3\u0007\u001b\u0013n\u000f(\t>\u0001\"&6y\u001e:y\u0005FY\u0007/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001Z\u0016:]CIz\u0013\"#dh@\u0011u\u0010W\u0006'TJN7kA|M\u0012\u0015:\u001fN4\u001cZ", "=mC<h*A3*~\u0004m", "", "DhTD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG{@l#8QB,o40wrh8\u0007p\u0002", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerInteropFilter_androidKt {
    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, function1);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2 */
    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function1<MotionEvent, Boolean> $onTouchEvent;
        final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super MotionEvent, Boolean> function1, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
            super(3);
            function1 = function1;
            requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(374375707);
            ComposerKt.sourceInformation(composer, "C78@3403L35:PointerInteropFilter.android.kt#a556rk");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(374375707, i2, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1407636232, "CC(remember):PointerInteropFilter.android.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new PointerInteropFilter();
                composer.updateRememberedValue(objRememberedValue);
            }
            PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            pointerInteropFilter.setOnTouchEvent(function1);
            pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return pointerInteropFilter;
        }
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new Function1<MotionEvent, Boolean>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter.3
            AnonymousClass3() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(MotionEvent motionEvent) {
                boolean zDispatchTouchEvent;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            }
        });
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3 */
    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", ";nc6b5\u001ed\u0019\b\n", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "7me<^,", "uKP;W9HW\u0018H\fb,\u000fR\u0017o\u000f,\u0006I`(\u0017P~c\u007f]*1jyi>i\u001f0\u0017 Eu;\u001e\u0011q7"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<MotionEvent, Boolean> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1 */
    /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u0001\u0007\n\u0010\u0010J\u000e\u000e\t\u000f\u0016\b\u0016Ru\u0016\u0011\u0017\u001e\u0010\u001eu\u001c#\u0015#!#y\u001e\"+\u001d+\u0019\u001c*!0.)%\r7g25;188\u0010B2<C#AKv\u0005", f = "\u001d;48=-9\u000f38(400\u0005')0 ,f\u0019%\u001a'#\u001c\u0016^\u001b#", i = {}, l = {345}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<MotionEvent, Unit> $watcher;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super MotionEvent, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$watcher = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$watcher, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(new C01171(this.$watcher, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1 */
        /* JADX INFO: compiled from: PointerInteropFilter.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u0001\u0007\n\u0010\u0010J\u000e\u000e\t\u000f\u0016\b\u0016Ru\u0016\u0011\u0017\u001e\u0010\u001eu\u001c#\u0015#!#y\u001e\"+\u001d+\u0019\u001c*!0.)%\r7g25;188\u0010B2<C#AKv\u0005x\u0007", f = "\u001d;48=-9\u000f38(400\u0005')0 ,f\u0019%\u001a'#\u001c\u0016^\u001b#", i = {0}, l = {ExifDirectoryBase.TAG_JPEG_TABLES}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0007\u001d\u0017%\u001b}y\n\u0017g"}, s = {"xQ^"})
        static final class C01171 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<MotionEvent, Unit> $watcher;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01171(Function1<? super MotionEvent, Unit> function1, Continuation<? super C01171> continuation) {
                super(2, continuation);
                this.$watcher = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01171 c01171 = new C01171(this.$watcher, continuation);
                c01171.L$0 = obj;
                return c01171;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C01171) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x001a  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x002e A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x002c -> B:21:0x0012). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r5.label
                    r3 = 1
                    if (r0 == 0) goto L2f
                    if (r0 != r3) goto L37
                    java.lang.Object r2 = r5.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                    kotlin.ResultKt.throwOnFailure(r6)
                L12:
                    androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
                    android.view.MotionEvent r1 = r6.getMotionEvent$ui_release()
                    if (r1 == 0) goto L1f
                    kotlin.jvm.functions.Function1<android.view.MotionEvent, kotlin.Unit> r0 = r5.$watcher
                    r0.invoke(r1)
                L1f:
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r0 = r5
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r5.L$0 = r2
                    r5.label = r3
                    java.lang.Object r6 = r2.awaitPointerEvent(r1, r0)
                    if (r6 != r4) goto L12
                    return r4
                L2f:
                    kotlin.ResultKt.throwOnFailure(r6)
                    java.lang.Object r2 = r5.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                    goto L1f
                L37:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.AnonymousClass1.C01171.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    public static final Modifier motionEventSpy(Modifier modifier, Function1<? super MotionEvent, Unit> function1) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, function1, new AnonymousClass1(function1, null));
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, final RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, final Function1<? super MotionEvent, Boolean> function1) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("pointerInteropFilter");
                inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", requestDisallowInterceptTouchEvent);
                inspectorInfo.getProperties().set("onTouchEvent", function1);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter.2
            final /* synthetic */ Function1<MotionEvent, Boolean> $onTouchEvent;
            final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(final Function1<? super MotionEvent, Boolean> function12, final RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2) {
                super(3);
                function1 = function12;
                requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                composer.startReplaceGroup(374375707);
                ComposerKt.sourceInformation(composer, "C78@3403L35:PointerInteropFilter.android.kt#a556rk");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(374375707, i2, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
                }
                ComposerKt.sourceInformationMarkerStart(composer, 1407636232, "CC(remember):PointerInteropFilter.android.kt#9igjgp");
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new PointerInteropFilter();
                    composer.updateRememberedValue(objRememberedValue);
                }
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                pointerInteropFilter.setOnTouchEvent(function1);
                pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return pointerInteropFilter;
            }
        });
    }
}
