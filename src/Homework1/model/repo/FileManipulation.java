package Homework1.model.repo;

import java.io.Serializable;

public interface FileManipulation {
   boolean save(String path, Serializable savedTree);
   Serializable load(String path, String type);
}
