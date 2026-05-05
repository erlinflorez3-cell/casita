package com.ticnow.sdk.idnowonboarding;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.ScriptC;

/* JADX INFO: loaded from: classes5.dex */
public class ScriptC_calculate_sharpness extends ScriptC {
    private static final String __rs_resource_name = "calculate_sharpness";
    private static final int mExportForEachIdx_calculate_sharpness = 1;
    private static final int mExportFuncIdx_init_sums = 0;
    private static final int mExportVarIdx_bitmap = 0;
    private static final int mExportVarIdx_sums = 1;
    private static final int mExportVarIdx_width = 2;
    private Element __ALLOCATION;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_I32;
    private Allocation mExportVar_bitmap;
    private Allocation mExportVar_sums;
    private int mExportVar_width;

    public ScriptC_calculate_sharpness(RenderScript renderScript) {
        super(renderScript, __rs_resource_name, calculate_sharpnessBitCode.getBitCode32(), calculate_sharpnessBitCode.getBitCode64());
        this.__ALLOCATION = Element.ALLOCATION(renderScript);
        this.__I32 = Element.I32(renderScript);
        this.__U8_4 = Element.U8_4(renderScript);
    }

    public void bind_sums(Allocation allocation) {
        this.mExportVar_sums = allocation;
        if (allocation == null) {
            bindAllocation(null, 1);
        } else {
            bindAllocation(allocation, 1);
        }
    }

    public void forEach_calculate_sharpness(Allocation allocation) {
        forEach_calculate_sharpness(allocation, null);
    }

    public void forEach_calculate_sharpness(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (!allocation.getType().getElement().isCompatible(this.__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        forEach(1, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID getFieldID_bitmap() {
        return createFieldID(0, null);
    }

    public Script.FieldID getFieldID_width() {
        return createFieldID(2, null);
    }

    public Script.InvokeID getInvokeID_init_sums() {
        return createInvokeID(0);
    }

    public Script.KernelID getKernelID_calculate_sharpness() {
        return createKernelID(1, 57, null, null);
    }

    public Allocation get_bitmap() {
        return this.mExportVar_bitmap;
    }

    public Allocation get_sums() {
        return this.mExportVar_sums;
    }

    public int get_width() {
        return this.mExportVar_width;
    }

    public void invoke_init_sums() {
        invoke(0);
    }

    public synchronized void set_bitmap(Allocation allocation) {
        setVar(0, allocation);
        this.mExportVar_bitmap = allocation;
    }

    public synchronized void set_width(int i2) {
        setVar(2, i2);
        this.mExportVar_width = i2;
    }
}
