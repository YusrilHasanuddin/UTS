package com.company;


public class Komputer {
    CPU cpu = new CPU();

    Komputer(CPU cpu){
        this.cpu = cpu;
    }

    Komputer(){}

    public void memasang(CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU: " + cpu.getCPUData() + " GHz dipasang");
    }
    public void mencabut(){
        System.out.println("CPU: " + this.cpu.getCPUData() + " GHz dicabut");
    }
    public void cetakInfo(){
        System.out.println("Spesifikasi : CPU: " + cpu.getCPUData() + " GHz");
    }
}
