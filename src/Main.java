import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.print("Add at least two arguments with file names");
        } else {
            DistributionOfWords distribution = new DistributionOfWords();
            try {
                for (int idx = 0; idx <= args.length - 2; ++idx) {
                    distribution.attachFile(args[idx]);
                }
                distribution.sendForOutputInCSV(args[args.length - 1]);
            }catch (IOException exception){
                System.err.print("Exception: " + exception.getLocalizedMessage());
            }
        }
    }
}