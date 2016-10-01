
/*ABommarito*/

package beersong;

class BeerSong {
    /* Print what is going to be said for the lyrics */
    /* Show what happens when there is no bottles left*/
    public static void song(int bottles){
        if(bottles == 0){
            System.out.println();
            System.out.println("No bottles of beer on the wall");
    /* Print lyrics + count down from 99 to 0*/        
        } else {
            System.out.println(bottles + " bottles of beer on the wall," + bottles + " bottles of beer, ya' take one");
            System.out.println("down, ya' pass it around," + (bottles -1) + " bottles of beer on the wall.");
            System.out.println();
        }
    }
    /*Countdown from 99 to 0 */
    public static void main(String[] args){
        BeerSong beer = new BeerSong();
        for(int i = 99;i>=0;i--){
            beer.song(i);
        }
        System.exit(0);
    }
}