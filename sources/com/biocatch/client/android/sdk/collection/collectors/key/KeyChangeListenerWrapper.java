package com.biocatch.client.android.sdk.collection.collectors.key;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.biocatch.client.android.sdk.collection.collectors.elements.TextChangeDelegate;
import java.lang.ref.WeakReference;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV.Zݷ2\u000f\u0002{<řc$\u007fNC٥\"}0\u000fWNmjtϺpŏs\u000f4\u00159\u007f2կe|k\u0012'2ppO7[qU9\u000fwȥ\t @&\u0001\b\u0013\u00072*v\u0017'~QS$\u0012^I7N\u001b3[\u000f2\u00124EP\u0005,d\u007fNdS\u001daH;;\u0003\u0018O~+m>\u0015M;S\u0005+\u001b\u0006y\u001eYM}I]Ka\u0013\u001fR\nF3C\u007fE\u001dhU2[M\u0002cNX.!E/]\u001eurTi5Un\u001a?+}p\u0012d^4\u0006|\u0014\rj\u0007dͽ)ρ2-\"ǑX At\u000bYPR\u0012^p\u0001)f\rА'ő7+AӕǁUs"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011RN@&8rQq\u0015V\u0017P+s\tgP$wDD\u0011\u0015(T\r;uV", "\u001a`]1e6BRb\u000ezq;Fw/x\u000f\u001awO~\u001a\u0017TE", "BdgAI0>e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "2d[2Z(MS", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[I\u000ea:j\bUJ&n#7&\b.E\u0011;>", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'~!\u001f\u0011l\u0012Ft!DW\u0001i5t\u001a.VR\u0005g=\u001d\"re8Pq+T@%QSU,ZavG\u001d[X\u0018U2\r\u0003hK1|\u000e7&\b4I\u000bJvJz\u0016!DHs>_\u0012GX\u0015|A+dUY5=8", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "/ec2e\u001b>f(\\}Z5~\t.", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "\u001a`]1e6BRb\u000ezq;Fh.i\u000f$xG\u0001l", "0dU<e,-S,\u000eXa(\u0006\u000b/d", "", "AsP?g", "", "1nd;g", "/ec2e", "=mC2k;\u001cV\u0015\b|^+", "0dU<e,", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class KeyChangeListenerWrapper implements TextWatcher {
    private final TextChangeDelegate delegate;
    private final WeakReference<View> textView;

    public KeyChangeListenerWrapper(View textView, TextChangeDelegate delegate) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.textView = new WeakReference<>(textView);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s2, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(s2, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s2, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(s2, "s");
        this.delegate.onTextChanged(this.textView.get(), s2, i2, i3, i4);
    }
}
