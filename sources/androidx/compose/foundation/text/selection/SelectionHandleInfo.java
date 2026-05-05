package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
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
/* JADX INFO: compiled from: SelectionHandles.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV7ZS0\"s{B*cҕyCIa\"Ԃ(ޜUdʴ\u0018nxYKf\u001f\n$x\u0003,wV\ta \u0011JB\u001eBCQ}AQ`#;\u0015$@(Py3\bʀ.H\u001e~CJY\u001e*0nq\u0001Ŭ\u000e\u0016\u0019(%\u001e>N\u0004dָh¦5GɆ\\Žǥ'\u0005oV\\5(7\u000bb%F\u0003,Sȿbf2NMM\u0015SZIߞS$x\u0011V\n=3ؒW-1I\u0002WNX.\u0015E1U\rkt>\\3T\u0011\u0012-+]gcP<-(\u0001\u0002\rJ\n&\u0006UOtǭ\u0019Ɋ\u0007Ԅ\u07baxtYX^\u001b'S\u000e\u0015y6E,099T3hg`i\u0018\u0015Ұ|M\u0014,?\u0019nOx\u001bج_]\"b\u0016i1\u007f_\u0004̇MZhKq\u001cp\u0011\u0007ò\b6OĉG}\u00177%/\bjG#9k0Iזk|\r\u009b\u0001Uo]VLr\u0006$9B\t:]מcʍÐOSг0\u0019U\u001cb\u0016\u0016\n\u0019-j\u0006\r03\u0016fO\u0017pҷQc\u0012ɘGh=i||ސWBf6;Ƀ\u007f>`Zv\u001a^ףf%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\nCUM3\\6{>\u001eg", "", "6`]1_,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001ai\u001f-TC\u0011", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/mR5b9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\nCUM3\\.{;\u0017\u001cgc", "Dhb6U3>", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001P\u00127LJ;A\u0019\u0005\u0011q`F\u0011g+a@%QTY6jR<>\u001e\"c\rJ:\u0011\u000fb\u000b3nWFh\u0016,P\u00029w\u0005\u0016\u001fW#jwBT\u001fK\u0004\u001eX=2gMY;\u0003EDOo\u007fYre'kA>-]v*#2T7\u0019{`\u001anYCFgH\u0015\u000b?3\u001cwdTT|e:\u00041,3w\u0005\u00182eJne", "5dc\u000ea*A]&", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2O9\u000ec*]z1P/J5[Yr\u0019\u001d\u0010]\u0018[\u0001", "5dc\u0015T5=Z\u0019", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7x*VBBk\n", "5dc\u001db:Bb\u001d\t\u0004&\rHf~Bqr", "u(9", "\u0018", "5dc#\\:BP ~", "u(I", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(KB?wZX\fWJ", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "1n_F <;<\n\u0011jJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001P\u00127LJ;A\u0019\u0005\u0011q`F\u0011g+a@%QTY6jR<>\u001e\"c\rJ:\u0011\u000fb\u000b3nWFh\u0016,P\u00029w\u0005\u0016\u001fW#jwBT\u001fK\u0004\u001eX=2gMY;\u0003EDOo\u007fYOF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<S\u0004wpF\u0015\n<.G7jFX~\u001fJt.\u001fI\u000b{\u001c;\"b+{-\u0002C.@mgGp\u0017E^\\\u001e-f\u0017", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SelectionHandleInfo {
    public static final int $stable = 0;
    private final SelectionHandleAnchor anchor;
    private final Handle handle;
    private final long position;
    private final boolean visible;

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(handle, j2, selectionHandleAnchor, z2);
    }

    /* JADX INFO: renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m1677copyubNVwUQ$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            j2 = selectionHandleInfo.position;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            selectionHandleAnchor = selectionHandleInfo.anchor;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z2 = selectionHandleInfo.visible;
        }
        return selectionHandleInfo.m1679copyubNVwUQ(handle, j2, selectionHandleAnchor, z2);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* JADX INFO: renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1678component2F1C5BW0() {
        return this.position;
    }

    public final SelectionHandleAnchor component3() {
        return this.anchor;
    }

    public final boolean component4() {
        return this.visible;
    }

    /* JADX INFO: renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final SelectionHandleInfo m1679copyubNVwUQ(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z2) {
        return new SelectionHandleInfo(handle, j2, selectionHandleAnchor, z2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m3934equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    public int hashCode() {
        return (((((this.handle.hashCode() * 31) + Offset.m3939hashCodeimpl(this.position)) * 31) + this.anchor.hashCode()) * 31) + Boolean.hashCode(this.visible);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) Offset.m3945toStringimpl(this.position)) + ", anchor=" + this.anchor + ", visible=" + this.visible + ')';
    }

    private SelectionHandleInfo(Handle handle, long j2, SelectionHandleAnchor selectionHandleAnchor, boolean z2) {
        this.handle = handle;
        this.position = j2;
        this.anchor = selectionHandleAnchor;
        this.visible = z2;
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1680getPositionF1C5BW0() {
        return this.position;
    }

    public final SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    public final boolean getVisible() {
        return this.visible;
    }
}
