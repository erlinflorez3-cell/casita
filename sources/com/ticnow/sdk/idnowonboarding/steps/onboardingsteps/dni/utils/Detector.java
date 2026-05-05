package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.dni.utils;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006\u0010nʑA0ZeP.XT@ş\u001c{b#\u001c'ڱG;c\u001aF6\u0017Tfg\u0016tz^\u0019J'\u0006D\u0001\u001b0W^\u0011]@\u0011zV}IKM\u001eCid\u0003=\u001d `*h}\u0013\n2*v\u0012G\rQL$\u0012^BGô\u0015ҫQ\u000b\"Ň\u001e@&\u0004,`ʊRA"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\f/7x$wWL8u0+\u0014lj;\u0015r,Y\u0005pFURulavD\"[9\u000e]+\u000b\u0014cNy", "", "u(E", "\"@6", "", "5dc!4\u000e", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "/qT\u0013T*>a|\beb*\f\u0019<e", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4h[2C(MV", "/qT\u001d7\r\r\u001fjb\u0004I0z\u0018?r\u007f", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class Detector {
    private final String TAG = "Detector";

    public final boolean areFacesInPicture(Context context, String filePath) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(filePath, "filePath");
        try {
            FaceDetector faceDetectorBuild = new FaceDetector.Builder(context).setMode(1).setProminentFaceOnly(true).setTrackingEnabled(false).build();
            Intrinsics.checkExpressionValueIsNotNull(faceDetectorBuild, "com.google.android.gms.v…\n                .build()");
            SparseArray<Face> sparseArrayDetect = faceDetectorBuild.detect(new Frame.Builder().setBitmap(BitmapFactory.decodeFile(filePath)).build());
            faceDetectorBuild.release();
            return sparseArrayDetect.size() > 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final boolean arePDF417InPicture(Context context, String filePath) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(filePath, "filePath");
        try {
            BarcodeDetector barcodeDetectorBuild = new BarcodeDetector.Builder(context).setBarcodeFormats(2048).build();
            Intrinsics.checkExpressionValueIsNotNull(barcodeDetectorBuild, "BarcodeDetector.Builder(…\n                .build()");
            SparseArray<Barcode> sparseArrayDetect = barcodeDetectorBuild.detect(new Frame.Builder().setBitmap(BitmapFactory.decodeFile(filePath)).setRotation(1).build());
            barcodeDetectorBuild.release();
            return sparseArrayDetect.size() > 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final String getTAG() {
        return this.TAG;
    }
}
