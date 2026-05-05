package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007f\u0007lp?\u0016Z͜x.\u0001Rb\u000exDG2[<qq<\u001c>ջ!ޛӠMf̊rL`\rQ\u0012N1\u0007nDI\u0004y\u000e\u0016\u001d7Zom9\u0014\u0014\u00818śԓ5\u0004ڶ6$>\u0001\u0013\tbEV\u0019\u000fzqL<\u0016>E\t:\u0001\u0013\u0014)ݾ\u0011ßͽ\u001f\u007fɉ`iT@Vt&M=.\u001bipOm\u0004ޗ{ձЮESܮ\u0011xg*9C̳4\u0015ǯS\u0012\u000fRa^\u000bBwݗ!\u0017&/-O\u0013\u00065ނ\u0004\"Ǆ/N"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "", "1`[0h3:b\u0019[\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1`[0h3:b\u0019[\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003^u\u001bO\u0013\fw\r", "u(5", "1`[0h3:b\u0019ez_;g\u0005.d\u00041}", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1`[0h3:b\u0019ez_;g\u0005.d\u00041}\b\u0011c'Q]}$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\nau", "1`[0h3:b\u0019k~`/\fs+d~,\u0005B", "1`[0h3:b\u0019k~`/\fs+d~,\u0005BH'cWy{,^", "1`[0h3:b\u0019m\u0005i\u0017x\b.i\t*", "1`[0h3:b\u0019m\u0005i\u0017x\b.i\t*C\u001fTv\u001c\u0017pu", "\u000fab<_<MS", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface PaddingValues {
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    float mo968calculateBottomPaddingD9Ej5fM();

    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    float mo969calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    float mo970calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    float mo971calculateTopPaddingD9Ej5fM();

    /* JADX INFO: compiled from: Padding.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4O\u0007\"B\u0012\u007f\u0007loA0RnP\u008cZS8şsڔ<$i*yّCU(\n*ޛUS}˧\u001fJ\t\n\u0004:\u0016\u001c~j:Imx\f\u0013\u001f8HoM5eok:pz<\u0005.5:8(\u0006\u0011 0H\u001ez\u0013Cy\rܘ4@~?\u001b [\u00112\u00124?f\u0015ʟ[f¦5ԟǰa<50\u0011w\u000bi5nH|{\u000evX5\u001d\u000faL<\u0007KÆ\u0014$ھ\u0002ޗқ_A\tQ\u007fPM\u00045;CI\"Xf\\\u000e$-+}\u001e$\u0007Ο[\u0004Ƣ_ϯˏ/Qi`^!p\u000b\t\u0012%<2\u000fL;З-,ָeڜԧ7vxjN^JoP\u0018\u0013ad0U\u0006AEQ\u001d|P\u0010V_ע7D\u000b\u001b:;\u0001\u001d>\"hVf#9lw\u007fP\u0018T\u000ed\\\u000eq=\u001c\u0005'bXÓ\u0006ϻFĉôz\u0010ѧ\u001b-?[G+1m\bNRnG!nhki\u0001Iv\"Eݯ9Ӡ\bȱ˧CcʰoX\\X:\u0019]\u001eZ\u0010\f\u000fc<jzT!S\u0011\u0005O?ȍlލ\\܃ˑ.eƠ]vs\u000eeAn5;[q\u00172n\u0005\u0016W<\u0011\u0006\u000ff\u0019ͱ\u000eʐ[̥Ш1Gн\u0014\u007f\u0004D\\\u0014#4E|*;μ1\"d\u0018Nҳ:p@\u0005\teyӹ\u0014\u001f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u0015\"\bK\u00051N\\],2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", ":dUA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "Bn_", "@hV5g", "0ncAb4", "uE5\u00139\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u000fb;M]!FY2\f\u0002X0M>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "\u0014", "5dc\u0019X-M\u001bwRZc{}pma\t1\u0006O|&\u001bQx\u001c", "5dc\u001f\\.Ab`]N>1L\n\u0017${1\u0005J\u0010\u0013&Ky\u0017J", "5dc!b7\u00062l^\u007f.-dG+n\t2\u000b<\u0010\u001b!P}", "1`[0h3:b\u0019[\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003", "1`[0h3:b\u0019[\u0005m;\u0007\u0011\u001aa~'\u007fI\u0003^u\u001bO\u0013\fw\r", "u(5", "1`[0h3:b\u0019ez_;g\u0005.d\u00041}", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "1`[0h3:b\u0019ez_;g\u0005.d\u00041}\b\u0011c'Q]}$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\nau", "1`[0h3:b\u0019k~`/\fs+d~,\u0005B", "1`[0h3:b\u0019k~`/\fs+d~,\u0005BH'cWy{,^", "1`[0h3:b\u0019m\u0005i\u0017x\b.i\t*", "1`[0h3:b\u0019m\u0005i\u0017x\b.i\t*C\u001fTv\u001c\u0017pu", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        public /* synthetic */ Absolute(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
            this(f2, f3, f4, f5);
        }

        /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m1031getBottomD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m1032getLeftD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m1033getRightD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m1034getTopD9Ej5fM$annotations() {
        }

        private Absolute(float f2, float f3, float f4, float f5) {
            this.left = f2;
            this.top = f3;
            this.right = f4;
            this.bottom = f5;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Left padding must be non-negative".toString());
            }
            if (f3 < 0.0f) {
                throw new IllegalArgumentException("Top padding must be non-negative".toString());
            }
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Right padding must be non-negative".toString());
            }
            if (f5 < 0.0f) {
                throw new IllegalArgumentException("Bottom padding must be non-negative".toString());
            }
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
        public float mo969calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
        public float mo971calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
        public float mo970calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo968calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return Dp.m6643equalsimpl0(this.left, absolute.left) && Dp.m6643equalsimpl0(this.top, absolute.top) && Dp.m6643equalsimpl0(this.right, absolute.right) && Dp.m6643equalsimpl0(this.bottom, absolute.bottom);
        }

        public int hashCode() {
            return (((((Dp.m6644hashCodeimpl(this.left) * 31) + Dp.m6644hashCodeimpl(this.top)) * 31) + Dp.m6644hashCodeimpl(this.right)) * 31) + Dp.m6644hashCodeimpl(this.bottom);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) Dp.m6649toStringimpl(this.left)) + ", top=" + ((Object) Dp.m6649toStringimpl(this.top)) + ", right=" + ((Object) Dp.m6649toStringimpl(this.right)) + ", bottom=" + ((Object) Dp.m6649toStringimpl(this.bottom)) + ')';
        }

        public /* synthetic */ Absolute(float f2, float f3, float f4, float f5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 + 1) - (1 | i2) != 0 ? Dp.m6638constructorimpl(0) : f2, (i2 + 2) - (2 | i2) != 0 ? Dp.m6638constructorimpl(0) : f3, (4 & i2) != 0 ? Dp.m6638constructorimpl(0) : f4, (i2 & 8) != 0 ? Dp.m6638constructorimpl(0) : f5, null);
        }
    }
}
