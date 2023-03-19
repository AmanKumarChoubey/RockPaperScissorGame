package TestQuestion;
import java.util.*;
/*
class stack{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    public void push(Scanner sc){
        System.out.println("Enter Data:--");
        int data=sc.nextInt();
        Node new_node=new Node(data);
        if(top==null){
            top=new_node;
        }
        else{
            new_node.next=top;
            top=new_node;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack is Empty:--");
        }
        else{
            top=top.next;
        }
    }
    public void peep(){
            Node temp=top;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
    }
}
class TestQuestion{
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           stack s=new stack();
            int d,l;
            do{
                System.out.println("Enter 1 for push:--");
                System.out.println("Enter 2 for pop:--");
                System.out.println("Enter 3 for peep:--");
                System.out.println("Enter your choice :--");
                d=sc.nextInt();
                switch (d){
                    case 1:
                        s.push(sc);
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        s.peep();
                        break;
                }
                System.out.println("Enter 0 for continue the process:-");
                System.out.println("Enter Any Number for Exit:--");
                l=sc.nextInt();
            }while (l==0);
        System.out.println("==========:Exit Sucessfully:===========");
    }
}    */
class Single_Creation{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void Creation() {
        Scanner sc = new Scanner(System.in);
        int d;
        do {
            System.out.println("Enter Data:--");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do u want to add more data.If yes,Press 1:");
             d=sc.nextInt();
        }while (d==1);
    }
    public void Traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("LinkList does not Exist:");
        }
        else {
            while (temp!=null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public void Count(){
        Node temp1=head;
        int c=0;
        while (temp1!=null){
            temp1=temp1.next;
            c++;
        }
        System.out.println("Total count of LinkList is:-"+c);
    }
  public void maxiMum(){
     Node temp2=head;
     int maximum=0;
     while (temp2!=null) {
         if (temp2.data > maximum) {
             maximum = temp2.data;

         }
         temp2 = temp2.next;
     }
         System.out.println("Maximum value in LinkList is:"+maximum);
  }
    public static void main(String[] args) {
        Single_Creation s=new Single_Creation();
        s.Creation();
        s.Traverse();
        s.Count();
        s.maxiMum();
    }
}