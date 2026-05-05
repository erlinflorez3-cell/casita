package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDRш|\u0004G\u00158\u000bDB\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2\u000f\u0002{<$q$yCQU\"}8\tWN}gvJp\u000bK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172XoG3coEʠf*LӌH4(\u0600\b\u00041\u001aXHH\u0005|FO\u0011\u00187HyD]\u0019Z\u0013)\"\u0017~%\u0007 ֔kNDIǐ\\HA6\u0017~Xe?xJ\u0018i*dsG.ȡe@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "\"", "", "u(E", "\u0014h[9", "\u0014h[943IV\u0015", "\u001e`c57(MO", "\u001ehe<g\u001f", "\u001ehe<g ", " nc.g0H\\", "!bP9X\u001f", "!bP9X ", "!sa<^,", "!sa<^,\u001aZ$\u0002v", "!sa<^,%W\"~lb+\f\f", "\"qP;f3:b\u0019q", "\"qP;f3:b\u0019r", "\"qX:C(MVx\by", "\"qX:C(MV\u0003\u007f{l,\f", "\"qX:C(MV\u0007\u000evk;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rW+NS$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rW+NS*3gUn\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\ra#VO-(kNH", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\ra+XV]\u001f2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\ra+XV] 2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rc1VH]0f[H", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd%CSN\u001f2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd%CSN 2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd6TVT,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd6TVT,8Y}@\u0010g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd6TVT,CV{=\u0006\u0016Y\u001dQ\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4CU\\3Xar0i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4CU\\3Xar1i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4KT9(kURF\u0013g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4KT9(kU\\>\u0015 Z\u001d$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4KT9(kU`L\u0010\u001fic", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class VectorProperty<T> {
    public static final int $stable = 0;

    public /* synthetic */ VectorProperty(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rc1VH]0f[H", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Rotation extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final Rotation INSTANCE = new Rotation();

        private Rotation() {
            super(null);
        }
    }

    private VectorProperty() {
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\ra+XV]\u001f2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PivotX extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final PivotX INSTANCE = new PivotX();

        private PivotX() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\ra+XV] 2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PivotY extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final PivotY INSTANCE = new PivotY();

        private PivotY() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd%CSN\u001f2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ScaleX extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final ScaleX INSTANCE = new ScaleX();

        private ScaleX() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd%CSN 2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ScaleY extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final ScaleY INSTANCE = new ScaleY();

        private ScaleY() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4CU\\3Xar0i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TranslateX extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TranslateX INSTANCE = new TranslateX();

        private TranslateX() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4CU\\3Xar1i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TranslateY extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TranslateY INSTANCE = new TranslateY();

        private TranslateY() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0016DLc\u0003\"I\u0006F\u000b6B\u0005\"2¡w\u001d߿\u001bE@LuN>Tc*=l*4RZdvI;ڈ\u001e}0\u000bҐRj"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\ra#VO-(kNH", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PathData extends VectorProperty<List<? extends PathNode>> {
        public static final int $stable = 0;
        public static final PathData INSTANCE = new PathData();

        private PathData() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b4ɘ~8ܥB\u007f\u0017jz;FC\u0014H\\Q\u0014/\u0015kڷ8$i%ڷG="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rW+NS$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Fill extends VectorProperty<Brush> {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        private Fill() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rW+NS*3gUn\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class FillAlpha extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final FillAlpha INSTANCE = new FillAlpha();

        private FillAlpha() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b4ɘ~8ܥB\u007f\u0017jz;FC\u0014H\\Q\u0014/\u0015kڷ8$i%ڷG="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd6TVT,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Stroke extends VectorProperty<Brush> {
        public static final int $stable = 0;
        public static final Stroke INSTANCE = new Stroke();

        private Stroke() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd6TVT,CV{=\u0006\u0016Y\u001dQ\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class StrokeLineWidth extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final StrokeLineWidth INSTANCE = new StrokeLineWidth();

        private StrokeLineWidth() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\rd6TVT,8Y}@\u0010g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class StrokeAlpha extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final StrokeAlpha INSTANCE = new StrokeAlpha();

        private StrokeAlpha() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4KT9(kU`L\u0010\u001fic", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TrimPathStart extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TrimPathStart INSTANCE = new TrimPathStart();

        private TrimPathStart() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4KT9(kURF\u0013g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TrimPathEnd extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TrimPathEnd INSTANCE = new TrimPathEnd();

        private TrimPathEnd() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: VectorPainter.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLc\u0003\tI\u00066\u000b4ɘ~8ܥB}\u0017hz9^D\u0014GnWY*Ƃo{B%Ӵ(s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@\re4KT9(kU\\>\u0015 Z\u001d$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\"rl9\u0014r@$", "", "u(E", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TrimPathOffset extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TrimPathOffset INSTANCE = new TrimPathOffset();

        private TrimPathOffset() {
            super(null);
        }
    }
}
