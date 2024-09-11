package bingo;
public class BingoBeraksi {
    public static void main(String[] args) {
        // TODO code application logic here
        String lirik = "There was a farmer who had a dog\nAnd Bingo was his name-o.\n"
            +"B-I-N-G-O\nB-I-N-G-O\nB-I-N-G-O\nAnd Bingo was his name-o\n\n"
            +"There was a farmer who had a dog\nAnd Bingo was his name-o.\n"
            +"(clap)-I-N-G-O\n(clap)-I-N-G-O\n(clap)-I-N-G-O\n"
            +"And Bingo was his name-o\n\n"
            +"There was a farmer who had a dog\nAnd Bingo was his name-o.\n"
            +"(clap)-(clap)-N-G-O\n(clap)-(clap)-N-G-O\n(clap)-(clap)-N-G-O\n"
            +"And Bingo was his name-o\n\n"
            +"There was a farmer who had a dog\nAnd Bingo was his name-o.\n"
            +"(clap)-(clap)-(clap)-G-O\n(clap)-(clap)-(clap)-G-O\n(clap)-(clap)-(clap)-G-O\n"
            +"And Bingo was his name-o\n\n"
            +"There was a farmer who had a dog\nAnd Bingo was his name-o.\n"
            +"(clap)-(clap)-(clap)-(clap)-O\n(clap)-(clap)-(clap)-(clap)-O\n(clap)-(clap)-(clap)-(clap)-O\n"
            +"And Bingo was his name-o\n\n"
            +"There was a farmer who had a dog\nAnd Bingo was his name-o.\n"
            +"(clap)-(clap)-(clap)-(clap)-(clap)\n(clap)-(clap)-(clap)-(clap)-(clap)\n(clap)-(clap)-(clap)-(clap)-(clap)\n"
            +"And Bingo was his name-o\n\n";
        Bingo bg = new Bingo(lirik);
        bg.printBingo();
    }  
}
