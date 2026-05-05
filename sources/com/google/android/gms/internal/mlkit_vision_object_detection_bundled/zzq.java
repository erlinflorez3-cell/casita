package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
class zzq extends zzo implements List {
    final /* synthetic */ zzr zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzq(zzr zzrVar, Object obj, @CheckForNull List list, zzo zzoVar) {
        super(zzrVar, obj, list, zzoVar);
        this.zzf = zzrVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i2, obj);
        this.zzf.zzb++;
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i2, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        this.zzf.zzb += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzb();
        return ((List) this.zzb).get(i2);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzp(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        zzb();
        return new zzp(this, i2);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        zzb();
        Object objRemove = ((List) this.zzb).remove(i2);
        zzr zzrVar = this.zzf;
        zzrVar.zzb--;
        zzc();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        zzb();
        return ((List) this.zzb).set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        zzb();
        List listSubList = ((List) this.zzb).subList(i2, i3);
        zzo zzoVar = this.zzc;
        if (zzoVar == null) {
            zzoVar = this;
        }
        return this.zzf.zzf(this.zza, listSubList, zzoVar);
    }
}
