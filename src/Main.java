import java.io.*;
import java.nio.file.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        try {
            String content= new String(Files.readAllBytes(Paths.get("src/in.txt")));
            //a
            String a = content.replaceAll("(?m)$", "\n");
            //b
            String b = content.replace(".", ".\n");

            String c= a+ "\n"+ b;
            //scriem in out.txt
            Files.write(Paths.get("src/out.txt"), c.getBytes());

            //afisare
            System.out.println("rezultate a:\n"+a);
            System.out.println("rezultate b:\n"+b);
            //hhhh


        } catch (IOException e) {
            e.printStackTrace();
        }
        Random random= new Random();
        List<String> lines= new ArrayList<>();
        for(int i=0;i<5;i++){
            List<String> words= new ArrayList<>();
            for(int j=0;j<10;j++){
                StringBuilder word= new StringBuilder();
                for(int k=0;k<4;k++){
                    char c= (char) (random.nextInt(26) + 'a');
                    word.append(c);
                }
                words.add(word.toString());
            }
            Collections.sort(words);
            lines.add(String.join(" ", words));


            }
        try {
            Files.write(Paths.get("/Users/ardu/IdeaProjects/ingprog5/src/outrand.txt"),lines);
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}