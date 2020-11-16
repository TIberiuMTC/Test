import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Carte> ListaCarti =new ArrayList<Carte>();

    public Biblioteca(Carte in_book){
        this.ListaCarti.add(in_book);
    }
    public void add(Carte in_obj){
        this.ListaCarti.add(in_obj);
    }

    @Override public String toString(){
        String display="";
        for (int i = 0; i< ListaCarti.size(); i++){
            display+=this.ListaCarti.get(i).toString();
        }
        return display;
    }

    public void remove_book(Carte c){
        this.ListaCarti.remove(c);
    }
}
