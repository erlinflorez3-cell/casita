package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я9\u001d̉=!,o\bDJd|\u0004G\b8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0ZeP.XS2\u000fy{<řc$\bCCU0}*\tUN\u0010fqbp\u0019H'\u0006Dw\u001b0W[\u0011]@\u0016bF}GKM\u001eD\u007fś\rT\u0013)J(H{\u0015\u0001H1v\u001a\u001fzqV<\u001c>L\t@b\u000f]\u0005H\u00194Hf\u00016~u[NH\u001bkZ5)ɅwQv'\u000e@%S\u001dHd'S\u0006\u0010/[DEG-%\u0002\u0013MR{K\u0011ӊ\n=3g}ݓ}ʁwW>ݙ  #+g\r\fq|؛WŌd\f/˃ooYQ&(&yRȡ\u000fǬ\u0012\u0006/ΞN;(h \u000eawIԢBг\u0006`J\u007f\teِ\u001b8"}, d2 = {"\u000fbc6b5+S$\u0006v\\,", "", "\u000fbc6b5+S)\rz", "\u000fbc6b5.^\u0018z\n^", "!d]A\\5>Z{~v]", "/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EI\u000b\u0016\u0017\u0011X\u0018;v\u00038U\u0002)\u001d|T\u001cMLJo=\u001e\u001cKa5\u0006\"w", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013\\y$@S%l;CDz8'\u0015oD9\u0003bj\u001aL", "/bc6b5\u001f]&f\u0005]0}\r/r\u000e", ">qTC", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "<dgA", "4h[9I,<b#\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "@dbB_;", "CoS.g,.\\'z{^", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9uFu)6]}- w\u0015.-J;s4'$>", "<nS2", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;
    private static final NodeChainKt$SentinelHead$1 SentinelHead;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.node.NodeChainKt$SentinelHead$1] */
    static {
        ?? r1 = new Modifier.Node() { // from class: androidx.compose.ui.node.NodeChainKt$SentinelHead$1
            public String toString() {
                return "<Head>";
            }
        };
        r1.setAggregateChildKindSet$ui_release(-1);
        SentinelHead = r1;
    }

    public static final int actionForModifiers(Modifier.Element element, Modifier.Element element2) {
        if (Intrinsics.areEqual(element, element2)) {
            return 2;
        }
        return Actual_jvmKt.areObjectsOfSameType(element, element2) ? 1 : 0;
    }

    public static final <T extends Modifier.Node> void updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        Intrinsics.checkNotNull(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        modifierNodeElement.update(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MutableVector<Modifier.Element> fillVector(Modifier modifier, MutableVector<Modifier.Element> mutableVector) {
        MutableVector mutableVector2 = new MutableVector(new Modifier[RangesKt.coerceAtLeast(mutableVector.getSize(), 16)], 0);
        mutableVector2.add(modifier);
        AnonymousClass1 anonymousClass1 = null;
        while (mutableVector2.isNotEmpty()) {
            Modifier modifier2 = (Modifier) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner$ui_release());
                mutableVector2.add(combinedModifier.getOuter$ui_release());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                if (anonymousClass1 == null) {
                    anonymousClass1 = new Function1<Modifier.Element, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt.fillVector.1
                        final /* synthetic */ MutableVector<Modifier.Element> $result;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(MutableVector<Modifier.Element> mutableVector3) {
                            super(1);
                            mutableVector = mutableVector3;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(Modifier.Element element) {
                            mutableVector.add(element);
                            return true;
                        }
                    };
                }
                modifier2.all(anonymousClass1);
            }
        }
        return mutableVector3;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeChainKt$fillVector$1 */
    /* JADX INFO: compiled from: NodeChain.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "3kT:X5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2s9\u0005 ?m\u001f=#\u0007\"p0/\u00112h5\u0010eu+\u00011NLJ52"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Modifier.Element, Boolean> {
        final /* synthetic */ MutableVector<Modifier.Element> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableVector<Modifier.Element> mutableVector3) {
            super(1);
            mutableVector = mutableVector3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Modifier.Element element) {
            mutableVector.add(element);
            return true;
        }
    }
}
