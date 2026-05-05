package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: AndroidExternalSurface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JfP.hS2\u000fq\u007f<$q$yّCU(}*ޛWN}gvϺb\u000bQ\u0015\u000e\u0016~j4Ic\u0002e\u0012\u00154HoU\u074c}ok8\u0011td\u0005`=2<\b\u0006\u0019\u001aXJǘzzQNT0>Q\t:\u0001\u001f}\t(%\u001e>N\u0015N`ucNH\u001bsj31\u001a\u0002B|=&DE[\u001b^l';\u0010\u0012\"9SO5C9\u001a\u0017OpiY\u001b? O5l5:CI\"kf\\\u000e)-+}#\u000ev4s\u001dQ\u000f\"m?\u0018qYk&(&\r,\u0011J &\u0006U\\tAju\u0016\u0012Kt!XĖT\bfۍ\u0018|g<%,PS9A3f\u007fj\u0012ϑZӒz˜۵\u001d\"ъr/cT\u001cn-\u001dZ\u0002_<qBCT\\\u0017*K{\u0013\td\u0018)2@\u001eČ;ɨ\u0015.\u001f¦ڞ[B+$qɗdrf~\u0005f\b\u05eemo"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001>X\u000b*;lu6JC:j4\u001dt{p9\u0014l(Ud7TMJ*\\@\u00029#\u00120", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00021g}{@l#8QB\u001b~C\u001e\"q]@ts9Or%G:](kRH", "\u001a`]1e6BRb\u0010~^>Fw/x\u000f8\t@q\u001b\u0017Y.{L\u0004&1W}\u000f7\u0001%>ZC\"oB-\u0015qaF\\", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7CY\u001f", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "5dc\u001aT;KW,", "u(;.a+K]\u001d}D`9x\u00142i}6E(|&$K\u0003c", "Ata3T*>A\u001d\u0014z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc h9?O\u0017~hbA|P#b\u00140b\r\u0003", "u(9", "Adc h9?O\u0017~hbA|P9z\b=p+d", "uI\u0018#", "\u0018", "Ata3T*>B\u0019\u0012\nn9|v?r\u0001$y@", "\u001a`]1e6BRb\u0010~^>Fv?r\u0001$y@V", "=mBBe-:Q\u0019mzq;\r\u0016/A\u0011$\u007fG|\u0014\u001eG", "", "Ata3T*>B\u0019\u0012\nn9|", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016\fM\u0002\u0013\u0015G^\u000eO\u00065BYS", "EhSA[", "", "6dX4[;", "=mBBe-:Q\u0019mzq;\r\u0016/D\u007f6\u000bM\u000b+\u0017F", "", "=mBBe-:Q\u0019mzq;\r\u0016/S\u0004={\u001e\u0004\u0013 Io\r", "=mBBe-:Q\u0019mzq;\r\u0016/U\u000b'wO\u0001\u0016", "Ata3T*>", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {
    private final Matrix matrix;
    private long surfaceSize;
    private Surface surfaceTextureSurface;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public AndroidEmbeddedExternalSurfaceState(CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.surfaceSize = IntSize.Companion.m6813getZeroYbymL2g();
        this.matrix = new Matrix();
    }

    /* JADX INFO: renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m558getSurfaceSizeYbymL2g() {
        return this.surfaceSize;
    }

    /* JADX INFO: renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m559setSurfaceSizeozmzZPI(long j2) {
        this.surfaceSize = j2;
    }

    public final Matrix getMatrix() {
        return this.matrix;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (!IntSize.m6806equalsimpl0(this.surfaceSize, IntSize.Companion.m6813getZeroYbymL2g())) {
            i2 = IntSize.m6808getWidthimpl(this.surfaceSize);
            i3 = IntSize.m6807getHeightimpl(this.surfaceSize);
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (!IntSize.m6806equalsimpl0(this.surfaceSize, IntSize.Companion.m6813getZeroYbymL2g())) {
            i2 = IntSize.m6808getWidthimpl(this.surfaceSize);
            i3 = IntSize.m6807getHeightimpl(this.surfaceSize);
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
        Surface surface = this.surfaceTextureSurface;
        Intrinsics.checkNotNull(surface);
        dispatchSurfaceChanged(surface, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.surfaceTextureSurface;
        Intrinsics.checkNotNull(surface);
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }
}
