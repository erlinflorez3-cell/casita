package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: compiled from: ContentScale.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\nlPOӄblx.\u0001Rb\u000erDT2[<qq<\u0006\u001e\f$!O|j\u0018rX^#C=\t\\\u001dΌ+կǤ|_\u0018\u0014@HƜ>2ݼoHAczȤ!N1*:\u007f$/\u0019ݻL\u0018\u038d~B"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006T/>h})F[\u0014*TC\u0011", "", "1n\\=h;>A\u0017z\u0002^\rx\u0007>o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d#1`}\u00013k%8Z\u0019", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2rc \\A>", "1n\\=h;>A\u0017z\u0002^\rx\u0007>o\ro^\u0012\u0004)\u007f3K", "uI9u=", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ContentScale {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
    long mo5505computeScaleFactorH7hwNQA(long j2, long j3);

    /* JADX INFO: compiled from: ContentScale.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u000534\u0012\u000e\u0007nj?2JͣIDɟ\u0004*=j<9*[ҸuCIUj\u00180\ngN\u0016i%N1ŗEǇ\n\"\u0001̓<K[{k\u0012'4HsM8\u001e\nK?xtd\u0007V6x؈{ڱ\u0005&2Ϻ x\u0001JY\f*2FxHW]g\u0013#*\u0006l\"7\"3ɩPɇLxeŽ?%\tsPN?a6\b[\u0012\u0017n5\u0019\u000faL-v;\f՞'٨\u0007\u0013Z¹O\u0005E~K\u0005\u0001)-9Wx(Pf\u000f,\u0015YQCaI̮^ԇUl\u0014ʬ;Qi[^\u000e@y\u0001\r\u001bAT(\u00149`.[\u001c\u001d\fdޟvɤWLX\u061cnD\u0006\u000eo6/'\u0006G9>k\u0001_vS\u0019|M2\tc̜%ъr-c٪\u001eb\u001b2bwi3WXKaݹ\u000es"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006T/>h})F[\u0014*TCyI>& dj=\u0011l\u0002", "", "u(E", "\u0011q^=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006T/>h})F[\u0014*TC\u0011", "5dc\u0010e6I\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0010e6I", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0013c\u0007/7v%\u001cK?Bk\n", "\u0014h[956N\\\u0018\r", "5dc\u0013\\3E0#\u000f\u0004]:;\u00058n\n7wO\u0005! U", "5dc\u0013\\3E0#\u000f\u0004]:", "\u0014h[9;,BU\u001c\u000e", "5dc\u0013\\3E6\u0019\u0003|a;;\u00058n\n7wO\u0005! U", "5dc\u0013\\3E6\u0019\u0003|a;", "\u0014h[9J0=b\u001c", "5dc\u0013\\3EE\u001d}\najx\u00128o\u000f$\u000bD\u000b %", "5dc\u0013\\3EE\u001d}\na", "\u0014hc", "5dc\u0013\\;|O\"\b\u0005m(\f\r9n\u000e", "5dc\u0013\\;", "\u0017mb6W,", "5dc\u0016a:BR\u0019=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0016a:BR\u0019", "\u001cn]2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006W)HY|\u000e5i\u001d.#", "5dc\u001bb5>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u001bb5>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0016]\u0011 6[\u0014*TC\u0011", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo5505computeScaleFactorH7hwNQA(long j2, long j3) {
                float fM5511computeFillMaxDimensioniLBOSCw = ContentScaleKt.m5511computeFillMaxDimensioniLBOSCw(j2, j3);
                return ScaleFactorKt.ScaleFactor(fM5511computeFillMaxDimensioniLBOSCw, fM5511computeFillMaxDimensioniLBOSCw);
            }
        };
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo5505computeScaleFactorH7hwNQA(long j2, long j3) {
                float fM5512computeFillMinDimensioniLBOSCw = ContentScaleKt.m5512computeFillMinDimensioniLBOSCw(j2, j3);
                return ScaleFactorKt.ScaleFactor(fM5512computeFillMinDimensioniLBOSCw, fM5512computeFillMinDimensioniLBOSCw);
            }
        };
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo5505computeScaleFactorH7hwNQA(long j2, long j3) {
                float fM5510computeFillHeightiLBOSCw = ContentScaleKt.m5510computeFillHeightiLBOSCw(j2, j3);
                return ScaleFactorKt.ScaleFactor(fM5510computeFillHeightiLBOSCw, fM5510computeFillHeightiLBOSCw);
            }
        };
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo5505computeScaleFactorH7hwNQA(long j2, long j3) {
                float fM5513computeFillWidthiLBOSCw = ContentScaleKt.m5513computeFillWidthiLBOSCw(j2, j3);
                return ScaleFactorKt.ScaleFactor(fM5513computeFillWidthiLBOSCw, fM5513computeFillWidthiLBOSCw);
            }
        };
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo5505computeScaleFactorH7hwNQA(long j2, long j3) {
                if (Size.m4006getWidthimpl(j2) > Size.m4006getWidthimpl(j3) || Size.m4003getHeightimpl(j2) > Size.m4003getHeightimpl(j3)) {
                    float fM5512computeFillMinDimensioniLBOSCw = ContentScaleKt.m5512computeFillMinDimensioniLBOSCw(j2, j3);
                    return ScaleFactorKt.ScaleFactor(fM5512computeFillMinDimensioniLBOSCw, fM5512computeFillMinDimensioniLBOSCw);
                }
                return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
            }
        };
        private static final FixedScale None = new FixedScale(1.0f);
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo5505computeScaleFactorH7hwNQA(long j2, long j3) {
                return ScaleFactorKt.ScaleFactor(ContentScaleKt.m5513computeFillWidthiLBOSCw(j2, j3), ContentScaleKt.m5510computeFillHeightiLBOSCw(j2, j3));
            }
        };

        public static /* synthetic */ void getCrop$annotations() {
        }

        public static /* synthetic */ void getFillBounds$annotations() {
        }

        public static /* synthetic */ void getFillHeight$annotations() {
        }

        public static /* synthetic */ void getFillWidth$annotations() {
        }

        public static /* synthetic */ void getFit$annotations() {
        }

        public static /* synthetic */ void getInside$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        public final FixedScale getNone() {
            return None;
        }

        public final ContentScale getFillBounds() {
            return FillBounds;
        }
    }
}
