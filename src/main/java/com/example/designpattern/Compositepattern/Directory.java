package com.example.designpattern.Compositepattern;

public class Directory extends FileSystemNode{
    public Directory(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("-- dir "+name+" size="+computeSize()+" bytes");
    }
}
