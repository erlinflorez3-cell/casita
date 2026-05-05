package com.facetec.sdk;

import com.facetec.sdk.cf;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ik {
    static final Logger B = Logger.getLogger(ik.class.getName());

    private ik() {
    }

    public static cf.I B(InputStream inputStream) {
        return Code(inputStream, new im());
    }

    private static hy B(final Socket socket) {
        return new hy() { // from class: com.facetec.sdk.ik.2
            @Override // com.facetec.sdk.hy
            protected final IOException V(@Nullable IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.facetec.sdk.hy
            protected final void Z() {
                try {
                    socket.close();
                } catch (AssertionError e2) {
                    if (!ik.B(e2)) {
                        throw e2;
                    }
                    ik.B.log(Level.WARNING, new StringBuilder("Failed to close timed out socket ").append(socket).toString(), (Throwable) e2);
                } catch (Exception e3) {
                    ik.B.log(Level.WARNING, new StringBuilder("Failed to close timed out socket ").append(socket).toString(), (Throwable) e3);
                }
            }
        };
    }

    static boolean B(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static cf.I Code(cf.I i2) {
        return new io(i2);
    }

    private static cf.I Code(final InputStream inputStream, final im imVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (imVar != null) {
            return new cf.I() { // from class: com.facetec.sdk.ik.1
                @Override // com.facetec.sdk.cf.I
                public final im S() {
                    return imVar;
                }

                @Override // com.facetec.sdk.cf.I
                public final long V(ie ieVar, long j2) throws IOException {
                    if (j2 < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
                    }
                    if (j2 == 0) {
                        return 0L;
                    }
                    try {
                        imVar.S();
                        il ilVarC = ieVar.C(1);
                        int i2 = inputStream.read(ilVarC.V, ilVarC.I, (int) Math.min(j2, 8192 - ilVarC.I));
                        if (i2 == -1) {
                            return -1L;
                        }
                        ilVarC.I += i2;
                        long j3 = i2;
                        ieVar.Z += j3;
                        return j3;
                    } catch (AssertionError e2) {
                        if (ik.B(e2)) {
                            throw new IOException(e2);
                        }
                        throw e2;
                    }
                }

                @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
                public final void close() throws IOException {
                    inputStream.close();
                }

                public final String toString() {
                    return new StringBuilder("source(").append(inputStream).append(")").toString();
                }
            };
        }
        throw new IllegalArgumentException("timeout == null");
    }

    public static cf.I Code(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        final hy hyVarB = B(socket);
        final OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new cf.I() { // from class: com.facetec.sdk.hy.3
                private /* synthetic */ cf.I Code;

                AnonymousClass3(cf.I i2) {
                    i = i2;
                }

                @Override // com.facetec.sdk.cf.I
                public final im S() {
                    return hy.this;
                }

                @Override // com.facetec.sdk.cf.I
                public final void Z(ie ieVar, long j2) throws IOException {
                    long j3 = j2;
                    is.Z(ieVar.Z, 0L, j3);
                    while (true) {
                        long j4 = 0;
                        if (j3 <= 0) {
                            return;
                        }
                        il ilVar = ieVar.V;
                        while (true) {
                            if (j4 >= 65536) {
                                break;
                            }
                            j4 += (long) (ilVar.I - ilVar.Z);
                            if (j4 >= j3) {
                                j4 = j3;
                                break;
                            }
                            ilVar = ilVar.C;
                        }
                        hy.this.Code();
                        try {
                            try {
                                i.Z(ieVar, j4);
                                j3 -= j4;
                                hy.this.I(true);
                            } catch (IOException e2) {
                                throw hy.this.B(e2);
                            }
                        } catch (Throwable th) {
                            hy.this.I(false);
                            throw th;
                        }
                    }
                }

                @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
                public final void close() throws IOException {
                    hy.this.Code();
                    try {
                        try {
                            i.close();
                            hy.this.I(true);
                        } catch (IOException e2) {
                            throw hy.this.B(e2);
                        }
                    } catch (Throwable th) {
                        hy.this.I(false);
                        throw th;
                    }
                }

                @Override // com.facetec.sdk.cf.I, java.io.Flushable
                public final void flush() throws IOException {
                    hy.this.Code();
                    try {
                        try {
                            i.flush();
                            hy.this.I(true);
                        } catch (IOException e2) {
                            throw hy.this.B(e2);
                        }
                    } catch (Throwable th) {
                        hy.this.I(false);
                        throw th;
                    }
                }

                public final String toString() {
                    return new StringBuilder("AsyncTimeout.sink(").append(i).append(")").toString();
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    public static cf.I Z(cf.I i2) {
        return new ii(i2);
    }

    public static cf.I Z(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        hy hyVarB = B(socket);
        return new cf.I() { // from class: com.facetec.sdk.hy.4
            private /* synthetic */ cf.I Z;

            AnonymousClass4(cf.I i2) {
                i = i2;
            }

            @Override // com.facetec.sdk.cf.I
            public final im S() {
                return hy.this;
            }

            @Override // com.facetec.sdk.cf.I
            public final long V(ie ieVar, long j2) throws IOException {
                hy.this.Code();
                try {
                    try {
                        long jV = i.V(ieVar, j2);
                        hy.this.I(true);
                        return jV;
                    } catch (IOException e2) {
                        throw hy.this.B(e2);
                    }
                } catch (Throwable th) {
                    hy.this.I(false);
                    throw th;
                }
            }

            @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
            public final void close() throws IOException {
                try {
                    try {
                        i.close();
                        hy.this.I(true);
                    } catch (IOException e2) {
                        throw hy.this.B(e2);
                    }
                } catch (Throwable th) {
                    hy.this.I(false);
                    throw th;
                }
            }

            public final String toString() {
                return new StringBuilder("AsyncTimeout.source(").append(i).append(")").toString();
            }
        };
    }
}
