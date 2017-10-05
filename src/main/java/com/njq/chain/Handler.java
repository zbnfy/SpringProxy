package com.njq.chain;

/**
 * 链式调用
 * Created by NIJIAQI on 2017/10/6.
 */
public abstract class Handler {
    //判断后续是否有处理
    private Handler sucessor;

    public Handler getSucessor() {
        return sucessor;
    }

    public void setSucessor(Handler sucessor) {
        this.sucessor = sucessor;
    }

    public void execute() {
        handleProcess();
        if(sucessor!=null) {
            sucessor.execute();
        }
    }

    protected abstract void handleProcess();
}
