package com.liuli.day30returnasap.problem;

import java.util.PriorityQueue;

public class Customer {

    final PriorityQueue<Integer> queue;

    final int k;

    public Customer(int k, int[] a) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int n : a) {
            add(n);
        }
    }

    public int add(int n){
        if(queue.size() < k){
            queue.offer(n);
        }else if(queue.peek() < n){
            queue.poll();
            queue.offer(n);
        }
        return queue.peek();
    }
}