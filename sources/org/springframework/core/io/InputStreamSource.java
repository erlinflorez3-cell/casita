package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface InputStreamSource {
    InputStream getInputStream() throws IOException;
}
