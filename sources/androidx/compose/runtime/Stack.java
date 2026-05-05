package androidx.compose.runtime;

import java.util.ArrayList;
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
/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007\"B\u0012\u007fјnjG6LeN/ZS8\u000fsڔ<$i-yCA]\"}0\u0018WNmgtϺpŏk\u0011\fǝ\u0007i\\I\u0004x\u001e\u0015Ƥ6B}@{Q}FQ`#@M$@-Py3\rb.V\u001d\u000fzqWT\u001b>N\t:\t҈̂\t\u001a \u0015\u00071\u000f,tg\u0005ȤxpkJG#1oŌR'mAEV\u001bXl'CǸҐ\"+NF}&3f\u001b\u0007\u0001go\u0007M\u0006U\u0005\u001fѧݳ/I\u0002l~g\u000e*-1_\u000fmr\\ؘ3hԃ\u0010'9g4g^\u0010@\b\u000b}\u001d<:\u05fa4*14=\u001cv\bDޗSv*öRؿbB\bЭ2E%*\u00183Y?Q+Ђe?1P=\u0003\u0013\u0015̽'\u001a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr#;/", "\"", "", "u(E", "0`R8\\5@", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "Ahi2", "", "5dc \\A>", "u(8", "1kT.e", "", "7r4:c;R", "", "7r=<g\fF^(\u0013", ">dT8", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", ">n_", ">tb5", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "Bn0?e(R", "", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Stack<T> {
    public static final int $stable = 8;
    private final ArrayList<T> backing = new ArrayList<>();

    public final int getSize() {
        return this.backing.size();
    }

    public final boolean push(T t2) {
        return this.backing.add(t2);
    }

    public final T pop() {
        return this.backing.remove(getSize() - 1);
    }

    public final T peek() {
        return this.backing.get(getSize() - 1);
    }

    public final T peek(int i2) {
        return this.backing.get(i2);
    }

    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final void clear() {
        this.backing.clear();
    }

    public final T[] toArray() {
        int size = this.backing.size();
        T[] tArr = (T[]) new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            tArr[i2] = this.backing.get(i2);
        }
        return tArr;
    }
}
