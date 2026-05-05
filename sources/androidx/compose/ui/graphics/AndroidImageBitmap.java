package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AndroidImageBitmap.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007f\u0007lkA0ZeP.XT2\u000fy\u0005<$a%yCI[\"}(\u000bWNugvJ`\u000bK\u000f\u0014)\u0001j2L[ތs܈?2pn\u007f>]sK9xtd\u0006ڶ6\"F{M\u0007(@`\u0010%\u0012\n_TP>X\t:\u0001$}\t(+\u001e>N\u001bN`uiNH\u001boj31\u001f\u0002B|9\u00104\u000ba%F\u00039=zo/C@eGE)a \u001fR\nQ3C\u007f[\u001dhU9q]DiDX\u0018\u0014C,&Ֆ_ę*b\rĩx\u000e-.]g\u001cb\u001c-\u0010z*\u0013rXdΑ)ρ212h\u000e\u0015A|CkNY\u001a^p\n16\rФ'Ƨ2ٿ߆\u001aeЂe?1P=\u0007\u0013\u0019n5\u000f{9[\u0003\u001c\u0017iqƯyΦ5UX?N]\u0018i\u000e\u007f\u0012\u0002z\u0002X\u0016f\u001cV\u0092} 2\u001b=9aL1-<\u0014VX\u007fv3r\u001f(@ʄJغ&r.90\u001e\u001afըd\u000esSZвH?L$T\r\u001dݚ\u0017?"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0011b|-Aq\u0015\u0012U?=k\u0011\"$p]D\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "uKP;W9HW\u0018H|k(\b\f3c\u000eqXD\u0010\u001f\u0013REQ-", "5dc\u000f\\;FO$=\u000bb&~\u0016+p\u0003,yNz$\u0017No\nJv", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001d\u0005&\u001fCzc", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "5dc\u0010b3H`\u0007\nv\\,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}{\u001fokFtn(Lv|", "1n]3\\.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "5dc\u0010b5?W\u001bFtl\u001d\u000b\u00171Q", "u(8", "6`b\u000e_7AO", "", "5dc\u0015T:\u001aZ$\u0002v", "u(I", "6dX4[;", "", "5dc\u0015X0@V(", "EhSA[", "5dc$\\+MV", ">qT=T9>B#]\bZ>", "", "@dP1C0QS \r", "0tU3X9", "", "AsP?g\u001f", "AsP?g ", "0tU3X9(T\u001a\rzm", "Asa6W,", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidImageBitmap implements ImageBitmap {
    private final Bitmap bitmap;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final Bitmap getBitmap$ui_graphics_release() {
        return this.bitmap;
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    /* JADX INFO: renamed from: getConfig-_sVssgQ */
    public int mo4045getConfig_sVssgQ() {
        return AndroidImageBitmap_androidKt.toImageConfig(this.bitmap.getConfig());
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public ColorSpace getColorSpace() {
        Api26Bitmap api26Bitmap = Api26Bitmap.INSTANCE;
        return Api26Bitmap.composeColorSpace$ui_graphics_release(this.bitmap);
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void readPixels(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        Bitmap bitmapAsAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        boolean z2 = false;
        if (bitmapAsAndroidBitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapAsAndroidBitmap = bitmapAsAndroidBitmap.copy(Bitmap.Config.ARGB_8888, false);
            z2 = true;
        }
        bitmapAsAndroidBitmap.getPixels(iArr, i6, i7, i2, i3, i4, i5);
        if (z2) {
            bitmapAsAndroidBitmap.recycle();
        }
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public boolean getHasAlpha() {
        return this.bitmap.hasAlpha();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }
}
