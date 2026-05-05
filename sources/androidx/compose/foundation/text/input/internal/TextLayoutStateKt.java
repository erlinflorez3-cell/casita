package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
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
/* JADX INFO: compiled from: TextLayoutState.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\f6B\u0015\"4\u0012}\r~\u0007Gӄ\\ev-zSX\u000e\u001c\u007fB$s$ D\u0002٥ܵ|̝\u07beSPmi|Mr'Q\u0013\u001e\u0016'iTI\u0004}\u000e\u0016\u001d8Zom2\u0014ڎ\u00818śҽ:\u0007&90@\u0012!\u000f#BH>u#Cy\u0011B4NvRR;LK܅ǀ\u0005̄ŋ\u0005 bq\\>`\tkEG#1hjNUd`\u0001[\u0013^TU\f=ѭՕ*¨˝9\u0017+_\u0011\u000fѻ[D\u000bBwݗ!\u0017&ݹ/V"}, d2 = {"1nT?V,\"\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "1nT?V,\"\\`Lbf,dY5", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|kq2", "4q^:7,<]&z\nb6\u0006w9T\u007f;\u000b'|+!W~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "=eU@X;", "4q^:7,<]&z\nb6\u0006w9T\u007f;\u000b'|+!W~U,\bw@$f{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005o=-\u0015uj5\u000e-\u001bN\n6.Hb6la`L\u0010!Zc3nq", "4q^:G,Qb\u007fz\u000fh<\fw9C\n5{", "4q^:G,Qb\u007fz\u000fh<\fw9C\n5{\bp(iR:v\u0018", "4q^:J0GR#\u0011ih\u000b|\u00079r{7\u007fJ\n", "4q^:J0GR#\u0011ih\u000b|\u00079r{7\u007fJ\n^\u0007XB\u0019\u0007_\u0001", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayoutStateKt {
    /* JADX INFO: renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1558coerceIn3MmeM6k(long j2, Rect rect) {
        float right;
        float bottom;
        if (Offset.m3937getXimpl(j2) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = Offset.m3937getXimpl(j2) > rect.getRight() ? rect.getRight() : Offset.m3937getXimpl(j2);
        }
        if (Offset.m3938getYimpl(j2) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = Offset.m3938getYimpl(j2) > rect.getBottom() ? rect.getBottom() : Offset.m3938getYimpl(j2);
        }
        return OffsetKt.Offset(right, bottom);
    }

    /* JADX INFO: renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m1560fromTextLayoutToCoreUv8p0NA(TextLayoutState textLayoutState, long j2) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return j2;
        }
        Offset offsetM3926boximpl = null;
        if (!textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return j2;
        }
        LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
        if (coreNodeCoordinates != null) {
            if (!coreNodeCoordinates.isAttached()) {
                coreNodeCoordinates = null;
            }
            if (coreNodeCoordinates != null) {
                offsetM3926boximpl = Offset.m3926boximpl(coreNodeCoordinates.mo5523localPositionOfR5De75A(textLayoutNodeCoordinates, j2));
            }
        }
        return offsetM3926boximpl != null ? offsetM3926boximpl.m3947unboximpl() : j2;
    }

    /* JADX INFO: renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m1559fromDecorationToTextLayoutUv8p0NA(TextLayoutState textLayoutState, long j2) {
        Offset offsetM3926boximpl;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return j2;
        }
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) {
            offsetM3926boximpl = Offset.m3926boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo5523localPositionOfR5De75A(decoratorNodeCoordinates, j2) : j2);
        } else {
            offsetM3926boximpl = null;
        }
        return offsetM3926boximpl != null ? offsetM3926boximpl.m3947unboximpl() : j2;
    }

    /* JADX INFO: renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m1561fromWindowToDecorationUv8p0NA(TextLayoutState textLayoutState, long j2) {
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j2 : decoratorNodeCoordinates.mo5531windowToLocalMKHz9U(j2);
    }
}
