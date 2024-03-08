package Interface;

import CRUD.DataSiswa;

public interface IMapSiswa {
    void createMap(DataSiswa siswa);
    void readMap();
    void updateMap(DataSiswa siswa);
    void deleteMap(DataSiswa siswa);
}
