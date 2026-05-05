package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class TextBlock implements Text {
    private zzah[] zza;
    private Point[] zzb;
    private List<Line> zzc;
    private String zzd;
    private Rect zze;

    TextBlock(SparseArray<zzah> sparseArray) {
        this.zza = new zzah[sparseArray.size()];
        int i2 = 0;
        while (true) {
            zzah[] zzahVarArr = this.zza;
            if (i2 >= zzahVarArr.length) {
                return;
            }
            zzahVarArr[i2] = sparseArray.valueAt(i2);
            i2++;
        }
    }

    @Override // com.google.android.gms.vision.text.Text
    public Rect getBoundingBox() {
        if (this.zze == null) {
            this.zze = zzc.zza(this);
        }
        return this.zze;
    }

    @Override // com.google.android.gms.vision.text.Text
    public List<? extends Text> getComponents() {
        if (this.zza.length == 0) {
            return new ArrayList(0);
        }
        if (this.zzc == null) {
            this.zzc = new ArrayList(this.zza.length);
            for (zzah zzahVar : this.zza) {
                this.zzc.add(new Line(zzahVar));
            }
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.vision.text.Text
    public Point[] getCornerPoints() {
        zzah[] zzahVarArr;
        TextBlock textBlock = this;
        if (textBlock.zzb == null) {
            char c2 = 0;
            if (textBlock.zza.length == 0) {
                textBlock.zzb = new Point[0];
            } else {
                int iMax = Integer.MIN_VALUE;
                int iMin = Integer.MAX_VALUE;
                int i2 = 0;
                int iMin2 = Integer.MAX_VALUE;
                int iMax2 = Integer.MIN_VALUE;
                while (true) {
                    zzahVarArr = textBlock.zza;
                    if (i2 >= zzahVarArr.length) {
                        break;
                    }
                    zzab zzabVar = zzahVarArr[i2].zzb;
                    zzab zzabVar2 = textBlock.zza[c2].zzb;
                    int i3 = -zzabVar2.zza;
                    int i4 = -zzabVar2.zzb;
                    double dSin = Math.sin(Math.toRadians(zzabVar2.zze));
                    double dCos = Math.cos(Math.toRadians(zzabVar2.zze));
                    Point[] pointArr = new Point[4];
                    Point point = new Point(zzabVar.zza, zzabVar.zzb);
                    pointArr[c2] = point;
                    point.offset(i3, i4);
                    int i5 = (int) ((((double) pointArr[c2].x) * dCos) + (((double) pointArr[c2].y) * dSin));
                    int i6 = (int) ((((double) (-pointArr[0].x)) * dSin) + (((double) pointArr[0].y) * dCos));
                    pointArr[0].x = i5;
                    pointArr[0].y = i6;
                    pointArr[1] = new Point(zzabVar.zzc + i5, i6);
                    pointArr[2] = new Point(zzabVar.zzc + i5, zzabVar.zzd + i6);
                    pointArr[3] = new Point(i5, i6 + zzabVar.zzd);
                    for (int i7 = 0; i7 < 4; i7++) {
                        Point point2 = pointArr[i7];
                        iMin = Math.min(iMin, point2.x);
                        iMax = Math.max(iMax, point2.x);
                        iMin2 = Math.min(iMin2, point2.y);
                        iMax2 = Math.max(iMax2, point2.y);
                    }
                    i2++;
                    c2 = 0;
                    textBlock = this;
                }
                zzab zzabVar3 = zzahVarArr[c2].zzb;
                int i8 = zzabVar3.zza;
                int i9 = zzabVar3.zzb;
                double dSin2 = Math.sin(Math.toRadians(zzabVar3.zze));
                double dCos2 = Math.cos(Math.toRadians(zzabVar3.zze));
                Point[] pointArr2 = {new Point(iMin, iMin2), new Point(iMax, iMin2), new Point(iMax, iMax2), new Point(iMin, iMax2)};
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = (int) ((((double) pointArr2[i10].x) * dCos2) - (((double) pointArr2[i10].y) * dSin2));
                    int i12 = (int) ((((double) pointArr2[i10].x) * dSin2) + (((double) pointArr2[i10].y) * dCos2));
                    pointArr2[i10].x = i11;
                    pointArr2[i10].y = i12;
                    pointArr2[i10].offset(i8, i9);
                }
                textBlock = this;
                textBlock.zzb = pointArr2;
            }
        }
        return textBlock.zzb;
    }

    @Override // com.google.android.gms.vision.text.Text
    public String getLanguage() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        HashMap map = new HashMap();
        for (zzah zzahVar : this.zza) {
            map.put(zzahVar.zzd, Integer.valueOf((map.containsKey(zzahVar.zzd) ? ((Integer) map.get(zzahVar.zzd)).intValue() : 0) + 1));
        }
        String str2 = (String) ((Map.Entry) Collections.max(map.entrySet(), new zza(this))).getKey();
        this.zzd = str2;
        if (str2 == null || str2.isEmpty()) {
            this.zzd = "und";
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.vision.text.Text
    public String getValue() {
        if (this.zza.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(this.zza[0].zzc);
        for (int i2 = 1; i2 < this.zza.length; i2++) {
            sb.append("\n");
            sb.append(this.zza[i2].zzc);
        }
        return sb.toString();
    }
}
