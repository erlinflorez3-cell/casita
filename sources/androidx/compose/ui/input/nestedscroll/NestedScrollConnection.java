package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
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
/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0007\"B\u0012\u007fјnjO0LeN5X8@ş\u001c{b#$E\u007fCSUH~R\r]P\u007fg\u001dK\u000b\u000fQ\u0012\u001e\u0016'krֆ\u0014\u0084\\܈Ƥ6DuCAR8eGf\r63'b&F{\u001d\u0001H1x\u0014\u0005}[K:\u0019`D~Bj\r{\u000e`&Ř=ĨӘ\"^mXDS5vH;;\u0003\u0018C~+m3\u0015M;G\u001bܢKɱ`ӜҋD9;\"3aK'`jW\u0003mxm\tv*?+wz\b:f\b,\u0015YXSqů%ؘԇUb\u001279`ԣJOʮ(\u0003\u0003~\u0013ɿ <\u0005/J4LHeۅ\u0012EЀvT"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "", "=m?<f;\u001fZ\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "1n]@h4>R", "/uP6_(;Z\u0019", "=m?<f;\u001fZ\u001d\b|&\u0019qU3Ap\u001c", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "=m?<f;,Q&\t\u0002e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "=m?<f;,Q&\t\u0002es[\u001e\u0019Qsrc", "uI9\u0016\u001c\u0011", "=m??X\rEW\"\u0001", "=m??X\rEW\"\u0001BJ\u001e\u0007\u0011zM\n", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "=m??X\u001a<`#\u0006\u0002", "=m??X\u001a<`#\u0006\u0002&\u0016\u0012gza].", "uI8u=", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface NestedScrollConnection {
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    default Object mo819onPostFlingRZ2iAVY(long j2, long j3, Continuation<? super Velocity> continuation) {
        return m5255onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, continuation);
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    default Object mo1093onPreFlingQWom1Mo(long j2, Continuation<? super Velocity> continuation) {
        return m5256onPreFlingQWom1Mo$suspendImpl(this, j2, continuation);
    }

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m5260onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j2, int i2) {
            return NestedScrollConnection.super.mo1094onPreScrollOzD1aCk(j2, i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m5258onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j2, long j3, int i2) {
            return NestedScrollConnection.super.mo820onPostScrollDzOQY0M(j2, j3, i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m5259onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j2, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo1093onPreFlingQWom1Mo(j2, continuation);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m5257onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j2, long j3, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo819onPostFlingRZ2iAVY(j2, j3, continuation);
        }
    }

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    default long mo1094onPreScrollOzD1aCk(long j2, int i2) {
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    default long mo820onPostScrollDzOQY0M(long j2, long j3, int i2) {
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m5256onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j2, Continuation<? super Velocity> continuation) {
        return Velocity.m6866boximpl(Velocity.Companion.m6886getZero9UxMQ8M());
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m5255onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j2, long j3, Continuation<? super Velocity> continuation) {
        return Velocity.m6866boximpl(Velocity.Companion.m6886getZero9UxMQ8M());
    }
}
