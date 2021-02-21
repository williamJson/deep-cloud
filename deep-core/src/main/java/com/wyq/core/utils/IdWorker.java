package com.wyq.core.utils;

import com.wyq.core.utils.sequenceUtil.Sequence;

import java.util.UUID;

/**
 * 功能说明：
 * id生成器
 *
 * @author wyq
 * @email 342622023@qq.com
 * @phone 131****8100
 */
public class IdWorker {

    private static final Long DATA_CENTER = 1L;


    /**
     * 基于雪花算法的分布式id生成器
     */
    private final static Sequence sequence = new Sequence(1L, 1L, false, 5L, false);


    /**
     * 获取id
     *
     * @return
     */
    public static Long nextId() {
        return sequence.nextId();
    }

    /**
     * 生成基于日期的自增订单id
     *
     * @return
     */
    public static String dateTimeId() {
        // TODO: 2021/2/21
        throw new RuntimeException("not support yet");
    }

    /**
     * <p>
     * 获取去掉"-" UUID
     * </p>
     */
    public static synchronized String get32UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(nextId());
                Thread.sleep(800L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}