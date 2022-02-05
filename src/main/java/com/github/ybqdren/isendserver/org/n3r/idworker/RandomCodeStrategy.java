package com.github.ybqdren.isendserver.org.n3r.idworker;

public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
