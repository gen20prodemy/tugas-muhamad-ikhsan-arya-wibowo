package CRUD;

import Interface.IMapSiswa;
import java.util.Map;
import java.util.TreeMap;

public class MapSiswa implements IMapSiswa {
    private TreeMap <Integer, String> map;

    public MapSiswa (){
        this.map = new TreeMap<>();
    }
    @Override
    public void createMap(DataSiswa siswa) {
        if (map.containsKey(siswa.getId())){
            System.err.println("\nID yang dimasukkan sudah ada pada Data Siswa ");
        }
        else {
            map.put(siswa.getId(), siswa.getName());
            System.out.println("\nMenambahkan Data Siswa");
        }
    }

    @Override
    public void readMap() {
        for(Map.Entry<Integer, String> show : map.entrySet()){
            System.out.println(+ show.getKey() +"\t: "+ show.getValue());
        }

    }

    @Override
    public void updateMap(DataSiswa newSiswa) {
        if (map.containsKey(newSiswa.getId()) == false){
            System.err.println("ID Siswa tidak ditemukan!");
        }
        else {
            map.put(newSiswa.getId(), newSiswa.getName());
        }


    }

    @Override
    public void deleteMap(DataSiswa siswa) {
        if (map.containsKey(siswa.getId()) == false) {
            System.err.println("ID Siswa tidak ditemukan!");
        } else {
            map.remove(siswa.getId());
        }
    }
}
