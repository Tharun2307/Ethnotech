class Busstop{
    String stop;
    Busstop next;

    Busstop(String stop){
        this.stop=stop;
        this.next=null;
    }
}
class Transport{
    Busstop head;
    public void addstop(String stop){
        Busstop newstop=new Busstop(stop);
        if(head==null){
            head=newstop;
            return;
        }
        Busstop curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newstop;
    }
    public void deletestop(String stop){
        if(head==null){
            System.out.println("No stops to delete");
            return;
        }
        if(head.stop.equals(stop)){
            head=head.next;
            return;
        }
        Busstop curr=head;
        while(curr.next!=null){
            if(curr.next.stop.equals(stop)){
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;
        }
        System.out.println("Stop not found");
    }
    public void Routedisplay(Busstop head){
        this.head=head;
        if(head==null){
            return ;
        }
        while(head!=null){
            System.out.print(head.stop+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Transport t=new Transport();
        t.addstop("MPL");
        t.addstop("Railway station");
        t.addstop("viswam clg");
        t.addstop("MITS");
        t.Routedisplay(t.head);
        t.deletestop("Market");
        t.deletestop("Railway station");
        t.Routedisplay(t.head);

    }
    
}