package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$q$yCAU\"}8\tWN}gvJp\u000bKƤ\u000e\u0016\u0007j4I[xe\u0012%2JģG3[tE9fw>\u000562*\u0600\u007fڎ\u0017ɝZH>u;t[\u0010 0XphS\u001dQ\u0013\u001c*\u0006l#\u0011\"jkf6vqm>=)\u001bipU7i>\u0005e\u0013VV7\r%kL4Ë;5#0\u001c+\u0015bs?1P\"A\u0013z?'YW$[Dk\u0018\u0014C?\u007f\u0011k\b>\\3g' ̥*ՒӍOR\u0014?\u0006\u0013D\u0013J\u001d&\u0006UYtAbt\u0016(Kt!dpT\u0010pZ\u007f)o|+m\nAFQ\u001b\u0015b\n;Gj}\u0010U%,/\u0019z1]d\u000e\u000f#+V\bQ_`nJ\u001fݓ\fՒAm\f͏ê\u0002/\f3MīK*\u0010ѭ\u001bB"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i\u0015w\u001e6WL(o?)\u001chJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC$u3\u001ej", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "0nd;W,=", "", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "@h_=_,\u001aZ$\u0002v", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(g\u001ez\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2\u0003\u0019\u0012\u00198nnP mQ\u0001\u001f\u0003,6rEi]yT\u0017,h4s\u0013c&&?K,]r)$f_2\u0014\u0005aZSb\u0003evK#\u0004\u0003y%seULs^\u0006y8'\u0015\u007f\u0001!2e}'{vb4+2t\fZE\"Gl\b\"<ZP13\u001e8 EKpK0/", "@h_=_,L", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017t8&\u0011weC\u00109", "/cS\u001f\\7IZ\u0019", "", "7mc2e(<b\u001d\t\u0004", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "B`a4X;+O\u0018\u0003\u000bl", "", "/cS\u001f\\7IZ\u0019FF+\u001a]\\\u000eM", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u001f+\u0015vo\u001d\u0010r,[r%VPX5\u001b=\u007f=\" 0r/n}", "=m32g(<V", "@d\\<i,+W$\n\u0002^", "2qPDE0I^ ~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 8;
    private final MutableScatterMap<PressInteraction.Press, RippleAnimation> ripples;

    public /* synthetic */ CommonRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z2, f2, colorProducer, function0);
    }

    private CommonRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        super(interactionSource, z2, f2, colorProducer, function0, null);
        this.ripples = new MutableScatterMap<>(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    @Override // androidx.compose.material.ripple.RippleNode
    /* JADX INFO: renamed from: addRipple-12SF9DM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1751addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction.Press r19, long r20, float r22) {
        /*
            r18 = this;
            r4 = r18
            androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction$Press, androidx.compose.material.ripple.RippleAnimation> r0 = r4.ripples
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r11 = r0.keys
            java.lang.Object[] r10 = r0.values
            long[] r9 = r0.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L5a
            r17 = 0
            r7 = r17
        L15:
            r2 = r9[r7]
            long r0 = ~r2
            r5 = 7
            long r0 = r0 << r5
            long r0 = r0 & r2
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r0 + r12
            long r0 = r0 | r12
            long r5 = r5 - r0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r6 = 8 - r0
            r5 = r17
        L33:
            if (r5 >= r6) goto L53
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L4f
            int r0 = r7 << 3
            int r0 = r0 + r5
            r1 = r11[r0]
            r0 = r10[r0]
            androidx.compose.material.ripple.RippleAnimation r0 = (androidx.compose.material.ripple.RippleAnimation) r0
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
            r0.finish()
        L4f:
            long r2 = r2 >> r12
            int r5 = r5 + 1
            goto L33
        L53:
            if (r6 != r12) goto L5a
        L55:
            if (r7 == r8) goto L5a
            int r7 = r7 + 1
            goto L15
        L5a:
            boolean r0 = r18.getBounded()
            r3 = 0
            r6 = r19
            if (r0 == 0) goto L93
            long r0 = r6.m865getPressPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m3926boximpl(r0)
        L6b:
            androidx.compose.material.ripple.RippleAnimation r1 = new androidx.compose.material.ripple.RippleAnimation
            boolean r0 = r18.getBounded()
            r5 = r22
            r1.<init>(r2, r5, r0, r3)
            androidx.collection.MutableScatterMap<androidx.compose.foundation.interaction.PressInteraction$Press, androidx.compose.material.ripple.RippleAnimation> r0 = r4.ripples
            r0.set(r6, r1)
            kotlinx.coroutines.CoroutineScope r5 = r18.getCoroutineScope()
            androidx.compose.material.ripple.CommonRippleNode$addRipple$2 r8 = new androidx.compose.material.ripple.CommonRippleNode$addRipple$2
            r8.<init>(r1, r4, r6, r3)
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.node.DrawModifierNode r4 = (androidx.compose.ui.node.DrawModifierNode) r4
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r4)
            return
        L93:
            r2 = r3
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.CommonRippleNode.mo1751addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction$Press, long, float):void");
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        float f2;
        float pressedAlpha = getRippleAlpha().invoke().getPressedAlpha();
        if (pressedAlpha != 0.0f) {
            MutableScatterMap<PressInteraction.Press, RippleAnimation> mutableScatterMap = this.ripples;
            Object[] objArr = mutableScatterMap.keys;
            Object[] objArr2 = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                long j3 = (~j2) << 7;
                if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j2 & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            f2 = pressedAlpha;
                            ((RippleAnimation) objArr2[i5]).m1755draw4WTKRHQ(drawScope, Color.m4177copywmQWz5c$default(m1764getRippleColor0d7_KjU(), pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
                        } else {
                            f2 = pressedAlpha;
                        }
                        j2 >>= 8;
                        i4++;
                        pressedAlpha = f2;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.ripples.clear();
    }
}
