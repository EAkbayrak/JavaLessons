package com.syntax.Class24;

public class DataBaseTester {
    public static void main(String[] args) {
        Database [] databases = {new Informix(),new MySQLServer()};

        for (Database d:databases){
            d.open();
            d.readData();
            d.readData();
            d.closeTheDatabase();
            System.out.println();
        }

    }
}
