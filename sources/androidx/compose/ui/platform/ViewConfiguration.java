package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
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
/* JADX INFO: compiled from: ViewConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4E\u0007\":\u0017\u007f\u0007lqA0ZeP.XU0s\u0002ڔd$\n#BSIU2}P\n&Ʌi̊rNr\rI\u0011\u0014\u0019Iz:Mmx\f\u0013e̗DņC7eqC>nw\u0007\u0017.8:8(\f7n\u0001Б\u0012ͯ~Gc\u000e\u00188Ny\u000bd\u001bW\u001d\u001a@\rttWȽ^ʄR:`ncE=,SyPZ?_^}$ϜHù+\u0011\u000fc$8N:\u0006'3a\u001b\u0007\u0001buW\u0016ѓ?ݾl+?-O\u0003e?)\u0018\"%CO;n)z3ӻSՙ\u000bʬ̼NbׂT\u0012@y\u0001\u000e\u001b?T\u001e\u0014:`.[!=ۃ\u0010\u07baxvkBV\u0016lKʎyaت\u00174\b61ݯ7\u0015Pi;\u001fm?}\u000b,L\"ѐr6ƽX\u000f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "", "2nd/_,-O$f~g\u001b\u0001\u0011/M\u0004/\u0003D\u000f", "", "5dc\u0011b<;Z\u0019mvi\u0014\u0001\u0012\u001ei\b(cD\b\u001e\u001bU", "u(9", "2nd/_,-O$m~f,\u0007\u0019>M\u0004/\u0003D\u000f", "5dc\u0011b<;Z\u0019mvi\u001b\u0001\u0011/o\u00107cD\b\u001e\u001bU", "6`]1j9Bb\u001d\b|@,\u000b\u0018?r\u007f\u000f\u007fI\u0001~\u0013Tq\u0012E", "", "5dc\u0015T5=e&\u0003\nb5~j/s\u000f8\t@g\u001b GW\nIx)>", "u(5", "6`]1j9Bb\u001d\b|L3\u0007\u0014", "5dc\u0015T5=e&\u0003\nb5~v6o\u000b", ":n]4C9>a'm~f,\u0007\u0019>M\u0004/\u0003D\u000f", "5dc\u0019b5@>&~\tl\u001b\u0001\u0011/o\u00107cD\b\u001e\u001bU", ";`g6`<F4 \u0003\u0004`\u001d|\u00109c\u00047\u0010", "5dc\u001aT?B[)\u0007[e0\u0006\u000b e\u00072yD\u0010+", ";h]6`<FB#\u000fxa\u001bx\u00161e\u000f\u0016\u007fU\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "5dc\u001a\\5B[)\u0007ih<z\f\u001ea\r*{On\u001b,G7u0\n\u0016\u0002Li", "Bnd0[\u001aE]$", "5dc!b<<V\u0007\u0006\u0005i", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ViewConfiguration {
    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    float getTouchSlop();

    /* JADX INFO: compiled from: ViewConfiguration.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        public static float getHandwritingSlop(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingSlop();
        }

        @Deprecated
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ */
        public static long m5911getMinimumTouchTargetSizeMYxV2XQ(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.mo5670getMinimumTouchTargetSizeMYxV2XQ();
        }

        @Deprecated
        public static float getMaximumFlingVelocity(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getMaximumFlingVelocity();
        }

        @Deprecated
        public static float getHandwritingGestureLineMargin(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingGestureLineMargin();
        }
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo5670getMinimumTouchTargetSizeMYxV2XQ() {
        float f2 = 48;
        return DpKt.m6660DpSizeYgX7TsA(Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(f2));
    }
}
