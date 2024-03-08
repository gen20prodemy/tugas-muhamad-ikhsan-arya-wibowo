package Interface;

import Proses.CRUD;

public interface IFiles {
    void createFile(CRUD crud);
    void readFile();
    void updateFile(CRUD crud);
    void deleteFile(int row);
}
