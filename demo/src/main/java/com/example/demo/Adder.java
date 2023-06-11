package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Adder {
    public int eval(int a, int b) {
        return a + b;
    }
}
