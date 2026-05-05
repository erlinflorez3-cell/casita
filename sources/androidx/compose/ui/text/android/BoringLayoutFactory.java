package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
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
/* JADX INFO: compiled from: BoringLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001d\u007fјnjO0L͜P.`Y2şs{J$cҕyCQU\"Ԃ*\t]WogtJb\u000bY\u000f\u000e\u0016~m4Ikxe܈\u0015̱B\u0006ЀcM\u001e<yez6ӯ$208B]\u000f\u001bBH>x+GY\u000f*0ntjV\u001bR\u001d\u001a@\fn$\u000f%tg|>xpkCG#1srT-_>\be\rt`W\u0013|a,8X7c#UY\t\u0007`jW\u0003m\u007fm\rn'5;aum5\u0007\u0011D\u001b1O\u001bo\u000b&\u000b\r\u001al\u001a:CO\u0012Y\u0001\u00126\f\u0013{;>L,\u0014<`0C\u0019\u0015\u0012>7\u0003uk@~\u0006\u000fF\u000e\u007fy6E+079O3f\u007fxދ\u001df"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i\u0014w#2VE\"gH(%wB5\u0005r6[\u000b|", "", "u(E", "1qT.g,", "\u001a`]1e6BRb\u000ezq;Fe9r\u00041}'|+!W~c", "BdgA", "", ">`X;g", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "EhSA[", "", ";dc?\\*L", "\u001a`]1e6BRb\u000ezq;Fe9r\u00041}'|+!W~L$v4B]{.\r", "/kX4a4>\\(", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b~\\\u001e\u001bIx\u0016<\u007f4\u000b", "7mR9h+>>\u0015}yb5~", "", "CrT\u0013T3EP\u0015|\u0001E0\u0006\t\u001dp{&\u007fI\u0003", "3k[6c:Bh\u0019", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0018\u000bD\b%U6|\u001eEt!DYY/\r", "3k[6c:Bh\u0019}lb+\f\f", "7r5._3;O\u0017\u0005ab5|v:a},\u0005B` \u0013Dv\u000e;", ":`h<h;", ";dP@h9>", "BdgA70K", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0007\u007fM\u0001\u0015&Ky\u0017\u001fv5B]\f/;kk", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BoringLayoutFactory {
    public static final int $stable = 0;
    public static final BoringLayoutFactory INSTANCE = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public final BoringLayout.Metrics measure(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? BoringLayoutFactory33.isBoring(charSequence, textPaint, textDirectionHeuristic) : BoringLayoutFactoryDefault.isBoring(charSequence, textPaint, textDirectionHeuristic);
    }

    public static /* synthetic */ BoringLayout create$default(BoringLayoutFactory boringLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i2, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z2, boolean z3, TextUtils.TruncateAt truncateAt, int i3, int i4, Object obj) {
        if ((i4 + 16) - (16 | i4) != 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            z2 = false;
        }
        if ((i4 + 64) - (64 | i4) != 0) {
            z3 = true;
        }
        if ((128 & i4) != 0) {
            truncateAt = null;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
            i3 = i2;
        }
        return boringLayoutFactory.create(charSequence, textPaint, i2, metrics, alignment, z2, z3, truncateAt, i3);
    }

    public final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i2, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z2, boolean z3, TextUtils.TruncateAt truncateAt, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("negative width".toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("negative ellipsized width".toString());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.create(charSequence, textPaint, i2, alignment, 1.0f, 0.0f, metrics, z2, z3, truncateAt, i3);
        }
        return BoringLayoutFactoryDefault.create(charSequence, textPaint, i2, alignment, 1.0f, 0.0f, metrics, z2, truncateAt, i3);
    }

    public final boolean isFallbackLineSpacingEnabled(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.isFallbackLineSpacingEnabled(boringLayout);
        }
        return false;
    }
}
