package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.braze.ui.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0RkP.XU2\u000fy{<$a%wWQ٥J}P\b\u0010[m{~Nh\u000b[\u000f4\u0017ѱn,WW9t\u0018#BF}?KM\u001e>If\u00039\u001d\"H!f}ڱ\u0005\u001a8MX\r\tNc\f@<ptH_%M3!B\nL.\u0019\u001e\u000bn\u0015H\u0019xk@G#1p\u0019ú3ۢ4|Uε\u0017`5\u0015\u000faL2\u0017ʽAչ)S\u000bޗ#gM\fWqk\f?Ѫ3ȅMs_̬)\f\"\u001fCO;dI̩hԇU`\u0014ʬˬSr"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015EkI\u0010b,M]#[V^;2", "\u001a`]1e6BRb\u0011~].|\u0018xR\u007f/wO\u0005(\u0017.k\"F\u00074\u000b", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]Lj8", ";`g\u0011X-B\\\u0019}]^0~\f>P\u0004;{G\u000f", "", ";`g\u0011X-B\\\u0019}lb+\f\f\u001ai\u0013(\u0003N", ";h]\u0011X-B\\\u0019}]^0~\f>P\u0004;{G\u000f", ";h]\u0011X-B\\\u0019}lb+\f\f\u001ai\u0013(\u0003N", "=m<2T:N`\u0019", "", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class InAppMessageBoundedLayout extends RelativeLayout {
    private int maxDefinedHeightPixels;
    private int maxDefinedWidthPixels;
    private int minDefinedHeightPixels;
    private int minDefinedWidthPixels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, C1561oA.Xd("\\iipbvs", (short) (FB.Xd() ^ 4687)));
        Object[] objArr = {attributeSet, R.styleable.InAppMessageBoundedLayout};
        Method method = Class.forName(Wg.vd("drixnie0n{{\u0003lv}86ccjThe", (short) (ZN.Xd() ^ 30363))).getMethod(hg.Vd("(\u001a+\u0017\u001e\"\u0006&*\u001c\u0014\u0012m \u001f\u001c\u0012\n\u001c\u001a\n\u0017", (short) (OY.Xd() ^ 31546), (short) (OY.Xd() ^ 4146)), Class.forName(Qg.kd("\b\u0014\t\u0016\u0012\u000b\u0005M\u0014\u0012\u0006\bHZ\r\f\t~v\t\u0007vct\u0003", (short) (FB.Xd() ^ 25371), (short) (FB.Xd() ^ 2600))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(typedArray, C1561oA.ud("CNLQASN\u0007G9J6=A%EI;31\r?>;\ue9cb5\u000754\u0010'43 %\"}*/'\u001c\u001c\u001a\u0001\u0015,!&$W", (short) (FB.Xd() ^ 16752)));
            this.maxDefinedWidthPixels = typedArray.getDimensionPixelSize(R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxWidth, 0);
            this.minDefinedWidthPixels = typedArray.getDimensionPixelSize(R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinWidth, 0);
            this.maxDefinedHeightPixels = typedArray.getDimensionPixelSize(R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxHeight, 0);
            this.minDefinedHeightPixels = typedArray.getDimensionPixelSize(R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinHeight, 0);
            typedArray.recycle();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.minDefinedWidthPixels;
        if (i4 <= 0 || size >= i4) {
            int i5 = this.maxDefinedWidthPixels;
            if (i5 > 0 && size > i5) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.maxDefinedWidthPixels, View.MeasureSpec.getMode(i2));
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(this.minDefinedWidthPixels, View.MeasureSpec.getMode(i2));
        }
        int size2 = View.MeasureSpec.getSize(i3);
        int i6 = this.minDefinedHeightPixels;
        if (i6 <= 0 || size2 >= i6) {
            int i7 = this.maxDefinedHeightPixels;
            if (i7 > 0 && size2 > i7) {
                i3 = View.MeasureSpec.makeMeasureSpec(this.maxDefinedHeightPixels, View.MeasureSpec.getMode(i3));
            }
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(this.minDefinedHeightPixels, View.MeasureSpec.getMode(i3));
        }
        super.onMeasure(i2, i3);
    }
}
