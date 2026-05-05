package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,n\bӵLc\u000b\u0004I\u00066\u0013Fb\rӬD\u0012&\u0006\u0017nG0\\ev/\u0003W8\u0011\u0004{b%\"$܇BПڈ\u001e\u007f(\f]R\u007f\b|Or\u000bq\u000e6\u001a\u0007jDI\u0004y\u000e\u0016\u001d4Zom4\u0014o\u00818śҽ:\u0007&80<\u0012%\u000f!BH>u+GY\f*0nqjV\u001bO\u001d\u001a@\u0007\u0005 Ԯ\u001dձʄR8Ntk>GC\u0011rZNU^`\u0001[\r^TU\u000e'e,-X7c\u0016kSЁ\u0006ѸÜC\u0005E{K\tؕ',3LyɰR\u0007~Е\u00196"}, d2 = {"1n\\=h;>4\u001d\u0006\u0002A,\u0001\u000b2t", "", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2rc \\A>", "1n\\=h;>4\u001d\u0006\u0002A,\u0001\u000b2tG,b\u001dj\u0005tY", "uI9u9", "1n\\=h;>4\u001d\u0006\u0002F(\u0010g3m\u007f1\nD\u000b ", "1n\\=h;>4\u001d\u0006\u0002F(\u0010g3m\u007f1\nD\u000b ^KVj&d\u0003G", "1n\\=h;>4\u001d\u0006\u0002F0\u0006g3m\u007f1\nD\u000b ", "1n\\=h;>4\u001d\u0006\u0002F0\u0006g3m\u007f1\nD\u000b ^KVj&d\u0003G", "1n\\=h;>4\u001d\u0006\u0002P0{\u00182", "1n\\=h;>4\u001d\u0006\u0002P0{\u00182-\u0004\u000fX*nt)", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContentScaleKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m5511computeFillMaxDimensioniLBOSCw(long j2, long j3) {
        return Math.max(m5513computeFillWidthiLBOSCw(j2, j3), m5510computeFillHeightiLBOSCw(j2, j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m5512computeFillMinDimensioniLBOSCw(long j2, long j3) {
        return Math.min(m5513computeFillWidthiLBOSCw(j2, j3), m5510computeFillHeightiLBOSCw(j2, j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m5513computeFillWidthiLBOSCw(long j2, long j3) {
        return Size.m4006getWidthimpl(j3) / Size.m4006getWidthimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m5510computeFillHeightiLBOSCw(long j2, long j3) {
        return Size.m4003getHeightimpl(j3) / Size.m4003getHeightimpl(j2);
    }
}
