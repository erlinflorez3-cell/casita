package com.facebook.react.views.switchview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007fјnjG6LeN/ZS@\u000fs{:$c$\u007fCCU \u007f*\teNogtQ`ŏYƤ6\u0016'ilTe|k\u0012'2ppУ7M}?\u0002n\u0003?\u001d `,h}\u0013\f2*v\u0016=z\fY\u001a\u001eH@\u001fG\u0003\u0011[\u00102\u00124Df\u0015fju\\NH\u001bjj31\u0012\u0002B|+&DEh\u001bVl';\u0004\u0012\"9QO5C7\u0004\t\u0015]sA\u0019> Cݾl'5>\u0012\u007feJp\u007fB\"[S\u001br\u000b&\u000b\t\u001as\u001a=CO\u0012X\u0001\u00146\u0003\u0013}#;2\u0014Ν+H<Dbt\u0016&Kt!`pT\u0010mZ\u007f)e|\u0017m\u0013ACQ\u001b\u0015^\u0012A'YO}\u001b\fL)ъr!ikVs#4lw\u007f>\u0002FKSf\fo<\u001c\nͲf\u00028\u001bxZ\u000eI\u0014\u0011\\$U=iD;#\u0002\u0001vJϼz\u0005n\u007f$u`KX\"\u001d\u001a\u000eѪ\u0015ɔ^Dlʍ<`b]D\u0013c\u001b\u0003\rTܴ\u001fء`yD!3\u0017\u001f_vq\u0003Os\tS5=ƀeˇo\u0010_9l:̹U~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001cNz43\\\u000f$7\u007f_\u001bM?9z\"0\u0019w_<\\", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W*\t)DW\u0001}Au!*\\\u0019", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/k[<j\nAO\"\u0001z", "", "BqP0^\nHZ#\f[h9]\u00056s\u007f", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "BqP0^\nHZ#\f[h9k\u0016?e", "1qT.g,+W$\n\u0002^\u000b\n\u0005Aa|/{\u001e\u000b\u001e!T]\u001d8\u0006%\u001c]\f/", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^!\u001eQ|{Kr45@\u0002.FC", "1n[<e", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "", "Adc\u0010[,<Y\u0019}", "1gT0^,=", "Adc\u0010b3H`", "2qPDT)ES", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "uKP;W9HW\u0018H|k(\b\f3c\u000eqzM|)\u0013Dv\u000e\u0006U21ky\u001d>mk\u0015R?Lg}%\u0011qc\u0003jl;Nx'T\"\u0012\u001d", "Adc\u001ca", "=m", "Adc![<FPv\t\u0002h9", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "Adc!e(<Yv\t\u0002h9", "Adc!e(<Yv\t\u0002h9]\u0013<F{/\n@", "Adc!e(<Yv\t\u0002h9]\u0013<T\r8{", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactSwitch extends SwitchCompat {
    private boolean allowChange;
    private Integer trackColorForFalse;
    private Integer trackColorForTrue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSwitch(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.allowChange = true;
    }

    private final ColorStateList createRippleDrawableColorStateList(int i2) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{i2});
    }

    private final void setTrackColor(boolean z2) {
        Integer num = this.trackColorForTrue;
        if (num == null && this.trackColorForFalse == null) {
            return;
        }
        if (!z2) {
            num = this.trackColorForFalse;
        }
        setTrackColor(num);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        setBackground(new RippleDrawable(createRippleDrawableColorStateList(i2), new ColorDrawable(i2), null));
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) throws Throwable {
        if (!this.allowChange || isChecked() == z2) {
            super.setChecked(isChecked());
            return;
        }
        this.allowChange = false;
        super.setChecked(z2);
        setTrackColor(z2);
    }

    public final void setColor(Drawable drawable, Integer num) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void setOn(boolean z2) throws Throwable {
        if (isChecked() != z2) {
            super.setChecked(z2);
            setTrackColor(z2);
        }
        this.allowChange = true;
    }

    public final void setThumbColor(Integer num) {
        Drawable thumbDrawable = super.getThumbDrawable();
        Intrinsics.checkNotNullExpressionValue(thumbDrawable, "getThumbDrawable(...)");
        setColor(thumbDrawable, num);
        if (num == null || !(super.getBackground() instanceof RippleDrawable)) {
            return;
        }
        ColorStateList colorStateListCreateRippleDrawableColorStateList = createRippleDrawableColorStateList(num.intValue());
        Drawable background = super.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        ((RippleDrawable) background).setColor(colorStateListCreateRippleDrawableColorStateList);
    }

    public final void setTrackColor(Integer num) {
        Drawable trackDrawable = super.getTrackDrawable();
        Intrinsics.checkNotNullExpressionValue(trackDrawable, "getTrackDrawable(...)");
        setColor(trackDrawable, num);
    }

    public final void setTrackColorForFalse(Integer num) {
        if (Intrinsics.areEqual(num, this.trackColorForFalse)) {
            return;
        }
        this.trackColorForFalse = num;
        if (isChecked()) {
            return;
        }
        setTrackColor(this.trackColorForFalse);
    }

    public final void setTrackColorForTrue(Integer num) {
        if (Intrinsics.areEqual(num, this.trackColorForTrue)) {
            return;
        }
        this.trackColorForTrue = num;
        if (isChecked()) {
            setTrackColor(this.trackColorForTrue);
        }
    }
}
