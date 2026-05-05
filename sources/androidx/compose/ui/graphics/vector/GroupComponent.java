package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLcz\u0004I\u0006>*6Ȑ\u0007\"B\u0012\u007fјnjGNLe^.ZS0\u0013s{J$c$wCCU0}*\t]NogtMb\u000bQ\u0018\u000e\u0016~l4Ic\u0005e\u0012\u00156JoM9UoC9htD\n(2(G\u0002\u0005\u0017\u001a2H\u0016\b\u0003Ca\f\u001a0F}BR#M\r܅\u0018ßTĨ1\u001e\u000bf\u000f9Ղp]H/k\u0017w\nf'\u000eB-Q\u001b\u000fl';\u001b\u0012\"9\nO5C$\u001c\t\u0015\u001ds?1Q8=Mx5rCI\"if^\u000e`--e\f\f@l\\MinZ?+}u{T\u001cw\u0010z*F\u0003\u0004ٳ\u0005Ωρ2/ 7\u0016_{\u0003\u0001&XP0pr\u0004\t5N\u0017S~y+\u00027t&y;G`g\u007f\u0013b6#/\u0013Q_bdx\u0015Ix(U?)X=vrRmKF\u001cp\u0011\u0014Z\b>\u0010\u0018/*5^\u001b3\u000fs9QE4\bV\u001e\u007fv3}/g2XV\u001b:nDIp\tT`R@\u001dk~f\u001f,YW*1\u001f}6%H\\&\u001ag9``]i\u0002p]_\u001a%]ee[E\u008b\u0010Ć=^;̐\"q\u001edjx*>jf[֝r͞W\fb٢xP@P\u0003\u0016\b}TN:\u001a`E\"&B1I\u001fl\u0017X\u0003LIo\u0003G$1ӗ\u001cњX?,Ѱ\u0002&z\u0012\u000fZ|rur\u0007U|\u0013n/ECg4G4,ȫtڍ{Ƚʍ}rõKiTGZ{f\u001cc\f8$*;a/k\u0012\u001f\u0001920?[K!v(˸\u001eؠ~\t\u0002ҸSj4z\u0016~\u0011.f\u007fXe%#0\u000evrQ ;у\u0006ӶJzOϊ%\u0017iWar1q\u0013ҁD٫\t\u001f&ݒQ\f0\u0018M-q?M\u001a\u0006.G\u0015\u0010u(0\u0005ӧnϪ*zmֽDe\u001c\u000bpm.TIVaY-[R(z\bZH\u0019\u0015F\u0007_Ͱ\u0019άLMlݥn:S*=\u001e\u0007\t2.~x,I!\u0013\u00164\\\u0004`8ʸ\u0002\u0018vE+6[y8\u0010{st\u000bx6:\u000f\n6\u0007\u0012Jd^\u001b.ŉ\u0015ޘ\n\u007f ܽY=h.J3D62g\u00167\u0014vw3(z.m\u0010\u0013%7Zsi}L\u0019Oֻb߃\tlMǷ9,\u0007-\u001d]>z;`\u0013\u001a\u0017v=\u0014J\u0001\u0002D9\u001fxT\u0017fSR\u0003\u0019\u0010А4\u0092\u0005\u0017M؏[K\bg\u0012qIoq\"\u001adh\u001f+u0\u001bgxAc\u00055v\u000b\u0004\f\r)MԪrŽR.1ͦ\u0013~\u0014p\u00189+\u001bU(}\u000f}n\\.OCH(GH7\f$|\u0012mYq\\ם9ִMv\u001c՝\u0014YYr\f2@\"-<\u0003M-{\u001c!\"]IsFu$|\u001a\tA\n^D\u0005\u0604\u0001ԓ\tڔų5Nױ7\n\u001b^g)\u0010#Fb9)VdY'\u0011\n\u0012\u0014\u0014rc\u0010\u001bf_}83\u0004ǧ)Է+Y6߾p\\@PaJx\u0013\u0006T#RoX\u0016$A\u0010}\u000b\u0019tyTs\rYV*n8ɼ<ݟ\"\n'ݗ\u000e\u00060\u00176?[XS\u0002r5-~P\u001c&^\u0019@\u001b5bÌ\u0016μ\u0003Lv\u0013\u0019yT\u000fn|=}1+k\u000fW`5\u0003UK6!_dm,\u000eֻ\rÃ,v\u0019ܛ̏b}\b-H֞\u000f.f4-Lsٝ\u001e\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0010ZMKv\u0012(\u001dskB\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001f6M:k\n", "u(E", "1gX9W9>\\", "", "1kX=C(MV", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "D`[BX", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "1kX=C(MVwz\nZ", "5dc\u0010_0I>\u0015\u000e}=(\f\u0005", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u0010_0I>\u0015\u000e}=(\f\u0005", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5q^Bc\u0014:b&\u0003\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", ")E", "7me._0=O(~ab:\f\t8e\r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u0016a=:Z\u001d}vm,c\r=t\u007f1{M?'\u001bA|\u000eCv!CY", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u0016a=:Z\u001d}vm,c\r=t\u007f1{M?'\u001bA|\u000eCv!CY", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "7r29\\7)O(\u0002Yb9\f\u001d", "", "7r<.g9Bfw\u0003\bm@", "\nrTA \u0006\u0017", "7rC6a;:P ~", "u(I", "", "<`\\2", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001bT4>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "<t\\\u0010[0ER&~\u0004", "", "5dc\u001bh4\u001cV\u001d\u0006yk,\u0006", "u(8", "", ">he<g\u001f", "5dc\u001d\\=Hb\f", "u(5", "Adc\u001d\\=Hb\f", "uE\u0018#", ">he<g ", "5dc\u001d\\=Hb\r", "Adc\u001d\\=Hb\r", "@nc.g0H\\", "5dc\u001fb;:b\u001d\t\u0004", "Adc\u001fb;:b\u001d\t\u0004", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bh]A66E]&", "5dc!\\5M1#\u0006\u0005ksG\b\u0001_e-k", "u(9", "\u0018", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "Eh[963B^\u0004z\na", "5dc$\\3E1 \u0003\u0006I(\f\f", "EqP=c,=:\u001d\r\n^5|\u0016", "7mb2e;\u001ab", "7mS2k", "7mbAT5<S", ";`a8A6MB\u001d\b\nZ)\u0004\t", ";`a8G0Gby\t\b;9\r\u00172", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", ";`a8G0Gby\t\b<6\u0004\u0013<", "1n[<e", ";`a8G0Gby\t\b<6\u0004\u0013<-R\"N\f\b\u001er", "uI\u0018#", ";`a8G0Gby\t\bO\u0015\u0007\b/", "<nS2", ";ne2", "4q^:", "Bn", "1nd;g", "@d\\<i,", "BnBAe0GU", "CoS.g,\u001cZ\u001d\neZ;\u007f", "CoS.g,&O(\f~q", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GroupComponent extends VNode {
    public static final int $stable = 8;
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private Function1<? super VNode, Unit> invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;
    private final Function1<VNode, Unit> wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m4214getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new Function1<VNode, Unit>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VNode vNode) {
                invoke2(vNode);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(VNode vNode) {
                this.this$0.markTintForVNode(vNode);
                Function1<VNode, Unit> invalidateListener$ui_release = this.this$0.getInvalidateListener$ui_release();
                if (invalidateListener$ui_release != null) {
                    invalidateListener$ui_release.invoke(vNode);
                }
            }
        };
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    /* JADX INFO: renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m4864getTintColor0d7_KjU() {
        return this.tintColor;
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                m4863markTintForColor8_81llA(((SolidColor) brush).m4513getValue0d7_KjU());
            } else {
                markNotTintable();
            }
        }
    }

    /* JADX INFO: renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m4863markTintForColor8_81llA(long j2) {
        if (this.isTintable && j2 != 16) {
            long j3 = this.tintColor;
            if (j3 == 16) {
                this.tintColor = j2;
            } else if (!VectorKt.m4886rgbEqualOWjLjI(j3, j2)) {
                markNotTintable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode vNode) {
        if (vNode instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) vNode;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (vNode instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) vNode;
            if (groupComponent.isTintable && this.isTintable) {
                m4863markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m4214getUnspecified0d7_KjU();
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public Function1<VNode, Unit> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(Function1<? super VNode, Unit> function1) {
        this.invalidateListener = function1;
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path Path = this.clipPath;
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
                this.clipPath = Path;
            }
            PathParserKt.toPath(this.clipPathData, Path);
        }
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final void setRotation(float f2) {
        this.rotation = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final void setPivotX(float f2) {
        this.pivotX = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final void setPivotY(float f2) {
        this.pivotY = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(float f2) {
        this.scaleX = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(float f2) {
        this.scaleY = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final void setTranslationX(float f2) {
        this.translationX = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void setTranslationY(float f2) {
        this.translationY = f2;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    private final void updateMatrix() {
        float[] fArrM4409constructorimpl$default = this.groupMatrix;
        if (fArrM4409constructorimpl$default == null) {
            fArrM4409constructorimpl$default = Matrix.m4409constructorimpl$default(null, 1, null);
            this.groupMatrix = fArrM4409constructorimpl$default;
        } else {
            Matrix.m4418resetimpl(fArrM4409constructorimpl$default);
        }
        Matrix.m4429translateimpl$default(fArrM4409constructorimpl$default, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m4421rotateZimpl(fArrM4409constructorimpl$default, this.rotation);
        Matrix.m4422scaleimpl(fArrM4409constructorimpl$default, this.scaleX, this.scaleY, 1.0f);
        Matrix.m4429translateimpl$default(fArrM4409constructorimpl$default, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    public final void insertAt(int i2, VNode vNode) {
        if (i2 < getNumChildren()) {
            this.children.set(i2, vNode);
        } else {
            this.children.add(vNode);
        }
        markTintForVNode(vNode);
        vNode.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
    }

    public final void move(int i2, int i3, int i4) {
        int i5 = 0;
        if (i2 > i3) {
            while (i5 < i4) {
                VNode vNode = this.children.get(i2);
                this.children.remove(i2);
                this.children.add(i3, vNode);
                i3++;
                i5++;
            }
        } else {
            while (i5 < i4) {
                VNode vNode2 = this.children.get(i2);
                this.children.remove(i2);
                this.children.add(i3 - 1, vNode2);
                i5++;
            }
        }
        invalidate();
    }

    public final void remove(int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 < this.children.size()) {
                this.children.get(i2).setInvalidateListener$ui_release(null);
                this.children.remove(i2);
            }
        }
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.mo4663transform58bKbWc((fArr != null ? Matrix.m4407boximpl(fArr) : null).m4430unboximpl());
            }
            Path path = this.clipPath;
            if (getWillClipPath() && path != null) {
                DrawTransform.m4790clipPathmtrdDE$default(transform, path, 0, 2, null);
            }
            List<VNode> list = this.children;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).draw(drawScope);
            }
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
        }
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder("VGroup: ").append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sbAppend.append("\t").append(list.get(i2).toString()).append("\n");
        }
        return sbAppend.toString();
    }
}
