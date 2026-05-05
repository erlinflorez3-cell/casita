package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0015\u007f\u0007|jAӄLe^.ZS0\u0014s{B$cҕyCI^\"}(\u0015WNu\u000bvϺb\u000bQ\u001b\u000e\u0016~j2]kތ\u0006\u0018\u0015˰Png3{oe?fsD\u0006H2P8*\u0005/\u001ajU |\u0001BY\u000e*0nsĐV\r[\tb'\u0014M8\u00034[\u001eMfLzmR/YɅ0TĚ+_>\u000e\u0016\u0011TY?\r%dfXNIM\u0015Sf3\u000b`oW\u0003m\u0007m\tv7?+\u007f֕\b:f\u0016,\u0015aN=c\u0001=t\u0007g_B&qaӍOP\u001c@@~\n&T\u0004<\u0019oL<32f6\u0011{\u000b\u0001mXR\u0018]x~+eD'=\u007fiٿ\u007fӜfЂe;'_\u007f\u007f\u0013\u00146#/qi_b\u0010x\u0015IW@U?]X=vQRtK\t\u001crx\u0001`\u0003`K\u000e?\u0014\u0011dϏU;iU;!\"\u0001ҩHg\u0005\")lavjHn%7)EH!\u000epC\u001b\u0004\u001cTbhD\u0011\u0004ȼΤ\u000b}\u0016$hl\u0006[9%>a\u007fnoi[_\"%]i}m7\u0007\u001cwQ^a8\u0002g\u001eqjvJ̳lf\u0013t~B\n\u000b!\\͈&2V\fX{\nRf\fA5\b\r*VD1G_EL\u0011.ZA3ȁ\u0010^v,\u0017Ti#I{˨x\t\u000fq%\u0001}\u000b\u0011U<~p\"cۋa7)&\f!\u0017XE)\u0015$\f\u007fu\u000e\u0013[\u0015z$\u001dm{N)J=_1U\u0013=\u0002oFR9SQ\u000be\u007fPh\u0600\u0007܃}\u000fCÜ~s\u0016p\t,\u000fm!֥`Ђ&vfаs\u0014r\u0007\u0012at}\u001eύ`ߏ_>QͿSeJVP|3(tݕ\u0003Ȟ&|=Ԇ\u0014?+ \u0010 ?\u0017q] ۰>{r\u000f\\s\u0014\u000f\u0003Ϧ\u0018̔fQeЦ\fDW[\u0017>P'CÚN\u05f8nw\u0010ȷY@\u001b?`A\u0013s-ИYߵ3}n߿|\u0019~cs:ArTұ:ʡ.sK͟djQ3)M\u0002jDޱWů\u000fJ\u0017Ϙσ\u007fY"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng$'%k\f?vz", "\u0019", "", "$", ";`g \\A>", "", "uH\u0018#", "1qT.g,\u001c])\b\n", "3uX0g0H\\v\t\u000bg;", "6hc\u0010b<Gb", ":nR8", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\u0005 &G|\u00178}n\u001cc{&\r", ";`_", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\u0005 &G|\u00178}n\u001cf\u000e\u00033{\u0019\u0016IN\u0011", ";hb@66N\\(", ">tc\u0010b<Gb", "Ahi2", "1qT.g,", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "3mc?l\u0019>[#\u0010z]", "", "3uX0g,=", "", "=kS#T3NS", "<df#T3NS", "uY;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044H7|0g\u001cdj;PM)Sv%V\"\u0012\u001d", "3uX0g\bEZ", "5dc", ">tc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "@d\\<i,", "@db6m,", "A`U2F0SS\u0003\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq1", "Ahi2B-", "AmP=f/Hb", "", "BnBAe0GU", "", "BqX:G6,W.~", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    protected V create(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    protected void entryRemoved(boolean z2, K key, V oldValue, V v2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    protected int sizeOf(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    public LruCache(int i2) {
        this.maxSize = i2;
        if (!(i2 > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    public void resize(int i2) {
        if (!(i2 > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i2;
            Unit unit = Unit.INSTANCE;
        }
        trimToSize(i2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final V get(K key) {
        V v2;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            V v3 = this.map.get(key);
            if (v3 != null) {
                this.hitCount++;
                return v3;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                v2 = (V) this.map.put(key, vCreate);
                if (v2 != null) {
                    this.map.put(key, v2);
                } else {
                    this.size += safeSizeOf(key, vCreate);
                    Unit unit = Unit.INSTANCE;
                }
            }
            if (v2 != null) {
                entryRemoved(false, key, vCreate, v2);
                return v2;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final V put(K key, V value) {
        V vPut;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(key, value);
            vPut = this.map.put(key, value);
            if (vPut != null) {
                this.size -= safeSizeOf(key, vPut);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            androidx.collection.internal.Lock r5 = r6.lock
            monitor-enter(r5)
            int r0 = r6.size     // Catch: java.lang.Throwable -> L61
            r4 = 1
            if (r0 < 0) goto L15
            androidx.collection.internal.LruHashMap<K, V> r0 = r6.map     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L17
            int r0 = r6.size     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = r4
        L18:
            if (r0 != 0) goto L1f
            java.lang.String r0 = "LruCache.sizeOf() is reporting inconsistent results!"
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalStateException(r0)     // Catch: java.lang.Throwable -> L61
        L1f:
            int r0 = r6.size     // Catch: java.lang.Throwable -> L61
            if (r0 <= r7) goto L5f
            androidx.collection.internal.LruHashMap<K, V> r0 = r6.map     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L2c
            goto L5f
        L2c:
            androidx.collection.internal.LruHashMap<K, V> r0 = r6.map     // Catch: java.lang.Throwable -> L61
            java.util.Set r0 = r0.getEntries()     // Catch: java.lang.Throwable -> L61
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)     // Catch: java.lang.Throwable -> L61
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L3e
            monitor-exit(r5)
            return
        L3e:
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L61
            androidx.collection.internal.LruHashMap<K, V> r0 = r6.map     // Catch: java.lang.Throwable -> L61
            r0.remove(r3)     // Catch: java.lang.Throwable -> L61
            int r1 = r6.size     // Catch: java.lang.Throwable -> L61
            int r0 = r6.safeSizeOf(r3, r2)     // Catch: java.lang.Throwable -> L61
            int r1 = r1 - r0
            r6.size = r1     // Catch: java.lang.Throwable -> L61
            int r0 = r6.evictionCount     // Catch: java.lang.Throwable -> L61
            int r0 = r0 + r4
            r6.evictionCount = r0     // Catch: java.lang.Throwable -> L61
            monitor-exit(r5)
            r0 = 0
            r6.entryRemoved(r4, r3, r2, r0)
            goto L0
        L5f:
            monitor-exit(r5)
            return
        L61:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }

    public final V remove(K key) {
        V vRemove;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            vRemove = this.map.remove(key);
            if (vRemove != null) {
                this.size -= safeSizeOf(key, vRemove);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    private final int safeSizeOf(K k2, V v2) {
        int iSizeOf = sizeOf(k2, v2);
        if (!(iSizeOf >= 0)) {
            RuntimeHelpersKt.throwIllegalStateException("Negative size: " + k2 + '=' + v2);
        }
        return iSizeOf;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int size() {
        int i2;
        synchronized (this.lock) {
            i2 = this.size;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.lock) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int hitCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.missCount;
        }
        return i2;
    }

    public final int createCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.createCount;
        }
        return i2;
    }

    public final int putCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.putCount;
        }
        return i2;
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.map.getEntries().size());
            Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            int i2 = this.hitCount;
            int i3 = this.missCount + i2;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
        }
        return str;
    }
}
