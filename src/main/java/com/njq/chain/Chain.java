package com.njq.chain;

import java.util.List;

/**
 * Created by NIJIAQI on 2017/10/6.
 */
public class Chain {
    private List<ChainHandler> chainHandlers;

    private int index = 0;

    public Chain(List<ChainHandler> chainHandlers) {
        this.chainHandlers = chainHandlers;
    }

    public void proceed() {
        if(index >= chainHandlers.size())
            return ;
        chainHandlers.get(index++).execute(this);

    }


}
