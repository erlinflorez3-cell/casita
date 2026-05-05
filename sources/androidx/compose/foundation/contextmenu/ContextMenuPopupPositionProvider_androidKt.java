package androidx.compose.foundation.contextmenu;

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
/* JADX INFO: compiled from: ContextMenuPopupPositionProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,o\bDJd|\u0004O\u000f8\u000b4H\u0017@:ߚ\u0010\u0007\u0015ii4Re`.\u0001RZ\u0013y|L$\n#\"GIW2}P\f\u0016N\u007f\u0010|Nr\u000bq\u000e6\u001a\u0007oDI\u0004w\u000e\u0016\u001d2Zom2}sK:xtd\u0004P8(8\b\u0007\u0019\u001aXKVu\u0013aY\u0012*0nojV\u001bR\u001d\u001a@\u0005n$\u000f\u001etg|5xpk<G#1l\tN?}>\u0004e\rtSW\u0011\u0005f6+n6e\u00193S\u001b\u0007\u0001Zo\u0007MsU\u0005\u0017*m+a\u0012e>p\u007fB\u0014[S\u001b]\u000b&\u000b\u0004\u0002d\u001a(CO\u0012J\u0001\u00126y\u0013{;?J\u000e\u001eMV7E\u001a\u0015\u000b>7\u0003wk@~\u0001\u000fF\u000ezy6E$079:3f\u007f`k\u001d\\9\u0014\u0005;!i\u0001\u0007Gi^&`C\u001e\u0005{_6i@kG~\u000eg=\u0006\u0004\u001fa2.\u00121_\u007f]zA2%'O[g&gkɞLO"}, d2 = {"/kX4a\fGRx}|^:", "", ">n_Bc\u0013>\\\u001b\u000e}", "Eh]1b>%S\"\u0001\na", "1k^@X\b?T\u001d\b~m@", "", "/kX4a\u0017H^)\nVq0\u000b", ">nb6g0H\\", "/kX4a\u0017H^)\nZg+\\\b1en2fJ\u000f\u001b&Ky\u0017", "/kX4a\u0017H^)\nhm(\n\u0018\u000fd\u0002(jJk!%K~\u0012F\u007f", "/kX4a\u001aMO&\u000eZ].|\u0017", ">n_Bc\rBb'[zm>|\t8P\n6\u007fO\u0005! #x\r\u001c\u007f$\u0015X\u007f ", ">n_Bc\rBb'[zm>|\t8P\n6\u007fO\u0005! #x\r*\u0006!Bh]\u001f9m", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int alignPopupStartEdgeToPosition(int i2, int i3, boolean z2) {
        return z2 ? i2 : i2 - i3;
    }

    private static final int alignStartEdges(int i2, int i3, boolean z2) {
        if (z2) {
            return 0;
        }
        return i3 - i2;
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i2, int i3, int i4, boolean z2) {
        if (z2) {
            if (i3 <= i2) {
                return true;
            }
        } else if (i4 - i3 > i2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int alignPopupAxis$default(int i2, int i3, int i4, boolean z2, int i5, Object obj) {
        if ((i5 + 8) - (i5 | 8) != 0) {
            z2 = true;
        }
        return alignPopupAxis(i2, i3, i4, z2);
    }

    public static final int alignPopupAxis(int i2, int i3, int i4, boolean z2) {
        if (i3 >= i4) {
            return alignStartEdges(i3, i4, z2);
        }
        if (popupFitsBetweenPositionAndEndEdge(i2, i3, i4, z2)) {
            return alignPopupStartEdgeToPosition(i2, i3, z2);
        }
        if (popupFitsBetweenPositionAndStartEdge(i2, i3, i4, z2)) {
            return alignPopupEndEdgeToPosition(i2, i3, z2);
        }
        return alignEndEdges(i3, i4, z2);
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i2, int i3, int i4, boolean z2) {
        return popupFitsBetweenPositionAndStartEdge(i2, i3, i4, !z2);
    }

    private static final int alignPopupEndEdgeToPosition(int i2, int i3, boolean z2) {
        return alignPopupStartEdgeToPosition(i2, i3, !z2);
    }

    private static final int alignEndEdges(int i2, int i3, boolean z2) {
        return alignStartEdges(i2, i3, !z2);
    }
}
