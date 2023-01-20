package HomeWork17;

public class RockMusic extends MusicStyles{
    String name;
    public RockMusic(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "RockMusic{" +
                "name='" + name + '\'' +
                '}';
    }

    void playMusic(){
        System.out.println("Rock genre:\n" + "\"" +name + "\"");

    }
}
