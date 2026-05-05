package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u0003İIي8\u000b<`\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$q$yCQU\"}0\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u0007s4I[\tc܈%˰ruO5]ok9\u000fsvJ0<09\u0012\u000b\u0011\u001c:H>y)E[\u0010 4XphR\u001dQ\u0013\u001f*\u0006l&\u0011\"jnf6vtmJ=,\u001buRP7_^\b]\u000fVTU\u0019%k./NDM\u0015SaΫ\u000bRiNKK\u007f[\u001dhU3qɥ2ɱ:X\u000e3]?]-ut<[3Q\t\fU.\u0016ҫ\nח\u0012*}\u001c\n/\r\u0010\u001c\r?H\\5pǔ\nԧ7tzԟ\u0011h\u0010nZ\u007f)r\rЎ1ő77Aӕ~SgM'aW}\u000b!,8Q\u0001/\\l\u0014p\u0017+T&T_S\u0017׃Jݳ\u000eYEЧT\tp\u000bB\u0010@I\u0010/*\u001c>\u001957\nEQ+BȸJזkv\r\u009b9_w_`@P|lն,Á\u0010ZLߟUw^Yp,?Sr΄\tą\f\u0013(οHe/<(N}h\u001an[s\"%]fm.-<dú\u07b9^ۋ9ak\u0012gn\u00051W>h\u001df\u007fbU\u0012tjCϘ6k"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\f4@kv8VR\"oB-{r]8\u0007p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "4n]A?0Lb", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "7mXA\\(EB-\nz", "Bx_2Y(<S\u0006~\u0007n,\u000b\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;wD\u001e#w7", "/rh;V\u001bR^\u0019\u007fv\\,Z\u0005-h\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~5\f4@k\u0005BXC<g2\u001erd_<\u00079", "=m2<`7ES(\u0003\u0005g", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M0;yD%$'EA\u000fs;Js.G\"", "", ">kPAY6K[y\t\u0004m\u0013\u0007\u0005.e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U$EtC\u0005\u001fd`9\u00149", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006`\":Y{/\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016],oa<>\u001e\u001biW=?\u0018\u0005Z=\"n17+\u0018,W\u0011\u0011O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2V])\tGTT,+n\u0015nf8HN-\u0012`-&hQ*\b{1\rpUy=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0002:kGp\u0017Kh|\u0014?&?1.AF!?\u0015sy6M\u000e{.+\t\u0018kDz\u0004larI\u0019\u0014ewe>pF\u000b3Q\u0006K\u001f3\u0006", "1`R5X(;Z\u0019", "", "5dc\u0010T*AS\u0015{\u0002^j\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<", "u(I", "Adc\u0010T*AS\u0015{\u0002^j\r\r)t\u007f;\u000b:\u000e\u0017\u001eGk\u001c<", "uY\u0018#", "\nrTA \u0006\u0017", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "D`[BXj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ":nP1", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", ":nP1J0MV\b\u0003\u0003^6\r\u0018\u0019rh8\u0003G", ":nP1J0MV\b\u0003\u0003^6\r\u0018\u0019rh8\u0003G?'\u001bA~\u000eO\u0006\u001fBY\u0005 3{\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|k\u0015SMJr8'^fkF\u0011s;R\u007f'U\u0016,6eavF$\u000ei\u0012X4bH@F \u007f@\u0001&\u00045KK%e\u0006\f\u0014\u001d\u000b", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;
    private final List<Font> fontList;
    private final Function1<TypefaceResult.Immutable, Unit> onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1 */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\f}\u0012\u000fI\u0003\r\r\u0014Nb\u0016\u001d\u0013\tl\u0017\u0017\u001ev\u0015 \"z\u001f\u0012\u0016\u0018&", f = "\u0013;9>\u00151::\u000b316\u0007!,')5\u000f3)\u001d\u001d\u0017\u0018\u0019s\u0016\u0012 #\u0013\u001fY\u0016\u001e", i = {0, 0, 0, 0, 1, 1, 1}, l = {272, 285}, m = ";?26", n = {"c^kY", "\u0013jjOe\u001aHHIN,9I\u001f )\u001bZ+\u001d", "UepZ", "XdfKj\u001aK]", "c^kY", "\u0013jjOe\u001aHHIN,9I\u001f )\u001bZ+\u001d", "XdfKj\u001aK]"}, s = {"xQ^", "xQ_", "xQ`", "uQ^", "xQ^", "xQ_", "uQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return AsyncFontListLoader.this.load(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1<? super TypefaceResult.Immutable, Unit> function1, PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = function1;
        this.platformFontLoader = platformFontLoader;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    public final void setCacheable$ui_text_release(boolean z2) {
        this.cacheable = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006b A[Catch: all -> 0x00f2, TRY_ENTER, TryCatch #1 {all -> 0x00f2, blocks: (B:88:0x00bb, B:78:0x006b, B:80:0x0081, B:90:0x00be, B:85:0x00a8), top: B:104:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a8 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:88:0x00bb, B:78:0x006b, B:80:0x0081, B:90:0x00be, B:85:0x00a8), top: B:104:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x007f -> B:104:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x00b8 -> B:104:0x00bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object load(kotlin.coroutines.Continuation<? super kotlin.Unit> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font r9, kotlin.coroutines.Continuation<java.lang.Object> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L29
            r7 = r10
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r7 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L29
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L16:
            java.lang.Object r2 = r7.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r0 = 1
            r6 = 0
            if (r1 == 0) goto L3b
            if (r1 != r0) goto L33
            java.lang.Object r9 = r7.L$0
            androidx.compose.ui.text.font.Font r9 = (androidx.compose.ui.text.font.Font) r9
            goto L2f
        L29:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r7 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r7.<init>(r8, r10)
            goto L16
        L2f:
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L83
            goto L8f
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r2)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r2 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L83
            r2.<init>(r8, r9, r6)     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L83
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L83
            r7.L$0 = r9     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L83
            r7.label = r0     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L83
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r2 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r0, r2, r7)     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L83
            if (r2 != r3) goto L8f
            return r3
        L52:
            r5 = move-exception
            kotlin.coroutines.CoroutineContext r1 = r7.getContext()
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r4 = r1.get(r0)
            kotlinx.coroutines.CoroutineExceptionHandler r4 = (kotlinx.coroutines.CoroutineExceptionHandler) r4
            if (r4 == 0) goto L90
            kotlin.coroutines.CoroutineContext r3 = r7.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to load font "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r2.<init>(r0, r5)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r4.handleException(r3, r2)
            goto L90
        L83:
            r1 = move-exception
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            boolean r0 = kotlinx.coroutines.JobKt.isActive(r0)
            if (r0 == 0) goto L91
            goto L90
        L8f:
            r6 = r2
        L90:
            return r6
        L91:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
