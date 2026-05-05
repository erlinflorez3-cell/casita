package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN2ZS8\u0016s{:-a)\bّc[ Ԃ0\bwN\u0016g\u001fPj\rS\u000fL\u0015'klV[\rm\u0016\u001d4Zom6ޜs=Gd5C\u000bړB&F~\u001d\u0001H0Н\u0014v\tJ\u0014/ <Xph_=Q\u0013(*\u0006tĨ1\"jvf6~Ǎ\u000e>=3\u001bix÷ms݁\u0001M\u001bW\u001dJ\u001b\ty\u001ea¨g9#3k\u0003=Ѹ\fC\u0011N\n=;ؒW+9Y\fWlݙF(Ʀ/O\u001bp;Qj\u0019i`Bʬ[Sq`h\u000eV\u0005+\u007f\u001bJ\u001c\u000e<Ωx2;)~\bDޗ%vaPh\u0002\u0015ۍF\u000fˋ:\u00173\u0016{VG2~Q\u0018ݢIRE\u0011\u001d\rL01r/il\u000e\u0017ٽKX\u0006`IQv׀xR\u0018iUm:͏)\u0016ò\b0U\u0016\u007f\b\u001f3/%ea\u0010\u05fd#Ƞ\u0006HLϙG\u0013npki\t̲\u0017̑\u001bގ;,\u0011\fhM5\u0013yZlXbҊ$ȿ\u0001Θ\u0002\n\u001b j\u0001\r/3\u001bfO\u001fȉAܗ\nܦ)1n7gw±\u0012o"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3~\u001cr]Hbl0Vr6KVW\u001agRp\u0013", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3~\u0019qeH\u0007?5R~#VPX5J]r;i", "/mX:", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=)L?s0-\u0019rj'\u0012c*$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018t *\\\u001fDo<\u001a$lkBtn,LLj8", "/mX:f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEtBs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=,j,R", "3mS#X3HQ\u001d\u000e\u000fO,z\u00189r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "D`[BX\u001d>Q(\t\b", "Dd[<V0Mg\n~xm6\n", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b0", "5dc\u0012a+/S \txb;\u0011", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b2w\u0001\u0011?bx*\bv\u0002>2An\u0013K1\u0014Gb\u0001\u0011;`K0o4F ?\u0015?~pF\nw#k\u0011~b3@#r;", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO6oSK~4t\u000fbs\u001b1e~/s@M24>o\u000fYga:g|\u001d(kE1/\u007f:\u001dLK-QuB\u0016d.e\u0012\u0017S5/(or9", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.anims = animations;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.VectorizedFloatAnimationSpec$1 */
    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0019\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<H\u0007ӬT\u0011Մ\rn\u0001ˎ`D\u0014Gvaa*'k*5T_2s[;\u0004\u001dD̴\tҐRk"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//{1\u007fH|&\u001bQxW:\u000125#n 5| ;QX;j\u0015%\u001fdp\u0015\u0010g4J\u0006+QU<7\\P1\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEtBs", "5dc", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=)L?s0-\u0019rj'\u0012c*$", "7mS2k", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Animations {
        AnonymousClass1() {
        }

        @Override // androidx.compose.animation.core.Animations
        public FloatAnimationSpec get(int i2) {
            return floatAnimationSpec;
        }
    }

    public VectorizedFloatAnimationSpec(FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            AnonymousClass1() {
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int i2) {
                return floatAnimationSpec;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v2, V v3, V v4) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v2);
        }
        V v5 = this.valueVector;
        if (v5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v5 = null;
        }
        int size$animation_core_release = v5.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v6 = this.valueVector;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v6 = null;
            }
            v6.set$animation_core_release(i2, this.anims.get(i2).getValueFromNanos(j2, v2.get$animation_core_release(i2), v3.get$animation_core_release(i2), v4.get$animation_core_release(i2)));
        }
        V v7 = this.valueVector;
        if (v7 != null) {
            return v7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v2, V v3, V v4) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v4);
        }
        V v5 = this.velocityVector;
        if (v5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v5 = null;
        }
        int size$animation_core_release = v5.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v6 = this.velocityVector;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v6 = null;
            }
            v6.set$animation_core_release(i2, this.anims.get(i2).getVelocityFromNanos(j2, v2.get$animation_core_release(i2), v3.get$animation_core_release(i2), v4.get$animation_core_release(i2)));
        }
        V v7 = this.velocityVector;
        if (v7 != null) {
            return v7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V v2, V v3, V v4) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(v4);
        }
        V v5 = this.endVelocityVector;
        if (v5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            v5 = null;
        }
        int size$animation_core_release = v5.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v6 = this.endVelocityVector;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                v6 = null;
            }
            v6.set$animation_core_release(i2, this.anims.get(i2).getEndVelocity(v2.get$animation_core_release(i2), v3.get$animation_core_release(i2), v4.get$animation_core_release(i2)));
        }
        V v7 = this.endVelocityVector;
        if (v7 != null) {
            return v7;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v2, V v3, V v4) {
        Iterator<Integer> it = RangesKt.until(0, v2.getSize$animation_core_release()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            jMax = Math.max(jMax, this.anims.get(iNextInt).getDurationNanos(v2.get$animation_core_release(iNextInt), v3.get$animation_core_release(iNextInt), v4.get$animation_core_release(iNextInt)));
        }
        return jMax;
    }
}
