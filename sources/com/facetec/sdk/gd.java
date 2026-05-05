package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.fo;
import com.facetec.sdk.fr;
import com.facetec.sdk.fy;
import com.facetec.sdk.gh;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class gd implements fo {
    private cf.I I;

    /* JADX INFO: renamed from: com.facetec.sdk.gd$2 */
    final class AnonymousClass2 implements cf.I {
        private /* synthetic */ cf.I Code;
        private boolean V;

        AnonymousClass2(cf.I i2) {
            i = i2;
        }

        @Override // com.facetec.sdk.cf.I
        public final im S() {
            return i.S();
        }

        @Override // com.facetec.sdk.cf.I
        public final long V(ie ieVar, long j2) throws IOException {
            try {
                long jV = i.V(ieVar, j2);
                if (jV != -1) {
                    ieVar.Code(i.L(), ieVar.h() - jV, jV);
                    i.C();
                    return jV;
                }
                if (!this.V) {
                    this.V = true;
                    i.close();
                }
                return -1L;
            } catch (IOException e2) {
                if (!this.V) {
                    this.V = true;
                }
                throw e2;
            }
        }

        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public final void close() throws IOException {
            if (!this.V && !gg.B(this, TimeUnit.MILLISECONDS)) {
                this.V = true;
            }
            i.close();
        }
    }

    public gd(cf.I i2) {
        this.I = i2;
    }

    private static boolean B(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static fy I(fy fyVar) {
        return (fyVar == null || fyVar.D() == null) ? fyVar : fyVar.F().B((ga) null).V();
    }

    private static boolean V(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    @Override // com.facetec.sdk.fo
    public final fy V(fo.Code code) throws IOException {
        fy fyVarV;
        cf.I I;
        cf.I i2 = this.I;
        if (i2 != null) {
            code.I();
            fyVarV = i2.V();
        } else {
            fyVarV = null;
        }
        gh ghVarZ = new gh.I(System.currentTimeMillis(), code.I(), fyVarV).Z();
        fv fvVar = ghVarZ.Z;
        fy fyVar = ghVarZ.Code;
        if (fyVarV != null && fyVar == null) {
            gg.B(fyVarV.D());
        }
        if (fvVar == null && fyVar == null) {
            return new fy.B().Code(code.I()).Z(fx.HTTP_1_1).I(504).Z("Unsatisfiable Request (only-if-cached)").B(gg.I).V(-1L).B(System.currentTimeMillis()).V();
        }
        if (fvVar == null) {
            return fyVar.F().Code(I(fyVar)).V();
        }
        try {
            fy fyVarV2 = code.V(fvVar);
            if (fyVarV2 == null && fyVarV != null) {
            }
            if (fyVar != null) {
                if (fyVarV2.I() == 304) {
                    fy.B bF = fyVar.F();
                    fr frVarZ = fyVar.Z();
                    fr frVarZ2 = fyVarV2.Z();
                    fr.V v2 = new fr.V();
                    int iCode = frVarZ.Code();
                    for (int i3 = 0; i3 < iCode; i3++) {
                        String strB = frVarZ.B(i3);
                        String strCode = frVarZ.Code(i3);
                        if ((!"Warning".equalsIgnoreCase(strB) || !strCode.startsWith("1")) && (V(strB) || !B(strB) || frVarZ2.Code(strB) == null)) {
                            ge.Code.Z(v2, strB, strCode);
                        }
                    }
                    int iCode2 = frVarZ2.Code();
                    for (int i4 = 0; i4 < iCode2; i4++) {
                        String strB2 = frVarZ2.B(i4);
                        if (!V(strB2) && B(strB2)) {
                            ge.Code.Z(v2, strB2, frVarZ2.Code(i4));
                        }
                    }
                    fy fyVarV3 = bF.Code(v2.I()).V(fyVarV2.S()).B(fyVarV2.a()).Code(I(fyVar)).V(I(fyVarV2)).V();
                    fyVarV2.D().close();
                    return fyVarV3;
                }
                gg.B(fyVar.D());
            }
            fy fyVarV4 = fyVarV2.F().Code(I(fyVar)).V(I(fyVarV2)).V();
            if (this.I != null) {
                if (gs.Z(fyVarV4) && gh.I(fyVarV4, fvVar)) {
                    cf.I iB = this.I.B();
                    if (iB == null || (I = iB.I()) == null) {
                        return fyVarV4;
                    }
                    return fyVarV4.F().B(new gv(fyVarV4.B("Content-Type"), fyVarV4.D().B(), ik.Code(new cf.I() { // from class: com.facetec.sdk.gd.2
                        private /* synthetic */ cf.I Code;
                        private boolean V;

                        AnonymousClass2(cf.I i22) {
                            i = i22;
                        }

                        @Override // com.facetec.sdk.cf.I
                        public final im S() {
                            return i.S();
                        }

                        @Override // com.facetec.sdk.cf.I
                        public final long V(ie ieVar, long j2) throws IOException {
                            try {
                                long jV = i.V(ieVar, j2);
                                if (jV != -1) {
                                    ieVar.Code(i.L(), ieVar.h() - jV, jV);
                                    i.C();
                                    return jV;
                                }
                                if (!this.V) {
                                    this.V = true;
                                    i.close();
                                }
                                return -1L;
                            } catch (IOException e2) {
                                if (!this.V) {
                                    this.V = true;
                                }
                                throw e2;
                            }
                        }

                        @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
                        public final void close() throws IOException {
                            if (!this.V && !gg.B(this, TimeUnit.MILLISECONDS)) {
                                this.V = true;
                            }
                            i.close();
                        }
                    }))).V();
                }
                gu.Z(fvVar.Z());
            }
            return fyVarV4;
        } finally {
            if (fyVarV != null) {
                gg.B(fyVarV.D());
            }
        }
    }
}
