package org.Philip.oopsection1;

public class Phone {
    //String name;
    private String name;
    private int ScreenSize;
    private int memoryRam;
    private int camera;


    //constructor1
    public Phone(String name,int ScreenSize, int memoryRam, int camera){
        this.name = name;
        this.ScreenSize = ScreenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    //constructor2
    public Phone(String name, int camera){
        this.name = name;
        this.camera = camera;
    }


    public void playMusic(String trackName){
        System.out.println("Playing " +trackName );
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public void setScreenSize(int screenSize){
        this.ScreenSize = screenSize;
    }

    public int getScreenSize(){
        return ScreenSize;
    }

    public void setMemoryRam(int memoryRam){
        this.memoryRam = memoryRam;
    }

    public int getMemoryRam(){
        return memoryRam;
    }

}
