package com.njq.chain;

/**
 * Created by NIJIAQI on 2017/10/6.
 */
public abstract class ChainHandler {
    public void execute(Chain chain) {
        handleProcess();
        chain.proceed();
    }

    protected abstract void handleProcess();


}
