package com.example.designpattern.Compositepattern;

import com.example.designpattern.Directory;
import com.example.designpattern.File;

import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class FileSystemNode {
    protected String name;
    private int sizeInBytes=0;
    protected List<FileSystemNode> fileSystemNodes = new ArrayList<>();

    public FileSystemNode(String name) {
        this.name=name;
    }
    public abstract void print();
    public  void printAll(){
        print();
        fileSystemNodes.forEach(c->c.printAll());
    }
    public void add(FileSystemNode file){
        fileSystemNodes.add(file);
    }
    public void remove(FileSystemNode file){
        fileSystemNodes.remove(file);
    }
    public int getSizeInBytes() {

        return sizeInBytes;
    }
    public void setSizeInBytes(int sizeInBytes){
        this.sizeInBytes=sizeInBytes;
    }
    public int computeSize(){
       return sizeInBytes+ fileSystemNodes.stream().mapToInt(c->c.computeSize()).sum();
    }
public List<FileSystemNode> getFileSystemNodes(){
        return Collections.unmodifiableList(fileSystemNodes);
}
}
