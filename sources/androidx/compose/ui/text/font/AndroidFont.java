package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AndroidFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN6Xx@ş\u001c{b#\u0014#\u0001\u0004P[/\u000e&\u0017Ofg\u0016oZ^\u0019E'\u0006D{̶0Ic|\u001e-\u001f6PoW3{pM=nvN\u0005N52<\b\n\u0019\u001aXNǘzzQR\\)>@\t:\u0001\u000e͘\u0004܅ǀ\u0005=ŋ\u0005&dg\\@`ncB=,SxPP?_^\u007f֔\u0011L\\܋%xg)9L\bD#*k\u00035XÜC\tGмU\u0007n459ɡs`>[\u0006Ў1YN\u0015]xEف\ta"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-.MDz\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", ":nP1\\5@A(\fvm,~\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FT *LGDm\"-\"dp9\tw\u0002", "Bx_2Y(<S\u007f\tv],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-.MDzr\r)sa:\u0003a,5\u0001#FL[\u0002", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG{@l#8QB\u001cu=-SWuD\u0007d(Lv\u000eQHM,i(YC\u001e!a\u0012Wt\u0012\u0016a\u000b(wS7,\u0011(PK\u001ah\u0002\b&\u0015DHzKd\u001fT\n\u0013\u0005K6PBfeyT\u0017\tS", "D`a6T;B]\"lzm;\u0001\u00121s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG{@l#8QB\u001cu=-SWuD\u0007d(Lv\u000eQHM,i(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKJh\u0014\u001b_\u000f?s\u007f\f7\u001aP\t\u0006qN-dU]i\u0003\u0006/Eq9h\u0015a+2!@.#x\u001d$2U?\u0012EW\u001a\u0002R\u0007pcNbY8%:}bU#y^J\u00044/I\u000b\u0002\u001f\u001aT\u00021t:Yw\u001b", "5dc\u0019b(=W\"\u0001hm9x\u0018/g\u0014of&i\u0004}([", "u(8", "\u0017", "5dc!l7>T\u0015|zE6x\b/r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG{@l#8QB\u001cu=-SWuD\u0007d(Lv\u000eQHM,i(", "5dc#T9BO(\u0003\u0005g\u001a|\u0018>i\t*\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001fIP?gC\"\u001fq '\u0007r;R\u007f)U\"", "\"x_2Y(<S\u007f\tv],\n", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final TypefaceLoader typefaceLoader;
    private final FontVariation.Settings variationSettings;

    /* JADX INFO: compiled from: AndroidFont.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JfN\u0013hݷZ\u000f\u001az|Bi$\nEQTH~R\r]P\u007fg\u001dM\u000b\u000fQ\u0013\u001e\u0016'or֖\u0014ޯa\u0012\u001d8\u000b\bM:eqS8\u000fuf\t.4:8(\b1\u001e8L(v)H\u00120ݮ/ϋ\u0084:V\u0015O\u000b9@\u0005̭$\tɧ`f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-.MDzr\r)sa:\u0003a,5\u0001#FL[\u0002", "", "/vP6g\u0013HO\u0018", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-.MDz\n", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g%l+H\u0007v;\u0018w1P[\u0018\beQ\u007fG\u0018\u0011;\u0018W:bk_K3uH@h\u00066V\fKw\u0005\u0015\u0016\u001c~HzKe\u0014P\n\u0011\u0005E3q\u001c\u001dF~CRA,1`\u0015afF7?$\u0012\u0001n", ":nP153HQ\u001f\u0003\u0004`", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface TypefaceLoader {
        Object awaitLoad(Context context, AndroidFont androidFont, Continuation<? super android.graphics.Typeface> continuation);

        android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont);
    }

    public /* synthetic */ AndroidFont(int i2, TypefaceLoader typefaceLoader, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, typefaceLoader, settings);
    }

    @Deprecated(message = "\u0015K\fArw\u001a[\u0018^1\u000fXT2]j`~(\u0017q\rf\u007fU|*Q\u00042y|^yEakz", replaceWith = @ReplaceWith(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    @InterfaceC1492Gx
    public /* synthetic */ AndroidFont(int i2, TypefaceLoader typefaceLoader, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, typefaceLoader);
    }

    private AndroidFont(int i2, TypefaceLoader typefaceLoader, FontVariation.Settings settings) {
        this.loadingStrategy = i2;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo6180getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    private AndroidFont(int i2, TypefaceLoader typefaceLoader) {
        this(i2, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }
}
