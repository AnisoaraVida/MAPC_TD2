package td2.systeme;

public interface Composant {
   String getName();
   Double getSize();
   Owner getOwner();
   void getContent();
   void appendContenu(String name);
}
