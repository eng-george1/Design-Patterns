package com.example.designpattern.Compositepattern;

public class File extends FileSystemNode {
    public File(String name, int size) {
        super(name);
        this.setSizeInBytes(size);
    }

    @Override
    public void print() {
        System.out.println("--- file "+name+" size="+getSizeInBytes()+"bytes");
    }
}
