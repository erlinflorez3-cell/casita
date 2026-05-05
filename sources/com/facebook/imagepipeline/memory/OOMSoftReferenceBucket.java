package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.OOMSoftReference;
import java.util.LinkedList;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
class OOMSoftReferenceBucket<V> extends Bucket<V> {
    private LinkedList<OOMSoftReference<V>> mSpareReferences;

    public OOMSoftReferenceBucket(int i2, int i3, int i4) {
        super(i2, i3, i4, false);
        this.mSpareReferences = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.Bucket
    void addToFreeList(V v2) {
        OOMSoftReference<V> oOMSoftReferencePoll = this.mSpareReferences.poll();
        if (oOMSoftReferencePoll == null) {
            oOMSoftReferencePoll = new OOMSoftReference<>();
        }
        oOMSoftReferencePoll.set(v2);
        this.mFreeList.add(oOMSoftReferencePoll);
    }

    @Override // com.facebook.imagepipeline.memory.Bucket
    @Nullable
    public V pop() {
        OOMSoftReference<V> oOMSoftReference = (OOMSoftReference) this.mFreeList.poll();
        Preconditions.checkNotNull(oOMSoftReference);
        V v2 = oOMSoftReference.get();
        oOMSoftReference.clear();
        this.mSpareReferences.add(oOMSoftReference);
        return v2;
    }
}
