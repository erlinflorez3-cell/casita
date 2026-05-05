package com.ticnow.sdk.idnowonboarding;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;

/* JADX INFO: loaded from: classes5.dex */
public class ScriptC_align_mtb extends ScriptC {
    private static final String __rs_resource_name = "align_mtb";
    private static final int mExportForEachIdx_align = 2;
    private static final int mExportForEachIdx_align_mtb = 1;
    private static final int mExportFuncIdx_init_errors = 0;
    private static final int mExportVarIdx_bitmap0 = 0;
    private static final int mExportVarIdx_bitmap1 = 1;
    private static final int mExportVarIdx_errors = 5;
    private static final int mExportVarIdx_off_x = 3;
    private static final int mExportVarIdx_off_y = 4;
    private static final int mExportVarIdx_step_size = 2;
    private Element __ALLOCATION;
    private Element __I32;
    private Element __U8;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private Allocation mExportVar_bitmap0;
    private Allocation mExportVar_bitmap1;
    private Allocation mExportVar_errors;
    private int mExportVar_off_x;
    private int mExportVar_off_y;
    private int mExportVar_step_size;

    public ScriptC_align_mtb(RenderScript renderScript) {
        super(renderScript, __rs_resource_name, align_mtbBitCode.getBitCode32(), align_mtbBitCode.getBitCode64());
        this.__ALLOCATION = Element.ALLOCATION(renderScript);
        this.mExportVar_step_size = 1;
        this.__I32 = Element.I32(renderScript);
        this.mExportVar_off_x = 0;
        this.mExportVar_off_y = 0;
        this.__U8 = Element.U8(renderScript);
    }

    public void bind_errors(Allocation allocation) {
        this.mExportVar_errors = allocation;
        if (allocation == null) {
            bindAllocation(null, 5);
        } else {
            bindAllocation(allocation, 5);
        }
    }

    public void forEach_align(Allocation allocation) {
        forEach_align(allocation, null);
    }

    public void forEach_align(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        forEach(2, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public void forEach_align_mtb(Allocation allocation) {
        forEach_align_mtb(allocation, null);
    }

    public void forEach_align_mtb(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8)) {
            throw new RSRuntimeException("Type mismatch with U8!");
        }
        forEach(1, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID getFieldID_bitmap0() {
        return createFieldID(0, null);
    }

    public Script.FieldID getFieldID_bitmap1() {
        return createFieldID(1, null);
    }

    public Script.FieldID getFieldID_off_x() {
        return createFieldID(3, null);
    }

    public Script.FieldID getFieldID_off_y() {
        return createFieldID(4, null);
    }

    public Script.FieldID getFieldID_step_size() {
        return createFieldID(2, null);
    }

    public Script.InvokeID getInvokeID_init_errors() {
        return createInvokeID(0);
    }

    public Script.KernelID getKernelID_align() {
        return createKernelID(2, 57, null, null);
    }

    public Script.KernelID getKernelID_align_mtb() {
        return createKernelID(1, 57, null, null);
    }

    public Allocation get_bitmap0() {
        return this.mExportVar_bitmap0;
    }

    public Allocation get_bitmap1() {
        return this.mExportVar_bitmap1;
    }

    public Allocation get_errors() {
        return this.mExportVar_errors;
    }

    public int get_off_x() {
        return this.mExportVar_off_x;
    }

    public int get_off_y() {
        return this.mExportVar_off_y;
    }

    public int get_step_size() {
        return this.mExportVar_step_size;
    }

    public void invoke_init_errors() {
        invoke(0);
    }

    public synchronized void set_bitmap0(Allocation allocation) {
        setVar(0, allocation);
        this.mExportVar_bitmap0 = allocation;
    }

    public synchronized void set_bitmap1(Allocation allocation) {
        setVar(1, allocation);
        this.mExportVar_bitmap1 = allocation;
    }

    public synchronized void set_off_x(int i2) {
        setVar(3, i2);
        this.mExportVar_off_x = i2;
    }

    public synchronized void set_off_y(int i2) {
        setVar(4, i2);
        this.mExportVar_off_y = i2;
    }

    public synchronized void set_step_size(int i2) {
        setVar(2, i2);
        this.mExportVar_step_size = i2;
    }
}
