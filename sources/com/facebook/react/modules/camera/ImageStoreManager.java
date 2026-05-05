package com.facebook.react.modules.camera;

import android.net.Uri;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.ZN;
import yg.ZO;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\t,\u001f$!\u000e.(*\u001c\u0003\u0016\"\u0014\u0019\u0016\"")
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjG<L͜P.hS2\u000fq|:)qҕ\u0010MkUH|Z\bY\u000frwrXZ#C=\u0007Ȁ|j:K\u001e\u0017k\u0015'2pso7[tU9\u000fzf\t.9:8(\r1\u001e8Q(v)K\u0012 ܞ4K"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t!=Y\u000b\u001c\u0001Q\u001e*OC)z>+\u0015P]B\u0003e,[L", "\u001ab^:\"-:Q\u0019{\u0005h2F\n,r\u007f$yOJ%\"Gm\u001c\u0006_!D]\u000f \u001bu\u00120M1JuA\u001epq`F\u0011g+<\u0002'E\"", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "5dc\u000fT:>$g_\u0005k\u001bx\u000b", "", "CqX", "", "AtR0X:L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "3qa<e", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "ImageStoreManager";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001e\u007fјnjG0L͜P.hS2\u000fq{<$q$yCAU ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtWc}u\u0012=8rsM:eokA't~\u0018.;:8(\t1\u001e8R(v)N\u0012Èܘ4@vF#\u0019[\u00062\u00124@vҸp֔kN>ԟ=iH2;\u0003\u0018F%ϒ2݁\u0001M\u0015Ͽÿ+\u001a"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t!=Y\u000b\u001c\u0001Q\u001e*OC)z>+\u0015P]B\u0003e,[5\u0005QTY(eV|Fi", "", "u(E", "\u0010T5\u00138\u00198A|sZ", "", "\u001c@<\u0012", "", "1k^@X\u0018NW\u0019\u000e\u0002r", "", "1k^@X(;Z\u0019", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "1n]CX9M7\"\n\u000bm\u001a\f\u0016/a\b\u0017\u0006\u001d|%\u0017\u0018>wL\u00060Ehk/Dm\u00126", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "1n]CX9M7\"\n\u000bm\u001a\f\u0016/a\b\u0017\u0006\u001d|%\u0017\u0018>wL\u00060Ehk/Dm\u00126\f0;g2-pq`F\u0011g+H\u0004'NLJ:\\", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void closeQuietly(Closeable closeable) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }

        public final String convertInputStreamToBase64OutputStream$ReactAndroid_release(InputStream inputStream) throws IOException {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
            byte[] bArr = new byte[8192];
            while (true) {
                try {
                    int i2 = inputStream.read(bArr);
                    if (i2 <= -1) {
                        closeQuietly(base64OutputStream);
                        String string = byteArrayOutputStream.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return string;
                    }
                    base64OutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    closeQuietly(base64OutputStream);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.facebook.react.modules.camera.ImageStoreManager$Companion] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.facebook.react.modules.camera.ImageStoreManager$Companion] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void getBase64ForTag$lambda$0(ImageStoreManager this$0, String uri, Callback success, Callback error) {
        ?? r1;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        try {
            ?? OpenInputStream = this$0.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(uri));
            Intrinsics.checkNotNull(OpenInputStream, "null cannot be cast to non-null type java.io.InputStream");
            try {
                try {
                    ?? r12 = Companion;
                    success.invoke(r12.convertInputStreamToBase64OutputStream$ReactAndroid_release(OpenInputStream));
                    r1 = r12;
                    OpenInputStream = (Closeable) OpenInputStream;
                } catch (IOException e2) {
                    error.invoke(e2.getMessage());
                    r1 = Companion;
                    OpenInputStream = (Closeable) OpenInputStream;
                }
                r1.closeQuietly(OpenInputStream);
            } catch (Throwable th) {
                Companion.closeQuietly((Closeable) OpenInputStream);
                throw th;
            }
        } catch (FileNotFoundException e3) {
            error.invoke(e3.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(final String str, final Callback callback, final Callback callback2) throws Throwable {
        Intrinsics.checkNotNullParameter(str, ZO.xd("w\u0018G", (short) (ZN.Xd() ^ 19946), (short) (ZN.Xd() ^ 16651)));
        Intrinsics.checkNotNullParameter(callback, C1626yg.Ud("\u0002\u0012\u0016B|gM", (short) (FB.Xd() ^ 23484), (short) (FB.Xd() ^ 7392)));
        Intrinsics.checkNotNullParameter(callback2, Ig.wd("^\u001e\np1", (short) (C1607wl.Xd() ^ 20199)));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("\b0'vS_\u0007\fac/%R9[?c\\\u000e`\\\u001c9*\u000b|\u001eqr&", (short) (ZN.Xd() ^ 22675))).getDeclaredMethod(C1561oA.Qd("{q\u0003]rvnrjXktfacCua^omgi", (short) (C1633zX.Xd() ^ (-2169))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            ((ExecutorService) declaredMethod.invoke(null, objArr)).execute(new Runnable() { // from class: com.facebook.react.modules.camera.ImageStoreManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageStoreManager.getBase64ForTag$lambda$0(this.f$0, str, callback, callback2);
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
