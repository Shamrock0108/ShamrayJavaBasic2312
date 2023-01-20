package HomeWork17;

public class PopMusic extends MusicStyles{
 String name;

    public PopMusic(String name) {
this.name = name;

    }



    @Override
    public String toString() {
        return "PopMusic{" +
                "name='" + name + '\'' +
                '}';
    }

    void playMusic(){
        System.out.println("Pop genre:\n" + "\"" + name + "\"");

    }
}
