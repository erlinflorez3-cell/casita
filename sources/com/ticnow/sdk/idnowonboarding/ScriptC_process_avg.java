package com.ticnow.sdk.idnowonboarding;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/* JADX INFO: loaded from: classes5.dex */
public class ScriptC_process_avg extends ScriptC {
    private static final String __rs_resource_name = "process_avg";
    private static final int mExportForEachIdx_avg = 3;
    private static final int mExportForEachIdx_avg_f = 2;
    private static final int mExportForEachIdx_avg_multi = 4;
    private static final int mExportForEachIdx_compute_diff = 1;
    private static final int mExportVarIdx_avg_factor = 5;
    private static final int mExportVarIdx_bitmap1 = 8;
    private static final int mExportVarIdx_bitmap2 = 9;
    private static final int mExportVarIdx_bitmap3 = 10;
    private static final int mExportVarIdx_bitmap4 = 11;
    private static final int mExportVarIdx_bitmap5 = 12;
    private static final int mExportVarIdx_bitmap6 = 13;
    private static final int mExportVarIdx_bitmap7 = 14;
    private static final int mExportVarIdx_bitmap_align_new = 1;
    private static final int mExportVarIdx_bitmap_new = 0;
    private static final int mExportVarIdx_offset_x1 = 15;
    private static final int mExportVarIdx_offset_x2 = 17;
    private static final int mExportVarIdx_offset_x3 = 19;
    private static final int mExportVarIdx_offset_x4 = 21;
    private static final int mExportVarIdx_offset_x5 = 23;
    private static final int mExportVarIdx_offset_x6 = 25;
    private static final int mExportVarIdx_offset_x7 = 27;
    private static final int mExportVarIdx_offset_x_new = 2;
    private static final int mExportVarIdx_offset_y1 = 16;
    private static final int mExportVarIdx_offset_y2 = 18;
    private static final int mExportVarIdx_offset_y3 = 20;
    private static final int mExportVarIdx_offset_y4 = 22;
    private static final int mExportVarIdx_offset_y5 = 24;
    private static final int mExportVarIdx_offset_y6 = 26;
    private static final int mExportVarIdx_offset_y7 = 28;
    private static final int mExportVarIdx_offset_y_new = 3;
    private static final int mExportVarIdx_scale_align_size = 4;
    private static final int mExportVarIdx_wiener_C = 6;
    private static final int mExportVarIdx_wiener_C_cutoff = 7;
    private Element __ALLOCATION;
    private Element __F32;
    private Element __F32_3;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private float mExportVar_avg_factor;
    private Allocation mExportVar_bitmap1;
    private Allocation mExportVar_bitmap2;
    private Allocation mExportVar_bitmap3;
    private Allocation mExportVar_bitmap4;
    private Allocation mExportVar_bitmap5;
    private Allocation mExportVar_bitmap6;
    private Allocation mExportVar_bitmap7;
    private Allocation mExportVar_bitmap_align_new;
    private Allocation mExportVar_bitmap_new;
    private int mExportVar_offset_x1;
    private int mExportVar_offset_x2;
    private int mExportVar_offset_x3;
    private int mExportVar_offset_x4;
    private int mExportVar_offset_x5;
    private int mExportVar_offset_x6;
    private int mExportVar_offset_x7;
    private int mExportVar_offset_x_new;
    private int mExportVar_offset_y1;
    private int mExportVar_offset_y2;
    private int mExportVar_offset_y3;
    private int mExportVar_offset_y4;
    private int mExportVar_offset_y5;
    private int mExportVar_offset_y6;
    private int mExportVar_offset_y7;
    private int mExportVar_offset_y_new;
    private int mExportVar_scale_align_size;
    private float mExportVar_wiener_C;
    private float mExportVar_wiener_C_cutoff;

    public ScriptC_process_avg(RenderScript renderScript) {
        super(renderScript, __rs_resource_name, process_avgBitCode.getBitCode32(), process_avgBitCode.getBitCode64());
        this.__ALLOCATION = Element.ALLOCATION(renderScript);
        this.mExportVar_offset_x_new = 0;
        this.__I32 = Element.I32(renderScript);
        this.mExportVar_offset_y_new = 0;
        this.mExportVar_scale_align_size = 1;
        this.mExportVar_avg_factor = 1.0f;
        this.__F32 = Element.F32(renderScript);
        this.mExportVar_wiener_C = 1024.0f;
        this.mExportVar_wiener_C_cutoff = 1024.0f;
        this.mExportVar_offset_x1 = 0;
        this.mExportVar_offset_y1 = 0;
        this.mExportVar_offset_x2 = 0;
        this.mExportVar_offset_y2 = 0;
        this.mExportVar_offset_x3 = 0;
        this.mExportVar_offset_y3 = 0;
        this.mExportVar_offset_x4 = 0;
        this.mExportVar_offset_y4 = 0;
        this.mExportVar_offset_x5 = 0;
        this.mExportVar_offset_y5 = 0;
        this.mExportVar_offset_x6 = 0;
        this.mExportVar_offset_y6 = 0;
        this.mExportVar_offset_x7 = 0;
        this.mExportVar_offset_y7 = 0;
        this.__U8_4 = Element.U8_4(renderScript);
        this.__F32_3 = Element.F32_3(renderScript);
    }

    public void forEach_avg(Allocation allocation, Allocation allocation2) {
        forEach_avg(allocation, allocation2, null);
    }

    public void forEach_avg(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(3, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void forEach_avg_f(Allocation allocation, Allocation allocation2) {
        forEach_avg_f(allocation, allocation2, null);
    }

    public void forEach_avg_f(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(2, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void forEach_avg_multi(Allocation allocation, Allocation allocation2) {
        forEach_avg_multi(allocation, allocation2, null);
    }

    public void forEach_avg_multi(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(4, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void forEach_compute_diff(Allocation allocation, Allocation allocation2) {
        forEach_compute_diff(allocation, allocation2, null);
    }

    public void forEach_compute_diff(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        if (!allocation2.getType().getElement().isCompatible(this.__F32)) {
            throw new RSRuntimeException("Type mismatch with F32!");
        }
        Type type = allocation.getType();
        Type type2 = allocation2.getType();
        if (type.getCount() != type2.getCount() || type.getX() != type2.getX() || type.getY() != type2.getY() || type.getZ() != type2.getZ() || type.hasFaces() != type2.hasFaces() || type.hasMipmaps() != type2.hasMipmaps()) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }
        forEach(1, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID getFieldID_avg_factor() {
        return createFieldID(5, null);
    }

    public Script.FieldID getFieldID_bitmap1() {
        return createFieldID(8, null);
    }

    public Script.FieldID getFieldID_bitmap2() {
        return createFieldID(9, null);
    }

    public Script.FieldID getFieldID_bitmap3() {
        return createFieldID(10, null);
    }

    public Script.FieldID getFieldID_bitmap4() {
        return createFieldID(11, null);
    }

    public Script.FieldID getFieldID_bitmap5() {
        return createFieldID(12, null);
    }

    public Script.FieldID getFieldID_bitmap6() {
        return createFieldID(13, null);
    }

    public Script.FieldID getFieldID_bitmap7() {
        return createFieldID(14, null);
    }

    public Script.FieldID getFieldID_bitmap_align_new() {
        return createFieldID(1, null);
    }

    public Script.FieldID getFieldID_bitmap_new() {
        return createFieldID(0, null);
    }

    public Script.FieldID getFieldID_offset_x1() {
        return createFieldID(15, null);
    }

    public Script.FieldID getFieldID_offset_x2() {
        return createFieldID(17, null);
    }

    public Script.FieldID getFieldID_offset_x3() {
        return createFieldID(19, null);
    }

    public Script.FieldID getFieldID_offset_x4() {
        return createFieldID(21, null);
    }

    public Script.FieldID getFieldID_offset_x5() {
        return createFieldID(23, null);
    }

    public Script.FieldID getFieldID_offset_x6() {
        return createFieldID(25, null);
    }

    public Script.FieldID getFieldID_offset_x7() {
        return createFieldID(27, null);
    }

    public Script.FieldID getFieldID_offset_x_new() {
        return createFieldID(2, null);
    }

    public Script.FieldID getFieldID_offset_y1() {
        return createFieldID(16, null);
    }

    public Script.FieldID getFieldID_offset_y2() {
        return createFieldID(18, null);
    }

    public Script.FieldID getFieldID_offset_y3() {
        return createFieldID(20, null);
    }

    public Script.FieldID getFieldID_offset_y4() {
        return createFieldID(22, null);
    }

    public Script.FieldID getFieldID_offset_y5() {
        return createFieldID(24, null);
    }

    public Script.FieldID getFieldID_offset_y6() {
        return createFieldID(26, null);
    }

    public Script.FieldID getFieldID_offset_y7() {
        return createFieldID(28, null);
    }

    public Script.FieldID getFieldID_offset_y_new() {
        return createFieldID(3, null);
    }

    public Script.FieldID getFieldID_scale_align_size() {
        return createFieldID(4, null);
    }

    public Script.FieldID getFieldID_wiener_C() {
        return createFieldID(6, null);
    }

    public Script.FieldID getFieldID_wiener_C_cutoff() {
        return createFieldID(7, null);
    }

    public Script.KernelID getKernelID_avg() {
        return createKernelID(3, 59, null, null);
    }

    public Script.KernelID getKernelID_avg_f() {
        return createKernelID(2, 59, null, null);
    }

    public Script.KernelID getKernelID_avg_multi() {
        return createKernelID(4, 59, null, null);
    }

    public Script.KernelID getKernelID_compute_diff() {
        return createKernelID(1, 59, null, null);
    }

    public float get_avg_factor() {
        return this.mExportVar_avg_factor;
    }

    public Allocation get_bitmap1() {
        return this.mExportVar_bitmap1;
    }

    public Allocation get_bitmap2() {
        return this.mExportVar_bitmap2;
    }

    public Allocation get_bitmap3() {
        return this.mExportVar_bitmap3;
    }

    public Allocation get_bitmap4() {
        return this.mExportVar_bitmap4;
    }

    public Allocation get_bitmap5() {
        return this.mExportVar_bitmap5;
    }

    public Allocation get_bitmap6() {
        return this.mExportVar_bitmap6;
    }

    public Allocation get_bitmap7() {
        return this.mExportVar_bitmap7;
    }

    public Allocation get_bitmap_align_new() {
        return this.mExportVar_bitmap_align_new;
    }

    public Allocation get_bitmap_new() {
        return this.mExportVar_bitmap_new;
    }

    public int get_offset_x1() {
        return this.mExportVar_offset_x1;
    }

    public int get_offset_x2() {
        return this.mExportVar_offset_x2;
    }

    public int get_offset_x3() {
        return this.mExportVar_offset_x3;
    }

    public int get_offset_x4() {
        return this.mExportVar_offset_x4;
    }

    public int get_offset_x5() {
        return this.mExportVar_offset_x5;
    }

    public int get_offset_x6() {
        return this.mExportVar_offset_x6;
    }

    public int get_offset_x7() {
        return this.mExportVar_offset_x7;
    }

    public int get_offset_x_new() {
        return this.mExportVar_offset_x_new;
    }

    public int get_offset_y1() {
        return this.mExportVar_offset_y1;
    }

    public int get_offset_y2() {
        return this.mExportVar_offset_y2;
    }

    public int get_offset_y3() {
        return this.mExportVar_offset_y3;
    }

    public int get_offset_y4() {
        return this.mExportVar_offset_y4;
    }

    public int get_offset_y5() {
        return this.mExportVar_offset_y5;
    }

    public int get_offset_y6() {
        return this.mExportVar_offset_y6;
    }

    public int get_offset_y7() {
        return this.mExportVar_offset_y7;
    }

    public int get_offset_y_new() {
        return this.mExportVar_offset_y_new;
    }

    public int get_scale_align_size() {
        return this.mExportVar_scale_align_size;
    }

    public float get_wiener_C() {
        return this.mExportVar_wiener_C;
    }

    public float get_wiener_C_cutoff() {
        return this.mExportVar_wiener_C_cutoff;
    }

    public synchronized void set_avg_factor(float f2) {
        setVar(5, f2);
        this.mExportVar_avg_factor = f2;
    }

    public synchronized void set_bitmap1(Allocation allocation) {
        setVar(8, allocation);
        this.mExportVar_bitmap1 = allocation;
    }

    public synchronized void set_bitmap2(Allocation allocation) {
        setVar(9, allocation);
        this.mExportVar_bitmap2 = allocation;
    }

    public synchronized void set_bitmap3(Allocation allocation) {
        setVar(10, allocation);
        this.mExportVar_bitmap3 = allocation;
    }

    public synchronized void set_bitmap4(Allocation allocation) {
        setVar(11, allocation);
        this.mExportVar_bitmap4 = allocation;
    }

    public synchronized void set_bitmap5(Allocation allocation) {
        setVar(12, allocation);
        this.mExportVar_bitmap5 = allocation;
    }

    public synchronized void set_bitmap6(Allocation allocation) {
        setVar(13, allocation);
        this.mExportVar_bitmap6 = allocation;
    }

    public synchronized void set_bitmap7(Allocation allocation) {
        setVar(14, allocation);
        this.mExportVar_bitmap7 = allocation;
    }

    public synchronized void set_bitmap_align_new(Allocation allocation) {
        setVar(1, allocation);
        this.mExportVar_bitmap_align_new = allocation;
    }

    public synchronized void set_bitmap_new(Allocation allocation) {
        setVar(0, allocation);
        this.mExportVar_bitmap_new = allocation;
    }

    public synchronized void set_offset_x1(int i2) {
        setVar(15, i2);
        this.mExportVar_offset_x1 = i2;
    }

    public synchronized void set_offset_x2(int i2) {
        setVar(17, i2);
        this.mExportVar_offset_x2 = i2;
    }

    public synchronized void set_offset_x3(int i2) {
        setVar(19, i2);
        this.mExportVar_offset_x3 = i2;
    }

    public synchronized void set_offset_x4(int i2) {
        setVar(21, i2);
        this.mExportVar_offset_x4 = i2;
    }

    public synchronized void set_offset_x5(int i2) {
        setVar(23, i2);
        this.mExportVar_offset_x5 = i2;
    }

    public synchronized void set_offset_x6(int i2) {
        setVar(25, i2);
        this.mExportVar_offset_x6 = i2;
    }

    public synchronized void set_offset_x7(int i2) {
        setVar(27, i2);
        this.mExportVar_offset_x7 = i2;
    }

    public synchronized void set_offset_x_new(int i2) {
        setVar(2, i2);
        this.mExportVar_offset_x_new = i2;
    }

    public synchronized void set_offset_y1(int i2) {
        setVar(16, i2);
        this.mExportVar_offset_y1 = i2;
    }

    public synchronized void set_offset_y2(int i2) {
        setVar(18, i2);
        this.mExportVar_offset_y2 = i2;
    }

    public synchronized void set_offset_y3(int i2) {
        setVar(20, i2);
        this.mExportVar_offset_y3 = i2;
    }

    public synchronized void set_offset_y4(int i2) {
        setVar(22, i2);
        this.mExportVar_offset_y4 = i2;
    }

    public synchronized void set_offset_y5(int i2) {
        setVar(24, i2);
        this.mExportVar_offset_y5 = i2;
    }

    public synchronized void set_offset_y6(int i2) {
        setVar(26, i2);
        this.mExportVar_offset_y6 = i2;
    }

    public synchronized void set_offset_y7(int i2) {
        setVar(28, i2);
        this.mExportVar_offset_y7 = i2;
    }

    public synchronized void set_offset_y_new(int i2) {
        setVar(3, i2);
        this.mExportVar_offset_y_new = i2;
    }

    public synchronized void set_scale_align_size(int i2) {
        setVar(4, i2);
        this.mExportVar_scale_align_size = i2;
    }

    public synchronized void set_wiener_C(float f2) {
        setVar(6, f2);
        this.mExportVar_wiener_C = f2;
    }

    public synchronized void set_wiener_C_cutoff(float f2) {
        setVar(7, f2);
        this.mExportVar_wiener_C_cutoff = f2;
    }
}
