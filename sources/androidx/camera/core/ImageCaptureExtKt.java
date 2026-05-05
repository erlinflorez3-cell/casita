package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: ImageCaptureExt.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!4i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007tjAӄLe^.ZS8\u0015sڔ<$q$yّCU0}*ޛWN}gvJ`\u000b[\u001b\u0014ǝ\u0011lBH\u0004w\u0006\u0012=2\tnW\u0006[pU9\u000fv^\u0005N2RF\u007f\u0005\u000f\u001dBP x\u000bCy\u0011(/ntjf\u0013M\u0013 *\u0014N\"\u0011\u001e\u000bo^8Xl\f?E\"1prb-_>\u0006e\u001bVV7\r%k.-P7c\u001a;R1\u000e\u0019À}ƄCqK\u0010\u0001\u00025,as\u0006B\u0001\u007fB\u0015[S\u001bj\u000b&\u000b\u0013\u0002n\u0012'9R{S`\u00108w)\u0001#;2\u00126;N.; ~\u0016\u001e5\u0005r\u0002H`\u0004nB.\u007fw5E,0G19)oioK\u001b^7*\u000f\u001d 3\u0001\u001d&qS<g[Ø\u0013ɐU1_OשL^"}, d2 = {"5dc!T2>>\u001d|\nn9|u/q\u0010(\nO", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u001b\u001fCq\u000e:r0Di\u000b \u0001\\\u00124M.?iC.\"hN9\u0013s,\\\u0006|", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b \r", "B`Z2C0<b)\fz", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e'\u0004/HmS", "=m2.c;N`\u0019l\nZ9\f\t.", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=m2.c;N`\u0019i\bh*|\u0017=P\r2}M\u0001%%Gn", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "=m?<f;OW\u0019\u0011Wb;\u0005\u0005:A\u0011$\u007fG|\u0014\u001eG", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "uKP;W9HW\u0018\u0012D\\(\u0005\t<aI&\u0006M\u0001`zOk\u0010<T!@h\u000e-7C|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u0019\u0001s\u000bcP+rM\u0001$\u00194\u0013\u0003Kq~\u001b\u001a\u0018>x:#f\u0019E\t\u0019\u007fJt>-_i\tNEN,/u\u0014)\u001elC83\u0018{\")21>\u0013yb\u0015|[E=NM#\n?(G7YPRyeKx0\u001fYEU\u001c;gx4\u0005)\u001384?:H2l\u0014OZB\u001c(eCp\u00103A\u0013=Z9", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b uW&=XSJL8%\u0015UaG\u0017j;\\L", "=tc=h;\u001fW ~di;\u0001\u00138s", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b uW&=XSJL8%\u0015RlH\u000bm5\\L", "uKP;W9HW\u0018\u0012D\\(\u0005\t<aI&\u0006M\u0001`zOk\u0010<T!@h\u000e-7C|*VBHu8\u001d(2_5\u000fc9J@%QYNu@Zn?\u0014oV\u0019];\u001a\u0005\u0018+4}OG.h0P\u0002%s\u0010\u0010 \u0017C@WH`\u001fN}\u001e?F:p\u0010Zo\u0003EPIl3rU@-e8I(\u001ezcpOV8\u0019\u0003W\u001a<W\u000bo1H)\u000463BwdT\u000fPeEr6#U\u0005Cg\u0019^~:{1\r}/GlNLw!<m|\u001f5j\u000b\b6?:\"CUlAB%\u0014r.h\f\u0017,3;&ourL\u0018\u0007k`9?jn\u0005@b\u0002MMy\u001e|\neGW\u000b\u0011R\u000e vg\u0013-\u0018Y\u0001\u0018\u007f\u001a", "1`\\2e(\u0006Q#\fzX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageCaptureExtKt {
    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, Function0 function0, Function1 function1, Function1 function12, Continuation continuation, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            function0 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            function1 = null;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function12 = null;
        }
        return takePicture(imageCapture, function0, function1, function12, continuation);
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, Function0 function0, Function1 function1, Function1 function12, Continuation continuation, int i2, Object obj) {
        Function1 function13 = function1;
        Function0 function02 = function0;
        if ((i2 + 2) - (2 | i2) != 0) {
            function02 = null;
        }
        if ((4 & i2) != 0) {
            function13 = null;
        }
        return takePicture(imageCapture, outputFileOptions, function02, function13, (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? function12 : null, continuation);
    }

    public static final TakePictureRequest getTakePictureRequest(ImageCapture imageCapture) {
        Intrinsics.checkNotNullParameter(imageCapture, "<this>");
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, androidx.camera.core.DelegatingImageCapturedCallback] */
    public static final Object takePicture(ImageCapture imageCapture, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, final Function1<? super Bitmap, Unit> function12, Continuation<? super ImageProxy> continuation) throws Throwable {
        Executor executorDirectExecutor;
        CoroutineContext.Element element = continuation.getContext().get(ContinuationInterceptor.Key);
        DelegatingImageCapturedCallback delegatingImageCapturedCallback = null;
        CoroutineDispatcher coroutineDispatcher = element instanceof CoroutineDispatcher ? (CoroutineDispatcher) element : null;
        if (coroutineDispatcher == null || (executorDirectExecutor = ExecutorsKt.asExecutor(coroutineDispatcher)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            Intrinsics.checkNotNullExpressionValue(executorDirectExecutor, "directExecutor()");
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int i2) {
                Function1<Integer, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(Integer.valueOf(i2));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Function1<Bitmap, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(bitmap);
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.dispose();
                CancellableContinuation<ImageProxy> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(imageProxy));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException exception) {
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.dispose();
                CancellableContinuation<ImageProxy> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(exception)));
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$2
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
                DelegatingImageCapturedCallback delegatingImageCapturedCallback2;
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageCapturedCallback2 = null;
                } else {
                    delegatingImageCapturedCallback2 = objectRef.element;
                }
                delegatingImageCapturedCallback2.dispose();
            }
        });
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
        } else {
            delegatingImageCapturedCallback = (DelegatingImageCapturedCallback) objectRef.element;
        }
        imageCapture.m171lambda$takePicture$1$androidxcameracoreImageCapture(executorDirectExecutor, delegatingImageCapturedCallback);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, androidx.camera.core.DelegatingImageSavedCallback] */
    public static final Object takePicture(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, final Function1<? super Bitmap, Unit> function12, Continuation<? super ImageCapture.OutputFileResults> continuation) throws Throwable {
        Executor executorDirectExecutor;
        CoroutineContext.Element element = continuation.getContext().get(ContinuationInterceptor.Key);
        DelegatingImageSavedCallback delegatingImageSavedCallback = null;
        CoroutineDispatcher coroutineDispatcher = element instanceof CoroutineDispatcher ? (CoroutineDispatcher) element : null;
        if (coroutineDispatcher == null || (executorDirectExecutor = ExecutorsKt.asExecutor(coroutineDispatcher)) == null) {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            Intrinsics.checkNotNullExpressionValue(executorDirectExecutor, "directExecutor()");
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int i2) {
                Function1<Integer, Unit> function13 = function1;
                if (function13 != null) {
                    function13.invoke(Integer.valueOf(i2));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Function1<Bitmap, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(bitmap);
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.dispose();
                CancellableContinuation<ImageCapture.OutputFileResults> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(outputFileResults));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(ImageCaptureException exception) {
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                Intrinsics.checkNotNullParameter(exception, "exception");
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.dispose();
                CancellableContinuation<ImageCapture.OutputFileResults> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(exception)));
            }
        });
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$2
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
                DelegatingImageSavedCallback delegatingImageSavedCallback2;
                if (objectRef.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
                    delegatingImageSavedCallback2 = null;
                } else {
                    delegatingImageSavedCallback2 = objectRef.element;
                }
                delegatingImageSavedCallback2.dispose();
            }
        });
        if (objectRef.element == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("delegatingCallback");
        } else {
            delegatingImageSavedCallback = (DelegatingImageSavedCallback) objectRef.element;
        }
        imageCapture.m172lambda$takePicture$2$androidxcameracoreImageCapture(outputFileOptions, executorDirectExecutor, delegatingImageSavedCallback);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
