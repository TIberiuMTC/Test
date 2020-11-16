import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Carte> stoc=new ArrayList<Carte>();

    public Biblioteca(Carte in_book){
        this.stoc.add(in_book);
    }
    public void add(Carte in_obj){
        this.stoc.add(in_obj);
    }

    @Override public String toString(){
        String display="";
        for (int i=0;i<stoc.size();i++){
            display+=this.stoc.get(i).toString();
        }
        return display;
    }
}
