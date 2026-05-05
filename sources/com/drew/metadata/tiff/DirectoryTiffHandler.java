package com.drew.metadata.tiff;

import com.drew.imaging.tiff.TiffHandler;
import com.drew.lang.Rational;
import com.drew.metadata.Directory;
import com.drew.metadata.ErrorDirectory;
import com.drew.metadata.Metadata;
import com.drew.metadata.StringValue;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DirectoryTiffHandler implements TiffHandler {
    protected Directory _currentDirectory;
    private final Stack<Directory> _directoryStack = new Stack<>();
    protected final Metadata _metadata;
    private Directory _rootParentDirectory;

    protected DirectoryTiffHandler(Metadata metadata, Directory directory) {
        this._metadata = metadata;
        this._rootParentDirectory = directory;
    }

    private Directory getCurrentOrErrorDirectory() {
        Directory directory = this._currentDirectory;
        if (directory != null) {
            return directory;
        }
        ErrorDirectory errorDirectory = (ErrorDirectory) this._metadata.getFirstDirectoryOfType(ErrorDirectory.class);
        if (errorDirectory != null) {
            return errorDirectory;
        }
        pushDirectory(ErrorDirectory.class);
        return this._currentDirectory;
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void endingIFD() {
        this._currentDirectory = this._directoryStack.empty() ? null : this._directoryStack.pop();
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void error(String str) {
        getCurrentOrErrorDirectory().addError(str);
    }

    protected void pushDirectory(Class<? extends Directory> cls) {
        try {
            Directory directoryNewInstance = cls.newInstance();
            Directory directory = this._currentDirectory;
            if (directory == null) {
                Directory directory2 = this._rootParentDirectory;
                if (directory2 != null) {
                    directoryNewInstance.setParent(directory2);
                    this._rootParentDirectory = null;
                }
            } else {
                this._directoryStack.push(directory);
                directoryNewInstance.setParent(this._currentDirectory);
            }
            this._currentDirectory = directoryNewInstance;
            this._metadata.addDirectory(directoryNewInstance);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setByteArray(int i2, byte[] bArr) {
        this._currentDirectory.setByteArray(i2, bArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setDouble(int i2, double d2) {
        this._currentDirectory.setDouble(i2, d2);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setDoubleArray(int i2, double[] dArr) {
        this._currentDirectory.setDoubleArray(i2, dArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setFloat(int i2, float f2) {
        this._currentDirectory.setFloat(i2, f2);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setFloatArray(int i2, float[] fArr) {
        this._currentDirectory.setFloatArray(i2, fArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt16s(int i2, int i3) {
        this._currentDirectory.setInt(i2, i3);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt16sArray(int i2, short[] sArr) {
        this._currentDirectory.setObjectArray(i2, sArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt16u(int i2, int i3) {
        this._currentDirectory.setInt(i2, i3);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt16uArray(int i2, int[] iArr) {
        this._currentDirectory.setObjectArray(i2, iArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt32s(int i2, int i3) {
        this._currentDirectory.setInt(i2, i3);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt32sArray(int i2, int[] iArr) {
        this._currentDirectory.setIntArray(i2, iArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt32u(int i2, long j2) {
        this._currentDirectory.setLong(i2, j2);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt32uArray(int i2, long[] jArr) {
        this._currentDirectory.setObjectArray(i2, jArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt8s(int i2, byte b2) {
        this._currentDirectory.setInt(i2, b2);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt8sArray(int i2, byte[] bArr) {
        this._currentDirectory.setByteArray(i2, bArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt8u(int i2, short s2) {
        this._currentDirectory.setInt(i2, s2);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setInt8uArray(int i2, short[] sArr) {
        this._currentDirectory.setObjectArray(i2, sArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setRational(int i2, Rational rational) {
        this._currentDirectory.setRational(i2, rational);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setRationalArray(int i2, Rational[] rationalArr) {
        this._currentDirectory.setRationalArray(i2, rationalArr);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setString(int i2, StringValue stringValue) {
        this._currentDirectory.setStringValue(i2, stringValue);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void warn(String str) {
        getCurrentOrErrorDirectory().addError(str);
    }
}
