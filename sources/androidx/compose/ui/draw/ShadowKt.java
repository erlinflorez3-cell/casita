package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\u0010nj?1Le^.ZS0\u0011\u0004,Břs$ BcUH|R\r]N\u007fg\u001dK\u000b\u0011I\u000f\u0014\u0018\u0011jZL\u0006~c\u0012\u001d6Zom8\u0014t\u00818śҽ:\u0007&80?\u0012I\u000fɝBH>u#Cy\u000bB4NpRR;N5 \u0018\u0006L\"\u0019\u001e\u000bj~<Nlk>G#1nrT-_>\u0005e\rt]W\u0013|a,5X7c\u001ekXЁ\u0006ѸÜC\u0005E|K\u0011ؕ',3LyɰR\u0007~Е\u00198"}, d2 = {"AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3kTCT;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1kX=", "", "AgP1b>\u0006h\u001dg|=\u0013\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:d\u001c@l#8QBN52(\u001dskG\u0007-<R@)THY/`P\u0001\u0007\u0002\u0015V\u0019N\u0001\u0002H@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~zt\f>\u001aF}\u0016yA6>", "/lQ6X5M1#\u0006\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Ao^A66E]&", "AgP1b>\u0006ag\\\u0010Q\u0010`", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:d\u001c@l#8QBN52(\u001dskG\u0007-<R@)THY/`P\u0001\u0007\u0002\u0015V\u0019N\u0001\u0002i>\u0005\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:RZY/\u0004\u0014yB-hS/", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ShadowKt {
    /* JADX INFO: renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3844shadowziNgDLE$default(Modifier modifier, float f2, Shape shape, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            z2 = false;
            if (Dp.m6637compareTo0680j_4(f2, Dp.m6638constructorimpl(0)) > 0) {
                z2 = true;
            }
        }
        return m3843shadowziNgDLE(modifier, f2, shape, z2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0015K\fArw\u001a\u0017oP<\u0003\u0010(4O`[ f\u001cp\u0015U~\u0006omQy4z{\feOOemGZ\u0001BF!h\fz0\\\bNuMHt\u001bS#VZ\u00075\u0014s\u0019tK!]\u0011", replaceWith = @ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m3843shadowziNgDLE(Modifier modifier, float f2, Shape shape, boolean z2) {
        return m3841shadows4CzXII(modifier, f2, shape, z2, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* JADX INFO: renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3842shadows4CzXII$default(Modifier modifier, float f2, Shape shape, boolean z2, long j2, long j3, int i2, Object obj) {
        if ((2 & i2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = false;
            if (Dp.m6637compareTo0680j_4(f2, Dp.m6638constructorimpl(0)) > 0) {
                z2 = true;
            }
        }
        if ((8 & i2) != 0) {
            j2 = GraphicsLayerScopeKt.getDefaultShadowColor();
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            j3 = GraphicsLayerScopeKt.getDefaultShadowColor();
        }
        return m3841shadows4CzXII(modifier, f2, shape, z2, j2, j3);
    }

    /* JADX INFO: renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m3841shadows4CzXII(Modifier modifier, float f2, Shape shape, boolean z2, long j2, long j3) {
        return (Dp.m6637compareTo0680j_4(f2, Dp.m6638constructorimpl((float) 0)) > 0 || z2) ? modifier.then(new ShadowGraphicsLayerElement(f2, shape, z2, j2, j3, null)) : modifier;
    }
}
