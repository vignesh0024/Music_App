package Songapp;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Album a = new Album ("Love","Yuvan");
        a.addSongToAlbum("Siragugal",4.0);
        a.addSongToAlbum("Thuli thuli",4.1);
        a.addSongToAlbum("High on love",4.2);
        a.addSongToAlbum("Idhuvarai",4.3);
        a.addSongToAlbum("Siragugal",4.0);

        ArrayList<song> playlist = new ArrayList<>();

        a.addToPlaylist(2,playlist);
        a.addToPlaylist(3,playlist);
        a.addToPlaylist(4,playlist);

        play(playlist);
    }

      public static void play(ArrayList<song> playList){
        printMenu();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your choice : ");
          int choice = sc.nextInt();
          int currentIndex = 0;
          boolean isOver = false;

          while(!isOver) {
              switch (choice) {
                  case 1:
                      if (currentIndex == (playList.size() - 1)) {
                          System.out.println("You are at the last song");
                      } else {
                          currentIndex++;
                          System.out.println(playList.get(currentIndex).toString());
                      }
                      break;
                  case 2:
                      if (currentIndex == 0) {
                          System.out.println("You are at the first song");
                      } else {
                          currentIndex--;
                          System.out.println(playList.get(currentIndex).toString());
                      }
                      break;
                  case 3:
                      System.out.println(playList.get(currentIndex).toString());
                      break;
                  case 4:
                      printAllSongs(playList);
                      break;
                  case 5:
                      isOver = true;
                      break;
              }
              choice = sc.nextInt();
          }

    }
        public static void printMenu(){
              System.out.println("1. Go to Next Song");
              System.out.println("2. Go to Previous Song");
              System.out.println("3. Repeat this Song");
              System.out.println("4. Print PlayList");
              System.out.println("5. Close the playlist");
          }
          public static void printAllSongs(ArrayList<song> playList){

              for(song song : playList){
                  System.out.println(song.toString());
              }

          }



}