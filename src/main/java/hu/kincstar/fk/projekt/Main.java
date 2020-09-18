package hu.kincstar.fk.projekt;

public class Main {
    public static void main(String[]args){
        HtmlText ht = new HtmlText("Szöveg" );
        Href hr = new Href("http://kincstarweb/","Kincstárweb" );
        System.out.println(ht.getPlainText());
        System.out.println(hr.getPlainText());
    }
}
