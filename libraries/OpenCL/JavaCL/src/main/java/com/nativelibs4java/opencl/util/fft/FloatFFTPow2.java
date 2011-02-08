package com.nativelibs4java.opencl.util.fft;

import com.nativelibs4java.opencl.*;
import java.io.IOException;
import java.nio.FloatBuffer;

public class FloatFFTPow2 extends AbstractFFTPow2<FloatBuffer, float[]> {

    final FloatFFTProgram program;

    public FloatFFTPow2(CLContext context) throws IOException {
        super(context, FloatBuffer.class);
        this.program = new FloatFFTProgram(context);
    }
    public FloatFFTPow2() throws IOException {
        this(JavaCL.createBestContext());
    }

    protected CLEvent cooleyTukeyFFTTwiddleFactors(CLQueue queue, int N, CLBuffer<FloatBuffer> buf, CLEvent... evts) throws CLException {
        return program.cooleyTukeyFFTTwiddleFactors(queue, N, buf, new int[] { N / 2 }, null, evts);
    }
    protected CLEvent cooleyTukeyFFTCopy(CLQueue queue, CLBuffer<FloatBuffer> inBuf, CLBuffer<FloatBuffer> outBuf, int length, CLIntBuffer offsetsBuf, boolean inverse, CLEvent... evts) throws CLException {
        return program.cooleyTukeyFFTCopy(queue, inBuf, outBuf, length, offsetsBuf, inverse ? 1 : 1.0f / length, new int[] { length }, null, evts);
    }
    protected CLEvent cooleyTukeyFFT(CLQueue queue, CLBuffer<FloatBuffer> Y, int N, CLBuffer<FloatBuffer> twiddleFactors, int inverse, int[] dims, CLEvent... evts) throws CLException {
        return program.cooleyTukeyFFT(queue, Y, N, twiddleFactors, inverse, dims, null, evts);
    }
 }
