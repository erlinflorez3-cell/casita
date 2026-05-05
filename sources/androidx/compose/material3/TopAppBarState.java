package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4D\u0007\"B\u0012\u007f\u0007l~?5Z͜fI\u0003SX\u000e$zOdv4uQ;m\u001a,#\u0019S\\i\u007fnx[\u001bG\u001d\t.x\u0019-֒Yxk\u0016_>PtW3{u\u0014ʣlҽ:\u0005(݅rG\b\f\u0019\u001aXIF;ټGO$\u00146H~C#6[\u00102\u00124?P\u0005,f\u007fNdI#\"xsyɌݒBĚ+o8~S\u001cTd?\u000f|m,4`9;\"3aS)`mW\u0003mrm\tv8?+wt\u000ez\u0017DjƊ7̠\u0011g\u000b(b\u0018_i,)1cqY!76\r\u0013{;=4\u0012\u00141`.[\u001b\u001dLLwKɈԮ@г\u0006nJ\u0002\u0001yD'=\u00029AG$\u0007SgR'\\\b\u000b\u0013&6#/oW ڍ\u0012d-\u001dZ\u0012_:ҮDY"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\u001c\\?Jk\n", "", "7mXA\\(E6\u0019\u0003|a;f\n0s\u007f7bD\t\u001b&", "", "7mXA\\(E6\u0019\u0003|a;f\n0s\u007f7", "7mXA\\(E1#\b\n^5\fr0f\u000e(\u000b", "uE5\u0013\u001c\u001d", "-gT6Z/M=\u001a\u007f\t^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "1n[9T7LS\u0018_\bZ*\f\r9n", "5dc\u0010b3EO$\rz]\r\n\u0005-t\u00042\u0005", "u(5", "\nrTA \u0006\u0017", "1n]AX5M=\u001a\u007f\t^;", "5dc\u0010b5MS\"\u000ed_-\u000b\t>", "Adc\u0010b5MS\"\u000ed_-\u000b\t>", "uE\u0018#", "1n]AX5M=\u001a\u007f\t^;;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "<df\u001cY-LS(", "6dX4[;(T\u001a\rzm", "5dc\u0015X0@V(h{_:|\u0018", "Adc\u0015X0@V(h{_:|\u0018", "6dX4[;(T\u001a\rzm\u0013\u0001\u00113t", "5dc\u0015X0@V(h{_:|\u0018\u0016i\b,\u000b", "Adc\u0015X0@V(h{_:|\u0018\u0016i\b,\u000b", "6dX4[;(T\u001a\rzm\u0013\u0001\u00113t>'{G\u0001\u0019\u0013Vo", "=uT?_(I^\u0019}[k(z\u00183o\t", "5dc\u001ci,KZ\u0015\n\u0006^+]\u0016+c\u000f,\u0006I", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TopAppBarState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TopAppBarState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, TopAppBarState, List<? extends Float>>() { // from class: androidx.compose.material3.TopAppBarState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<Float> invoke(SaverScope saverScope, TopAppBarState topAppBarState) {
            return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(topAppBarState.getHeightOffsetLimit()), Float.valueOf(topAppBarState.getHeightOffset()), Float.valueOf(topAppBarState.getContentOffset())});
        }
    }, new Function1<List<? extends Float>, TopAppBarState>() { // from class: androidx.compose.material3.TopAppBarState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ TopAppBarState invoke(List<? extends Float> list) {
            return invoke2((List<Float>) list);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final TopAppBarState invoke2(List<Float> list) {
            return new TopAppBarState(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
        }
    });
    private MutableFloatState _heightOffset;
    private final MutableFloatState contentOffset$delegate;
    private final MutableFloatState heightOffsetLimit$delegate;

    public TopAppBarState(float f2, float f3, float f4) {
        this.heightOffsetLimit$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.contentOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f4);
        this._heightOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
    }

    public final float getHeightOffsetLimit() {
        return this.heightOffsetLimit$delegate.getFloatValue();
    }

    public final void setHeightOffsetLimit(float f2) {
        this.heightOffsetLimit$delegate.setFloatValue(f2);
    }

    public final float getHeightOffset() {
        return this._heightOffset.getFloatValue();
    }

    public final void setHeightOffset(float f2) {
        this._heightOffset.setFloatValue(RangesKt.coerceIn(f2, getHeightOffsetLimit(), 0.0f));
    }

    public final float getContentOffset() {
        return this.contentOffset$delegate.getFloatValue();
    }

    public final void setContentOffset(float f2) {
        this.contentOffset$delegate.setFloatValue(f2);
    }

    public final float getCollapsedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return getHeightOffset() / getHeightOffsetLimit();
    }

    public final float getOverlappedFraction() {
        if (getHeightOffsetLimit() == 0.0f) {
            return 0.0f;
        }
        return 1 - (RangesKt.coerceIn(getHeightOffsetLimit() - getContentOffset(), getHeightOffsetLimit(), 0.0f) / getHeightOffsetLimit());
    }

    /* JADX INFO: compiled from: AppBar.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B\\IV2\b2\u000b_N\u0016j~J`\fq\u0011و\u001a~rߚaW~a \u0014̙Fu"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\u001c\\?Jkr{\u001fpl5\u0010g6WL", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/@5\t+\u0014i#\u001c\\?Jk\n", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<TopAppBarState, ?> getSaver() {
            return TopAppBarState.Saver;
        }
    }
}
