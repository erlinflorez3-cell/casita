package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import java.util.concurrent.atomic.AtomicReference;
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
/* JADX INFO: compiled from: ImageCaptureExt.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6B\u0005$4\u0012\u0006\u0007nj?0LeV4ZS0\u0010s{J$c$wCCU0}*\tUNog\u0005JbŏI\u000f\u001cǝ)jZH\u0016\u0004m\u0016\u001d2Zom2ޜs=Ga=:\u0013'J\"f\u0002M\u000f(3`\u0010%\u0003sO\u001a\u001cH@\u001fE\u0019!\u0016\u000b(\u001e\u001e>N\tdp0\\DU\u0005]h7S\u0007wPf'\u000e?CaUTb7%v\u0010&[DEF-%\u0002\u0015Mf$M\u0011R\n=3pW+9]\fWdmF(eE]\u000fu\u00016f\u0015Y~\u0010O-ebyO<'&}Rȡ>Ǭ\u0012\u0006/Ξ~A(f \u0010Is!Rv\u0011XތDȸ~eN\u0019+\u0005A1ݶ\u001f|"}, d2 = {"\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Ju\u0017No\u00108\u0006)>[a(3o\u0016\u001cIT;j\u0012\u001a\u001co^5\u0005i\u0002", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b uW\u001f\u0012U?=k\"\u001a&h`\u0017\u0003j3Kr%M\"", "2d[2Z(MS", "uKP;W9HW\u0018\u0012D\\(\u0005\t<aI&\u0006M\u0001`zOk\u0010<T!@h\u000e-7,\u007f71K7m4\f\u0011ya8d_3Us#ER$oM", "-cT9X.:b\u0019", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5dc\u0011X3>U\u0015\u000ez", "u(;.a+K]\u001d}\u000e(*x\u0011/r{qyJ\u000e\u0017`+w\n>v\u00031d\r0DmT\u0018V'Cg6\u001e\u0003dr9\u0006A(U}$CJT\u0002", "2hb=b:>", "", "=m2.c;N`\u0019i\bh*|\u0017=P\r2}M\u0001%%Gn", ">q^4e,La", "", "=m2.c;N`\u0019l\nZ9\f\t.", "=m4?e6K", "3wR2c;B]\"", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b \u0017\u0001\u0014.XR?u=s", "=m8:T.>A\u0015\u0010z]", "=tc=h;\u001fW ~g^:\r\u0010>s", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b uW&=XSJL8%\u0015UaG\u0017j;\\L", "=m?<f;OW\u0019\u0011Wb;\u0005\u0005:A\u0011$\u007fG|\u0014\u001eG", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "1`\\2e(\u0006Q#\fzX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DelegatingImageSavedCallback implements ImageCapture.OnImageSavedCallback {
    private final AtomicReference<ImageCapture.OnImageSavedCallback> _delegate;

    public DelegatingImageSavedCallback(ImageCapture.OnImageSavedCallback delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this._delegate = new AtomicReference<>(delegate);
    }

    private final ImageCapture.OnImageSavedCallback getDelegate() {
        return this._delegate.get();
    }

    public final void dispose() {
        this._delegate.set(null);
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureStarted() {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onCaptureProcessProgressed(int i2) {
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onCaptureProcessProgressed(i2);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onPostviewBitmapAvailable(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onPostviewBitmapAvailable(bitmap);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
        Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onImageSaved(outputFileResults);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public void onError(ImageCaptureException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        ImageCapture.OnImageSavedCallback delegate = getDelegate();
        if (delegate != null) {
            delegate.onError(exception);
        }
    }
}
