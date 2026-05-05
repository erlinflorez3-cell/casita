package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.IntervalTree;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: PathHitTester.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":$\u007fјnjO0Le^.Zݷ2\u000f\u0002{<$a$yCIZ\"Ԃ*\t]Wo˧vJp\u000bK\u000f\f\u0017\u0001j:I]ތs܈?2pn\u007f6ޜs=G`=O\u0013-J\"f\b5\u0005(9`\u0010%\u000b\nž\fݮ/ϋ¤>T\u0013^\u0013,Z\u001cL3\u0019\u001e\u000b{~:Vtu:],3oHO5jH|{\u0019\u0017`5\u000e\u000faL-\u0017ʽAչ)S\u000bޗ#gM\u0006Wqk\t?Ѫ)ȅMs_̬)\u0012\"\u001aCU\u001d_\u0003&\u000b\f\u007ffbʯ-յgKXʫx\u0004\t\u0004%<2\u0017\\άTͶ1\u001anڜ^?\u0003|k@~\u00065ې\u0002ѐe6\u001fӛP?9D3f\u007fm\u0012ύZѼ\u007f\u0005\u0015̔Ń\u0001s)^Z\u05f7|C\u001aǁ{f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u001aq%\u001dMQJkAs", "", "u(E", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "1taCX:", "", "7mc2e=:Z'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019b\r D~\u00125<P;k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#%m\u00186MLJA", ">`c5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "@n^Af", "Bn[2e(GQ\u0019", "", "1n]AT0Ga", "", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1n]AT0Ga`\u0005B-3hS\u0017", "uI\u0018'", "CoS.g,)O(\u0002", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathHitTester {
    private Path path = PathHitTesterKt.EmptyPath;
    private float tolerance = 0.5f;
    private Rect bounds = Rect.Companion.getZero();
    private final IntervalTree<PathSegment> intervals = new IntervalTree<>();
    private final float[] curves = new float[20];
    private final float[] roots = new float[2];

    /* JADX INFO: compiled from: PathHitTester.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void updatePath$default(PathHitTester pathHitTester, Path path, float f2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            f2 = 0.5f;
        }
        pathHitTester.updatePath(path, f2);
    }

    public final void updatePath(Path path, float f2) {
        this.path = path;
        this.tolerance = f2;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator it = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, f2);
        while (it.hasNext()) {
            PathSegment next = it.next();
            int i2 = WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                long jComputeVerticalBounds$default = BezierKt.computeVerticalBounds$default(next, this.curves, 0, 4, null);
                this.intervals.addInterval(Float.intBitsToFloat((int) (jComputeVerticalBounds$default >> 32)), Float.intBitsToFloat((int) (jComputeVerticalBounds$default & 4294967295L)), next);
            } else if (i2 == 4) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m4462containsk4lQ0M(long j2) {
        int i2;
        int iLineWinding;
        if (!this.path.isEmpty() && this.bounds.m3963containsk4lQ0M(j2)) {
            float fM3937getXimpl = Offset.m3937getXimpl(j2);
            float fM3938getYimpl = Offset.m3938getYimpl(j2);
            float[] fArr = this.curves;
            float[] fArr2 = this.roots;
            IntervalTree<PathSegment> intervalTree = this.intervals;
            if (((IntervalTree) intervalTree).root != ((IntervalTree) intervalTree).terminator) {
                ArrayList arrayList = ((IntervalTree) intervalTree).stack;
                arrayList.add(((IntervalTree) intervalTree).root);
                i2 = 0;
                while (arrayList.size() > 0) {
                    IntervalTree.Node node = (IntervalTree.Node) CollectionsKt.removeLast(arrayList);
                    if (node.overlaps(fM3938getYimpl, fM3938getYimpl)) {
                        T data = node.getData();
                        Intrinsics.checkNotNull(data);
                        PathSegment pathSegment = (PathSegment) data;
                        float[] points = pathSegment.getPoints();
                        int i3 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
                        if (i3 == 1) {
                            iLineWinding = BezierKt.lineWinding(points, fM3937getXimpl, fM3938getYimpl);
                        } else if (i3 == 2) {
                            iLineWinding = BezierKt.quadraticWinding(points, fM3937getXimpl, fM3938getYimpl, fArr, fArr2);
                        } else if (i3 == 3) {
                            iLineWinding = BezierKt.cubicWinding(points, fM3937getXimpl, fM3938getYimpl, fArr, fArr2);
                        }
                        i2 += iLineWinding;
                    }
                    if (node.getLeft() != ((IntervalTree) intervalTree).terminator && node.getLeft().getMax() >= fM3938getYimpl) {
                        arrayList.add(node.getLeft());
                    }
                    if (node.getRight() != ((IntervalTree) intervalTree).terminator && node.getRight().getMin() <= fM3938getYimpl) {
                        arrayList.add(node.getRight());
                    }
                }
                arrayList.clear();
            } else {
                i2 = 0;
            }
            if (PathFillType.m4456equalsimpl0(this.path.mo4069getFillTypeRgk1Os(), PathFillType.Companion.m4460getEvenOddRgk1Os())) {
                i2 = (i2 + 1) - (i2 | 1);
            }
            if (i2 != 0) {
                return true;
            }
        }
        return false;
    }
}
