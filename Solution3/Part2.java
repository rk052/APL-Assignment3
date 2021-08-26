interface Players{
    public void numberOfPlayers();
}

interface Cricket extends Players{
    public void play();
}

class Cricketground implements Cricket{
    public void numberOfPlayers(){
        System.out.println("Total number of players required is 11");
    }

    public void play(){
        System.out.println("The cricket match has started...");
    }
}

public class Part2 {
    public static void main(String[] args){
        Cricketground cg=new Cricketground();
        cg.numberOfPlayers();
        cg.play();
    }
}
