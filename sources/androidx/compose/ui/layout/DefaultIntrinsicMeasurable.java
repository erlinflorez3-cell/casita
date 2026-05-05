package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
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
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JgP.`ݷ2\u000fq|<$i*yCAW\"}8\tWȞog\u0005Jb\u000bI\u0012\fǝ\u000f̓\\I\u0004w\u001e-\u001f6PoW3{pM=nvN\u0005N52<\b\t\u0019\u001aXMǘzzQQT >M\t:\u0001\u001b}\t(!\u001e>N\u000fdp0\\DX\u0005]h=S\u0007wSf'\u000e>CaU^b9%v\u00101[DEI-%\u0002\u0018MfĲ>šӭu?\u000b~5>sW\u0002oNX.\"E/]\u001curTjKe)\u001a5Dgcy^>,\u0006\f\u0014\rj\u0012T\u001awW<-2f6\u000f\u07baxx[óh\u0004dI\u000e\u00032B%'\u00183Y<qƛSň?\u0019VљL\u0019\u001b';\u0003\u0005 \n^D5kèVɐU5iBCS\\\u0016*I{\b\tb0/Z΅IĬ3{\u0019фϒ%<c<)\u074b\b0Gלk\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006U%6U\u000e'FQ\u001f=ZGDy8\u001c|h]G\u0017p(K}'\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", ";h]\u001aT?", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016QL#gGs", "EhSA[\u000f>W\u001b\u0002\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014 QBJn\u0017\u001e\u0019jdH\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\t>h\u000b$@{\u001a,5C7yD+\u0011eh9\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N`=8xTFhk5X\u000f?q\u000f\u0010\u0014u9sX>ie.u\u001etN3lEl)wQIPl8dUo!&A68\u001e\u0002(dLY=\u0017\u007f\\\u001fvPkkfV\u001c]8(@pj\u001c\t`", "5dc\u001aX(Lc&zwe,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0019b\r-;v$2K+;gB.\"d^@\u00079", ">`a2a;\u001dO(z", "", "5dc\u001dT9>\\(]vm(", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bukik@\u0007S", "uI\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Nk\"F\u00074~D\u0005\u001c5m\u0012+TC\u0011", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DefaultIntrinsicMeasurable implements Measurable {
    public static final int $stable = 8;
    private final IntrinsicMeasurable measurable;
    private final IntrinsicMinMax minMax;
    private final IntrinsicWidthHeight widthHeight;

    public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }

    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* JADX INFO: renamed from: measure-BRTryo0, reason: not valid java name */
    public Placeable mo5514measureBRTryo0(long j2) {
        int iMinIntrinsicHeight;
        int iMinIntrinsicWidth;
        IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
        IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
        int iM6591getMaxWidthimpl = LayoutKt.LargeDimension;
        if (intrinsicWidthHeight == intrinsicWidthHeight2) {
            if (this.minMax == IntrinsicMinMax.Max) {
                iMinIntrinsicWidth = this.measurable.maxIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2));
            } else {
                iMinIntrinsicWidth = this.measurable.minIntrinsicWidth(Constraints.m6590getMaxHeightimpl(j2));
            }
            if (Constraints.m6586getHasBoundedHeightimpl(j2)) {
                iM6591getMaxWidthimpl = Constraints.m6590getMaxHeightimpl(j2);
            }
            return new FixedSizeIntrinsicsPlaceable(iMinIntrinsicWidth, iM6591getMaxWidthimpl);
        }
        if (this.minMax == IntrinsicMinMax.Max) {
            iMinIntrinsicHeight = this.measurable.maxIntrinsicHeight(Constraints.m6591getMaxWidthimpl(j2));
        } else {
            iMinIntrinsicHeight = this.measurable.minIntrinsicHeight(Constraints.m6591getMaxWidthimpl(j2));
        }
        if (Constraints.m6587getHasBoundedWidthimpl(j2)) {
            iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
        }
        return new FixedSizeIntrinsicsPlaceable(iM6591getMaxWidthimpl, iMinIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        return this.measurable.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        return this.measurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        return this.measurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        return this.measurable.maxIntrinsicHeight(i2);
    }
}
