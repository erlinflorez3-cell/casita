package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: MutableVectorWithMutationTracking.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007tjA0JgP.`Y2\u000fq\u0003<$iByCAV\"}8\tWNmitϺpŏk\u0011\fǝ\u0007i\\I\u0004x\u001e1\u001f<PpW9]qM9\u0017Қd\u00070<0;\u0012\u000b\u0011\u001c:H>{)Gƚ\u0010\u0012>F9S`\u001ce\u0005H\u00176B.\u00116\\\u0016XfLznR/YɅݦFN5qx\u0007[ ^Z7\u000f\u0007aTѨnK}\u00193h\u001b\u0007\u0001`\b\u001eM\bU\u0005\u0017,W;W\u000boBh\u0002$\u0015a˽\u001d_\u0003&\u000b\n\u007fxRʳ1\u0018wYi&(.\u07be,\u0011J\u0014&\u0006URtƭ\u001aǴ\f\u000eA\u000f;dNk\u001a^xȕ+eD'=\u007fa5ݰ\u001ff_{\f.\\:\u0014\u000b\u001d 3\u0001\u001d&\nX\u05f8d\u001b#Ƙ\u0010S7XNE\u0019]\u0018bUm2z\u0019Fò\b4_\u00025\u0007\u001f:g:E\\Q)1m\u0012Hzϙ%\u0007¾lYqɭ`B({$EҐ\r("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uL\u0006!2`}\u00117k%8Z5?z7\u0006%w]H\u000bm5=\u0004#ERR5^(", "\"", "", "DdRAb9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "=mE2V;H`\u0001\u000f\nZ;|\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:\u0001,<Y{/;w\u001fw5SJg1%\u0015Ya7\u0016m9$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD3VO\u0007", "5dc\u001ca\u001d>Q(\t\bF<\f\u0005>e~", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Ahi2", "", "5dc \\A>", "u(8", "5dc#X*M]&", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006t/<`}\u001eFq 7\u0017+Kz0\u001b\u001chR9\u0005r6[L", "/cS", "7mS2k", "3kT:X5M", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "/r;6f;", "", "1kT.e", "4na\u0012T*A", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@d\\<i,\u001ab", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;
    private final Function0<Unit> onVectorMutated;
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(MutableVector<T> mutableVector, Function0<Unit> function0) {
        this.vector = mutableVector;
        this.onVectorMutated = function0;
    }

    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final Function0<Unit> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return this.vector.getSize();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void add(int i2, T t2) {
        this.vector.add(i2, t2);
        this.onVectorMutated.invoke();
    }

    public final T removeAt(int i2) {
        T tRemoveAt = this.vector.removeAt(i2);
        this.onVectorMutated.invoke();
        return tRemoveAt;
    }

    public final void forEach(Function1<? super T, Unit> function1) {
        MutableVector<T> vector = getVector();
        int size = vector.getSize();
        if (size > 0) {
            T[] content = vector.getContent();
            int i2 = 0;
            do {
                function1.invoke(content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    public final List<T> asList() {
        return this.vector.asMutableList();
    }

    public final T get(int i2) {
        return this.vector.getContent()[i2];
    }
}
