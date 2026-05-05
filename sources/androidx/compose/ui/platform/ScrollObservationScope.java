package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;
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
/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r@4ߚ\u007f\u0007toA0JeP.hS2\u000fq\u0003<$i-yCA` Ԃ8ޛ\u007fN\u0016f/\fj\u000fQ\u000f\u001e\u0016'k<Sczu\u0018\u001f4Rom\u074c{rM?nxN\u000761P=\n\u000b\u000f BJ&u)H[\u0012 7XrPQ;U\u0015  \u000fV\"\u0017\u001d\u000boߑ:Hzg\u000bD1\u0005\u0002H^)o0+ձ;Iù+\u0013~ѭ6-FBC!um\u0011\u000ej]U\u0002my\u0014ݢtҊ+7Q֕o8^\r\"#KQ\u0013l\u00016-\u0017_q$'Ya\u001a '˂*Þ~\u007f%>\n\u001f\u0014:\u0019J;\u001e~\n$2#w*ú\\ؿbP\bzoN/'\u0006G9N;hWwI0\u001fS\n\u000b% 9\u007f\u001d&2ٱ\u001a\u05ce\u0019)\\w_IiBCa\\\u001fy?s\u001e~yR9\u00120_\u007f]| 2\u001d-ڛs;)<y\u001e\u0019^u\u007f\u001db~R\u0018Z\u001f؞.å\u001aC2\u009e$\\J\u0002\u0013ypV^J\u001f]ɥX&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#W\u000b*>t\u007f+[CH|0-\u0019rj'\u0005m7NL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG{*Bmk", "Ad\\.a;BQ'g\u0005],`\b", "", "/k[ V6IS'", "", "=kS%I(Ec\u0019", "", "=kS&I(Ec\u0019", "6na6m6Gb\u0015\u0006h\\9\u0007\u00106A\u0013,\n-| \u0019G", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G{-At\u001d\n`GIX0'\u0017h7", "DdaA\\*:Z\u0007|\bh3\u0004dBi\u000e\u0015wI\u0003\u0017", "uH;7T=:\u001d)\u000e~euc\r=tU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0006<cy/\rT\u001b*^?\u0005r0'\u00172B@\u0011_;$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNiEm|D?\u001b\u0011;M\u007fI2n\n#\u0018<qLUZ\u001e4u\u001ewA~OBb^\u0007QEDusb\u0016g(fH:m$ub)hX*\u0013\u000bW\u000f\u0001\u001cgetQ \u0002\u00147B{HBNqU\u00128\u0018", "5dc\u000e_3,Q#\nzl", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0015b9Bh#\b\nZ3j\u0007<o\u0007/WS\u0005%\u0004Cx\u0010<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e5z 5T\u001fNoB\u000b\u0011qc9\\", "Adc\u0015b9Bh#\b\nZ3j\u0007<o\u0007/WS\u0005%\u0004Cx\u0010<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k\u001eDw\u001d5)V?y!\u001a\u001eja\u000fJT", "7rE._0==+\bzk\u001az\u0013:e", "", "u(I", "5dc\u001c_+1D\u0015\u0006\u000b^", "u(;7T=:\u001d z\u0004`u]\u00109a\u000f}", "Adc\u001c_+1D\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\r\u0004\u0013+tUkl", "\u001aiPCTuEO\"\u0001D?3\u0007\u0005>;", "5dc\u001c_+2D\u0015\u0006\u000b^", "Adc\u001c_+2D\u0015\u0006\u000b^", "5dc X4:\\(\u0003xl\u0015\u0007\b/I~", "u(8", "5dc#X9MW\u0017z\u0002L*\n\u00136l[;\u007fNm\u0013 Io", "Adc#X9MW\u0017z\u0002L*\n\u00136l[;\u007fNm\u0013 Io", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScrollObservationScope implements OwnerScope {
    public static final int $stable = 8;
    private final List<ScrollObservationScope> allScopes;
    private ScrollAxisRange horizontalScrollAxisRange;
    private Float oldXValue;
    private Float oldYValue;
    private final int semanticsNodeId;
    private ScrollAxisRange verticalScrollAxisRange;

    public ScrollObservationScope(int i2, List<ScrollObservationScope> list, Float f2, Float f3, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i2;
        this.allScopes = list;
        this.oldXValue = f2;
        this.oldYValue = f3;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    public final List<ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    public final Float getOldXValue() {
        return this.oldXValue;
    }

    public final void setOldXValue(Float f2) {
        this.oldXValue = f2;
    }

    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final void setOldYValue(Float f2) {
        this.oldYValue = f2;
    }

    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    public final void setHorizontalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    public final void setVerticalScrollAxisRange(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }
}
