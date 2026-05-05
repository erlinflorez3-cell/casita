package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0006DLc\u0003İIي8\u000bDB\u0007Ӭ4\u0012\u0006-njGTLeN7ZS8\u0015s{:*c$\u007fCC٥\"}0\u0012WNmhvJp\u000bK\u000f\f\u0017~\u000bBկ}zc܈\u001d1jqE2[om9\u000fuv60B0:\u0012\u0011\u0011\u001c:HF͌\u000bE[\fH/nsJh\u001bQ\u001d,\"\u0014N,\u0011 lg\u0005ȤXnm:e\"1opSϮc0\u000bTULbA%v\u00109qB\u007f9#Ak\u00035o$_\u0011]\n=K\bG)1I\u0002vfb\u000e4-1_\u000fmrl{3r'ϴ-˦ScYrV,\u0006\u001e\u0014\rj\u001f^,5PF;*h\u0018\u000eiο\u0003UPP8]X~)g\rВ1ő77Aӕ~SgD'XW}\u000b\u0018,/Q\u0010/_l p#+`\bSAQv׀XP\u001aYsl2v\u0011\u0007ò\b6OĉG}\u0017;%3\bvG%9w\u0012JTg-ݓpjci\tGn%å\u001a=2\u009e$\\Js\u0013{!lf=)MJf]ç\u0014˙$h\u007f˓9'\u0016a]|\nlSr\u0018;\u007f\rEp\u0007y\u001eYI^i̐ae a\tu*>jh[֟r͞W\u0018b٢@$8`x\u001a\u0018}Jg\u001a\u001f՞C\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;S0)|xp5\u0004j,2\u0006'TH]6i(", "\u0019", "$", "", ";`_", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007K(YL", "7sT?T;H`", "", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($Vp5\u0016c\u0014J\u0002|.QJ=X\u001c\u0003L\u0018\u0019$q]+\u001a\u0001hK1D\b(", "1ta?X5M", "5dc\u0010h9KS\"\u000e", "u(;7T=:\u001d)\u000e~eud\u0005:$_1\u000bM\u0015l", "Adc\u0010h9KS\"\u000e", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014mE\t7\tTVZ\b", "5dc\u0016g,KO(\t\b", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "5dc\u001aT7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwOH\u0003r,6r2\u001d", ";nS6Y0<O(\u0003\u0005g", "", "5dc\u001ab+BT\u001d|vm0\u0007\u0012", "u(8", "Adc\u001ab+BT\u001d|vm0\u0007\u0012", "uH\u0018#", "<dgA", "5dc\u001bX?M", "Adc\u001bX?M", "/ce.a*>", "", "6`b\u001bX?M", "", ";nS6Y@", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "@d\\<i,", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
abstract class StateMapMutableIterator<K, V> {
    private Map.Entry<? extends K, ? extends V> current;
    private final Iterator<Map.Entry<K, V>> iterator;
    private final SnapshotStateMap<K, V> map;
    private int modification;
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public StateMapMutableIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getModification$runtime_release();
        advance();
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    protected final int getModification() {
        return this.modification;
    }

    protected final void setModification(int i2) {
        this.modification = i2;
    }

    protected final Map.Entry<K, V> getCurrent() {
        return this.current;
    }

    protected final void setCurrent(Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    protected final Map.Entry<K, V> getNext() {
        return this.next;
    }

    protected final void setNext(Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    protected final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    protected final <T> T modify(Function0<? extends T> function0) {
        if (getMap().getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
        T tInvoke = function0.invoke();
        this.modification = getMap().getModification$runtime_release();
        return tInvoke;
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() == this.modification) {
            Map.Entry<? extends K, ? extends V> entry = this.current;
            if (entry != null) {
                this.map.remove(entry.getKey());
                this.current = null;
                Unit unit = Unit.INSTANCE;
                this.modification = getMap().getModification$runtime_release();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
