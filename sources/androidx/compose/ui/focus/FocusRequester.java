package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: FocusRequester.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjG9LeN.ZS@\u000fs{J$c$wGCU(}*\tUPml\u0005Ϻx s\u000f4\u00151iA\nXޯa\u0012\u001d2\u000bsM9eok@)\u0010D\r82P?*\u0015\u000f#BT x\u000bCy\u0017\"2PphY;WK܉\u0018N].\r6\\\u0016UfXzfR;3\u0005yB|2o2\rM;M\u00031SǸҐ\"+FD} 3a\u001b\u0007\u0001b\u0006šӭu=\u000bwo+9Y\fWd_H\u0018#<g\r\f\u0005nb\u0013dx\fU2\u0016h\u0014V\u001c<\u0010z*\u0014\u0003\t^\u001e5IF3*h\u0018\u000eaw!U\u0017Б\u0004ެF\u0006\u0003ʨN\u0019+\u0004A0ݶ\u001f|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "", "u(E", "4nRBf\u0019>_)~\tm,\nq9d\u007f6", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHS>\u001d\u0019ie9\u0014L6Mv|", "5dc\u0013b*Na\u0006~\u0007n,\u000b\u0018/rh2z@\u000fU'Ki\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006t/<`}\u001eFq 7\u0017+Kz0\u001b\u001chR9\u0005r6[L", "1`_Ah9>4#|\u000bl", "", "4h]196<c'mvk.|\u0018", "=m5<h5=", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "4h]196<c'mvk.|\u0018\u0018o~(", "4h]196<c'mvk.|\u0018\u0018o~(:P\u0005\u0011$Gv\u000e8\u0005%", "4nRBf", "4nRBfjNW\u0013\fze,x\u0017/", "4qT296<c'", "@d`BX:M4#|\u000bl", "", "@dbAb9>4#|\u000bl,{f2i\u0007'", "A`e296<c'~y</\u0001\u0010.", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusRequester {
    public static final int $stable = 0;
    private final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);
    public static final Companion Companion = new Companion(null);
    private static final FocusRequester Default = new FocusRequester();
    private static final FocusRequester Cancel = new FocusRequester();

    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        focus$ui_release();
    }

    public final boolean focus$ui_release() {
        return findFocusTargetNode$ui_release(new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusRequester$focus$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetNode));
            }
        });
    }

    public final boolean captureFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i2 = 0;
            while (!FocusRequesterModifierNodeKt.captureFocus(content[i2])) {
                i2++;
                if (i2 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean freeFocus() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i2 = 0;
            while (!FocusRequesterModifierNodeKt.freeFocus(content[i2])) {
                i2++;
                if (i2 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean saveFocusedChild() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i2 = 0;
            while (!FocusRequesterModifierNodeKt.saveFocusedChild(content[i2])) {
                i2++;
                if (i2 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean restoreFocusedChild() {
        if (!this.focusRequesterNodes.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        FocusRequesterModifierNode[] content = mutableVector.getContent();
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = FocusRequesterModifierNodeKt.restoreFocusedChild(content[i2]) || z2;
            i2++;
        } while (i2 < size);
        return z2;
    }

    /* JADX INFO: compiled from: FocusRequester.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005&4\u0012\u000e\u0007nj?0JͣIDɟ\u0004*=j43.\u001c)wCтY\u001a\f\"QS\\o\u007fnxc[]\u001d\u0007.x\u0019.\u007f\u001bOغ\u0014Ƥ6NwЀCOu@G`\r8\u000b$@'\t\t\u0013\u00072*v\u0012ͯ~ISÈ*2FwHWұQ\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CH*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0011`]0X3", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "5dc\u0010T5<S =vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0010T5<S ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.$m\">MQJkAs", "\u0012dU.h3M", "5dc\u0011X-:c \u000e", "1qT.g,+S\u001a\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CH*\u0012(\u001ds]B\u000bm5\rW1E\\\\\u0019\\^\u0003=\"!Z\u001b/'\u000b\u0014cN8D", "\u0014nRBf\u0019>_)~\tm,\ni+c\u000f2\tT", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCancel$annotations() {
        }

        private Companion() {
        }

        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }

        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        /* JADX INFO: compiled from: FocusRequester.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u000502¡w\u001d߿\u001b9^C&M4Rޚ.\u000fy{|+i%\nCiW`ԉ\"QV\\j\u007fnx\\QÃ\u000fN\u001d\u0007nDI\u0004z$\u070f\u000fzI}DKM\u001e?\u007fŢt~\f.8:8(\u0007Gɤ*\u0011\u0017\u0005\u0002[K:\u0014vϒp\u0003Y\u001bU\u001d\u001a@\b\u0005į\u0001fcuWNH\u001b_\u0001ǉ#KpPX?_^~\u0014μF\u001d.\u001b\u0002y\u001eYB}ߕ\u0015mZ\u0011\u0013j[m\u0005\u0006у=Mo54CI\"Y|ݠ\u007f\\\u001c9]%]!(#ӫQ)\u00135:gcyRTߑwC\u0003\u001bL\u001c\u000e4)\u000f͚-bm\u0016\u001fKt!U\u0007З\u0002\u07b2F\u0012"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CH*\u0012(\u001ds]B\u000bm5\rW1E\\\\\u0019\\^\u0003=\"!Z\u001b/'\u000b\u0014cN8D", "", "u(E", "1n\\=b5>\\(J", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(JI", "1n\\=b5>\\(JJ", "1n\\=b5>\\(JK", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            public final FocusRequester component1() {
                return new FocusRequester();
            }

            public final FocusRequester component2() {
                return new FocusRequester();
            }

            public final FocusRequester component3() {
                return new FocusRequester();
            }

            public final FocusRequester component4() {
                return new FocusRequester();
            }

            public final FocusRequester component5() {
                return new FocusRequester();
            }

            public final FocusRequester component6() {
                return new FocusRequester();
            }

            public final FocusRequester component7() {
                return new FocusRequester();
            }

            public final FocusRequester component8() {
                return new FocusRequester();
            }

            public final FocusRequester component9() {
                return new FocusRequester();
            }

            public final FocusRequester component10() {
                return new FocusRequester();
            }

            public final FocusRequester component11() {
                return new FocusRequester();
            }

            public final FocusRequester component12() {
                return new FocusRequester();
            }

            public final FocusRequester component13() {
                return new FocusRequester();
            }

            public final FocusRequester component14() {
                return new FocusRequester();
            }

            public final FocusRequester component15() {
                return new FocusRequester();
            }

            public final FocusRequester component16() {
                return new FocusRequester();
            }
        }

        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0058, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean findFocusTarget(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r16) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequester.findFocusTarget(kotlin.jvm.functions.Function1):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0058, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean findFocusTargetNode$ui_release(kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r16) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRequester.findFocusTargetNode$ui_release(kotlin.jvm.functions.Function1):boolean");
    }
}
