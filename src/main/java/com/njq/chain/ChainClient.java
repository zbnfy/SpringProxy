package com.njq.chain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by NIJIAQI on 2017/10/6.
 */
public class ChainClient {
    static class ChainHandlerA extends ChainHandler {
        protected void handleProcess() {
            System.out.println("handle by chain a");
        }
    }

    static class ChainHandlerB extends ChainHandler {
        protected void handleProcess() {
            System.out.println("handle by chain b");
        }
    }

    static class ChainHandlerC extends ChainHandler {
        protected void handleProcess() {
            System.out.println("handle by chain c");
        }
    }

    public static void main(String[] args) {
        List<ChainHandler> handlers = Arrays.asList(
                new ChainHandlerA(),
                new ChainHandlerB(),
                new ChainHandlerC()
        );
        Chain chain = new Chain(handlers);
        chain.proceed();
    }
}
