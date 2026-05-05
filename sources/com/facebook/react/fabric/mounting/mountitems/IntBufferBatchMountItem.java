package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.systrace.Systrace;

/* JADX INFO: loaded from: classes3.dex */
final class IntBufferBatchMountItem implements BatchMountItem {
    static final int INSTRUCTION_CREATE = 2;
    static final int INSTRUCTION_DELETE = 4;
    static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    static final int INSTRUCTION_INSERT = 8;
    static final int INSTRUCTION_REMOVE = 16;
    static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    static final int INSTRUCTION_UPDATE_PADDING = 512;
    static final int INSTRUCTION_UPDATE_PROPS = 32;
    static final int INSTRUCTION_UPDATE_STATE = 64;
    static final String TAG = "IntBufferBatchMountItem";
    private final int mCommitNumber;
    private final int[] mIntBuffer;
    private final int mIntBufferLen;
    private final Object[] mObjBuffer;
    private final int mObjBufferLen;
    private final int mSurfaceId;

    IntBufferBatchMountItem(int i2, int[] iArr, Object[] objArr, int i3) {
        this.mSurfaceId = i2;
        this.mCommitNumber = i3;
        this.mIntBuffer = iArr;
        this.mObjBuffer = objArr;
        this.mIntBufferLen = iArr.length;
        this.mObjBufferLen = objArr.length;
    }

    private static String nameForInstructionString(int i2) {
        return i2 == 2 ? "CREATE" : i2 == 4 ? "DELETE" : i2 == 8 ? "INSERT" : i2 == 16 ? "REMOVE" : i2 == 32 ? "UPDATE_PROPS" : i2 == 64 ? "UPDATE_STATE" : i2 == 128 ? "UPDATE_LAYOUT" : i2 == 512 ? "UPDATE_PADDING" : i2 == 1024 ? "UPDATE_OVERFLOW_INSET" : i2 == 256 ? "UPDATE_EVENT_EMITTER" : "UNKNOWN";
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        int i2;
        int i3;
        int i4;
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            FLog.e(TAG, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.mSurfaceId));
            return;
        }
        if (surfaceManager.isStopped()) {
            FLog.e(TAG, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.mSurfaceId));
            return;
        }
        if (ReactNativeFeatureFlags.enableFabricLogs()) {
            FLog.d(TAG, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.mSurfaceId));
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.mIntBufferLen) {
            int[] iArr = this.mIntBuffer;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            int i9 = (-2) & i8;
            if ((-1) - (((-1) - i8) | ((-1) - 1)) != 0) {
                i2 = iArr[i7];
                i7 = i5 + 2;
            } else {
                i2 = 1;
            }
            long j2 = 0;
            Systrace.beginSection(0L, "IntBufferBatchMountItem::mountInstructions::" + nameForInstructionString(i9), new String[]{"numInstructions", String.valueOf(i2)}, 2);
            i5 = i7;
            for (int i10 = 0; i10 < i2; i10++) {
                if (i9 == 2) {
                    String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i6]);
                    int[] iArr2 = this.mIntBuffer;
                    int i11 = i5 + 1;
                    int i12 = iArr2[i5];
                    Object[] objArr = this.mObjBuffer;
                    ReadableMap readableMap = (ReadableMap) objArr[i6 + 1];
                    int i13 = i6 + 3;
                    StateWrapper stateWrapper = (StateWrapper) objArr[i6 + 2];
                    i6 += 4;
                    i5 += 2;
                    surfaceManager.createView(fabricComponentName, i12, readableMap, stateWrapper, (EventEmitterWrapper) objArr[i13], iArr2[i11] == 1);
                } else if (i9 == 4) {
                    surfaceManager.deleteView(this.mIntBuffer[i5]);
                    i5++;
                } else if (i9 == 8) {
                    int[] iArr3 = this.mIntBuffer;
                    int i14 = iArr3[i5];
                    int i15 = i5 + 2;
                    int i16 = iArr3[i5 + 1];
                    i5 += 3;
                    surfaceManager.addViewAt(i16, i14, iArr3[i15]);
                } else if (i9 == 16) {
                    int[] iArr4 = this.mIntBuffer;
                    int i17 = iArr4[i5];
                    int i18 = i5 + 2;
                    int i19 = iArr4[i5 + 1];
                    i5 += 3;
                    surfaceManager.removeViewAt(i17, i19, iArr4[i18]);
                } else {
                    if (i9 == 32) {
                        i3 = i5 + 1;
                        i4 = i6 + 1;
                        surfaceManager.updateProps(this.mIntBuffer[i5], (ReadableMap) this.mObjBuffer[i6]);
                    } else if (i9 == 64) {
                        i3 = i5 + 1;
                        i4 = i6 + 1;
                        surfaceManager.updateState(this.mIntBuffer[i5], (StateWrapper) this.mObjBuffer[i6]);
                    } else {
                        if (i9 == 128) {
                            int[] iArr5 = this.mIntBuffer;
                            int i20 = iArr5[i5];
                            int i21 = iArr5[i5 + 1];
                            int i22 = iArr5[i5 + 2];
                            int i23 = iArr5[i5 + 3];
                            int i24 = iArr5[i5 + 4];
                            int i25 = iArr5[i5 + 5];
                            int i26 = i5 + 7;
                            int i27 = iArr5[i5 + 6];
                            if (ReactNativeFeatureFlags.setAndroidLayoutDirection()) {
                                j2 = 0;
                                surfaceManager.updateLayout(i20, i21, i22, i23, i24, i25, i27, this.mIntBuffer[i26]);
                                i26 = i5 + 8;
                            } else {
                                j2 = 0;
                                surfaceManager.updateLayout(i20, i21, i22, i23, i24, i25, i27, 0);
                            }
                            i5 = i26;
                        } else {
                            j2 = 0;
                            if (i9 == 512) {
                                int[] iArr6 = this.mIntBuffer;
                                int i28 = iArr6[i5];
                                int i29 = iArr6[i5 + 1];
                                int i30 = iArr6[i5 + 2];
                                int i31 = i5 + 4;
                                int i32 = iArr6[i5 + 3];
                                i5 += 5;
                                surfaceManager.updatePadding(i28, i29, i30, i32, iArr6[i31]);
                            } else if (i9 == 1024) {
                                int[] iArr7 = this.mIntBuffer;
                                int i33 = iArr7[i5];
                                int i34 = iArr7[i5 + 1];
                                int i35 = iArr7[i5 + 2];
                                int i36 = i5 + 4;
                                int i37 = iArr7[i5 + 3];
                                i5 += 5;
                                surfaceManager.updateOverflowInset(i33, i34, i35, i37, iArr7[i36]);
                            } else {
                                if (i9 != 256) {
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i9 + " at index: " + i5);
                                }
                                surfaceManager.updateEventEmitter(this.mIntBuffer[i5], (EventEmitterWrapper) this.mObjBuffer[i6]);
                                i5++;
                                i6++;
                            }
                        }
                    }
                    i5 = i3;
                    i6 = i4;
                }
                j2 = 0;
            }
            Systrace.endSection(j2);
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.BatchMountItem
    public boolean isBatchEmpty() {
        return this.mIntBufferLen == 0;
    }

    public String toString() {
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", Integer.valueOf(this.mSurfaceId)));
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.mIntBufferLen) {
                int[] iArr = this.mIntBuffer;
                int i8 = i6 + 1;
                int i9 = iArr[i6];
                int i10 = (-1) - (((-1) - i9) | ((-1) - (-2)));
                int i11 = 1;
                if ((i9 & 1) != 0) {
                    i11 = iArr[i8];
                    i8 = i6 + 2;
                }
                i6 = i8;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (i10 == 2) {
                        String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i7]);
                        i7 += 4;
                        int i13 = i6 + 1;
                        Integer numValueOf = Integer.valueOf(this.mIntBuffer[i6]);
                        i6 += 2;
                        sb.append(String.format("CREATE [%d] - layoutable:%d - %s\n", numValueOf, Integer.valueOf(this.mIntBuffer[i13]), fabricComponentName));
                    } else {
                        if (i10 == 4) {
                            i2 = i6 + 1;
                            sb.append(String.format("DELETE [%d]\n", Integer.valueOf(this.mIntBuffer[i6])));
                        } else if (i10 == 8) {
                            Integer numValueOf2 = Integer.valueOf(this.mIntBuffer[i6]);
                            int i14 = i6 + 2;
                            Integer numValueOf3 = Integer.valueOf(this.mIntBuffer[i6 + 1]);
                            i6 += 3;
                            sb.append(String.format("INSERT [%d]->[%d] @%d\n", numValueOf2, numValueOf3, Integer.valueOf(this.mIntBuffer[i14])));
                        } else if (i10 == 16) {
                            Integer numValueOf4 = Integer.valueOf(this.mIntBuffer[i6]);
                            int i15 = i6 + 2;
                            Integer numValueOf5 = Integer.valueOf(this.mIntBuffer[i6 + 1]);
                            i6 += 3;
                            sb.append(String.format("REMOVE [%d]->[%d] @%d\n", numValueOf4, numValueOf5, Integer.valueOf(this.mIntBuffer[i15])));
                        } else {
                            String string = "<null>";
                            if (i10 == 32) {
                                i4 = i7 + 1;
                                Object obj = this.mObjBuffer[i7];
                                if (!FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
                                    string = "<hidden>";
                                } else if (obj != null) {
                                    string = obj.toString();
                                }
                                i5 = i6 + 1;
                                sb.append(String.format("UPDATE PROPS [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i6]), string));
                            } else if (i10 == 64) {
                                i4 = i7 + 1;
                                StateWrapper stateWrapper = (StateWrapper) this.mObjBuffer[i7];
                                if (!FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
                                    string = "<hidden>";
                                } else if (stateWrapper != null) {
                                    string = stateWrapper.toString();
                                }
                                i5 = i6 + 1;
                                sb.append(String.format("UPDATE STATE [%d]: %s\n", Integer.valueOf(this.mIntBuffer[i6]), string));
                            } else if (i10 == 128) {
                                int[] iArr2 = this.mIntBuffer;
                                int i16 = iArr2[i6];
                                int i17 = iArr2[i6 + 1];
                                int i18 = iArr2[i6 + 2];
                                int i19 = iArr2[i6 + 3];
                                int i20 = iArr2[i6 + 4];
                                int i21 = iArr2[i6 + 5];
                                int i22 = i6 + 7;
                                int i23 = iArr2[i6 + 6];
                                if (ReactNativeFeatureFlags.setAndroidLayoutDirection()) {
                                    i3 = this.mIntBuffer[i22];
                                    i22 = i6 + 8;
                                } else {
                                    i3 = 0;
                                }
                                sb.append(String.format("UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d layoutDirection: %d\n", Integer.valueOf(i17), Integer.valueOf(i16), Integer.valueOf(i18), Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf(i21), Integer.valueOf(i23), Integer.valueOf(i3)));
                                i6 = i22;
                            } else if (i10 == 512) {
                                Integer numValueOf6 = Integer.valueOf(this.mIntBuffer[i6]);
                                Integer numValueOf7 = Integer.valueOf(this.mIntBuffer[i6 + 1]);
                                Integer numValueOf8 = Integer.valueOf(this.mIntBuffer[i6 + 2]);
                                int i24 = i6 + 4;
                                Integer numValueOf9 = Integer.valueOf(this.mIntBuffer[i6 + 3]);
                                i6 += 5;
                                sb.append(String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", numValueOf6, numValueOf7, numValueOf8, numValueOf9, Integer.valueOf(this.mIntBuffer[i24])));
                            } else if (i10 == 1024) {
                                Integer numValueOf10 = Integer.valueOf(this.mIntBuffer[i6]);
                                Integer numValueOf11 = Integer.valueOf(this.mIntBuffer[i6 + 1]);
                                Integer numValueOf12 = Integer.valueOf(this.mIntBuffer[i6 + 2]);
                                int i25 = i6 + 4;
                                Integer numValueOf13 = Integer.valueOf(this.mIntBuffer[i6 + 3]);
                                i6 += 5;
                                sb.append(String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", numValueOf10, numValueOf11, numValueOf12, numValueOf13, Integer.valueOf(this.mIntBuffer[i25])));
                            } else {
                                if (i10 != 256) {
                                    FLog.e(TAG, "String so far: " + sb.toString());
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i10 + " at index: " + i6);
                                }
                                i7++;
                                i2 = i6 + 1;
                                sb.append(String.format("UPDATE EVENTEMITTER [%d]\n", Integer.valueOf(this.mIntBuffer[i6])));
                            }
                            i6 = i5;
                            i7 = i4;
                        }
                        i6 = i2;
                    }
                }
            }
            return sb.toString();
        } catch (Exception e2) {
            FLog.e(TAG, "Caught exception trying to print", e2);
            StringBuilder sb2 = new StringBuilder();
            for (int i26 = 0; i26 < this.mIntBufferLen; i26++) {
                sb2.append(this.mIntBuffer[i26]);
                sb2.append(", ");
            }
            FLog.e(TAG, sb2.toString());
            for (int i27 = 0; i27 < this.mObjBufferLen; i27++) {
                String str = TAG;
                Object obj2 = this.mObjBuffer[i27];
                FLog.e(str, obj2 != null ? obj2.toString() : "null");
            }
            return "";
        }
    }
}
