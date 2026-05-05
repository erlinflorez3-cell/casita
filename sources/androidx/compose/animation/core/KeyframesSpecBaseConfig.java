package androidx.compose.animation.core;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>é6B\u0005\"4\u0012\u0006\rnj?7Le^.ZS0\u0018s{B)c$wDCU0}*ޛWN}gvJp\u000bKƤ\fK\u000f̓TK[ތk\u00117>HnM3uuM;pt|\u0004N3R8(\u0007A\u001f0JǘzzQNT'>R\t:\t\f}\t(%\u001e>VҵdzʄR8N\u0001kOw=\u0011\u007fZN]^X|\u0004εvZ-\f\u0005x6+n<{խ'٨\u0007\u0007`s\b\u001dM\u000bU\u0005\u001f&O+\u007f֕\b<^~\"/CO;x9̽^ԇU`\u001aCsgqhh\u000e^v#{C;4\u0012\u0014E`.[9-ڣ\u0010\u07baxra`!(lH\u0018z\u0010;G+\u000629=3f\u007ffq^\r{Rˣ\u0019̷'\rvďsV\u0014g##tyW:_J\u000en\\\u0015q=\u001c\t!h\b)\u00124_\u007f]\u0001GsUi\u000eيE؝%w\n҆\\i|\u0011npskXUN,?.E8!\u0012jFt\u0005\"O\u0003g\u0003ҋOɟX\r\u0006ܱ+\"b\bJ2غ\u000fNp\u000bȲnp"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f>5\u0015c\nX\u007f(KN$", "\"", "\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;H0,\u0015HjH\u000br@$", "", "u(E", "\nrTA \u0006\u0017", "", "2d[.l\u0014BZ \u0003\t", "5dc\u0011X3:g\u0001\u0003\u0002e0\u000b", "u(8", "Adc\u0011X3:g\u0001\u0003\u0002e0\u000b", "uH\u0018#", "2ta.g0H\\\u0001\u0003\u0002e0\u000b", "5dc\u0011h9:b\u001d\t\u0004F0\u0004\u00103s", "Adc\u0011h9:b\u001d\t\u0004F0\u0004\u00103s", "9dh3e(FS'", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "5dc\u0018X@?`\u0015\u0007zljx\u00123m{7\u007fJ\n\u0011\u0015Q|\u000e6\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%\u0019b\r\n4r\u0016,\\+7v\n", "1qT.g,\u001e\\(\u0003\nr\r\u0007\u0016", "D`[BX", "1qT.g,\u001e\\(\u0003\nr\r\u0007\u0016ma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wIL?s0-\u0019rj\u0003\u0005m9N@\rG`O9XZr\u001a\u0010 ZmW:\u0011\u0014m\u0017", "/s", "Bh\\2F;:[$", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017?Do<\u001a$lkBPa6[vp-Lb-iNz=p\u000eh\u000e.4\u001c\thUy", "/s5?T*MW#\b", "4qP0g0H\\", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017?Do<\u001a$lkBPa6[vp-Lb-iNz=p\u000eh\u000e.4\u001c\thUy", "CrX;Z", "3`b6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001dm*/Z?Ck\u0011\u001a#hAB\u0016g;bL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#=-rL3.\f6RK9r\u000e\f_m1xtKXe\u000b`\u0011~@6rJXrCEKMm4r\f)\u0019e>B #u#$2N8\u0017{\u001dvrfztcO\u0019W42>MdUI~i\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f \u001f\u0007w-[r/GZ<7\\PPG\u001d\u0013^\u0010$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y&\"$kOD\u000eg5Nd2GJ\r\u0012\\fsJ\u0010\u001aZ\u001c@/\u001c\bGL+rM7\r\u0013,G_Eq\u0002\u0010\u0018c", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {
    public static final int $stable = 8;
    private int delayMillis;
    private int durationMillis;
    private final MutableIntObjectMap<E> keyframes;

    public /* synthetic */ KeyframesSpecBaseConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract E createEntityFor$animation_core_release(T t2);

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = IntObjectMapKt.mutableIntObjectMapOf();
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final void setDurationMillis(int i2) {
        this.durationMillis = i2;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final void setDelayMillis(int i2) {
        this.delayMillis = i2;
    }

    public final MutableIntObjectMap<E> getKeyframes$animation_core_release() {
        return this.keyframes;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public E at(T t2, int i2) {
        E e2 = (E) createEntityFor$animation_core_release(t2);
        this.keyframes.set(i2, e2);
        return e2;
    }

    public E atFraction(T t2, float f2) {
        return (E) at(t2, Math.round(this.durationMillis * f2));
    }

    public final E using(E e2, Easing easing) {
        e2.setEasing$animation_core_release(easing);
        return e2;
    }
}
