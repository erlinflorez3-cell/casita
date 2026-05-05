package com.incode.camera;

import androidx.camera.core.CameraSelector;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/incode/camera/IncodeCameraSelector;", "", "facing", "Lcom/incode/camera/IncodeCameraSelector$Facing;", "(Lcom/incode/camera/IncodeCameraSelector$Facing;)V", "getFacing", "()Lcom/incode/camera/IncodeCameraSelector$Facing;", "camXLensFacing", "", "component1", "copy", "equals", "", "other", "hashCode", "toCameraXSelector", "Landroidx/camera/core/CameraSelector;", "toString", "", "Facing", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IncodeCameraSelector {
    private static int CameraConstants = 1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3569e1 = 0;
    private final Facing getAvailableCameraInternals;

    public IncodeCameraSelector(Facing facing) {
        Intrinsics.checkNotNullParameter(facing, "");
        this.getAvailableCameraInternals = facing;
    }

    public final Facing getFacing() {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 71;
        f3569e1 = i3 % 128;
        int i4 = i3 % 2;
        Facing facing = this.getAvailableCameraInternals;
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        return facing;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/incode/camera/IncodeCameraSelector$Facing;", "", "(Ljava/lang/String;I)V", "FRONT", "BACK", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Facing {
        private static final /* synthetic */ Facing[] CameraConstants;
        private static int IncodeCamera = 1;
        private static int ProcessCameraProviderExtensionsKt = 0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private static int f3570e1 = 0;
        private static final /* synthetic */ EnumEntries getAvailableCameraInternals;
        private static int getFrameAnalyzerWrapper = 1;
        public static final Facing FRONT = new Facing("FRONT", 0);
        public static final Facing BACK = new Facing("BACK", 1);

        private Facing(String str, int i2) {
        }

        static {
            Facing[] availableCameraInternals = getAvailableCameraInternals();
            CameraConstants = availableCameraInternals;
            getAvailableCameraInternals = EnumEntriesKt.enumEntries(availableCameraInternals);
            int i2 = f3570e1 + 23;
            getFrameAnalyzerWrapper = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final /* synthetic */ Facing[] getAvailableCameraInternals() {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 3;
            IncodeCamera = i3 % 128;
            Facing[] facingArr = new Facing[2];
            if (i3 % 2 == 0) {
                facingArr[0] = FRONT;
                facingArr[1] = BACK;
            } else {
                facingArr[0] = FRONT;
                facingArr[1] = BACK;
            }
            return facingArr;
        }

        public static EnumEntries<Facing> getEntries() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 19;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<Facing> enumEntries = getAvailableCameraInternals;
            if (i4 != 0) {
                int i5 = 96 / 0;
            }
            return enumEntries;
        }

        public static Facing valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = ProcessCameraProviderExtensionsKt + 109;
            IncodeCamera = i3 % 128;
            int i4 = i3 % 2;
            Facing facing = (Facing) Enum.valueOf(Facing.class, str);
            if (i4 == 0) {
                int i5 = 48 / 0;
            }
            int i6 = IncodeCamera + 1;
            ProcessCameraProviderExtensionsKt = i6 % 128;
            int i7 = i6 % 2;
            return facing;
        }

        public static Facing[] values() {
            int i2 = 2 % 2;
            int i3 = IncodeCamera + 117;
            ProcessCameraProviderExtensionsKt = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            Facing[] facingArr = (Facing[]) CameraConstants.clone();
            int i4 = IncodeCamera + 83;
            ProcessCameraProviderExtensionsKt = i4 % 128;
            if (i4 % 2 == 0) {
                return facingArr;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final CameraSelector toCameraXSelector() {
        int i2 = 2 % 2;
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(camXLensFacing()).build();
        Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "");
        int i3 = CameraConstants + 67;
        f3569e1 = i3 % 128;
        if (i3 % 2 == 0) {
            return cameraSelectorBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int camXLensFacing() {
        int i2 = 2 % 2;
        int i3 = f3569e1 + 65;
        CameraConstants = i3 % 128;
        int i4 = i3 % 2;
        if (this.getAvailableCameraInternals != Facing.FRONT) {
            int i5 = CameraConstants + 125;
            f3569e1 = i5 % 128;
            int i6 = i5 % 2;
            return 1;
        }
        int i7 = f3569e1 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        CameraConstants = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    public final boolean equals(Object other) {
        int i2 = 2 % 2;
        int i3 = f3569e1;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i5 = i4 % 128;
        CameraConstants = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncodeCameraSelector)) {
            int i6 = i3 + 61;
            CameraConstants = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.getAvailableCameraInternals == ((IncodeCameraSelector) other).getAvailableCameraInternals) {
            return true;
        }
        int i7 = i5 + 19;
        int i8 = i7 % 128;
        f3569e1 = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 65;
        CameraConstants = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 69;
        f3569e1 = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.getAvailableCameraInternals.hashCode();
        int i5 = CameraConstants + 123;
        f3569e1 = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f3569e1 + 61;
        CameraConstants = i3 % 128;
        if (i3 % 2 == 0) {
            String str = "IncodeCameraSelector(facing=" + this.getAvailableCameraInternals + ")";
            throw null;
        }
        String str2 = "IncodeCameraSelector(facing=" + this.getAvailableCameraInternals + ")";
        int i4 = f3569e1 + 55;
        CameraConstants = i4 % 128;
        if (i4 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public static /* synthetic */ IncodeCameraSelector copy$default(IncodeCameraSelector incodeCameraSelector, Facing facing, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f3569e1;
            int i5 = i4 + 77;
            CameraConstants = i5 % 128;
            int i6 = i5 % 2;
            facing = incodeCameraSelector.getAvailableCameraInternals;
            int i7 = i4 + 95;
            CameraConstants = i7 % 128;
            int i8 = i7 % 2;
        }
        return incodeCameraSelector.copy(facing);
    }

    public final IncodeCameraSelector copy(Facing facing) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(facing, "");
        IncodeCameraSelector incodeCameraSelector = new IncodeCameraSelector(facing);
        int i3 = f3569e1 + 5;
        CameraConstants = i3 % 128;
        if (i3 % 2 != 0) {
            return incodeCameraSelector;
        }
        throw null;
    }

    public final Facing component1() {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 85;
        f3569e1 = i3 % 128;
        int i4 = i3 % 2;
        Facing facing = this.getAvailableCameraInternals;
        if (i4 != 0) {
            int i5 = 44 / 0;
        }
        return facing;
    }
}
