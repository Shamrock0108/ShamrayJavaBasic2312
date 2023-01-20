package HomeWork17;

import java.util.Arrays;

public class MusicStyles {
    public static void main(String[] args) {
    MusicStyles[] music = {new PopMusic("Fool's Garden"),
    new RockMusic("AC'DC"),
    new ClassicMusic("Beethoven")};
       for(MusicStyles play: music ) {
           play.playMusic();
           }
        System.out.println("****************");
      for(int i = 0;i< music.length;i++){
          System.out.println(music[i]);
      }
    }
     void playMusic(){
         System.out.println("Music list");

    }


}
