package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
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
/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000ejLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u000e\u0007njO0LeN.ZS@\u000fsڔ<$iByCAU\"}0(WNmmvJh\u0014K\u000f\f\u0016~̓Bկ\u0006~m\u0014\u001f2pom2\u000e9M=nuN\u0005N42r\b\b\u0019P:Y \u0006)Eƚ\u0010\u001c6E\u0001@X\u0013]\u0007 \u0018,E0\u0012.k\u0016VɇLvc??)\toRP-eV\u0006]\u0015VZ7\u000f\u0007aL+nAc\u0019ȏW\u0003\u0015]$T\u0011R\n=3hW-1I\u0002`NX.\u001c[ۀ̠\u0011]x:%\f_u$'Ye*ֶPV/\u0006\u0012\u0014\rj\u0004TΑ'\u0019@;&~\u000e\u001e5\u0005r\u0002@~\u000f5ې\u0002ѐe6\u001fӛPu9<3\u001darK(|9߉\t\u0017$(\u0011t'ad\u0010f\u001bA[\bbA`nE˓R\u0014_B}\nvh\u0012,\n6m\t?\u0004!4''G[g#Ou0L\u001bϜxݶdh[֟#TN#\u0007\u0016e,_ȴ\\ֈh\u0005s¬%d:\u001fe\u001c\u0003\tTܴ\u001fء`wDƙu%\\^\u0001ozOm\nS/\u0015A\u00103«\u0012[Q`9E_t`m`\t,?jd[֝r͞W\fb٢͎&J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\u0010]v/+[N9Xa|Ji", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "7sT:66N\\(", "", "5dc\u001aX(Lc&zwe,\u000b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001exqbC\\", "7mU<", "", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJuz^", "-kX@g", "", "7sT:<5=S,", ":hbA", "5dc\u0019\\:M", "u(;7T=:\u001d)\u000e~euc\r=tU", ":hbA<5=S,", "5dc\u001bX?M", "5dc\u001bX?M\u0012\u001a\t\u000bg+x\u00183o\t\"\u0003<\u0015!'Vi\u001b<}%1g}", "6`b\u001bX?M", "", "<dgA", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextualFlowItemIterator implements Iterator<Measurable>, KMappedMarker {
    public static final int $stable = 8;
    private final List<Measurable> _list = new ArrayList();
    private final Function2<Integer, FlowLineInfo, List<Measurable>> getMeasurables;
    private final int itemCount;
    private int itemIndex;
    private int listIndex;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContextualFlowItemIterator(int i2, Function2<? super Integer, ? super FlowLineInfo, ? extends List<? extends Measurable>> function2) {
        this.itemCount = i2;
        this.getMeasurables = function2;
    }

    public final List<Measurable> getList() {
        return this._list;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < getList().size() || this.itemIndex < this.itemCount;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Measurable next() {
        return getNext$foundation_layout_release$default(this, null, 1, null);
    }

    public static /* synthetic */ Measurable getNext$foundation_layout_release$default(ContextualFlowItemIterator contextualFlowItemIterator, FlowLineInfo flowLineInfo, int i2, Object obj) {
        FlowLineInfo flowLineInfo2 = flowLineInfo;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            flowLineInfo2 = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator.getNext$foundation_layout_release(flowLineInfo2);
    }

    public final Measurable getNext$foundation_layout_release(FlowLineInfo flowLineInfo) {
        if (this.listIndex < getList().size()) {
            Measurable measurable = getList().get(this.listIndex);
            this.listIndex++;
            return measurable;
        }
        int i2 = this.itemIndex;
        if (i2 < this.itemCount) {
            List<Measurable> listInvoke = this.getMeasurables.invoke(Integer.valueOf(i2), flowLineInfo);
            this.itemIndex++;
            if (listInvoke.isEmpty()) {
                return next();
            }
            Measurable measurable2 = (Measurable) CollectionsKt.first((List) listInvoke);
            this._list.addAll(listInvoke);
            this.listIndex++;
            return measurable2;
        }
        throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
    }
}
