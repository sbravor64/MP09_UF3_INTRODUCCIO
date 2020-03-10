package com.company;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class formularioPrograma {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://docs.google.com/forms/u/0/d/e/1FAIpQLScE6sxLFb3BmCmT2TKHQH5ormS0qvjHwO-uTAR8MXaagBvSSQ/formResponse");

            injectarDades(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void injectarDades(URL url) {
        try {
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            String nom = "Andres";
            String valor = "Si";

            con.setRequestMethod("POST");
            con.setDoOutput(true);
            con.setDoInput(true);

            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes("entry.835030737=" + nom);
            out.writeBytes("&entry.1616686619=" + valor);

            out.flush();
            out.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
