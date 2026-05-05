package kotlinx.coroutines.internal;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&˛\bDZc|\u0004O\u00138\u000bDB\u0007\":ߚ\u007f\u0007lkA0RtP.XS2\u000f\u0002{<řc$\u007fICU \u0002*\t]WogtKb\u000bY\u000f\u000e\u0016\u000fj4I[}e\u0012\u001d2JoEES\u0005Sʠ\t\u0005<ӌ.1J8(\u0005) :J vABy\rB4ns#RkOE\u001fŪ\n@&\u0005,a0|D]\u0005_P.YɅ\u001aa\\=wK\r^\u001dU\u000b܋˼zk$CP=;.5U\t\rxfO\u0005Oqk\u0018\u0017>ݳ/I\u0002q~c\u000e/--e\f\u0014ö͉`\u0005_|T29l{Mf\r^»ߡ\u007f\rJ V(5fF/0e>Ԅc\u0005\u0001iX\\\u0012`R\u007f1ʨF\u00195\u007fa>g2-Ϧgޅ\u001dNE\u0016M\u001e,B\u0019nO{\u0005\u0012n63T.\u0383śU@Kj\u00174g`\u0006\u0004\u001fu2.\u0012Q_\u007feɅA@%IOiI'1m\u0018Gzϙ\u0007\u0007ph\u0002|\u0001_\u0007̕tގ;*\u00171#Ur+\u0004P\u0003k\\\u0015[=l\u00074ܱ˙$\\\u0006ci2\u001evgj\u007fi\u0004ΪP$çj7g\u000b4!ebv3kȡ\u0014\u0014o|\u000f\u0014mH)\u0004ֽjBa7#o6NJH\u00190(\u007fRo$\u0013hŭ8\u001bٜ01'~]W\u0011KZA+)\u0010^v>\u0017Ta0Iǰ2=\u0018\u000f\u007ftp\u001e\b)M:+x\"[M\u0018ڄ'nh0\u0019L\u00053\u000b\u000fu\u0016F\u001eնuS3\u0016\u0091Y{.GbO_aU\u0013=\u001fY6\u0010[]L!q\u0002Q Z\u0013|(\u001b\u0002h~\u007f\u0016p\t6pnZQj\u0016XԮtqQ\u000f;у\u0006ӶJ|Ocb\u0013,EW{\u001bYjX\u000fً\u0007o@3\u000e\b\"+A]G5(.wB;K&\u001c*FЊ\u0006ˏ\u00130\rg\n:q%\u0010dWm@L\tXg\u0011V\"R\u007f9\u0007\u05f8n{ D\u000fF\u001bGȎE\u0019"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00148f}\u001c6[\u0012/M&;g?s", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00148f}\u001c6[\u0012/M&;g?\u0007\u001fga\u000f", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Ib{#Dw\u001f2bC:U1#\u0015fp\u000f", "", "\nh]6g\u0005", "u(E", RemoteSettings.FORWARD_SLASH_STRING, "", ")KZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n$\\\u000b 3l\u0004*NC\u001ek0)}r`9\\", "-rXGX", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "D`[BX", "", "Ahi2", "5dc \\A>", "u(8", "Adc \\A>", "uH\u0018#", "7r4:c;R", "", "u(I", "4h]1", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001es =TGD~}\u001c\u001fukI\u0016g5N\u0005pKU],i[nD]\u0001]\u001bN'\frUB$QD3*p6H\u0002\u0011", ">dT8", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u001b Vo\u001bEr,~H\u0001-7i\u0015\u001cID;N4\u001a Qk8\u00079", "@d\\<i,\u001fW&\r\nH9e\u00196l", "@d\\<i,\u001fW&\r\nB-", "/cS\u0019T:M", "", "<nS2", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n$\\\u000b 3l\u0004*NC\u001ek0)}r`9\\'\u001d", "/cS\u0019T:M7\u001a", "1n]1", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n$\\\u000b 3l\u0004*NC\u001ek0)}r`9\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0015W~]", "@d\\<i,", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n$\\\u000b 3l\u0004*NC\u001ek0)}r`9\\'!", "4ha@g\u0010F^ ", "@d\\<i,\u001ab|\u0007\u0006e", "7mS2k", "uH\u0018\u0019^6MZ\u001d\b\u000e(*\u0007\u00169u\u000f,\u0005@\u000f`\u001bP~\u000eI\u007f!<#l#Dm\u0012-;?<k\u0017\u001e\u0011sJC\u0006c\u0002", "/cS\u0016`7E", "AhUAH7\u001f`#\u0007", "7", "AhUA76P\\y\f\u0005f", "@dP9_6<", "u(J\u0019^6MZ\u001d\b\u000e(*\u0007\u00169u\u000f,\u0005@\u000f`\u001bP~\u000eI\u007f!<#l#Dm\u0012-;?<k\u0017\u001e\u0011sJC\u0006c\u0002", "AvP=", "8", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f19843a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.f19843a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.f19843a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, getSize() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) objArrCopyOf);
        this.f19843a = tArr3;
        return tArr3;
    }

    private final void setSize(int i2) {
        _size$volatile$FU.set(this, i2);
    }

    private final /* synthetic */ void set_size$volatile(int i2) {
        this._size$volatile = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void siftDownFrom(int r6) {
        /*
            r5 = this;
        L0:
            int r1 = r6 * 2
            int r4 = r1 + 1
            int r0 = r5.getSize()
            if (r4 < r0) goto Lb
            return
        Lb:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r3 = r5.f19843a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r2 = r1 + 2
            int r0 = r5.getSize()
            if (r2 >= r0) goto L3d
            r1 = r3[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r0 = r3[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L3d
        L2a:
            r1 = r3[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r0 = r3[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto L3f
            return
        L3d:
            r2 = r4
            goto L2a
        L3f:
            r5.swap(r6, r2)
            r6 = r2
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.siftDownFrom(int):void");
    }

    private final void siftUpFrom(int i2) {
        while (i2 > 0) {
            T[] tArr = this.f19843a;
            Intrinsics.checkNotNull(tArr);
            int i3 = (i2 - 1) / 2;
            T t2 = tArr[i3];
            Intrinsics.checkNotNull(t2);
            T t3 = tArr[i2];
            Intrinsics.checkNotNull(t3);
            if (((Comparable) t2).compareTo(t3) <= 0) {
                return;
            }
            swap(i2, i3);
            i2 = i3;
        }
    }

    private final void swap(int i2, int i3) {
        T[] tArr = this.f19843a;
        Intrinsics.checkNotNull(tArr);
        T t2 = tArr[i3];
        Intrinsics.checkNotNull(t2);
        T t3 = tArr[i2];
        Intrinsics.checkNotNull(t3);
        tArr[i2] = t2;
        tArr[i3] = t3;
        t2.setIndex(i2);
        t3.setIndex(i3);
    }

    public final void addImpl(T t2) {
        if (DebugKt.getASSERTIONS_ENABLED() && t2.getHeap() != null) {
            throw new AssertionError();
        }
        t2.setHeap(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        threadSafeHeapNodeArrRealloc[size] = t2;
        t2.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T t2) {
        synchronized (this) {
            addImpl(t2);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean addLastIf(T t2, Function1<? super T, Boolean> function1) {
        boolean z2;
        synchronized (this) {
            try {
                if (function1.invoke(firstImpl()).booleanValue()) {
                    addImpl(t2);
                    z2 = true;
                } else {
                    z2 = false;
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return z2;
    }

    public final T find(Function1<? super T, Boolean> function1) {
        T t2;
        synchronized (this) {
            int size = getSize();
            int i2 = 0;
            while (true) {
                t2 = null;
                if (i2 >= size) {
                    break;
                }
                T[] tArr = this.f19843a;
                if (tArr != null) {
                    t2 = (Object) tArr[i2];
                }
                Intrinsics.checkNotNull(t2);
                if (function1.invoke(t2).booleanValue()) {
                    break;
                }
                i2++;
            }
        }
        return t2;
    }

    public final T firstImpl() {
        T[] tArr = this.f19843a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$volatile$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T t2;
        synchronized (this) {
            t2 = (T) firstImpl();
        }
        return t2;
    }

    public final boolean remove(T t2) {
        boolean z2;
        synchronized (this) {
            if (t2.getHeap() == null) {
                z2 = false;
            } else {
                int index = t2.getIndex();
                if (DebugKt.getASSERTIONS_ENABLED() && index < 0) {
                    throw new AssertionError();
                }
                removeAtImpl(index);
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T removeAtImpl(int r6) {
        /*
            r5 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto Lc
            int r0 = r5.getSize()
            if (r0 <= 0) goto L72
        Lc:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r3 = r5.f19843a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r0 = r5.getSize()
            r4 = -1
            int r0 = r0 + r4
            r5.setSize(r0)
            int r0 = r5.getSize()
            if (r6 >= r0) goto L45
            int r0 = r5.getSize()
            r5.swap(r6, r0)
            int r0 = r6 + (-1)
            int r2 = r0 / 2
            if (r6 <= 0) goto L68
            r1 = r3[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r0 = r3[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L68
            r5.swap(r6, r2)
            r5.siftUpFrom(r2)
        L45:
            int r0 = r5.getSize()
            r2 = r3[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L5a
            kotlinx.coroutines.internal.ThreadSafeHeap r0 = r2.getHeap()
            if (r0 != r5) goto L6c
        L5a:
            r1 = 0
            r2.setHeap(r1)
            r2.setIndex(r4)
            int r0 = r5.getSize()
            r3[r0] = r1
            return r2
        L68:
            r5.siftDownFrom(r6)
            goto L45
        L6c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L72:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.removeAtImpl(int):kotlinx.coroutines.internal.ThreadSafeHeapNode");
    }

    public final T removeFirstIf(Function1<? super T, Boolean> function1) {
        synchronized (this) {
            try {
                ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = firstImpl();
                T t2 = null;
                if (threadSafeHeapNodeFirstImpl == null) {
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return null;
                }
                if (function1.invoke(threadSafeHeapNodeFirstImpl).booleanValue()) {
                    t2 = (T) removeAtImpl(0);
                }
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return t2;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    public final T removeFirstOrNull() {
        T t2;
        synchronized (this) {
            t2 = getSize() > 0 ? (T) removeAtImpl(0) : null;
        }
        return t2;
    }
}
