package androidx.compose.ui.text.caches;

import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import com.dynatrace.android.agent.Global;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0006DLc\u0003İIي8\u000b<H\u0007\"2\u0015\u007f\u0007|jA0ZeP\u008cZS@\u000fs{J$c$wCCU0}*\tUTog|JbŏK\u000f\u0014\u001f\u0001j2U]xk4\u00172HpG3coE9fu>\u0005.>*8\u007f\u0005\u0007(@Ϻ8x\u0001ŏY\u000b:2FoHR=M3\u001bR\u0013D4\u0011\"jif6voҺ>/1\u00072W\\<w2\u0013LCE\u0005+\u001b\ry\u001ea¨}Gչ)S\u0011\u001e\u001b_M\bWqk\b1T5Cas\u0006O\t\u0004\"/CO;x#*j\u001bi`Bʬ[Sqgh\u000e^v+\u0002\u001bY\u001c\u0010\u001c&~-s,Ǵ\f\u000eA\u0013;WNo\u001a^p\u0019CeD\u001d=\u007fa.\u0002.tqy=/Mmz5\u0011,9\u0019nWżڍ\u0012`#2\u001d{_8i@kK\u0017\u000eg?\u0006\u0004\u001feJ.\u0012>_\u007f]~YI%FO]O\"Wj2LR}\u000f\u0005\u0017å\u0004m`jX\"%\u0015֖.\t\u001a}\rh\u0013|hT\u0007/Y`*x\u001f\u007f\u001e\u0012V[(@/;(N\u0006ŖȬnMk!m=t\\qn\u001a'\b=l5MQ\u0012\u0013(f?/Mbz\u0005\u0007irW\u001apt(Xõxn\u001e\u001a\u0014D\u0005\u000bY2Ɛu\u001cBSy4j=`\u0003LEq\u0001\u0017urhFз\u000572%\u0002$+\bGbʷtou \u0012<\u000b\n:9QSE\u0019\\Ş2jD|Y\u0006-\u001eHiuw_L3B\u0016W\u0002 $Fi[=j+\u0015\u000f+B\u0002sqz!,ʹSɟ+|\u0003)\u001dk14u9\u0003pZ\u00131^\u0018b%U\u000f^!<8h\u000e{yF)J*h[gLN\u000b\u0003\b?%˾\tġ#\u001e-˚@.\u000b;ECU lߓ ڏ\u0019aeɐ@:\bi'&#hZϽo݁sbYϡ\u0003WFQq\u000fN$4l9ܩvs`\u000eR\u000bD\riǥ nGތ:Ԫ\u000f/\u0006օWT\u001b{nwJ\u0015\u007f}jʝo,\u0004C4\u0013\rO\u000e\u001d]Uwm$жl\rZ\u000f@\nZ>Eܡ\u001eݞ$V_łY<\u0014u06o>9ŠHʢ(44фX\u0017Qb\u0002\u0006>}Vʎkʸ\u001b2Jƽ\fb\u001cc\u0011\\\u0005X[ݽGȚ%*\tϓ_?,\nM13p\u001d\u07bf;ҕ6\u0001[߹Y9xb\u0017fS.tXG-@X/\u000e{#\u0002\nXԔ\u0010ھ-ssƑ$:\u001e\u0010+Və\u001fm"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\f8t(5gG\u0007D}s*KF;A", "\u0019", "$", "", ";`g \\A>", "", "uH\u0018#", "1qT.g,\u001c])\b\n", "3uX0g0H\\v\t\u000bg;", "6hc\u0010b<Gb", "9dh X;", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCn\u0017&\u001d", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E'\u0005 \u001dGnp8\u0005(#Y\ru", ";`_", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", ";hb@66N\\(", ";n]6g6K", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0019Cr46c\u000b(\u0001[*7KFHu=\"*h`#\u0004h,L\u0006|", ">tc\u0010b<Gb", "\nrTA \u0006\u0017", "Ahi2", "u(8", "1qT.g,", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "3mc?l\u0019>[#\u0010z]", "", "3uX0g,=", "", "=kS#T3NS", "<df#T3NS", "uY;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044H7|0g\u001cdj;PM)Sv%V\"\u0012\u001d", "3uX0g\bEZ", "5dc", ">tc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "@d\\<i,", "@db6m,", "A`U2F0SS\u0003\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq1", "Ahi2B-", "AmP=f/Hb", "", "Ax]0[9H\\\u001d\u0014z]\u001dx\u0010?e", Global.BLANK, "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "Ax]0[9H\\\u001d\u0014z]\u001dx\u0010?e>8\u007f:\u0010\u0017*Vi\u001b<}%1g}", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "BnBAe0GU", "", "BqX:G6,W.~", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class LruCache<K, V> {
    public static final int $stable = 8;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashSet<K> keySet;
    private final HashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private final SynchronizedObject monitor = Synchronization_jvmKt.createSynchronizedObject();
    private int putCount;
    private int size;

    protected V create(K k2) {
        return null;
    }

    protected void entryRemoved(boolean z2, K k2, V v2, V v3) {
    }

    protected int sizeOf(K k2, V v2) {
        return 1;
    }

    public LruCache(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.maxSize = i2;
        this.map = new HashMap<>(0, 0.75f);
        this.keySet = new LinkedHashSet<>();
    }

    public void resize(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.monitor) {
            this.maxSize = i2;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(i2);
    }

    public final V get(K k2) {
        synchronized (this.monitor) {
            V v2 = this.map.get(k2);
            if (v2 != null) {
                this.keySet.remove(k2);
                this.keySet.add(k2);
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(k2);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.monitor) {
                this.createCount++;
                V vPut = this.map.put(k2, vCreate);
                this.keySet.remove(k2);
                this.keySet.add(k2);
                if (vPut != null) {
                    this.map.put(k2, vPut);
                    v2 = vPut;
                } else {
                    this.size = size() + safeSizeOf(k2, vCreate);
                }
                Unit unit = Unit.INSTANCE;
            }
            if (v2 != null) {
                entryRemoved(false, k2, vCreate, v2);
                return v2;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final V put(K k2, V v2) {
        V vPut;
        if (k2 == null || v2 == null) {
            throw null;
        }
        synchronized (this.monitor) {
            this.putCount++;
            this.size = size() + safeSizeOf(k2, v2);
            vPut = this.map.put(k2, v2);
            if (vPut != null) {
                this.size = size() - safeSizeOf(k2, vPut);
            }
            if (this.keySet.contains(k2)) {
                this.keySet.remove(k2);
            }
            this.keySet.add(k2);
        }
        if (vPut != null) {
            entryRemoved(false, k2, vPut, v2);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x009a, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.SynchronizedObject r2 = r7.monitor
            monitor-enter(r2)
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L9b
            if (r0 < 0) goto L92
            java.util.HashMap<K, V> r0 = r7.map     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L17
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L92
        L17:
            java.util.HashMap<K, V> r0 = r7.map     // Catch: java.lang.Throwable -> L9b
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9b
            java.util.LinkedHashSet<K> r0 = r7.keySet     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9b
            if (r1 != r0) goto L92
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L9b
            r6 = 1
            r5 = 0
            if (r0 <= r8) goto L76
            java.util.HashMap<K, V> r0 = r7.map     // Catch: java.lang.Throwable -> L9b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L76
            java.util.LinkedHashSet<K> r0 = r7.keySet     // Catch: java.lang.Throwable -> L9b
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r4 = kotlin.collections.CollectionsKt.first(r0)     // Catch: java.lang.Throwable -> L9b
            java.util.HashMap<K, V> r0 = r7.map     // Catch: java.lang.Throwable -> L9b
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r3 = r0.get(r4)     // Catch: java.lang.Throwable -> L9b
            if (r3 == 0) goto L8a
            java.util.HashMap<K, V> r0 = r7.map     // Catch: java.lang.Throwable -> L9b
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L9b
            java.util.Map r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r0)     // Catch: java.lang.Throwable -> L9b
            r0.remove(r4)     // Catch: java.lang.Throwable -> L9b
            java.util.LinkedHashSet<K> r0 = r7.keySet     // Catch: java.lang.Throwable -> L9b
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L9b
            java.util.Collection r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r0)     // Catch: java.lang.Throwable -> L9b
            r0.remove(r4)     // Catch: java.lang.Throwable -> L9b
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L9b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)     // Catch: java.lang.Throwable -> L9b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L9b
            int r0 = r7.safeSizeOf(r4, r3)     // Catch: java.lang.Throwable -> L9b
            int r1 = r1 - r0
            r7.size = r1     // Catch: java.lang.Throwable -> L9b
            int r0 = r7.evictionCount     // Catch: java.lang.Throwable -> L9b
            int r0 = r0 + r6
            r7.evictionCount = r0     // Catch: java.lang.Throwable -> L9b
        L73:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9b
            goto L79
        L76:
            r4 = r5
            r3 = r4
            goto L73
        L79:
            monitor-exit(r2)
            if (r4 != 0) goto L7f
            if (r3 != 0) goto L7f
            return
        L7f:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r7.entryRemoved(r6, r4, r3, r5)
            goto L0
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "inconsistent state"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            throw r1     // Catch: java.lang.Throwable -> L9b
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "map/keySet size inconsistency"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9b
            throw r1     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.caches.LruCache.trimToSize(int):void");
    }

    public final V remove(K k2) {
        V vRemove;
        k2.getClass();
        synchronized (this.monitor) {
            vRemove = this.map.remove(k2);
            this.keySet.remove(k2);
            if (vRemove != null) {
                this.size = size() - safeSizeOf(k2, vRemove);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (vRemove != null) {
            entryRemoved(false, k2, vRemove, null);
        }
        return vRemove;
    }

    private final int safeSizeOf(K k2, V v2) {
        int iSizeOf = sizeOf(k2, v2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k2 + '=' + v2).toString());
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (K k2 : this.keySet) {
                V v2 = this.map.get(k2);
                Intrinsics.checkNotNull(v2);
                linkedHashMap2.put(k2, v2);
            }
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.monitor) {
            int i2 = this.hitCount;
            int i3 = this.missCount + i2;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
        }
        return str;
    }

    public final <R> R synchronizedValue$ui_text_release(Function0<? extends R> function0) {
        R rInvoke;
        synchronized (this.monitor) {
            try {
                rInvoke = function0.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return rInvoke;
    }

    public final int size() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.size;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int hitCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.missCount;
        }
        return i2;
    }

    public final int createCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.createCount;
        }
        return i2;
    }

    public final int putCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.putCount;
        }
        return i2;
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.evictionCount;
        }
        return i2;
    }
}
