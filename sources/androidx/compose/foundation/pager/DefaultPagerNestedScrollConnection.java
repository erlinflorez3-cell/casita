package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000bnjO0LeN1ZS@\u000fsڔ<$q$yCA\\\"}0\u000eWNmhtJpŏs\u000f4\u00159}<Mcxu\u0012=3RsM5eok<žx6\u0013$zCF\u0003\u001d\u0001H4x\u0014\u0005\u0006[K:\u001c`D~Fj\r{\u000f`ŞDͽ\u001fҵɉ`iTCVz&b=2\u001bip^Wc>\be\rtdW\u0011\u0005m6+nGe\u00193d\u001b\u0007\u0001m\u0006\u0017Ճpܵݾl)->W\b Vf\u0015,\u0015Y_=a\u00012t\u0005\u007fp<+9`{K~ n\f¶zȞʀ\b\u0010\f=VEu4t &3#|{@~\f\u000fF\u000e|y6E(Ƨ2ٿݰ\u001fhWzI3\u0017K\n %\u001eQ\u001d\u0017!\ndT`۶\u001aƘɐU3W]Kf\u001f\u0019g?\u0006\u0004\u001fe͆.\n8Ϛ\u00181\u0002\u0016<\u001duFi9;!\u001a\u0003ҩHm~ݓxjYp`Pؚ\"s\u001e:0À(\tC\u0087\t\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001L\u0016/ISBz\u001f\u001a\u0017hn\"\u0007q;Nu\u0015EYX3c0|F\u001d\u0012X\u001dR5\u0016Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001!\b:X\u0012Hh\u000fU\u007f\u001b9jyQR\u001fK\u0004\u001eK\u0005\u001a", "5dc\u001ce0>\\(z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~dy\"7z_\u0019IE;x\"-\u0011wa\u000f", "=m?<f;\u001fZ\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "1n]@h4>R", "/uP6_(;Z\u0019", "=m?<f;\u001fZ\u001d\b|&\u0019qU3Ap\u001c", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "=m?<f;,Q&\t\u0002e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "=m?<f;,Q&\t\u0002es[\u001e\u0019Qsrc", "uI9\u0016\u001c\u0011", "=m??X\u001a<`#\u0006\u0002", "=m??X\u001a<`#\u0006\u0002&\u0016\u0012gza].", "uI8u=", "1n]@h4>=\"h\bb,\u0006\u0018+t\u00042\u0005", "1n]@h4>=\"h\bb,\u0006\u0018+t\u00042\u0005\bl\t!O;uF", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$:\f", ";`X;4?Ba", "", ";`X;4?Ba`\u0005B-3hS\u0017", "uI\u0018\u0013", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {
    private final Orientation orientation;
    private final PagerState state;

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    public final PagerState getState() {
        return this.state;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m1250consumeOnOrientationQWom1Mo(long j2, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Velocity.m6871copyOhffZ5M$default(j2, 0.0f, 0.0f, 2, null);
        }
        return Velocity.m6871copyOhffZ5M$default(j2, 0.0f, 0.0f, 1, null);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo1094onPreScrollOzD1aCk(long j2, int i2) {
        if (NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5280getUserInputWNlRxjI()) && Math.abs(this.state.getCurrentPageOffsetFraction()) > 1.0E-6d) {
            float currentPageOffsetFraction = this.state.getCurrentPageOffsetFraction() * this.state.getPageSize$foundation_release();
            float pageSize = ((this.state.getLayoutInfo().getPageSize() + this.state.getLayoutInfo().getPageSpacing()) * (-Math.signum(this.state.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
            if (this.state.getCurrentPageOffsetFraction() > 0.0f) {
                pageSize = currentPageOffsetFraction;
                currentPageOffsetFraction = pageSize;
            }
            float fM3938getYimpl = -this.state.dispatchRawDelta(-RangesKt.coerceIn(this.orientation == Orientation.Horizontal ? Offset.m3937getXimpl(j2) : Offset.m3938getYimpl(j2), currentPageOffsetFraction, pageSize));
            float fM3937getXimpl = this.orientation == Orientation.Horizontal ? fM3938getYimpl : Offset.m3937getXimpl(j2);
            if (this.orientation != Orientation.Vertical) {
                fM3938getYimpl = Offset.m3938getYimpl(j2);
            }
            return Offset.m3930copydBAh8RU(j2, fM3937getXimpl, fM3938getYimpl);
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo820onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5279getSideEffectWNlRxjI()) && m1249mainAxisk4lQ0M(j3) != 0.0f) {
            throw new CancellationException("Scroll cancelled");
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo819onPostFlingRZ2iAVY(long j2, long j3, Continuation<? super Velocity> continuation) {
        return Velocity.m6866boximpl(m1250consumeOnOrientationQWom1Mo(j3, this.orientation));
    }

    /* JADX INFO: renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m1249mainAxisk4lQ0M(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m3937getXimpl(j2) : Offset.m3938getYimpl(j2);
    }
}
