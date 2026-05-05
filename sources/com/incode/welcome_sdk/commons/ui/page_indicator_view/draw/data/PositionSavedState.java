package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new Parcelable.Creator<PositionSavedState>() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.PositionSavedState.2

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f6201b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f6202e = 1;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PositionSavedState createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f6201b + 51;
            f6202e = i3 % 128;
            int i4 = i3 % 2;
            PositionSavedState positionSavedStateC = c(parcel);
            if (i4 == 0) {
                int i5 = 1 / 0;
            }
            return positionSavedStateC;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PositionSavedState[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f6202e + 113;
            f6201b = i4 % 128;
            int i5 = i4 % 2;
            PositionSavedState[] positionSavedStateArrE = e(i2);
            int i6 = f6201b + 89;
            f6202e = i6 % 128;
            if (i6 % 2 != 0) {
                return positionSavedStateArrE;
            }
            throw null;
        }

        private static PositionSavedState c(Parcel parcel) {
            int i2 = 2 % 2;
            PositionSavedState positionSavedState = new PositionSavedState(parcel);
            int i3 = f6202e + 41;
            f6201b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 47 / 0;
            }
            return positionSavedState;
        }

        private static PositionSavedState[] e(int i2) {
            int i3 = 2 % 2;
            int i4 = f6201b + 71;
            f6202e = i4 % 128;
            PositionSavedState[] positionSavedStateArr = new PositionSavedState[i2];
            if (i4 % 2 != 0) {
                return positionSavedStateArr;
            }
            throw null;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f6194b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6195e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f6196f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f6197i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6198a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6200d;

    public PositionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    PositionSavedState(Parcel parcel) {
        super(parcel);
        this.f6199c = parcel.readInt();
        this.f6200d = parcel.readInt();
        this.f6198a = parcel.readInt();
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f6194b + 19;
        int i4 = i3 % 128;
        f6195e = i4;
        int i5 = i3 % 2;
        int i6 = this.f6199c;
        int i7 = i4 + 7;
        f6194b = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 4 / 0;
        }
        return i6;
    }

    public void setSelectedPosition(int i2) {
        int i3 = 2 % 2;
        int i4 = f6195e + 105;
        int i5 = i4 % 128;
        f6194b = i5;
        int i6 = i4 % 2;
        this.f6199c = i2;
        int i7 = i5 + 103;
        f6195e = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final int e() {
        int i2 = 2 % 2;
        int i3 = f6195e + 87;
        int i4 = i3 % 128;
        f6194b = i4;
        int i5 = i3 % 2;
        int i6 = this.f6200d;
        int i7 = i4 + 91;
        f6195e = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public void setSelectingPosition(int i2) {
        int i3 = 2 % 2;
        int i4 = f6195e + 55;
        f6194b = i4 % 128;
        if (i4 % 2 == 0) {
            this.f6200d = i2;
            return;
        }
        this.f6200d = i2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f6195e + 125;
        f6194b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f6198a;
        if (i4 != 0) {
            int i6 = 36 / 0;
        }
        return i5;
    }

    public void setLastSelectedPosition(int i2) {
        int i3 = 2 % 2;
        int i4 = f6195e;
        int i5 = i4 + 95;
        f6194b = i5 % 128;
        int i6 = i5 % 2;
        this.f6198a = i2;
        int i7 = i4 + 33;
        f6194b = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = f6195e + 65;
        f6194b = i4 % 128;
        if (i4 % 2 == 0) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f6199c);
            parcel.writeInt(this.f6200d);
            parcel.writeInt(this.f6198a);
            int i5 = f6195e + 109;
            f6194b = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f6199c);
        parcel.writeInt(this.f6200d);
        parcel.writeInt(this.f6198a);
        throw null;
    }

    static {
        int i2 = f6197i + 21;
        f6196f = i2 % 128;
        int i3 = i2 % 2;
    }
}
