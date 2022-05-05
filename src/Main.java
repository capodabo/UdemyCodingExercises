import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);
    }

    public static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> songListIterator = playList.listIterator();
        boolean quit = false;
        boolean forward = true;

        if (playList.size() > 0) {
            System.out.println("Now playing \"" + songListIterator.next().getTitle() + "\"");
        } else {
            System.out.println("Your playlist is empty. Exiting the program...");
            return;
        }

        while (!quit) {
            System.out.print("Please select an action or enter 9 to open the menu: ");
            if (!scanner.hasNextInt()) {
                System.out.println("This was an invalid entry.");
                scanner.nextLine();
            } else {
                int option = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
                switch (option) {
                    case 0:
                        System.out.println("Exiting the program...");
                        quit = true;
                        break;

                    case 1:
                        if (!forward) {
                            if (songListIterator.hasNext()) {
                                songListIterator.next();
                            }
                            forward = true;
                        }
                        if (songListIterator.hasNext()) {
                            System.out.println("Skipping forward to next song.");
                            System.out.println("Now playing \"" + songListIterator.next().getTitle() + "\"");
                        } else {
                            System.out.println("Cannot skip to the next song. You are at the end of the playlist.");
                        }
                        break;

                    case 2:
                        if (forward) {
                            if (songListIterator.hasPrevious()) {
                                songListIterator.previous();
                            }
                            forward = false;
                        }
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Skipping backwards to previous song.");
                            System.out.println("Now playing \"" + songListIterator.previous().getTitle() + "\"");
                        } else {
                            System.out.println("Cannot skip to the previous song. You are at the start of the playlist.");
                        }
                        break;

                    case 3:
                        if (forward) {
                            if (songListIterator.hasPrevious()) {
                                System.out.println("Replaying the current song.");
                                System.out.println("Now playing \"" + songListIterator.previous().getTitle() + "\"");
                            }
                            forward = false;
                        } else {
                            if (songListIterator.hasNext()) {
                                System.out.println("Replaying the current song.");
                                System.out.println("Now playing \"" + songListIterator.next().getTitle() + "\"");
                            }
                            forward = true;
                        }
                        break;

                    case 4:
                        listSongsInPlayList(playList);
                        break;

                    case 5:
                        if (playList.size() > 0) {
                            songListIterator.remove();
                            System.out.println("You have removed current song from your playlist.");
                            if (songListIterator.hasNext()) {
                                System.out.println("Now playing \"" + songListIterator.next().getTitle() + "\"");
                            } else if (songListIterator.hasPrevious()) {
                                System.out.println("Now playing \"" + songListIterator.previous().getTitle() + "\"");
                            } else {
                                System.out.println("Your playlist is now empty.");
                            }
                        } else {
                            System.out.println("Cannot remove current song. Your playlist is empty.");
                        }
                        break;

                    case 9:
                        listMenu();
                        break;

                    default:
                        System.out.println("This was an invalid option. Please select a number available in the menu.");
                        break;
                }
            }
        }
        scanner.close();
    }

    public static void listSongsInPlayList(LinkedList<Song> playList) {
        if (playList.size() > 0) {
            Iterator<Song> iterator = playList.iterator();
            System.out.println("Your playlist contains the following songs:");
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
        } else {
            System.out.println("Your playlist is empty.");
        }
    }

    public static void listMenu() {
        System.out.println("\tPlease enter:");
        System.out.println("\t1 - To skip forward to the next song");
        System.out.println("\t2 - To skip backwards to the previous song");
        System.out.println("\t3 - To replay the current song");
        System.out.println("\t4 - To view all of the songs in your playlist");
        System.out.println("\t5 - To remove the current song from your playlist");
        System.out.println("\t ... ");
        System.out.println("\t9 - To view the menu");
        System.out.println("\t0 - To exit the application");
    }
}
