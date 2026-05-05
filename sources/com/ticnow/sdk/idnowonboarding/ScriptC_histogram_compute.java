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
public class ScriptC_histogram_compute extends ScriptC {
    private static final String __rs_resource_name = "histogram_compute";
    private static final int mExportForEachIdx_generate_focus_peaking = 9;
    private static final int mExportForEachIdx_generate_focus_peaking_filtered = 10;
    private static final int mExportForEachIdx_generate_zebra_stripes = 8;
    private static final int mExportForEachIdx_histogram_compute_by_intensity = 4;
    private static final int mExportForEachIdx_histogram_compute_by_intensity_f = 5;
    private static final int mExportForEachIdx_histogram_compute_by_lightness = 6;
    private static final int mExportForEachIdx_histogram_compute_by_luminance = 1;
    private static final int mExportForEachIdx_histogram_compute_by_value = 2;
    private static final int mExportForEachIdx_histogram_compute_by_value_f = 3;
    private static final int mExportForEachIdx_histogram_compute_rgb = 7;
    private static final int mExportFuncIdx_init_histogram = 0;
    private static final int mExportFuncIdx_init_histogram_rgb = 1;
    private static final int mExportVarIdx_bitmap = 14;
    private static final int mExportVarIdx_histogram = 0;
    private static final int mExportVarIdx_histogram_b = 3;
    private static final int mExportVarIdx_histogram_g = 2;
    private static final int mExportVarIdx_histogram_r = 1;
    private static final int mExportVarIdx_zebra_stripes_background_a = 12;
    private static final int mExportVarIdx_zebra_stripes_background_b = 11;
    private static final int mExportVarIdx_zebra_stripes_background_g = 10;
    private static final int mExportVarIdx_zebra_stripes_background_r = 9;
    private static final int mExportVarIdx_zebra_stripes_foreground_a = 8;
    private static final int mExportVarIdx_zebra_stripes_foreground_b = 7;
    private static final int mExportVarIdx_zebra_stripes_foreground_g = 6;
    private static final int mExportVarIdx_zebra_stripes_foreground_r = 5;
    private static final int mExportVarIdx_zebra_stripes_threshold = 4;
    private static final int mExportVarIdx_zebra_stripes_width = 13;
    private Element __ALLOCATION;
    private Element __F32_3;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private Allocation mExportVar_bitmap;
    private Allocation mExportVar_histogram;
    private Allocation mExportVar_histogram_b;
    private Allocation mExportVar_histogram_g;
    private Allocation mExportVar_histogram_r;
    private int mExportVar_zebra_stripes_background_a;
    private int mExportVar_zebra_stripes_background_b;
    private int mExportVar_zebra_stripes_background_g;
    private int mExportVar_zebra_stripes_background_r;
    private int mExportVar_zebra_stripes_foreground_a;
    private int mExportVar_zebra_stripes_foreground_b;
    private int mExportVar_zebra_stripes_foreground_g;
    private int mExportVar_zebra_stripes_foreground_r;
    private int mExportVar_zebra_stripes_threshold;
    private int mExportVar_zebra_stripes_width;

    public ScriptC_histogram_compute(RenderScript renderScript) {
        super(renderScript, __rs_resource_name, histogram_computeBitCode.getBitCode32(), histogram_computeBitCode.getBitCode64());
        this.mExportVar_zebra_stripes_threshold = 255;
        this.__I32 = Element.I32(renderScript);
        this.mExportVar_zebra_stripes_foreground_r = 0;
        this.mExportVar_zebra_stripes_foreground_g = 0;
        this.mExportVar_zebra_stripes_foreground_b = 0;
        this.mExportVar_zebra_stripes_foreground_a = 255;
        this.mExportVar_zebra_stripes_background_r = 255;
        this.mExportVar_zebra_stripes_background_g = 255;
        this.mExportVar_zebra_stripes_background_b = 255;
        this.mExportVar_zebra_stripes_background_a = 255;
        this.mExportVar_zebra_stripes_width = 40;
        this.__ALLOCATION = Element.ALLOCATION(renderScript);
        this.__U8_4 = Element.U8_4(renderScript);
        this.__F32_3 = Element.F32_3(renderScript);
    }

    public void bind_histogram(Allocation allocation) {
        this.mExportVar_histogram = allocation;
        if (allocation == null) {
            bindAllocation(null, 0);
        } else {
            bindAllocation(allocation, 0);
        }
    }

    public void bind_histogram_b(Allocation allocation) {
        this.mExportVar_histogram_b = allocation;
        if (allocation == null) {
            bindAllocation(null, 3);
        } else {
            bindAllocation(allocation, 3);
        }
    }

    public void bind_histogram_g(Allocation allocation) {
        this.mExportVar_histogram_g = allocation;
        if (allocation == null) {
            bindAllocation(null, 2);
        } else {
            bindAllocation(allocation, 2);
        }
    }

    public void bind_histogram_r(Allocation allocation) {
        this.mExportVar_histogram_r = allocation;
        if (allocation == null) {
            bindAllocation(null, 1);
        } else {
            bindAllocation(allocation, 1);
        }
    }

    public void forEach_generate_focus_peaking(Allocation allocation, Allocation allocation2) {
        forEach_generate_focus_peaking(allocation, allocation2, null);
    }

    public void forEach_generate_focus_peaking(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
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
        forEach(9, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void forEach_generate_focus_peaking_filtered(Allocation allocation, Allocation allocation2) {
        forEach_generate_focus_peaking_filtered(allocation, allocation2, null);
    }

    public void forEach_generate_focus_peaking_filtered(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
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
        forEach(10, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void forEach_generate_zebra_stripes(Allocation allocation, Allocation allocation2) {
        forEach_generate_zebra_stripes(allocation, allocation2, null);
    }

    public void forEach_generate_zebra_stripes(Allocation allocation, Allocation allocation2, Script.LaunchOptions launchOptions) {
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
        forEach(8, allocation, allocation2, (FieldPacker) null, launchOptions);
    }

    public void forEach_histogram_compute_by_intensity(Allocation allocation) {
        forEach_histogram_compute_by_intensity(allocation, null);
    }

    public void forEach_histogram_compute_by_intensity(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(4, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public void forEach_histogram_compute_by_intensity_f(Allocation allocation) {
        forEach_histogram_compute_by_intensity_f(allocation, null);
    }

    public void forEach_histogram_compute_by_intensity_f(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        forEach(5, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public void forEach_histogram_compute_by_lightness(Allocation allocation) {
        forEach_histogram_compute_by_lightness(allocation, null);
    }

    public void forEach_histogram_compute_by_lightness(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(6, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public void forEach_histogram_compute_by_luminance(Allocation allocation) {
        forEach_histogram_compute_by_luminance(allocation, null);
    }

    public void forEach_histogram_compute_by_luminance(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(1, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public void forEach_histogram_compute_by_value(Allocation allocation) {
        forEach_histogram_compute_by_value(allocation, null);
    }

    public void forEach_histogram_compute_by_value(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(2, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public void forEach_histogram_compute_by_value_f(Allocation allocation) {
        forEach_histogram_compute_by_value_f(allocation, null);
    }

    public void forEach_histogram_compute_by_value_f(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        forEach(3, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public void forEach_histogram_compute_rgb(Allocation allocation) {
        forEach_histogram_compute_rgb(allocation, null);
    }

    public void forEach_histogram_compute_rgb(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(7, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID getFieldID_bitmap() {
        return createFieldID(14, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_background_a() {
        return createFieldID(12, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_background_b() {
        return createFieldID(11, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_background_g() {
        return createFieldID(10, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_background_r() {
        return createFieldID(9, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_foreground_a() {
        return createFieldID(8, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_foreground_b() {
        return createFieldID(7, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_foreground_g() {
        return createFieldID(6, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_foreground_r() {
        return createFieldID(5, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_threshold() {
        return createFieldID(4, null);
    }

    public Script.FieldID getFieldID_zebra_stripes_width() {
        return createFieldID(13, null);
    }

    public Script.InvokeID getInvokeID_init_histogram() {
        return createInvokeID(0);
    }

    public Script.InvokeID getInvokeID_init_histogram_rgb() {
        return createInvokeID(1);
    }

    public Script.KernelID getKernelID_generate_focus_peaking() {
        return createKernelID(9, 59, null, null);
    }

    public Script.KernelID getKernelID_generate_focus_peaking_filtered() {
        return createKernelID(10, 59, null, null);
    }

    public Script.KernelID getKernelID_generate_zebra_stripes() {
        return createKernelID(8, 59, null, null);
    }

    public Script.KernelID getKernelID_histogram_compute_by_intensity() {
        return createKernelID(4, 57, null, null);
    }

    public Script.KernelID getKernelID_histogram_compute_by_intensity_f() {
        return createKernelID(5, 57, null, null);
    }

    public Script.KernelID getKernelID_histogram_compute_by_lightness() {
        return createKernelID(6, 57, null, null);
    }

    public Script.KernelID getKernelID_histogram_compute_by_luminance() {
        return createKernelID(1, 57, null, null);
    }

    public Script.KernelID getKernelID_histogram_compute_by_value() {
        return createKernelID(2, 57, null, null);
    }

    public Script.KernelID getKernelID_histogram_compute_by_value_f() {
        return createKernelID(3, 57, null, null);
    }

    public Script.KernelID getKernelID_histogram_compute_rgb() {
        return createKernelID(7, 57, null, null);
    }

    public Allocation get_bitmap() {
        return this.mExportVar_bitmap;
    }

    public Allocation get_histogram() {
        return this.mExportVar_histogram;
    }

    public Allocation get_histogram_b() {
        return this.mExportVar_histogram_b;
    }

    public Allocation get_histogram_g() {
        return this.mExportVar_histogram_g;
    }

    public Allocation get_histogram_r() {
        return this.mExportVar_histogram_r;
    }

    public int get_zebra_stripes_background_a() {
        return this.mExportVar_zebra_stripes_background_a;
    }

    public int get_zebra_stripes_background_b() {
        return this.mExportVar_zebra_stripes_background_b;
    }

    public int get_zebra_stripes_background_g() {
        return this.mExportVar_zebra_stripes_background_g;
    }

    public int get_zebra_stripes_background_r() {
        return this.mExportVar_zebra_stripes_background_r;
    }

    public int get_zebra_stripes_foreground_a() {
        return this.mExportVar_zebra_stripes_foreground_a;
    }

    public int get_zebra_stripes_foreground_b() {
        return this.mExportVar_zebra_stripes_foreground_b;
    }

    public int get_zebra_stripes_foreground_g() {
        return this.mExportVar_zebra_stripes_foreground_g;
    }

    public int get_zebra_stripes_foreground_r() {
        return this.mExportVar_zebra_stripes_foreground_r;
    }

    public int get_zebra_stripes_threshold() {
        return this.mExportVar_zebra_stripes_threshold;
    }

    public int get_zebra_stripes_width() {
        return this.mExportVar_zebra_stripes_width;
    }

    public void invoke_init_histogram() {
        invoke(0);
    }

    public void invoke_init_histogram_rgb() {
        invoke(1);
    }

    public synchronized void set_bitmap(Allocation allocation) {
        setVar(14, allocation);
        this.mExportVar_bitmap = allocation;
    }

    public synchronized void set_zebra_stripes_background_a(int i2) {
        setVar(12, i2);
        this.mExportVar_zebra_stripes_background_a = i2;
    }

    public synchronized void set_zebra_stripes_background_b(int i2) {
        setVar(11, i2);
        this.mExportVar_zebra_stripes_background_b = i2;
    }

    public synchronized void set_zebra_stripes_background_g(int i2) {
        setVar(10, i2);
        this.mExportVar_zebra_stripes_background_g = i2;
    }

    public synchronized void set_zebra_stripes_background_r(int i2) {
        setVar(9, i2);
        this.mExportVar_zebra_stripes_background_r = i2;
    }

    public synchronized void set_zebra_stripes_foreground_a(int i2) {
        setVar(8, i2);
        this.mExportVar_zebra_stripes_foreground_a = i2;
    }

    public synchronized void set_zebra_stripes_foreground_b(int i2) {
        setVar(7, i2);
        this.mExportVar_zebra_stripes_foreground_b = i2;
    }

    public synchronized void set_zebra_stripes_foreground_g(int i2) {
        setVar(6, i2);
        this.mExportVar_zebra_stripes_foreground_g = i2;
    }

    public synchronized void set_zebra_stripes_foreground_r(int i2) {
        setVar(5, i2);
        this.mExportVar_zebra_stripes_foreground_r = i2;
    }

    public synchronized void set_zebra_stripes_threshold(int i2) {
        setVar(4, i2);
        this.mExportVar_zebra_stripes_threshold = i2;
    }

    public synchronized void set_zebra_stripes_width(int i2) {
        setVar(13, i2);
        this.mExportVar_zebra_stripes_width = i2;
    }
}
