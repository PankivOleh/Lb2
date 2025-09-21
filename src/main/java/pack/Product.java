package pack;

public class Product {
    int id;
    String name;
    String vurobnuk;
    int zina , termin , kilkist;
    public Product( int id , String name , String vurobnuk , int zina , int termin , int kilkist){
        this.id = id;
        this.name = name;
        this.vurobnuk = vurobnuk;
        this.zina = zina;
        this.termin = termin;
        this.kilkist = kilkist;
    }
    public void setValue(int kilkist){
        this.kilkist = kilkist;
    }
    public int getValue(){
        return this.kilkist;
    }
    public String toString(){
        return "Product{" +"\n"+
                "id=" + id +"\n"+
                "name='" + name + '\n' +
                "manufacturer='" + vurobnuk + '\n' +
                "zina=" + zina +"\n"+
                "termin" + termin +"\n"+
                "kilkist=" + kilkist +"\n"+
                '}';
    };
}
