package org.Philip.singletonpattern;

public class Database {
    private String name;

    private static Database instance;

    public static synchronized Database getInstance(String name){
        if (null == instance){
            instance = new Database(name);
            return  instance;
        }else{
            return  instance;
        }
    }

    @Override
    public String toString() {
        String text = "Name of db:  " + this.name + " database";
        return text;
    }

    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
