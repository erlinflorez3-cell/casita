package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecCustomization;
import com.facetec.sdk.FaceTecGuidanceCustomization;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.model.customization.IdNowZoomCustomization;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS8\u000fsڔ:Ơ[:ڎs;\u0004\u0019>'\u000fOɁkg|J#\u0019Q\u0012\u001e\u0016'n\\Mc}u\u0012=8\to\bA[vU9\u000fxf\t.7:8(\u000bG\u001arT\u001e~\u0013Cy\u0015B4NuRR;SU& \u0007V / 3ɤ!ɇLleŽǫ'\r"}, d2 = {"\u001aSW2`,!S \nzk:R", "", "u(E", "Bh\\2B<M", "", "5dc\u0010h:M]!\u0003\u0010Z;\u0001\u00138F\n5jC\u0001\u001f\u0017", "\u001ab^:\"-:Q\u0019\u000ez\\u\u000b\b5/`$y@o\u0017\u0015%\u007f\u001cK\u0001-9ny/;w\u001f\u0004", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0019b>%W\u001b\u0002\n<<\u000b\u00189m\u0004=wO\u0005! (y\u001b+y%=Y", "Adc\u000ec7-V\u0019\u0007z", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ThemeHelpers {
    public static final ThemeHelpers INSTANCE = new ThemeHelpers();
    private static final int timeOut = 45;

    private ThemeHelpers() {
    }

    private final FaceTecCustomization getCustomizationForTheme(Context context) {
        FaceTecCustomization faceTecCustomization = new FaceTecCustomization();
        IdNowZoomCustomization idNowZoomCustomization = new IdNowZoomCustomization();
        faceTecCustomization.getSessionTimerCustomization().livenessCheckNoInteractionTimeout = 45;
        faceTecCustomization.vocalGuidanceCustomization.mode = FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE;
        faceTecCustomization.getCancelButtonCustomization().customImage = idNowZoomCustomization.getCancelButtonCustomization().getCustomImage();
        FaceTecCancelButtonCustomization cancelButtonCustomization = faceTecCustomization.getCancelButtonCustomization();
        Intrinsics.checkExpressionValueIsNotNull(cancelButtonCustomization, "zoomCustomization.cancelButtonCustomization");
        cancelButtonCustomization.setLocation(idNowZoomCustomization.getCancelButtonCustomization().getLocation());
        faceTecCustomization.getFrameCustomization().backgroundColor = Color.parseColor(idNowZoomCustomization.getFrameCustomization().getBackgroundColor());
        faceTecCustomization.getFrameCustomization().borderColor = Color.parseColor(idNowZoomCustomization.getFrameCustomization().getBorderColor());
        faceTecCustomization.getFrameCustomization().borderWidth = idNowZoomCustomization.getFrameCustomization().getBorderWidth();
        faceTecCustomization.getFrameCustomization().cornerRadius = idNowZoomCustomization.getFrameCustomization().getCornerRadius();
        faceTecCustomization.getFrameCustomization().elevation = idNowZoomCustomization.getFrameCustomization().getElevation();
        faceTecCustomization.getOverlayCustomization().backgroundColor = Color.parseColor(idNowZoomCustomization.getOverlayCustomization().getBackgroundColor());
        faceTecCustomization.getOverlayCustomization().brandingImage = idNowZoomCustomization.getOverlayCustomization().getBrandingImage();
        faceTecCustomization.getOverlayCustomization().showBrandingImage = idNowZoomCustomization.getOverlayCustomization().getShowBrandingImage();
        faceTecCustomization.getFeedbackCustomization().backgroundColors = Color.parseColor(idNowZoomCustomization.getFeedbackCustomization().getBackgroundColors());
        faceTecCustomization.getFeedbackCustomization().cornerRadius = idNowZoomCustomization.getFeedbackCustomization().getCornerRadius();
        faceTecCustomization.getFeedbackCustomization().textColor = Color.parseColor(idNowZoomCustomization.getFeedbackCustomization().getTextColor());
        faceTecCustomization.getFeedbackCustomization().textFont = Typeface.create(idNowZoomCustomization.getFeedbackCustomization().getTextFont(), 0);
        faceTecCustomization.getFeedbackCustomization().elevation = idNowZoomCustomization.getFeedbackCustomization().getElevation();
        faceTecCustomization.getOvalCustomization().strokeColor = Color.parseColor(idNowZoomCustomization.getOvalCustomization().getStrokeColor());
        faceTecCustomization.getOvalCustomization().progressColor1 = Color.parseColor(idNowZoomCustomization.getOvalCustomization().getProgressColor1());
        faceTecCustomization.getOvalCustomization().progressColor2 = Color.parseColor(idNowZoomCustomization.getOvalCustomization().getProgressColor2());
        faceTecCustomization.getOvalCustomization().strokeWidth = idNowZoomCustomization.getOvalCustomization().getStrokeWidth();
        faceTecCustomization.getGuidanceCustomization().headerFont = Typeface.create(idNowZoomCustomization.getGuidanceCustomization().getHeaderFont(), 1);
        faceTecCustomization.getGuidanceCustomization().subtextFont = Typeface.create(idNowZoomCustomization.getGuidanceCustomization().getSubtextFont(), 0);
        faceTecCustomization.getGuidanceCustomization().buttonFont = Typeface.create(idNowZoomCustomization.getGuidanceCustomization().getButtonFont(), 0);
        faceTecCustomization.getGuidanceCustomization().buttonBorderColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonBorderColor());
        faceTecCustomization.getGuidanceCustomization().buttonBorderWidth = idNowZoomCustomization.getGuidanceCustomization().getButtonBorderWidth();
        faceTecCustomization.getGuidanceCustomization().buttonCornerRadius = idNowZoomCustomization.getGuidanceCustomization().getButtonCornerRadius();
        faceTecCustomization.getGuidanceCustomization().buttonTextNormalColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonTextNormalColor());
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundNormalColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonBackgroundNormalColor());
        faceTecCustomization.getGuidanceCustomization().buttonTextDisabledColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonTextDisabledColor());
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundDisabledColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonBackgroundDisabledColor());
        faceTecCustomization.getGuidanceCustomization().buttonTextHighlightColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonTextHighlightColor());
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundHighlightColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonBackgroundHighlightColor());
        faceTecCustomization.getGuidanceCustomization().backgroundColors = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getBackgroundColors());
        faceTecCustomization.getGuidanceCustomization().foregroundColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getForegroundColor());
        faceTecCustomization.getGuidanceCustomization().readyScreenHeaderTextColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getReadyScreenHeaderTextColor());
        faceTecCustomization.getGuidanceCustomization().readyScreenOvalFillColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getReadyScreenOvalFillColor());
        faceTecCustomization.getGuidanceCustomization().readyScreenSubtextTextColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getReadyScreenSubtextTextColor());
        faceTecCustomization.getGuidanceCustomization().readyScreenTextBackgroundColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getReadyScreenTextBackgroundColor());
        faceTecCustomization.getGuidanceCustomization().readyScreenTextBackgroundCornerRadius = idNowZoomCustomization.getGuidanceCustomization().getReadyScreenTextBackgroundCornerRadius();
        faceTecCustomization.getGuidanceCustomization().enableRetryScreenSlideshowShuffle = idNowZoomCustomization.getGuidanceCustomization().getEnableRetryScreenSlideshowShuffle();
        faceTecCustomization.getGuidanceCustomization().retryScreenHeaderTextColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getRetryScreenHeaderTextColor());
        faceTecCustomization.getGuidanceCustomization().retryScreenImageBorderColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getRetryScreenImageBorderColor());
        faceTecCustomization.getGuidanceCustomization().retryScreenImageBorderWidth = idNowZoomCustomization.getGuidanceCustomization().getRetryScreenImageBorderWidth();
        faceTecCustomization.getGuidanceCustomization().retryScreenImageCornerRadius = idNowZoomCustomization.getGuidanceCustomization().getRetryScreenImageCornerRadius();
        faceTecCustomization.getGuidanceCustomization().retryScreenOvalStrokeColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getRetryScreenOvalStrokeColor());
        faceTecCustomization.getGuidanceCustomization().retryScreenSlideshowImages = idNowZoomCustomization.getGuidanceCustomization().getRetryScreenSlideshowImages();
        faceTecCustomization.getGuidanceCustomization().retryScreenSlideshowInterval = idNowZoomCustomization.getGuidanceCustomization().getRetryScreenSlideshowInterval();
        faceTecCustomization.getGuidanceCustomization().retryScreenSubtextTextColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getRetryScreenSubtextTextColor());
        faceTecCustomization.getGuidanceCustomization().cameraPermissionsScreenImage = idNowZoomCustomization.getGuidanceCustomization().getCameraPermissionsScreenImage();
        faceTecCustomization.getResultScreenCustomization().activityIndicatorColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getActivityIndicatorColor());
        faceTecCustomization.getResultScreenCustomization().animationRelativeScale = idNowZoomCustomization.getResultScreenCustomization().getAnimationRelativeScale();
        faceTecCustomization.getResultScreenCustomization().backgroundColors = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getBackgroundColors());
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorAnimation = idNowZoomCustomization.getResultScreenCustomization().getCustomActivityIndicatorAnimation();
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorImage = idNowZoomCustomization.getResultScreenCustomization().getCustomActivityIndicatorImage();
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorRotationInterval = idNowZoomCustomization.getResultScreenCustomization().getCustomActivityIndicatorRotationInterval();
        faceTecCustomization.getResultScreenCustomization().customResultAnimationSuccess = idNowZoomCustomization.getResultScreenCustomization().getCustomResultAnimationSuccess();
        faceTecCustomization.getResultScreenCustomization().customResultAnimationUnsuccess = idNowZoomCustomization.getResultScreenCustomization().getCustomResultAnimationUnsuccess();
        faceTecCustomization.getResultScreenCustomization().customStaticResultAnimationSuccess = idNowZoomCustomization.getResultScreenCustomization().getCustomStaticResultAnimationSuccess();
        faceTecCustomization.getResultScreenCustomization().customStaticResultAnimationUnsuccess = idNowZoomCustomization.getResultScreenCustomization().getCustomStaticResultAnimationUnsuccess();
        faceTecCustomization.getResultScreenCustomization().foregroundColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getForegroundColor());
        faceTecCustomization.getResultScreenCustomization().messageFont = Typeface.create(idNowZoomCustomization.getResultScreenCustomization().getMessageFont(), 1);
        faceTecCustomization.getResultScreenCustomization().resultAnimationBackgroundColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getResultAnimationBackgroundColor());
        faceTecCustomization.getResultScreenCustomization().resultAnimationForegroundColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getResultAnimationForegroundColor());
        faceTecCustomization.getResultScreenCustomization().resultAnimationSuccessBackgroundImage = idNowZoomCustomization.getResultScreenCustomization().getResultAnimationSuccessBackgroundImage();
        faceTecCustomization.getResultScreenCustomization().resultAnimationUnsuccessBackgroundImage = idNowZoomCustomization.getResultScreenCustomization().getResultAnimationUnsuccessBackgroundImage();
        faceTecCustomization.getResultScreenCustomization().showUploadProgressBar = idNowZoomCustomization.getResultScreenCustomization().getShowUploadProgressBar();
        faceTecCustomization.getResultScreenCustomization().uploadProgressFillColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getUploadProgressFillColor());
        faceTecCustomization.getResultScreenCustomization().uploadProgressTrackColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getUploadProgressTrackColor());
        FaceTecGuidanceCustomization guidanceCustomization = faceTecCustomization.getGuidanceCustomization();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        guidanceCustomization.headerFont = ResourcesCompat.getFont(context, R.font.roboto_condensed_bold);
        faceTecCustomization.getGuidanceCustomization().subtextFont = ResourcesCompat.getFont(context, R.font.roboto_regular);
        faceTecCustomization.getGuidanceCustomization().buttonFont = ResourcesCompat.getFont(context, R.font.roboto_condensed_regular);
        faceTecCustomization.getResultScreenCustomization().messageFont = ResourcesCompat.getFont(context, R.font.roboto_condensed_bold);
        faceTecCustomization.getFeedbackCustomization().textFont = ResourcesCompat.getFont(context, R.font.roboto_condensed_bold);
        return faceTecCustomization;
    }

    private final FaceTecCustomization getLowLightCustomizationForTheme(Context context) {
        FaceTecCustomization faceTecCustomization = new FaceTecCustomization();
        IdNowZoomCustomization idNowZoomCustomization = new IdNowZoomCustomization();
        faceTecCustomization.getSessionTimerCustomization().livenessCheckNoInteractionTimeout = 45;
        faceTecCustomization.vocalGuidanceCustomization.mode = FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE;
        faceTecCustomization.getCancelButtonCustomization().customImage = R.drawable.ic_back_dav_black;
        FaceTecCancelButtonCustomization cancelButtonCustomization = faceTecCustomization.getCancelButtonCustomization();
        Intrinsics.checkExpressionValueIsNotNull(cancelButtonCustomization, "zoomCustomization.cancelButtonCustomization");
        cancelButtonCustomization.setLocation(idNowZoomCustomization.getCancelButtonCustomization().getLocation());
        faceTecCustomization.getFrameCustomization().backgroundColor = Color.parseColor("#FFFFFF");
        faceTecCustomization.getFrameCustomization().borderColor = Color.parseColor("#FFFFFF");
        faceTecCustomization.getFrameCustomization().borderWidth = idNowZoomCustomization.getFrameCustomization().getBorderWidth();
        faceTecCustomization.getFrameCustomization().cornerRadius = idNowZoomCustomization.getFrameCustomization().getCornerRadius();
        faceTecCustomization.getFrameCustomization().elevation = idNowZoomCustomization.getFrameCustomization().getElevation();
        faceTecCustomization.getOverlayCustomization().backgroundColor = Color.parseColor("#FFFFFF");
        faceTecCustomization.getOverlayCustomization().brandingImage = idNowZoomCustomization.getOverlayCustomization().getBrandingImage();
        faceTecCustomization.getOverlayCustomization().showBrandingImage = idNowZoomCustomization.getOverlayCustomization().getShowBrandingImage();
        faceTecCustomization.getFeedbackCustomization().backgroundColors = Color.parseColor("#FFFFFF");
        faceTecCustomization.getFeedbackCustomization().cornerRadius = idNowZoomCustomization.getFeedbackCustomization().getCornerRadius();
        faceTecCustomization.getFeedbackCustomization().textColor = Color.parseColor("#000000");
        faceTecCustomization.getFeedbackCustomization().textFont = Typeface.create(idNowZoomCustomization.getFeedbackCustomization().getTextFont(), 1);
        faceTecCustomization.getFeedbackCustomization().elevation = idNowZoomCustomization.getFeedbackCustomization().getElevation();
        faceTecCustomization.getOvalCustomization().strokeColor = Color.parseColor("#000000");
        faceTecCustomization.getOvalCustomization().progressColor1 = Color.parseColor(idNowZoomCustomization.getOvalCustomization().getProgressColor1());
        faceTecCustomization.getOvalCustomization().progressColor2 = Color.parseColor(idNowZoomCustomization.getOvalCustomization().getProgressColor2());
        faceTecCustomization.getOvalCustomization().strokeWidth = idNowZoomCustomization.getOvalCustomization().getStrokeWidth();
        faceTecCustomization.getGuidanceCustomization().headerFont = Typeface.create(idNowZoomCustomization.getGuidanceCustomization().getHeaderFont(), 1);
        faceTecCustomization.getGuidanceCustomization().subtextFont = Typeface.create(idNowZoomCustomization.getGuidanceCustomization().getSubtextFont(), 0);
        faceTecCustomization.getGuidanceCustomization().buttonFont = Typeface.create(idNowZoomCustomization.getGuidanceCustomization().getButtonFont(), 0);
        faceTecCustomization.getGuidanceCustomization().buttonBorderColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonBorderColor());
        faceTecCustomization.getGuidanceCustomization().buttonBorderWidth = idNowZoomCustomization.getGuidanceCustomization().getButtonBorderWidth();
        faceTecCustomization.getGuidanceCustomization().buttonCornerRadius = idNowZoomCustomization.getGuidanceCustomization().getButtonCornerRadius();
        faceTecCustomization.getGuidanceCustomization().buttonTextNormalColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonTextNormalColor());
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundNormalColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getButtonBackgroundNormalColor());
        faceTecCustomization.getGuidanceCustomization().buttonTextDisabledColor = Color.parseColor("#FFFFFF");
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundDisabledColor = Color.parseColor("#FFFFFF");
        faceTecCustomization.getGuidanceCustomization().buttonTextHighlightColor = Color.parseColor("#FFFFFF");
        faceTecCustomization.getGuidanceCustomization().buttonBackgroundHighlightColor = Color.parseColor("#FFFFFF");
        faceTecCustomization.getGuidanceCustomization().backgroundColors = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getBackgroundColors());
        faceTecCustomization.getGuidanceCustomization().foregroundColor = Color.parseColor("#000000");
        faceTecCustomization.getGuidanceCustomization().readyScreenHeaderTextColor = Color.parseColor("#000000");
        faceTecCustomization.getGuidanceCustomization().readyScreenOvalFillColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getReadyScreenOvalFillColor());
        faceTecCustomization.getGuidanceCustomization().readyScreenSubtextTextColor = Color.parseColor("#000000");
        faceTecCustomization.getGuidanceCustomization().readyScreenTextBackgroundColor = Color.parseColor(idNowZoomCustomization.getGuidanceCustomization().getReadyScreenTextBackgroundColor());
        faceTecCustomization.getGuidanceCustomization().readyScreenTextBackgroundCornerRadius = idNowZoomCustomization.getGuidanceCustomization().getReadyScreenTextBackgroundCornerRadius();
        faceTecCustomization.getGuidanceCustomization().enableRetryScreenSlideshowShuffle = idNowZoomCustomization.getGuidanceCustomization().getEnableRetryScreenSlideshowShuffle();
        faceTecCustomization.getGuidanceCustomization().retryScreenHeaderTextColor = Color.parseColor("#000000");
        faceTecCustomization.getGuidanceCustomization().retryScreenImageBorderColor = Color.parseColor("#000000");
        faceTecCustomization.getGuidanceCustomization().retryScreenImageBorderWidth = idNowZoomCustomization.getGuidanceCustomization().getRetryScreenImageBorderWidth();
        faceTecCustomization.getGuidanceCustomization().retryScreenImageCornerRadius = idNowZoomCustomization.getGuidanceCustomization().getRetryScreenImageCornerRadius();
        faceTecCustomization.getGuidanceCustomization().retryScreenOvalStrokeColor = Color.parseColor("#000000");
        faceTecCustomization.getGuidanceCustomization().retryScreenSlideshowImages = idNowZoomCustomization.getGuidanceCustomization().getRetryScreenSlideshowImages();
        faceTecCustomization.getGuidanceCustomization().retryScreenSlideshowInterval = idNowZoomCustomization.getGuidanceCustomization().getRetryScreenSlideshowInterval();
        faceTecCustomization.getGuidanceCustomization().retryScreenSubtextTextColor = Color.parseColor("#000000");
        faceTecCustomization.getGuidanceCustomization().cameraPermissionsScreenImage = idNowZoomCustomization.getGuidanceCustomization().getCameraPermissionsScreenImage();
        faceTecCustomization.getResultScreenCustomization().activityIndicatorColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getActivityIndicatorColor());
        faceTecCustomization.getResultScreenCustomization().animationRelativeScale = idNowZoomCustomization.getResultScreenCustomization().getAnimationRelativeScale();
        faceTecCustomization.getResultScreenCustomization().backgroundColors = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getBackgroundColors());
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorAnimation = idNowZoomCustomization.getResultScreenCustomization().getCustomActivityIndicatorAnimation();
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorImage = idNowZoomCustomization.getResultScreenCustomization().getCustomActivityIndicatorImage();
        faceTecCustomization.getResultScreenCustomization().customActivityIndicatorRotationInterval = idNowZoomCustomization.getResultScreenCustomization().getCustomActivityIndicatorRotationInterval();
        faceTecCustomization.getResultScreenCustomization().customResultAnimationSuccess = idNowZoomCustomization.getResultScreenCustomization().getCustomResultAnimationSuccess();
        faceTecCustomization.getResultScreenCustomization().customResultAnimationUnsuccess = idNowZoomCustomization.getResultScreenCustomization().getCustomResultAnimationUnsuccess();
        faceTecCustomization.getResultScreenCustomization().customStaticResultAnimationSuccess = idNowZoomCustomization.getResultScreenCustomization().getCustomStaticResultAnimationSuccess();
        faceTecCustomization.getResultScreenCustomization().customStaticResultAnimationUnsuccess = idNowZoomCustomization.getResultScreenCustomization().getCustomStaticResultAnimationUnsuccess();
        faceTecCustomization.getResultScreenCustomization().foregroundColor = Color.parseColor("#000000");
        faceTecCustomization.getResultScreenCustomization().messageFont = Typeface.create(idNowZoomCustomization.getResultScreenCustomization().getMessageFont(), 1);
        faceTecCustomization.getResultScreenCustomization().resultAnimationBackgroundColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getResultAnimationBackgroundColor());
        faceTecCustomization.getResultScreenCustomization().resultAnimationForegroundColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getResultAnimationForegroundColor());
        faceTecCustomization.getResultScreenCustomization().resultAnimationSuccessBackgroundImage = idNowZoomCustomization.getResultScreenCustomization().getResultAnimationSuccessBackgroundImage();
        faceTecCustomization.getResultScreenCustomization().resultAnimationUnsuccessBackgroundImage = idNowZoomCustomization.getResultScreenCustomization().getResultAnimationUnsuccessBackgroundImage();
        faceTecCustomization.getResultScreenCustomization().showUploadProgressBar = idNowZoomCustomization.getResultScreenCustomization().getShowUploadProgressBar();
        faceTecCustomization.getResultScreenCustomization().uploadProgressFillColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getUploadProgressFillColor());
        faceTecCustomization.getResultScreenCustomization().uploadProgressTrackColor = Color.parseColor(idNowZoomCustomization.getResultScreenCustomization().getUploadProgressTrackColor());
        return faceTecCustomization;
    }

    public final void setAppTheme(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        FaceTecCustomization customizationForTheme = getCustomizationForTheme(context);
        FaceTecCustomization lowLightCustomizationForTheme = getLowLightCustomizationForTheme(context);
        FaceTecSDK.setCustomization(customizationForTheme);
        FaceTecSDK.setLowLightCustomization(lowLightCustomizationForTheme);
    }
}
