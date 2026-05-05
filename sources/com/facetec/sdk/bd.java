package com.facetec.sdk;

import android.content.Context;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
final class bd implements Allocation.OnBufferAvailableListener {
    private static RenderScript F = null;
    private final ScriptIntrinsicYuvToRGB C;
    private final Allocation Code;
    private V I;
    private final Size V;
    private final Allocation Z;
    private byte[] B = null;
    private final Allocation.OnBufferAvailableListener D = this;

    interface V {
        void V(byte[] bArr, Size size);
    }

    bd(Context context, Size size) {
        Code(context);
        RenderScript renderScript = F;
        Type.Builder builder = new Type.Builder(renderScript, Element.YUV(renderScript));
        builder.setX(size.getWidth());
        builder.setY(size.getHeight());
        builder.setYuvFormat(35);
        Allocation allocationCreateTyped = Allocation.createTyped(F, builder.create(), 33);
        this.Z = allocationCreateTyped;
        allocationCreateTyped.setOnBufferAvailableListener(this);
        this.V = size;
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGBCreate = ScriptIntrinsicYuvToRGB.create(F, Element.createPixel(F, Element.DataType.UNSIGNED_8, Element.DataKind.PIXEL_YUV));
        this.C = scriptIntrinsicYuvToRGBCreate;
        scriptIntrinsicYuvToRGBCreate.setInput(allocationCreateTyped);
        RenderScript renderScript2 = F;
        this.Code = Allocation.createTyped(F, new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(size.getWidth()).setY(size.getHeight()).create(), 1);
    }

    static void Code(Context context) {
        if (F == null) {
            F = RenderScript.create(context);
        }
    }

    final Surface I() {
        return this.Z.getSurface();
    }

    final void I(V v2) {
        this.I = v2;
    }

    final void V() {
        this.I = null;
    }

    @Override // android.renderscript.Allocation.OnBufferAvailableListener
    public final synchronized void onBufferAvailable(Allocation allocation) {
        this.Z.ioReceive();
        V v2 = this.I;
        if (v2 != null) {
            this.C.forEach(this.Code);
            int bytesSize = this.Code.getBytesSize();
            if (this.B == null || bytesSize != this.B.length) {
                this.B = new byte[bytesSize];
            }
            this.Code.copyTo(this.B);
            v2.V(this.B, this.V);
        }
    }
}
