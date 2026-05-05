package androidx.compose.ui.graphics;

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
/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007lkA0RnP.XT2\u000fy\u0002<$a&yCIU\"}(\tWNuzvJ`\u000fIs\u001cǝ\u0017\u0005\\I\u0004w\u0016\u0011)zH}PKM\u001eO\u007f\u0005=\u0001\u00133J\"f\f5\u0005(>`\u0010%\u0010sQ\u0012\u0012>V\t:\u0001\u001a}\u000b \u0012\u0014U8\u0001Li\u0018T<HzlR/Q\u0010\u001aHT'm<\u0015M;S\u0005-\u0013vo6C@eBE+Y\u0003\u0015ks?1L8aUx5'CI\"X\rހ\u0002Џ\u0019/g\u000fct4_Ugn\u0010?+}h\"כ\u0010Âv\u07beց\f;Ǭ\u0012\n?J43(mX\u001eA|\u000bSnYXްDȸ~eN\u0019+\nA6\n+t]y;G[\u000eߍ\u0007ڟ\"'\u0019p'ib\u00151%)c\u0010Q_^\u0017קJݳ\u000e]Uo\n\u0001p\tň\u00030ϝ\u007f>\u0004\u00144ϱAeZA#'\u000b\nJJ\u0007%\u0004ÄlnנVI"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "5dc\u0010b3H`\u0007\nv\\,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}{\u001fokFtn(Lv|", "1n]3\\.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "5dc\u0010b5?W\u001bFtl\u001d\u000b\u00171Q", "u(8", "6`b\u000e_7AO", "", "5dc\u0015T:\u001aZ$\u0002v", "u(I", "6dX4[;", "", "5dc\u0015X0@V(", "EhSA[", "5dc$\\+MV", ">qT=T9>B#]\bZ>", "", "@dP1C0QS \r", "0tU3X9", "", "AsP?g\u001f", "AsP?g ", "0tU3X9(T\u001a\rzm", "Asa6W,", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ImageBitmap {
    public static final Companion Companion = Companion.$$INSTANCE;

    ColorSpace getColorSpace();

    /* JADX INFO: renamed from: getConfig-_sVssgQ */
    int mo4045getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7);

    /* JADX INFO: compiled from: ImageBitmap.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
    }

    static /* synthetic */ void readPixels$default(ImageBitmap imageBitmap, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        int i9 = i3;
        int i10 = i7;
        int width = i4;
        int height = i5;
        int i11 = i2;
        if (obj == null) {
            if ((-1) - (((-1) - i8) | ((-1) - 2)) != 0) {
                i11 = 0;
            }
            if ((i8 + 4) - (i8 | 4) != 0) {
                i9 = 0;
            }
            if ((-1) - (((-1) - i8) | ((-1) - 8)) != 0) {
                width = imageBitmap.getWidth();
            }
            if ((i8 + 16) - (i8 | 16) != 0) {
                height = imageBitmap.getHeight();
            }
            int i12 = (-1) - (((-1) - i8) | ((-1) - 32)) == 0 ? i6 : 0;
            if ((i8 + 64) - (i8 | 64) != 0) {
                i10 = width;
            }
            imageBitmap.readPixels(iArr, i11, i9, width, height, i12, i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
    }

    /* JADX INFO: compiled from: ImageBitmap.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gّ1!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?F*\u0012(\u001ds]B\u000bm5$", "", "u(E", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
