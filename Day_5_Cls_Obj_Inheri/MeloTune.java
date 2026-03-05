// The MeloTune music streaming platform classifies its content. Every piece of content has a title, duration (in minutes), and artist name. MeloTune offers three types of 
// content to its users, Songs, Podcasts, and Audiobooks. Songs additionally have a genre, Podcasts have an episode number, and Audiobooks have a chapter count. Every content type
//  can be played, but the display format differs. A song shows its genre, a podcast shows "Episode X," and an audiobook shows the number of chapters. The product manager wants to 
// demonstrate the system by creating one of each content type and displaying their details. 


class content{
    String title ;
    int duration ;
    String artistnm ;

    content(String title , int duration , String artistnm){
        this.title = title;
        this.duration = duration;
        this.artistnm = artistnm;
    }

    void details(){
        System.out.println("Title   : " + title);
        System.out.println("Duration  (min) : " + duration);
        System.out.println("Artist name : " + artistnm);
    }

    void play(){
    System.out.println("Playing: " + title);
}
}

class Songs extends content{

    String genere;
    Songs(String title , int duration ,String artistnm  , String genere){
        super(title, duration, artistnm);
        this.genere = genere;
    }

    void details(){
        super.details();
        System.out.println("Genere  : " + genere);
    }

}

class podcast extends content{

    int epno;
    podcast(String title, int duration, String artistnm , int epno) {
        super(title, duration, artistnm);
        this.epno = epno;
    }

    void details(){
        super.details();
        System.out.println("Episode No.  : " + epno );
    }

}

class Audiobooks  extends content{

    int chapteno;

    Audiobooks(String title, int duration, String artistnm , int chapteno) {
        super(title, duration, artistnm);
        this.chapteno = chapteno ;
    }

    void details(){
        super.details();
        System.out.println("Chapter No  : " + chapteno );
    }

}

public class MeloTune {

    public static void main(String[] args) {
        
        // Song
        Songs s1 = new Songs("Maya", 4, "Ashutosh KC", "Melody");
        s1.details();

        System.out.println("\n-----------------\n");

        // Podcast
        podcast p1 = new podcast("Tech Talks", 45, "Rahul Sharma", 12);
        p1.details();

        System.out.println("\n-----------------\n");

        // Audiobook
        Audiobooks a1 = new Audiobooks("Atomic Habits", 300, "James Clear", 20);
        a1.details();
    }
}