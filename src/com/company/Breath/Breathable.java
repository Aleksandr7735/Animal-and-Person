package com.company.Breath;

public interface Breathable {
    void breath();
    void holdBreath();
    default void sneeze(){
        System.out.println("Apchi");
    }
}
