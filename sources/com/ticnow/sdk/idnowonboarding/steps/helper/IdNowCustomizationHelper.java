package com.ticnow.sdk.idnowonboarding.steps.helper;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.model.customization.IdNowSdkCustomization;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`\\2\u000fq{<$i*yّQ٥J}P\b\u0010Q˗knXZS_\u001d\u0007.x\u0019.yY\u0007`*\u000f`F CAR\b=gf%:\u0013'J\"f\u0002M\u0015(3`\u0010%|sO\u001a\u0015H@\u001f>\u0003\u0011[\n2\u00124Dh\u000b,f\u007fNdS\u0015]h:i\u0003ݬFZ"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wPCBv4+^L`\"\u0011u\n^\u00056QTRAXavG\u001dtZ\u0015Y+\u001aZ", "", "u(E", "/o_9l\tNb(\t\u0004M/|\u0011/", "", ";@RA\\=Bb-", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "7c=<j\u001a=Yv\u000f\tm6\u0005\rDa\u000f,\u0006I", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K-D", "3mP/_,=", "", "/o_9l\u001bAS!~", "Bn3=", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IdNowCustomizationHelper {
    private final int toDp(int i2) {
        Resources system = Resources.getSystem();
        Intrinsics.checkExpressionValueIsNotNull(system, "Resources.getSystem()");
        return (int) (i2 / system.getDisplayMetrics().density);
    }

    public final void applyButtonTheme(Activity mActivity, IdNowSdkCustomization idNowSdkCustomization, boolean z2) {
        int color;
        int color2;
        Intrinsics.checkParameterIsNotNull(mActivity, "mActivity");
        Intrinsics.checkParameterIsNotNull(idNowSdkCustomization, "idNowSdkCustomization");
        try {
            if (z2) {
                View viewFindViewById = mActivity.findViewById(R.id.buttonContinue);
                Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "mActivity.findViewById<B…ton>(R.id.buttonContinue)");
                ((Button) viewFindViewById).setClickable(false);
                color = Color.parseColor(idNowSdkCustomization.getSurface().getButton().getBackgroundColorEnabled());
                color2 = Color.parseColor(idNowSdkCustomization.getSurface().getButton().getTextColorEnabled());
            } else {
                View viewFindViewById2 = mActivity.findViewById(R.id.buttonContinue);
                Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "mActivity.findViewById<B…ton>(R.id.buttonContinue)");
                ((Button) viewFindViewById2).setClickable(false);
                color = Color.parseColor(idNowSdkCustomization.getSurface().getButton().getBackgroundColorDisabled());
                color2 = Color.parseColor(idNowSdkCustomization.getSurface().getButton().getTextColorDisabled());
            }
            Drawable drawable = mActivity.getResources().getDrawable(R.drawable.bg_button_continue);
            drawable.setTint(color);
            ((Button) mActivity.findViewById(R.id.buttonContinue)).setBackgroundDrawable(drawable);
            ((Button) mActivity.findViewById(R.id.buttonContinue)).setTextColor(color2);
        } catch (NullPointerException unused) {
        }
    }

    public final void applyTheme(Activity mActivity, IdNowSdkCustomization idNowSdkCustomization) {
        Intrinsics.checkParameterIsNotNull(mActivity, "mActivity");
        Intrinsics.checkParameterIsNotNull(idNowSdkCustomization, "idNowSdkCustomization");
        mActivity.getResources().getDrawable(R.drawable.ic_null);
        Typeface.create("avenirltstd_book_0", 0);
        try {
            ((ConstraintLayout) mActivity.findViewById(R.id.constraintLayoutBackground)).setBackgroundColor(Color.parseColor(idNowSdkCustomization.getBackgroundColor()));
        } catch (NullPointerException unused) {
        }
        try {
            int color = Color.parseColor(idNowSdkCustomization.getSurface().getBackgroundColor());
            Drawable drawable = mActivity.getResources().getDrawable(R.drawable.bg_surface);
            drawable.setTint(color);
            mActivity.findViewById(R.id.constraintLayoutSurface).setBackgroundDrawable(drawable);
        } catch (NullPointerException unused2) {
        }
        try {
            if (!idNowSdkCustomization.getSurface().getBackButton().getVisible()) {
                View viewFindViewById = mActivity.findViewById(R.id.backButton);
                Intrinsics.checkExpressionValueIsNotNull(viewFindViewById, "mActivity.findViewById<ImageView>(R.id.backButton)");
                ((ImageView) viewFindViewById).setVisibility(8);
            }
            ((ImageView) mActivity.findViewById(R.id.backButton)).setImageDrawable(mActivity.getResources().getDrawable(idNowSdkCustomization.getSurface().getBackButton().getDrawable()));
        } catch (NullPointerException unused3) {
        }
        try {
            if (!idNowSdkCustomization.getSurface().getCloseButton().getVisible()) {
                View viewFindViewById2 = mActivity.findViewById(R.id.imageViewClose);
                Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "mActivity.findViewById<I…iew>(R.id.imageViewClose)");
                ((ImageView) viewFindViewById2).setVisibility(8);
            }
            ((ImageView) mActivity.findViewById(R.id.imageViewClose)).setImageDrawable(mActivity.getResources().getDrawable(idNowSdkCustomization.getSurface().getCloseButton().getDrawable()));
        } catch (NullPointerException unused4) {
        }
        try {
            ((ImageView) mActivity.findViewById(R.id.imageViewEnterpriseLogo)).setImageDrawable(mActivity.getResources().getDrawable(idNowSdkCustomization.getSurface().getEnterpriseLogo()));
        } catch (NullPointerException unused5) {
        }
        try {
            ((TextView) mActivity.findViewById(R.id.textViewTittle)).setTextColor(Color.parseColor(idNowSdkCustomization.getSurface().getTittle().getTextColor()));
            ((TextView) mActivity.findViewById(R.id.textViewTittle)).setTextSize(2, idNowSdkCustomization.getSurface().getTittle().getTextSize());
            Typeface typefaceCreate = Typeface.create(idNowSdkCustomization.getSurface().getTittle().getTextFontFamily(), 1);
            View viewFindViewById3 = mActivity.findViewById(R.id.textViewTittle);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById3, "mActivity.findViewById<T…iew>(R.id.textViewTittle)");
            ((TextView) viewFindViewById3).setTypeface(typefaceCreate);
        } catch (NullPointerException unused6) {
        }
        try {
            ((TextView) mActivity.findViewById(R.id.textViewDescription)).setTextColor(Color.parseColor(idNowSdkCustomization.getSurface().getDescription().getTextColor()));
            float textSize = idNowSdkCustomization.getSurface().getDescription().getTextSize();
            View viewFindViewById4 = mActivity.findViewById(R.id.textViewDescription);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById4, "mActivity.findViewById<T…R.id.textViewDescription)");
            ((TextView) viewFindViewById4).setTextSize(textSize);
            Typeface typefaceCreate2 = Typeface.create(idNowSdkCustomization.getSurface().getDescription().getTextFontFamily(), 0);
            View viewFindViewById5 = mActivity.findViewById(R.id.textViewDescription);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById5, "mActivity.findViewById<T…R.id.textViewDescription)");
            ((TextView) viewFindViewById5).setTypeface(typefaceCreate2);
        } catch (NullPointerException unused7) {
        }
        try {
            int color2 = Color.parseColor(idNowSdkCustomization.getSurface().getButton().getBackgroundColorEnabled());
            Drawable drawable2 = mActivity.getResources().getDrawable(R.drawable.bg_button_continue);
            drawable2.setTint(color2);
            ((Button) mActivity.findViewById(R.id.buttonContinue)).setBackgroundDrawable(drawable2);
            ((Button) mActivity.findViewById(R.id.buttonContinue)).setTextColor(Color.parseColor(idNowSdkCustomization.getSurface().getButton().getTextColorEnabled()));
            Typeface typefaceCreate3 = Typeface.create(idNowSdkCustomization.getSurface().getButton().getTextColorEnabled(), 0);
            View viewFindViewById6 = mActivity.findViewById(R.id.buttonContinue);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById6, "mActivity.findViewById<B…ton>(R.id.buttonContinue)");
            ((Button) viewFindViewById6).setTypeface(typefaceCreate3);
        } catch (NullPointerException unused8) {
        }
    }
}
