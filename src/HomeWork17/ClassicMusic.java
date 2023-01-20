package HomeWork17;

public class ClassicMusic extends MusicStyles{
    String name;
    public ClassicMusic(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ClassicMusic{" +
                "name='" + name + '\'' +
                '}';
    }

    void playMusic(){
        System.out.println("Classic genre:\n" + "\"" + name + "\"");

    }
}
