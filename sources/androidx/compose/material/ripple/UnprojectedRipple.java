package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004O\u000f8\u000b4C\u0007\"B\u0012\u007fјnjG6LeN0ZS8\u0014s{:%c$\bCCU }*\t]NogtO`\u000bYƤ$.)jZH\u000exu+O=RsM3eok:žx6\u0013\"zBF\u0003\u001d\u0001H/x\u0014\u0005\u0005[K:\u0017`D~Ej\r{\u0011`\u0012Ř=ĨӘ\"^m[DV5cH>;\u0003\u0018R\u0015;(6\u000b^%F\u0003(S\u000b*<9RO5C8\u0004\u0007\u0015\\s?1D\"A\u0013s?'YU؎V̬ݼ\u0004\u0016\u001b?]\"&~4r\u001dQ\u000f\u001fW/]zcP</H\u0007\n\rT\u0004<\u0007}Ρ0ǉ\u001ef\u0010Ԅ\u0004\u0001\u0001VXP0_\u0019Ș\u0007ˋ:\u0017-Į\u0004?G\u001f~Sw:GS\u000eީ\u0011۵\u001dŀҠm ƟX\u000ehٽkd\u0006WISV<vU`ԲIъ\brj\u00028\f΅G\t7~\u0017Ѧ3S6c9)@Ȧ\u0006b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i'v!;WH;iC\u001e\u0014UeD\u0012j,$", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW)z0@`}~Di(*JJ;A", "0nd;W,=", "", "uY\u0018#", ">q^7X*MS\u0018", "@h_=_,\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "@h_=_,+O\u0018\u0003\u000bl", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1`[0h3:b\u0019k~i7\u0004\t\ro\u00072\t", "1n[<e", "/k_5T", "", "1`[0h3:b\u0019k~i7\u0004\t\ro\u00072\t\bP(\u0001G<\u001c0", "uI5u=", "5dc\u0011\\9Mgu\t\u000bg+\u000b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "7r??b1>Q(~y", "Adc\u0010b3H`", "", "Adc\u0010b3H``]\u000eF;\u0005}-", "uI5uI", "Bqh X;+O\u0018\u0003\u000bl", "@`S6h:", "\u0011n\\=T5B]\"", "\u001bQP1\\<L6\u0019\u0006\u0006^9", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class UnprojectedRipple extends RippleDrawable {
    public static final Companion Companion = new Companion(null);
    private static boolean setMaxRadiusFetched = false;
    private static Method setMaxRadiusMethod = null;
    private final boolean bounded;
    private boolean projected;
    private Color rippleColor;
    private Integer rippleRadius;

    public UnprojectedRipple(boolean z2) {
        super(ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK), null, z2 ? new ColorDrawable(-1) : null);
        this.bounded = z2;
    }

    /* JADX INFO: renamed from: setColor-DxMtmZc */
    public final void m1771setColorDxMtmZc(long j2, float f2) {
        long jM1770calculateRippleColor5vOe2sY = m1770calculateRippleColor5vOe2sY(j2, f2);
        Color color = this.rippleColor;
        if (color == null ? false : Color.m4179equalsimpl0(color.m4188unboximpl(), jM1770calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = Color.m4168boximpl(jM1770calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(ColorKt.m4232toArgb8_81llA(jM1770calculateRippleColor5vOe2sY)));
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.projected = false;
        return dirtyBounds;
    }

    public final void trySetRadius(int i2) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == i2) {
            return;
        }
        this.rippleRadius = Integer.valueOf(i2);
        MRadiusHelper.INSTANCE.setRadius(this, i2);
    }

    /* JADX INFO: renamed from: calculateRippleColor-5vOe2sY */
    private final long m1770calculateRippleColor5vOe2sY(long j2, float f2) {
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2;
        }
        return Color.m4177copywmQWz5c$default(j2, RangesKt.coerceAtMost(f2, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: compiled from: RippleHostView.android.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjG6L͜NÐRiճ?k*3d`*qٴ?U(}j\u001f]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\ttЩ7T"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i'v!;WH;iC\u001e\u0014UeD\u0012j,\r^\u0014CKR<j5rD\u001f\u0012gc", "", "u(E", "Adc\u001fT+Bc'", "", "@h_=_,", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW)z0@`}~Di(*JJ;A", "@`S6h:", "", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class MRadiusHelper {
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        public final void setRadius(RippleDrawable rippleDrawable, int i2) {
            rippleDrawable.setRadius(i2);
        }
    }

    /* JADX INFO: compiled from: RippleHostView.android.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȡs̊rJbŏ\u0014\u001d\u0014\u0019\u0011lBH\u0004|4܋\u001b̓FoG\u074cޢsB"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i'v!;WH;iC\u001e\u0014UeD\u0012j,\rT1OWJ5`\\{\u0013", "", "u(E", "Adc\u001aT?+O\u0018\u0003\u000bl\r|\u0018-h\u007f'", "", "Adc\u001aT?+O\u0018\u0003\u000bl\u0014|\u00182o~", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
