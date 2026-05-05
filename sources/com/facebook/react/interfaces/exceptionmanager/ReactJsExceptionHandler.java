package com.facebook.react.interfaces.exceptionmanager;

import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\tl˹ˏ/Z͜x.\u0001Rb\u0010o\u0001:li2q[;\u0004\u001b.&\u0017Qfg\u0016q\u0011~ǈBƤب\u0016|r.Ot'\\ܱ\u00139Րs>"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u0017", "", "@d_<e;#ax\u0012x^7\f\r9n", "", "3qa<e\u0014:^", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\fV\u000fEuV", "\u001e`a@X+\u001e`&\t\b", "\u001e`a@X+\u001e`&\t\bB4\b\u0010", "\u001e`a@X+,b\u0015|\u0001?9x\u0011/I\b3\u0003", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@UnstableReactNativeAPI
public interface ReactJsExceptionHandler {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":0\u007f\u0007|jA0JfP.`\\2\u000fq{<$i0yCAW c8ޛ\u007fN\u0016f'Ij[S\u001d\u0006.x\u0019- Ǩzٕ\u0016\u0013JDuAAP@SGd\r<\u0015\"B\"f\u007f3\u0006pݹJǘz~[M\u0012\u0019>HAJ`\u0016e\u0005H\u001c\\̫\"Ә\"`\u007fP<Qzh\u000b?1\u000f\u0002B|46݅~֔\u0011Jl)\u0013\u0005o-ӡ?ʺߑ\u0015)[\u0005\rq\n>ƊC\u0003ݶ\tg"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\fV\u000fEuV", "", "3wR2c;B]\"by", "", "5dc\u0012k*>^(\u0003\u0005g\u0010{", "u(8", "4qP:X:", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\fV\u000fEu?y%\n3pQOR\u0018GO", "5dc\u0013e(FS'", "u(;7T=:\u001d)\u000e~euc\r=tU", "7r5.g(E", "", "u(I", ";db@T.>", "", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "!sP0^\rKO!~", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface ParsedError {

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":\u001e\u007f\u0007lo?\u0016Z͜x.\u0001Rz\u001fy{L$\n%Hٸ=ڈ\u001e\u0002:\u000bUPuj?Zh\u000f[\u000f4\u001bO̺.֒Y|u\u0014\u00158Pv\u0010C[wU9\u000fu\rӳ\"ݨ&<\u0012\u0007\u0007#8K`\u0007\tMc\f@5\u0017¨<ň\u0011Q\u001d\u001c\u0018\u0011L'Ԯ\u001dձɤN:PncY]\"ɮmNĸ+^"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\fV\u000fEu?y%\n3pQOR\u0018GO", "", "1n[B`5'c!{zk", "", "5dc\u0010b3N[\"g\u000bf)|\u0016", "u(8", "4h[2A(FS", "", "5dc\u0013\\3><\u0015\u0007z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":h]2A<FP\u0019\f", "5dc\u0019\\5><)\u0007w^9", ";dc5b+'O!~", "5dc\u001aX;A]\u0018gvf,", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public interface StackFrame {
            int getColumnNumber();

            String getFileName();

            int getLineNumber();

            String getMethodName();
        }

        int getExceptionId();

        List<StackFrame> getFrames();

        String getMessage();

        boolean isFatal();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u0006\u0013nʑA0RkP\u008cZS8\u0018s{:1c$\u007fّCU ~(ޟUdʴ\u0018nxYKl\u001f\u0010$x\u00032YW\t]@\u0011`C\u007fCAP\b=gd\u0005:\u0013%J\"f\u007f\u0015\u0005(1`\u0010%\u0003ŲO\f 9\t}Hc%S\u0015\u001c\"\u0006l\"/\u001f#ʨO~OzoR/Q\u00070ŰOof>\u0010e\rtZm̠w*%9TO5C-\u001aϏ\b\u001b\u0011M\u0018Wqkݛ\u00193-+Wso<h\u0002$\u0015YQ;^#,b\u0005_c$'YS\u0014QV\u000e6|\u0013{;B4\u0014\f'V5E\u001a\u0015\u0010Tߞs;dNf\u001a^p\b+gD.=\u0002I*g3-жb\u0004 \\P\u0014\u0005;$iѾmibb(x\u0015IX>Ϛ0\"RKMf\n\bCDեrĊ\u00060\f\u0382_\u00025\u0006\u001f9g=E[Q)1m\u0012Hri%\u00067üUׂVNH̎\u0007\u0018=6\u0017\u0019+Vr\f\u0004P\u0003`\u0003ҡOɟX\r\u0006ܱ+\"b~J/u\"\\R\u0001i\u0019Q4ܚ'çj=aʤ\u0004\u0010]HlC̹U~"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\fV\u000fEud\u0014!\u0015\u000b", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\fV\u000fEuV", "4qP:X:", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\u001aX}9na\u0019\u0012\u00165NxM]e", ";db@T.>", "", "3wR2c;B]\"by", "", "7r5.g(E", "", "uKY.i(\bc(\u0003\u0002(\b\n\u0016+yf,\nOV}\u001cC\u0001\n\u0006}!>[G\u000eFz\u001a7O\u0019\u001f`w\u000f", "5dc\u0012k*>^(\u0003\u0005g\u0010{", "u(8", "5dc\u0013e(FS'", "u(;7T=:\u001d)\u000e~euX\u0016<a\u0014\u000f\u007fN\u0010l", "u(I", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "BnBAe0GU", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class ParsedErrorImpl implements ParsedError {
        private final int exceptionId;
        private final ArrayList<ParsedStackFrameImpl> frames;
        private final boolean isFatal;
        private final String message;

        public ParsedErrorImpl(ArrayList<ParsedStackFrameImpl> frames, String message, int i2, boolean z2) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(message, "message");
            this.frames = frames;
            this.message = message;
            this.exceptionId = i2;
            this.isFatal = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParsedErrorImpl copy$default(ParsedErrorImpl parsedErrorImpl, ArrayList arrayList, String str, int i2, boolean z2, int i3, Object obj) {
            if ((i3 + 1) - (1 | i3) != 0) {
                arrayList = parsedErrorImpl.frames;
            }
            if ((2 & i3) != 0) {
                str = parsedErrorImpl.message;
            }
            if ((4 & i3) != 0) {
                i2 = parsedErrorImpl.exceptionId;
            }
            if ((i3 & 8) != 0) {
                z2 = parsedErrorImpl.isFatal;
            }
            return parsedErrorImpl.copy(arrayList, str, i2, z2);
        }

        public final ArrayList<ParsedStackFrameImpl> component1() {
            return this.frames;
        }

        public final String component2() {
            return this.message;
        }

        public final int component3() {
            return this.exceptionId;
        }

        public final boolean component4() {
            return this.isFatal;
        }

        public final ParsedErrorImpl copy(ArrayList<ParsedStackFrameImpl> frames, String message, int i2, boolean z2) {
            Intrinsics.checkNotNullParameter(frames, "frames");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ParsedErrorImpl(frames, message, i2, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsedErrorImpl)) {
                return false;
            }
            ParsedErrorImpl parsedErrorImpl = (ParsedErrorImpl) obj;
            return Intrinsics.areEqual(this.frames, parsedErrorImpl.frames) && Intrinsics.areEqual(this.message, parsedErrorImpl.message) && this.exceptionId == parsedErrorImpl.exceptionId && this.isFatal == parsedErrorImpl.isFatal;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public int getExceptionId() {
            return this.exceptionId;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public ArrayList<ParsedStackFrameImpl> getFrames() {
            return this.frames;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (((((this.frames.hashCode() * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.exceptionId)) * 31) + Boolean.hashCode(this.isFatal);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public boolean isFatal() {
            return this.isFatal;
        }

        public String toString() {
            return "ParsedErrorImpl(frames=" + this.frames + ", message=" + this.message + ", exceptionId=" + this.exceptionId + ", isFatal=" + this.isFatal + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4B\u0007\":\u0018\u007f\u0007lvA0RnP\u008cZS8şs{:%aҙwYП\u0006\u001a,!Ir^kunbZ9D\u001f\n$z\u0003,wV\ta \u0012JB\u001eCCQ}BQ`#:ӯ$20>B\f\u000f'BH>wAƖLT\u0019>N\t:\u0001\u000e\u0014ů\u001bZ\rL/\u0019\u001e\u000bk\u0015ɫI5dH?;\u0003\u0018F\u0015В`x,[\u001e^TU˙'g$+N7M\u0015ST3\rX[M\u0005Wqk\u0006\u0019--+Wvo6\u0007\u0004D\u001b1O\u001bb\u000b&\u000b\t\u0018ԧ\u000bo<]ucP<;(\u0001\n!T\u0006$\u0005U]tǽ\u001b/\u000f\u001cI\rr\u0002D\u0017ٳ]\u000b\u0007\txN\u0017S\u0001yۖ8kx_fS\u0019|;R˳\u000f̷'\u0007vďsV\u0014g##%\n_1i@kI%˺[ǀq\nxç\u001a,\n9U\n\u007f\u000e\u001f1/%e_\u0010ؑ#Ƞ\u0006NLϙ\u000f\u0007fsaq#ZN$\u0007\u0016e+_Ɉ\\ֈh\u000bs¬lZ2\u001d[&Ϊ\u000b\u0016"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\u001aX}9na\u0019\u0012\u00165NxM]e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7ED\n&\u0017Tp\n:v3~Y\u0011\u001e7x%2WLCg=\u001a\u0017hn\u0003sc(L\u0006\fU,a*\\]\u0002A\u001e\u001b=\nW*\u0014\u0005f\u007f\u000fjQE\u001f\u0007\fV\u000fEu?y%\n3pQOR\u0018GO", "4h[2A(FS", "", ";dc5b+'O!~", ":h]2A<FP\u0019\f", "", "1n[B`5'c!{zk", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u00121\u0007,", "5dc\u0010b3N[\"g\u000bf)|\u0016", "u(8", "5dc\u0013\\3><\u0015\u0007z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0019\\5><)\u0007w^9", "5dc\u001aX;A]\u0018gvf,", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class ParsedStackFrameImpl implements ParsedError.StackFrame {
        private final int columnNumber;
        private final String fileName;
        private final int lineNumber;
        private final String methodName;

        public ParsedStackFrameImpl(String fileName, String methodName, int i2, int i3) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            this.fileName = fileName;
            this.methodName = methodName;
            this.lineNumber = i2;
            this.columnNumber = i3;
        }

        public static /* synthetic */ ParsedStackFrameImpl copy$default(ParsedStackFrameImpl parsedStackFrameImpl, String str, String str2, int i2, int i3, int i4, Object obj) {
            if ((1 & i4) != 0) {
                str = parsedStackFrameImpl.fileName;
            }
            if ((i4 + 2) - (2 | i4) != 0) {
                str2 = parsedStackFrameImpl.methodName;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                i2 = parsedStackFrameImpl.lineNumber;
            }
            if ((i4 & 8) != 0) {
                i3 = parsedStackFrameImpl.columnNumber;
            }
            return parsedStackFrameImpl.copy(str, str2, i2, i3);
        }

        public final String component1() {
            return this.fileName;
        }

        public final String component2() {
            return this.methodName;
        }

        public final int component3() {
            return this.lineNumber;
        }

        public final int component4() {
            return this.columnNumber;
        }

        public final ParsedStackFrameImpl copy(String fileName, String methodName, int i2, int i3) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            return new ParsedStackFrameImpl(fileName, methodName, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsedStackFrameImpl)) {
                return false;
            }
            ParsedStackFrameImpl parsedStackFrameImpl = (ParsedStackFrameImpl) obj;
            return Intrinsics.areEqual(this.fileName, parsedStackFrameImpl.fileName) && Intrinsics.areEqual(this.methodName, parsedStackFrameImpl.methodName) && this.lineNumber == parsedStackFrameImpl.lineNumber && this.columnNumber == parsedStackFrameImpl.columnNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public int getColumnNumber() {
            return this.columnNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public String getFileName() {
            return this.fileName;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public int getLineNumber() {
            return this.lineNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        public String getMethodName() {
            return this.methodName;
        }

        public int hashCode() {
            return (((((this.fileName.hashCode() * 31) + this.methodName.hashCode()) * 31) + Integer.hashCode(this.lineNumber)) * 31) + Integer.hashCode(this.columnNumber);
        }

        public String toString() {
            return "ParsedStackFrameImpl(fileName=" + this.fileName + ", methodName=" + this.methodName + ", lineNumber=" + this.lineNumber + ", columnNumber=" + this.columnNumber + ")";
        }
    }

    void reportJsException(ParsedError parsedError);
}
