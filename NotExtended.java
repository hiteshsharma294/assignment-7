 final class xyz{
void display(){
System.out.println("This class cannot be extended further");
}
}
class NotExtended  {
public static void main(String args[]){
xyz obj=new xyz();
obj.display();
}
}
