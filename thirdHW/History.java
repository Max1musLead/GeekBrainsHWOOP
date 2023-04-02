package thirdHW;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class History {

    public History() {
    }
    public void recHistory(String a){

        try (FileWriter fw = new FileWriter("log_lesson_3.txt", true)){
            fw.append(a + "\n");
            fw.flush();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public void history(){
        Scanner in = new Scanner(System.in);
        System.out.println("Показать историю ходов? y/n");
        String answer = in.next();
        if(answer.equals("y")){
            readFrom();
        } else {
            System.out.println("Спасибо за игру!!!");
        }

    }
    private void readFrom() {
        StringBuilder raw = new StringBuilder();
        String temp;
        try(BufferedReader rf = new BufferedReader(new InputStreamReader(new FileInputStream(new File("log_lesson_3.txt")), "UTF-8"))){
            while ((temp = rf.readLine()) != null) {
                raw.append(temp + ",");
            }
            rf.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        String rec = raw.toString();
        String[] result = rec.split(",");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}

