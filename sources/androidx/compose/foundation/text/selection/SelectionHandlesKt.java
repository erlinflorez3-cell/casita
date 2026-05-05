package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!4i\bDJg|\u0004W\u00068\u000bDB\u0007\"2\u0013\u007f\u0007|jA0JgP.`\\2şs{J$c$wFSm(\b:\t}Y\u0018k|Vr\u000bq\u001aLǝӇiߚ֒Yzc\u001f\u001d@Z\u0006MBeokI\u0011xD\u001682PJ*\t\u000f-BH>\u0007Aŏc* DXphb=Q\u0013/*\u0006l01\"jxf6v~\u000e>=9\u001bip^mڿP\u0011[ε^TU\fMѮ ҋD?=\u00153U\u001b\tX[M\u0004_\u0006K\b\u0001'U* ֖Y͏\\\b\u001c\u00159Q%_x*j\u0006qx\u001a,CUsM`\u000eV~)\u0002cɞ\u0006؝\n-P͓E\u001cl\u0010\u001c<ςrXHS\bޫ^.yˑ:."}, d2 = {"\u0016`]1_,!S\u001d\u0001}m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0015T5=Z\u0019azb.\u007f\u0018", "u(5", "\u0014", "\u0016`]1_,0W\u0018\u000e}", "5dc\u0015T5=Z\u0019p~];\u007f", "!d[2V;B]\"avg+\u0004\t\u0013n\u00012a@\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMlc@$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\nCUM3\\6{>\u001eg", "5dc X3>Q(\u0003\u0005g\u000fx\u0012.l\u007f\f\u0005A\u000b|\u0017[", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u001f+\u001fsaF\u0016w\u0012N\u000b|", "5dc\u000eW1Na(~y<6\u0007\u0016.i\t$\u000b@\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">nb6g0H\\", "5dc\u000eW1Na(~y<6\u0007\u0016.i\t$\u000b@\u000f^\u001d\u000f>\u0015(A\r", "uI\u0018\u0017", "7r7.a+ES\u007f\u000e\b=0\n\t-t\u00042\u0005", "", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "/qT\u0015T5=Z\u0019\rXk6\u000b\u0017/d", "7r;2Y;,S ~xm0\u0007\u0012\u0012a\t'\u0003@", "7rBAT9M6\u0015\bye,", "6`]1_,L1&\t\tl,{", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionHandlesKt {
    private static final float HandleHeight;
    private static final float HandleWidth;
    private static final SemanticsPropertyKey<SelectionHandleInfo> SelectionHandleInfoKey = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, 0 == true ? 1 : 0);

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }

    /* JADX INFO: renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m1681getAdjustedCoordinatesk4lQ0M(long j2) {
        return OffsetKt.Offset(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2) - 1.0f);
    }

    public static final boolean isLeftSelectionHandle(boolean z2, ResolvedTextDirection resolvedTextDirection, boolean z3) {
        if (z2) {
            return isHandleLtrDirection(resolvedTextDirection, z3);
        }
        return !isHandleLtrDirection(resolvedTextDirection, z3);
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection resolvedTextDirection, boolean z2) {
        return (resolvedTextDirection == ResolvedTextDirection.Ltr && !z2) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
    }

    static {
        float f2 = 25;
        HandleWidth = Dp.m6638constructorimpl(f2);
        HandleHeight = Dp.m6638constructorimpl(f2);
    }
}
