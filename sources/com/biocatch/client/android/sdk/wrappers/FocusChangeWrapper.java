package com.biocatch.client.android.sdk.wrappers;

import android.view.View;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.collectors.elements.FocusChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4E\u0007\":\u001b\u007fјnjG0L͜P.hS2\u000fq|:řqҕ\"CiTZ\u00132\r]N\u007fg\u001dKj\u0011Q\u0011\u001e\u0018\u000fiZHǤ|] \u0012zX}GKM\u001eFid\u0003@\u001d `-h}\u0013\r2*v\u0017=\u000f\fQ\u001a\u001fH@\u001fC\u0019\r\u001e\u0011(\u0012\u001e>N\u0002tմiߑ:Htҗ\u000b@1\u0005\u0002Dd&\u000e/ƊQ\u0013NÖ?\u000f|e,0\u0011CC\u001b=S1\u000e)¼KƄCqEݛػ+5"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u0015(\u0013xo\u0017\n_5Pv\u0019THY7\\_H", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feIa!\u0015W}k?r.7Yd$E|\u00167MP\u0011", "4nRBf\nAO\"\u0001zH)\u0002\t-t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[;\u0018L;\u001bb\\=-pD\r", "=qX4\\5:Z\u007f\u0003\tm,\u0006\t<", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016N3\\ZrF# $nX)\u001d\u00137D wF7tn(R\u0001Hr\u0005\u000b_\u001f9j\u0003\fG\u0014G\fS_J\nrDimWJ=Nd*K\u0010m,\\C:1i5\n", "5dc\u001ce0@W\"z\u0002E0\u000b\u0018/n\u007f5", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e~j wQm\u001eJT(1b\u007f \u001eq$=ML;x\n", "=qX4\\5:Z\u007f\u0003\tm,\u0006\t<C{/\u0003@\u007f", "", "=m5<V<L1\u001cz\u0004`,", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "6`b\u0013b*Na", "@db2g\u0016KW\u001b\u0003\u0004Z3c\r=t\u007f1{M^\u0013\u001eN]\u001d8\u0006%", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class FocusChangeWrapper implements View.OnFocusChangeListener {
    private final FocusChange focusChangeObject;
    private final View.OnFocusChangeListener originalListener;
    private boolean originalListenerCalled;

    public FocusChangeWrapper(FocusChange focusChangeObject, View.OnFocusChangeListener onFocusChangeListener) {
        Intrinsics.checkNotNullParameter(focusChangeObject, "focusChangeObject");
        this.focusChangeObject = focusChangeObject;
        this.originalListener = onFocusChangeListener;
    }

    private final void resetOriginalListenerCallState() {
        this.originalListenerCalled = false;
    }

    public final View.OnFocusChangeListener getOriginalListener() {
        return this.originalListener;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            if (this.originalListenerCalled) {
                Log.Companion.getLogger().warning("FocusChangeWrapper avoided calling originalListener twice - " + view.getClass().getSimpleName() + " triggered this function. take special care of it in FocusChangeWrapperFactory");
            } else {
                this.focusChangeObject.onFocusChange(view, z2);
                this.originalListenerCalled = true;
                View.OnFocusChangeListener onFocusChangeListener = this.originalListener;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z2);
                }
            }
        } finally {
            resetOriginalListenerCallState();
        }
    }
}
