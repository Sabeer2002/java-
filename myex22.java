class Main{
public static void main(String...arg){
Main m=new Main();
System.out.println("Sum= "+m.sum(1,2,3,4,5,6,7,8,9,10));
}
int sum(int...a){
int s=0;
for(int i:a)
s+=i;
return s;
}
}