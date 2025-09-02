package designpattern.creationalpattern.builder;

public class HttpAppBuilderPatternMain {
    public static void main(String[] args) {

        HttpRequest request1= new HttpRequest.Builder()
                .url("https://api.com/submit")
                .method("GET")
                .build();

        HttpRequest request2 = new HttpRequest.Builder()
                .url("https://api.com/config")
                .method("Put")
                .headers("Content-Type", "application/json")
                .build();
        HttpRequest request3 = new HttpRequest.Builder()
                .url("https://api.com/submit")
                .method("Post")
                .headers("Content-Type", "application/json")
                .build();
        HttpRequest request4 = new HttpRequest.Builder()
                .url("https://api.com/submit")
                .method("Post")
                .headers("Content-Type", "application/json")
                .body("{\"name\": \"John\", \"age\": 30}")
                .queryParams("param1", "value1")
                .timeout(10)
                .build();
        System.out.println(request1.toString());
        System.out.println("---");
        System.out.println(request2.toString());
        System.out.println("---");
        System.out.println(request3.toString());
        System.out.println("---");
        System.out.println(request4.toString());


    }

}
