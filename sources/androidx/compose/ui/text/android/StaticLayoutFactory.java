package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
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
/* JADX INFO: compiled from: StaticLayoutFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG;L͜P.hS2şs{B*c$wDCU0}*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2I]xk\u0017\u00172HpG3[xE9fx>\u0005.E*8\u007f\u0007\u0007ʥ*^Ƶ'zqJL\u00176@¤>R\u001bMMݞ\u0011\u0014A8\u0001L`\u0018RDM\u0005]h5S\u0007wIf'\u000e8-Q\u001bOl';\u0001\u0012$1@E@-%\u0002\r7Xa?\u0011K\n=3rW-1I\u0002dNX.\"E1U\rk\u0002>\\3a\u0011\u0012-,]tcP<2(\u0003\u0002\rJ\u0016&\b=G\\@Jl\u000e\u000fA\t\u000bSnZ2dH\u0001\tvN\u0017S\u0016c1?\u001bthy;Gdg\u0002\u000b\r,;\u0019nOe\u0005\u0014f\u0015)m\u0010Q_kpCNN\u0018tUm2\u000b\u0013\b0\u0004>c\u0018/*\u001b^\u001d+7iV;!\u001a\fxJmv\u0013~\u0001S\u0018\\xF(n$VB\t:dtl\u000bk^tp.'LJu7\u0006\u000e\u0013.~\u0010>7$>o\u0018|w\u000ee]8?_jE}\u0007k<[ibAPic>{#\u0003\"@Tb3Z=̾U۱^\\0ίĞL\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i%|\u0012=QA\"gH(%wB5\u0005r6[\u000b|", "", "u(E", "2d[2Z(MS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i%|\u0012=QA\"gH(%wB5\u0005r6[\u000b\u000bOWU\u0002", "1qT.g,", "\u001a`]1e6BRb\u000ezq;Fv>a\u000f,y'|+!W~c", "BdgA", "", ">`X;g", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0013wD\n&l", "EhSA[", "", "AsP?g", "3mS", "BdgA70K", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0007\u007fM\u0001\u0015&Ky\u0017\u001fv5B]\f/;kk", "/kX4a4>\\(", "\u001a`]1e6BRb\u000ezq;Fo+y\n8\u000b~\\\u001e\u001bIx\u0016<\u007f4\u000b", ";`g\u0019\\5>a", "3k[6c:Bh\u0019", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u0018\u000bD\b%U6|\u001eEt!DYY/\r", "3k[6c:Bh\u0019}lb+\f\f", ":h]2F7:Q\u001d\b|F<\u0004\u00183p\u0007,{M", "", ":h]2F7:Q\u001d\b|>?\f\u0016+", "8tbA\\-BQ\u0015\u000e~h5d\u0013.e", "7mR9h+>>\u0015}yb5~", "", "CrT\u0013T3EP\u0015|\u0001E0\u0006\t\u001dp{&\u007fI\u0003", "0qT.^\u001aM`\u0015\u000ez`@", ":h]259>O\u001fl\nr3|", ":h]259>O\u001fp\u0005k+j\u0018Cl\u007f", "6x_5X5:b\u001d\t\u0004?9|\u0015?e\t&\u0010", ":dUA<5=S\"\u000e\t", "", "@hV5g\u0010GR\u0019\b\nl", "7r5._3;O\u0017\u0005ab5|v:a},\u0005B` \u0013Dv\u000e;", ":`h<h;", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StaticLayoutFactory {
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();
    public static final int $stable = 8;

    private StaticLayoutFactory() {
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i2, int i3, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z2, boolean z3, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2, int i12, Object obj) {
        int[] iArr3 = iArr;
        int i13 = i9;
        boolean z4 = z3;
        int i14 = i7;
        boolean z5 = z2;
        float f4 = f3;
        int i15 = i6;
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        TextDirectionHeuristic dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release = textDirectionHeuristic;
        int i16 = i8;
        Layout.Alignment dEFAULT_LAYOUT_ALIGNMENT$ui_text_release = alignment;
        float f5 = f2;
        int i17 = i5;
        int i18 = i10;
        int length = i4;
        int i19 = i3;
        if ((i12 + 8) - (i12 | 8) != 0) {
            i19 = 0;
        }
        if ((i12 + 16) - (i12 | 16) != 0) {
            length = charSequence.length();
        }
        if ((i12 + 32) - (i12 | 32) != 0) {
            dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release = LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release();
        }
        if ((-1) - (((-1) - i12) | ((-1) - 64)) != 0) {
            dEFAULT_LAYOUT_ALIGNMENT$ui_text_release = LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release();
        }
        if ((i12 + 128) - (i12 | 128) != 0) {
            i17 = Integer.MAX_VALUE;
        }
        if ((i12 + 256) - (i12 | 256) != 0) {
            truncateAt2 = null;
        }
        if ((i12 & 512) != 0) {
            i15 = i2;
        }
        if ((i12 & 1024) != 0) {
            f5 = 1.0f;
        }
        if ((i12 + 2048) - (i12 | 2048) != 0) {
            f4 = 0.0f;
        }
        if ((i12 + 4096) - (i12 | 4096) != 0) {
            i14 = 0;
        }
        if ((-1) - (((-1) - i12) | ((-1) - 8192)) != 0) {
            z5 = false;
        }
        if ((i12 & 16384) != 0) {
            z4 = true;
        }
        if ((32768 + i12) - (32768 | i12) != 0) {
            i16 = 0;
        }
        if ((-1) - (((-1) - 65536) | ((-1) - i12)) != 0) {
            i13 = 0;
        }
        if ((131072 & i12) != 0) {
            i18 = 0;
        }
        int i20 = (262144 + i12) - (262144 | i12) == 0 ? i11 : 0;
        if ((-1) - (((-1) - 524288) | ((-1) - i12)) != 0) {
            iArr3 = null;
        }
        return staticLayoutFactory.create(charSequence, textPaint, i2, i19, length, dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release, dEFAULT_LAYOUT_ALIGNMENT$ui_text_release, i17, truncateAt2, i15, f5, f4, i14, z5, z4, i16, i13, i18, i20, iArr3, (i12 & 1048576) == 0 ? iArr2 : null);
    }

    public final StaticLayout create(CharSequence charSequence, TextPaint textPaint, int i2, int i3, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z2, boolean z3, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        return delegate.create(new StaticLayoutParams(charSequence, i3, i4, textPaint, i2, textDirectionHeuristic, alignment, i5, truncateAt, i6, f2, f3, i7, z2, z3, i8, i9, i10, i11, iArr, iArr2));
    }

    public final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z2) {
        return delegate.isFallbackLineSpacingEnabled(staticLayout, z2);
    }
}
