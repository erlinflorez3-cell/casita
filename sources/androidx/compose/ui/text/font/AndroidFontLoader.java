package androidx.compose.ui.text.font;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;

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
/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":ߚ\u007f\u0007llA0ZeP\u008cZS@\u000fs{:%aҕ\bّkUH|b\u0014_Rug\u0007J\t\fß\u0013\u0006$z3BW]\u0011_(\u000e`K CAW\b=gk;șCڶ6\"F\u0006M\u0011(7`\u0012\ryqT<\u0016>J\t:\u0001\u0018\u0014\u0019j&\u0014A8\u00034[\u0016R\rԶnҺ>5+Ʌ\u0002DT,m6Ma\u001bFl/+}\n A?e6C&*\u038b\tқ_?\u000bӊѥA\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\u0007\u001fDw\u001a-.MDz\u001b(\u0011gaF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U$EtC\u0005\u001fd`9\u00149", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "1`R5X\u0012>g", "", "5dc\u0010T*AS~~\u000f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "/vP6g\u0013HO\u0018", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "4n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|k\u0015SMJr8'^fkF\u0011s;R\u007f'U\u0016,6eavF$\u000ei\u0012X4bH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", ":nP153HQ\u001f\u0003\u0004`", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidFontLoader implements PlatformFontLoader {
    public static final int $stable = 8;
    private final Object cacheKey;
    private final Context context;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidFontLoader.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\f}\u0012\u000fI\u0003\r\r\u0014Nb\u0011\b\u0017\u0015\u0010\fn\u0019\u0019 x\u001d\u0010\u0014\u0016$", f = "\u000e:/<81+\f427\u000e0!##/i\u001c(\u001d*&\u001f\u0019a\u001e&", i = {1, 1}, l = {57, 58}, m = "0G2;G D7;", n = {"c^kY", "UepZ"}, s = {"xQ^", "xQ_"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return AndroidFontLoader.this.awaitLoad(null, this);
        }
    }

    public AndroidFontLoader(Context context) throws Throwable {
        Class<?> cls = Class.forName(Qg.kd("nzo|xqk4hsqvfns,@kin^pk", (short) (OY.Xd() ^ 21659), (short) (OY.Xd() ^ 20576)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 13356);
        short sXd2 = (short) (OY.Xd() ^ 16601);
        int[] iArr = new int["fcq=kjeaZWi]b`4_]bRd_".length()];
        QB qb = new QB("fcq=kjeaZWi]b`4_]bRd_");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.context = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public android.graphics.Typeface loadBlocking(Font font) throws Throwable {
        Object objM8980constructorimpl;
        android.graphics.Typeface typefaceLoad;
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int iMo6180getLoadingStrategyPKNRLFQ = font.mo6180getLoadingStrategyPKNRLFQ();
        if (FontLoadingStrategy.m6220equalsimpl0(iMo6180getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m6225getBlockingPKNRLFQ())) {
            typefaceLoad = AndroidFontLoader_androidKt.load((ResourceFont) font, this.context);
        } else {
            if (!FontLoadingStrategy.m6220equalsimpl0(iMo6180getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m6226getOptionalLocalPKNRLFQ())) {
                if (FontLoadingStrategy.m6220equalsimpl0(iMo6180getLoadingStrategyPKNRLFQ, FontLoadingStrategy.Companion.m6224getAsyncPKNRLFQ())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m6222toStringimpl(font.mo6180getLoadingStrategyPKNRLFQ())));
            }
            try {
                Result.Companion companion = Result.Companion;
                AndroidFontLoader androidFontLoader = this;
                objM8980constructorimpl = Result.m8980constructorimpl(AndroidFontLoader_androidKt.load((ResourceFont) font, this.context));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
            }
            typefaceLoad = (android.graphics.Typeface) (Result.m8986isFailureimpl(objM8980constructorimpl) ? null : objM8980constructorimpl);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceLoad, ((ResourceFont) font).getVariationSettings(), this.context);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font r8, kotlin.coroutines.Continuation<? super android.graphics.Typeface> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.text.font.AndroidFontLoader.AnonymousClass1
            if (r0 == 0) goto L6d
            r6 = r9
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r6 = (androidx.compose.ui.text.font.AndroidFontLoader.AnonymousClass1) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L6d
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L3d
            if (r0 == r2) goto L7b
            if (r0 != r3) goto L73
            java.lang.Object r8 = r6.L$1
            androidx.compose.ui.text.font.Font r8 = (androidx.compose.ui.text.font.Font) r8
            java.lang.Object r0 = r6.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.ui.text.font.AndroidFontLoader) r0
            kotlin.ResultKt.throwOnFailure(r5)
        L2e:
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            androidx.compose.ui.text.font.ResourceFont r8 = (androidx.compose.ui.text.font.ResourceFont) r8
            androidx.compose.ui.text.font.FontVariation$Settings r1 = r8.getVariationSettings()
            android.content.Context r0 = r0.context
            android.graphics.Typeface r0 = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.setFontVariationSettings(r5, r1, r0)
            return r0
        L3d:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AndroidFont
            if (r0 == 0) goto L55
            androidx.compose.ui.text.font.AndroidFont r8 = (androidx.compose.ui.text.font.AndroidFont) r8
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r1 = r8.getTypefaceLoader()
            android.content.Context r0 = r7.context
            r6.label = r2
            java.lang.Object r5 = r1.awaitLoad(r0, r8, r6)
            if (r5 != r4) goto L7e
            return r4
        L55:
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r0 == 0) goto L7f
            r1 = r8
            androidx.compose.ui.text.font.ResourceFont r1 = (androidx.compose.ui.text.font.ResourceFont) r1
            android.content.Context r0 = r7.context
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r3
            java.lang.Object r5 = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r1, r0, r6)
            if (r5 != r4) goto L6b
            return r4
        L6b:
            r0 = r7
            goto L2e
        L6d:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r6 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r6.<init>(r9)
            goto L13
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7b:
            kotlin.ResultKt.throwOnFailure(r5)
        L7e:
            return r5
        L7f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown font type: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r8)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public Object getCacheKey() {
        return this.cacheKey;
    }
}
