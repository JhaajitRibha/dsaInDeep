package GeeksForGeeksSelfPaced;

public class Dnode {
    public int data;
    public Dnode prev;
    public Dnode next;

    public Dnode(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
