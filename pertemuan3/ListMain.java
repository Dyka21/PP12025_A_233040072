package pertemuan3;

import javax.swing.text.html.parser.Element;

public class ListMain {
    public static void main(String [] args){
        StukturList list = new StukturList();
        list.addHead(5);
        list.addHead(4);
        list.addHead(3);
       
    

        System.out.println("Elemen :");
        list.displayElement();
    }
}

