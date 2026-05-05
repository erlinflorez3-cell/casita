package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?0LeV7ZS0\u0012s{J$c$wMCU(\u0004*\tUNog|Jb\u000bI\u001a\u000e\u0016\u0007v4կ[\u000es܈?2pn\u007f8ޜs??`\u00037M&@)Py3\u0007`*\u0011,\u0005\u000f[O:۵\u0019@OI\u0003\u0015[\u001a2\u00164̄\t\u0001|k.ޱDՂp]HEk\u0018wYf'\u000e9-U\u001b^l+;ǸJ\u001e\nO˝9\u00153lK$`uW\u0003mzm\rv??/w֕@67\u000fD\u00199j%]!Bػ\tQn)o7]\u0002cP<G(~\n-T\u0004<\"ok<N2f6\u0017c|\u0001kXT0މ+\u007fYpf\u001f3\u000bK/gӕOQ@J_MѼ\u007f\u0005\u001b@k\u0007|DsT<i[/\u001d\u000b_UiHSG|ˣB?\u0004\u0003OqH)˙4G\u000e@D(<<=7\nXS)y\r`H\u0016ϸm`Gb0R͕D\"|<\u007f>\u00173rLz\u0004\u001a¬=ZB\u0010,+\u001b\u0378\fݔ\u0017 j\t\u0005F38fO\u0017\t\u001bUk3=3\u0015ŽBnJ\u001d\bAl>MU\u0012߄JRU#\u0006ֺИ\tZlla7#b6NJH\u0019=>\u0010\u0015[\u001a\u0015JE\u0002\u001eD,_\u0018\u000b\u0018\u001fҔ \u0013N\u000b\rw`x\u0012\u000fTaɴ1lzڒ\u000bQ_ju\bo\tM<~v![G\u007f8oĢWrzB\u0005;\u0007-|6\u001c>֍Iƥp\u001a\u000eW\u0002($$\n`=H+\u000f-(hFβIP\u000bgWY 4K\u0010\b\u001dSl\\ԖpjO;\u0017/ߝSX/$|n\u00014Xw\u000e\fyJ)òLTijt\u000e\u03a2\u0007]TP>\u0010\u00130ǰ)/"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f?W\u0004\u0001Dm\u0016\u0015QLAk3\u0005\u0019vp\"\u0011b,$", "", "\nh]6g\u0005", "u(E", "-mTEg", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "-oa2i", "-qT:b=>R\u0006~{", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00125a\b17lk", "@d\\<i,=", "7rA2`6OS\u0018", "", "u(I", "<dgA", "5dc\u001bX?M", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "<dgAA6=S", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u000e?X}u", "5dc\u001bX?M<#}z", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u001b Vo\u001bEr,~@\b\u001e=N#.M*?t:\u001e\u0014OeG\u0016L6Mv|", ">qTCA6=S", "5dc\u001de,O<#}z", "4h]1C9>d\u0002\t\u0004K,\u0005\u0013@e~", "1ta?X5M", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u001cc{&\u0018z\u0016.4GDq4\u001d{loHom+NLj.RX;cV{P]\u0010d\u001bX;\u001c\tbA28H@.\b9R}B2g\u0016\u0014\u0014\u0016wpB=\u0014P\u007f\u0015t(-vUBixG\u0017", "/cS\u001ca,\"Tx\u0007\u0006m@", "<nS2", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u001cc{&\u0018z\u0016.4GDq4\u001d{loHom+NLj<", "/cS\u0019T:M", ">da:\\:LW#\b\t;0\f\u0011+s\u0006", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u001cc{&\u0018z\u0016.4GDq4\u001d{loHom+NL\u000b\u000bA", "1k^@X", "", "4na/\\+=S\"^\u0002^4|\u0012>s\\,\u000b", "/cS\u001bX?M", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u001cc{&\u0018z\u0016.4GDq4\u001d{loHom+NL\u000eMV]3`[\u0006\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmrMF\u001f\u00155E\t\u0005O\u000b\n\u001cnBjp)Z\u0019My\u0014\\E7w/c^y\u001d\u0005:", "@d\\<i,", "@d\\<i,(`\u0002~\u000em", "4h]6f/\u001aR\u0018", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u001cc{&\u0018z\u0016.4GDq4\u001d{loHom+NLj8", "1na?X*M>&~\f", "D`[6W(MS\u0002\ty^", ">qTC", "D`[6W(MS\u0002\ty^j\u0003\u0013>l\u00041\u000f:~!$Q\u007f\u001d@\u007f%CS{*Dm", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u001cc{&\u0018z\u0016.4GDq4\u001d{loHom+NL\u000eMV]3`[\u0006\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmrMF\u001f\u00155E\t\u0005O\u000b\n\u001cnBjp)Z\u0019My\u0014\\E7w/c^y\u001d\u00056", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class LockFreeLinkedListNode {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _removedRef$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass1 extends PropertyReference0Impl {
        AnonymousClass1(Object obj) {
            super(obj, DebugStringsKt.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
        public Object get() {
            return DebugStringsKt.getClassSimpleName(this.receiver);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x003e, code lost:
    
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(kotlinx.coroutines.internal.LockFreeLinkedListNode._next$volatile$FU, r4, r1, ((kotlinx.coroutines.internal.Removed) r3).ref) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            java.lang.Object r6 = r0.get(r7)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r6
            r5 = 0
            r1 = r6
        Lc:
            r4 = r5
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            java.lang.Object r3 = r0.get(r1)
            if (r3 != r7) goto L25
            if (r6 != r1) goto L1a
            return r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r7, r6, r1)
            if (r0 != 0) goto L58
            goto L0
        L25:
            boolean r0 = r7.isRemoved()
            if (r0 == 0) goto L2c
            return r5
        L2c:
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.Removed
            if (r0 == 0) goto L4e
            if (r4 == 0) goto L43
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_next$volatile$FU()
            kotlinx.coroutines.internal.Removed r3 = (kotlinx.coroutines.internal.Removed) r3
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.ref
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r1, r0)
            if (r0 != 0) goto L41
            goto L0
        L41:
            r1 = r4
            goto Lc
        L43:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            java.lang.Object r1 = r0.get(r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            goto Ld
        L4e:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r1
            r1 = r3
            goto Ld
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.correctPrev():kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    private final LockFreeLinkedListNode findPrevNonRemoved(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) _prev$volatile$FU.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    private final void finishAdd(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$volatile$FU;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (getNext() != lockFreeLinkedListNode) {
                return;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_prev$volatile$FU, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (isRemoved()) {
            lockFreeLinkedListNode.correctPrev();
        }
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private final /* synthetic */ Object get_removedRef$volatile() {
        return this._removedRef$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final Removed removed() {
        Removed removed = (Removed) _removedRef$volatile$FU.get(this);
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        _removedRef$volatile$FU.set(this, removed2);
        return removed2;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_prev$volatile(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void set_removedRef$volatile(Object obj) {
        this._removedRef$volatile = obj;
    }

    public final boolean addLast(LockFreeLinkedListNode lockFreeLinkedListNode, int i2) {
        LockFreeLinkedListNode prevNode;
        do {
            prevNode = getPrevNode();
            if (prevNode instanceof ListClosed) {
                return (((ListClosed) prevNode).forbiddenElementsBitmask & i2) == 0 && prevNode.addLast(lockFreeLinkedListNode, i2);
            }
        } while (!prevNode.addNext(lockFreeLinkedListNode, this));
        return true;
    }

    public final boolean addNext(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        _prev$volatile$FU.set(lockFreeLinkedListNode, this);
        _next$volatile$FU.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            return false;
        }
        lockFreeLinkedListNode.finishAdd(lockFreeLinkedListNode2);
        return true;
    }

    public final boolean addOneIfEmpty(LockFreeLinkedListNode lockFreeLinkedListNode) {
        _prev$volatile$FU.set(lockFreeLinkedListNode, this);
        _next$volatile$FU.set(lockFreeLinkedListNode, this);
        while (getNext() == this) {
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.finishAdd(this);
                return true;
            }
        }
        return false;
    }

    public final void close(int i2) {
        addLast(new ListClosed(i2), i2);
    }

    public final Object getNext() {
        return _next$volatile$FU.get(this);
    }

    public final LockFreeLinkedListNode getNextNode() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object next = getNext();
        Removed removed = next instanceof Removed ? (Removed) next : null;
        if (removed != null && (lockFreeLinkedListNode = removed.ref) != null) {
            return lockFreeLinkedListNode;
        }
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (LockFreeLinkedListNode) next;
    }

    public final LockFreeLinkedListNode getPrevNode() {
        LockFreeLinkedListNode lockFreeLinkedListNodeCorrectPrev = correctPrev();
        return lockFreeLinkedListNodeCorrectPrev == null ? findPrevNonRemoved((LockFreeLinkedListNode) _prev$volatile$FU.get(this)) : lockFreeLinkedListNodeCorrectPrev;
    }

    public boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    /* JADX INFO: renamed from: remove */
    public boolean mo10549remove() {
        return removeOrNext() == null;
    }

    public final LockFreeLinkedListNode removeOrNext() {
        Object next;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            next = getNext();
            if (next instanceof Removed) {
                return ((Removed) next).ref;
            }
            if (next == this) {
                return (LockFreeLinkedListNode) next;
            }
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_next$volatile$FU, this, next, lockFreeLinkedListNode.removed()));
        lockFreeLinkedListNode.correctPrev();
        return null;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            AnonymousClass1(Object this) {
                super(this, DebugStringsKt.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
            }

            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return DebugStringsKt.getClassSimpleName(this.receiver);
            }
        } + '@' + DebugStringsKt.getHexAddress(this);
    }

    public final void validateNode$kotlinx_coroutines_core(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        if (DebugKt.getASSERTIONS_ENABLED() && lockFreeLinkedListNode != _prev$volatile$FU.get(this)) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && lockFreeLinkedListNode2 != _next$volatile$FU.get(this)) {
            throw new AssertionError();
        }
    }
}
