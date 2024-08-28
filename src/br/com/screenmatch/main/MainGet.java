package br.com.screenmatch.main;

import br.com.screenmatch.exception.ConvertionErrorException;
import br.com.screenmatch.models.Title;
import br.com.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainGet {
    public static void main(String[] args) throws IOException {
        String clientUrl = "https://www.omdbapi.com/";
        Scanner reading = new Scanner(System.in);
        String get = "";

        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!get.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome do filme que deseja buscar");
            get = reading.nextLine();

            if (get.equalsIgnoreCase("sair")) {
                break;
            }

            // Using URLEncoder to ensure the string is properly encoded for a URL
            String encodedGet = URLEncoder.encode(get, StandardCharsets.UTF_8);

            String urlByName = clientUrl + "?t=" + encodedGet + "&apikey=Adicionar a key aqui";

            System.out.println(urlByName);
            HttpClient client = HttpClient.newHttpClient();
            try {


                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(urlByName))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);



                TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(titleOmdb);

                //try {
                Title title = new Title(titleOmdb);
                System.out.println("Título convertido");
                System.out.println(title);

                titles.add(title);
            } catch (NumberFormatException e) {
                System.out.println("Erro no formato do número");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro no argumento de busca");
                System.out.println(e.getMessage());
            } catch (ConvertionErrorException e) {
                System.out.println("Erro no ano de lançamento");
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro genérico");
                System.out.println(e.getMessage());
            }
        }

        FileWriter write = new FileWriter("Movies.json");
        write.write(gson.toJson(titles));
        write.close();

        System.out.println(titles);
    }
}
