package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\":\u0017\u007f\u0007lmA0ZeP\u008cZS@\u000fsڔ<$q$yCAU \u00038ޛwPm˧|I\u000b\u0011S\u0011\u0016\u0016?iZI\u000ewlR,8V\u007fIAN\bCIb\u00056;ړ`$H\u007f\u000b\u007f(-`\u0010%~ŲO\f 5\u0001\u0002J\\\u001bN\u001d \"\bN 7Ȧ\u000biߑ:Hzc\u0003Y1\f\u0002H^)o0CX;Pt-\u0013uo)S@eAE5a\u0010\u001f^kA\u0013?(ܵ\u0015j7'qT\"e|lP)#,g\u0013mt6\\;ĩ\u000f\u000eˏ/Uk֟h\u0010.~\t\u0004]H\u0012\u0011\u001e'v2\u0004Ղrڿ\u00123|ɁՈD`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y&\"$kOD\u000eg5Nd2GJ$", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~Gz\u0012=QMDH0,\u0015g=B\u000bk(]z1P:Y,Z(", "1n]3\\.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y&\"$kOD\u000eg5Nd2GJ\r\u0012\\fsJ\u0010\u001aZ\u001c@/\u001c\bGL+rM7\r\u0013,G_Eq\u0002\u0010\u0018c", ">da6b+BQu\u0003vl", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001dm*/Z?CkB\u0010\u0019wd'\u0012j0Wv\u0015RLLjBR\u0007>!\u000eb\u000e\\\u001d\u0011\u0014\\//uH@\u001fu7I\u007f\u0019r\n\r\u001a\u0010\u000bK43", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001dm*/Z?CkB\u0010\u0019wd'\u0012j0Wv\u0015RLLjBR\u0007>!\u000eb\u000e\\\u001d\u0011\u0014\\//uH@\u001fu7I\u007f\u0019r\n\r\u001a\u0010\u000b.a", "5dc\u0010b5?W\u001b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001S\u0016BNP7s4,\u0007lp<tn3R\u007f'5WN*\u001b8rQ\u0015\u001fV\u0016N9~\thD\u0012yK;(\b\u001aT\u00029F\u000b\u0015\u0017\u00127@", "DdRAb9Bh\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|%u]H\u000bm5+r5GK*5`ZnL\u0018\u001cc{Y+\u000bZ", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "1n]CX9MS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "\u0019dh3e(FS'p~m/j\u00146i\t(iK\u0001\u0015tQx\u000f@x", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeyframesWithSplineSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final KeyframesWithSplineSpecConfig<T> config;
    private float periodicBias;

    public KeyframesWithSplineSpec(KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig) {
        this.config = keyframesWithSplineSpecConfig;
        this.periodicBias = Float.NaN;
    }

    public final KeyframesWithSplineSpecConfig<T> getConfig() {
        return this.config;
    }

    public KeyframesWithSplineSpec(KeyframesWithSplineSpecConfig<T> keyframesWithSplineSpecConfig, float f2) {
        this(keyframesWithSplineSpecConfig);
        this.periodicBias = f2;
    }

    /* JADX INFO: compiled from: AnimationSpec.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4F\u0005'Bߚ \tliG/twX0bSp\u000e{\u0004D*k&\u0002C\u0002TH~P\t\u0010Q˗knX\\S^\u001d\t.~z.YU/\\@\u0010bF}CKM&<\u007fnҽ:\u0007&70>ѯ\t\b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y&\"$kOD\u000eg5Nd2GJ\r\u0012\\fsJ\u0010\u001aZ\u001c@/\u001c\bGL+rM7\r\u0013,G_Eq\u0002\u0010\u0018c", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f>5\u0015c\nX\u007f(KN$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00067\u0002\u0017;IK;y\")\u0015f \u001f\u0007w-[r/G,W;`a\u0007\u0013", "u(E", "1qT.g,\u001e\\(\u0003\nr\r\u0007\u0016", "D`[BX", "1qT.g,\u001e\\(\u0003\nr\r\u0007\u0016ma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wIL?s0-\u0019rj\u0003\u0005m9N@\rG`O9XZrK\u0002\u001dZ\f\r\u0011\r\u0019ZN vD\u0017(\u00170X\u0016\u0011", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class KeyframesWithSplineSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframesSpec.KeyframeEntity<T>> {
        public static final int $stable = 0;

        public KeyframesWithSplineSpecConfig() {
            super(null);
        }

        @Override // androidx.compose.animation.core.KeyframesSpecBaseConfig
        public KeyframesSpec.KeyframeEntity<T> createEntityFor$animation_core_release(T t2) {
            return new KeyframesSpec.KeyframeEntity<>(t2, null, 0, 6, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> r22) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.KeyframesWithSplineSpec.vectorize(androidx.compose.animation.core.TwoWayConverter):androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec");
    }
}
