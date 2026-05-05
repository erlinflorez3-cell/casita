package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,o\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007toA0JfP.`Z2\u000f\u0002{<$a$yCQU\"}(\u0012g}ug\u0007J\t\fc\u0015\fǝ\u0007lTI\u0004{\u000e\u0018\u001d6ZqU2\u0014qm=nyN\u0005N8R<\b\f\u0019\u001aXNVvټGK\u001a\u001aHV~Cj\r{\u000fB\u0016\u0016>&\u0002Lg\u0018RDT\u0005]h9iɅ\u0002y\\4w0+W-LZ܋\u001bx\n\u001eYC_;%'c\u0003MT\nM3C\u007fL\u001dhm)[M\u0002gNXF\u0016E/]\u001eurl^Kĩԃ\u0010'9a{\u000b^!@wA}-B\n\u05fa\u0014)p.[\u001d\u000f\u000e\u001e5\u0005r\u001aB~\u0010\u000fF\u000e\u000fy6E/079N3f\u0018ck\u001d\\M\u0014\u0005S S\u0005|8sTTb[Ñƻ{Q?i`IVݐ\"YklZ͒5͆.\u00048ϚĲ3\u0015"}, d2 = {"\u0017mU6a0MS|\u000ezk(\f\r9n\u000e", "", "1qT.g,,^&\u0003\u0004`\b\u0006\r7a\u000f,\u0006I\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEtBs", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "Dhb6U0EW(\u0013ia9|\u00172o\u0007'", "2`\\=\\5@@\u0015\u000e~h", "", "AsX3Y5>a'", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\r/:\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#=-rL3.\f6RK9r\u000e\f_i>nx>e\u0014Q\u0003#K", "1kP:c\u0017EO-m~f,", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|%u]H\u000bm5+r5GK*5`ZnL\u0018\u001cc{Y+\u000bZ", ">kPFG0FS", "5dc\u0011h9:b\u001d\t\u0004F0\u0004\u00103s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dpqeA\u0003r0X\u007f\u0015RLL\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001\u001b\u00110Q}Jl\u000b\u0015_\f?wp\f2\u0019K\u0002\u0011\u0005E3q7Y]\tQN\u001bI&m\u000bl'`9Mm\u0012{!&r^.Sw\\\u0015zN\tkqPbxB1>77OIwQKx1(<{u!<eJ\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&=0*>8\"CUl?jH\u001bhh=\u0011\u0012j1@\u001donTH\r\u0016g$1xF", "5dc#T3NSy\f\u0005f\u0014\u0001\u00106i\u000e", ">kPFG0FS\u0001\u0003\u0002e0\u000b", "AsP?g", "3mS", "AsP?g\u001d>Z#|~m@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dpqeA\u0003r0X\u007f\u0015RLL\u0002A9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00045M\n7w\u0005\u0016\u001fW3t}B kP}\u001dqP-rOJ_wVKR8\u0011`\u0015^*f>97]o##sZ<\nEO\u001avZuvkQ\"D6.Km%\"Ns]8\u0004+)Tlw\u0010Ab\u0002\u0001[)\r37@h\u0004^1\u0016Hf\u0004\u001f:\\\u000b#/:D\u000fNOm~6<\u0018u\u001f+c\u0017f=-(iol9\u000f\u0005l!h\u000b%F|@Q\u0013HMn(pD\tJf\u0004#\tP viQ?*X\u000b#:B,l\u0011L^o\u001c$*%Ac\u0018Y*]FW ^", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorizedAnimationSpecKt {
    private static final int InfiniteIterations = Integer.MAX_VALUE;

    public static final <V extends AnimationVector> long getDurationMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v2, V v3, V v4) {
        return vectorizedAnimationSpec.getDurationNanos(v2, v3, v4) / AnimationKt.MillisToNanos;
    }

    public static final <V extends AnimationVector> V getValueFromMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j2, V v2, V v3, V v4) {
        return (V) vectorizedAnimationSpec.getValueFromNanos(j2 * AnimationKt.MillisToNanos, v2, v3, v4);
    }

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j2) {
        return RangesKt.coerceIn(j2 - ((long) vectorizedDurationBasedAnimationSpec.getDelayMillis()), 0L, vectorizedDurationBasedAnimationSpec.getDurationMillis());
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1 */
    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001f\u001d̉=!4i\bӵLc\u0003\"I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnʑa/ǏkPDɟ\u0004*=jDC2^<qq=\u0006\u001e\f&!O|l.ĈJ+\u001dQ\u000f\u001e\u001c\tl<I\u0004z\f\u0013e˳DņC3Uڎ\u07b2=f"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//{1\u007fH|&\u001bQxW:\u000125#n 5| ;QX;j\u0010'\u0019p]H\u000bm5<\u0002'E2]jZ_r9#\u0012H\u0019[/\u0016\u00075J(v@F#\u00125W@\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEtBs", "/mX:f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=;NHo= \u0003sa7\\", "5dc", "7mS2k", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Animations {
        private final List<FloatSpringSpec> anims;

        AnonymousClass1(AnimationVector animationVector, float f2, float f3) {
            IntRange intRangeUntil = RangesKt.until(0, animationVector.getSize$animation_core_release());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(new FloatSpringSpec(f2, f3, animationVector.get$animation_core_release(((IntIterator) it).nextInt())));
            }
            this.anims = arrayList;
        }

        @Override // androidx.compose.animation.core.Animations
        public FloatSpringSpec get(int i2) {
            return this.anims.get(i2);
        }
    }

    public static final <V extends AnimationVector> Animations createSpringAnimations(V v2, float f2, float f3) {
        if (v2 != null) {
            return new Animations(v2, f2, f3) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt.createSpringAnimations.1
                private final List<FloatSpringSpec> anims;

                AnonymousClass1(AnimationVector v22, float f22, float f32) {
                    IntRange intRangeUntil = RangesKt.until(0, v22.getSize$animation_core_release());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                    Iterator<Integer> it = intRangeUntil.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FloatSpringSpec(f22, f32, v22.get$animation_core_release(((IntIterator) it).nextInt())));
                    }
                    this.anims = arrayList;
                }

                @Override // androidx.compose.animation.core.Animations
                public FloatSpringSpec get(int i2) {
                    return this.anims.get(i2);
                }
            };
        }
        return new Animations(f22, f32) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt.createSpringAnimations.2
            private final FloatSpringSpec anim;

            AnonymousClass2(float f22, float f32) {
                this.anim = new FloatSpringSpec(f22, f32, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i2) {
                return this.anim;
            }
        };
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2 */
    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b6B\r(4ߚ \u0006߿pAFǏ\u0016H\\Q\u001c9\u001dm\u00144R\\TuQ>m\u001a,&OѾN8s|Jr\u000bq\u0010\\Ǡz̶0I]ތٛ\u0016\u0014"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//{1\u007fH|&\u001bQxW:\u000125#n 5| ;QX;j\u0010'\u0019p]H\u000bm5<\u0002'E2]jZ_r9#\u0012H\u0019[/\u0016\u00075J(v@F#\u00125W@\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEtBs", "/mX:", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=;NHo= \u0003sa7\\", "5dc", "7mS2k", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass2 implements Animations {
        private final FloatSpringSpec anim;

        AnonymousClass2(float f22, float f32) {
            this.anim = new FloatSpringSpec(f22, f32, 0.0f, 4, null);
        }

        @Override // androidx.compose.animation.core.Animations
        public FloatSpringSpec get(int i2) {
            return this.anim;
        }
    }
}
