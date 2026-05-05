package androidx.camera.lifecycle;

import androidx.camera.core.CameraX;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,\b\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u0010\u0017tʑQ6TgX.\u0001SX\u000e\u0014{b%\")\nOIW2\u007f8\b}Q\u0010g\u001dK!\få\u0013\n"}, d2 = {"5dc\u000ei(BZ\u0015{\u0002^\nx\u0011/r{\f\u0005O\u0001$ Cv\u001c", "", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u001b\u001fRvW\u001ar-5fy\u0004@|\u0016;V?BA", "\u001a`]1e6BR,HxZ4|\u0016+/\u0007,|@~+\u0015NoW'\u0004/3Y\f.\u0015i\u001e.Z?&x>/\u0019gaF\\", "5dc\u0010T4>`\u0015qkb(i\t0l\u007f&\u000bD\u000b ", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8iz", "1na2 3BU\u001c\u000etk,\u0004\t+s\u007f"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ProcessCameraProviderExtensionsKt {
    public static final List<CameraInternal> getAvailableCameraInternals(ProcessCameraProvider processCameraProvider) {
        CameraRepository cameraRepository;
        Intrinsics.checkNotNullParameter(processCameraProvider, "");
        Timber.Forest.d("CX:getAvailableCameraInternal", new Object[0]);
        ArrayList arrayList = new ArrayList();
        Field declaredField = ProcessCameraProvider.class.getDeclaredField("mCameraX");
        declaredField.setAccessible(true);
        CameraX cameraX = (CameraX) declaredField.get(processCameraProvider);
        LinkedHashSet<CameraInternal> cameras = (cameraX == null || (cameraRepository = cameraX.getCameraRepository()) == null) ? null : cameraRepository.getCameras();
        Iterator it = (cameras == null ? SetsKt.emptySet() : cameras).iterator();
        while (it.hasNext()) {
            arrayList.add((CameraInternal) it.next());
        }
        return arrayList;
    }
}
