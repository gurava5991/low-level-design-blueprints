package designpattern.creationalpattern.builder;

public class HttpAppBuilderPatternMain {
    public static void main(String[] args) {

        HttpRequest request1= new HttpRequest.Builder("https://api.com/data").method("GET").build();

        HttpRequest request2 = new HttpRequest.Builder("https://api.com/submit")
                .method("Put")
                .headers("Content-Type", "application/json")
                .build();
        HttpRequest request3 = new HttpRequest.Builder("https://api.com/config")
                .method("Post")
                .headers("Content-Type", "application/json")
                .build();
        System.out.println(request1.toString());
        System.out.println();
        System.out.println(request2.toString());
        System.out.println();
        System.out.println(request3.toString());


    }

}
