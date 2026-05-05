package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: BoringLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001d\u007fјnjO0L͜P.`Y2şs{J$cҕyCIZ\"}(\tWN}gvϺb\u000bQ\u0018\u000e\u0016~j4Ikxe\u0012\u00153JoU3UoC:fӞ6\u001bړb\"fxE\u0006 *Н\u0014v\tC\u0014p 1XphT=Q\u0013\u001d*\u0006l$1\"jlf6vr\u000e>=*\u001bipVWc>\u0006e\rt^W\u0011\u0005l6+nCe\u00193`\u001b\u0007\u0001go\u0007M\u007fU\u0005\u00176W/W\u0004o6\u0007\u0011D\u00199a%]!7\r\rW`\u001a:CQyJ~\"X}\u0001{\u001bQ\u001c\u000e4/\u000f3u:t\u001e&5\u000bq\u0002O\u0001\u0006lE\u0018z\u0010:G)\u000e8C9Il\u0002eI0f7*\u001dS#k\u000f|:sT<qE\u001fb\u0012i1\u007fB\u0004Mݹ\u000et"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u0014w#2VE\"gH(%wB5\u0005r6[\u000bt\u0015\"", "", "u(E", "1qT.g,", "\u001a`]1e6BRb\u000ezq;Fe9r\u00041}'|+!W~c", "BdgA", "", ">`X;g", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "EhSA[", "", "/kX4a4>\\(", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b~\\\u001e\u001bIx\u0016<\u007f4\u000b", ":h]2F7:Q\u001d\b|F<\u0004\u00183p\u0007,{M", "", ":h]2F7:Q\u001d\b|>?\f\u0016+", ";dc?\\*L", "\u001a`]1e6BRb\u000ezq;Fe9r\u00041}'|+!W~L$v4B]{.\r", "7mR9h+>>\u0015}yb5~", "", "CrT\u0013T3EP\u0015|\u0001E0\u0006\t\u001dp{&\u007fI\u0003", "3k[6c:Bh\u0019", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0018\u000bD\b%U6|\u001eEt!DYY/\r", "3k[6c:Bh\u0019}lb+\f\f", "7r1<e0GU", "BdgA70K", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0007\u007fM\u0001\u0015&Ky\u0017\u001fv5B]\f/;kk", "7r5._3;O\u0017\u0005ab5|v:a},\u0005B` \u0013Dv\u000e;", ":`h<h;", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class BoringLayoutFactory33 {
    public static final BoringLayoutFactory33 INSTANCE = new BoringLayoutFactory33();

    private BoringLayoutFactory33() {
    }

    @JvmStatic
    public static final BoringLayout.Metrics isBoring(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static /* synthetic */ BoringLayout create$default(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, float f2, float f3, BoringLayout.Metrics metrics, boolean z2, boolean z3, TextUtils.TruncateAt truncateAt, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
            truncateAt = null;
        }
        if ((i4 & 1024) != 0) {
            i3 = i2;
        }
        return create(charSequence, textPaint, i2, alignment, f2, f3, metrics, z2, z3, truncateAt, i3);
    }

    @JvmStatic
    public static final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, float f2, float f3, BoringLayout.Metrics metrics, boolean z2, boolean z3, TextUtils.TruncateAt truncateAt, int i3) {
        return new BoringLayout(charSequence, textPaint, i2, alignment, f2, f3, metrics, z2, truncateAt, i3, z3);
    }

    @JvmStatic
    public static final boolean isFallbackLineSpacingEnabled(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
