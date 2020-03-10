package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class programa {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Escribe la URL: ");
//        String urlBuscar = scanner.nextLine();

        try {
            URL url = new URL("https://elpuig.xeill.net/");

            String etiqueta = "meta";

            printContent(url, etiqueta);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printContent(URL url, String etiqueta){
        InputStream in;
        String pattern = "<" + etiqueta + ">";
        String pattern2 = "<" + etiqueta;


        try {
            in = url.openStream();
            InputStreamReader inr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(inr);


            String inputLine;
            while ((inputLine = br.readLine()) != null){
                System.out.println(inputLine);
                if(inputLine.contains(pattern)){
                    System.out.println(inputLine);
                }else if(inputLine.contains(pattern2)){
                    System.out.println(inputLine);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


