package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: ActivityResultContract.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0006DLc\u0003İI\u00066\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JfP.hS2\u000fq|<$i*yCAW \"8ޛwPm˧|I\u0003\rI\u000e\u0014\u0016)jZJ\u000ewnR\u0012̓FoM5\u0016\u000bK<xtd\tP60=\u0012\u0005/ ZL\u001e}\u0013C\u0002ÈXTϮt:`\u0015\u0016((\u001b\u001eF0\u0003.\\\u001eMLG\u001bgj31\b\u0002B|-\u00104\u000bT%F\u000b܋S\u000bҐ\"+NB}23_\u001b\u0007\tZo\u0007M~U\u0005\u00175W1W\u0003o8n~B\u0019qsոar4lԍUr"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]\u0002", "\u0017", "\u001d", "", "u(E", "1qT.g,\"\\(~\u0004m", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m_Bg", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u0018JH;iCsXO]B\u0006p6RupEVW;\\[\u0002\u0007w\u001bi\u000eW:b", "5dc l5<V&\t\u0004h<\u000bu/s\u0010/\u000b", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u0018JH;iCsXO]B\u0006p6Ru:\u0011HL;`cvL([g\u000e\\;\u0014\u0014#?.wSD\u001b\u0006;\u0013]9w\u0005\u001d\u001a\u001dIWpPf\u0017VW\u001f~P6dDh\u001eg[JCe7n\u0015i-j':2$x(p", ">`a@X\u0019>a)\u0006\n", "@dbB_;\u001c]\u0018~", "", "7mc2a;", "uH;.a+K]\u001d}D\\6\u0006\u0018/n\u000fq_I\u0010\u0017 VEQ#{!FUG'3v\u0018w7@@k2-j", "!x]0[9H\\#\u000f\tK,\u000b\u00196t", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ActivityResultContract<I, O> {
    public abstract Intent createIntent(Context context, I i2);

    public SynchronousResult<O> getSynchronousResult(Context context, I i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O parseResult(int i2, Intent intent);

    /* JADX INFO: compiled from: ActivityResultContract.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRш|\u0004G\nFéVD\u0005\":\u0011(\u0007\u0015jy;TiV/jS`\u000fө\u007f42]t\u0003Q<m\u001a4\"\u07beSVog|Or\rI\u0012\u0014\u001aѷn2"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014q\t@\u000f'\u001eV9\fF\u007f4BU{/\u0001I\u0014=QT?zH\u000b\u0015vq@\u0016A6W\u00064CJ]jJf{;\u0017\u001fd\u0017X;\u001bqYO4uS\r", "\"", "", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t2) {
            this.value = t2;
        }

        public final T getValue() {
            return this.value;
        }
    }
}
