package com.google.firebase;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0013\u007f\u0007|jA0ZeP\u008cZS8(sڔ<$i0yCAU\"}8\tWȞ\u007f\u0001|Qr\u0011S\u0011\u0016\u0016'sZQu\u0001c܈\u001d<Xng3{z\u0004ʣf\rF\u0013ړJ\"fx-\u0001H*x\u0014\u0005\u0007[K:\u001fHR~Hj\u000fc\u0004H\u0011.>N\u0001N`u]NH\u001bmRG1\u0011\u0002B|&\b0+M=Jb6%v\u0010.[DE8-%\u0002\u0007\u001friM\u001b? <-hU'[M\u0002fNX.$E/]\u0010urT`5Un\u0018?+}pkc\u001cߊ\u0010z*\fd\u0004<\u0006]\rͶ1\u001e~\n\u00144\u0003tsS^\u0005vB.~\n6E%6wڢ=\u001f~Sg@'T҂\u007f\u0016"}, d2 = {"/o_", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\na\u001b$Gl\nJv\u0001@dS", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\na\u001b$Gl\nJvz", "5dc\u000ec7", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@Jw\u001bTo\u000b8\u0005%\u000b\u001dd\u001eAu_0WM=r4g\u0016ln9\u0004_:N@\bKYN)X`r\u0019\u001f\u001d0", "=oc6b5L", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\na\u001b$Gl\nJv\u000f@h\u0002*@{k", "5dc\u001cc;B]\"\r", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@Jw\u001bTo\u000b8\u0005%\u000b\u001dd\u001eAu_0WM=r4g\u0016ln9\u0004_:N@\bKYN)X`r'\u001f!^\u0018W9b", "1na<h;B\\\u0019]~l7x\u0018-h\u007f5", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~!\u001fRy\u0017<\u007f4C#[*?x 7MLJA", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "\"", "", "<`\\2", "", "7mXA\\(EW.~", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#?a\u0006*@"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FirebaseKt {

    /* JADX INFO: renamed from: com.google.firebase.FirebaseKt$coroutineDispatcher$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!4i\bDJc|\u0004O\u001f8é6B\u0015\"4ߚ\u0006ј~rW0lg^-\u0001RX\u000e\f\u0004:ři%\bBcUH\u007fR\u0015]Q\u007fo\rJ\u0003\rY\u000e4\u001a'nrQǤ|]\u0018\u0014"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\"", "", "1", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~!\u001fRy\u0017<\u007f4C#[*?x 7MLJI>'$deB\u0007p\u0002", "1qT.g,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1<T> implements ComponentFactory {
        public static final AnonymousClass1<T> INSTANCE = ;

        @Override // com.google.firebase.components.ComponentFactory
        public final CoroutineDispatcher create(ComponentContainer componentContainer) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Object obj = componentContainer.get(Qualified.qualified(Annotation.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.from((Executor) obj);
        }
    }

    public static final FirebaseApp app(Firebase firebase, String name) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(name);
        Intrinsics.checkNotNullExpressionValue(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final /* synthetic */ <T extends Annotation> Component<CoroutineDispatcher> coroutineDispatcher() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Component.Builder builder = Component.builder(Qualified.qualified(Annotation.class, CoroutineDispatcher.class));
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Component.Builder builderAdd = builder.add(Dependency.required((Qualified<?>) Qualified.qualified(Annotation.class, Executor.class)));
        Intrinsics.needClassReification();
        Component<CoroutineDispatcher> componentBuild = builderAdd.factory(AnonymousClass1.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(componentBuild, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return componentBuild;
    }

    public static final FirebaseApp getApp(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    public static final FirebaseOptions getOptions(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        Intrinsics.checkNotNullExpressionValue(options, "Firebase.app.options");
        return options;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options);
        Intrinsics.checkNotNullExpressionValue(firebaseAppInitializeApp, "initializeApp(context, options)");
        return firebaseAppInitializeApp;
    }

    public static final FirebaseApp initialize(Firebase firebase, Context context, FirebaseOptions options, String name) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(name, "name");
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, options, name);
        Intrinsics.checkNotNullExpressionValue(firebaseAppInitializeApp, "initializeApp(context, options, name)");
        return firebaseAppInitializeApp;
    }
}
