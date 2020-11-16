public class Carte {
    private String Titlu;
    private String Autor;
    private int an_aparitie;
    private int numar_pagini;

    public String toString(){
           String temp;
           temp = this.Titlu;
           temp += " scrisa de ";
           temp +=this.Autor;
           temp+=", publicata in anul ";
           temp+=this.an_aparitie;
           temp+="\n";
           return temp;
    }

    public Carte(String in_titlu, String in_autor, int in_an, int in_pag){
        this.Titlu=in_titlu;
        this.Autor=in_autor;
        this.an_aparitie=in_an;
        this.numar_pagini=in_pag;
    }

}
