package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4G\u0007\"B\u0012\u007f\u0007toA0JlN.hݷZ\u000f\u001azt7k(\u007fCSUH~2\r]P\u007fg\u001dIҼ\u000fC\u001d\t^\u0017x9aU'gB\u0013@P\b?aW AGo\r63*b&F\n\u001d\u0001H4\u000f$?\tQ\\$\u0012^J!>`\u001fe\u0005H\u001cL>p\u0010,^\u007fNdGǰa@7݊\u001bkHR5d\u0001\f[\r^TU\u000ețe$3¨O7\u001b+a\nWjiG\u001bE\u0002?\u0015hU1YRJɥ8ݼ\u0004\u001a\u001dۀg\u000fc}4hԍUs"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\u0018x8'\u0017LjH\u0011T0N\t\u0015RLL\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc><\u0002'E\"", ">`V2e\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", "2dU.h3M0&\u0003\u0004`\u0010\u0006\u00189V\u0004(\u000e.\f\u0017\u0015", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u000fX;\u0016\u0004UP(xM\u0001!\b:X\u0012Hh\u000fUr\u001b9sr&_\u001fQj\u0019uS\u0017sFW5=8", "5dc\u0011X-:c \u000eWk0\u0006\u000b\u0013n\u000f2lD\u0001)\u0005Ro\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r\u0018x8'\u0017LjH\u0011T0N\t\u0015RLL\u0002", "5dc\u001dT.>`\u0007\u000evm,", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~dy\"7z_\u0019IE;x\"-\u0011wa\u000f", "Aba<_3\u001a\\\u001d\u0007vm0\u0007\u0012\u001dp\u007f&", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "5dc V9HZ Z\u0004b4x\u00183o\t\u0016\u0007@~", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\", "1`[0h3:b\u0019lxk6\u0004\u0010\u000ei\u000e7wI~\u0017", "=eU@X;", "Ahi2", "1n]AT0GS&l~s,", "=uT?e0=S\u0004\f\u0005i6\u000b\t.O\u0001)\n@\u0010~!Xo", ">q^=b:>R\u0003\u007f{l,\fp9v\u007f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PagerBringIntoViewSpec implements BringIntoViewSpec {
    private final BringIntoViewSpec defaultBringIntoViewSpec;
    private final PagerState pagerState;
    private final AnimationSpec<Float> scrollAnimationSpec;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec bringIntoViewSpec) {
        this.pagerState = pagerState;
        this.defaultBringIntoViewSpec = bringIntoViewSpec;
        this.scrollAnimationSpec = bringIntoViewSpec.getScrollAnimationSpec();
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }

    public final BringIntoViewSpec getDefaultBringIntoViewSpec() {
        return this.defaultBringIntoViewSpec;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public AnimationSpec<Float> getScrollAnimationSpec() {
        return this.scrollAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public float calculateScrollDistance(float f2, float f3, float f4) {
        float fCalculateScrollDistance = this.defaultBringIntoViewSpec.calculateScrollDistance(f2, f3, f4);
        if (fCalculateScrollDistance != 0.0f) {
            return overrideProposedOffsetMove(fCalculateScrollDistance);
        }
        if (this.pagerState.getFirstVisiblePageOffset$foundation_release() == 0) {
            return 0.0f;
        }
        float firstVisiblePageOffset$foundation_release = this.pagerState.getFirstVisiblePageOffset$foundation_release() * (-1.0f);
        if (this.pagerState.getLastScrolledForward()) {
            firstVisiblePageOffset$foundation_release += this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        return RangesKt.coerceIn(firstVisiblePageOffset$foundation_release, -f4, f4);
    }

    private final float overrideProposedOffsetMove(float f2) {
        float firstVisiblePageOffset$foundation_release = this.pagerState.getFirstVisiblePageOffset$foundation_release() * (-1);
        while (f2 > 0.0f && firstVisiblePageOffset$foundation_release < f2) {
            firstVisiblePageOffset$foundation_release += this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        while (f2 < 0.0f && firstVisiblePageOffset$foundation_release > f2) {
            firstVisiblePageOffset$foundation_release -= this.pagerState.getPageSizeWithSpacing$foundation_release();
        }
        return firstVisiblePageOffset$foundation_release;
    }
}
