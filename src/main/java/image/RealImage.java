package image;

import lombok.Getter;

import java.util.Objects;

@Getter
public class RealImage implements Image{
    private String filename;

    public void loadFromDisk(){
        System.out.println("Loaded " + filename);
    }

    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk();
    }


    @Override
    public void display() {
        System.out.println(filename);
    }

}