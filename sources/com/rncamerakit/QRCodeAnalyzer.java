package com.rncamerakit;

import android.media.Image;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<`\u0007\"B\u0012\u007f\u0007|jA0JeP.hS2şs{B$cҕyCI\\\"}(\u000bWN}gvϺpŏs\u000f4\u001596<\u0004cxuH\u001fIR\u0005O5]ok<\u000fvȥ\t*8&H\u007f\u000b\u0006*,N\u0016\u001d\u0001S\\\u001c!^G¤>\\\u0013Q\u0015 \u0018\u000bN\"\u0007$\u0003o^8Xl\fC]$\u0013oHN5iH|{\u0018ТX'\u001b\u0003*,9NO5C.\u0004\u0007\u0015as?1O8RUt54CI\"b\rݜ\fЏ\u0019+WՕ.54\\\u001d\bp#7@_e[P<+&|ԫ\u0011F\n\u0012\u0016-N3=\u001cl\u000e49\u0005\u0004cO~\tެF\n\u0001eF\u001d+\u0005C-?!\rYq=)Ne\u00053\u000etŃ\u0003ͼ%[\\ו1!)^\u0010Q_\\\u0017׃Jݳ\u000eYEЧշts"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/k\u0015YJ\u007f\u0017rPk\u0015P\f%B/", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u0018\u007f!<m\f$E,q7IJO\u00014+j", "=m@\u001f66=S']zm,z\u0018/d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001ab^:\".H]\u001b\u0006z(4\u0004\u000f3tI9\u007fN\u0005! \u0011l\nIt/4YG\u001eAu\u001e8V\r\u0018gA\u001c\u001fga\u000f", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "?q2<W,L", "\u001a`]1e6BRb\u000f\nb3Fv3z\u007f}", "7lP4X\u001aBh\u0019", "", "AbP;G/K](\u000e\u0002^\u000b|\u0010+y", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0005z^", ":`bA5(KQ#}z=,\f\t-t\u007f'jD\t\u0017", "/mP9lA>", "7lP4X", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e'\u0004/HmS", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class QRCodeAnalyzer implements ImageAnalysis.Analyzer {
    private long lastBarcodeDetectedTime;
    private final Function2<List<? extends Barcode>, Size, Unit> onQRCodesDetected;
    private final long scanThrottleDelay;

    /* JADX WARN: Multi-variable type inference failed */
    public QRCodeAnalyzer(Function2<? super List<? extends Barcode>, ? super Size, Unit> onQRCodesDetected, long j2) {
        Intrinsics.checkNotNullParameter(onQRCodesDetected, "onQRCodesDetected");
        this.onQRCodesDetected = onQRCodesDetected;
        this.scanThrottleDelay = j2;
    }

    public /* synthetic */ QRCodeAnalyzer(Function2 function2, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? 0L : j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void analyze$lambda$1(ImageProxy image, Task it) {
        Intrinsics.checkNotNullParameter(image, "$image");
        Intrinsics.checkNotNullParameter(it, "it");
        image.close();
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(final ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Image image2 = image.getImage();
        if (image2 == null) {
            return;
        }
        InputImage inputImageFromMediaImage = InputImage.fromMediaImage(image2, image.getImageInfo().getRotationDegrees());
        Intrinsics.checkNotNullExpressionValue(inputImageFromMediaImage, "fromMediaImage(...)");
        BarcodeScanner client = BarcodeScanning.getClient();
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        Task<List<Barcode>> taskProcess = client.process(inputImageFromMediaImage);
        final Function1<List<Barcode>, Unit> function1 = new Function1<List<Barcode>, Unit>() { // from class: com.rncamerakit.QRCodeAnalyzer.analyze.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<Barcode> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Barcode> list) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (QRCodeAnalyzer.this.scanThrottleDelay <= 0 || jCurrentTimeMillis - QRCodeAnalyzer.this.lastBarcodeDetectedTime >= QRCodeAnalyzer.this.scanThrottleDelay) {
                    ArrayList arrayList = new ArrayList();
                    Intrinsics.checkNotNull(list);
                    for (Barcode barcode : list) {
                        if (barcode != null) {
                            Intrinsics.checkNotNull(barcode);
                            arrayList.add(barcode);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    QRCodeAnalyzer.this.lastBarcodeDetectedTime = jCurrentTimeMillis;
                    QRCodeAnalyzer.this.onQRCodesDetected.invoke(arrayList, new Size(image.getWidth(), image.getHeight()));
                }
            }
        };
        taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: com.rncamerakit.QRCodeAnalyzer$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                QRCodeAnalyzer.analyze$lambda$0(function1, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: com.rncamerakit.QRCodeAnalyzer$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                QRCodeAnalyzer.analyze$lambda$1(image, task);
            }
        });
    }
}
