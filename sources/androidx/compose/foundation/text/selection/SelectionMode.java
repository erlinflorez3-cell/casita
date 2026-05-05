package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: SelectionMode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eRLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0LeN/ZS8\u0018s{:-aҖpYП\u0006 \u000e$\u0019O|ʴ\u0016m\u000b_\u0011CǇ\n\u0016\u0007jticyu\u0012=4rsM6eok=\u0011xD\n82P>@#҈\u0019ݒН\u0014x\u0001JY\u0014ZXNyRR;W5\u001e \u000bV /$\rk\\A`l\f>_'\u0011uZNUcvŧת\fϿù+\u000f|n,9\tSC$=S1\u0011z[m\touK\u0015\u0001'U/\u0010sˇ5ݙÿ\u0018\u00171`\u001bo[&b\u0018:`\u0012;ˆOhSS\u0014߬\u0014)zɇ@\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000fQKN\u0002", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "1n\\=T9>", "", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "1n\\=T9>\u001bff\u0003^\u0014M\u000fmf\n8\u0005?|&\u001bQx\bIv,5U\f ", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|kq1", "7rB2_,<b\u0019}", "", "AsP?g", "3mS", "7rB2_,<b\u0019}B+?P\u0006 xJf|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCz\u0013\u00118", "1n]AT0Ga|\bxe<\u000b\r@e", "=eU@X;", "1n]AT0Ga|\bxe<\u000b\r@eG\u0018\r\u0013\fa\u007f#", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCzqB", "$daA\\*:Z", "\u0016na6m6Gb\u0015\u0006", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum SelectionMode {
    Vertical { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public int mo1725compare3MmeM6k$foundation_release(long j2, Rect rect) {
            if (SelectionManagerKt.m1718containsInclusiveUv8p0NA(rect, j2)) {
                return 0;
            }
            if (Offset.m3938getYimpl(j2) < rect.getTop()) {
                return -1;
            }
            return (Offset.m3937getXimpl(j2) >= rect.getLeft() || Offset.m3938getYimpl(j2) >= rect.getBottom()) ? 1 : -1;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release */
        public int mo1725compare3MmeM6k$foundation_release(long j2, Rect rect) {
            if (SelectionManagerKt.m1718containsInclusiveUv8p0NA(rect, j2)) {
                return 0;
            }
            if (Offset.m3937getXimpl(j2) < rect.getLeft()) {
                return -1;
            }
            return (Offset.m3938getYimpl(j2) >= rect.getTop() || Offset.m3937getXimpl(j2) >= rect.getRight()) ? 1 : -1;
        }
    };

    /* synthetic */ SelectionMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo1725compare3MmeM6k$foundation_release(long j2, Rect rect);

    /* JADX INFO: renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m1726isSelected2x9bVx0$foundation_release(Rect rect, long j2, long j3) {
        if (m1724containsInclusiveUv8p0NA(rect, j2) || m1724containsInclusiveUv8p0NA(rect, j3)) {
            return true;
        }
        return (mo1725compare3MmeM6k$foundation_release(j2, rect) > 0) ^ (mo1725compare3MmeM6k$foundation_release(j3, rect) > 0);
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m1724containsInclusiveUv8p0NA(Rect rect, long j2) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        if (left <= fM3937getXimpl && fM3937getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float fM3938getYimpl = Offset.m3938getYimpl(j2);
            if (top <= fM3938getYimpl && fM3938getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }
}
