package com.company;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        try{
            InetAddress host = InetAddress.getByName("www.google.es");
            URL url = new URL("https://elpuig.xeill.net/departaments");

            System.out.println("Host: "+ host);
            System.out.println("IP: "+ host.getHostAddress());
            System.out.println("Nombre: "+host.getHostName());

            System.out.println("Recurs: " + url.getFile());

            System.out.println("Acces: " + url.getAuthority());
            System.out.println("Cami: " + url.getPath());
            System.out.println("Esquema: " + url.getProtocol());

        } catch( UnknownHostException uhe){
            System.out.println("Host Exception");
            System.out.println(uhe.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
