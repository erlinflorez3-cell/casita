package com.incode.welcome_sdk.ui.id_capture;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.CloseButtonPosition;
import com.incode.welcome_sdk.commons.HelpButtonPosition;
import com.incode.welcome_sdk.data.local.a;
import com.incode.welcome_sdk.data.remote.beans.c;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.id_capture.IdCaptureUploadError;
import com.incode.welcome_sdk.ui.id_capture.InfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureUiStateKt {

    /* JADX INFO: renamed from: a */
    private static int f14630a = 1;

    /* JADX INFO: renamed from: c */
    private static int f14631c = 0;

    public static final /* synthetic */ AcceptedDocumentsUiState access$generateAcceptedDocumentsUiState(IdCaptureUploadError.UnacceptableId unacceptableId, a aVar) {
        int i2 = 2 % 2;
        int i3 = f14631c + 57;
        f14630a = i3 % 128;
        int i4 = i3 % 2;
        AcceptedDocumentsUiState acceptedDocumentsUiStateA = a(unacceptableId, aVar);
        if (i4 == 0) {
            int i5 = 42 / 0;
        }
        int i6 = f14631c + 69;
        f14630a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 21 / 0;
        }
        return acceptedDocumentsUiStateA;
    }

    public static final /* synthetic */ InfoModel access$generateInfoModel(DocumentType documentType, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f14631c + 53;
        f14630a = i3 % 128;
        if (i3 % 2 == 0) {
            d(documentType, z2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        InfoModel infoModelD = d(documentType, z2);
        int i4 = f14631c + 77;
        f14630a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return infoModelD;
    }

    private static final InfoModel d(DocumentType documentType, boolean z2) {
        int i2;
        InfoModel.InfoModelType infoModelType = InfoModel.InfoModelType.f14893b;
        int i3 = WhenMappings.f14633b[documentType.ordinal()];
        if (i3 == 1) {
            i2 = R.string.onboard_sdk_id_capture_fill_the_frame_id;
        } else if (i3 == 2) {
            i2 = R.string.onboard_sdk_id_capture_fill_the_frame_back_id;
        } else {
            i2 = R.string.onboard_sdk_id_capture_fill_the_frame_passport;
        }
        return new InfoModel(infoModelType, i2, z2 ? null : Integer.valueOf(R.string.onboard_sdk_id_capture_hint_photo_will_be_taken), null, null, false, 56, null);
    }

    static /* synthetic */ InfoModel e(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f14631c + 17;
        f14630a = i3 % 128;
        int i4 = i3 % 2;
        return d(documentType, false);
    }

    private static final AcceptedDocumentsUiState a(IdCaptureUploadError.UnacceptableId unacceptableId, a aVar) {
        String strB;
        ArrayList arrayListEmptyList;
        int i2 = 2 % 2;
        String strE = null;
        if (aVar != null) {
            strB = aVar.b();
        } else {
            int i3 = f14631c + 93;
            f14630a = i3 % 128;
            int i4 = i3 % 2;
            strB = null;
        }
        if (aVar != null) {
            strE = aVar.e();
        } else {
            int i5 = f14631c + 115;
            f14630a = i5 % 128;
            int i6 = i5 % 2;
        }
        List<c> acceptedDocuments = unacceptableId.getAcceptedDocuments();
        if (acceptedDocuments != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : acceptedDocuments) {
                c cVar = (c) obj;
                if (cVar != c.f9614e && cVar != c.f9613d) {
                    int i7 = f14631c + 113;
                    f14630a = i7 % 128;
                    if (i7 % 2 == 0) {
                        arrayList.add(obj);
                        int i8 = 45 / 0;
                    } else {
                        arrayList.add(obj);
                    }
                }
            }
            arrayListEmptyList = arrayList;
        } else {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        return new AcceptedDocumentsUiState(strB, strE, arrayListEmptyList);
    }

    public static final Alignment toAlignment(HelpButtonPosition helpButtonPosition, Composer composer, int i2) {
        Alignment topLeft;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(helpButtonPosition, "");
        composer.startReplaceableGroup(42903984);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(42903984, i2, -1, "com.incode.welcome_sdk.ui.id_capture.toAlignment (CaptureUiState.kt:527)");
        }
        int i4 = WhenMappings.f14634c[helpButtonPosition.ordinal()];
        if (i4 == 1) {
            topLeft = AbsoluteAlignment.INSTANCE.getTopLeft();
        } else if (i4 == 2) {
            topLeft = AbsoluteAlignment.INSTANCE.getTopRight();
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            topLeft = AbsoluteAlignment.INSTANCE.getBottomRight();
        }
        Object obj = null;
        if (ComposerKt.isTraceInProgress()) {
            int i5 = f14630a + 41;
            f14631c = i5 % 128;
            int i6 = i5 % 2;
            ComposerKt.traceEventEnd();
            if (i6 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        composer.endReplaceableGroup();
        int i7 = f14630a + 13;
        f14631c = i7 % 128;
        if (i7 % 2 == 0) {
            return topLeft;
        }
        obj.hashCode();
        throw null;
    }

    public static final boolean isTop(HelpButtonPosition helpButtonPosition) {
        List listListOf;
        int i2 = 2 % 2;
        int i3 = f14631c + 109;
        f14630a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(helpButtonPosition, "");
            listListOf = CollectionsKt.listOf((Object[]) new HelpButtonPosition[]{HelpButtonPosition.TOP_LEFT, HelpButtonPosition.TOP_RIGHT});
        } else {
            Intrinsics.checkNotNullParameter(helpButtonPosition, "");
            listListOf = CollectionsKt.listOf((Object[]) new HelpButtonPosition[]{HelpButtonPosition.TOP_LEFT, HelpButtonPosition.TOP_RIGHT});
        }
        boolean zContains = listListOf.contains(helpButtonPosition);
        int i4 = f14630a + 67;
        f14631c = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    public static final Alignment toAlignment(CloseButtonPosition closeButtonPosition, Composer composer, int i2) {
        Alignment topLeft;
        int i3;
        int i4 = 2 % 2;
        int i5 = f14631c + 57;
        f14630a = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(closeButtonPosition, "");
            composer.startReplaceableGroup(-196746891);
            ComposerKt.isTraceInProgress();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(closeButtonPosition, "");
        composer.startReplaceableGroup(-196746891);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-196746891, i2, -1, "com.incode.welcome_sdk.ui.id_capture.toAlignment (CaptureUiState.kt:538)");
        }
        int i6 = WhenMappings.f14636e[closeButtonPosition.ordinal()];
        if (i6 == 1) {
            topLeft = AbsoluteAlignment.INSTANCE.getTopLeft();
            i3 = f14631c + 125;
            f14630a = i3 % 128;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            topLeft = AbsoluteAlignment.INSTANCE.getTopRight();
            i3 = f14630a + 117;
            f14631c = i3 % 128;
        }
        int i7 = i3 % 2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topLeft;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        private static int f14632a = 0;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f14633b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f14634c;

        /* JADX INFO: renamed from: d */
        private static int f14635d = 1;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f14636e;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.FRONT_ID.ordinal()] = 1;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.BACK_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14633b = iArr;
            int[] iArr2 = new int[HelpButtonPosition.values().length];
            try {
                iArr2[HelpButtonPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HelpButtonPosition.TOP_RIGHT.ordinal()] = 2;
                int i3 = f14635d + 29;
                f14632a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HelpButtonPosition.BOTTOM_RIGHT.ordinal()] = 3;
                int i6 = f14635d + 65;
                f14632a = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 5;
                } else {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            f14634c = iArr2;
            int[] iArr3 = new int[CloseButtonPosition.values().length];
            try {
                iArr3[CloseButtonPosition.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CloseButtonPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f14636e = iArr3;
        }
    }
}
