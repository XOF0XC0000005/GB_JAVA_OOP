package Homework1.interfaces;

import java.io.Serializable;

public interface FileManipulation {
   boolean save(String path, Serializable savedTree);
   Serializable load(String path, String type);
}
