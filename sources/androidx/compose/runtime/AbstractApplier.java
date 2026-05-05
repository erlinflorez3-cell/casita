package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: Applier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDZc|\u0004G\u000e8\u000b<a\u0007Ӭ4\u0012\u0006\u0007nj?4LeV4ZS0\u0012q!Jř\u0004&wّITJ\u00042\u000b_N.f\u001dJ\u001b\u0016S\u0013\u0014\u0017\u0011jbկǤ|] \u0011zF}KKM\u001eJ\u0002s\u0003D\u001d `/h}\u0013\u00102*~Ƶ=\u000fŲO\f 2\tvHb%M3'X(\u0007&\u000f/tg|C\u000f\u0001&b=5\u001bip[Oe@~]\r|ÖU\u0018'e,>X7c)UW\u0011\u001cj[m\u0017ouK\u001b\u0001'U?\u0010u Vf\u0017,\u0015Y\\5c\u0003(l\u0005\bӠ:2[Sqch\u000eV\f+\u007f\u001bR\u001c\u000e4;\u000f0}>t\f&3+Ɂ\u0004D^\u0005vB6Э \tmӲ\fĴ/G#f_iS\u001bT<\n\u000b- )\b|#,e\u001ca-\u001b\u000bȭΦ5YH=VV\"[Cv\u0012v3\u00148\u000eHM\u00101\f\u0011dϏSB2ހ%\u074co\u0002PֳЂz\u001e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9i9\u00054BU{/\u0013x!5QCHA", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", "@n^A", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "\nrTA \u0006\u0017", "1ta?X5M", "5dc\u0010h9KS\"\u000e", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0010h9KS\"\u000e", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc\u001fb6M", "AsP0^", "", "1kT.e", "", "2nf;", "<nS2", "=m29X(K", "Co", ";ne2", "4q^:", "", "Bn", "1nd;g", "@d\\<i,", "7mS2k", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final List<T> stack = new ArrayList();

    protected abstract void onClear();

    public AbstractApplier(T t2) {
        this.root = t2;
        this.current = t2;
    }

    public final T getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    protected void setCurrent(T t2) {
        this.current = t2;
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t2) {
        this.stack.add(getCurrent());
        setCurrent(t2);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (this.stack.isEmpty()) {
            PreconditionsKt.throwIllegalStateException("empty stack");
        }
        setCurrent(this.stack.remove(r1.size() - 1));
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.stack.clear();
        setCurrent(this.root);
        onClear();
    }

    protected final void remove(List<T> list, int i2, int i3) {
        if (i3 == 1) {
            list.remove(i2);
        } else {
            list.subList(i2, i3 + i2).clear();
        }
    }

    protected final void move(List<T> list, int i2, int i3, int i4) {
        int i5 = i2 > i3 ? i3 : i3 - i4;
        if (i4 != 1) {
            List<T> listSubList = list.subList(i2, i4 + i2);
            List mutableList = CollectionsKt.toMutableList((Collection) listSubList);
            listSubList.clear();
            list.addAll(i5, mutableList);
            return;
        }
        if (i2 == i3 + 1 || i2 == i3 - 1) {
            list.set(i2, list.set(i3, list.get(i2)));
        } else {
            list.add(i5, list.remove(i2));
        }
    }
}
